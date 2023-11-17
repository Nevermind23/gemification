package com.google.android.gms.auth.api.credentials;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import p195o6.C7461a;

@Deprecated
public final class CredentialPickerConfig extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<CredentialPickerConfig> CREATOR = new C3803b();

    /* renamed from: d */
    final int f12042d;

    /* renamed from: e */
    private final boolean f12043e;

    /* renamed from: f */
    private final boolean f12044f;

    /* renamed from: g */
    private final int f12045g;

    /* renamed from: com.google.android.gms.auth.api.credentials.CredentialPickerConfig$a */
    public static class C3801a {

        /* renamed from: a */
        private boolean f12046a = false;

        /* renamed from: b */
        private boolean f12047b = true;

        /* renamed from: c */
        private int f12048c = 1;

        /* renamed from: a */
        public CredentialPickerConfig mo11621a() {
            return new CredentialPickerConfig(2, this.f12046a, this.f12047b, false, this.f12048c);
        }
    }

    CredentialPickerConfig(int i, boolean z, boolean z2, boolean z3, int i2) {
        this.f12042d = i;
        this.f12043e = z;
        this.f12044f = z2;
        if (i < 2) {
            this.f12045g = true == z3 ? 3 : 1;
        } else {
            this.f12045g = i2;
        }
    }

    /* renamed from: v */
    public boolean mo11617v() {
        return this.f12045g == 3;
    }

    /* renamed from: w */
    public boolean mo11618w() {
        return this.f12043e;
    }

    public void writeToParcel(Parcel parcel, int i) {
        int a = C7461a.m28369a(parcel);
        C7461a.m28372d(parcel, 1, mo11618w());
        C7461a.m28372d(parcel, 2, mo11620x());
        C7461a.m28372d(parcel, 3, mo11617v());
        C7461a.m28383o(parcel, 4, this.f12045g);
        C7461a.m28383o(parcel, 1000, this.f12042d);
        C7461a.m28370b(parcel, a);
    }

    /* renamed from: x */
    public boolean mo11620x() {
        return this.f12044f;
    }
}
