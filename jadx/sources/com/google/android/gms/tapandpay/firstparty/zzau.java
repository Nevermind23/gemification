package com.google.android.gms.tapandpay.firstparty;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;
import p182n6.C7258g;
import p195o6.C7461a;

public final class zzau extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzau> CREATOR = new C4872e();

    /* renamed from: d */
    final String f15249d;

    /* renamed from: e */
    final String f15250e;

    /* renamed from: f */
    final int f15251f;

    /* renamed from: g */
    final TokenStatus f15252g;

    /* renamed from: h */
    final String f15253h;

    /* renamed from: i */
    final Uri f15254i;

    /* renamed from: j */
    final byte[] f15255j;

    /* renamed from: k */
    final zzan[] f15256k;

    /* renamed from: l */
    final int f15257l;

    /* renamed from: m */
    final boolean f15258m;

    zzau(String str, String str2, int i, TokenStatus tokenStatus, String str3, Uri uri, byte[] bArr, zzan[] zzanArr, int i2, boolean z) {
        this.f15249d = str;
        this.f15250e = str2;
        this.f15251f = i;
        this.f15252g = tokenStatus;
        this.f15253h = str3;
        this.f15254i = uri;
        this.f15255j = bArr;
        this.f15256k = zzanArr;
        this.f15257l = i2;
        this.f15258m = z;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof zzau) {
            zzau zzau = (zzau) obj;
            if (!C7258g.m27880a(this.f15249d, zzau.f15249d) || !C7258g.m27880a(this.f15250e, zzau.f15250e) || this.f15251f != zzau.f15251f || !C7258g.m27880a(this.f15252g, zzau.f15252g) || !C7258g.m27880a(this.f15253h, zzau.f15253h) || !C7258g.m27880a(this.f15254i, zzau.f15254i) || !Arrays.equals(this.f15255j, zzau.f15255j) || !Arrays.equals(this.f15256k, zzau.f15256k) || this.f15257l != zzau.f15257l || this.f15258m != zzau.f15258m) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return C7258g.m27881b(this.f15249d, this.f15250e, Integer.valueOf(this.f15251f), this.f15252g, this.f15253h, this.f15254i, this.f15255j, this.f15256k, Integer.valueOf(this.f15257l), Boolean.valueOf(this.f15258m));
    }

    public final String toString() {
        String str;
        C7258g.C7259a a = C7258g.m27882c(this).mo21632a("billingCardId", this.f15249d).mo21632a("displayName", this.f15250e).mo21632a("cardNetwork", Integer.valueOf(this.f15251f)).mo21632a("tokenStatus", this.f15252g).mo21632a("panLastDigits", this.f15253h).mo21632a("cardImageUrl", this.f15254i);
        byte[] bArr = this.f15255j;
        String str2 = null;
        if (bArr == null) {
            str = null;
        } else {
            str = Arrays.toString(bArr);
        }
        C7258g.C7259a a2 = a.mo21632a("inAppCardToken", str);
        zzan[] zzanArr = this.f15256k;
        if (zzanArr != null) {
            str2 = Arrays.toString(zzanArr);
        }
        return a2.mo21632a("onlineAccountCardLinkInfos", str2).mo21632a("tokenType", Integer.valueOf(this.f15257l)).mo21632a("supportsOdaTransit", Boolean.valueOf(this.f15258m)).toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C7461a.m28369a(parcel);
        C7461a.m28392x(parcel, 1, this.f15249d, false);
        C7461a.m28392x(parcel, 2, this.f15250e, false);
        C7461a.m28383o(parcel, 3, this.f15251f);
        C7461a.m28390v(parcel, 4, this.f15252g, i, false);
        C7461a.m28392x(parcel, 5, this.f15253h, false);
        C7461a.m28390v(parcel, 6, this.f15254i, i, false);
        C7461a.m28376h(parcel, 7, this.f15255j, false);
        C7461a.m28363B(parcel, 8, this.f15256k, i, false);
        C7461a.m28383o(parcel, 9, this.f15257l);
        C7461a.m28372d(parcel, 10, this.f15258m);
        C7461a.m28370b(parcel, a);
    }
}
