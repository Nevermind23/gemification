package com.google.android.gms.fido.u2f.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.fido.u2f.api.common.ProtocolVersion;
import java.util.Arrays;
import p195o6.C7461a;

@Deprecated
public class RegisterRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<RegisterRequest> CREATOR = new C4063g();

    /* renamed from: d */
    private final int f13039d;

    /* renamed from: e */
    private final ProtocolVersion f13040e;

    /* renamed from: f */
    private final byte[] f13041f;

    /* renamed from: g */
    private final String f13042g;

    RegisterRequest(int i, String str, byte[] bArr, String str2) {
        this.f13039d = i;
        try {
            this.f13040e = ProtocolVersion.m15395a(str);
            this.f13041f = bArr;
            this.f13042g = str2;
        } catch (ProtocolVersion.UnsupportedProtocolException e) {
            throw new IllegalArgumentException(e);
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RegisterRequest)) {
            return false;
        }
        RegisterRequest registerRequest = (RegisterRequest) obj;
        if (!Arrays.equals(this.f13041f, registerRequest.f13041f) || this.f13040e != registerRequest.f13040e) {
            return false;
        }
        String str = this.f13042g;
        if (str == null) {
            if (registerRequest.f13042g != null) {
                return false;
            }
        } else if (!str.equals(registerRequest.f13042g)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        int i;
        int hashCode = ((Arrays.hashCode(this.f13041f) + 31) * 31) + this.f13040e.hashCode();
        String str = this.f13042g;
        if (str == null) {
            i = 0;
        } else {
            i = str.hashCode();
        }
        return (hashCode * 31) + i;
    }

    /* renamed from: v */
    public String mo12699v() {
        return this.f13042g;
    }

    /* renamed from: w */
    public byte[] mo12700w() {
        return this.f13041f;
    }

    public void writeToParcel(Parcel parcel, int i) {
        int a = C7461a.m28369a(parcel);
        C7461a.m28383o(parcel, 1, mo12702x());
        C7461a.m28392x(parcel, 2, this.f13040e.toString(), false);
        C7461a.m28376h(parcel, 3, mo12700w(), false);
        C7461a.m28392x(parcel, 4, mo12699v(), false);
        C7461a.m28370b(parcel, a);
    }

    /* renamed from: x */
    public int mo12702x() {
        return this.f13039d;
    }
}
