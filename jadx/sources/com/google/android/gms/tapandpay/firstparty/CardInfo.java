package com.google.android.gms.tapandpay.firstparty;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;
import java.util.List;
import p157l7.C7006s;
import p182n6.C7258g;
import p195o6.C7461a;

public final class CardInfo extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<CardInfo> CREATOR = new C4877j();

    /* renamed from: O */
    private static final C7006s f15157O = C7006s.m27146o(10, 9);

    /* renamed from: A */
    List f15158A;

    /* renamed from: B */
    boolean f15159B;

    /* renamed from: C */
    boolean f15160C;

    /* renamed from: D */
    long f15161D;

    /* renamed from: E */
    long f15162E;

    /* renamed from: F */
    boolean f15163F;

    /* renamed from: G */
    long f15164G;

    /* renamed from: H */
    String f15165H;

    /* renamed from: I */
    String f15166I;

    /* renamed from: J */
    zze f15167J;

    /* renamed from: K */
    int f15168K;

    /* renamed from: L */
    boolean f15169L;

    /* renamed from: M */
    String f15170M;

    /* renamed from: N */
    int f15171N;

    /* renamed from: d */
    String f15172d;

    /* renamed from: e */
    byte[] f15173e;

    /* renamed from: f */
    String f15174f;

    /* renamed from: g */
    String f15175g;

    /* renamed from: h */
    int f15176h;

    /* renamed from: i */
    TokenStatus f15177i;

    /* renamed from: j */
    String f15178j;

    /* renamed from: k */
    Uri f15179k;

    /* renamed from: l */
    int f15180l;

    /* renamed from: m */
    int f15181m;

    /* renamed from: n */
    zzaj f15182n;

    /* renamed from: o */
    String f15183o;

    /* renamed from: p */
    zzaz f15184p;

    /* renamed from: q */
    String f15185q;

    /* renamed from: r */
    byte[] f15186r;

    /* renamed from: s */
    int f15187s;

    /* renamed from: t */
    int f15188t;

    /* renamed from: u */
    int f15189u;

    /* renamed from: v */
    zzah f15190v;

    /* renamed from: w */
    zzaf f15191w;

    /* renamed from: x */
    String f15192x;

    /* renamed from: y */
    zzan[] f15193y;

    /* renamed from: z */
    boolean f15194z;

    CardInfo(String str, byte[] bArr, String str2, String str3, int i, TokenStatus tokenStatus, String str4, Uri uri, int i2, int i3, zzaj zzaj, String str5, zzaz zzaz, String str6, byte[] bArr2, int i4, int i5, int i6, zzah zzah, zzaf zzaf, String str7, zzan[] zzanArr, boolean z, List list, boolean z2, boolean z3, long j, long j2, boolean z4, long j3, String str8, String str9, zze zze, int i7, boolean z5, String str10, int i8) {
        this.f15172d = str;
        this.f15173e = bArr;
        this.f15174f = str2;
        this.f15175g = str3;
        this.f15176h = i;
        this.f15177i = tokenStatus;
        this.f15178j = str4;
        this.f15179k = uri;
        this.f15180l = i2;
        this.f15181m = i3;
        this.f15182n = zzaj;
        this.f15183o = str5;
        this.f15184p = zzaz;
        this.f15185q = str6;
        this.f15186r = bArr2;
        this.f15187s = i4;
        this.f15188t = i5;
        this.f15189u = i6;
        this.f15190v = zzah;
        this.f15191w = zzaf;
        this.f15192x = str7;
        this.f15193y = zzanArr;
        this.f15194z = z;
        this.f15158A = list;
        this.f15159B = z2;
        this.f15160C = z3;
        this.f15161D = j;
        this.f15162E = j2;
        this.f15163F = z4;
        this.f15164G = j3;
        this.f15165H = str8;
        this.f15166I = str9;
        this.f15167J = zze;
        this.f15168K = i7;
        this.f15169L = z5;
        this.f15170M = str10;
        this.f15171N = i8;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof CardInfo) {
            CardInfo cardInfo = (CardInfo) obj;
            if (!C7258g.m27880a(this.f15172d, cardInfo.f15172d) || !Arrays.equals(this.f15173e, cardInfo.f15173e) || !C7258g.m27880a(this.f15174f, cardInfo.f15174f) || !C7258g.m27880a(this.f15175g, cardInfo.f15175g) || this.f15176h != cardInfo.f15176h || !C7258g.m27880a(this.f15177i, cardInfo.f15177i) || !C7258g.m27880a(this.f15178j, cardInfo.f15178j) || !C7258g.m27880a(this.f15179k, cardInfo.f15179k) || this.f15180l != cardInfo.f15180l || this.f15181m != cardInfo.f15181m || !C7258g.m27880a(this.f15182n, cardInfo.f15182n) || !C7258g.m27880a(this.f15183o, cardInfo.f15183o) || !C7258g.m27880a(this.f15184p, cardInfo.f15184p) || this.f15187s != cardInfo.f15187s || this.f15188t != cardInfo.f15188t || this.f15189u != cardInfo.f15189u || !C7258g.m27880a(this.f15190v, cardInfo.f15190v) || !C7258g.m27880a(this.f15191w, cardInfo.f15191w) || !C7258g.m27880a(this.f15192x, cardInfo.f15192x) || !Arrays.equals(this.f15193y, cardInfo.f15193y) || this.f15194z != cardInfo.f15194z || !C7258g.m27880a(this.f15158A, cardInfo.f15158A) || this.f15159B != cardInfo.f15159B || this.f15160C != cardInfo.f15160C || this.f15161D != cardInfo.f15161D || this.f15163F != cardInfo.f15163F || this.f15164G != cardInfo.f15164G || !C7258g.m27880a(this.f15165H, cardInfo.f15165H) || !C7258g.m27880a(this.f15166I, cardInfo.f15166I) || !C7258g.m27880a(this.f15167J, cardInfo.f15167J) || this.f15168K != cardInfo.f15168K || this.f15169L != cardInfo.f15169L || this.f15171N != cardInfo.f15171N) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return C7258g.m27881b(this.f15172d, this.f15173e, this.f15174f, this.f15175g, Integer.valueOf(this.f15176h), this.f15177i, this.f15178j, this.f15179k, Integer.valueOf(this.f15180l), Integer.valueOf(this.f15181m), this.f15183o, this.f15184p, Integer.valueOf(this.f15187s), Integer.valueOf(this.f15188t), Integer.valueOf(this.f15189u), this.f15190v, this.f15191w, this.f15192x, this.f15193y, Boolean.valueOf(this.f15194z), this.f15158A, Boolean.valueOf(this.f15159B), Boolean.valueOf(this.f15160C), Long.valueOf(this.f15161D), Boolean.valueOf(this.f15163F), Long.valueOf(this.f15164G), this.f15165H, this.f15166I, this.f15167J, Integer.valueOf(this.f15168K), Boolean.valueOf(this.f15169L), Integer.valueOf(this.f15171N));
    }

    public final String toString() {
        String str;
        String str2;
        String str3;
        C7258g.C7259a a = C7258g.m27882c(this).mo21632a("billingCardId", this.f15172d);
        byte[] bArr = this.f15173e;
        String str4 = null;
        if (bArr == null) {
            str = null;
        } else {
            str = Arrays.toString(bArr);
        }
        C7258g.C7259a a2 = a.mo21632a("serverToken", str).mo21632a("cardholderName", this.f15174f).mo21632a("displayName", this.f15175g).mo21632a("cardNetwork", Integer.valueOf(this.f15176h)).mo21632a("tokenStatus", this.f15177i).mo21632a("panLastDigits", this.f15178j).mo21632a("cardImageUrl", this.f15179k).mo21632a("cardColor", Integer.valueOf(this.f15180l)).mo21632a("overlayTextColor", Integer.valueOf(this.f15181m));
        zzaj zzaj = this.f15182n;
        if (zzaj == null) {
            str2 = null;
        } else {
            str2 = zzaj.toString();
        }
        C7258g.C7259a a3 = a2.mo21632a("issuerInfo", str2).mo21632a("tokenLastDigits", this.f15183o).mo21632a("transactionInfo", this.f15184p).mo21632a("issuerTokenId", this.f15185q);
        byte[] bArr2 = this.f15186r;
        if (bArr2 == null) {
            str3 = null;
        } else {
            str3 = Arrays.toString(bArr2);
        }
        C7258g.C7259a a4 = a3.mo21632a("inAppCardToken", str3).mo21632a("cachedEligibility", Integer.valueOf(this.f15187s)).mo21632a("paymentProtocol", Integer.valueOf(this.f15188t)).mo21632a("tokenType", Integer.valueOf(this.f15189u)).mo21632a("inStoreCvmConfig", this.f15190v).mo21632a("inAppCvmConfig", this.f15191w).mo21632a("tokenDisplayName", this.f15192x);
        zzan[] zzanArr = this.f15193y;
        if (zzanArr != null) {
            str4 = Arrays.toString(zzanArr);
        }
        return a4.mo21632a("onlineAccountCardLinkInfos", str4).mo21632a("allowAidSelection", Boolean.valueOf(this.f15194z)).mo21632a("badges", "[" + TextUtils.join(", ", this.f15158A) + "]").mo21632a("upgradeAvailable", Boolean.valueOf(this.f15159B)).mo21632a("requiresSignature", Boolean.valueOf(this.f15160C)).mo21632a("googleTokenId", Long.valueOf(this.f15161D)).mo21632a("isTransit", Boolean.valueOf(this.f15163F)).mo21632a("googleWalletId", Long.valueOf(this.f15164G)).mo21632a("devicePaymentMethodId", this.f15165H).mo21632a("cloudPaymentMethodId", this.f15166I).toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C7461a.m28369a(parcel);
        C7461a.m28392x(parcel, 2, this.f15172d, false);
        C7461a.m28376h(parcel, 3, this.f15173e, false);
        C7461a.m28392x(parcel, 4, this.f15174f, false);
        C7461a.m28392x(parcel, 5, this.f15175g, false);
        C7461a.m28383o(parcel, 6, this.f15176h);
        C7461a.m28390v(parcel, 7, this.f15177i, i, false);
        C7461a.m28392x(parcel, 8, this.f15178j, false);
        C7461a.m28390v(parcel, 9, this.f15179k, i, false);
        C7461a.m28383o(parcel, 10, this.f15180l);
        C7461a.m28383o(parcel, 11, this.f15181m);
        C7461a.m28390v(parcel, 12, this.f15182n, i, false);
        C7461a.m28392x(parcel, 13, this.f15183o, false);
        C7461a.m28390v(parcel, 15, this.f15184p, i, false);
        C7461a.m28392x(parcel, 16, this.f15185q, false);
        C7461a.m28376h(parcel, 17, this.f15186r, false);
        C7461a.m28383o(parcel, 18, this.f15187s);
        C7461a.m28383o(parcel, 20, this.f15188t);
        C7461a.m28383o(parcel, 21, this.f15189u);
        C7461a.m28390v(parcel, 22, this.f15190v, i, false);
        C7461a.m28390v(parcel, 23, this.f15191w, i, false);
        C7461a.m28392x(parcel, 24, this.f15192x, false);
        C7461a.m28363B(parcel, 25, this.f15193y, i, false);
        C7461a.m28372d(parcel, 26, this.f15194z);
        C7461a.m28364C(parcel, 27, this.f15158A, false);
        C7461a.m28372d(parcel, 28, this.f15159B);
        C7461a.m28372d(parcel, 29, this.f15160C);
        C7461a.m28387s(parcel, 30, this.f15161D);
        C7461a.m28387s(parcel, 31, this.f15162E);
        C7461a.m28372d(parcel, 32, this.f15163F);
        C7461a.m28387s(parcel, 33, this.f15164G);
        C7461a.m28392x(parcel, 34, this.f15165H, false);
        C7461a.m28392x(parcel, 35, this.f15166I, false);
        C7461a.m28390v(parcel, 36, this.f15167J, i, false);
        C7461a.m28383o(parcel, 37, this.f15168K);
        C7461a.m28372d(parcel, 38, this.f15169L);
        C7461a.m28392x(parcel, 39, this.f15170M, false);
        C7461a.m28383o(parcel, 40, this.f15171N);
        C7461a.m28370b(parcel, a);
    }
}
