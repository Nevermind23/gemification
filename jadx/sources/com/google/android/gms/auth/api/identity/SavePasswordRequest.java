package com.google.android.gms.auth.api.identity;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import p182n6.C7258g;
import p182n6.C7264i;
import p195o6.C7461a;

public class SavePasswordRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<SavePasswordRequest> CREATOR = new C3816i();

    /* renamed from: d */
    private final SignInPassword f12108d;

    /* renamed from: e */
    private final String f12109e;

    /* renamed from: f */
    private final int f12110f;

    SavePasswordRequest(SignInPassword signInPassword, String str, int i) {
        this.f12108d = (SignInPassword) C7264i.m27902k(signInPassword);
        this.f12109e = str;
        this.f12110f = i;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof SavePasswordRequest)) {
            return false;
        }
        SavePasswordRequest savePasswordRequest = (SavePasswordRequest) obj;
        if (!C7258g.m27880a(this.f12108d, savePasswordRequest.f12108d) || !C7258g.m27880a(this.f12109e, savePasswordRequest.f12109e) || this.f12110f != savePasswordRequest.f12110f) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return C7258g.m27881b(this.f12108d, this.f12109e);
    }

    /* renamed from: v */
    public SignInPassword mo11711v() {
        return this.f12108d;
    }

    public void writeToParcel(Parcel parcel, int i) {
        int a = C7461a.m28369a(parcel);
        C7461a.m28390v(parcel, 1, mo11711v(), i, false);
        C7461a.m28392x(parcel, 2, this.f12109e, false);
        C7461a.m28383o(parcel, 3, this.f12110f);
        C7461a.m28370b(parcel, a);
    }
}
