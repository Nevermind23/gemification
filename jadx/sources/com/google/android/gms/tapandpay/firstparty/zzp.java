package com.google.android.gms.tapandpay.firstparty;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseArray;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import p195o6.C7461a;
import p325y7.C9095m;

public final class zzp extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzp> CREATOR = new C9095m();

    /* renamed from: d */
    final CardInfo[] f15281d;

    /* renamed from: e */
    final AccountInfo f15282e;

    /* renamed from: f */
    final String f15283f;

    /* renamed from: g */
    final String f15284g;

    /* renamed from: h */
    final SparseArray f15285h;

    /* renamed from: i */
    final byte[] f15286i;

    public zzp(CardInfo[] cardInfoArr, AccountInfo accountInfo, String str, String str2, SparseArray sparseArray, byte[] bArr) {
        this.f15281d = cardInfoArr;
        this.f15282e = accountInfo;
        this.f15283f = str;
        this.f15284g = str2;
        this.f15285h = sparseArray;
        this.f15286i = bArr;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C7461a.m28369a(parcel);
        C7461a.m28363B(parcel, 2, this.f15281d, i, false);
        C7461a.m28390v(parcel, 3, this.f15282e, i, false);
        C7461a.m28392x(parcel, 4, this.f15283f, false);
        C7461a.m28392x(parcel, 5, this.f15284g, false);
        C7461a.m28362A(parcel, 6, this.f15285h, false);
        C7461a.m28376h(parcel, 7, this.f15286i, false);
        C7461a.m28370b(parcel, a);
    }
}
