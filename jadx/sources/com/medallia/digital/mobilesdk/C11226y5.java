package com.medallia.digital.mobilesdk;

import android.util.Pair;
import com.medallia.digital.mobilesdk.C10812f6;
import com.medallia.digital.mobilesdk.C10859h4;
import com.medallia.digital.mobilesdk.C11247z7;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.List;

/* renamed from: com.medallia.digital.mobilesdk.y5 */
class C11226y5 implements C11136v0 {

    /* renamed from: h */
    private static final String f32540h = "uuid";

    /* renamed from: a */
    private final C11156w f32541a;

    /* renamed from: b */
    private final C10812f6 f32542b;

    /* renamed from: c */
    private final String f32543c;

    /* renamed from: d */
    private final HashMap<String, String> f32544d;

    /* renamed from: e */
    private final HashMap<String, String> f32545e;

    /* renamed from: f */
    private int f32546f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public C10796e6<C11235z0> f32547g;

    /* renamed from: com.medallia.digital.mobilesdk.y5$a */
    class C11227a implements C10812f6.C10813a {
        C11227a() {
        }

        /* renamed from: a */
        public void mo28086a(C10739b6 b6Var) {
            if (b6Var == null) {
                C10735b4.m39111c("Configuration response is null");
                C11226y5.this.mo29232a(false);
                return;
            }
            String b = b6Var.mo28125b();
            ConfigurationContract createConfiguration = ModelFactory.getInstance().createConfiguration(b);
            if (createConfiguration != null) {
                List<Pair<String, Boolean>> a = C10714a1.m39020a(b);
                if (a != null) {
                    for (Pair next : a) {
                        if (next != null) {
                            AnalyticsBridge.getInstance().reportDeleteStorageEvent((String) next.first, ((Boolean) next.second).booleanValue());
                        }
                    }
                }
                if (createConfiguration.getConfigurationUUID() != null) {
                    C10735b4.m39113e("Saving UUID and UUID url");
                    C11247z7.C11249b bVar = C11247z7.C11249b.CONFIGURATION_UUID;
                    C11247z7.m41224b(bVar, createConfiguration.getConfigurationUUID().getUuid());
                    C11247z7.m41226c(bVar, createConfiguration.getConfigurationUUID().getUrl());
                }
                C10735b4.m39113e("Configuration fetch finished - using configuration from remote server");
                C10735b4.m39109b("Configuration updated successfully");
                C11226y5.this.f32547g.mo27797a(new C11235z0(createConfiguration, true));
                return;
            }
            C10735b4.m39109b("Remote configuration is broken trying to fetch offline");
            C10735b4.m39111c(C10859h4.C10860a.REMOTE_CONFIGURATION_IS_CORRUPTED.toString());
            C11226y5.this.mo29232a(false);
        }

        /* renamed from: a */
        public void mo28087a(C11244z5 z5Var) {
            C11226y5 y5Var;
            boolean z;
            if (z5Var == null || z5Var.mo29259b() != 401) {
                if (z5Var == null || z5Var.mo29259b() != -45) {
                    C10735b4.m39109b("Remote configuration error trying to fetch offline");
                    y5Var = C11226y5.this;
                    z = false;
                } else {
                    C10735b4.m39109b("Remote configuration no network errortrying to fetch offline");
                    y5Var = C11226y5.this;
                    z = true;
                }
                y5Var.mo29232a(z);
                return;
            }
            C10735b4.m39109b("Remote configuration auth error");
            C11226y5.this.mo29231a(z5Var);
        }
    }

    C11226y5(C10812f6 f6Var, String str, HashMap<String, String> hashMap, HashMap<String, String> hashMap2) {
        this.f32542b = f6Var;
        this.f32541a = new C11156w(f6Var);
        this.f32543c = str;
        this.f32544d = hashMap;
        this.f32545e = hashMap2;
    }

    /* renamed from: com.medallia.digital.mobilesdk.y5$b */
    class C11228b implements C10796e6<Void> {

        /* renamed from: a */
        final /* synthetic */ C11244z5 f32549a;

        C11228b(C11244z5 z5Var) {
            this.f32549a = z5Var;
        }

        /* renamed from: a */
        public void mo27796a(C10859h4 h4Var) {
            C11226y5.this.mo29231a(this.f32549a);
        }

        /* renamed from: a */
        public void mo27797a(Void voidR) {
            C11226y5 y5Var = C11226y5.this;
            y5Var.mo29052a((C10796e6<C11235z0>) y5Var.f32547g);
        }
    }

    /* renamed from: a */
    public void mo29052a(C10796e6<C11235z0> e6Var) {
        this.f32547g = e6Var;
        C11247z7.C11249b bVar = C11247z7.C11249b.CONFIGURATION_UUID;
        if (C11247z7.m41223b(bVar) != null) {
            try {
                this.f32544d.put(f32540h, URLEncoder.encode(C11247z7.m41223b(bVar), "UTF-8"));
            } catch (Exception e) {
                C10735b4.m39111c(e.getMessage());
            }
        }
        this.f32542b.mo28310a(this.f32543c, this.f32544d, this.f32545e, new C11227a());
    }

    /* renamed from: a */
    public void mo29231a(C11244z5 z5Var) {
        int i;
        if (z5Var.mo29259b() != 401 || (i = this.f32546f) >= 2) {
            C10796e6<C11235z0> e6Var = this.f32547g;
            if (e6Var != null) {
                e6Var.mo27796a(new C10859h4(C10859h4.C10860a.REMOTE_CONFIGURATION_AUTH_FAILED));
                return;
            }
            return;
        }
        this.f32546f = i + 1;
        this.f32541a.mo29101a((C10796e6<Void>) new C11228b(z5Var));
    }

    /* renamed from: a */
    public void mo29232a(boolean z) {
        (z ? new C11202x3(true, new C10859h4(C10859h4.C10860a.NO_INTERNET_CONNECTION_AVAILABLE)) : new C11202x3()).mo29052a(this.f32547g);
    }
}
