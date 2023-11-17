package com.facebook;

import android.content.SharedPreferences;
import android.os.Bundle;
import org.json.JSONException;
import org.json.JSONObject;
import p297w4.C8775b0;

/* renamed from: com.facebook.a */
class C2617a {

    /* renamed from: a */
    private final SharedPreferences f8181a;

    /* renamed from: b */
    private final C2618a f8182b;

    /* renamed from: c */
    private C2644j f8183c;

    /* renamed from: com.facebook.a$a */
    static class C2618a {
        C2618a() {
        }

        /* renamed from: a */
        public C2644j mo8230a() {
            return new C2644j(C2626d.m10134e());
        }
    }

    C2617a(SharedPreferences sharedPreferences, C2618a aVar) {
        this.f8181a = sharedPreferences;
        this.f8182b = aVar;
    }

    /* renamed from: b */
    private AccessToken m10094b() {
        String string = this.f8181a.getString("com.facebook.AccessTokenManager.CachedAccessToken", (String) null);
        if (string != null) {
            try {
                return AccessToken.m9962d(new JSONObject(string));
            } catch (JSONException unused) {
            }
        }
        return null;
    }

    /* renamed from: c */
    private AccessToken m10095c() {
        Bundle h = m10096d().mo8289h();
        if (h == null || !C2644j.m10199g(h)) {
            return null;
        }
        return AccessToken.m9963e(h);
    }

    /* renamed from: d */
    private C2644j m10096d() {
        if (this.f8183c == null) {
            synchronized (this) {
                if (this.f8183c == null) {
                    this.f8183c = this.f8182b.mo8230a();
                }
            }
        }
        return this.f8183c;
    }

    /* renamed from: e */
    private boolean m10097e() {
        return this.f8181a.contains("com.facebook.AccessTokenManager.CachedAccessToken");
    }

    /* renamed from: h */
    private boolean m10098h() {
        return C2626d.m10153x();
    }

    /* renamed from: a */
    public void mo8227a() {
        this.f8181a.edit().remove("com.facebook.AccessTokenManager.CachedAccessToken").apply();
        if (m10098h()) {
            m10096d().mo8288a();
        }
    }

    /* renamed from: f */
    public AccessToken mo8228f() {
        if (m10097e()) {
            return m10094b();
        }
        if (!m10098h()) {
            return null;
        }
        AccessToken c = m10095c();
        if (c == null) {
            return c;
        }
        mo8229g(c);
        m10096d().mo8288a();
        return c;
    }

    /* renamed from: g */
    public void mo8229g(AccessToken accessToken) {
        C8775b0.m32716i(accessToken, "accessToken");
        try {
            this.f8181a.edit().putString("com.facebook.AccessTokenManager.CachedAccessToken", accessToken.mo8139y().toString()).apply();
        } catch (JSONException unused) {
        }
    }

    public C2617a() {
        this(C2626d.m10134e().getSharedPreferences("com.facebook.AccessTokenManager.SharedPreferences", 0), new C2618a());
    }
}
