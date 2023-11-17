package com.google.android.gms.maps.model;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import p195o6.C7461a;
import p222q7.C7896a;
import p299w6.C8859b;

public class StampStyle extends AbstractSafeParcelable {
    public static final Parcelable.Creator<StampStyle> CREATOR = new C4567i();

    /* renamed from: d */
    protected final C7896a f14124d;

    StampStyle(IBinder iBinder) {
        this.f14124d = new C7896a(C8859b.C8860a.m32974x(iBinder));
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C7461a.m28369a(parcel);
        C7461a.m28382n(parcel, 2, this.f14124d.mo22867a().asBinder(), false);
        C7461a.m28370b(parcel, a);
    }
}
