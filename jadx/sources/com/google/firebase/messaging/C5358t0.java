package com.google.firebase.messaging;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import android.util.Log;
import androidx.core.content.C0767a;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.google.firebase.messaging.t0 */
class C5358t0 {

    /* renamed from: a */
    final SharedPreferences f17098a;

    /* renamed from: com.google.firebase.messaging.t0$a */
    static class C5359a {

        /* renamed from: d */
        private static final long f17099d = TimeUnit.DAYS.toMillis(7);

        /* renamed from: a */
        final String f17100a;

        /* renamed from: b */
        final String f17101b;

        /* renamed from: c */
        final long f17102c;

        private C5359a(String str, String str2, long j) {
            this.f17100a = str;
            this.f17101b = str2;
            this.f17102c = j;
        }

        /* renamed from: a */
        static String m21179a(String str, String str2, long j) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("token", str);
                jSONObject.put("appVersion", str2);
                jSONObject.put("timestamp", j);
                return jSONObject.toString();
            } catch (JSONException e) {
                Log.w("FirebaseMessaging", "Failed to encode token: " + e);
                return null;
            }
        }

        /* renamed from: c */
        static C5359a m21180c(String str) {
            if (TextUtils.isEmpty(str)) {
                return null;
            }
            if (!str.startsWith("{")) {
                return new C5359a(str, (String) null, 0);
            }
            try {
                JSONObject jSONObject = new JSONObject(str);
                return new C5359a(jSONObject.getString("token"), jSONObject.getString("appVersion"), jSONObject.getLong("timestamp"));
            } catch (JSONException e) {
                Log.w("FirebaseMessaging", "Failed to parse token: " + e);
                return null;
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public boolean mo17644b(String str) {
            if (System.currentTimeMillis() > this.f17102c + f17099d || !str.equals(this.f17101b)) {
                return true;
            }
            return false;
        }
    }

    public C5358t0(Context context) {
        this.f17098a = context.getSharedPreferences("com.google.android.gms.appid", 0);
        m21173a(context, "com.google.android.gms.appid-no-backup");
    }

    /* renamed from: a */
    private void m21173a(Context context, String str) {
        File file = new File(C0767a.m2899i(context), str);
        if (!file.exists()) {
            try {
                if (file.createNewFile() && !mo17642e()) {
                    Log.i("FirebaseMessaging", "App restored, clearing state");
                    mo17640c();
                }
            } catch (IOException e) {
                if (Log.isLoggable("FirebaseMessaging", 3)) {
                    Log.d("FirebaseMessaging", "Error creating file in no backup dir: " + e.getMessage());
                }
            }
        }
    }

    /* renamed from: b */
    private String m21174b(String str, String str2) {
        return str + "|T|" + str2 + "|" + "*";
    }

    /* renamed from: c */
    public synchronized void mo17640c() {
        this.f17098a.edit().clear().commit();
    }

    /* renamed from: d */
    public synchronized C5359a mo17641d(String str, String str2) {
        return C5359a.m21180c(this.f17098a.getString(m21174b(str, str2), (String) null));
    }

    /* renamed from: e */
    public synchronized boolean mo17642e() {
        return this.f17098a.getAll().isEmpty();
    }

    /* renamed from: f */
    public synchronized void mo17643f(String str, String str2, String str3, String str4) {
        String a = C5359a.m21179a(str3, str4, System.currentTimeMillis());
        if (a != null) {
            SharedPreferences.Editor edit = this.f17098a.edit();
            edit.putString(m21174b(str, str2), a);
            edit.commit();
        }
    }
}
