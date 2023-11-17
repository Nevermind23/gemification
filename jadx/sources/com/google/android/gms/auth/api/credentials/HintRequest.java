package com.google.android.gms.auth.api.credentials;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import p182n6.C7264i;
import p195o6.C7461a;

@Deprecated
public final class HintRequest extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<HintRequest> CREATOR = new C3805d();

    /* renamed from: d */
    final int f12058d;

    /* renamed from: e */
    private final CredentialPickerConfig f12059e;

    /* renamed from: f */
    private final boolean f12060f;

    /* renamed from: g */
    private final boolean f12061g;

    /* renamed from: h */
    private final String[] f12062h;

    /* renamed from: i */
    private final boolean f12063i;

    /* renamed from: j */
    private final String f12064j;

    /* renamed from: k */
    private final String f12065k;

    HintRequest(int i, CredentialPickerConfig credentialPickerConfig, boolean z, boolean z2, String[] strArr, boolean z3, String str, String str2) {
        this.f12058d = i;
        this.f12059e = (CredentialPickerConfig) C7264i.m27902k(credentialPickerConfig);
        this.f12060f = z;
        this.f12061g = z2;
        this.f12062h = (String[]) C7264i.m27902k(strArr);
        if (i < 2) {
            this.f12063i = true;
            this.f12064j = null;
            this.f12065k = null;
            return;
        }
        this.f12063i = z3;
        this.f12064j = str;
        this.f12065k = str2;
    }

    /* renamed from: R */
    public String mo11630R() {
        return this.f12064j;
    }

    /* renamed from: f0 */
    public boolean mo11631f0() {
        return this.f12060f;
    }

    /* renamed from: q0 */
    public boolean mo11632q0() {
        return this.f12063i;
    }

    /* renamed from: v */
    public String[] mo11633v() {
        return this.f12062h;
    }

    /* renamed from: w */
    public CredentialPickerConfig mo11634w() {
        return this.f12059e;
    }

    public void writeToParcel(Parcel parcel, int i) {
        int a = C7461a.m28369a(parcel);
        C7461a.m28390v(parcel, 1, mo11634w(), i, false);
        C7461a.m28372d(parcel, 2, mo11631f0());
        C7461a.m28372d(parcel, 3, this.f12061g);
        C7461a.m28393y(parcel, 4, mo11633v(), false);
        C7461a.m28372d(parcel, 5, mo11632q0());
        C7461a.m28392x(parcel, 6, mo11630R(), false);
        C7461a.m28392x(parcel, 7, mo11636x(), false);
        C7461a.m28383o(parcel, 1000, this.f12058d);
        C7461a.m28370b(parcel, a);
    }

    /* renamed from: x */
    public String mo11636x() {
        return this.f12065k;
    }
}
