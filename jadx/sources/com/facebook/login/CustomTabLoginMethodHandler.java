package com.facebook.login;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.C2625c;
import com.facebook.C2626d;
import com.facebook.CustomTabMainActivity;
import com.facebook.FacebookOperationCanceledException;
import com.facebook.login.LoginClient;
import org.json.JSONException;
import org.json.JSONObject;
import p297w4.C8769a0;
import p297w4.C8796e;
import p297w4.C8797f;

public class CustomTabLoginMethodHandler extends WebLoginMethodHandler {
    public static final Parcelable.Creator<CustomTabLoginMethodHandler> CREATOR = new C2647a();

    /* renamed from: j */
    public static boolean f8281j = false;

    /* renamed from: g */
    private String f8282g;

    /* renamed from: h */
    private String f8283h;

    /* renamed from: i */
    private String f8284i;

    /* renamed from: com.facebook.login.CustomTabLoginMethodHandler$a */
    static class C2647a implements Parcelable.Creator {
        C2647a() {
        }

        /* renamed from: a */
        public CustomTabLoginMethodHandler createFromParcel(Parcel parcel) {
            return new CustomTabLoginMethodHandler(parcel);
        }

        /* renamed from: b */
        public CustomTabLoginMethodHandler[] newArray(int i) {
            return new CustomTabLoginMethodHandler[i];
        }
    }

    CustomTabLoginMethodHandler(LoginClient loginClient) {
        super(loginClient);
        this.f8284i = "";
        this.f8283h = C8769a0.m32684p(20);
        f8281j = false;
        this.f8284i = C8797f.m32771c(m10205A());
    }

    /* renamed from: A */
    private String m10205A() {
        return super.mo8299t();
    }

