package com.google.android.gms.tapandpay.globalactions;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import p182n6.C7258g;
import p195o6.C7461a;

public final class GetGlobalActionCardsRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<GetGlobalActionCardsRequest> CREATOR = new C4881a();

    /* renamed from: d */
    private int f15293d;

    /* renamed from: e */
    private int f15294e;

    /* renamed from: f */
    private int f15295f;

    private GetGlobalActionCardsRequest() {
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof GetGlobalActionCardsRequest) {
            GetGlobalActionCardsRequest getGlobalActionCardsRequest = (GetGlobalActionCardsRequest) obj;
            if (!C7258g.m27880a(Integer.valueOf(this.f15293d), Integer.valueOf(getGlobalActionCardsRequest.f15293d)) || !C7258g.m27880a(Integer.valueOf(this.f15294e), Integer.valueOf(getGlobalActionCardsRequest.f15294e)) || !C7258g.m27880a(Integer.valueOf(this.f15295f), Integer.valueOf(getGlobalActionCardsRequest.f15295f))) {
                return false;
            }
            return true;
        }
        return false;
    }

    public int hashCode() {
        return C7258g.m27881b(Integer.valueOf(this.f15293d), Integer.valueOf(this.f15294e), Integer.valueOf(this.f15295f));
    }

    /* renamed from: v */
    public int mo15126v() {
        return this.f15295f;
    }

    /* renamed from: w */
    public int mo15127w() {
        return this.f15294e;
    }

    public void writeToParcel(Parcel parcel, int i) {
        int a = C7461a.m28369a(parcel);
        C7461a.m28383o(parcel, 1, mo15129x());
        C7461a.m28383o(parcel, 2, mo15127w());
        C7461a.m28383o(parcel, 3, mo15126v());
        C7461a.m28370b(parcel, a);
    }

    /* renamed from: x */
    public int mo15129x() {
        return this.f15293d;
    }

    GetGlobalActionCardsRequest(int i, int i2, int i3) {
        this.f15293d = i;
        this.f15294e = i2;
        this.f15295f = i3;
    }
}
