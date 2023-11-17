package com.facebook.login;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.fragment.app.C1505h;
import com.facebook.C2625c;
import com.facebook.FacebookException;
import com.facebook.login.LoginClient;
import p297w4.C8769a0;
import p297w4.C8785c0;
import p297w4.C8798g;

class WebViewLoginMethodHandler extends WebLoginMethodHandler {
    public static final Parcelable.Creator<WebViewLoginMethodHandler> CREATOR = new C2669b();

    /* renamed from: g */
    private C8785c0 f8360g;

    /* renamed from: h */
    private String f8361h;

    /* renamed from: com.facebook.login.WebViewLoginMethodHandler$a */
    class C2668a implements C8785c0.C8792g {

        /* renamed from: a */
        final /* synthetic */ LoginClient.Request f8362a;

        C2668a(LoginClient.Request request) {
            this.f8362a = request;
        }

        /* renamed from: a */
        public void mo8426a(Bundle bundle, FacebookException facebookException) {
            WebViewLoginMethodHandler.this.mo8425z(this.f8362a, bundle, facebookException);
        }
    }

    /* renamed from: com.facebook.login.WebViewLoginMethodHandler$b */
    static class C2669b implements Parcelable.Creator {
        C2669b() {
        }

        /* renamed from: a */
        public WebViewLoginMethodHandler createFromParcel(Parcel parcel) {
            return new WebViewLoginMethodHandler(parcel);
        }

        /* renamed from: b */
        public WebViewLoginMethodHandler[] newArray(int i) {
            return new WebViewLoginMethodHandler[i];
        }
    }

    /* renamed from: com.facebook.login.WebViewLoginMethodHandler$c */
    static class C2670c extends C8785c0.C8790e {

        /* renamed from: h */
        private String f8364h;

        /* renamed from: i */
        private String f8365i;

        /* renamed from: j */
        private String f8366j = "fbconnect://success";

        /* renamed from: k */
        private C2674d f8367k = C2674d.NATIVE_WITH_FALLBACK;

        public C2670c(Context context, String str, Bundle bundle) {
            super(context, str, "oauth", bundle);
        }

        /* renamed from: a */
        public C8785c0 mo8431a() {
            Bundle f = mo24214f();
            f.putString("redirect_uri", this.f8366j);
            f.putString("client_id", mo24211c());
            f.putString("e2e", this.f8364h);
            f.putString("response_type", "token,signed_request,graph_domain");
            f.putString("return_scopes", "true");
            f.putString("auth_type", this.f8365i);
            f.putString("login_behavior", this.f8367k.name());
            return C8785c0.m32741q(mo24212d(), "oauth", f, mo24215g(), mo24213e());
        }

        /* renamed from: i */
        public C2670c mo8432i(String str) {
            this.f8365i = str;
            return this;
        }

        /* renamed from: j */
        public C2670c mo8433j(String str) {
            this.f8364h = str;
            return this;
        }

        /* renamed from: k */
        public C2670c mo8434k(boolean z) {
            String str;
            if (z) {
                str = "fbconnect://chrome_os_success";
            } else {
                str = "fbconnect://success";
            }
            this.f8366j = str;
            return this;
        }

        /* renamed from: l */
        public C2670c mo8435l(C2674d dVar) {
            this.f8367k = dVar;
            return this;
        }
    }

    WebViewLoginMethodHandler(LoginClient loginClient) {
        super(loginClient);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo8345b() {
        C8785c0 c0Var = this.f8360g;
        if (c0Var != null) {
            c0Var.cancel();
            this.f8360g = null;
        }
    }

    public int describeContents() {
        return 0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public String mo8294g() {
        return "web_view";
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public boolean mo8418j() {
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: q */
    public int mo8298q(LoginClient.Request request) {
        Bundle s = mo8422s(request);
        C2668a aVar = new C2668a(request);
        String l = LoginClient.m10291l();
        this.f8361h = l;
        mo8415a("e2e", l);
        C1505h j = this.f8358e.mo8374j();
        this.f8360g = new C2670c(j, request.mo8384a(), s).mo8433j(this.f8361h).mo8434k(C8769a0.m32639L(j)).mo8432i(request.mo8386d()).mo8435l(request.mo8391h()).mo24216h(aVar).mo8431a();
        C8798g gVar = new C8798g();
        gVar.setRetainInstance(true);
        gVar.mo24228F1(this.f8360g);
        gVar.mo4576A1(j.getSupportFragmentManager(), "FacebookDialogFragment");
        return 1;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: v */
    public C2625c mo8301v() {
        return C2625c.WEB_VIEW;
    }

    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeString(this.f8361h);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: z */
    public void mo8425z(LoginClient.Request request, Bundle bundle, FacebookException facebookException) {
        super.mo8423x(request, bundle, facebookException);
    }

    WebViewLoginMethodHandler(Parcel parcel) {
        super(parcel);
        this.f8361h = parcel.readString();
    }
}
