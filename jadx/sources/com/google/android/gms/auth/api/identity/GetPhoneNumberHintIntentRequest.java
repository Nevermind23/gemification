package com.google.android.gms.auth.api.identity;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import p182n6.C7258g;
import p195o6.C7461a;

public class GetPhoneNumberHintIntentRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<GetPhoneNumberHintIntentRequest> CREATOR = new C3809b();

    /* renamed from: d */
    private final int f12094d;

    GetPhoneNumberHintIntentRequest(int i) {
        this.f12094d = i;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof GetPhoneNumberHintIntentRequest)) {
            return false;
        }
        return C7258g.m27880a(Integer.valueOf(this.f12094d), Integer.valueOf(((GetPhoneNumberHintIntentRequest) obj).f12094d));
    }

    public int hashCode() {
        return C7258g.m27881b(Integer.valueOf(this.f12094d));
    }

    public void writeToParcel(Parcel parcel, int i) {
        int a = C7461a.m28369a(parcel);
        C7461a.m28383o(parcel, 1, this.f12094d);
        C7461a.m28370b(parcel, a);
    }
}
