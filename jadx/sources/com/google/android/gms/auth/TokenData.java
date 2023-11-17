package com.google.android.gms.auth;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.List;
import p182n6.C7258g;
import p182n6.C7264i;
import p195o6.C7461a;

public class TokenData extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<TokenData> CREATOR = new C3832d();

    /* renamed from: d */
    final int f11995d;

    /* renamed from: e */
    private final String f11996e;

    /* renamed from: f */
    private final Long f11997f;

    /* renamed from: g */
    private final boolean f11998g;

    /* renamed from: h */
    private final boolean f11999h;

    /* renamed from: i */
    private final List f12000i;

    /* renamed from: j */
    private final String f12001j;

    TokenData(int i, String str, Long l, boolean z, boolean z2, List list, String str2) {
        this.f11995d = i;
        this.f11996e = C7264i.m27898g(str);
        this.f11997f = l;
        this.f11998g = z;
        this.f11999h = z2;
        this.f12000i = list;
        this.f12001j = str2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof TokenData)) {
            return false;
        }
        TokenData tokenData = (TokenData) obj;
        if (!TextUtils.equals(this.f11996e, tokenData.f11996e) || !C7258g.m27880a(this.f11997f, tokenData.f11997f) || this.f11998g != tokenData.f11998g || this.f11999h != tokenData.f11999h || !C7258g.m27880a(this.f12000i, tokenData.f12000i) || !C7258g.m27880a(this.f12001j, tokenData.f12001j)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return C7258g.m27881b(this.f11996e, this.f11997f, Boolean.valueOf(this.f11998g), Boolean.valueOf(this.f11999h), this.f12000i, this.f12001j);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C7461a.m28369a(parcel);
        C7461a.m28383o(parcel, 1, this.f11995d);
        C7461a.m28392x(parcel, 2, this.f11996e, false);
        C7461a.m28388t(parcel, 3, this.f11997f, false);
        C7461a.m28372d(parcel, 4, this.f11998g);
        C7461a.m28372d(parcel, 5, this.f11999h);
        C7461a.m28394z(parcel, 6, this.f12000i, false);
        C7461a.m28392x(parcel, 7, this.f12001j, false);
        C7461a.m28370b(parcel, a);
    }
}
