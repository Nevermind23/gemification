package com.medallia.digital.mobilesdk;

import android.text.TextUtils;
import com.medallia.digital.mobilesdk.C10812f6;
import com.medallia.digital.mobilesdk.C10859h4;
import com.medallia.digital.mobilesdk.C10998m4;
import com.medallia.digital.mobilesdk.C11089s6;
import com.medallia.digital.mobilesdk.C11244z5;
import java.net.URLEncoder;
import java.util.HashMap;
import org.json.JSONObject;

/* renamed from: com.medallia.digital.mobilesdk.w */
class C11156w {

    /* renamed from: b */
    private static final String f32067b = "sdkVersion";

    /* renamed from: c */
    private static final String f32068c = "osType";

    /* renamed from: a */
    private final C10812f6 f32069a;

    /* renamed from: com.medallia.digital.mobilesdk.w$a */
    class C11157a implements C10812f6.C10813a {

        /* renamed from: a */
        final /* synthetic */ C10796e6 f32070a;

        C11157a(C10796e6 e6Var) {
            this.f32070a = e6Var;
        }

        /* renamed from: a */
        public void mo28086a(C10739b6 b6Var) {
            C10859h4.C10860a a = C10718a3.m39038c().mo28070a(b6Var != null ? b6Var.mo28125b() : null);
            if (a != null) {
                C10735b4.m39111c("Could not parse access token");
                C10796e6 e6Var = this.f32070a;
                if (e6Var != null) {
                    e6Var.mo27796a((C10859h4) new C11161w1(a));
                    return;
                }
                return;
            }
            C10735b4.m39113e("Access Token updated successfully");
            C11016n4.m40375f().mo28831a(C11089s6.C11090a.ACCESS_TOKEN, C10718a3.m39038c().mo28069a() != null ? C10718a3.m39038c().mo28069a().mo28827a() : null);
            this.f32070a.mo27797a(null);
        }

        /* renamed from: a */
        public void mo28087a(C11244z5 z5Var) {
            C10859h4 a = C11156w.this.m40908a(z5Var);
            C10735b4.m39111c("Get access token error = " + z5Var.mo29258a());
            C10796e6 e6Var = this.f32070a;
            if (e6Var != null) {
                e6Var.mo27796a(a);
            }
        }
    }

    C11156w(C10812f6 f6Var) {
        this.f32069a = f6Var;
    }

    /* renamed from: b */
    private boolean m40910b() {
        return System.currentTimeMillis() - C10718a3.m39038c().mo28069a().mo28093b() > C10718a3.m39038c().mo28069a().mo28096e() - C10998m4.m40266h().mo28745b();
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public C10859h4 m40908a(C11244z5 z5Var) {
        C11161w1 w1Var = C11244z5.C11245a.NO_CONNECTION.equals(z5Var.mo29258a()) ? new C11161w1(C10859h4.C10860a.AUTH_NETWORK_ERROR_1) : C11244z5.C11245a.TIMEOUT.equals(z5Var.mo29258a()) ? new C11161w1(C10859h4.C10860a.AUTH_TIMEOUT) : new C11161w1(C10859h4.C10860a.EMPTY_AUTH_GW);
        C10735b4.m39111c(w1Var.getMessage());
        return w1Var;
    }

    /* renamed from: a */
    private HashMap<String, String> m40909a() {
        HashMap<String, String> hashMap = new HashMap<>();
        try {
            hashMap.put(f32067b, URLEncoder.encode("4.1.5", "UTF-8"));
        } catch (Exception e) {
            C10735b4.m39111c(e.getMessage());
        }
        try {
            hashMap.put(f32068c, URLEncoder.encode("android", "UTF-8"));
        } catch (Exception e2) {
            C10735b4.m39111c(e2.getMessage());
        }
        return hashMap;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public HashMap<String, String> mo29099a(C10998m4.C11001c cVar) {
        String format;
        HashMap<String, String> hashMap = new HashMap<>();
        if (cVar == C10998m4.C11001c.ACCESS_TOKEN && C10718a3.m39038c().mo28069a() != null && !TextUtils.isEmpty(C10718a3.m39038c().mo28069a().mo28827a())) {
            format = String.format("%s%s", new Object[]{"Bearer_", C10718a3.m39038c().mo28069a().mo28827a()});
        } else if (cVar != C10998m4.C11001c.API_TOKEN || C10718a3.m39038c().mo28073b() == null || TextUtils.isEmpty(C10718a3.m39038c().mo28073b().mo28827a())) {
            return hashMap;
        } else {
            format = String.format("%s%s", new Object[]{"Bearer_", C10718a3.m39038c().mo28073b().mo28827a()});
        }
        hashMap.put("Authorization", format);
        return hashMap;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public HashMap<String, String> mo29100a(String str) {
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("Authorization", String.format("%s%s", new Object[]{"Bearer_", str}));
        return hashMap;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo29101a(C10796e6<Void> e6Var) {
        if (C10718a3.m39038c().mo28073b() != null) {
            if (C10718a3.m39038c().mo28069a() == null) {
                String a = C11016n4.m40375f().mo28829a(C11089s6.C11090a.ACCESS_TOKEN);
                if (!TextUtils.isEmpty(a)) {
                    C10718a3.m39038c().mo28071a(ModelFactory.getInstance().createAccessToken(a));
                    if (C10718a3.m39038c().mo28069a() == null) {
                        if (e6Var != null) {
                            e6Var.mo27796a((C10859h4) new C11161w1(C10859h4.C10860a.ACCESS_TOKEN_PARSE_LOCAL));
                            return;
                        }
                        return;
                    }
                }
            }
            if (C10718a3.m39038c().mo28069a() != null && !m40910b()) {
                e6Var.mo27797a(null);
            } else if (!TextUtils.isEmpty(C10718a3.m39038c().mo28073b().mo28776b())) {
                C10735b4.m39109b("Get and store access token started");
                this.f32069a.mo28314b(C10718a3.m39038c().mo28073b().mo28776b(), m40909a(), mo29099a(C10998m4.C11001c.API_TOKEN), (JSONObject) null, new C11157a(e6Var));
            } else if (e6Var != null) {
                e6Var.mo27796a((C10859h4) new C11161w1(C10859h4.C10860a.EMPTY_AUTH_GW_1));
            }
        } else if (e6Var != null) {
            e6Var.mo27796a((C10859h4) new C11161w1(C10859h4.C10860a.API_TOKEN_EMPTY));
        }
    }
}
