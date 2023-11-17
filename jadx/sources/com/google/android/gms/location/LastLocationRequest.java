package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import p118i7.C6605p;
import p182n6.C7258g;
import p183n7.C7333t;
import p195o6.C7461a;

public final class LastLocationRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<LastLocationRequest> CREATOR = new C4537k();

    /* renamed from: d */
    private final long f13904d;

    /* renamed from: e */
    private final int f13905e;

    /* renamed from: f */
    private final boolean f13906f;

    /* renamed from: com.google.android.gms.location.LastLocationRequest$a */
    public static class C4525a {

        /* renamed from: a */
        private long f13907a = Long.MAX_VALUE;

        /* renamed from: b */
        private int f13908b = 0;

        /* renamed from: c */
        private boolean f13909c = false;

        /* renamed from: a */
        public LastLocationRequest mo13928a() {
            return new LastLocationRequest(this.f13907a, this.f13908b, this.f13909c);
        }
    }

    LastLocationRequest(long j, int i, boolean z) {
        this.f13904d = j;
        this.f13905e = i;
        this.f13906f = z;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof LastLocationRequest)) {
            return false;
        }
        LastLocationRequest lastLocationRequest = (LastLocationRequest) obj;
        if (this.f13904d == lastLocationRequest.f13904d && this.f13905e == lastLocationRequest.f13905e && this.f13906f == lastLocationRequest.f13906f) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return C7258g.m27881b(Long.valueOf(this.f13904d), Integer.valueOf(this.f13905e), Boolean.valueOf(this.f13906f));
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("LastLocationRequest[");
        if (this.f13904d != Long.MAX_VALUE) {
            sb.append("maxAge=");
            C6605p.m25967a(this.f13904d, sb);
        }
        if (this.f13905e != 0) {
            sb.append(", ");
            sb.append(C7333t.m27986a(this.f13905e));
        }
        if (this.f13906f) {
            sb.append(", bypass");
        }
        sb.append(']');
        return sb.toString();
    }

    /* renamed from: v */
    public int mo13925v() {
        return this.f13905e;
    }

    /* renamed from: w */
    public long mo13926w() {
        return this.f13904d;
    }

    public void writeToParcel(Parcel parcel, int i) {
        int a = C7461a.m28369a(parcel);
        C7461a.m28387s(parcel, 1, mo13926w());
        C7461a.m28383o(parcel, 2, mo13925v());
        C7461a.m28372d(parcel, 3, this.f13906f);
        C7461a.m28370b(parcel, a);
    }
}
