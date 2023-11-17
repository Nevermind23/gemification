package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import p182n6.C7258g;
import p195o6.C7461a;

public class AuthenticationExtensions extends AbstractSafeParcelable {
    public static final Parcelable.Creator<AuthenticationExtensions> CREATOR = new C4046o();

    /* renamed from: d */
    private final FidoAppIdExtension f12865d;

    /* renamed from: e */
    private final zzs f12866e;

    /* renamed from: f */
    private final UserVerificationMethodExtension f12867f;

    /* renamed from: g */
    private final zzz f12868g;

    /* renamed from: h */
    private final zzab f12869h;

    /* renamed from: i */
    private final zzad f12870i;

    /* renamed from: j */
    private final zzu f12871j;

    /* renamed from: k */
    private final zzag f12872k;

    /* renamed from: l */
    private final GoogleThirdPartyPaymentExtension f12873l;

    /* renamed from: m */
    private final zzai f12874m;

    AuthenticationExtensions(FidoAppIdExtension fidoAppIdExtension, zzs zzs, UserVerificationMethodExtension userVerificationMethodExtension, zzz zzz, zzab zzab, zzad zzad, zzu zzu, zzag zzag, GoogleThirdPartyPaymentExtension googleThirdPartyPaymentExtension, zzai zzai) {
        this.f12865d = fidoAppIdExtension;
        this.f12867f = userVerificationMethodExtension;
        this.f12866e = zzs;
        this.f12868g = zzz;
        this.f12869h = zzab;
        this.f12870i = zzad;
        this.f12871j = zzu;
        this.f12872k = zzag;
        this.f12873l = googleThirdPartyPaymentExtension;
        this.f12874m = zzai;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof AuthenticationExtensions)) {
            return false;
        }
        AuthenticationExtensions authenticationExtensions = (AuthenticationExtensions) obj;
        if (!C7258g.m27880a(this.f12865d, authenticationExtensions.f12865d) || !C7258g.m27880a(this.f12866e, authenticationExtensions.f12866e) || !C7258g.m27880a(this.f12867f, authenticationExtensions.f12867f) || !C7258g.m27880a(this.f12868g, authenticationExtensions.f12868g) || !C7258g.m27880a(this.f12869h, authenticationExtensions.f12869h) || !C7258g.m27880a(this.f12870i, authenticationExtensions.f12870i) || !C7258g.m27880a(this.f12871j, authenticationExtensions.f12871j) || !C7258g.m27880a(this.f12872k, authenticationExtensions.f12872k) || !C7258g.m27880a(this.f12873l, authenticationExtensions.f12873l) || !C7258g.m27880a(this.f12874m, authenticationExtensions.f12874m)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return C7258g.m27881b(this.f12865d, this.f12866e, this.f12867f, this.f12868g, this.f12869h, this.f12870i, this.f12871j, this.f12872k, this.f12873l, this.f12874m);
    }

    /* renamed from: v */
    public FidoAppIdExtension mo12425v() {
        return this.f12865d;
    }

    /* renamed from: w */
    public UserVerificationMethodExtension mo12426w() {
        return this.f12867f;
    }

    public void writeToParcel(Parcel parcel, int i) {
        int a = C7461a.m28369a(parcel);
        C7461a.m28390v(parcel, 2, mo12425v(), i, false);
        C7461a.m28390v(parcel, 3, this.f12866e, i, false);
        C7461a.m28390v(parcel, 4, mo12426w(), i, false);
        C7461a.m28390v(parcel, 5, this.f12868g, i, false);
        C7461a.m28390v(parcel, 6, this.f12869h, i, false);
        C7461a.m28390v(parcel, 7, this.f12870i, i, false);
        C7461a.m28390v(parcel, 8, this.f12871j, i, false);
        C7461a.m28390v(parcel, 9, this.f12872k, i, false);
        C7461a.m28390v(parcel, 10, this.f12873l, i, false);
        C7461a.m28390v(parcel, 11, this.f12874m, i, false);
        C7461a.m28370b(parcel, a);
    }
}
