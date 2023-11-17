package com.google.android.gms.tapandpay.firstparty;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import p195o6.C7461a;
import p325y7.C9089g;

public class RetrieveInAppPaymentCredentialResponse extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<RetrieveInAppPaymentCredentialResponse> CREATOR = new C9089g();

    /* renamed from: d */
    final String f15197d;

    /* renamed from: e */
    final byte[] f15198e;

    /* renamed from: f */
    final int f15199f;

    /* renamed from: g */
    final int f15200g;

    /* renamed from: h */
    final String f15201h;

    /* renamed from: i */
    final String f15202i;

    public RetrieveInAppPaymentCredentialResponse(String str, byte[] bArr, int i, int i2, String str2, String str3) {
        this.f15197d = str;
        this.f15198e = bArr;
        this.f15199f = i;
        this.f15200g = i2;
        this.f15201h = str2;
        this.f15202i = str3;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C7461a.m28369a(parcel);
        C7461a.m28392x(parcel, 2, this.f15197d, false);
        C7461a.m28376h(parcel, 3, this.f15198e, false);
        C7461a.m28383o(parcel, 4, this.f15199f);
        C7461a.m28383o(parcel, 5, this.f15200g);
        C7461a.m28392x(parcel, 6, this.f15201h, false);
        C7461a.m28392x(parcel, 7, this.f15202i, false);
        C7461a.m28370b(parcel, a);
    }
}
