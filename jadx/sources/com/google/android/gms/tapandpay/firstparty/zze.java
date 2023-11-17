package com.google.android.gms.tapandpay.firstparty;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import p182n6.C7258g;
import p195o6.C7461a;

public final class zze extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zze> CREATOR = new C4878k();

    /* renamed from: d */
    final long f15271d;

    /* renamed from: e */
    final String f15272e;

    /* renamed from: f */
    final String f15273f;

    /* renamed from: g */
    final String f15274g;

    /* renamed from: h */
    final String f15275h;

    zze(long j, String str, String str2, String str3, String str4) {
        this.f15271d = j;
        this.f15272e = str;
        this.f15273f = str2;
        this.f15274g = str3;
        this.f15275h = str4;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof zze) {
            zze zze = (zze) obj;
            if (!C7258g.m27880a(Long.valueOf(this.f15271d), Long.valueOf(zze.f15271d)) || !C7258g.m27880a(this.f15272e, zze.f15272e) || !C7258g.m27880a(this.f15273f, zze.f15273f) || !C7258g.m27880a(this.f15274g, zze.f15274g) || !C7258g.m27880a(this.f15275h, zze.f15275h)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return C7258g.m27881b(Long.valueOf(this.f15271d), this.f15272e, this.f15273f, this.f15274g, this.f15275h);
    }

    public final String toString() {
        return C7258g.m27882c(this).mo21632a("expirationTimestamp", Long.valueOf(this.f15271d)).mo21632a("websiteUrl", this.f15272e).mo21632a("websiteRedirectText", this.f15273f).mo21632a("legalDisclaimer", this.f15274g).mo21632a("summary", this.f15275h).toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C7461a.m28369a(parcel);
        C7461a.m28387s(parcel, 1, this.f15271d);
        C7461a.m28392x(parcel, 2, this.f15272e, false);
        C7461a.m28392x(parcel, 3, this.f15273f, false);
        C7461a.m28392x(parcel, 4, this.f15274g, false);
        C7461a.m28392x(parcel, 5, this.f15275h, false);
        C7461a.m28370b(parcel, a);
    }
}
