package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.github.mikephil.charting.utils.Utils;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import p182n6.C7258g;
import p182n6.C7264i;
import p195o6.C7461a;
import p222q7.C7912q;

public class StreetViewPanoramaOrientation extends AbstractSafeParcelable {
    public static final Parcelable.Creator<StreetViewPanoramaOrientation> CREATOR = new C7912q();

    /* renamed from: d */
    public final float f14134d;

    /* renamed from: e */
    public final float f14135e;

    /* renamed from: com.google.android.gms.maps.model.StreetViewPanoramaOrientation$a */
    public static final class C4557a {

        /* renamed from: a */
        public float f14136a;

        /* renamed from: b */
        public float f14137b;

        /* renamed from: a */
        public C4557a mo14204a(float f) {
            this.f14136a = f;
            return this;
        }

        /* renamed from: b */
        public StreetViewPanoramaOrientation mo14205b() {
            return new StreetViewPanoramaOrientation(this.f14137b, this.f14136a);
        }

        /* renamed from: c */
        public C4557a mo14206c(float f) {
            this.f14137b = f;
            return this;
        }
    }

    public StreetViewPanoramaOrientation(float f, float f2) {
        boolean z = false;
        if (f >= -90.0f && f <= 90.0f) {
            z = true;
        }
        C7264i.m27893b(z, "Tilt needs to be between -90 and 90 inclusive: " + f);
        this.f14134d = f + Utils.FLOAT_EPSILON;
        this.f14135e = (((double) f2) <= Utils.DOUBLE_EPSILON ? (f2 % 360.0f) + 360.0f : f2) % 360.0f;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StreetViewPanoramaOrientation)) {
            return false;
        }
        StreetViewPanoramaOrientation streetViewPanoramaOrientation = (StreetViewPanoramaOrientation) obj;
        if (Float.floatToIntBits(this.f14134d) == Float.floatToIntBits(streetViewPanoramaOrientation.f14134d) && Float.floatToIntBits(this.f14135e) == Float.floatToIntBits(streetViewPanoramaOrientation.f14135e)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return C7258g.m27881b(Float.valueOf(this.f14134d), Float.valueOf(this.f14135e));
    }

    public String toString() {
        return C7258g.m27882c(this).mo21632a("tilt", Float.valueOf(this.f14134d)).mo21632a("bearing", Float.valueOf(this.f14135e)).toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        int a = C7461a.m28369a(parcel);
        C7461a.m28380l(parcel, 2, this.f14134d);
        C7461a.m28380l(parcel, 3, this.f14135e);
        C7461a.m28370b(parcel, a);
    }
}
