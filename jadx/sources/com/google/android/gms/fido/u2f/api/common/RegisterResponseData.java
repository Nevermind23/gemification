package com.google.android.gms.fido.u2f.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.fido.u2f.api.common.ProtocolVersion;
import java.util.Arrays;
import p105h7.C6447c0;
import p105h7.C6454g;
import p105h7.C6456h;
import p182n6.C7258g;
import p195o6.C7461a;

@Deprecated
public class RegisterResponseData extends ResponseData {
    public static final Parcelable.Creator<RegisterResponseData> CREATOR = new C4065i();

    /* renamed from: d */
    private final byte[] f13051d;

    /* renamed from: e */
    private final ProtocolVersion f13052e;

    /* renamed from: f */
    private final String f13053f;

    RegisterResponseData(byte[] bArr, String str, String str2) {
        this.f13051d = bArr;
        try {
            this.f13052e = ProtocolVersion.m15395a(str);
            this.f13053f = str2;
        } catch (ProtocolVersion.UnsupportedProtocolException e) {
            throw new IllegalArgumentException(e);
        }
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof RegisterResponseData)) {
            return false;
        }
        RegisterResponseData registerResponseData = (RegisterResponseData) obj;
        if (!C7258g.m27880a(this.f13052e, registerResponseData.f13052e) || !Arrays.equals(this.f13051d, registerResponseData.f13051d) || !C7258g.m27880a(this.f13053f, registerResponseData.f13053f)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return C7258g.m27881b(this.f13052e, Integer.valueOf(Arrays.hashCode(this.f13051d)), this.f13053f);
    }

    public String toString() {
        C6454g a = C6456h.m25550a(this);
        a.mo20320b("protocolVersion", this.f13052e);
        C6447c0 c = C6447c0.m25540c();
        byte[] bArr = this.f13051d;
        a.mo20320b("registerData", c.mo20318d(bArr, 0, bArr.length));
        String str = this.f13053f;
        if (str != null) {
            a.mo20320b("clientDataString", str);
        }
        return a.toString();
    }

    /* renamed from: v */
    public String mo12716v() {
        return this.f13053f;
    }

    /* renamed from: w */
    public byte[] mo12717w() {
        return this.f13051d;
    }

    public void writeToParcel(Parcel parcel, int i) {
        int a = C7461a.m28369a(parcel);
        C7461a.m28376h(parcel, 2, mo12717w(), false);
        C7461a.m28392x(parcel, 3, this.f13052e.toString(), false);
        C7461a.m28392x(parcel, 4, mo12716v(), false);
        C7461a.m28370b(parcel, a);
    }
}
