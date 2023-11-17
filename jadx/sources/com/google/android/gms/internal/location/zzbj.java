package com.google.android.gms.internal.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.github.mikephil.charting.utils.Utils;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Locale;
import p118i7.C6603n;
import p183n7.C7297b;
import p195o6.C7461a;

public final class zzbj extends AbstractSafeParcelable implements C7297b {
    public static final Parcelable.Creator<zzbj> CREATOR = new C6603n();

    /* renamed from: d */
    private final String f13117d;

    /* renamed from: e */
    private final long f13118e;

    /* renamed from: f */
    private final short f13119f;

    /* renamed from: g */
    private final double f13120g;

    /* renamed from: h */
    private final double f13121h;

    /* renamed from: i */
    private final float f13122i;

    /* renamed from: j */
    private final int f13123j;

    /* renamed from: k */
    private final int f13124k;

    /* renamed from: l */
    private final int f13125l;

    public zzbj(String str, int i, short s, double d, double d2, float f, long j, int i2, int i3) {
        String str2;
        if (str == null || str.length() > 100) {
            String valueOf = String.valueOf(str);
            if (valueOf.length() != 0) {
                str2 = "requestId is null or too long: ".concat(valueOf);
            } else {
                str2 = new String("requestId is null or too long: ");
            }
            throw new IllegalArgumentException(str2);
        } else if (f <= Utils.FLOAT_EPSILON) {
            StringBuilder sb = new StringBuilder(31);
            sb.append("invalid radius: ");
            sb.append(f);
            throw new IllegalArgumentException(sb.toString());
        } else if (d > 90.0d || d < -90.0d) {
            StringBuilder sb2 = new StringBuilder(42);
            sb2.append("invalid latitude: ");
            sb2.append(d);
            throw new IllegalArgumentException(sb2.toString());
        } else if (d2 > 180.0d || d2 < -180.0d) {
            StringBuilder sb3 = new StringBuilder(43);
            sb3.append("invalid longitude: ");
            sb3.append(d2);
            throw new IllegalArgumentException(sb3.toString());
        } else {
            int i4 = i & 7;
            if (i4 != 0) {
                this.f13119f = s;
                this.f13117d = str;
                this.f13120g = d;
                this.f13121h = d2;
                this.f13122i = f;
                this.f13118e = j;
                this.f13123j = i4;
                this.f13124k = i2;
                this.f13125l = i3;
                return;
            }
            StringBuilder sb4 = new StringBuilder(46);
            sb4.append("No supported transition specified: ");
            sb4.append(i);
            throw new IllegalArgumentException(sb4.toString());
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zzbj) {
            zzbj zzbj = (zzbj) obj;
            if (this.f13122i == zzbj.f13122i && this.f13120g == zzbj.f13120g && this.f13121h == zzbj.f13121h && this.f13119f == zzbj.f13119f) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        long doubleToLongBits = Double.doubleToLongBits(this.f13120g);
        long doubleToLongBits2 = Double.doubleToLongBits(this.f13121h);
        return ((((((((((int) (doubleToLongBits ^ (doubleToLongBits >>> 32))) + 31) * 31) + ((int) (doubleToLongBits2 ^ (doubleToLongBits2 >>> 32)))) * 31) + Float.floatToIntBits(this.f13122i)) * 31) + this.f13119f) * 31) + this.f13123j;
    }

    /* renamed from: k */
    public final String mo12826k() {
        return this.f13117d;
    }

    public final String toString() {
        String str;
        Locale locale = Locale.US;
        Object[] objArr = new Object[9];
        short s = this.f13119f;
        if (s == -1) {
            str = "INVALID";
        } else if (s != 1) {
            str = "UNKNOWN";
        } else {
            str = "CIRCLE";
        }
        objArr[0] = str;
        objArr[1] = this.f13117d.replaceAll("\\p{C}", "?");
        objArr[2] = Integer.valueOf(this.f13123j);
        objArr[3] = Double.valueOf(this.f13120g);
        objArr[4] = Double.valueOf(this.f13121h);
        objArr[5] = Float.valueOf(this.f13122i);
        objArr[6] = Integer.valueOf(this.f13124k / 1000);
        objArr[7] = Integer.valueOf(this.f13125l);
        objArr[8] = Long.valueOf(this.f13118e);
        return String.format(locale, "Geofence[%s id:%s transitions:%d %.6f, %.6f %.0fm, resp=%ds, dwell=%dms, @%d]", objArr);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C7461a.m28369a(parcel);
        C7461a.m28392x(parcel, 1, this.f13117d, false);
        C7461a.m28387s(parcel, 2, this.f13118e);
        C7461a.m28391w(parcel, 3, this.f13119f);
        C7461a.m28378j(parcel, 4, this.f13120g);
        C7461a.m28378j(parcel, 5, this.f13121h);
        C7461a.m28380l(parcel, 6, this.f13122i);
        C7461a.m28383o(parcel, 7, this.f13123j);
        C7461a.m28383o(parcel, 8, this.f13124k);
        C7461a.m28383o(parcel, 9, this.f13125l);
        C7461a.m28370b(parcel, a);
    }
}
