package com.google.android.gms.tapandpay.issuer;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import p195o6.C7461a;

public final class PushProvisionSessionContext extends AbstractSafeParcelable {
    public static final Parcelable.Creator<PushProvisionSessionContext> CREATOR = new C4891d();

    /* renamed from: d */
    private final String f15314d;

    /* renamed from: e */
    private final String f15315e;

    /* renamed from: f */
    private final String f15316f;

    public PushProvisionSessionContext(String str, String str2, String str3) {
        this.f15314d = str;
        this.f15315e = str2;
        this.f15316f = str3;
    }

    public String toString() {
        return String.format("PushProvisionSessionContext{serverSessionId=%s, deviceId=%s, walletId=%s}", new Object[]{this.f15314d, this.f15315e, this.f15316f});
    }

    /* renamed from: v */
    public String mo15163v() {
        return this.f15315e;
    }

    /* renamed from: w */
    public String mo15164w() {
        return this.f15314d;
    }

    public void writeToParcel(Parcel parcel, int i) {
        int a = C7461a.m28369a(parcel);
        C7461a.m28392x(parcel, 1, mo15164w(), false);
        C7461a.m28392x(parcel, 2, mo15163v(), false);
        C7461a.m28392x(parcel, 3, mo15166x(), false);
        C7461a.m28370b(parcel, a);
    }

    /* renamed from: x */
    public String mo15166x() {
        return this.f15316f;
    }
}
