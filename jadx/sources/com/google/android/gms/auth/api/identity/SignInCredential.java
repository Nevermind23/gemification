package com.google.android.gms.auth.api.identity;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredential;
import p182n6.C7258g;
import p182n6.C7264i;
import p195o6.C7461a;

public final class SignInCredential extends AbstractSafeParcelable {
    public static final Parcelable.Creator<SignInCredential> CREATOR = new C3817j();

    /* renamed from: d */
    private final String f12112d;

    /* renamed from: e */
    private final String f12113e;

    /* renamed from: f */
    private final String f12114f;

    /* renamed from: g */
    private final String f12115g;

    /* renamed from: h */
    private final Uri f12116h;

    /* renamed from: i */
    private final String f12117i;

    /* renamed from: j */
    private final String f12118j;

    /* renamed from: k */
    private final String f12119k;

    /* renamed from: l */
    private final PublicKeyCredential f12120l;

    SignInCredential(String str, String str2, String str3, String str4, Uri uri, String str5, String str6, String str7, PublicKeyCredential publicKeyCredential) {
        this.f12112d = C7264i.m27898g(str);
        this.f12113e = str2;
        this.f12114f = str3;
        this.f12115g = str4;
        this.f12116h = uri;
        this.f12117i = str5;
        this.f12118j = str6;
        this.f12119k = str7;
        this.f12120l = publicKeyCredential;
    }

    /* renamed from: R */
    public String mo11717R() {
        return this.f12118j;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof SignInCredential)) {
            return false;
        }
        SignInCredential signInCredential = (SignInCredential) obj;
        if (!C7258g.m27880a(this.f12112d, signInCredential.f12112d) || !C7258g.m27880a(this.f12113e, signInCredential.f12113e) || !C7258g.m27880a(this.f12114f, signInCredential.f12114f) || !C7258g.m27880a(this.f12115g, signInCredential.f12115g) || !C7258g.m27880a(this.f12116h, signInCredential.f12116h) || !C7258g.m27880a(this.f12117i, signInCredential.f12117i) || !C7258g.m27880a(this.f12118j, signInCredential.f12118j) || !C7258g.m27880a(this.f12119k, signInCredential.f12119k) || !C7258g.m27880a(this.f12120l, signInCredential.f12120l)) {
            return false;
        }
        return true;
    }

    /* renamed from: f0 */
    public String mo11719f0() {
        return this.f12112d;
    }

    /* renamed from: f1 */
    public Uri mo11720f1() {
        return this.f12116h;
    }

    public int hashCode() {
        return C7258g.m27881b(this.f12112d, this.f12113e, this.f12114f, this.f12115g, this.f12116h, this.f12117i, this.f12118j, this.f12119k, this.f12120l);
    }

    /* renamed from: i1 */
    public PublicKeyCredential mo11722i1() {
        return this.f12120l;
    }

    /* renamed from: q0 */
    public String mo11723q0() {
        return this.f12117i;
    }

    /* renamed from: s0 */
    public String mo11724s0() {
        return this.f12119k;
    }

    /* renamed from: v */
    public String mo11725v() {
        return this.f12113e;
    }

    /* renamed from: w */
    public String mo11726w() {
        return this.f12115g;
    }

    public void writeToParcel(Parcel parcel, int i) {
        int a = C7461a.m28369a(parcel);
        C7461a.m28392x(parcel, 1, mo11719f0(), false);
        C7461a.m28392x(parcel, 2, mo11725v(), false);
        C7461a.m28392x(parcel, 3, mo11728x(), false);
        C7461a.m28392x(parcel, 4, mo11726w(), false);
        C7461a.m28390v(parcel, 5, mo11720f1(), i, false);
        C7461a.m28392x(parcel, 6, mo11723q0(), false);
        C7461a.m28392x(parcel, 7, mo11717R(), false);
        C7461a.m28392x(parcel, 8, mo11724s0(), false);
        C7461a.m28390v(parcel, 9, mo11722i1(), i, false);
        C7461a.m28370b(parcel, a);
    }

    /* renamed from: x */
    public String mo11728x() {
        return this.f12114f;
    }
}
