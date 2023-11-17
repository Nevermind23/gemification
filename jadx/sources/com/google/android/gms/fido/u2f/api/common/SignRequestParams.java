package com.google.android.gms.fido.u2f.api.common;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import p182n6.C7258g;
import p182n6.C7264i;
import p195o6.C7461a;

@Deprecated
public class SignRequestParams extends RequestParams {
    public static final Parcelable.Creator<SignRequestParams> CREATOR = new C4066j();

    /* renamed from: d */
    private final Integer f13057d;

    /* renamed from: e */
    private final Double f13058e;

    /* renamed from: f */
    private final Uri f13059f;

    /* renamed from: g */
    private final byte[] f13060g;

    /* renamed from: h */
    private final List f13061h;

    /* renamed from: i */
    private final ChannelIdValue f13062i;

    /* renamed from: j */
    private final String f13063j;

    /* renamed from: k */
    private final Set f13064k;

    SignRequestParams(Integer num, Double d, Uri uri, byte[] bArr, List list, ChannelIdValue channelIdValue, String str) {
        boolean z;
        boolean z2;
        this.f13057d = num;
        this.f13058e = d;
        this.f13059f = uri;
        this.f13060g = bArr;
        boolean z3 = false;
        if (list == null || list.isEmpty()) {
            z = false;
        } else {
            z = true;
        }
        C7264i.m27893b(z, "registeredKeys must not be null or empty");
        this.f13061h = list;
        this.f13062i = channelIdValue;
        HashSet hashSet = new HashSet();
        if (uri != null) {
            hashSet.add(uri);
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            RegisteredKey registeredKey = (RegisteredKey) it.next();
            if (registeredKey.mo12722v() == null && uri == null) {
                z2 = false;
            } else {
                z2 = true;
            }
            C7264i.m27893b(z2, "registered key has null appId and no request appId is provided");
            String w = registeredKey.mo12723w();
            C7264i.m27893b(true, "register request has null challenge and no default challenge isprovided");
            if (registeredKey.mo12722v() != null) {
                hashSet.add(Uri.parse(registeredKey.mo12722v()));
            }
        }
        this.f13064k = hashSet;
        C7264i.m27893b((str == null || str.length() <= 80) ? true : z3, "Display Hint cannot be longer than 80 characters");
        this.f13063j = str;
    }

    /* renamed from: R */
    public String mo12726R() {
        return this.f13063j;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SignRequestParams)) {
            return false;
        }
        SignRequestParams signRequestParams = (SignRequestParams) obj;
        if (!C7258g.m27880a(this.f13057d, signRequestParams.f13057d) || !C7258g.m27880a(this.f13058e, signRequestParams.f13058e) || !C7258g.m27880a(this.f13059f, signRequestParams.f13059f) || !Arrays.equals(this.f13060g, signRequestParams.f13060g) || !this.f13061h.containsAll(signRequestParams.f13061h) || !signRequestParams.f13061h.containsAll(this.f13061h) || !C7258g.m27880a(this.f13062i, signRequestParams.f13062i) || !C7258g.m27880a(this.f13063j, signRequestParams.f13063j)) {
            return false;
        }
        return true;
    }

    /* renamed from: f0 */
    public List mo12728f0() {
        return this.f13061h;
    }

    public int hashCode() {
        return C7258g.m27881b(this.f13057d, this.f13059f, this.f13058e, this.f13061h, this.f13062i, this.f13063j, Integer.valueOf(Arrays.hashCode(this.f13060g)));
    }

    /* renamed from: q0 */
    public Integer mo12730q0() {
        return this.f13057d;
    }

    /* renamed from: s0 */
    public Double mo12731s0() {
        return this.f13058e;
    }

    /* renamed from: v */
    public Uri mo12732v() {
        return this.f13059f;
    }

    /* renamed from: w */
    public ChannelIdValue mo12733w() {
        return this.f13062i;
    }

    public void writeToParcel(Parcel parcel, int i) {
        int a = C7461a.m28369a(parcel);
        C7461a.m28385q(parcel, 2, mo12730q0(), false);
        C7461a.m28379k(parcel, 3, mo12731s0(), false);
        C7461a.m28390v(parcel, 4, mo12732v(), i, false);
        C7461a.m28376h(parcel, 5, mo12735x(), false);
        C7461a.m28364C(parcel, 6, mo12728f0(), false);
        C7461a.m28390v(parcel, 7, mo12733w(), i, false);
        C7461a.m28392x(parcel, 8, mo12726R(), false);
        C7461a.m28370b(parcel, a);
    }

    /* renamed from: x */
    public byte[] mo12735x() {
        return this.f13060g;
    }
}
