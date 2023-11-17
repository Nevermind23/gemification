package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.salesforce.marketingcloud.storage.p385db.C11755a;
import java.util.Iterator;
import p195o6.C7461a;

public final class zzau extends AbstractSafeParcelable implements Iterable<String> {
    public static final Parcelable.Creator<zzau> CREATOR = new C4775s();
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final Bundle f15102d;

    zzau(Bundle bundle) {
        this.f15102d = bundle;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: R */
    public final Double mo14983R(String str) {
        return Double.valueOf(this.f15102d.getDouble(C11755a.C11756a.f34100b));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f0 */
    public final Long mo14984f0(String str) {
        return Long.valueOf(this.f15102d.getLong(C11755a.C11756a.f34100b));
    }

    public final Iterator iterator() {
        return new C4764r(this);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: q0 */
    public final Object mo14986q0(String str) {
        return this.f15102d.get(str);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: s0 */
    public final String mo14987s0(String str) {
        return this.f15102d.getString(str);
    }

    public final String toString() {
        return this.f15102d.toString();
    }

    /* renamed from: v */
    public final int mo14989v() {
        return this.f15102d.size();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C7461a.m28369a(parcel);
        C7461a.m28374f(parcel, 2, mo14991x(), false);
        C7461a.m28370b(parcel, a);
    }

    /* renamed from: x */
    public final Bundle mo14991x() {
        return new Bundle(this.f15102d);
    }
}
