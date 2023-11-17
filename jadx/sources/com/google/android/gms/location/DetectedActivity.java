package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Comparator;
import p182n6.C7258g;
import p182n6.C7264i;
import p183n7.C7329q0;
import p195o6.C7461a;

public class DetectedActivity extends AbstractSafeParcelable {
    public static final Parcelable.Creator<DetectedActivity> CREATOR = new C7329q0();

    /* renamed from: f */
    public static final Comparator f13894f = new C4548v();

    /* renamed from: d */
    int f13895d;

    /* renamed from: e */
    int f13896e;

    public DetectedActivity(int i, int i2) {
        this.f13895d = i;
        this.f13896e = i2;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof DetectedActivity) {
            DetectedActivity detectedActivity = (DetectedActivity) obj;
            if (this.f13895d == detectedActivity.f13895d && this.f13896e == detectedActivity.f13896e) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return C7258g.m27881b(Integer.valueOf(this.f13895d), Integer.valueOf(this.f13896e));
    }

    public String toString() {
        String str;
        int w = mo13913w();
        if (w == 0) {
            str = "IN_VEHICLE";
        } else if (w == 1) {
            str = "ON_BICYCLE";
        } else if (w == 2) {
            str = "ON_FOOT";
        } else if (w == 3) {
            str = "STILL";
        } else if (w == 4) {
            str = "UNKNOWN";
        } else if (w == 5) {
            str = "TILTING";
        } else if (w == 7) {
            str = "WALKING";
        } else if (w == 8) {
            str = "RUNNING";
        } else if (w == 16) {
            str = "IN_ROAD_VEHICLE";
        } else if (w != 17) {
            str = Integer.toString(w);
        } else {
            str = "IN_RAIL_VEHICLE";
        }
        int i = this.f13896e;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 48);
        sb.append("DetectedActivity [type=");
        sb.append(str);
        sb.append(", confidence=");
        sb.append(i);
        sb.append("]");
        return sb.toString();
    }

    /* renamed from: v */
    public int mo13912v() {
        return this.f13896e;
    }

    /* renamed from: w */
    public int mo13913w() {
        int i = this.f13895d;
        if (i > 22 || i < 0) {
            return 4;
        }
        return i;
    }

    public void writeToParcel(Parcel parcel, int i) {
        C7264i.m27902k(parcel);
        int a = C7461a.m28369a(parcel);
        C7461a.m28383o(parcel, 1, this.f13895d);
        C7461a.m28383o(parcel, 2, this.f13896e);
        C7461a.m28370b(parcel, a);
    }
}
