package com.facebook;

import android.content.SharedPreferences;
import org.json.JSONException;
import org.json.JSONObject;
import p297w4.C8775b0;

/* renamed from: com.facebook.l */
final class C2646l {

    /* renamed from: a */
    private final SharedPreferences f8280a = C2626d.m10134e().getSharedPreferences("com.facebook.AccessTokenManager.SharedPreferences", 0);

    C2646l() {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo8290a() {
        this.f8280a.edit().remove("com.facebook.ProfileManager.CachedProfile").apply();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public Profile mo8291b() {
        String string = this.f8280a.getString("com.facebook.ProfileManager.CachedProfile", (String) null);
        if (string != null) {
            try {
                return new Profile(new JSONObject(string));
            } catch (JSONException unused) {
            }
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo8292c(Profile profile) {
        C8775b0.m32716i(profile, "profile");
        JSONObject f = profile.mo8218f();
        if (f != null) {
            this.f8280a.edit().putString("com.facebook.ProfileManager.CachedProfile", f.toString()).apply();
        }
    }
}
