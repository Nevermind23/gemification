package com.facebook.login;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import com.facebook.C2625c;
import com.facebook.FacebookException;
import com.facebook.login.LoginClient;
import p297w4.C8769a0;
import p297w4.C8845v;

abstract class NativeAppLoginMethodHandler extends LoginMethodHandler {
    NativeAppLoginMethodHandler(LoginClient loginClient) {
        super(loginClient);
    }

    /* renamed from: r */
    private String m10358r(Bundle bundle) {
        String string = bundle.getString("error");
        if (string == null) {
            return bundle.getString("error_type");
        }
        return string;
    }

    /* renamed from: s */
    private String m10359s(Bundle bundle) {
        String string = bundle.getString("error_message");
        if (string == null) {
            return bundle.getString("error_description");
        }
        return string;
    }

    /* renamed from: t */
    private LoginClient.Result m10360t(LoginClient.Request request, Intent intent) {
        String str;
        Bundle extras = intent.getExtras();
        String r = m10358r(extras);
        if (extras.get("error_code") != null) {
            str = extras.get("error_code").toString();
        } else {
            str = null;
        }
        if ("CONNECTION_FAILURE".equals(str)) {
            return LoginClient.Result.m10334d(request, r, m10359s(extras), str);
        }
        return LoginClient.Result.m10332a(request, r);
    }

    /* renamed from: u */
    private LoginClient.Result m10361u(LoginClient.Request request, Intent intent) {
        String str;
        Bundle extras = intent.getExtras();
        String r = m10358r(extras);
        if (extras.get("error_code") != null) {
            str = extras.get("error_code").toString();
        } else {
            str = null;
        }
        String s = m10359s(extras);
        String string = extras.getString("e2e");
        if (!C8769a0.m32644Q(string)) {
            mo8417i(string);
        }
        if (r == null && str == null && s == null) {
            try {
                return LoginClient.Result.m10335e(request, LoginMethodHandler.m10345e(request.mo8392i(), extras, C2625c.FACEBOOK_APPLICATION_WEB, request.mo8384a()));
            } catch (FacebookException e) {
                return LoginClient.Result.m10333b(request, (String) null, e.getMessage());
            }
        } else if (r.equals("logged_out")) {
            CustomTabLoginMethodHandler.f8281j = true;
            return null;
        } else if (C8845v.f24818a.contains(r)) {
            return null;
        } else {
            if (C8845v.f24819b.contains(r)) {
                return LoginClient.Result.m10332a(request, (String) null);
            }
            return LoginClient.Result.m10334d(request, r, s, str);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public boolean mo8295k(int i, int i2, Intent intent) {
        LoginClient.Result result;
        LoginClient.Request t = this.f8358e.mo8379t();
        if (intent == null) {
            result = LoginClient.Result.m10332a(t, "Operation canceled");
        } else if (i2 == 0) {
            result = m10360t(t, intent);
        } else if (i2 != -1) {
            result = LoginClient.Result.m10333b(t, "Unexpected resultCode from authorization.", (String) null);
        } else {
            result = m10361u(t, intent);
        }
        if (result != null) {
            this.f8358e.mo8373h(result);
            return true;
        }
        this.f8358e.mo8365F();
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: v */
    public boolean mo8420v(Intent intent, int i) {
        if (intent == null) {
            return false;
        }
        try {
            this.f8358e.mo8376m().startActivityForResult(intent, i);
            return true;
        } catch (ActivityNotFoundException unused) {
            return false;
        }
    }

    NativeAppLoginMethodHandler(Parcel parcel) {
        super(parcel);
    }
}
