package com.google.android.gms.signin.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.List;
import p143k6.C6823e;
import p195o6.C7461a;
import p287v7.C8712d;

public final class zag extends AbstractSafeParcelable implements C6823e {
    public static final Parcelable.Creator<zag> CREATOR = new C8712d();

    /* renamed from: d */
    private final List f15148d;

    /* renamed from: e */
    private final String f15149e;

    public zag(List list, String str) {
        this.f15148d = list;
        this.f15149e = str;
    }

    public final Status getStatus() {
        if (this.f15149e != null) {
            return Status.f12252j;
        }
        return Status.f12256n;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C7461a.m28369a(parcel);
        C7461a.m28394z(parcel, 1, this.f15148d, false);
        C7461a.m28392x(parcel, 2, this.f15149e, false);
        C7461a.m28370b(parcel, a);
    }
}
