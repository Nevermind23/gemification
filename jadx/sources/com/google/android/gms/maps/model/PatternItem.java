package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.github.mikephil.charting.utils.Utils;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import p182n6.C7258g;
import p182n6.C7264i;
import p195o6.C7461a;
import p222q7.C7907l;

public class PatternItem extends AbstractSafeParcelable {
    public static final Parcelable.Creator<PatternItem> CREATOR = new C7907l();

    /* renamed from: d */
    private final int f14096d;

    /* renamed from: e */
    private final Float f14097e;

    public PatternItem(int i, Float f) {
        boolean z = true;
        if (i != 1 && (f == null || f.floatValue() < Utils.FLOAT_EPSILON)) {
            z = false;
        }
        C7264i.m27893b(z, "Invalid PatternItem: type=" + i + " length=" + f);
        this.f14096d = i;
        this.f14097e = f;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PatternItem)) {
            return false;
        }
        PatternItem patternItem = (PatternItem) obj;
        if (this.f14096d != patternItem.f14096d || !C7258g.m27880a(this.f14097e, patternItem.f14097e)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return C7258g.m27881b(Integer.valueOf(this.f14096d), this.f14097e);
    }

    public String toString() {
        int i = this.f14096d;
        Float f = this.f14097e;
        return "[PatternItem: type=" + i + " length=" + f + "]";
    }

    public void writeToParcel(Parcel parcel, int i) {
        int a = C7461a.m28369a(parcel);
        C7461a.m28383o(parcel, 2, this.f14096d);
        C7461a.m28381m(parcel, 3, this.f14097e, false);
        C7461a.m28370b(parcel, a);
    }
}
