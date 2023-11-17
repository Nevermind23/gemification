package com.facebook.login;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.fragment.app.C1505h;
import com.facebook.AccessToken;
import com.facebook.C2625c;
import com.facebook.login.LoginClient;
import java.util.Collection;
import java.util.Date;
import java.util.concurrent.ScheduledThreadPoolExecutor;

class DeviceAuthMethodHandler extends LoginMethodHandler {
    public static final Parcelable.Creator<DeviceAuthMethodHandler> CREATOR = new C2656a();

    /* renamed from: f */
    private static ScheduledThreadPoolExecutor f8317f;

    /* renamed from: com.facebook.login.DeviceAuthMethodHandler$a */
    static class C2656a implements Parcelable.Creator {
        C2656a() {
        }

        /* renamed from: a */
        public DeviceAuthMethodHandler createFromParcel(Parcel parcel) {
            return new DeviceAuthMethodHandler(parcel);
        }

        /* renamed from: b */
        public DeviceAuthMethodHandler[] newArray(int i) {
            return new DeviceAuthMethodHandler[i];
        }
    }

    DeviceAuthMethodHandler(LoginClient loginClient) {
        super(loginClient);
    }

    /* renamed from: s */
    public static synchronized ScheduledThreadPoolExecutor m10259s() {
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor;
        synchronized (DeviceAuthMethodHandler.class) {
            if (f8317f == null) {
                f8317f = new ScheduledThreadPoolExecutor(1);
            }
            scheduledThreadPoolExecutor = f8317f;
        }
        return scheduledThreadPoolExecutor;
    }

    /* renamed from: w */
    private void m10260w(LoginClient.Request request) {
        C1505h j = this.f8358e.mo8374j();
        if (j != null && !j.isFinishing()) {
            DeviceAuthDialog r = mo8332r();
            r.mo4576A1(j.getSupportFragmentManager(), "login_with_facebook");
            r.mo8311Z1(request);
        }
    }

    public int describeContents() {
        return 0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public String mo8294g() {
        return "device_auth";
    }

    /* access modifiers changed from: package-private */
    /* renamed from: q */
    public int mo8298q(LoginClient.Request request) {
        m10260w(request);
        return 1;
    }

    /* access modifiers changed from: protected */
    /* renamed from: r */
    public DeviceAuthDialog mo8332r() {
        return new DeviceAuthDialog();
    }

    /* renamed from: t */
    public void mo8333t() {
        this.f8358e.mo8373h(LoginClient.Result.m10332a(this.f8358e.mo8379t(), "User canceled log in."));
    }

    /* renamed from: u */
    public void mo8334u(Exception exc) {
        this.f8358e.mo8373h(LoginClient.Result.m10333b(this.f8358e.mo8379t(), (String) null, exc.getMessage()));
    }

    /* renamed from: v */
    public void mo8335v(String str, String str2, String str3, Collection collection, Collection collection2, Collection collection3, C2625c cVar, Date date, Date date2, Date date3) {
        this.f8358e.mo8373h(LoginClient.Result.m10335e(this.f8358e.mo8379t(), new AccessToken(str, str2, str3, collection, collection2, collection3, cVar, date, date2, date3)));
    }

    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
    }

    protected DeviceAuthMethodHandler(Parcel parcel) {
        super(parcel);
    }
}
