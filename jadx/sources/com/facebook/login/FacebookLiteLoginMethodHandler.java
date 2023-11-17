package com.facebook.login;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.login.LoginClient;
import p297w4.C8832s;

class FacebookLiteLoginMethodHandler extends NativeAppLoginMethodHandler {
    public static final Parcelable.Creator<FacebookLiteLoginMethodHandler> CREATOR = new C2657a();

    /* renamed from: com.facebook.login.FacebookLiteLoginMethodHandler$a */
    static class C2657a implements Parcelable.Creator {
        C2657a() {
        }

        /* renamed from: a */
        public FacebookLiteLoginMethodHandler createFromParcel(Parcel parcel) {
            return new FacebookLiteLoginMethodHandler(parcel);
        }

        /* renamed from: b */
        public FacebookLiteLoginMethodHandler[] newArray(int i) {
            return new FacebookLiteLoginMethodHandler[i];
        }
    }

    FacebookLiteLoginMethodHandler(LoginClient loginClient) {
        super(loginClient);
    }

    public int describeContents() {
        return 0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public String mo8294g() {
        return "fb_lite_login";
    }

    /* access modifiers changed from: package-private */
    /* renamed from: q */
    public int mo8298q(LoginClient.Request request) {
        String l = LoginClient.m10291l();
        Intent j = C8832s.m32886j(this.f8358e.mo8374j(), request.mo8384a(), request.mo8392i(), l, request.mo8394k(), request.mo8393j(), request.mo8388e(), mo8416f(request.mo8385b()), request.mo8386d());
        mo8415a("e2e", l);
        return mo8420v(j, LoginClient.m10293s()) ? 1 : 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
    }

    FacebookLiteLoginMethodHandler(Parcel parcel) {
        super(parcel);
    }
}
