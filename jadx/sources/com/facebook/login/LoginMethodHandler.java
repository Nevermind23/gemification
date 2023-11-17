package com.facebook.login;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Base64;
import android.util.Log;
import com.facebook.AccessToken;
import com.facebook.C2625c;
import com.facebook.FacebookException;
import com.facebook.login.LoginClient;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
import p115i4.C6564m;
import p297w4.C8769a0;

abstract class LoginMethodHandler implements Parcelable {

    /* renamed from: d */
    Map f8357d;

    /* renamed from: e */
    protected LoginClient f8358e;

    LoginMethodHandler(LoginClient loginClient) {
        this.f8358e = loginClient;
    }

    /* renamed from: d */
    static AccessToken m10344d(Bundle bundle, C2625c cVar, String str) {
        Bundle bundle2 = bundle;
        Date t = C8769a0.m32692t(bundle2, "com.facebook.platform.extra.EXPIRES_SECONDS_SINCE_EPOCH", new Date(0));
        ArrayList<String> stringArrayList = bundle2.getStringArrayList("com.facebook.platform.extra.PERMISSIONS");
        String string = bundle2.getString("com.facebook.platform.extra.ACCESS_TOKEN");
        Date t2 = C8769a0.m32692t(bundle2, "com.facebook.platform.extra.EXTRA_DATA_ACCESS_EXPIRATION_TIME", new Date(0));
        if (C8769a0.m32644Q(string)) {
            return null;
        }
        return new AccessToken(string, str, bundle2.getString("com.facebook.platform.extra.USER_ID"), stringArrayList, (Collection) null, (Collection) null, cVar, t, new Date(), t2, bundle2.getString("graph_domain"));
    }

    /* renamed from: e */
    public static AccessToken m10345e(Collection collection, Bundle bundle, C2625c cVar, String str) {
        ArrayList arrayList;
        ArrayList arrayList2;
        ArrayList arrayList3;
        Bundle bundle2 = bundle;
        Date t = C8769a0.m32692t(bundle2, "expires_in", new Date());
        String string = bundle2.getString("access_token");
        Date t2 = C8769a0.m32692t(bundle2, "data_access_expiration_time", new Date(0));
        String string2 = bundle2.getString("granted_scopes");
        if (!C8769a0.m32644Q(string2)) {
            arrayList = new ArrayList(Arrays.asList(string2.split(",")));
        } else {
            arrayList = collection;
        }
        String string3 = bundle2.getString("denied_scopes");
        if (!C8769a0.m32644Q(string3)) {
            arrayList2 = new ArrayList(Arrays.asList(string3.split(",")));
        } else {
            arrayList2 = null;
        }
        String string4 = bundle2.getString("expired_scopes");
        if (!C8769a0.m32644Q(string4)) {
            arrayList3 = new ArrayList(Arrays.asList(string4.split(",")));
        } else {
            arrayList3 = null;
        }
        if (C8769a0.m32644Q(string)) {
            return null;
        }
        return new AccessToken(string, str, m10346h(bundle2.getString("signed_request")), arrayList, arrayList2, arrayList3, cVar, t, new Date(), t2, bundle2.getString("graph_domain"));
    }

    /* renamed from: h */
    static String m10346h(String str) {
        if (str == null || str.isEmpty()) {
            throw new FacebookException("Authorization response does not contain the signed_request");
        }
        try {
            String[] split = str.split("\\.");
            if (split.length == 2) {
                return new JSONObject(new String(Base64.decode(split[1], 0), "UTF-8")).getString("user_id");
            }
        } catch (UnsupportedEncodingException | JSONException unused) {
        }
        throw new FacebookException("Failed to retrieve user_id from signed_request");
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo8415a(String str, Object obj) {
        String str2;
        if (this.f8357d == null) {
            this.f8357d = new HashMap();
        }
        Map map = this.f8357d;
        if (obj == null) {
            str2 = null;
        } else {
            str2 = obj.toString();
        }
        map.put(str, str2);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo8345b() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public String mo8416f(String str) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("0_auth_logger_id", str);
            jSONObject.put("3_method", mo8294g());
            mo8296l(jSONObject);
        } catch (JSONException e) {
            Log.w("LoginMethodHandler", "Error creating client state json: " + e.getMessage());
        }
        return jSONObject.toString();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public abstract String mo8294g();

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public void mo8417i(String str) {
        String a = this.f8358e.mo8379t().mo8384a();
        C6564m mVar = new C6564m(this.f8358e.mo8374j(), a);
        Bundle bundle = new Bundle();
        bundle.putString("fb_web_login_e2e", str);
        bundle.putLong("fb_web_login_switchback_time", System.currentTimeMillis());
        bundle.putString("app_id", a);
        mVar.mo20552k("fb_dialogs_web_login_dialog_complete", (Double) null, bundle);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public boolean mo8418j() {
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public boolean mo8295k(int i, int i2, Intent intent) {
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l */
    public void mo8296l(JSONObject jSONObject) {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m */
    public void mo8419m(LoginClient loginClient) {
        if (this.f8358e == null) {
            this.f8358e = loginClient;
            return;
        }
        throw new FacebookException("Can't set LoginClient if it is already set.");
    }

    /* renamed from: p */
    public boolean mo8297p() {
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: q */
    public abstract int mo8298q(LoginClient.Request request);

    public void writeToParcel(Parcel parcel, int i) {
        C8769a0.m32691s0(parcel, this.f8357d);
    }

    LoginMethodHandler(Parcel parcel) {
        this.f8357d = C8769a0.m32665f0(parcel);
    }
}
