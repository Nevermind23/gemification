package com.google.android.gms.auth.api.credentials;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.credentials.CredentialPickerConfig;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import p182n6.C7264i;
import p195o6.C7461a;

@Deprecated
public final class CredentialRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<CredentialRequest> CREATOR = new C3804c();

    /* renamed from: d */
    final int f12049d;

    /* renamed from: e */
    private final boolean f12050e;

    /* renamed from: f */
    private final String[] f12051f;

    /* renamed from: g */
    private final CredentialPickerConfig f12052g;

    /* renamed from: h */
    private final CredentialPickerConfig f12053h;

    /* renamed from: i */
    private final boolean f12054i;

    /* renamed from: j */
    private final String f12055j;

    /* renamed from: k */
    private final String f12056k;

    /* renamed from: l */
    private final boolean f12057l;

    CredentialRequest(int i, boolean z, String[] strArr, CredentialPickerConfig credentialPickerConfig, CredentialPickerConfig credentialPickerConfig2, boolean z2, String str, String str2, boolean z3) {
        this.f12049d = i;
        this.f12050e = z;
        this.f12051f = (String[]) C7264i.m27902k(strArr);
        this.f12052g = credentialPickerConfig == null ? new CredentialPickerConfig.C3801a().mo11621a() : credentialPickerConfig;
        this.f12053h = credentialPickerConfig2 == null ? new CredentialPickerConfig.C3801a().mo11621a() : credentialPickerConfig2;
        if (i < 3) {
            this.f12054i = true;
            this.f12055j = null;
            this.f12056k = null;
        } else {
            this.f12054i = z2;
            this.f12055j = str;
            this.f12056k = str2;
        }
        this.f12057l = z3;
    }

    /* renamed from: R */
    public String mo11622R() {
        return this.f12056k;
    }

    /* renamed from: f0 */
    public String mo11623f0() {
        return this.f12055j;
    }

    /* renamed from: q0 */
    public boolean mo11624q0() {
        return this.f12054i;
    }

    /* renamed from: s0 */
    public boolean mo11625s0() {
        return this.f12050e;
    }

    /* renamed from: v */
    public String[] mo11626v() {
        return this.f12051f;
    }

    /* renamed from: w */
    public CredentialPickerConfig mo11627w() {
        return this.f12053h;
    }

    public void writeToParcel(Parcel parcel, int i) {
        int a = C7461a.m28369a(parcel);
        C7461a.m28372d(parcel, 1, mo11625s0());
        C7461a.m28393y(parcel, 2, mo11626v(), false);
        C7461a.m28390v(parcel, 3, mo11629x(), i, false);
        C7461a.m28390v(parcel, 4, mo11627w(), i, false);
        C7461a.m28372d(parcel, 5, mo11624q0());
        C7461a.m28392x(parcel, 6, mo11623f0(), false);
        C7461a.m28392x(parcel, 7, mo11622R(), false);
        C7461a.m28372d(parcel, 8, this.f12057l);
        C7461a.m28383o(parcel, 1000, this.f12049d);
        C7461a.m28370b(parcel, a);
    }

    /* renamed from: x */
    public CredentialPickerConfig mo11629x() {
        return this.f12052g;
    }
}
