package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.github.mikephil.charting.utils.Utils;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import p182n6.C7258g;
import p182n6.C7264i;
import p195o6.C7461a;
import p222q7.C7902g;

public final class CameraPosition extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<CameraPosition> CREATOR = new C7902g();

    /* renamed from: d */
    public final LatLng f14036d;

    /* renamed from: e */
    public final float f14037e;

    /* renamed from: f */
    public final float f14038f;

    /* renamed from: g */
    public final float f14039g;

    /* renamed from: com.google.android.gms.maps.model.CameraPosition$a */
    public static final class C4555a {

        /* renamed from: a */
        private LatLng f14040a;

        /* renamed from: b */
        private float f14041b;

        /* renamed from: c */
        private float f14042c;

        /* renamed from: d */
        private float f14043d;

        /* renamed from: a */
        public C4555a mo14089a(float f) {
            this.f14043d = f;
            return this;
        }

        /* renamed from: b */
        public CameraPosition mo14090b() {
            return new CameraPosition(this.f14040a, this.f14041b, this.f14042c, this.f14043d);
        }

        /* renamed from: c */
        public C4555a mo14091c(LatLng latLng) {
            this.f14040a = (LatLng) C7264i.m27903l(latLng, "location must not be null.");
            return this;
        }

        /* renamed from: d */
        public C4555a mo14092d(float f) {
            this.f14042c = f;
            return this;
        }

        /* renamed from: e */
        public C4555a mo14093e(float f) {
            this.f14041b = f;
            return this;
        }
    }

    public CameraPosition(LatLng latLng, float f, float f2, float f3) {
        boolean z;
        C7264i.m27903l(latLng, "camera target must not be null.");
        if (f2 < Utils.FLOAT_EPSILON || f2 > 90.0f) {
            z = false;
        } else {
            z = true;
        }
        C7264i.m27894c(z, "Tilt needs to be between 0 and 90 inclusive: %s", Float.valueOf(f2));
        this.f14036d = latLng;
        this.f14037e = f;
        this.f14038f = f2 + Utils.FLOAT_EPSILON;
        this.f14039g = (((double) f3) <= Utils.DOUBLE_EPSILON ? (f3 % 360.0f) + 360.0f : f3) % 360.0f;
    }

    /* renamed from: v */
    public static C4555a m17444v() {
        return new C4555a();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CameraPosition)) {
            return false;
        }
        CameraPosition cameraPosition = (CameraPosition) obj;
        if (this.f14036d.equals(cameraPosition.f14036d) && Float.floatToIntBits(this.f14037e) == Float.floatToIntBits(cameraPosition.f14037e) && Float.floatToIntBits(this.f14038f) == Float.floatToIntBits(cameraPosition.f14038f) && Float.floatToIntBits(this.f14039g) == Float.floatToIntBits(cameraPosition.f14039g)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return C7258g.m27881b(this.f14036d, Float.valueOf(this.f14037e), Float.valueOf(this.f14038f), Float.valueOf(this.f14039g));
    }

    public String toString() {
        return C7258g.m27882c(this).mo21632a("target", this.f14036d).mo21632a("zoom", Float.valueOf(this.f14037e)).mo21632a("tilt", Float.valueOf(this.f14038f)).mo21632a("bearing", Float.valueOf(this.f14039g)).toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        int a = C7461a.m28369a(parcel);
        C7461a.m28390v(parcel, 2, this.f14036d, i, false);
        C7461a.m28380l(parcel, 3, this.f14037e);
        C7461a.m28380l(parcel, 4, this.f14038f);
        C7461a.m28380l(parcel, 5, this.f14039g);
        C7461a.m28370b(parcel, a);
    }
}
