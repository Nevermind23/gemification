package com.facebook.login;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.facebook.C2625c;
import com.facebook.FacebookException;
import com.facebook.login.LoginClient;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;
import p297w4.C8769a0;
import p297w4.C8841t;

class GetTokenLoginMethodHandler extends LoginMethodHandler {
    public static final Parcelable.Creator<GetTokenLoginMethodHandler> CREATOR = new C2660c();

    /* renamed from: f */
    private C2673c f8318f;

    /* renamed from: com.facebook.login.GetTokenLoginMethodHandler$a */
    class C2658a implements C8841t.C8843b {

        /* renamed from: a */
        final /* synthetic */ LoginClient.Request f8319a;

        C2658a(LoginClient.Request request) {
            this.f8319a = request;
        }

        /* renamed from: a */
        public void mo8350a(Bundle bundle) {
            GetTokenLoginMethodHandler.this.mo8348s(this.f8319a, bundle);
        }
    }

    /* renamed from: com.facebook.login.GetTokenLoginMethodHandler$b */
    class C2659b implements C8769a0.C8772c {

        /* renamed from: a */
        final /* synthetic */ Bundle f8321a;

        /* renamed from: b */
        final /* synthetic */ LoginClient.Request f8322b;

        C2659b(Bundle bundle, LoginClient.Request request) {
            this.f8321a = bundle;
            this.f8322b = request;
        }

        /* renamed from: a */
        public void mo8221a(JSONObject jSONObject) {
            try {
                this.f8321a.putString("com.facebook.platform.extra.USER_ID", jSONObject.getString("id"));
                GetTokenLoginMethodHandler.this.mo8349t(this.f8322b, this.f8321a);
            } catch (JSONException e) {
                LoginClient loginClient = GetTokenLoginMethodHandler.this.f8358e;
                loginClient.mo8372g(LoginClient.Result.m10333b(loginClient.mo8379t(), "Caught exception", e.getMessage()));
            }
        }

        /* renamed from: b */
        public void mo8222b(FacebookException facebookException) {
            LoginClient loginClient = GetTokenLoginMethodHandler.this.f8358e;
            loginClient.mo8372g(LoginClient.Result.m10333b(loginClient.mo8379t(), "Caught exception", facebookException.getMessage()));
        }
    }

    /* renamed from: com.facebook.login.GetTokenLoginMethodHandler$c */
    static class C2660c implements Parcelable.Creator {
        C2660c() {
        }

        /* renamed from: a */
        public GetTokenLoginMethodHandler createFromParcel(Parcel parcel) {
            return new GetTokenLoginMethodHandler(parcel);
        }

        /* renamed from: b */
        public GetTokenLoginMethodHandler[] newArray(int i) {
            return new GetTokenLoginMethodHandler[i];
        }
    }

    GetTokenLoginMethodHandler(LoginClient loginClient) {
        super(loginClient);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo8345b() {
        C2673c cVar = this.f8318f;
        if (cVar != null) {
            cVar.mo24268b();
            this.f8318f.mo24270f((C8841t.C8843b) null);
            this.f8318f = null;
        }
    }

    public int describeContents() {
        return 0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public String mo8294g() {
        return "get_token";
    }

    /* access modifiers changed from: package-private */
    /* renamed from: q */
    public int mo8298q(LoginClient.Request request) {
        C2673c cVar = new C2673c(this.f8358e.mo8374j(), request.mo8384a());
        this.f8318f = cVar;
        if (!cVar.mo24271g()) {
            return 0;
        }
        this.f8358e.mo8380w();
        this.f8318f.mo24270f(new C2658a(request));
        return 1;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: r */
    public void mo8347r(LoginClient.Request request, Bundle bundle) {
        String string = bundle.getString("com.facebook.platform.extra.USER_ID");
        if (string == null || string.isEmpty()) {
            this.f8358e.mo8380w();
            C8769a0.m32697y(bundle.getString("com.facebook.platform.extra.ACCESS_TOKEN"), new C2659b(bundle, request));
            return;
        }
        mo8349t(request, bundle);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: s */
    public void mo8348s(LoginClient.Request request, Bundle bundle) {
        C2673c cVar = this.f8318f;
        if (cVar != null) {
            cVar.mo24270f((C8841t.C8843b) null);
        }
        this.f8318f = null;
        this.f8358e.mo8382x();
        if (bundle != null) {
            ArrayList<String> stringArrayList = bundle.getStringArrayList("com.facebook.platform.extra.PERMISSIONS");
            Set<String> i = request.mo8392i();
            if (stringArrayList == null || (i != null && !stringArrayList.containsAll(i))) {
                HashSet hashSet = new HashSet();
                for (String str : i) {
                    if (!stringArrayList.contains(str)) {
                        hashSet.add(str);
                    }
                }
                if (!hashSet.isEmpty()) {
                    mo8415a("new_permissions", TextUtils.join(",", hashSet));
                }
                request.mo8395l(hashSet);
            } else {
                mo8347r(request, bundle);
                return;
            }
        }
        this.f8358e.mo8365F();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: t */
    public void mo8349t(LoginClient.Request request, Bundle bundle) {
        this.f8358e.mo8373h(LoginClient.Result.m10335e(this.f8358e.mo8379t(), LoginMethodHandler.m10344d(bundle, C2625c.FACEBOOK_APPLICATION_SERVICE, request.mo8384a())));
    }

    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
    }

    GetTokenLoginMethodHandler(Parcel parcel) {
        super(parcel);
    }
}
