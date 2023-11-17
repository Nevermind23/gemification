package com.google.android.gms.auth.api.signin.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import p091g6.C6228a;
import p091g6.C6248u;
import p182n6.C7264i;
import p195o6.C7461a;

public final class SignInConfiguration extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<SignInConfiguration> CREATOR = new C6248u();

    /* renamed from: d */
    private final String f12194d;

    /* renamed from: e */
    private final GoogleSignInOptions f12195e;

    public SignInConfiguration(String str, GoogleSignInOptions googleSignInOptions) {
        this.f12194d = C7264i.m27898g(str);
        this.f12195e = googleSignInOptions;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof SignInConfiguration)) {
            return false;
        }
        SignInConfiguration signInConfiguration = (SignInConfiguration) obj;
        if (this.f12194d.equals(signInConfiguration.f12194d)) {
            GoogleSignInOptions googleSignInOptions = this.f12195e;
            GoogleSignInOptions googleSignInOptions2 = signInConfiguration.f12195e;
            if (googleSignInOptions == null) {
                if (googleSignInOptions2 == null) {
                    return true;
                }
            } else if (!googleSignInOptions.equals(googleSignInOptions2)) {
                return false;
            } else {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return new C6228a().mo19835a(this.f12194d).mo19835a(this.f12195e).mo19836b();
    }

    /* renamed from: v */
    public final GoogleSignInOptions mo11809v() {
        return this.f12195e;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C7461a.m28369a(parcel);
        C7461a.m28392x(parcel, 2, this.f12194d, false);
        C7461a.m28390v(parcel, 5, this.f12195e, i, false);
        C7461a.m28370b(parcel, a);
    }
}
