package com.google.android.gms.auth.api.identity;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import p182n6.C7258g;
import p182n6.C7264i;
import p195o6.C7461a;

public final class BeginSignInRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<BeginSignInRequest> CREATOR = new C3808a();

    /* renamed from: d */
    private final PasswordRequestOptions f12068d;

    /* renamed from: e */
    private final GoogleIdTokenRequestOptions f12069e;

    /* renamed from: f */
    private final String f12070f;

    /* renamed from: g */
    private final boolean f12071g;

    /* renamed from: h */
    private final int f12072h;

    /* renamed from: i */
    private final PasskeysRequestOptions f12073i;

    /* renamed from: j */
    private final PasskeyJsonRequestOptions f12074j;

    public static final class GoogleIdTokenRequestOptions extends AbstractSafeParcelable {
        public static final Parcelable.Creator<GoogleIdTokenRequestOptions> CREATOR = new C3811d();

        /* renamed from: d */
        private final boolean f12075d;

        /* renamed from: e */
        private final String f12076e;

        /* renamed from: f */
        private final String f12077f;

        /* renamed from: g */
        private final boolean f12078g;

        /* renamed from: h */
        private final String f12079h;

        /* renamed from: i */
        private final List f12080i;

        /* renamed from: j */
        private final boolean f12081j;

        GoogleIdTokenRequestOptions(boolean z, String str, String str2, boolean z2, String str3, List list, boolean z3) {
            boolean z4 = true;
            if (z2 && z3) {
                z4 = false;
            }
            C7264i.m27893b(z4, "filterByAuthorizedAccounts and requestVerifiedPhoneNumber must not both be true; the Verified Phone Number feature only works in sign-ups.");
            this.f12075d = z;
            if (z) {
                C7264i.m27903l(str, "serverClientId must be provided if Google ID tokens are requested");
            }
            this.f12076e = str;
            this.f12077f = str2;
            this.f12078g = z2;
            Parcelable.Creator<BeginSignInRequest> creator = BeginSignInRequest.CREATOR;
            ArrayList arrayList = null;
            if (list != null && !list.isEmpty()) {
                arrayList = new ArrayList(list);
                Collections.sort(arrayList);
            }
            this.f12080i = arrayList;
            this.f12079h = str3;
            this.f12081j = z3;
        }

        /* renamed from: R */
        public String mo11657R() {
            return this.f12077f;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof GoogleIdTokenRequestOptions)) {
                return false;
            }
            GoogleIdTokenRequestOptions googleIdTokenRequestOptions = (GoogleIdTokenRequestOptions) obj;
            if (this.f12075d != googleIdTokenRequestOptions.f12075d || !C7258g.m27880a(this.f12076e, googleIdTokenRequestOptions.f12076e) || !C7258g.m27880a(this.f12077f, googleIdTokenRequestOptions.f12077f) || this.f12078g != googleIdTokenRequestOptions.f12078g || !C7258g.m27880a(this.f12079h, googleIdTokenRequestOptions.f12079h) || !C7258g.m27880a(this.f12080i, googleIdTokenRequestOptions.f12080i) || this.f12081j != googleIdTokenRequestOptions.f12081j) {
                return false;
            }
            return true;
        }

        /* renamed from: f0 */
        public String mo11659f0() {
            return this.f12076e;
        }

        public int hashCode() {
            return C7258g.m27881b(Boolean.valueOf(this.f12075d), this.f12076e, this.f12077f, Boolean.valueOf(this.f12078g), this.f12079h, this.f12080i, Boolean.valueOf(this.f12081j));
        }

        /* renamed from: q0 */
        public boolean mo11661q0() {
            return this.f12075d;
        }

        /* renamed from: s0 */
        public boolean mo11662s0() {
            return this.f12081j;
        }

        /* renamed from: v */
        public boolean mo11663v() {
            return this.f12078g;
        }

        /* renamed from: w */
        public List mo11664w() {
            return this.f12080i;
        }

        public void writeToParcel(Parcel parcel, int i) {
            int a = C7461a.m28369a(parcel);
            C7461a.m28372d(parcel, 1, mo11661q0());
            C7461a.m28392x(parcel, 2, mo11659f0(), false);
            C7461a.m28392x(parcel, 3, mo11657R(), false);
            C7461a.m28372d(parcel, 4, mo11663v());
            C7461a.m28392x(parcel, 5, mo11666x(), false);
            C7461a.m28394z(parcel, 6, mo11664w(), false);
            C7461a.m28372d(parcel, 7, mo11662s0());
            C7461a.m28370b(parcel, a);
        }

        /* renamed from: x */
        public String mo11666x() {
            return this.f12079h;
        }
    }

    public static final class PasskeyJsonRequestOptions extends AbstractSafeParcelable {
        public static final Parcelable.Creator<PasskeyJsonRequestOptions> CREATOR = new C3812e();

        /* renamed from: d */
        private final boolean f12082d;

        /* renamed from: e */
        private final String f12083e;

        /* renamed from: com.google.android.gms.auth.api.identity.BeginSignInRequest$PasskeyJsonRequestOptions$a */
        public static final class C3806a {

            /* renamed from: a */
            private boolean f12084a = false;

            /* renamed from: b */
            private String f12085b;

            /* renamed from: a */
            public PasskeyJsonRequestOptions mo11672a() {
                return new PasskeyJsonRequestOptions(this.f12084a, this.f12085b);
            }

            /* renamed from: b */
            public C3806a mo11673b(boolean z) {
                this.f12084a = z;
                return this;
            }
        }

        PasskeyJsonRequestOptions(boolean z, String str) {
            if (z) {
                C7264i.m27902k(str);
            }
            this.f12082d = z;
            this.f12083e = str;
        }

        /* renamed from: v */
        public static C3806a m14344v() {
            return new C3806a();
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof PasskeyJsonRequestOptions)) {
                return false;
            }
            PasskeyJsonRequestOptions passkeyJsonRequestOptions = (PasskeyJsonRequestOptions) obj;
            if (this.f12082d != passkeyJsonRequestOptions.f12082d || !C7258g.m27880a(this.f12083e, passkeyJsonRequestOptions.f12083e)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return C7258g.m27881b(Boolean.valueOf(this.f12082d), this.f12083e);
        }

        /* renamed from: w */
        public String mo11669w() {
            return this.f12083e;
        }

        public void writeToParcel(Parcel parcel, int i) {
            int a = C7461a.m28369a(parcel);
            C7461a.m28372d(parcel, 1, mo11671x());
            C7461a.m28392x(parcel, 2, mo11669w(), false);
            C7461a.m28370b(parcel, a);
        }

        /* renamed from: x */
        public boolean mo11671x() {
            return this.f12082d;
        }
    }

    @Deprecated
    public static final class PasskeysRequestOptions extends AbstractSafeParcelable {
        public static final Parcelable.Creator<PasskeysRequestOptions> CREATOR = new C3813f();

        /* renamed from: d */
        private final boolean f12086d;

        /* renamed from: e */
        private final byte[] f12087e;

        /* renamed from: f */
        private final String f12088f;

        /* renamed from: com.google.android.gms.auth.api.identity.BeginSignInRequest$PasskeysRequestOptions$a */
        public static final class C3807a {

            /* renamed from: a */
            private boolean f12089a = false;

            /* renamed from: b */
            private byte[] f12090b;

            /* renamed from: c */
            private String f12091c;

            /* renamed from: a */
            public PasskeysRequestOptions mo11680a() {
                return new PasskeysRequestOptions(this.f12089a, this.f12090b, this.f12091c);
            }

            /* renamed from: b */
            public C3807a mo11681b(boolean z) {
                this.f12089a = z;
                return this;
            }
        }

        PasskeysRequestOptions(boolean z, byte[] bArr, String str) {
            if (z) {
                C7264i.m27902k(bArr);
                C7264i.m27902k(str);
            }
            this.f12086d = z;
            this.f12087e = bArr;
            this.f12088f = str;
        }

        /* renamed from: v */
        public static C3807a m14349v() {
            return new C3807a();
        }

        /* renamed from: R */
        public boolean mo11674R() {
            return this.f12086d;
        }

        public boolean equals(Object obj) {
            String str;
            String str2;
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof PasskeysRequestOptions)) {
                return false;
            }
            PasskeysRequestOptions passkeysRequestOptions = (PasskeysRequestOptions) obj;
            if (this.f12086d != passkeysRequestOptions.f12086d || !Arrays.equals(this.f12087e, passkeysRequestOptions.f12087e) || ((str = this.f12088f) != (str2 = passkeysRequestOptions.f12088f) && (str == null || !str.equals(str2)))) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return (Arrays.hashCode(new Object[]{Boolean.valueOf(this.f12086d), this.f12088f}) * 31) + Arrays.hashCode(this.f12087e);
        }

        /* renamed from: w */
        public byte[] mo11677w() {
            return this.f12087e;
        }

        public void writeToParcel(Parcel parcel, int i) {
            int a = C7461a.m28369a(parcel);
            C7461a.m28372d(parcel, 1, mo11674R());
            C7461a.m28376h(parcel, 2, mo11677w(), false);
            C7461a.m28392x(parcel, 3, mo11679x(), false);
            C7461a.m28370b(parcel, a);
        }

        /* renamed from: x */
        public String mo11679x() {
            return this.f12088f;
        }
    }

    public static final class PasswordRequestOptions extends AbstractSafeParcelable {
        public static final Parcelable.Creator<PasswordRequestOptions> CREATOR = new C3814g();

        /* renamed from: d */
        private final boolean f12092d;

        PasswordRequestOptions(boolean z) {
            this.f12092d = z;
        }

        public boolean equals(Object obj) {
            if ((obj instanceof PasswordRequestOptions) && this.f12092d == ((PasswordRequestOptions) obj).f12092d) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return C7258g.m27881b(Boolean.valueOf(this.f12092d));
        }

        /* renamed from: v */
        public boolean mo11684v() {
            return this.f12092d;
        }

        public void writeToParcel(Parcel parcel, int i) {
            int a = C7461a.m28369a(parcel);
            C7461a.m28372d(parcel, 1, mo11684v());
            C7461a.m28370b(parcel, a);
        }
    }

    BeginSignInRequest(PasswordRequestOptions passwordRequestOptions, GoogleIdTokenRequestOptions googleIdTokenRequestOptions, String str, boolean z, int i, PasskeysRequestOptions passkeysRequestOptions, PasskeyJsonRequestOptions passkeyJsonRequestOptions) {
        this.f12068d = (PasswordRequestOptions) C7264i.m27902k(passwordRequestOptions);
        this.f12069e = (GoogleIdTokenRequestOptions) C7264i.m27902k(googleIdTokenRequestOptions);
        this.f12070f = str;
        this.f12071g = z;
        this.f12072h = i;
        if (passkeysRequestOptions == null) {
            PasskeysRequestOptions.C3807a v = PasskeysRequestOptions.m14349v();
            v.mo11681b(false);
            passkeysRequestOptions = v.mo11680a();
        }
        this.f12073i = passkeysRequestOptions;
        if (passkeyJsonRequestOptions == null) {
            PasskeyJsonRequestOptions.C3806a v2 = PasskeyJsonRequestOptions.m14344v();
            v2.mo11673b(false);
            passkeyJsonRequestOptions = v2.mo11672a();
        }
        this.f12074j = passkeyJsonRequestOptions;
    }

    /* renamed from: R */
    public PasswordRequestOptions mo11649R() {
        return this.f12068d;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof BeginSignInRequest)) {
            return false;
        }
        BeginSignInRequest beginSignInRequest = (BeginSignInRequest) obj;
        if (!C7258g.m27880a(this.f12068d, beginSignInRequest.f12068d) || !C7258g.m27880a(this.f12069e, beginSignInRequest.f12069e) || !C7258g.m27880a(this.f12073i, beginSignInRequest.f12073i) || !C7258g.m27880a(this.f12074j, beginSignInRequest.f12074j) || !C7258g.m27880a(this.f12070f, beginSignInRequest.f12070f) || this.f12071g != beginSignInRequest.f12071g || this.f12072h != beginSignInRequest.f12072h) {
            return false;
        }
        return true;
    }

    /* renamed from: f0 */
    public boolean mo11651f0() {
        return this.f12071g;
    }

    public int hashCode() {
        return C7258g.m27881b(this.f12068d, this.f12069e, this.f12073i, this.f12074j, this.f12070f, Boolean.valueOf(this.f12071g));
    }

    /* renamed from: v */
    public GoogleIdTokenRequestOptions mo11653v() {
        return this.f12069e;
    }

    /* renamed from: w */
    public PasskeyJsonRequestOptions mo11654w() {
        return this.f12074j;
    }

    public void writeToParcel(Parcel parcel, int i) {
        int a = C7461a.m28369a(parcel);
        C7461a.m28390v(parcel, 1, mo11649R(), i, false);
        C7461a.m28390v(parcel, 2, mo11653v(), i, false);
        C7461a.m28392x(parcel, 3, this.f12070f, false);
        C7461a.m28372d(parcel, 4, mo11651f0());
        C7461a.m28383o(parcel, 5, this.f12072h);
        C7461a.m28390v(parcel, 6, mo11656x(), i, false);
        C7461a.m28390v(parcel, 7, mo11654w(), i, false);
        C7461a.m28370b(parcel, a);
    }

    /* renamed from: x */
    public PasskeysRequestOptions mo11656x() {
        return this.f12073i;
    }
}
