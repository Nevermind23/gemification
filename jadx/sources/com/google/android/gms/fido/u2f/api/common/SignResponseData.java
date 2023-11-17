package com.google.android.gms.fido.u2f.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import p105h7.C6447c0;
import p105h7.C6454g;
import p105h7.C6456h;
import p182n6.C7258g;
import p182n6.C7264i;
import p195o6.C7461a;
import p336z6.C9214b;

@Deprecated
public class SignResponseData extends ResponseData {
    public static final Parcelable.Creator<SignResponseData> CREATOR = new C9214b();

    /* renamed from: d */
    private final byte[] f13065d;

    /* renamed from: e */
    private final String f13066e;

    /* renamed from: f */
    private final byte[] f13067f;

    /* renamed from: g */
    private final byte[] f13068g;

    public SignResponseData(byte[] bArr, String str, byte[] bArr2, byte[] bArr3) {
        this.f13065d = (byte[]) C7264i.m27902k(bArr);
        this.f13066e = (String) C7264i.m27902k(str);
        this.f13067f = (byte[]) C7264i.m27902k(bArr2);
        this.f13068g = (byte[]) C7264i.m27902k(bArr3);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof SignResponseData)) {
            return false;
        }
        SignResponseData signResponseData = (SignResponseData) obj;
        if (!Arrays.equals(this.f13065d, signResponseData.f13065d) || !C7258g.m27880a(this.f13066e, signResponseData.f13066e) || !Arrays.equals(this.f13067f, signResponseData.f13067f) || !Arrays.equals(this.f13068g, signResponseData.f13068g)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return C7258g.m27881b(Integer.valueOf(Arrays.hashCode(this.f13065d)), this.f13066e, Integer.valueOf(Arrays.hashCode(this.f13067f)), Integer.valueOf(Arrays.hashCode(this.f13068g)));
    }

    public String toString() {
        C6454g a = C6456h.m25550a(this);
        C6447c0 c = C6447c0.m25540c();
        byte[] bArr = this.f13065d;
        a.mo20320b("keyHandle", c.mo20318d(bArr, 0, bArr.length));
        a.mo20320b("clientDataString", this.f13066e);
        C6447c0 c2 = C6447c0.m25540c();
        byte[] bArr2 = this.f13067f;
        a.mo20320b("signatureData", c2.mo20318d(bArr2, 0, bArr2.length));
        C6447c0 c3 = C6447c0.m25540c();
        byte[] bArr3 = this.f13068g;
        a.mo20320b("application", c3.mo20318d(bArr3, 0, bArr3.length));
        return a.toString();
    }

    /* renamed from: v */
    public String mo12739v() {
        return this.f13066e;
    }

    /* renamed from: w */
    public byte[] mo12740w() {
        return this.f13065d;
    }

    public void writeToParcel(Parcel parcel, int i) {
        int a = C7461a.m28369a(parcel);
        C7461a.m28376h(parcel, 2, mo12740w(), false);
        C7461a.m28392x(parcel, 3, mo12739v(), false);
        C7461a.m28376h(parcel, 4, mo12742x(), false);
        C7461a.m28376h(parcel, 5, this.f13068g, false);
        C7461a.m28370b(parcel, a);
    }

    /* renamed from: x */
    public byte[] mo12742x() {
        return this.f13067f;
    }
}
