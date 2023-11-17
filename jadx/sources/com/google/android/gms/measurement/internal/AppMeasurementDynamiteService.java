package com.google.android.gms.measurement.internal;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import androidx.collection.ArrayMap;
import com.google.android.gms.common.util.DynamiteApi;
import com.google.android.gms.internal.measurement.C4156e1;
import com.google.android.gms.internal.measurement.C4224i1;
import com.google.android.gms.internal.measurement.C4275l1;
import com.google.android.gms.internal.measurement.C4309n1;
import com.google.android.gms.internal.measurement.zzcl;
import java.util.Map;
import p182n6.C7264i;
import p248s7.C8267u;
import p248s7.C8269w;
import p299w6.C8859b;
import p299w6.C8862d;

@DynamiteApi
public class AppMeasurementDynamiteService extends C4156e1 {

    /* renamed from: b */
    C4791t4 f14177b = null;

    /* renamed from: c */
    private final Map f14178c = new ArrayMap();

    /* renamed from: q */
    private final void m17576q() {
        if (this.f14177b == null) {
            throw new IllegalStateException("Attempting to perform action before initialize.");
        }
    }

    /* renamed from: x */
    private final void m17577x(C4224i1 i1Var, String str) {
        m17576q();
        this.f14177b.mo14856N().mo14803K(i1Var, str);
    }

    public void beginAdUnitExposure(String str, long j) {
        m17576q();
        this.f14177b.mo14875y().mo14951l(str, j);
    }

    public void clearConditionalUserProperty(String str, String str2, Bundle bundle) {
        m17576q();
        this.f14177b.mo14851I().mo14904o(str, str2, bundle);
    }

    public void clearMeasurementEnabled(long j) {
        m17576q();
        this.f14177b.mo14851I().mo14886I((Boolean) null);
    }

    public void endAdUnitExposure(String str, long j) {
        m17576q();
        this.f14177b.mo14875y().mo14952m(str, j);
    }

    public void generateEventId(C4224i1 i1Var) {
        m17576q();
        long t0 = this.f14177b.mo14856N().mo14831t0();
        m17576q();
        this.f14177b.mo14856N().mo14802J(i1Var, t0);
    }

    public void getAppInstanceId(C4224i1 i1Var) {
        m17576q();
        this.f14177b.mo14552f().mo14776z(new C4683j6(this, i1Var));
    }

    public void getCachedAppInstanceId(C4224i1 i1Var) {
        m17576q();
        m17577x(i1Var, this.f14177b.mo14851I().mo14897V());
    }

    public void getConditionalUserProperties(String str, String str2, C4224i1 i1Var) {
        m17576q();
        this.f14177b.mo14552f().mo14776z(new C4796t9(this, i1Var, str, str2));
    }

    public void getCurrentScreenClass(C4224i1 i1Var) {
        m17576q();
        m17577x(i1Var, this.f14177b.mo14851I().mo14898W());
    }

    public void getCurrentScreenName(C4224i1 i1Var) {
        m17576q();
        m17577x(i1Var, this.f14177b.mo14851I().mo14899X());
    }

    public void getGmpAppId(C4224i1 i1Var) {
        String str;
        m17576q();
        C4793t6 I = this.f14177b.mo14851I();
        if (I.f14613a.mo14857O() != null) {
            str = I.f14613a.mo14857O();
        } else {
            try {
                str = C8269w.m31113c(I.f14613a.mo14550c(), "google_app_id", I.f14613a.mo14860R());
            } catch (IllegalStateException e) {
                I.f14613a.mo14551d().mo14675r().mo14616b("getGoogleAppId failed with exception", e);
                str = null;
            }
        }
        m17577x(i1Var, str);
    }

    public void getMaxUserProperties(String str, C4224i1 i1Var) {
        m17576q();
        this.f14177b.mo14851I().mo14892Q(str);
        m17576q();
        this.f14177b.mo14856N().mo14801I(i1Var, 25);
    }

    public void getSessionId(C4224i1 i1Var) {
        m17576q();
        C4793t6 I = this.f14177b.mo14851I();
        I.f14613a.mo14552f().mo14776z(new C4650g6(I, i1Var));
    }

    public void getTestFlag(C4224i1 i1Var, int i) {
        m17576q();
        if (i == 0) {
            this.f14177b.mo14856N().mo14803K(i1Var, this.f14177b.mo14851I().mo14900Y());
        } else if (i == 1) {
            this.f14177b.mo14856N().mo14802J(i1Var, this.f14177b.mo14851I().mo14896U().longValue());
        } else if (i == 2) {
            C4785s9 N = this.f14177b.mo14856N();
            double doubleValue = this.f14177b.mo14851I().mo14894S().doubleValue();
            Bundle bundle = new Bundle();
            bundle.putDouble("r", doubleValue);
            try {
                i1Var.mo12891H1(bundle);
            } catch (RemoteException e) {
                N.f14613a.mo14551d().mo14680w().mo14616b("Error returning double value to wrapper", e);
            }
        } else if (i == 3) {
            this.f14177b.mo14856N().mo14801I(i1Var, this.f14177b.mo14851I().mo14895T().intValue());
        } else if (i == 4) {
            this.f14177b.mo14856N().mo14797E(i1Var, this.f14177b.mo14851I().mo14893R().booleanValue());
        }
    }

