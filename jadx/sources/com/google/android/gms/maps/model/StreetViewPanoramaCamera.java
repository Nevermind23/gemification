package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.github.mikephil.charting.utils.Utils;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.maps.model.StreetViewPanoramaOrientation;
import p182n6.C7258g;
import p182n6.C7264i;
import p195o6.C7461a;
import p222q7.C7909n;

public class StreetViewPanoramaCamera extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<StreetViewPanoramaCamera> CREATOR = new C7909n();

    /* renamed from: d */
    public final float f14125d;

    /* renamed from: e */
    public final float f14126e;

    /* renamed from: f */
    public final float f14127f;

    /* renamed from: g */
    private final StreetViewPanoramaOrientation f14128g;

    public StreetViewPanoramaCamera(float f, float f2, float f3) {
        float f4;
        boolean z = false;
        if (f2 >= -90.0f && f2 <= 90.0f) {
            z = true;
        }
        C7264i.m27893b(z, "Tilt needs to be between -90 and 90 inclusive: " + f2);
        this.f14125d = ((double) f) <= Utils.DOUBLE_EPSILON ? 0.0f : f;
        this.f14126e = Utils.FLOAT_EPSILON + f2;
        if (((double) f3) <= Utils.DOUBLE_EPSILON) {
            f4 = (f3 % 360.0f) + 360.0f;
        } else {
            f4 = f3;
        }
        this.f14127f = f4 % 360.0f;
        StreetViewPanoramaOrientation.C4557a aVar = new StreetViewPanoramaOrientation.C4557a();
        aVar.mo14206c(f2);
        aVar.mo14204a(f3);
        this.f14128g = aVar.mo14205b();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StreetViewPanoramaCamera)) {
            return false;
        }
        StreetViewPanoramaCamera streetViewPanoramaCamera = (StreetViewPanoramaCamera) obj;
        if (Float.floatToIntBits(this.f14125d) == Float.floatToIntBits(streetViewPanoramaCamera.f14125d) && Float.floatToIntBits(this.f14126e) == Float.floatToIntBits(streetViewPanoramaCamera.f14126e) && Float.floatToIntBits(this.f14127f) == Float.floatToIntBits(streetViewPanoramaCamera.f14127f)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return C7258g.m27881b(Float.valueOf(this.f14125d), Float.valueOf(this.f14126e), Float.valueOf(this.f14127f));
    }

    public String toString() {
        return C7258g.m27882c(this).mo21632a("zoom", Float.valueOf(this.f14125d)).mo21632a("tilt", Float.valueOf(this.f14126e)).mo21632a("bearing", Float.valueOf(this.f14127f)).toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        int a = C7461a.m28369a(parcel);
        C7461a.m28380l(parcel, 2, this.f14125d);
        C7461a.m28380l(parcel, 3, this.f14126e);
        C7461a.m28380l(parcel, 4, this.f14127f);
        C7461a.m28370b(parcel, a);
    }
}
