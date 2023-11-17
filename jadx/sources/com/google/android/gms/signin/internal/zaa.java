package com.google.android.gms.signin.internal;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import p143k6.C6823e;
import p195o6.C7461a;

public final class zaa extends AbstractSafeParcelable implements C6823e {
    public static final Parcelable.Creator<zaa> CREATOR = new C4864b();

    /* renamed from: d */
    final int f15145d;

    /* renamed from: e */
    private int f15146e;

    /* renamed from: f */
    private Intent f15147f;

    public zaa() {
        this(2, 0, (Intent) null);
    }

    public final Status getStatus() {
        if (this.f15146e == 0) {
            return Status.f12252j;
        }
        return Status.f12256n;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C7461a.m28369a(parcel);
        C7461a.m28383o(parcel, 1, this.f15145d);
        C7461a.m28383o(parcel, 2, this.f15146e);
        C7461a.m28390v(parcel, 3, this.f15147f, i, false);
        C7461a.m28370b(parcel, a);
    }

    zaa(int i, int i2, Intent intent) {
        this.f15145d = i;
        this.f15146e = i2;
        this.f15147f = intent;
    }
}
