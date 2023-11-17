package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import p182n6.C7258g;
import p182n6.C7277o;
import p195o6.C7461a;

public class ClientIdentity extends AbstractSafeParcelable {
    public static final Parcelable.Creator<ClientIdentity> CREATOR = new C7277o();

    /* renamed from: d */
    public final int f12604d;

    /* renamed from: e */
    public final String f12605e;

    public ClientIdentity(int i, String str) {
        this.f12604d = i;
        this.f12605e = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ClientIdentity)) {
            return false;
        }
        ClientIdentity clientIdentity = (ClientIdentity) obj;
        if (clientIdentity.f12604d != this.f12604d || !C7258g.m27880a(clientIdentity.f12605e, this.f12605e)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.f12604d;
    }

    public final String toString() {
        int i = this.f12604d;
        String str = this.f12605e;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 12);
        sb.append(i);
        sb.append(":");
        sb.append(str);
        return sb.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C7461a.m28369a(parcel);
        C7461a.m28383o(parcel, 1, this.f12604d);
        C7461a.m28392x(parcel, 2, this.f12605e, false);
        C7461a.m28370b(parcel, a);
    }
}
