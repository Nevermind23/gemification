package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import p182n6.C7264i;

public final class zzaw extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzaw> CREATOR = new C4786t();

    /* renamed from: d */
    public final String f15103d;

    /* renamed from: e */
    public final zzau f15104e;

    /* renamed from: f */
    public final String f15105f;

    /* renamed from: g */
    public final long f15106g;

    zzaw(zzaw zzaw, long j) {
        C7264i.m27902k(zzaw);
        this.f15103d = zzaw.f15103d;
        this.f15104e = zzaw.f15104e;
        this.f15105f = zzaw.f15105f;
        this.f15106g = j;
    }

    public final String toString() {
        String str = this.f15105f;
        String str2 = this.f15103d;
        String valueOf = String.valueOf(this.f15104e);
        return "origin=" + str + ",name=" + str2 + ",params=" + valueOf;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C4786t.m18284a(this, parcel, i);
    }

    public zzaw(String str, zzau zzau, String str2, long j) {
        this.f15103d = str;
        this.f15104e = zzau;
        this.f15105f = str2;
        this.f15106g = j;
    }
}
