package com.google.android.gms.auth.api.identity;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.List;
import p182n6.C7258g;
import p195o6.C7461a;

public class SaveAccountLinkingTokenRequest extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<SaveAccountLinkingTokenRequest> CREATOR = new C3815h();

    /* renamed from: d */
    private final PendingIntent f12101d;

    /* renamed from: e */
    private final String f12102e;

    /* renamed from: f */
    private final String f12103f;

    /* renamed from: g */
    private final List f12104g;

    /* renamed from: h */
    private final String f12105h;

    /* renamed from: i */
    private final int f12106i;

    SaveAccountLinkingTokenRequest(PendingIntent pendingIntent, String str, String str2, List list, String str3, int i) {
        this.f12101d = pendingIntent;
        this.f12102e = str;
        this.f12103f = str2;
        this.f12104g = list;
        this.f12105h = str3;
        this.f12106i = i;
    }

    /* renamed from: R */
    public String mo11698R() {
        return this.f12102e;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof SaveAccountLinkingTokenRequest)) {
            return false;
        }
        SaveAccountLinkingTokenRequest saveAccountLinkingTokenRequest = (SaveAccountLinkingTokenRequest) obj;
        if (this.f12104g.size() != saveAccountLinkingTokenRequest.f12104g.size() || !this.f12104g.containsAll(saveAccountLinkingTokenRequest.f12104g) || !C7258g.m27880a(this.f12101d, saveAccountLinkingTokenRequest.f12101d) || !C7258g.m27880a(this.f12102e, saveAccountLinkingTokenRequest.f12102e) || !C7258g.m27880a(this.f12103f, saveAccountLinkingTokenRequest.f12103f) || !C7258g.m27880a(this.f12105h, saveAccountLinkingTokenRequest.f12105h) || this.f12106i != saveAccountLinkingTokenRequest.f12106i) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return C7258g.m27881b(this.f12101d, this.f12102e, this.f12103f, this.f12104g, this.f12105h);
    }

    /* renamed from: v */
    public PendingIntent mo11701v() {
        return this.f12101d;
    }

    /* renamed from: w */
    public List mo11702w() {
        return this.f12104g;
    }

    public void writeToParcel(Parcel parcel, int i) {
        int a = C7461a.m28369a(parcel);
        C7461a.m28390v(parcel, 1, mo11701v(), i, false);
        C7461a.m28392x(parcel, 2, mo11698R(), false);
        C7461a.m28392x(parcel, 3, mo11704x(), false);
        C7461a.m28394z(parcel, 4, mo11702w(), false);
        C7461a.m28392x(parcel, 5, this.f12105h, false);
        C7461a.m28383o(parcel, 6, this.f12106i);
        C7461a.m28370b(parcel, a);
    }

    /* renamed from: x */
    public String mo11704x() {
        return this.f12103f;
    }
}
