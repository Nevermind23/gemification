package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.List;
import p182n6.C7258g;
import p182n6.C7264i;
import p183n7.C7317k0;
import p195o6.C7461a;

public class SleepSegmentRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<SleepSegmentRequest> CREATOR = new C7317k0();

    /* renamed from: d */
    private final List f13956d;

    /* renamed from: e */
    private final int f13957e;

    public SleepSegmentRequest(List list, int i) {
        this.f13956d = list;
        this.f13957e = i;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SleepSegmentRequest)) {
            return false;
        }
        SleepSegmentRequest sleepSegmentRequest = (SleepSegmentRequest) obj;
        if (!C7258g.m27880a(this.f13956d, sleepSegmentRequest.f13956d) || this.f13957e != sleepSegmentRequest.f13957e) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return C7258g.m27881b(this.f13956d, Integer.valueOf(this.f13957e));
    }

    /* renamed from: v */
    public int mo13977v() {
        return this.f13957e;
    }

    public void writeToParcel(Parcel parcel, int i) {
        C7264i.m27902k(parcel);
        int a = C7461a.m28369a(parcel);
        C7461a.m28364C(parcel, 1, this.f13956d, false);
        C7461a.m28383o(parcel, 2, mo13977v());
        C7461a.m28370b(parcel, a);
    }
}
