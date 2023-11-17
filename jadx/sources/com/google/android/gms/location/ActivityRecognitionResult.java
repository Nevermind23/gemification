package com.google.android.gms.location;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.lang.reflect.Array;
import java.util.List;
import p182n6.C7258g;
import p182n6.C7264i;
import p183n7.C7321m0;
import p195o6.C7461a;

public class ActivityRecognitionResult extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<ActivityRecognitionResult> CREATOR = new C7321m0();

    /* renamed from: d */
    List f13871d;

    /* renamed from: e */
    long f13872e;

    /* renamed from: f */
    long f13873f;

    /* renamed from: g */
    int f13874g;

    /* renamed from: h */
    Bundle f13875h;

    public ActivityRecognitionResult(List list, long j, long j2, int i, Bundle bundle) {
        boolean z;
        boolean z2 = true;
        if (list == null || list.size() <= 0) {
            z = false;
        } else {
            z = true;
        }
        C7264i.m27893b(z, "Must have at least 1 detected activity");
        C7264i.m27893b((j <= 0 || j2 <= 0) ? false : z2, "Must set times");
        this.f13871d = list;
        this.f13872e = j;
        this.f13873f = j2;
        this.f13874g = i;
        this.f13875h = bundle;
    }

    /* renamed from: v */
    private static boolean m17333v(Bundle bundle, Bundle bundle2) {
        int length;
        if (bundle == null) {
            if (bundle2 == null) {
                return true;
            }
            return false;
        } else if (bundle2 == null || bundle.size() != bundle2.size()) {
            return false;
        } else {
            for (String next : bundle.keySet()) {
                if (!bundle2.containsKey(next)) {
                    return false;
                }
                Object obj = bundle.get(next);
                Object obj2 = bundle2.get(next);
                if (obj == null) {
                    if (obj2 != null) {
                        return false;
                    }
                } else if (obj instanceof Bundle) {
                    if (!m17333v(bundle.getBundle(next), bundle2.getBundle(next))) {
                        return false;
                    }
                } else if (obj.getClass().isArray()) {
                    if (obj2 != null && obj2.getClass().isArray() && (length = Array.getLength(obj)) == Array.getLength(obj2)) {
                        int i = 0;
                        while (i < length) {
                            if (C7258g.m27880a(Array.get(obj, i), Array.get(obj2, i))) {
                                i++;
                            }
                        }
                        continue;
                    }
                    return false;
                } else if (!obj.equals(obj2)) {
                    return false;
                }
            }
            return true;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            ActivityRecognitionResult activityRecognitionResult = (ActivityRecognitionResult) obj;
            if (this.f13872e == activityRecognitionResult.f13872e && this.f13873f == activityRecognitionResult.f13873f && this.f13874g == activityRecognitionResult.f13874g && C7258g.m27880a(this.f13871d, activityRecognitionResult.f13871d) && m17333v(this.f13875h, activityRecognitionResult.f13875h)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return C7258g.m27881b(Long.valueOf(this.f13872e), Long.valueOf(this.f13873f), Integer.valueOf(this.f13874g), this.f13871d, this.f13875h);
    }

    public String toString() {
        String valueOf = String.valueOf(this.f13871d);
        long j = this.f13872e;
        long j2 = this.f13873f;
        StringBuilder sb = new StringBuilder(valueOf.length() + 124);
        sb.append("ActivityRecognitionResult [probableActivities=");
        sb.append(valueOf);
        sb.append(", timeMillis=");
        sb.append(j);
        sb.append(", elapsedRealtimeMillis=");
        sb.append(j2);
        sb.append("]");
        return sb.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        int a = C7461a.m28369a(parcel);
        C7461a.m28364C(parcel, 1, this.f13871d, false);
        C7461a.m28387s(parcel, 2, this.f13872e);
        C7461a.m28387s(parcel, 3, this.f13873f);
        C7461a.m28383o(parcel, 4, this.f13874g);
        C7461a.m28374f(parcel, 5, this.f13875h, false);
        C7461a.m28370b(parcel, a);
    }
}
