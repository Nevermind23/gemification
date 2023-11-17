package com.google.android.gms.tapandpay.globalactions;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;
import p182n6.C7258g;
import p195o6.C7461a;

public final class GetGlobalActionCardsResponse extends AbstractSafeParcelable {
    public static final Parcelable.Creator<GetGlobalActionCardsResponse> CREATOR = new C4882b();

    /* renamed from: d */
    private GlobalActionCard[] f15296d;

    /* renamed from: e */
    private int f15297e;

    private GetGlobalActionCardsResponse() {
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof GetGlobalActionCardsResponse) {
            GetGlobalActionCardsResponse getGlobalActionCardsResponse = (GetGlobalActionCardsResponse) obj;
            if (!Arrays.equals(this.f15296d, getGlobalActionCardsResponse.f15296d) || !C7258g.m27880a(Integer.valueOf(this.f15297e), Integer.valueOf(getGlobalActionCardsResponse.f15297e))) {
                return false;
            }
            return true;
        }
        return false;
    }

    public int hashCode() {
        return C7258g.m27881b(Integer.valueOf(Arrays.hashCode(this.f15296d)), Integer.valueOf(this.f15297e));
    }

    /* renamed from: v */
    public GlobalActionCard[] mo15132v() {
        return this.f15296d;
    }

    /* renamed from: w */
    public int mo15133w() {
        return this.f15297e;
    }

    public void writeToParcel(Parcel parcel, int i) {
        int a = C7461a.m28369a(parcel);
        C7461a.m28363B(parcel, 1, mo15132v(), i, false);
        C7461a.m28383o(parcel, 2, mo15133w());
        C7461a.m28370b(parcel, a);
    }

    GetGlobalActionCardsResponse(GlobalActionCard[] globalActionCardArr, int i) {
        this.f15296d = globalActionCardArr;
        this.f15297e = i;
    }
}
