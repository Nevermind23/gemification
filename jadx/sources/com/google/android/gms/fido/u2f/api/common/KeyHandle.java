package com.google.android.gms.fido.u2f.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.fido.u2f.api.common.ProtocolVersion;
import java.util.Arrays;
import java.util.List;
import p182n6.C7258g;
import p195o6.C7461a;
import p260t6.C8401c;

@Deprecated
public class KeyHandle extends AbstractSafeParcelable {
    public static final Parcelable.Creator<KeyHandle> CREATOR = new C4061e();

    /* renamed from: d */
    private final int f13030d;

    /* renamed from: e */
    private final byte[] f13031e;

    /* renamed from: f */
    private final ProtocolVersion f13032f;

    /* renamed from: g */
    private final List f13033g;

    KeyHandle(int i, byte[] bArr, String str, List list) {
        this.f13030d = i;
        this.f13031e = bArr;
        try {
            this.f13032f = ProtocolVersion.m15395a(str);
            this.f13033g = list;
        } catch (ProtocolVersion.UnsupportedProtocolException e) {
            throw new IllegalArgumentException(e);
        }
    }

    /* renamed from: R */
    public int mo12686R() {
        return this.f13030d;
    }

    public boolean equals(Object obj) {
        List list;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof KeyHandle)) {
            return false;
        }
        KeyHandle keyHandle = (KeyHandle) obj;
        if (!Arrays.equals(this.f13031e, keyHandle.f13031e) || !this.f13032f.equals(keyHandle.f13032f)) {
            return false;
        }
        List list2 = this.f13033g;
        if (list2 == null && keyHandle.f13033g == null) {
            return true;
        }
        if (list2 == null || (list = keyHandle.f13033g) == null || !list2.containsAll(list) || !keyHandle.f13033g.containsAll(this.f13033g)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return C7258g.m27881b(Integer.valueOf(Arrays.hashCode(this.f13031e)), this.f13032f, this.f13033g);
    }

    public String toString() {
        String str;
        List list = this.f13033g;
        if (list == null) {
            str = "null";
        } else {
            str = list.toString();
        }
        return String.format("{keyHandle: %s, version: %s, transports: %s}", new Object[]{C8401c.m31534a(this.f13031e), this.f13032f, str});
    }

    /* renamed from: v */
    public byte[] mo12690v() {
        return this.f13031e;
    }

    /* renamed from: w */
    public ProtocolVersion mo12691w() {
        return this.f13032f;
    }

    public void writeToParcel(Parcel parcel, int i) {
        int a = C7461a.m28369a(parcel);
        C7461a.m28383o(parcel, 1, mo12686R());
        C7461a.m28376h(parcel, 2, mo12690v(), false);
        C7461a.m28392x(parcel, 3, this.f13032f.toString(), false);
        C7461a.m28364C(parcel, 4, mo12693x(), false);
        C7461a.m28370b(parcel, a);
    }

    /* renamed from: x */
    public List mo12693x() {
        return this.f13033g;
    }
}
