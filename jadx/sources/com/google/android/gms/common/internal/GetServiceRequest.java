package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.C3966e;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

public class GetServiceRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<GetServiceRequest> CREATOR = new C3984v();

    /* renamed from: r */
    static final Scope[] f12614r = new Scope[0];

    /* renamed from: s */
    static final Feature[] f12615s = new Feature[0];

    /* renamed from: d */
    final int f12616d;

    /* renamed from: e */
    final int f12617e;

    /* renamed from: f */
    final int f12618f;

    /* renamed from: g */
    String f12619g;

    /* renamed from: h */
    IBinder f12620h;

    /* renamed from: i */
    Scope[] f12621i;

    /* renamed from: j */
    Bundle f12622j;

    /* renamed from: k */
    Account f12623k;

    /* renamed from: l */
    Feature[] f12624l;

    /* renamed from: m */
    Feature[] f12625m;

    /* renamed from: n */
    final boolean f12626n;

    /* renamed from: o */
    final int f12627o;

    /* renamed from: p */
    boolean f12628p;

    /* renamed from: q */
    private final String f12629q;

    GetServiceRequest(int i, int i2, int i3, String str, IBinder iBinder, Scope[] scopeArr, Bundle bundle, Account account, Feature[] featureArr, Feature[] featureArr2, boolean z, int i4, boolean z2, String str2) {
        Account account2;
        scopeArr = scopeArr == null ? f12614r : scopeArr;
        bundle = bundle == null ? new Bundle() : bundle;
        featureArr = featureArr == null ? f12615s : featureArr;
        featureArr2 = featureArr2 == null ? f12615s : featureArr2;
        this.f12616d = i;
        this.f12617e = i2;
        this.f12618f = i3;
        if ("com.google.android.gms".equals(str)) {
            this.f12619g = "com.google.android.gms";
        } else {
            this.f12619g = str;
        }
        if (i < 2) {
            if (iBinder != null) {
                account2 = C3956a.m15007y(C3966e.C3967a.m15089x(iBinder));
            } else {
                account2 = null;
            }
            this.f12623k = account2;
        } else {
            this.f12620h = iBinder;
            this.f12623k = account;
        }
        this.f12621i = scopeArr;
        this.f12622j = bundle;
        this.f12624l = featureArr;
        this.f12625m = featureArr2;
        this.f12626n = z;
        this.f12627o = i4;
        this.f12628p = z2;
        this.f12629q = str2;
    }

    /* renamed from: v */
    public final String mo12202v() {
        return this.f12629q;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C3984v.m15155a(this, parcel, i);
    }
}
