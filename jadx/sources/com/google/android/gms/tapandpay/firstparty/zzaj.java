package com.google.android.gms.tapandpay.firstparty;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import p182n6.C7258g;
import p195o6.C7461a;

public final class zzaj extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzaj> CREATOR = new C4870c();

    /* renamed from: d */
    final String f15216d;

    /* renamed from: e */
    final String f15217e;

    /* renamed from: f */
    final String f15218f;

    /* renamed from: g */
    final String f15219g;

    /* renamed from: h */
    final String f15220h;

    /* renamed from: i */
    final String f15221i;

    /* renamed from: j */
    final String f15222j;

    /* renamed from: k */
    final String f15223k;

    /* renamed from: l */
    final String f15224l;

    /* renamed from: m */
    final String f15225m;

    /* renamed from: n */
    final String f15226n;

    /* renamed from: o */
    final String f15227o;

    /* renamed from: p */
    final String f15228p;

    /* renamed from: q */
    final long f15229q;

    /* renamed from: r */
    final String f15230r;

    /* renamed from: s */
    final String f15231s;

    /* renamed from: t */
    final String f15232t;

    /* renamed from: u */
    final String f15233u;

    /* renamed from: v */
    final String f15234v;

    /* renamed from: w */
    final String f15235w;

    /* renamed from: x */
    final String f15236x;

    /* renamed from: y */
    final int f15237y;

    zzaj(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, long j, String str14, String str15, String str16, String str17, String str18, String str19, String str20, int i) {
        this.f15216d = str;
        this.f15217e = str2;
        this.f15218f = str3;
        this.f15219g = str4;
        this.f15220h = str5;
        this.f15221i = str6;
        this.f15222j = str7;
        this.f15223k = str8;
        this.f15224l = str9;
        this.f15225m = str10;
        this.f15226n = str11;
        this.f15227o = str12;
        this.f15228p = str13;
        this.f15229q = j;
        this.f15230r = str14;
        this.f15231s = str15;
        this.f15232t = str16;
        this.f15233u = str17;
        this.f15234v = str18;
        this.f15235w = str19;
        this.f15236x = str20;
        this.f15237y = i;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof zzaj) {
            zzaj zzaj = (zzaj) obj;
            if (!C7258g.m27880a(this.f15216d, zzaj.f15216d) || !C7258g.m27880a(this.f15217e, zzaj.f15217e) || !C7258g.m27880a(this.f15218f, zzaj.f15218f) || !C7258g.m27880a(this.f15219g, zzaj.f15219g) || !C7258g.m27880a(this.f15220h, zzaj.f15220h) || !C7258g.m27880a(this.f15221i, zzaj.f15221i) || !C7258g.m27880a(this.f15222j, zzaj.f15222j) || !C7258g.m27880a(this.f15223k, zzaj.f15223k) || !C7258g.m27880a(this.f15224l, zzaj.f15224l) || !C7258g.m27880a(this.f15225m, zzaj.f15225m) || !C7258g.m27880a(this.f15226n, zzaj.f15226n) || !C7258g.m27880a(this.f15227o, zzaj.f15227o) || !C7258g.m27880a(this.f15228p, zzaj.f15228p) || this.f15229q != zzaj.f15229q || !C7258g.m27880a(this.f15230r, zzaj.f15230r) || !C7258g.m27880a(this.f15231s, zzaj.f15231s) || !C7258g.m27880a(this.f15232t, zzaj.f15232t) || !C7258g.m27880a(this.f15233u, zzaj.f15233u) || !C7258g.m27880a(this.f15234v, zzaj.f15234v) || !C7258g.m27880a(this.f15235w, zzaj.f15235w) || !C7258g.m27880a(this.f15236x, zzaj.f15236x) || !C7258g.m27880a(Integer.valueOf(this.f15237y), Integer.valueOf(zzaj.f15237y))) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return C7258g.m27881b(this.f15216d, this.f15217e, this.f15218f, this.f15219g, this.f15220h, this.f15221i, this.f15222j, this.f15223k, this.f15224l, this.f15225m, this.f15226n, this.f15227o, this.f15228p, Long.valueOf(this.f15229q), this.f15230r, this.f15231s, this.f15232t, this.f15233u, this.f15234v, this.f15235w, this.f15236x, Integer.valueOf(this.f15237y));
    }

    public final String toString() {
        return C7258g.m27882c(this).mo21632a("issuerName", this.f15216d).mo21632a("issuerPhoneNumber", this.f15217e).mo21632a("appLogoUrl", this.f15218f).mo21632a("appName", this.f15219g).mo21632a("appDeveloperName", this.f15220h).mo21632a("appPackageName", this.f15221i).mo21632a("privacyNoticeUrl", this.f15222j).mo21632a("termsAndConditionsUrl", this.f15223k).mo21632a("productShortName", this.f15224l).mo21632a("appAction", this.f15225m).mo21632a("appIntentExtraMessage", this.f15226n).mo21632a("issuerMessageHeadline", this.f15227o).mo21632a("issuerMessageBody", this.f15228p).mo21632a("issuerMessageExpiryTimestampMillis", Long.valueOf(this.f15229q)).mo21632a("issuerMessageLinkPackageName", this.f15230r).mo21632a("issuerMessageLinkAction", this.f15231s).mo21632a("issuerMessageLinkExtraText", this.f15232t).mo21632a("issuerMessageLinkUrl", this.f15233u).mo21632a("issuerMessageLinkText", this.f15234v).mo21632a("issuerWebLinkUrl", this.f15235w).mo21632a("issuerWebLinkText", this.f15236x).mo21632a("issuerMessageType", Integer.valueOf(this.f15237y)).toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C7461a.m28369a(parcel);
        C7461a.m28392x(parcel, 2, this.f15216d, false);
        C7461a.m28392x(parcel, 3, this.f15217e, false);
        C7461a.m28392x(parcel, 4, this.f15218f, false);
        C7461a.m28392x(parcel, 5, this.f15219g, false);
        C7461a.m28392x(parcel, 6, this.f15220h, false);
        C7461a.m28392x(parcel, 7, this.f15221i, false);
        C7461a.m28392x(parcel, 8, this.f15222j, false);
        C7461a.m28392x(parcel, 9, this.f15223k, false);
        C7461a.m28392x(parcel, 10, this.f15224l, false);
        C7461a.m28392x(parcel, 11, this.f15225m, false);
        C7461a.m28392x(parcel, 12, this.f15226n, false);
        C7461a.m28392x(parcel, 13, this.f15227o, false);
        C7461a.m28392x(parcel, 14, this.f15228p, false);
        C7461a.m28387s(parcel, 15, this.f15229q);
        C7461a.m28392x(parcel, 16, this.f15230r, false);
        C7461a.m28392x(parcel, 17, this.f15231s, false);
        C7461a.m28392x(parcel, 18, this.f15232t, false);
        C7461a.m28392x(parcel, 20, this.f15233u, false);
        C7461a.m28392x(parcel, 21, this.f15234v, false);
        C7461a.m28392x(parcel, 22, this.f15235w, false);
        C7461a.m28392x(parcel, 23, this.f15236x, false);
        C7461a.m28383o(parcel, 24, this.f15237y);
        C7461a.m28370b(parcel, a);
    }
}
