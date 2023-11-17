package com.google.android.gms.auth.api.identity;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import p037c6.C2268d;
import p182n6.C7258g;
import p182n6.C7264i;
import p195o6.C7461a;

public class SignInPassword extends AbstractSafeParcelable {
    public static final Parcelable.Creator<SignInPassword> CREATOR = new C2268d();

    /* renamed from: d */
    private final String f12121d;

    /* renamed from: e */
    private final String f12122e;

    public SignInPassword(String str, String str2) {
        this.f12121d = C7264i.m27899h(((String) C7264i.m27903l(str, "Account identifier cannot be null")).trim(), "Account identifier cannot be empty");
        this.f12122e = C7264i.m27898g(str2);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof SignInPassword)) {
            return false;
        }
        SignInPassword signInPassword = (SignInPassword) obj;
        if (!C7258g.m27880a(this.f12121d, signInPassword.f12121d) || !C7258g.m27880a(this.f12122e, signInPassword.f12122e)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return C7258g.m27881b(this.f12121d, this.f12122e);
    }

    /* renamed from: v */
    public String mo11731v() {
        return this.f12121d;
    }

    /* renamed from: w */
    public String mo11732w() {
        return this.f12122e;
    }

    public void writeToParcel(Parcel parcel, int i) {
        int a = C7461a.m28369a(parcel);
        C7461a.m28392x(parcel, 1, mo11731v(), false);
        C7461a.m28392x(parcel, 2, mo11732w(), false);
        C7461a.m28370b(parcel, a);
    }
}
