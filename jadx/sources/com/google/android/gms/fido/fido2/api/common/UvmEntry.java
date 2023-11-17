package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import p182n6.C7258g;
import p195o6.C7461a;

public class UvmEntry extends AbstractSafeParcelable {
    public static final Parcelable.Creator<UvmEntry> CREATOR = new C4044m();

    /* renamed from: d */
    private final int f12985d;

    /* renamed from: e */
    private final short f12986e;

    /* renamed from: f */
    private final short f12987f;

    UvmEntry(int i, short s, short s2) {
        this.f12985d = i;
        this.f12986e = s;
        this.f12987f = s2;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof UvmEntry)) {
            return false;
        }
        UvmEntry uvmEntry = (UvmEntry) obj;
        if (this.f12985d == uvmEntry.f12985d && this.f12986e == uvmEntry.f12986e && this.f12987f == uvmEntry.f12987f) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return C7258g.m27881b(Integer.valueOf(this.f12985d), Short.valueOf(this.f12986e), Short.valueOf(this.f12987f));
    }

    /* renamed from: v */
    public short mo12583v() {
        return this.f12986e;
    }

    /* renamed from: w */
    public short mo12584w() {
        return this.f12987f;
    }

    public void writeToParcel(Parcel parcel, int i) {
        int a = C7461a.m28369a(parcel);
        C7461a.m28383o(parcel, 1, mo12586x());
        C7461a.m28391w(parcel, 2, mo12583v());
        C7461a.m28391w(parcel, 3, mo12584w());
        C7461a.m28370b(parcel, a);
    }

    /* renamed from: x */
    public int mo12586x() {
        return this.f12985d;
    }
}