    public void getUserProperties(String str, String str2, boolean z, C4224i1 i1Var) {
        m17576q();
        this.f14177b.mo14552f().mo14776z(new C4663h8(this, i1Var, str, str2, z));
    }

    public void initForTests(Map map) {
        m17576q();
    }

    public void initialize(C8859b bVar, zzcl zzcl, long j) {
        C4791t4 t4Var = this.f14177b;
        if (t4Var == null) {
            this.f14177b = C4791t4.m18288H((Context) C7264i.m27902k((Context) C8862d.m32985y(bVar)), zzcl, Long.valueOf(j));
        } else {
            t4Var.mo14551d().mo14680w().mo14615a("Attempting to initialize multiple times");
        }
    }

    public void isDataCollectionEnabled(C4224i1 i1Var) {
        m17576q();
        this.f14177b.mo14552f().mo14776z(new C4807u9(this, i1Var));
    }

    public void logEvent(String str, String str2, Bundle bundle, boolean z, boolean z2, long j) {
        m17576q();
        this.f14177b.mo14851I().mo14908s(str, str2, bundle, z, z2, j);
    }

    public void logEventAndBundle(String str, String str2, Bundle bundle, C4224i1 i1Var, long j) {
        Bundle bundle2;
        m17576q();
        C7264i.m27898g(str2);
        if (bundle != null) {
            bundle2 = new Bundle(bundle);
        } else {
            bundle2 = new Bundle();
        }
        bundle2.putString("_o", "app");
        this.f14177b.mo14552f().mo14776z(new C4662h7(this, i1Var, new zzaw(str2, new zzau(bundle), "app", j), str));
    }

    public void logHealthData(int i, String str, C8859b bVar, C8859b bVar2, C8859b bVar3) {
        Object obj;
        Object obj2;
        m17576q();
        Object obj3 = null;
        if (bVar == null) {
            obj = null;
        } else {
            obj = C8862d.m32985y(bVar);
        }
        if (bVar2 == null) {
            obj2 = null;
        } else {
            obj2 = C8862d.m32985y(bVar2);
        }
        if (bVar3 != null) {
            obj3 = C8862d.m32985y(bVar3);
        }
        this.f14177b.mo14551d().mo14673G(i, true, false, str, obj, obj2, obj3);
    }

    public void onActivityCreated(C8859b bVar, Bundle bundle, long j) {
        m17576q();
        C4782s6 s6Var = this.f14177b.mo14851I().f14909c;
        if (s6Var != null) {
            this.f14177b.mo14851I().mo14905p();
            s6Var.onActivityCreated((Activity) C8862d.m32985y(bVar), bundle);
        }
    }

    public void onActivityDestroyed(C8859b bVar, long j) {
        m17576q();
        C4782s6 s6Var = this.f14177b.mo14851I().f14909c;
        if (s6Var != null) {
            this.f14177b.mo14851I().mo14905p();
            s6Var.onActivityDestroyed((Activity) C8862d.m32985y(bVar));
        }
    }

    public void onActivityPaused(C8859b bVar, long j) {
        m17576q();
        C4782s6 s6Var = this.f14177b.mo14851I().f14909c;
        if (s6Var != null) {
            this.f14177b.mo14851I().mo14905p();
            s6Var.onActivityPaused((Activity) C8862d.m32985y(bVar));
        }
    }

    public void onActivityResumed(C8859b bVar, long j) {
        m17576q();
        C4782s6 s6Var = this.f14177b.mo14851I().f14909c;
        if (s6Var != null) {
            this.f14177b.mo14851I().mo14905p();
            s6Var.onActivityResumed((Activity) C8862d.m32985y(bVar));
        }
    }

    public void onActivitySaveInstanceState(C8859b bVar, C4224i1 i1Var, long j) {
        m17576q();
        C4782s6 s6Var = this.f14177b.mo14851I().f14909c;
        Bundle bundle = new Bundle();
        if (s6Var != null) {
            this.f14177b.mo14851I().mo14905p();
            s6Var.onActivitySaveInstanceState((Activity) C8862d.m32985y(bVar), bundle);
        }
        try {
            i1Var.mo12891H1(bundle);
        } catch (RemoteException e) {
            this.f14177b.mo14551d().mo14680w().mo14616b("Error returning bundle value to wrapper", e);
        }
    }

