package com.facebook.login;

import android.os.Bundle;
import android.os.Parcel;
import android.text.TextUtils;
import android.webkit.CookieSyncManager;
import com.facebook.AccessToken;
import com.facebook.C2625c;
import com.facebook.C2626d;
import com.facebook.FacebookException;
import com.facebook.FacebookOperationCanceledException;
import com.facebook.FacebookRequestError;
import com.facebook.FacebookServiceException;
import com.facebook.login.LoginClient;
import java.util.Locale;
import p297w4.C8769a0;
import p341ge.bog.mobilebank.shared2.network.BankApiResponse;

abstract class WebLoginMethodHandler extends LoginMethodHandler {

    /* renamed from: f */
    private String f8359f;

    WebLoginMethodHandler(LoginClient loginClient) {
        super(loginClient);
    }

    /* renamed from: w */
    private String m10364w() {
        return this.f8358e.mo8374j().getSharedPreferences("com.facebook.login.AuthorizationClient.WebViewAuthHandler.TOKEN_STORE_KEY", 0).getString("TOKEN", "");
    }

    /* renamed from: y */
    private void m10365y(String str) {
        this.f8358e.mo8374j().getSharedPreferences("com.facebook.login.AuthorizationClient.WebViewAuthHandler.TOKEN_STORE_KEY", 0).edit().putString("TOKEN", str).apply();
    }

    /* access modifiers changed from: protected */
    /* renamed from: r */
    public Bundle mo8421r(Bundle bundle, LoginClient.Request request) {
        String str;
        bundle.putString("redirect_uri", mo8299t());
        bundle.putString("client_id", request.mo8384a());
        bundle.putString("e2e", LoginClient.m10291l());
        bundle.putString("response_type", "token,signed_request,graph_domain");
        bundle.putString("return_scopes", "true");
        bundle.putString("auth_type", request.mo8386d());
        bundle.putString("login_behavior", request.mo8391h().name());
        bundle.putString("sdk", String.format(Locale.ROOT, "android-%s", new Object[]{C2626d.m10149t()}));
        if (mo8300u() != null) {
            bundle.putString("sso", mo8300u());
        }
        if (C2626d.f8237q) {
            str = "1";
        } else {
            str = BankApiResponse.SUCCESSFUL_RESPONSE_CODE;
        }
        bundle.putString("cct_prefetching", str);
        return bundle;
    }

    /* access modifiers changed from: protected */
    /* renamed from: s */
    public Bundle mo8422s(LoginClient.Request request) {
        String str;
        Bundle bundle = new Bundle();
        if (!C8769a0.m32645R(request.mo8392i())) {
            String join = TextUtils.join(",", request.mo8392i());
            bundle.putString("scope", join);
            mo8415a("scope", join);
        }
        bundle.putString("default_audience", request.mo8388e().mo8436a());
        bundle.putString("state", mo8416f(request.mo8385b()));
        AccessToken h = AccessToken.m9965h();
        if (h != null) {
            str = h.mo8134t();
        } else {
            str = null;
        }
        String str2 = "1";
        if (str == null || !str.equals(m10364w())) {
            C8769a0.m32666g(this.f8358e.mo8374j());
            mo8415a("access_token", BankApiResponse.SUCCESSFUL_RESPONSE_CODE);
        } else {
            bundle.putString("access_token", str);
            mo8415a("access_token", str2);
        }
        bundle.putString("cbt", String.valueOf(System.currentTimeMillis()));
        if (!C2626d.m10138i()) {
            str2 = BankApiResponse.SUCCESSFUL_RESPONSE_CODE;
        }
        bundle.putString("ies", str2);
        return bundle;
    }

    /* access modifiers changed from: protected */
    /* renamed from: t */
    public String mo8299t() {
        return "fb" + C2626d.m10135f() + "://authorize";
    }

    /* access modifiers changed from: protected */
    /* renamed from: u */
    public String mo8300u() {
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: v */
    public abstract C2625c mo8301v();

    /* access modifiers changed from: protected */
    /* renamed from: x */
    public void mo8423x(LoginClient.Request request, Bundle bundle, FacebookException facebookException) {
        LoginClient.Result result;
        String str;
        this.f8359f = null;
        if (bundle != null) {
            if (bundle.containsKey("e2e")) {
                this.f8359f = bundle.getString("e2e");
            }
            try {
                AccessToken e = LoginMethodHandler.m10345e(request.mo8392i(), bundle, mo8301v(), request.mo8384a());
                result = LoginClient.Result.m10335e(this.f8358e.mo8379t(), e);
                CookieSyncManager.createInstance(this.f8358e.mo8374j()).sync();
                m10365y(e.mo8134t());
            } catch (FacebookException e2) {
                result = LoginClient.Result.m10333b(this.f8358e.mo8379t(), (String) null, e2.getMessage());
            }
        } else if (facebookException instanceof FacebookOperationCanceledException) {
            result = LoginClient.Result.m10332a(this.f8358e.mo8379t(), "User canceled log in.");
        } else {
            this.f8359f = null;
            String message = facebookException.getMessage();
            if (facebookException instanceof FacebookServiceException) {
                FacebookRequestError a = ((FacebookServiceException) facebookException).mo8174a();
                str = String.format(Locale.ROOT, "%d", new Object[]{Integer.valueOf(a.mo8160d())});
                message = a.toString();
            } else {
                str = null;
            }
            result = LoginClient.Result.m10334d(this.f8358e.mo8379t(), (String) null, message, str);
        }
        if (!C8769a0.m32644Q(this.f8359f)) {
            mo8417i(this.f8359f);
        }
        this.f8358e.mo8373h(result);
    }

    WebLoginMethodHandler(Parcel parcel) {
        super(parcel);
    }
}
