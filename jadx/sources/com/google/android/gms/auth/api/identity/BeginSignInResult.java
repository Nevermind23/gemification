package com.google.android.gms.auth.api.identity;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import p037c6.C2265a;
import p182n6.C7264i;
import p195o6.C7461a;

public final class BeginSignInResult extends AbstractSafeParcelable {
    public static final Parcelable.Creator<BeginSignInResult> CREATOR = new C2265a();

    /* renamed from: d */
    private final PendingIntent f12093d;

    public BeginSignInResult(PendingIntent pendingIntent) {
        this.f12093d = (PendingIntent) C7264i.m27902k(pendingIntent);
    }

    /* renamed from: v */
    public PendingIntent mo11686v() {
        return this.f12093d;
    }

    public void writeToParcel(Parcel parcel, int i) {
        int a = C7461a.m28369a(parcel);
        C7461a.m28390v(parcel, 1, mo11686v(), i, false);
        C7461a.m28370b(parcel, a);
    }
}
