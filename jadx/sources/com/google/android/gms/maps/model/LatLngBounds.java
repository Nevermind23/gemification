package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import p182n6.C7258g;
import p182n6.C7264i;
import p195o6.C7461a;
import p222q7.C7904i;

public final class LatLngBounds extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<LatLngBounds> CREATOR = new C7904i();

    /* renamed from: d */
    public final LatLng f14075d;

    /* renamed from: e */
    public final LatLng f14076e;

    /* renamed from: com.google.android.gms.maps.model.LatLngBounds$a */
    public static final class C4556a {

        /* renamed from: a */
        private double f14077a = Double.POSITIVE_INFINITY;

        /* renamed from: b */
        private double f14078b = Double.NEGATIVE_INFINITY;

        /* renamed from: c */
        private double f14079c = Double.NaN;

        /* renamed from: d */
        private double f14080d = Double.NaN;

        /* renamed from: a */
        public LatLngBounds mo14134a() {
            C7264i.m27906o(!Double.isNaN(this.f14079c), "no included points");
            return new LatLngBounds(new LatLng(this.f14077a, this.f14079c), new LatLng(this.f14078b, this.f14080d));
        }

        /* renamed from: b */
        public C4556a mo14135b(LatLng latLng) {
            C7264i.m27903l(latLng, "point must not be null");
            this.f14077a = Math.min(this.f14077a, latLng.f14073d);
            this.f14078b = Math.max(this.f14078b, latLng.f14073d);
            double d = latLng.f14074e;
            if (Double.isNaN(this.f14079c)) {
                this.f14079c = d;
                this.f14080d = d;
            } else {
                double d2 = this.f14079c;
                double d3 = this.f14080d;
                if (d2 > d3 ? !(d2 <= d || d <= d3) : !(d2 <= d && d <= d3)) {
                    Parcelable.Creator<LatLngBounds> creator = LatLngBounds.CREATOR;
                    if (((d2 - d) + 360.0d) % 360.0d < ((d - d3) + 360.0d) % 360.0d) {
                        this.f14079c = d;
                    } else {
                        this.f14080d = d;
                    }
                }
            }
            return this;
        }
    }

    public LatLngBounds(LatLng latLng, LatLng latLng2) {
        boolean z;
        C7264i.m27903l(latLng, "southwest must not be null.");
        C7264i.m27903l(latLng2, "northeast must not be null.");
        double d = latLng2.f14073d;
        double d2 = latLng.f14073d;
        if (d >= d2) {
            z = true;
        } else {
            z = false;
        }
        C7264i.m27894c(z, "southern latitude exceeds northern latitude (%s > %s)", Double.valueOf(d2), Double.valueOf(latLng2.f14073d));
        this.f14075d = latLng;
        this.f14076e = latLng2;
    }

    /* renamed from: v */
    public static C4556a m17475v() {
        return new C4556a();
    }

    /* renamed from: x */
    private final boolean m17476x(double d) {
        double d2 = this.f14075d.f14074e;
        double d3 = this.f14076e.f14074e;
        int i = (d2 > d3 ? 1 : (d2 == d3 ? 0 : -1));
        int i2 = (d2 > d ? 1 : (d2 == d ? 0 : -1));
        return i <= 0 ? i2 <= 0 && d <= d3 : i2 <= 0 || d <= d3;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LatLngBounds)) {
            return false;
        }
        LatLngBounds latLngBounds = (LatLngBounds) obj;
        if (!this.f14075d.equals(latLngBounds.f14075d) || !this.f14076e.equals(latLngBounds.f14076e)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return C7258g.m27881b(this.f14075d, this.f14076e);
    }

    public String toString() {
        return C7258g.m27882c(this).mo21632a("southwest", this.f14075d).mo21632a("northeast", this.f14076e).toString();
    }

    /* renamed from: w */
    public boolean mo14132w(LatLng latLng) {
        LatLng latLng2 = (LatLng) C7264i.m27903l(latLng, "point must not be null.");
        double d = latLng2.f14073d;
        if (this.f14075d.f14073d > d || d > this.f14076e.f14073d || !m17476x(latLng2.f14074e)) {
            return false;
        }
        return true;
    }

    public void writeToParcel(Parcel parcel, int i) {
        int a = C7461a.m28369a(parcel);
        C7461a.m28390v(parcel, 2, this.f14075d, i, false);
        C7461a.m28390v(parcel, 3, this.f14076e, i, false);
        C7461a.m28370b(parcel, a);
    }
}
