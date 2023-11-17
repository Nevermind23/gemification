package com.google.android.gms.tapandpay.issuer;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import p195o6.C7461a;

public class PushTokenizeRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<PushTokenizeRequest> CREATOR = new C4892e();

    /* renamed from: d */
    final int f15317d;

    /* renamed from: e */
    final int f15318e;

    /* renamed from: f */
    final byte[] f15319f;

    /* renamed from: g */
    final String f15320g;

    /* renamed from: h */
    final String f15321h;

    /* renamed from: i */
    final UserAddress f15322i;

    /* renamed from: j */
    final boolean f15323j;

    /* renamed from: com.google.android.gms.tapandpay.issuer.PushTokenizeRequest$a */
    public static class C4885a {

        /* renamed from: a */
        private int f15324a;

        /* renamed from: b */
        private int f15325b;

        /* renamed from: c */
        private byte[] f15326c;

        /* renamed from: d */
        private String f15327d;

        /* renamed from: e */
        private String f15328e;

        /* renamed from: f */
        private UserAddress f15329f;

        /* renamed from: g */
        private boolean f15330g;

        /* renamed from: a */
        public PushTokenizeRequest mo15168a() {
            return new PushTokenizeRequest(this.f15324a, this.f15325b, this.f15326c, this.f15327d, this.f15328e, this.f15329f, this.f15330g);
        }

        /* renamed from: b */
        public C4885a mo15169b(String str) {
            this.f15328e = str;
            return this;
        }

        /* renamed from: c */
        public C4885a mo15170c(String str) {
            this.f15327d = str;
            return this;
        }

        /* renamed from: d */
        public C4885a mo15171d(int i) {
            this.f15324a = i;
            return this;
        }

        /* renamed from: e */
        public C4885a mo15172e(byte[] bArr) {
            this.f15326c = bArr;
            return this;
        }

        /* renamed from: f */
        public C4885a mo15173f(int i) {
            this.f15325b = i;
            return this;
        }

        /* renamed from: g */
        public C4885a mo15174g(UserAddress userAddress) {
            this.f15329f = userAddress;
            return this;
        }
    }

    PushTokenizeRequest(int i, int i2, byte[] bArr, String str, String str2, UserAddress userAddress, boolean z) {
        this.f15317d = i;
        this.f15318e = i2;
        this.f15319f = bArr;
        this.f15320g = str;
        this.f15321h = str2;
        this.f15322i = userAddress;
        this.f15323j = z;
    }

    public void writeToParcel(Parcel parcel, int i) {
        int a = C7461a.m28369a(parcel);
        C7461a.m28383o(parcel, 2, this.f15317d);
        C7461a.m28383o(parcel, 3, this.f15318e);
        C7461a.m28376h(parcel, 4, this.f15319f, false);
        C7461a.m28392x(parcel, 5, this.f15320g, false);
        C7461a.m28392x(parcel, 6, this.f15321h, false);
        C7461a.m28390v(parcel, 7, this.f15322i, i, false);
        C7461a.m28372d(parcel, 8, this.f15323j);
        C7461a.m28370b(parcel, a);
    }
}
