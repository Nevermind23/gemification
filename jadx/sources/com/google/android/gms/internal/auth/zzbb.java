package com.google.android.gms.internal.auth;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import p182n6.C7264i;
import p195o6.C7461a;

public final class zzbb extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzbb> CREATOR = new C4071e();

    /* renamed from: d */
    final int f13081d = 1;

    /* renamed from: e */
    public final String f13082e;

    /* renamed from: f */
    public final PendingIntent f13083f;

    zzbb(int i, String str, PendingIntent pendingIntent) {
        this.f13082e = (String) C7264i.m27902k(str);
        this.f13083f = (PendingIntent) C7264i.m27902k(pendingIntent);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C7461a.m28369a(parcel);
        C7461a.m28383o(parcel, 1, this.f13081d);
        C7461a.m28392x(parcel, 2, this.f13082e, false);
        C7461a.m28390v(parcel, 3, this.f13083f, i, false);
        C7461a.m28370b(parcel, a);
    }
}
