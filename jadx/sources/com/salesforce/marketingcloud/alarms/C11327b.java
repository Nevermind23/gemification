package com.salesforce.marketingcloud.alarms;

import android.annotation.SuppressLint;
import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.os.Build;
import android.os.Bundle;
import com.salesforce.marketingcloud.C11460f;
import com.salesforce.marketingcloud.C11461g;
import com.salesforce.marketingcloud.InitializationStatus;
import com.salesforce.marketingcloud.MCReceiver;
import com.salesforce.marketingcloud.alarms.C11307a;
import com.salesforce.marketingcloud.behaviors.C11402a;
import com.salesforce.marketingcloud.behaviors.C11403b;
import com.salesforce.marketingcloud.behaviors.C11404c;
import com.salesforce.marketingcloud.storage.C11800j;
import com.salesforce.marketingcloud.util.C11821j;
import com.salesforce.marketingcloud.util.C11824l;
import java.util.Date;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
import p189o0.C7357a;

@SuppressLint({"UnknownNullness"})
/* renamed from: com.salesforce.marketingcloud.alarms.b */
public class C11327b extends C11460f implements C11403b {

    /* renamed from: j */
    public static final String f32945j = "com.salesforce.marketingcloud.ACTION_ALARM_WAKE_EVENT";

    /* renamed from: k */
    public static final String f32946k = "com.salesforce.marketingcloud.WAKE_FOR_ALARM";

    /* renamed from: l */
    static final String f32947l = "pending_alarms";

    /* renamed from: m */
    static final String f32948m = C11461g.m41875a("AlarmScheduler");

    /* renamed from: n */
    private static final long f32949n = 0;

    /* renamed from: d */
    private final Map<C11307a.C11309b, C11329b> f32950d = new HashMap();

    /* renamed from: e */
    private final C11404c f32951e;

    /* renamed from: f */
    BroadcastReceiver f32952f;

    /* renamed from: g */
    private Context f32953g;

    /* renamed from: h */
    private C11800j f32954h;

    /* renamed from: i */
    private SharedPreferences f32955i;

