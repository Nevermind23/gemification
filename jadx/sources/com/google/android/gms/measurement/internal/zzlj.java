package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import p182n6.C7264i;

public final class zzlj extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzlj> CREATOR = new C4752p9();

    /* renamed from: d */
    public final int f15107d;

    /* renamed from: e */
    public final String f15108e;

    /* renamed from: f */
    public final long f15109f;

    /* renamed from: g */
    public final Long f15110g;

    /* renamed from: h */
    public final String f15111h;

    /* renamed from: i */
    public final String f15112i;

    /* renamed from: j */
    public final Double f15113j;

    zzlj(int i, String str, long j, Long l, Float f, String str2, String str3, Double d) {
        this.f15107d = i;
        this.f15108e = str;
        this.f15109f = j;
        this.f15110g = l;
        if (i == 1) {
            this.f15113j = f != null ? Double.valueOf(f.doubleValue()) : null;
        } else {
            this.f15113j = d;
        }
        this.f15111h = str2;
        this.f15112i = str3;
    }

    /* renamed from: v */
    public final Object mo14994v() {
        Long l = this.f15110g;
        if (l != null) {
            return l;
        }
        Double d = this.f15113j;
        if (d != null) {
            return d;
        }
        String str = this.f15111h;
        if (str != null) {
            return str;
        }
        return null;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C4752p9.m18174a(this, parcel, i);
    }

    zzlj(C4763q9 q9Var) {
        this(q9Var.f14804c, q9Var.f14805d, q9Var.f14806e, q9Var.f14803b);
    }

    zzlj(String str, long j, Object obj, String str2) {
        C7264i.m27898g(str);
        this.f15107d = 2;
        this.f15108e = str;
        this.f15109f = j;
        this.f15112i = str2;
        if (obj == null) {
            this.f15110g = null;
            this.f15113j = null;
            this.f15111h = null;
        } else if (obj instanceof Long) {
            this.f15110g = (Long) obj;
            this.f15113j = null;
            this.f15111h = null;
        } else if (obj instanceof String) {
            this.f15110g = null;
            this.f15113j = null;
            this.f15111h = (String) obj;
        } else if (obj instanceof Double) {
            this.f15110g = null;
            this.f15113j = (Double) obj;
            this.f15111h = null;
        } else {
            throw new IllegalArgumentException("User attribute given of un-supported type");
        }
    }
}
