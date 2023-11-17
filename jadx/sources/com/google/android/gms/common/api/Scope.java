package com.google.android.gms.common.api;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import p182n6.C7264i;
import p195o6.C7461a;

public final class Scope extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<Scope> CREATOR = new C3864d();

    /* renamed from: d */
    final int f12249d;

    /* renamed from: e */
    private final String f12250e;

    Scope(int i, String str) {
        C7264i.m27899h(str, "scopeUri must not be null or empty");
        this.f12249d = i;
        this.f12250e = str;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Scope)) {
            return false;
        }
        return this.f12250e.equals(((Scope) obj).f12250e);
    }

    public int hashCode() {
        return this.f12250e.hashCode();
    }

    public String toString() {
        return this.f12250e;
    }

    /* renamed from: v */
    public String mo11897v() {
        return this.f12250e;
    }

    public void writeToParcel(Parcel parcel, int i) {
        int a = C7461a.m28369a(parcel);
        C7461a.m28383o(parcel, 1, this.f12249d);
        C7461a.m28392x(parcel, 2, mo11897v(), false);
        C7461a.m28370b(parcel, a);
    }

    public Scope(String str) {
        this(1, str);
    }
}