    public void onActivityStarted(C8859b bVar, long j) {
        m17576q();
        if (this.f14177b.mo14851I().f14909c != null) {
            this.f14177b.mo14851I().mo14905p();
            Activity activity = (Activity) C8862d.m32985y(bVar);
        }
    }

    public void onActivityStopped(C8859b bVar, long j) {
        m17576q();
        if (this.f14177b.mo14851I().f14909c != null) {
            this.f14177b.mo14851I().mo14905p();
            Activity activity = (Activity) C8862d.m32985y(bVar);
        }
    }

    public void performAction(Bundle bundle, C4224i1 i1Var, long j) {
        m17576q();
        i1Var.mo12891H1((Bundle) null);
    }

    public void registerOnMeasurementEventListener(C4275l1 l1Var) {
        C8267u uVar;
        m17576q();
        synchronized (this.f14178c) {
            uVar = (C8267u) this.f14178c.get(Integer.valueOf(l1Var.mo13275b()));
            if (uVar == null) {
                uVar = new C4829w9(this, l1Var);
                this.f14178c.put(Integer.valueOf(l1Var.mo13275b()), uVar);
            }
        }
        this.f14177b.mo14851I().mo14913x(uVar);
    }

    public void resetAnalyticsData(long j) {
        m17576q();
        this.f14177b.mo14851I().mo14914y(j);
    }

    public void setConditionalUserProperty(Bundle bundle, long j) {
        m17576q();
        if (bundle == null) {
            this.f14177b.mo14551d().mo14675r().mo14615a("Conditional user property must not be null");
        } else {
            this.f14177b.mo14851I().mo14882E(bundle, j);
        }
    }

    public void setConsent(Bundle bundle, long j) {
        m17576q();
        C4793t6 I = this.f14177b.mo14851I();
        I.f14613a.mo14552f().mo14770A(new C4781s5(I, bundle, j));
    }

    public void setConsentThirdParty(Bundle bundle, long j) {
        m17576q();
        this.f14177b.mo14851I().mo14883F(bundle, -20, j);
    }

    public void setCurrentScreen(C8859b bVar, String str, String str2, long j) {
        m17576q();
        this.f14177b.mo14853K().mo14365D((Activity) C8862d.m32985y(bVar), str, str2);
    }

    public void setDataCollectionEnabled(boolean z) {
        m17576q();
        C4793t6 I = this.f14177b.mo14851I();
        I.mo14922i();
        I.f14613a.mo14552f().mo14776z(new C4760q6(I, z));
    }

    public void setDefaultEventParameters(Bundle bundle) {
        Bundle bundle2;
        m17576q();
        C4793t6 I = this.f14177b.mo14851I();
        if (bundle == null) {
            bundle2 = null;
        } else {
            bundle2 = new Bundle(bundle);
        }
        I.f14613a.mo14552f().mo14776z(new C4792t5(I, bundle2));
    }

    public void setEventInterceptor(C4275l1 l1Var) {
        m17576q();
        C4818v9 v9Var = new C4818v9(this, l1Var);
        if (this.f14177b.mo14552f().mo14771C()) {
            this.f14177b.mo14851I().mo14885H(v9Var);
        } else {
            this.f14177b.mo14552f().mo14776z(new C4664h9(this, v9Var));
        }
    }

    public void setInstanceIdProvider(C4309n1 n1Var) {
        m17576q();
    }

    public void setMeasurementEnabled(boolean z, long j) {
        m17576q();
        this.f14177b.mo14851I().mo14886I(Boolean.valueOf(z));
    }

    public void setMinimumSessionDuration(long j) {
        m17576q();
    }

    public void setSessionTimeoutDuration(long j) {
        m17576q();
        C4793t6 I = this.f14177b.mo14851I();
        I.f14613a.mo14552f().mo14776z(new C4836x5(I, j));
    }

    public void setUserId(String str, long j) {
        m17576q();
        C4793t6 I = this.f14177b.mo14851I();
        if (str == null || !TextUtils.isEmpty(str)) {
            I.f14613a.mo14552f().mo14776z(new C4803u5(I, str));
            I.mo14889L((String) null, "_id", str, true, j);
            return;
        }
        I.f14613a.mo14551d().mo14680w().mo14615a("User ID must be non-empty or null");
    }

    public void setUserProperty(String str, String str2, C8859b bVar, boolean z, long j) {
        m17576q();
        this.f14177b.mo14851I().mo14889L(str, str2, C8862d.m32985y(bVar), z, j);
    }

    public void unregisterOnMeasurementEventListener(C4275l1 l1Var) {
        C8267u uVar;
        m17576q();
        synchronized (this.f14178c) {
            uVar = (C8267u) this.f14178c.remove(Integer.valueOf(l1Var.mo13275b()));
        }
        if (uVar == null) {
            uVar = new C4829w9(this, l1Var);
        }
        this.f14177b.mo14851I().mo14891N(uVar);
    }
}
