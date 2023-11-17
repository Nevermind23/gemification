package com.google.android.gms.tapandpay.issuer;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import p195o6.C7461a;

public final class UserAddress extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<UserAddress> CREATOR = new C4896i();

    /* renamed from: d */
    String f15348d;

    /* renamed from: e */
    String f15349e;

    /* renamed from: f */
    String f15350f;

    /* renamed from: g */
    String f15351g;

    /* renamed from: h */
    String f15352h;

    /* renamed from: i */
    String f15353i;

    /* renamed from: j */
    String f15354j;

    /* renamed from: k */
    String f15355k;

    /* renamed from: l */
    String f15356l;

    /* renamed from: m */
    String f15357m;

    /* renamed from: n */
    String f15358n;

    /* renamed from: o */
    String f15359o;

    /* renamed from: p */
    boolean f15360p;

    /* renamed from: q */
    String f15361q;

    /* renamed from: r */
    String f15362r;

    /* renamed from: com.google.android.gms.tapandpay.issuer.UserAddress$a */
    public static class C4886a {

        /* renamed from: a */
        private String f15363a;

        /* renamed from: b */
        private String f15364b;

        /* renamed from: c */
        private String f15365c;

        /* renamed from: d */
        private String f15366d;

        /* renamed from: e */
        private String f15367e;

        /* renamed from: f */
        private String f15368f;

        /* renamed from: g */
        private String f15369g;

        /* renamed from: h */
        private String f15370h;

        /* renamed from: a */
        public UserAddress mo15186a() {
            return new UserAddress(this.f15363a, this.f15364b, this.f15365c, (String) null, (String) null, (String) null, this.f15366d, this.f15367e, this.f15368f, this.f15369g, (String) null, this.f15370h, false, (String) null, (String) null);
        }

        /* renamed from: b */
        public C4886a mo15187b(String str) {
            this.f15364b = str;
            return this;
        }

        /* renamed from: c */
        public C4886a mo15188c(String str) {
            this.f15366d = str;
            return this;
        }

        /* renamed from: d */
        public C4886a mo15189d(String str) {
            this.f15368f = str;
            return this;
        }

        /* renamed from: e */
        public C4886a mo15190e(String str) {
            this.f15367e = str;
            return this;
        }

        /* renamed from: f */
        public C4886a mo15191f(String str) {
            this.f15363a = str;
            return this;
        }

        /* renamed from: g */
        public C4886a mo15192g(String str) {
            this.f15370h = str;
            return this;
        }

        /* renamed from: h */
        public C4886a mo15193h(String str) {
            this.f15369g = str;
            return this;
        }
    }

    UserAddress() {
    }

    /* renamed from: v */
    public static C4886a m18518v() {
        return new C4886a();
    }

    public void writeToParcel(Parcel parcel, int i) {
        int a = C7461a.m28369a(parcel);
        C7461a.m28392x(parcel, 2, this.f15348d, false);
        C7461a.m28392x(parcel, 3, this.f15349e, false);
        C7461a.m28392x(parcel, 4, this.f15350f, false);
        C7461a.m28392x(parcel, 5, this.f15351g, false);
        C7461a.m28392x(parcel, 6, this.f15352h, false);
        C7461a.m28392x(parcel, 7, this.f15353i, false);
        C7461a.m28392x(parcel, 8, this.f15354j, false);
        C7461a.m28392x(parcel, 9, this.f15355k, false);
        C7461a.m28392x(parcel, 10, this.f15356l, false);
        C7461a.m28392x(parcel, 11, this.f15357m, false);
        C7461a.m28392x(parcel, 12, this.f15358n, false);
        C7461a.m28392x(parcel, 13, this.f15359o, false);
        C7461a.m28372d(parcel, 14, this.f15360p);
        C7461a.m28392x(parcel, 15, this.f15361q, false);
        C7461a.m28392x(parcel, 16, this.f15362r, false);
        C7461a.m28370b(parcel, a);
    }

    UserAddress(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, boolean z, String str13, String str14) {
        this.f15348d = str;
        this.f15349e = str2;
        this.f15350f = str3;
        this.f15351g = str4;
        this.f15352h = str5;
        this.f15353i = str6;
        this.f15354j = str7;
        this.f15355k = str8;
        this.f15356l = str9;
        this.f15357m = str10;
        this.f15358n = str11;
        this.f15359o = str12;
        this.f15360p = z;
        this.f15361q = str13;
        this.f15362r = str14;
    }
}
