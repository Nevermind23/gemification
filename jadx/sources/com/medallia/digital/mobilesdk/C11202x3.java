package com.medallia.digital.mobilesdk;

import android.util.Pair;
import com.medallia.digital.mobilesdk.C10859h4;
import com.medallia.digital.mobilesdk.C11089s6;
import java.io.File;
import java.util.List;

/* renamed from: com.medallia.digital.mobilesdk.x3 */
class C11202x3 implements C11136v0 {

    /* renamed from: a */
    private C10859h4 f32236a;

    /* renamed from: b */
    private boolean f32237b;

    protected C11202x3() {
        this.f32237b = false;
    }

    /* renamed from: a */
    private void m41090a() {
        List<Pair<String, Boolean>> a = C10714a1.m39019a();
        if (a != null) {
            for (Pair next : a) {
                if (next != null) {
                    AnalyticsBridge.getInstance().reportDeleteStorageEvent((String) next.first, ((Boolean) next.second).booleanValue());
                }
            }
        }
    }

    /* renamed from: b */
    private ConfigurationContract m41091b() {
        File c = C10714a1.m39028c();
        ConfigurationContract a = C10714a1.m39018a(c);
        if (C10714a1.m39024a(c, a)) {
            if (this.f32237b) {
                long a2 = C11089s6.m40668b().mo28974a(C11089s6.C11090a.LOCAL_CONFIGURATION_TIMESTAMP, 0);
                if (a2 == 0) {
                    C10735b4.m39113e("Offline: local configuration timestamp: is not available");
                    m41090a();
                    this.f32236a = new C11161w1(C10859h4.C10860a.LOCAL_CONFIGURATION_TS_IS_NOT_AVAILABLE);
                    return null;
                } else if (C10714a1.m39023a(a)) {
                    C10735b4.m39113e("Offline: local configuration is expired. timestamp: " + a2);
                    m41090a();
                    this.f32236a = new C11161w1(C10859h4.C10860a.LOCAL_CONFIGURATION_IS_EXPIRED);
                    return null;
                } else {
                    AnalyticsBridge.getInstance().reportInitOfflineMechanismEvent(a2);
                }
            }
            C10735b4.m39113e("Local configuration fetched successfully");
            return a;
        }
        if (!this.f32237b) {
            this.f32236a = new C11161w1(C10859h4.C10860a.LOCAL_CONFIGURATION_IS_NOT_AVAILABLE);
            m41090a();
        }
        C10735b4.m39109b("Local configuration is not available");
        return null;
    }

    protected C11202x3(boolean z, C10859h4 h4Var) {
        this.f32236a = h4Var;
        this.f32237b = z;
    }

    /* renamed from: a */
    public void mo29052a(C10796e6<C11235z0> e6Var) {
        ConfigurationContract b = m41091b();
        if (b != null) {
            C10735b4.m39109b("Offline configuration fetched successfully");
            if (e6Var != null) {
                e6Var.mo27797a(new C11235z0(b, false));
                return;
            }
            return;
        }
        C10735b4.m39109b("Offline configuration is not available");
        if (e6Var != null) {
            C10859h4 h4Var = this.f32236a;
            if (h4Var == null) {
                h4Var = new C11161w1(C10859h4.C10860a.GET_CONFIG_ERROR);
            }
            e6Var.mo27796a(h4Var);
        }
    }
}
