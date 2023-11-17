package com.google.firebase.dynamiclinks.internal;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.ArrayList;
import java.util.List;

public final class ShortDynamicLinkImpl extends AbstractSafeParcelable {
    public static final Parcelable.Creator<ShortDynamicLinkImpl> CREATOR = new C5268b();

    /* renamed from: d */
    private final Uri f16874d;

    /* renamed from: e */
    private final Uri f16875e;

    /* renamed from: f */
    private final List f16876f;

    public static class WarningImpl extends AbstractSafeParcelable {
        public static final Parcelable.Creator<WarningImpl> CREATOR = new C5269c();

        /* renamed from: d */
        private final String f16877d;

        public WarningImpl(String str) {
            this.f16877d = str;
        }

        /* renamed from: v */
        public String mo17463v() {
            return this.f16877d;
        }

        public void writeToParcel(Parcel parcel, int i) {
            C5269c.m20794c(this, parcel, i);
        }
    }

    public ShortDynamicLinkImpl(Uri uri, Uri uri2, List list) {
        this.f16874d = uri;
        this.f16875e = uri2;
        this.f16876f = list == null ? new ArrayList() : list;
    }

    /* renamed from: v */
    public Uri mo17459v() {
        return this.f16875e;
    }

    /* renamed from: w */
    public Uri mo17460w() {
        return this.f16874d;
    }

    public void writeToParcel(Parcel parcel, int i) {
        C5268b.m20791c(this, parcel, i);
    }

    /* renamed from: x */
    public List mo17462x() {
        return this.f16876f;
    }
}
