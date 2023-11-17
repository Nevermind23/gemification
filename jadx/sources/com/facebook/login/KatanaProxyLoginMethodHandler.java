package com.facebook.login;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.C2626d;
import com.facebook.login.LoginClient;
import java.util.List;
import p297w4.C8797f;
import p297w4.C8832s;

class KatanaProxyLoginMethodHandler extends NativeAppLoginMethodHandler {
    public static final Parcelable.Creator<KatanaProxyLoginMethodHandler> CREATOR = new C2661a();

    /* renamed from: com.facebook.login.KatanaProxyLoginMethodHandler$a */
    static class C2661a implements Parcelable.Creator {
        C2661a() {
        }

        /* renamed from: a */
        public KatanaProxyLoginMethodHandler createFromParcel(Parcel parcel) {
            return new KatanaProxyLoginMethodHandler(parcel);
        }

        /* renamed from: b */
        public KatanaProxyLoginMethodHandler[] newArray(int i) {
            return new KatanaProxyLoginMethodHandler[i];
        }
    }

    KatanaProxyLoginMethodHandler(LoginClient loginClient) {
        super(loginClient);
    }

    public int describeContents() {
        return 0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public String mo8294g() {
        return "katana_proxy_auth";
    }

    /* renamed from: p */
    public boolean mo8297p() {
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: q */
    public int mo8298q(LoginClient.Request request) {
        boolean z;
        C2674d h = request.mo8391h();
        if (!C2626d.f8238r || C8797f.m32769a() == null || !h.mo8438a()) {
            z = false;
        } else {
            z = true;
        }
        String l = LoginClient.m10291l();
        List n = C8832s.m32890n(this.f8358e.mo8374j(), request.mo8384a(), request.mo8392i(), l, request.mo8394k(), request.mo8393j(), request.mo8388e(), mo8416f(request.mo8385b()), request.mo8386d(), z);
        mo8415a("e2e", l);
        for (int i = 0; i < n.size(); i++) {
            if (mo8420v((Intent) n.get(i), LoginClient.m10293s())) {
                return i + 1;
            }
        }
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
    }

    KatanaProxyLoginMethodHandler(Parcel parcel) {
        super(parcel);
    }
}
