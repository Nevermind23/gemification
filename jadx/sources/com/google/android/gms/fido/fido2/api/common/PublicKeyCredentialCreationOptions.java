package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.fido.fido2.api.common.AttestationConveyancePreference;
import java.util.Arrays;
import java.util.List;
import p182n6.C7258g;
import p182n6.C7264i;
import p195o6.C7461a;

public class PublicKeyCredentialCreationOptions extends RequestOptions {
    public static final Parcelable.Creator<PublicKeyCredentialCreationOptions> CREATOR = new C4034c();

    /* renamed from: d */
    private final PublicKeyCredentialRpEntity f12933d;

    /* renamed from: e */
    private final PublicKeyCredentialUserEntity f12934e;

    /* renamed from: f */
    private final byte[] f12935f;

    /* renamed from: g */
    private final List f12936g;

    /* renamed from: h */
    private final Double f12937h;

    /* renamed from: i */
    private final List f12938i;

    /* renamed from: j */
    private final AuthenticatorSelectionCriteria f12939j;

    /* renamed from: k */
    private final Integer f12940k;

    /* renamed from: l */
    private final TokenBinding f12941l;

    /* renamed from: m */
    private final AttestationConveyancePreference f12942m;

    /* renamed from: n */
    private final AuthenticationExtensions f12943n;

    PublicKeyCredentialCreationOptions(PublicKeyCredentialRpEntity publicKeyCredentialRpEntity, PublicKeyCredentialUserEntity publicKeyCredentialUserEntity, byte[] bArr, List list, Double d, List list2, AuthenticatorSelectionCriteria authenticatorSelectionCriteria, Integer num, TokenBinding tokenBinding, String str, AuthenticationExtensions authenticationExtensions) {
        this.f12933d = (PublicKeyCredentialRpEntity) C7264i.m27902k(publicKeyCredentialRpEntity);
        this.f12934e = (PublicKeyCredentialUserEntity) C7264i.m27902k(publicKeyCredentialUserEntity);
        this.f12935f = (byte[]) C7264i.m27902k(bArr);
        this.f12936g = (List) C7264i.m27902k(list);
        this.f12937h = d;
        this.f12938i = list2;
        this.f12939j = authenticatorSelectionCriteria;
        this.f12940k = num;
        this.f12941l = tokenBinding;
        if (str != null) {
            try {
                this.f12942m = AttestationConveyancePreference.m15293a(str);
            } catch (AttestationConveyancePreference.UnsupportedAttestationConveyancePreferenceException e) {
                throw new IllegalArgumentException(e);
            }
        } else {
            this.f12942m = null;
        }
        this.f12943n = authenticationExtensions;
    }

    /* renamed from: F1 */
    public TokenBinding mo12511F1() {
        return this.f12941l;
    }

    /* renamed from: G1 */
    public PublicKeyCredentialUserEntity mo12512G1() {
        return this.f12934e;
    }

    /* renamed from: R */
    public byte[] mo12513R() {
        return this.f12935f;
    }

    public boolean equals(Object obj) {
        List list;
        List list2;
        if (!(obj instanceof PublicKeyCredentialCreationOptions)) {
            return false;
        }
        PublicKeyCredentialCreationOptions publicKeyCredentialCreationOptions = (PublicKeyCredentialCreationOptions) obj;
        if (!C7258g.m27880a(this.f12933d, publicKeyCredentialCreationOptions.f12933d) || !C7258g.m27880a(this.f12934e, publicKeyCredentialCreationOptions.f12934e) || !Arrays.equals(this.f12935f, publicKeyCredentialCreationOptions.f12935f) || !C7258g.m27880a(this.f12937h, publicKeyCredentialCreationOptions.f12937h) || !this.f12936g.containsAll(publicKeyCredentialCreationOptions.f12936g) || !publicKeyCredentialCreationOptions.f12936g.containsAll(this.f12936g) || ((((list = this.f12938i) != null || publicKeyCredentialCreationOptions.f12938i != null) && (list == null || (list2 = publicKeyCredentialCreationOptions.f12938i) == null || !list.containsAll(list2) || !publicKeyCredentialCreationOptions.f12938i.containsAll(this.f12938i))) || !C7258g.m27880a(this.f12939j, publicKeyCredentialCreationOptions.f12939j) || !C7258g.m27880a(this.f12940k, publicKeyCredentialCreationOptions.f12940k) || !C7258g.m27880a(this.f12941l, publicKeyCredentialCreationOptions.f12941l) || !C7258g.m27880a(this.f12942m, publicKeyCredentialCreationOptions.f12942m) || !C7258g.m27880a(this.f12943n, publicKeyCredentialCreationOptions.f12943n))) {
            return false;
        }
        return true;
    }

    /* renamed from: f0 */
    public List mo12515f0() {
        return this.f12938i;
    }

    /* renamed from: f1 */
    public PublicKeyCredentialRpEntity mo12516f1() {
        return this.f12933d;
    }

    public int hashCode() {
        return C7258g.m27881b(this.f12933d, this.f12934e, Integer.valueOf(Arrays.hashCode(this.f12935f)), this.f12936g, this.f12937h, this.f12938i, this.f12939j, this.f12940k, this.f12941l, this.f12942m, this.f12943n);
    }

    /* renamed from: i1 */
    public Double mo12518i1() {
        return this.f12937h;
    }

    /* renamed from: q0 */
    public List mo12519q0() {
        return this.f12936g;
    }

    /* renamed from: s0 */
    public Integer mo12520s0() {
        return this.f12940k;
    }

    /* renamed from: v */
    public String mo12521v() {
        AttestationConveyancePreference attestationConveyancePreference = this.f12942m;
        if (attestationConveyancePreference == null) {
            return null;
        }
        return attestationConveyancePreference.toString();
    }

    /* renamed from: w */
    public AuthenticationExtensions mo12522w() {
        return this.f12943n;
    }

    public void writeToParcel(Parcel parcel, int i) {
        int a = C7461a.m28369a(parcel);
        C7461a.m28390v(parcel, 2, mo12516f1(), i, false);
        C7461a.m28390v(parcel, 3, mo12512G1(), i, false);
        C7461a.m28376h(parcel, 4, mo12513R(), false);
        C7461a.m28364C(parcel, 5, mo12519q0(), false);
        C7461a.m28379k(parcel, 6, mo12518i1(), false);
        C7461a.m28364C(parcel, 7, mo12515f0(), false);
        C7461a.m28390v(parcel, 8, mo12524x(), i, false);
        C7461a.m28385q(parcel, 9, mo12520s0(), false);
        C7461a.m28390v(parcel, 10, mo12511F1(), i, false);
        C7461a.m28392x(parcel, 11, mo12521v(), false);
        C7461a.m28390v(parcel, 12, mo12522w(), i, false);
        C7461a.m28370b(parcel, a);
    }

    /* renamed from: x */
    public AuthenticatorSelectionCriteria mo12524x() {
        return this.f12939j;
    }
}
