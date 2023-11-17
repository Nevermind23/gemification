package com.salesforce.marketingcloud.proximity;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import androidx.collection.ArraySet;
import com.salesforce.marketingcloud.C11461g;
import com.salesforce.marketingcloud.InitializationStatus;
import com.salesforce.marketingcloud.proximity.C11712e;
import com.salesforce.marketingcloud.util.C11819h;
import com.salesforce.marketingcloud.util.C11821j;
import java.util.List;
import java.util.Set;
import org.altbeacon.beacon.service.BeaconService;
import org.json.JSONException;
import org.json.JSONObject;
import p189o0.C7357a;

/* renamed from: com.salesforce.marketingcloud.proximity.b */
class C11707b extends C11712e {

    /* renamed from: i */
    private final Context f33943i;

    /* renamed from: j */
    private final Set<C11712e.C11713a> f33944j = new ArraySet();

    /* renamed from: k */
    private final C11705a f33945k;

    /* renamed from: l */
    private BroadcastReceiver f33946l;

    /* renamed from: m */
    private int f33947m;

    /* renamed from: n */
    private int f33948n;

    /* renamed from: com.salesforce.marketingcloud.proximity.b$a */
    class C11708a extends BroadcastReceiver {
        C11708a() {
        }

        public void onReceive(Context context, Intent intent) {
            if (intent == null) {
                C11461g.m41891d(C11712e.f33960h, "Received null intent.", new Object[0]);
                return;
            }
            String action = intent.getAction();
            if (action == null) {
                C11461g.m41891d(C11712e.f33960h, "Received null action", new Object[0]);
            } else if (action.equals(C11712e.f33956d)) {
                C11707b.this.mo30976a((C11709c) intent.getParcelableExtra(C11712e.f33958f));
            } else if (!action.equals(C11712e.f33957e)) {
                C11461g.m41880a(C11712e.f33960h, "Received unknown action: ", action);
            } else {
                C11707b.this.mo30979b((C11709c) intent.getParcelableExtra(C11712e.f33958f));
            }
        }
    }

    public C11707b(Context context) {
        C11821j.m43272a(context, "Context is null");
        this.f33943i = context;
        if (C11819h.m43269b(context.getPackageManager(), new Intent(context, BeaconService.class))) {
            this.f33945k = new C11705a(context);
            return;
        }
        throw new IllegalStateException("AltBeacon service not found");
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo29669a(InitializationStatus.C11293a aVar) {
        aVar.mo29536d(false);
        this.f33946l = new C11708a();
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction(C11712e.f33956d);
        intentFilter.addAction(C11712e.f33957e);
        C7357a.m28044b(this.f33943i).mo21730c(this.f33946l, intentFilter);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo30979b(C11709c cVar) {
        synchronized (this.f33944j) {
            this.f33948n++;
            if (cVar != null && !this.f33944j.isEmpty()) {
                C11461g.m41888c(C11712e.f33960h, "Exited %s", cVar);
                for (C11712e.C11713a next : this.f33944j) {
                    if (next != null) {
                        next.mo30852a(cVar);
                    }
                }
            }
        }
    }

    /* renamed from: c */
    public void mo30983c() {
        C11705a aVar = this.f33945k;
        if (aVar != null) {
            aVar.mo30969d();
        }
    }

    public JSONObject componentState() {
        JSONObject jSONObject;
        try {
            jSONObject = C11712e.m42726a();
            try {
                jSONObject.put("enteredEvents", this.f33947m);
                jSONObject.put("exitedEvents", this.f33948n);
            } catch (JSONException e) {
                e = e;
            }
        } catch (JSONException e2) {
            e = e2;
            jSONObject = null;
            C11461g.m41885b(C11712e.f33960h, e, "Failed to create component state.", new Object[0]);
            return jSONObject;
        }
        return jSONObject;
    }

    public void tearDown(boolean z) {
        mo30983c();
        Context context = this.f33943i;
        if (context != null && this.f33946l != null) {
            C7357a.m28044b(context).mo21732e(this.f33946l);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo30976a(C11709c cVar) {
        synchronized (this.f33944j) {
            this.f33947m++;
            if (cVar != null && !this.f33944j.isEmpty()) {
                C11461g.m41888c(C11712e.f33960h, "Entered %s", cVar);
                for (C11712e.C11713a next : this.f33944j) {
                    if (next != null) {
                        next.mo30853b(cVar);
                    }
                }
            }
        }
    }

    /* renamed from: b */
    public void mo30980b(C11712e.C11713a aVar) {
        synchronized (this.f33944j) {
            this.f33944j.remove(aVar);
        }
    }

    /* renamed from: a */
    public void mo30977a(C11712e.C11713a aVar) {
        synchronized (this.f33944j) {
            if (aVar != null) {
                this.f33944j.add(aVar);
            }
        }
    }

    /* renamed from: b */
    public void mo30981b(List<C11709c> list) {
        if (list != null) {
            C11461g.m41888c(C11712e.f33960h, "unmonitorBeaconRegions(%d region)", Integer.valueOf(list.size()));
            this.f33945k.mo30967b(list);
        }
    }

    /* renamed from: a */
    public void mo30978a(List<C11709c> list) {
        if (list != null) {
            C11461g.m41888c(C11712e.f33960h, "monitorBeaconRegions(%d region)", Integer.valueOf(list.size()));
            this.f33945k.mo30966a(list);
        }
    }

    /* renamed from: b */
    public boolean mo30982b() {
        return true;
    }
}