    /* renamed from: com.salesforce.marketingcloud.alarms.b$a */
    static /* synthetic */ class C11328a {

        /* renamed from: a */
        static final /* synthetic */ int[] f32956a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        static {
            /*
                com.salesforce.marketingcloud.behaviors.a[] r0 = com.salesforce.marketingcloud.behaviors.C11402a.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f32956a = r0
                com.salesforce.marketingcloud.behaviors.a r1 = com.salesforce.marketingcloud.behaviors.C11402a.BEHAVIOR_APP_PACKAGE_REPLACED     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f32956a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.salesforce.marketingcloud.behaviors.a r1 = com.salesforce.marketingcloud.behaviors.C11402a.BEHAVIOR_DEVICE_BOOT_COMPLETE     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.salesforce.marketingcloud.alarms.C11327b.C11328a.<clinit>():void");
        }
    }

    /* renamed from: com.salesforce.marketingcloud.alarms.b$b */
    public interface C11329b {
        /* renamed from: a */
        void mo29684a(C11307a.C11309b bVar);
    }

    /* renamed from: com.salesforce.marketingcloud.alarms.b$c */
    class C11330c extends BroadcastReceiver {
        C11330c() {
        }

        public void onReceive(Context context, Intent intent) {
            if (intent == null) {
                C11461g.m41891d(C11327b.f32948m, "Received null intent", new Object[0]);
                return;
            }
            String action = intent.getAction();
            if (action == null) {
                C11461g.m41891d(C11327b.f32948m, "Received null action", new Object[0]);
                return;
            }
            Bundle extras = intent.getExtras();
            if (extras == null) {
                C11461g.m41891d(C11327b.f32948m, "Intent had no extras", new Object[0]);
            } else if (!action.equals(C11327b.f32945j)) {
                C11461g.m41880a(C11327b.f32948m, "Received unknown action: %s", action);
            } else {
                String string = extras.getString("com.salesforce.marketingcloud.WAKE_FOR_ALARM", (String) null);
                if (string != null) {
                    C11461g.m41891d(C11327b.f32948m, "ACTION_ALARM_WAKE_EVENT had extra: %s", string);
                    try {
                        C11327b.this.mo29670a(C11307a.C11309b.valueOf(string));
                    } catch (IllegalArgumentException unused) {
                        C11461g.m41894e(C11327b.f32948m, "Woke for an unknown alarm: %s", string);
                    }
                }
            }
        }
    }

    public C11327b(Context context, C11800j jVar, C11404c cVar) {
        this.f32953g = context;
        this.f32954h = jVar;
        this.f32951e = (C11404c) C11821j.m43272a(cVar, "BehaviorManager is null");
        this.f32955i = jVar.mo31608f();
    }

    /* renamed from: a */
    private static PendingIntent m41430a(Context context, String str, Integer num) {
        return PendingIntent.getBroadcast(context, num.intValue(), MCReceiver.m41379a(context, str), C11824l.m43279a(134217728));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final long mo29674b(C11307a.C11309b bVar) {
        long j = this.f32955i.getLong(bVar.mo29665a().mo29660c(), 0);
        long d = j == 0 ? bVar.mo29665a().mo29661d() : (long) (((double) j) * bVar.mo29665a().mo29662e());
        if (d <= bVar.mo29665a().mo29663f()) {
            return d;
        }
        long f = bVar.mo29665a().mo29663f();
        C11461g.m41880a(f32948m, "%s MAX INTERVAL exceeded. Setting interval to %s milliseconds.", bVar.name(), Long.valueOf(f));
        return f;
    }

    /* renamed from: c */
    public void mo29676c(C11307a.C11309b... bVarArr) {
        for (C11307a.C11309b bVar : bVarArr) {
            C11461g.m41880a(f32948m, "Resetting %s Alarm Interval.", bVar.name());
            this.f32955i.edit().putLong(bVar.mo29665a().mo29660c(), 0).apply();
        }
    }

    public final String componentName() {
        return "AlarmScheduler";
    }

    public final JSONObject componentState() {
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        long currentTimeMillis = System.currentTimeMillis();
        try {
            for (C11307a.C11309b bVar : C11307a.C11309b.values()) {
                if (mo29673a(bVar, currentTimeMillis)) {
                    jSONObject2.put(bVar.name(), C11824l.m43282a(new Date(this.f32955i.getLong(bVar.mo29665a().mo29658a(), 0) + this.f32955i.getLong(bVar.mo29665a().mo29660c(), 0))));
                }
            }
            jSONObject.put(f32947l, jSONObject2);
        } catch (JSONException e) {
            C11461g.m41885b(f32948m, e, "Failed to generate Component State JSONObject.", new Object[0]);
        }
        return jSONObject;
    }

    /* renamed from: d */
    public void mo29680d(C11307a.C11309b... bVarArr) {
        for (C11307a.C11309b bVar : bVarArr) {
            mo29676c(bVar);
            mo29672a(bVar);
            try {
                ((AlarmManager) this.f32953g.getSystemService("alarm")).cancel(m41430a(this.f32953g, bVar.name(), Integer.valueOf(bVar.mo29665a().mo29659b())));
                C11461g.m41880a(f32948m, "Reset %s alarm.", bVar.name());
            } catch (Exception e) {
                C11461g.m41895e(f32948m, e, "Could not cancel %s alarm.", bVar.name());
            }
        }
    }

    /* renamed from: e */
    public void mo29681e(C11307a.C11309b... bVarArr) {
        synchronized (this.f32950d) {
            for (C11307a.C11309b remove : bVarArr) {
                this.f32950d.remove(remove);
            }
        }
    }

    public final void onBehavior(C11402a aVar, Bundle bundle) {
        int i = C11328a.f32956a[aVar.ordinal()];
        if (i == 1 || i == 2) {
            m41431a(bundle.getLong("timestamp"));
        }
    }

    public final void tearDown(boolean z) {
        if (z) {
            mo29680d(C11307a.C11309b.values());
        }
        Context context = this.f32953g;
        if (context != null) {
            C7357a.m28044b(context).mo21732e(this.f32952f);
        }
        this.f32951e.mo29850a((C11403b) this);
    }

    /* renamed from: a */
    private void m41431a(long j) {
        for (C11307a.C11309b bVar : C11307a.C11309b.values()) {
            C11307a a = bVar.mo29665a();
            long j2 = this.f32955i.getLong(a.mo29658a(), 0);
            if (j2 > 0) {
                if (mo29673a(bVar, j)) {
                    mo29668a(this.f32953g, bVar, this.f32955i.getLong(a.mo29660c(), a.mo29661d()), j2);
                } else {
                    mo29670a(bVar);
                }
            }
        }
    }

    /* renamed from: b */
    public void mo29675b(C11307a.C11309b... bVarArr) {
        for (C11307a.C11309b a : bVarArr) {
            m41433a(a, false);
        }
    }

    /* renamed from: c */
    public boolean mo29677c(C11307a.C11309b bVar) {
        return bVar.mo29665a().mo29664g() && m41433a(bVar, true);
    }

    /* access modifiers changed from: package-private */
    @SuppressLint({"MissingPermission"})
    /* renamed from: a */
    public void mo29668a(Context context, C11307a.C11309b bVar, long j, long j2) {
        PendingIntent a = m41430a(context, bVar.name(), Integer.valueOf(bVar.mo29665a().mo29659b()));
        AlarmManager alarmManager = (AlarmManager) context.getSystemService("alarm");
        long j3 = j2 + j;
        String a2 = C11824l.m43282a(new Date(j3));
        try {
            if (Build.VERSION.SDK_INT >= 31) {
                if (!alarmManager.canScheduleExactAlarms()) {
                    alarmManager.set(0, j3, a);
                    C11461g.m41891d(f32948m, "%s Alarm scheduled to wake at %s.", bVar.name(), a2);
                }
            }
            alarmManager.setExact(0, j3, a);
            C11461g.m41891d(f32948m, "%s Alarm scheduled to wake at %s.", bVar.name(), a2);
        } catch (Exception e) {
            C11461g.m41895e(f32948m, e, "Failed to schedule alarm %s for %s", bVar.name(), a2);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo29669a(InitializationStatus.C11293a aVar) {
        this.f32951e.mo29851a(this, EnumSet.of(C11402a.BEHAVIOR_DEVICE_BOOT_COMPLETE, C11402a.BEHAVIOR_APP_PACKAGE_REPLACED));
        this.f32952f = new C11330c();
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction(f32945j);
        C7357a.m28044b(this.f32953g).mo21730c(this.f32952f, intentFilter);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo29670a(C11307a.C11309b bVar) {
        mo29672a(bVar);
        C11329b bVar2 = this.f32950d.get(bVar);
        if (bVar2 != null) {
            bVar2.mo29684a(bVar);
        }
    }

    /* renamed from: a */
    private void m41432a(C11307a.C11309b bVar, long j, long j2) {
        C11461g.m41880a(f32948m, "Setting the %s Alarm Flag ...", bVar.name());
        this.f32955i.edit().putLong(bVar.mo29665a().mo29658a(), j).putLong(bVar.mo29665a().mo29660c(), j2).apply();
    }

    @SuppressLint({"LambdaLast"})
    /* renamed from: a */
    public void mo29671a(C11329b bVar, C11307a.C11309b... bVarArr) {
        synchronized (this.f32950d) {
            for (C11307a.C11309b put : bVarArr) {
                this.f32950d.put(put, bVar);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo29672a(C11307a.C11309b... bVarArr) {
        for (C11307a.C11309b bVar : bVarArr) {
            C11461g.m41880a(f32948m, "Resetting %s Alarm Active Flag to FALSE", bVar.name());
            this.f32955i.edit().putLong(bVar.mo29665a().mo29658a(), 0).apply();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final boolean mo29673a(C11307a.C11309b bVar, long j) {
        return this.f32955i.getLong(bVar.mo29665a().mo29658a(), 0) > j - this.f32955i.getLong(bVar.mo29665a().mo29660c(), 0);
    }

    /* renamed from: a */
    private boolean m41433a(C11307a.C11309b bVar, boolean z) {
        if (!bVar.mo29666a(this.f32954h)) {
            C11461g.m41880a(f32948m, "shouldCreateAlarm() for %s Alarm was FALSE.  Aborting alarm creation.", bVar.name());
            return false;
        }
        long currentTimeMillis = System.currentTimeMillis();
        long b = mo29674b(bVar);
        if (!mo29673a(bVar, currentTimeMillis)) {
            C11461g.m41880a(f32948m, "No pending %s Alarm. Creating one ...", bVar.name());
            m41432a(bVar, currentTimeMillis, b);
            mo29668a(this.f32953g, bVar, z ? 1000 : b, currentTimeMillis);
            return true;
        }
        if (!z) {
            C11461g.m41880a(f32948m, "%s Send Pending ... will send at %s", bVar.name(), C11824l.m43282a(new Date(this.f32954h.mo31608f().getLong(bVar.mo29665a().mo29658a(), 0) + b)));
        }
        return false;
    }
}