    /* JADX WARNING: Removed duplicated region for block: B:34:0x0098  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00a1  */
    /* renamed from: B */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m10206B(java.lang.String r7, com.facebook.login.LoginClient.Request r8) {
        /*
            r6 = this;
            if (r7 == 0) goto L_0x00bb
            java.lang.String r0 = "fbconnect://cct."
            boolean r0 = r7.startsWith(r0)
            if (r0 != 0) goto L_0x0014
            java.lang.String r0 = super.mo8299t()
            boolean r0 = r7.startsWith(r0)
            if (r0 == 0) goto L_0x00bb
        L_0x0014:
            android.net.Uri r7 = android.net.Uri.parse(r7)
            java.lang.String r0 = r7.getQuery()
            android.os.Bundle r0 = p297w4.C8769a0.m32655a0(r0)
            java.lang.String r7 = r7.getFragment()
            android.os.Bundle r7 = p297w4.C8769a0.m32655a0(r7)
            r0.putAll(r7)
            boolean r7 = r6.m10207C(r0)
            r1 = 0
            if (r7 != 0) goto L_0x003d
            com.facebook.FacebookException r7 = new com.facebook.FacebookException
            java.lang.String r0 = "Invalid state parameter"
            r7.<init>((java.lang.String) r0)
            super.mo8423x(r8, r1, r7)
            return
        L_0x003d:
            java.lang.String r7 = "error"
            java.lang.String r7 = r0.getString(r7)
            if (r7 != 0) goto L_0x004b
            java.lang.String r7 = "error_type"
            java.lang.String r7 = r0.getString(r7)
        L_0x004b:
            java.lang.String r2 = "error_msg"
            java.lang.String r2 = r0.getString(r2)
            if (r2 != 0) goto L_0x0059
            java.lang.String r2 = "error_message"
            java.lang.String r2 = r0.getString(r2)
        L_0x0059:
            if (r2 != 0) goto L_0x0061
            java.lang.String r2 = "error_description"
            java.lang.String r2 = r0.getString(r2)
        L_0x0061:
            java.lang.String r3 = "error_code"
            java.lang.String r3 = r0.getString(r3)
            boolean r4 = p297w4.C8769a0.m32644Q(r3)
            r5 = -1
            if (r4 != 0) goto L_0x0073
            int r3 = java.lang.Integer.parseInt(r3)     // Catch:{ NumberFormatException -> 0x0073 }
            goto L_0x0074
        L_0x0073:
            r3 = r5
        L_0x0074:
            boolean r4 = p297w4.C8769a0.m32644Q(r7)
            if (r4 == 0) goto L_0x0086
            boolean r4 = p297w4.C8769a0.m32644Q(r2)
            if (r4 == 0) goto L_0x0086
            if (r3 != r5) goto L_0x0086
            super.mo8423x(r8, r0, r1)
            goto L_0x00bb
        L_0x0086:
            if (r7 == 0) goto L_0x00a1
            java.lang.String r0 = "access_denied"
            boolean r0 = r7.equals(r0)
            if (r0 != 0) goto L_0x0098
            java.lang.String r0 = "OAuthAccessDeniedException"
            boolean r0 = r7.equals(r0)
            if (r0 == 0) goto L_0x00a1
        L_0x0098:
            com.facebook.FacebookOperationCanceledException r7 = new com.facebook.FacebookOperationCanceledException
            r7.<init>()
            super.mo8423x(r8, r1, r7)
            goto L_0x00bb
        L_0x00a1:
            r0 = 4201(0x1069, float:5.887E-42)
            if (r3 != r0) goto L_0x00ae
            com.facebook.FacebookOperationCanceledException r7 = new com.facebook.FacebookOperationCanceledException
            r7.<init>()
            super.mo8423x(r8, r1, r7)
            goto L_0x00bb
        L_0x00ae:
            com.facebook.FacebookRequestError r0 = new com.facebook.FacebookRequestError
            r0.<init>(r3, r7, r2)
            com.facebook.FacebookServiceException r7 = new com.facebook.FacebookServiceException
            r7.<init>(r0, r2)
            super.mo8423x(r8, r1, r7)
        L_0x00bb:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.login.CustomTabLoginMethodHandler.m10206B(java.lang.String, com.facebook.login.LoginClient$Request):void");
    }

    /* renamed from: C */
    private boolean m10207C(Bundle bundle) {
        try {
            String string = bundle.getString("state");
            if (string == null) {
                return false;
            }
            return new JSONObject(string).getString("7_challenge").equals(this.f8283h);
        } catch (JSONException unused) {
            return false;
        }
    }

    /* renamed from: z */
    private String m10208z() {
        String str = this.f8282g;
        if (str != null) {
            return str;
        }
        String a = C8797f.m32769a();
        this.f8282g = a;
        return a;
    }

    public int describeContents() {
        return 0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public String mo8294g() {
        return "custom_tab";
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public boolean mo8295k(int i, int i2, Intent intent) {
        if (intent != null && intent.getBooleanExtra(CustomTabMainActivity.f8107k, false)) {
            return super.mo8295k(i, i2, intent);
        }
        if (i != 1) {
            return super.mo8295k(i, i2, intent);
        }
        LoginClient.Request t = this.f8358e.mo8379t();
        if (i2 == -1) {
            m10206B(intent.getStringExtra(CustomTabMainActivity.f8105i), t);
            return true;
        }
        super.mo8423x(t, (Bundle) null, new FacebookOperationCanceledException());
        return false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: l */
    public void mo8296l(JSONObject jSONObject) {
        jSONObject.put("7_challenge", this.f8283h);
    }

    /* renamed from: p */
    public /* bridge */ /* synthetic */ boolean mo8297p() {
        return super.mo8297p();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: q */
    public int mo8298q(LoginClient.Request request) {
        if (mo8299t().isEmpty()) {
            return 0;
        }
        Bundle r = mo8421r(mo8422s(request), request);
        if (f8281j) {
            r.putString("cct_over_app_switch", "1");
        }
        if (C2626d.f8237q) {
            C2671a.m10387b(C8796e.m32767a("oauth", r));
        }
        Intent intent = new Intent(this.f8358e.mo8374j(), CustomTabMainActivity.class);
        intent.putExtra(CustomTabMainActivity.f8102f, "oauth");
        intent.putExtra(CustomTabMainActivity.f8103g, r);
        intent.putExtra(CustomTabMainActivity.f8104h, m10208z());
        this.f8358e.mo8376m().startActivityForResult(intent, 1);
        return 1;
    }

    /* access modifiers changed from: protected */
    /* renamed from: t */
    public String mo8299t() {
        return this.f8284i;
    }

    /* access modifiers changed from: protected */
    /* renamed from: u */
    public String mo8300u() {
        return "chrome_custom_tab";
    }

    /* access modifiers changed from: package-private */
    /* renamed from: v */
    public C2625c mo8301v() {
        return C2625c.CHROME_CUSTOM_TAB;
    }

    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeString(this.f8283h);
    }

    CustomTabLoginMethodHandler(Parcel parcel) {
        super(parcel);
        this.f8284i = "";
        this.f8283h = parcel.readString();
    }
}
