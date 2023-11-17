package com.google.android.gms.common;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import p130j6.C6735k;
import p182n6.C7258g;
import p195o6.C7461a;

public class Feature extends AbstractSafeParcelable {
    public static final Parcelable.Creator<Feature> CREATOR = new C6735k();

    /* renamed from: d */
    private final String f12235d;

    /* renamed from: e */
    private final int f12236e;

    /* renamed from: f */
    private final long f12237f;

    public Feature(String str, int i, long j) {
        this.f12235d = str;
        this.f12236e = i;
        this.f12237f = j;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof Feature) {
            Feature feature = (Feature) obj;
            if (((mo11865v() == null || !mo11865v().equals(feature.mo11865v())) && (mo11865v() != null || feature.mo11865v() != null)) || mo11866w() != feature.mo11866w()) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return C7258g.m27881b(mo11865v(), Long.valueOf(mo11866w()));
    }

    public final String toString() {
        C7258g.C7259a c = C7258g.m27882c(this);
        c.mo21632a("name", mo11865v());
        c.mo21632a("version", Long.valueOf(mo11866w()));
        return c.toString();
    }

    /* renamed from: v */
    public String mo11865v() {
        return this.f12235d;
    }

    /* renamed from: w */
    public long mo11866w() {
        long j = this.f12237f;
        return j == -1 ? (long) this.f12236e : j;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C7461a.m28369a(parcel);
        C7461a.m28392x(parcel, 1, mo11865v(), false);
        C7461a.m28383o(parcel, 2, this.f12236e);
        C7461a.m28387s(parcel, 3, mo11866w());
        C7461a.m28370b(parcel, a);
    }

    public Feature(String str, long j) {
        this.f12235d = str;
        this.f12237f = j;
        this.f12236e = -1;
    }
}
