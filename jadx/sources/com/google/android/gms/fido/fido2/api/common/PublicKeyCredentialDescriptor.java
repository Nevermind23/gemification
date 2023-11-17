package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialType;
import java.util.Arrays;
import java.util.List;
import p105h7.C6459i0;
import p105h7.C6468r;
import p182n6.C7258g;
import p182n6.C7264i;
import p195o6.C7461a;
import p324y6.C9072i;

public class PublicKeyCredentialDescriptor extends AbstractSafeParcelable {
    public static final Parcelable.Creator<PublicKeyCredentialDescriptor> CREATOR = new C9072i();

    /* renamed from: g */
    private static final C6468r f12944g = C6468r.m25577o(C6459i0.f19745a, C6459i0.f19746b);

    /* renamed from: d */
    private final PublicKeyCredentialType f12945d;

    /* renamed from: e */
    private final byte[] f12946e;

    /* renamed from: f */
    private final List f12947f;

    public static class UnsupportedPubKeyCredDescriptorException extends Exception {
    }

    public PublicKeyCredentialDescriptor(String str, byte[] bArr, List list) {
        C7264i.m27902k(str);
        try {
            this.f12945d = PublicKeyCredentialType.m15366a(str);
            this.f12946e = (byte[]) C7264i.m27902k(bArr);
            this.f12947f = list;
        } catch (PublicKeyCredentialType.UnsupportedPublicKeyCredTypeException e) {
            throw new IllegalArgumentException(e);
        }
    }

    public boolean equals(Object obj) {
        List list;
        if (!(obj instanceof PublicKeyCredentialDescriptor)) {
            return false;
        }
        PublicKeyCredentialDescriptor publicKeyCredentialDescriptor = (PublicKeyCredentialDescriptor) obj;
        if (!this.f12945d.equals(publicKeyCredentialDescriptor.f12945d) || !Arrays.equals(this.f12946e, publicKeyCredentialDescriptor.f12946e)) {
            return false;
        }
        List list2 = this.f12947f;
        if (list2 == null && publicKeyCredentialDescriptor.f12947f == null) {
            return true;
        }
        if (list2 == null || (list = publicKeyCredentialDescriptor.f12947f) == null || !list2.containsAll(list) || !publicKeyCredentialDescriptor.f12947f.containsAll(this.f12947f)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return C7258g.m27881b(this.f12945d, Integer.valueOf(Arrays.hashCode(this.f12946e)), this.f12947f);
    }

    /* renamed from: v */
    public byte[] mo12527v() {
        return this.f12946e;
    }

    /* renamed from: w */
    public List mo12528w() {
        return this.f12947f;
    }

    public void writeToParcel(Parcel parcel, int i) {
        int a = C7461a.m28369a(parcel);
        C7461a.m28392x(parcel, 2, mo12530x(), false);
        C7461a.m28376h(parcel, 3, mo12527v(), false);
        C7461a.m28364C(parcel, 4, mo12528w(), false);
        C7461a.m28370b(parcel, a);
    }

    /* renamed from: x */
    public String mo12530x() {
        return this.f12945d.toString();
    }
}
