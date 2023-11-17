package com.salesforce.marketingcloud.behaviors;

import android.annotation.SuppressLint;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import androidx.collection.ArrayMap;
import com.salesforce.marketingcloud.C11460f;
import com.salesforce.marketingcloud.C11461g;
import com.salesforce.marketingcloud.InitializationStatus;
import com.salesforce.marketingcloud.util.C11821j;
import java.util.Collections;
import java.util.EnumSet;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;
import org.json.JSONObject;
import p189o0.C7357a;

@SuppressLint({"UnknownNullness"})
/* renamed from: com.salesforce.marketingcloud.behaviors.c */
public class C11404c extends C11460f {

    /* renamed from: i */
    public static final String f33177i = "timestamp";

    /* renamed from: j */
    static final int f33178j = 1;

    /* renamed from: k */
    static final String f33179k = C11461g.m41875a("BehaviorManager");

    /* renamed from: d */
    private final ExecutorService f33180d;

    /* renamed from: e */
    private final ArrayMap<C11402a, Set<C11403b>> f33181e = new ArrayMap<>();

    /* renamed from: f */
    private final Map<C11402a, Bundle> f33182f = new ArrayMap(1);

    /* renamed from: g */
    private final Context f33183g;

    /* renamed from: h */
    private BroadcastReceiver f33184h;

    /* renamed from: com.salesforce.marketingcloud.behaviors.c$a */
    class C11405a extends BroadcastReceiver {
        C11405a() {
        }

        public void onReceive(Context context, Intent intent) {
            if (intent == null) {
                C11461g.m41891d(C11404c.f33179k, "Received null intent", new Object[0]);
                return;
            }
            String action = intent.getAction();
            if (action == null) {
                C11461g.m41891d(C11404c.f33179k, "Received null action", new Object[0]);
                return;
            }
            C11402a a = C11402a.m41718a(action);
            if (a != null) {
                C11404c.this.onBehavior(a, intent.getExtras());
            }
        }
    }

    /* renamed from: com.salesforce.marketingcloud.behaviors.c$b */
    static class C11406b implements Runnable {

        /* renamed from: a */
        final Set<C11403b> f33186a;

        /* renamed from: b */
        final C11402a f33187b;

        /* renamed from: c */
        final Bundle f33188c;

        C11406b(Set<C11403b> set, C11402a aVar, Bundle bundle) {
            this.f33186a = set;
            this.f33187b = aVar;
            this.f33188c = bundle;
        }

        public void run() {
            for (C11403b next : this.f33186a) {
                if (next != null) {
                    try {
                        next.onBehavior(this.f33187b, this.f33188c);
                    } catch (Exception e) {
                        C11461g.m41885b(C11404c.f33179k, e, "Failure delivering behavior %s to %s", this.f33187b.f33174a, next.getClass().getName());
                    }
                }
            }
        }
    }

    public C11404c(Context context, ExecutorService executorService) {
        this.f33183g = context;
        this.f33180d = executorService;
    }

    /* renamed from: a */
    public static void m41719a(Context context, C11402a aVar, Bundle bundle) {
        C11821j.m43272a(context, "Context is null");
        C11821j.m43272a(aVar, "Behavior is null");
        Intent intent = new Intent(aVar.f33174a);
        if (bundle != null) {
            intent.putExtras(bundle);
        }
        C7357a.m28044b(context).mo21731d(intent);
    }

    public final String componentName() {
        return "BehaviorManager";
    }

    public final JSONObject componentState() {
        return null;
    }

    /* access modifiers changed from: package-private */
    public void onBehavior(C11402a aVar, Bundle bundle) {
        if (bundle == null) {
            bundle = new Bundle();
        }
        bundle.putLong("timestamp", System.currentTimeMillis());
        C11461g.m41880a(f33179k, "Behavior found: %s", aVar.name());
        synchronized (this.f33181e) {
            Set set = this.f33181e.get(aVar);
            if (set != null && !set.isEmpty()) {
                try {
                    this.f33180d.submit(new C11406b(Collections.unmodifiableSet(set), aVar, bundle));
                } catch (RejectedExecutionException e) {
                    C11461g.m41885b(f33179k, e, "Unable to deliver behavior %s.", aVar.f33174a);
                }
            }
        }
        synchronized (this.f33182f) {
            if (aVar.f33175b) {
                this.f33182f.put(aVar, bundle);
            }
            C11402a aVar2 = aVar.f33176c;
            if (aVar2 != null) {
                this.f33182f.put(aVar2, (Object) null);
            }
        }
    }

    public final void tearDown(boolean z) {
        Context context = this.f33183g;
        if (context != null) {
            C7357a.m28044b(context).mo21732e(this.f33184h);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo29669a(InitializationStatus.C11293a aVar) {
        this.f33184h = new C11405a();
        IntentFilter intentFilter = new IntentFilter();
        for (C11402a aVar2 : C11402a.values()) {
            intentFilter.addAction(aVar2.f33174a);
        }
        C7357a.m28044b(this.f33183g).mo21730c(this.f33184h, intentFilter);
    }

    /* renamed from: a */
    public void mo29850a(C11403b bVar) {
        synchronized (this.f33181e) {
            for (Map.Entry<C11402a, Set<C11403b>> value : this.f33181e.entrySet()) {
                ((Set) value.getValue()).remove(bVar);
            }
        }
    }

    @SuppressLint({"LambdaLast"})
    /* renamed from: a */
    public void mo29851a(C11403b bVar, EnumSet<C11402a> enumSet) {
        C11821j.m43272a(bVar, "BehaviorListener is null");
        C11821j.m43272a(enumSet, "Behavior set is null");
        synchronized (this.f33181e) {
            C11461g.m41880a(f33179k, "Registering %s for behaviors: %s", bVar.getClass().getName(), enumSet.toString());
            Iterator<C11402a> it = enumSet.iterator();
            while (it.hasNext()) {
                C11402a next = it.next();
                Set set = this.f33181e.get(next);
                if (set == null) {
                    set = new HashSet();
                    this.f33181e.put(next, set);
                }
                set.add(bVar);
            }
        }
        synchronized (this.f33182f) {
            Iterator<C11402a> it2 = enumSet.iterator();
            while (it2.hasNext()) {
                C11402a next2 = it2.next();
                if (next2.f33175b && this.f33182f.containsKey(next2)) {
                    this.f33180d.submit(new C11406b(Collections.singleton(bVar), next2, this.f33182f.get(next2)));
                }
            }
        }
    }
}
