package com.google.android.gms.tapandpay.issuer;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import p195o6.C7461a;

public class ViewTokenRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<ViewTokenRequest> CREATOR = new C4897j();

    /* renamed from: d */
    final String f15371d;

    /* renamed from: e */
    final int f15372e;

    /* renamed from: com.google.android.gms.tapandpay.issuer.ViewTokenRequest$a */
    public static class C4887a {

        /* renamed from: a */
        private String f15373a;

        /* renamed from: b */
        private int f15374b;

        /* renamed from: a */
        public ViewTokenRequest mo15195a() {
            return new ViewTokenRequest(this.f15373a, this.f15374b);
        }

        /* renamed from: b */
        public C4887a mo15196b(String str) {
            this.f15373a = str;
            return this;
        }

        /* renamed from: c */
        public C4887a mo15197c(int i) {
            this.f15374b = i;
            return this;
        }
    }

    ViewTokenRequest(String str, int i) {
        this.f15371d = str;
        this.f15372e = i;
    }

    public void writeToParcel(Parcel parcel, int i) {
        int a = C7461a.m28369a(parcel);
        C7461a.m28392x(parcel, 1, this.f15371d, false);
        C7461a.m28383o(parcel, 2, this.f15372e);
        C7461a.m28370b(parcel, a);
    }
}
