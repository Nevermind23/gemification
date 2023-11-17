package com.google.firebase.dynamiclinks.internal;

import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

public class DynamicLinkData extends AbstractSafeParcelable {
    public static final Parcelable.Creator<DynamicLinkData> CREATOR = new C5267a();

    /* renamed from: d */
    private String f16868d;

    /* renamed from: e */
    private String f16869e;

    /* renamed from: f */
    private int f16870f;

    /* renamed from: g */
    private long f16871g;

    /* renamed from: h */
    private Bundle f16872h;

    /* renamed from: i */
    private Uri f16873i;

    public DynamicLinkData(String str, String str2, int i, long j, Bundle bundle, Uri uri) {
        this.f16868d = str;
        this.f16869e = str2;
        this.f16870f = i;
        this.f16871g = j;
        this.f16872h = bundle;
        this.f16873i = uri;
    }

    /* renamed from: R */
    public Bundle mo17451R() {
        Bundle bundle = this.f16872h;
        return bundle == null ? new Bundle() : bundle;
    }

    /* renamed from: f0 */
    public int mo17452f0() {
        return this.f16870f;
    }

    /* renamed from: q0 */
    public Uri mo17453q0() {
        return this.f16873i;
    }

    /* renamed from: s0 */
    public void mo17454s0(long j) {
        this.f16871g = j;
    }

    /* renamed from: v */
    public long mo17455v() {
        return this.f16871g;
    }

    /* renamed from: w */
    public String mo17456w() {
        return this.f16869e;
    }

    public void writeToParcel(Parcel parcel, int i) {
        C5267a.m20788c(this, parcel, i);
    }

    /* renamed from: x */
    public String mo17458x() {
        return this.f16868d;
    }
}
