package com.google.android.gms.auth.api.identity;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import p182n6.C7258g;
import p182n6.C7264i;
import p195o6.C7461a;

public class GetSignInIntentRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<GetSignInIntentRequest> CREATOR = new C3810c();

    /* renamed from: d */
    private final String f12095d;

    /* renamed from: e */
    private final String f12096e;

    /* renamed from: f */
    private final String f12097f;

    /* renamed from: g */
    private final String f12098g;

    /* renamed from: h */
    private final boolean f12099h;

    /* renamed from: i */
    private final int f12100i;

    GetSignInIntentRequest(String str, String str2, String str3, String str4, boolean z, int i) {
        C7264i.m27902k(str);
        this.f12095d = str;
        this.f12096e = str2;
        this.f12097f = str3;
        this.f12098g = str4;
        this.f12099h = z;
        this.f12100i = i;
    }

    /* renamed from: R */
    public boolean mo11691R() {
        return this.f12099h;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof GetSignInIntentRequest)) {
            return false;
        }
        GetSignInIntentRequest getSignInIntentRequest = (GetSignInIntentRequest) obj;
        if (!C7258g.m27880a(this.f12095d, getSignInIntentRequest.f12095d) || !C7258g.m27880a(this.f12098g, getSignInIntentRequest.f12098g) || !C7258g.m27880a(this.f12096e, getSignInIntentRequest.f12096e) || !C7258g.m27880a(Boolean.valueOf(this.f12099h), Boolean.valueOf(getSignInIntentRequest.f12099h)) || this.f12100i != getSignInIntentRequest.f12100i) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return C7258g.m27881b(this.f12095d, this.f12096e, this.f12098g, Boolean.valueOf(this.f12099h), Integer.valueOf(this.f12100i));
    }

    /* renamed from: v */
    public String mo11694v() {
        return this.f12096e;
    }

    /* renamed from: w */
    public String mo11695w() {
        return this.f12098g;
    }

    public void writeToParcel(Parcel parcel, int i) {
        int a = C7461a.m28369a(parcel);
        C7461a.m28392x(parcel, 1, mo11697x(), false);
        C7461a.m28392x(parcel, 2, mo11694v(), false);
        C7461a.m28392x(parcel, 3, this.f12097f, false);
        C7461a.m28392x(parcel, 4, mo11695w(), false);
        C7461a.m28372d(parcel, 5, mo11691R());
        C7461a.m28383o(parcel, 6, this.f12100i);
        C7461a.m28370b(parcel, a);
    }

    /* renamed from: x */
    public String mo11697x() {
        return this.f12095d;
    }
}
