package com.google.android.gms.tapandpay.issuer;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import p195o6.C7461a;

public final class TokenInfo extends AbstractSafeParcelable {
    public static final Parcelable.Creator<TokenInfo> CREATOR = new C4894g();

    /* renamed from: d */
    final String f15336d;

    /* renamed from: e */
    final String f15337e;

    /* renamed from: f */
    final String f15338f;

    /* renamed from: g */
    final String f15339g;

    /* renamed from: h */
    final int f15340h;

    /* renamed from: i */
    final int f15341i;

    /* renamed from: j */
    final int f15342j;

    /* renamed from: k */
    final boolean f15343k;

    /* renamed from: l */
    final String f15344l;

    TokenInfo(String str, String str2, String str3, String str4, int i, int i2, int i3, boolean z, String str5) {
        this.f15336d = str;
        this.f15337e = str2;
        this.f15338f = str3;
        this.f15339g = str4;
        this.f15340h = i;
        this.f15341i = i2;
        this.f15342j = i3;
        this.f15343k = z;
        this.f15344l = str5;
    }

    /* renamed from: R */
    public int mo15178R() {
        return this.f15340h;
    }

    /* renamed from: f0 */
    public int mo15179f0() {
        return this.f15342j;
    }

    /* renamed from: v */
    public String mo15180v() {
        return this.f15338f;
    }

    /* renamed from: w */
    public String mo15181w() {
        return this.f15336d;
    }

    public void writeToParcel(Parcel parcel, int i) {
        int a = C7461a.m28369a(parcel);
        C7461a.m28392x(parcel, 1, this.f15336d, false);
        C7461a.m28392x(parcel, 2, this.f15337e, false);
        C7461a.m28392x(parcel, 3, this.f15338f, false);
        C7461a.m28392x(parcel, 4, this.f15339g, false);
        C7461a.m28383o(parcel, 5, this.f15340h);
        C7461a.m28383o(parcel, 6, this.f15341i);
        C7461a.m28383o(parcel, 7, this.f15342j);
        C7461a.m28372d(parcel, 8, this.f15343k);
        C7461a.m28392x(parcel, 9, this.f15344l, false);
        C7461a.m28370b(parcel, a);
    }

    /* renamed from: x */
    public int mo15183x() {
        return this.f15341i;
    }
}
