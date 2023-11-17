package com.google.android.gms.internal.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import p118i7.C6588b;
import p143k6.C6823e;
import p195o6.C7461a;

public final class zzaa extends AbstractSafeParcelable implements C6823e {
    public static final Parcelable.Creator<zzaa> CREATOR = new C6588b();

    /* renamed from: e */
    public static final zzaa f13096e = new zzaa(Status.f12252j);

    /* renamed from: d */
    private final Status f13097d;

    public zzaa(Status status) {
        this.f13097d = status;
    }

    public final Status getStatus() {
        return this.f13097d;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C7461a.m28369a(parcel);
        C7461a.m28390v(parcel, 1, this.f13097d, i, false);
        C7461a.m28370b(parcel, a);
    }
}
