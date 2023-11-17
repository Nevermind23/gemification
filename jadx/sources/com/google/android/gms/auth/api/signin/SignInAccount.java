package com.google.android.gms.auth.api.signin;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import p182n6.C7264i;
import p195o6.C7461a;

public class SignInAccount extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<SignInAccount> CREATOR = new C3827g();

    /* renamed from: d */
    final String f12186d;

    /* renamed from: e */
    private final GoogleSignInAccount f12187e;

    /* renamed from: f */
    final String f12188f;

    SignInAccount(String str, GoogleSignInAccount googleSignInAccount, String str2) {
        this.f12187e = googleSignInAccount;
        this.f12186d = C7264i.m27899h(str, "8.3 and 8.4 SDKs require non-null email");
        this.f12188f = C7264i.m27899h(str2, "8.3 and 8.4 SDKs require non-null userId");
    }

    /* renamed from: v */
    public final GoogleSignInAccount mo11793v() {
        return this.f12187e;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C7461a.m28369a(parcel);
        C7461a.m28392x(parcel, 4, this.f12186d, false);
        C7461a.m28390v(parcel, 7, this.f12187e, i, false);
        C7461a.m28392x(parcel, 8, this.f12188f, false);
        C7461a.m28370b(parcel, a);
    }
}
