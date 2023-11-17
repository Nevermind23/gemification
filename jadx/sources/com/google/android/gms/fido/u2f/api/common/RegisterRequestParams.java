package com.google.android.gms.fido.u2f.api.common;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import p182n6.C7258g;
import p182n6.C7264i;
import p195o6.C7461a;

@Deprecated
public class RegisterRequestParams extends RequestParams {
    public static final Parcelable.Creator<RegisterRequestParams> CREATOR = new C4064h();

    /* renamed from: d */
    private final Integer f13043d;

    /* renamed from: e */
    private final Double f13044e;

    /* renamed from: f */
    private final Uri f13045f;

    /* renamed from: g */
    private final List f13046g;

    /* renamed from: h */
    private final List f13047h;

    /* renamed from: i */
    private final ChannelIdValue f13048i;

    /* renamed from: j */
    private final String f13049j;

    /* renamed from: k */
    private Set f13050k;

    RegisterRequestParams(Integer num, Double d, Uri uri, List list, List list2, ChannelIdValue channelIdValue, String str) {
        boolean z;
        boolean z2;
        boolean z3;
        this.f13043d = num;
        this.f13044e = d;
        this.f13045f = uri;
        boolean z4 = false;
        if (list == null || list.isEmpty()) {
            z = false;
        } else {
            z = true;
        }
        C7264i.m27893b(z, "empty list of register requests is provided");
        this.f13046g = list;
        this.f13047h = list2;
        this.f13048i = channelIdValue;
        HashSet hashSet = new HashSet();
        if (uri != null) {
            hashSet.add(uri);
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            RegisterRequest registerRequest = (RegisterRequest) it.next();
            if (uri == null && registerRequest.mo12699v() == null) {
                z3 = false;
            } else {
                z3 = true;
            }
            C7264i.m27893b(z3, "register request has null appId and no request appId is provided");
            if (registerRequest.mo12699v() != null) {
                hashSet.add(Uri.parse(registerRequest.mo12699v()));
            }
        }
        Iterator it2 = list2.iterator();
        while (it2.hasNext()) {
            RegisteredKey registeredKey = (RegisteredKey) it2.next();
            if (uri == null && registeredKey.mo12722v() == null) {
                z2 = false;
            } else {
                z2 = true;
            }
            C7264i.m27893b(z2, "registered key has null appId and no request appId is provided");
            if (registeredKey.mo12722v() != null) {
                hashSet.add(Uri.parse(registeredKey.mo12722v()));
            }
        }
        this.f13050k = hashSet;
        C7264i.m27893b((str == null || str.length() <= 80) ? true : z4, "Display Hint cannot be longer than 80 characters");
        this.f13049j = str;
    }

    /* renamed from: R */
    public List mo12703R() {
        return this.f13046g;
    }

    public boolean equals(Object obj) {
        List list;
        List list2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RegisterRequestParams)) {
            return false;
        }
        RegisterRequestParams registerRequestParams = (RegisterRequestParams) obj;
        if (!C7258g.m27880a(this.f13043d, registerRequestParams.f13043d) || !C7258g.m27880a(this.f13044e, registerRequestParams.f13044e) || !C7258g.m27880a(this.f13045f, registerRequestParams.f13045f) || !C7258g.m27880a(this.f13046g, registerRequestParams.f13046g) || ((((list = this.f13047h) != null || registerRequestParams.f13047h != null) && (list == null || (list2 = registerRequestParams.f13047h) == null || !list.containsAll(list2) || !registerRequestParams.f13047h.containsAll(this.f13047h))) || !C7258g.m27880a(this.f13048i, registerRequestParams.f13048i) || !C7258g.m27880a(this.f13049j, registerRequestParams.f13049j))) {
            return false;
        }
        return true;
    }

    /* renamed from: f0 */
    public List mo12705f0() {
        return this.f13047h;
    }

    public int hashCode() {
        return C7258g.m27881b(this.f13043d, this.f13045f, this.f13044e, this.f13046g, this.f13047h, this.f13048i, this.f13049j);
    }

    /* renamed from: q0 */
    public Integer mo12707q0() {
        return this.f13043d;
    }

    /* renamed from: s0 */
    public Double mo12708s0() {
        return this.f13044e;
    }

    /* renamed from: v */
    public Uri mo12709v() {
        return this.f13045f;
    }

    /* renamed from: w */
    public ChannelIdValue mo12710w() {
        return this.f13048i;
    }

    public void writeToParcel(Parcel parcel, int i) {
        int a = C7461a.m28369a(parcel);
        C7461a.m28385q(parcel, 2, mo12707q0(), false);
        C7461a.m28379k(parcel, 3, mo12708s0(), false);
        C7461a.m28390v(parcel, 4, mo12709v(), i, false);
        C7461a.m28364C(parcel, 5, mo12703R(), false);
        C7461a.m28364C(parcel, 6, mo12705f0(), false);
        C7461a.m28390v(parcel, 7, mo12710w(), i, false);
        C7461a.m28392x(parcel, 8, mo12712x(), false);
        C7461a.m28370b(parcel, a);
    }

    /* renamed from: x */
    public String mo12712x() {
        return this.f13049j;
    }
}
