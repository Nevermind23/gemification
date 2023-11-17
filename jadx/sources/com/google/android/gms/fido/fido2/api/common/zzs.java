package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.HashSet;
import java.util.List;
import p182n6.C7258g;
import p182n6.C7264i;
import p195o6.C7461a;
import p324y6.C9080q;

public final class zzs extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzs> CREATOR = new C9080q();

    /* renamed from: d */
    private final List f13005d;

    public zzs(List list) {
        this.f13005d = (List) C7264i.m27902k(list);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzs)) {
            return false;
        }
        zzs zzs = (zzs) obj;
        if (!this.f13005d.containsAll(zzs.f13005d) || !zzs.f13005d.containsAll(this.f13005d)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return C7258g.m27881b(new HashSet(this.f13005d));
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C7461a.m28369a(parcel);
        C7461a.m28364C(parcel, 1, this.f13005d, false);
        C7461a.m28370b(parcel, a);
    }
}
