package com.google.android.gms.location;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.List;
import p118i7.C6614y;
import p195o6.C7461a;

public final class zzbx extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzbx> CREATOR = new C4543q();

    /* renamed from: d */
    private final List f13977d;

    /* renamed from: e */
    private final PendingIntent f13978e;

    /* renamed from: f */
    private final String f13979f;

    zzbx(List list, PendingIntent pendingIntent, String str) {
        C6614y yVar;
        if (list == null) {
            yVar = C6614y.m25989v();
        } else {
            yVar = C6614y.m25988r(list);
        }
        this.f13977d = yVar;
        this.f13978e = pendingIntent;
        this.f13979f = str;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C7461a.m28369a(parcel);
        C7461a.m28394z(parcel, 1, this.f13977d, false);
        C7461a.m28390v(parcel, 2, this.f13978e, i, false);
        C7461a.m28392x(parcel, 3, this.f13979f, false);
        C7461a.m28370b(parcel, a);
    }
}
