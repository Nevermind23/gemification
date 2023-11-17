package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.List;
import p182n6.C7258g;
import p182n6.C7264i;
import p195o6.C7461a;

public class PublicKeyCredentialRequestOptions extends RequestOptions {
    public static final Parcelable.Creator<PublicKeyCredentialRequestOptions> CREATOR = new C4036e();

    /* renamed from: d */
    private final byte[] f12950d;

    /* renamed from: e */
    private final Double f12951e;

    /* renamed from: f */
    private final String f12952f;

    /* renamed from: g */
    private final List f12953g;

    /* renamed from: h */
    private final Integer f12954h;

    /* renamed from: i */
    private final TokenBinding f12955i;

    /* renamed from: j */
    private final zzay f12956j;

    /* renamed from: k */
    private final AuthenticationExtensions f12957k;

    /* renamed from: l */
    private final Long f12958l;

    PublicKeyCredentialRequestOptions(byte[] bArr, Double d, String str, List list, Integer num, TokenBinding tokenBinding, String str2, AuthenticationExtensions authenticationExtensions, Long l) {
        this.f12950d = (byte[]) C7264i.m27902k(bArr);
        this.f12951e = d;
        this.f12952f = (String) C7264i.m27902k(str);
        this.f12953g = list;
        this.f12954h = num;
        this.f12955i = tokenBinding;
        this.f12958l = l;
        if (str2 != null) {
            try {
                this.f12956j = zzay.m15381a(str2);
            } catch (zzax e) {
                throw new IllegalArgumentException(e);
            }
        } else {
            this.f12956j = null;
        }
        this.f12957k = authenticationExtensions;
    }

    /* renamed from: R */
    public Integer mo12536R() {
        return this.f12954h;
    }

    public boolean equals(Object obj) {
        List list;
        List list2;
        if (!(obj instanceof PublicKeyCredentialRequestOptions)) {
            return false;
        }
        PublicKeyCredentialRequestOptions publicKeyCredentialRequestOptions = (PublicKeyCredentialRequestOptions) obj;
        if (!Arrays.equals(this.f12950d, publicKeyCredentialRequestOptions.f12950d) || !C7258g.m27880a(this.f12951e, publicKeyCredentialRequestOptions.f12951e) || !C7258g.m27880a(this.f12952f, publicKeyCredentialRequestOptions.f12952f) || ((((list = this.f12953g) != null || publicKeyCredentialRequestOptions.f12953g != null) && (list == null || (list2 = publicKeyCredentialRequestOptions.f12953g) == null || !list.containsAll(list2) || !publicKeyCredentialRequestOptions.f12953g.containsAll(this.f12953g))) || !C7258g.m27880a(this.f12954h, publicKeyCredentialRequestOptions.f12954h) || !C7258g.m27880a(this.f12955i, publicKeyCredentialRequestOptions.f12955i) || !C7258g.m27880a(this.f12956j, publicKeyCredentialRequestOptions.f12956j) || !C7258g.m27880a(this.f12957k, publicKeyCredentialRequestOptions.f12957k) || !C7258g.m27880a(this.f12958l, publicKeyCredentialRequestOptions.f12958l))) {
            return false;
        }
        return true;
    }

    /* renamed from: f0 */
    public String mo12538f0() {
        return this.f12952f;
    }

    public int hashCode() {
        return C7258g.m27881b(Integer.valueOf(Arrays.hashCode(this.f12950d)), this.f12951e, this.f12952f, this.f12953g, this.f12954h, this.f12955i, this.f12956j, this.f12957k, this.f12958l);
    }

    /* renamed from: q0 */
    public Double mo12540q0() {
        return this.f12951e;
    }

    /* renamed from: s0 */
    public TokenBinding mo12541s0() {
        return this.f12955i;
    }

    /* renamed from: v */
    public List mo12542v() {
        return this.f12953g;
    }

    /* renamed from: w */
    public AuthenticationExtensions mo12543w() {
        return this.f12957k;
    }

    public void writeToParcel(Parcel parcel, int i) {
        String str;
        int a = C7461a.m28369a(parcel);
        C7461a.m28376h(parcel, 2, mo12545x(), false);
        C7461a.m28379k(parcel, 3, mo12540q0(), false);
        C7461a.m28392x(parcel, 4, mo12538f0(), false);
        C7461a.m28364C(parcel, 5, mo12542v(), false);
        C7461a.m28385q(parcel, 6, mo12536R(), false);
        C7461a.m28390v(parcel, 7, mo12541s0(), i, false);
        zzay zzay = this.f12956j;
        if (zzay == null) {
            str = null;
        } else {
            str = zzay.toString();
        }
        C7461a.m28392x(parcel, 8, str, false);
        C7461a.m28390v(parcel, 9, mo12543w(), i, false);
        C7461a.m28388t(parcel, 10, this.f12958l, false);
        C7461a.m28370b(parcel, a);
    }

    /* renamed from: x */
    public byte[] mo12545x() {
        return this.f12950d;
    }
}
