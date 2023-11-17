package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.HashSet;
import java.util.List;
import p182n6.C7258g;
import p195o6.C7461a;

public class UvmEntries extends AbstractSafeParcelable {
    public static final Parcelable.Creator<UvmEntries> CREATOR = new C4042k();

    /* renamed from: d */
    private final List f12984d;

    UvmEntries(List list) {
        this.f12984d = list;
    }

    public boolean equals(Object obj) {
        List list;
        if (!(obj instanceof UvmEntries)) {
            return false;
        }
        UvmEntries uvmEntries = (UvmEntries) obj;
        List list2 = this.f12984d;
        if ((list2 != null || uvmEntries.f12984d != null) && (list2 == null || (list = uvmEntries.f12984d) == null || !list2.containsAll(list) || !uvmEntries.f12984d.containsAll(this.f12984d))) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return C7258g.m27881b(new HashSet(this.f12984d));
    }

    /* renamed from: v */
    public List mo12579v() {
        return this.f12984d;
    }

    public void writeToParcel(Parcel parcel, int i) {
        int a = C7461a.m28369a(parcel);
        C7461a.m28364C(parcel, 1, mo12579v(), false);
        C7461a.m28370b(parcel, a);
    }
}
