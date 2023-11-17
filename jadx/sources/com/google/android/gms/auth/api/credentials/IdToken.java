package com.google.android.gms.auth.api.credentials;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import p024b6.C2165b;
import p182n6.C7258g;
import p182n6.C7264i;
import p195o6.C7461a;

@Deprecated
public final class IdToken extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<IdToken> CREATOR = new C2165b();

    /* renamed from: d */
    private final String f12066d;

    /* renamed from: e */
    private final String f12067e;

    public IdToken(String str, String str2) {
        C7264i.m27893b(!TextUtils.isEmpty(str), "account type string cannot be null or empty");
        C7264i.m27893b(!TextUtils.isEmpty(str2), "id token string cannot be null or empty");
        this.f12066d = str;
        this.f12067e = str2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof IdToken)) {
            return false;
        }
        IdToken idToken = (IdToken) obj;
        if (!C7258g.m27880a(this.f12066d, idToken.f12066d) || !C7258g.m27880a(this.f12067e, idToken.f12067e)) {
            return false;
        }
        return true;
    }

    /* renamed from: v */
    public String mo11638v() {
        return this.f12066d;
    }

    /* renamed from: w */
    public String mo11639w() {
        return this.f12067e;
    }

    public void writeToParcel(Parcel parcel, int i) {
        int a = C7461a.m28369a(parcel);
        C7461a.m28392x(parcel, 1, mo11638v(), false);
        C7461a.m28392x(parcel, 2, mo11639w(), false);
        C7461a.m28370b(parcel, a);
    }
}
