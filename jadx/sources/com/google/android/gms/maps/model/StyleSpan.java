package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.github.mikephil.charting.utils.Utils;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import p195o6.C7461a;
import p222q7.C7914s;

public final class StyleSpan extends AbstractSafeParcelable {
    public static final Parcelable.Creator<StyleSpan> CREATOR = new C7914s();

    /* renamed from: d */
    private final StrokeStyle f14151d;

    /* renamed from: e */
    private final double f14152e;

    public StyleSpan(StrokeStyle strokeStyle, double d) {
        if (d > Utils.DOUBLE_EPSILON) {
            this.f14151d = strokeStyle;
            this.f14152e = d;
            return;
        }
        throw new IllegalArgumentException("A style must be applied to some segments on a polyline.");
    }

    /* renamed from: v */
    public double mo14219v() {
        return this.f14152e;
    }

    /* renamed from: w */
    public StrokeStyle mo14220w() {
        return this.f14151d;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C7461a.m28369a(parcel);
        C7461a.m28390v(parcel, 2, mo14220w(), i, false);
        C7461a.m28378j(parcel, 3, mo14219v());
        C7461a.m28370b(parcel, a);
    }
}
