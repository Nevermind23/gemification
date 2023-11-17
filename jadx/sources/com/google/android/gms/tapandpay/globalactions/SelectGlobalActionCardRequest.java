package com.google.android.gms.tapandpay.globalactions;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import p182n6.C7258g;
import p195o6.C7461a;

public final class SelectGlobalActionCardRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<SelectGlobalActionCardRequest> CREATOR = new C4884d();

    /* renamed from: d */
    private int f15306d;

    /* renamed from: e */
    private String f15307e;

    /* renamed from: f */
    private int f15308f;

    private SelectGlobalActionCardRequest() {
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof SelectGlobalActionCardRequest) {
            SelectGlobalActionCardRequest selectGlobalActionCardRequest = (SelectGlobalActionCardRequest) obj;
            if (!C7258g.m27880a(Integer.valueOf(this.f15306d), Integer.valueOf(selectGlobalActionCardRequest.f15306d)) || !C7258g.m27880a(this.f15307e, selectGlobalActionCardRequest.f15307e) || !C7258g.m27880a(Integer.valueOf(this.f15308f), Integer.valueOf(selectGlobalActionCardRequest.f15308f))) {
                return false;
            }
            return true;
        }
        return false;
    }

    public int hashCode() {
        return C7258g.m27881b(Integer.valueOf(this.f15306d), this.f15307e, Integer.valueOf(this.f15308f));
    }

    /* renamed from: v */
    public String mo15148v() {
        return this.f15307e;
    }

    /* renamed from: w */
    public int mo15149w() {
        return this.f15306d;
    }

    public void writeToParcel(Parcel parcel, int i) {
        int a = C7461a.m28369a(parcel);
        C7461a.m28383o(parcel, 2, mo15149w());
        C7461a.m28392x(parcel, 3, mo15148v(), false);
        C7461a.m28383o(parcel, 4, mo15151x());
        C7461a.m28370b(parcel, a);
    }

    /* renamed from: x */
    public int mo15151x() {
        return this.f15308f;
    }

    SelectGlobalActionCardRequest(int i, String str, int i2) {
        this.f15306d = i;
        this.f15307e = str;
        this.f15308f = i2;
    }
}
