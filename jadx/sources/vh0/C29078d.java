package vh0;

import com.salesforce.marketingcloud.C11398b;
import java.math.BigDecimal;
import kotlin.jvm.internal.C41536l;
import p190o1.C7397t;
import xh0.C29790g;
import xh0.C29793j;
import xh0.C29796l;

/* renamed from: vh0.d */
public final class C29078d {

    /* renamed from: a */
    private final long f74069a;

    /* renamed from: b */
    private final Long f74070b;

    /* renamed from: c */
    private final Long f74071c;

    /* renamed from: d */
    private final String f74072d;

    /* renamed from: e */
    private final C29075a f74073e;

    /* renamed from: f */
    private final boolean f74074f;

    /* renamed from: g */
    private final String f74075g;

    /* renamed from: h */
    private final BigDecimal f74076h;

    /* renamed from: i */
    private final long f74077i;

    /* renamed from: j */
    private final Long f74078j;

    /* renamed from: k */
    private final boolean f74079k;

    /* renamed from: l */
    private final String f74080l;

    /* renamed from: m */
    private final boolean f74081m;

    /* renamed from: n */
    private final C29790g f74082n;

    /* renamed from: o */
    private final String f74083o;

    /* renamed from: p */
    private final String f74084p;

    /* renamed from: q */
    private final C29793j f74085q;

    /* renamed from: r */
    private final C29796l f74086r;

    /* renamed from: s */
    private final C29076b f74087s;

    /* renamed from: t */
    private final String f74088t;

    public C29078d(long j, Long l, Long l2, String str, C29075a aVar, boolean z, String str2, BigDecimal bigDecimal, long j2, Long l3, boolean z2, String str3, boolean z3, C29790g gVar, String str4, String str5, C29793j jVar, C29796l lVar, C29076b bVar, String str6) {
        String str7 = str3;
        C29076b bVar2 = bVar;
        String str8 = str6;
        C41536l.m120489i(str, "phoneNumber");
        C41536l.m120489i(str7, "nominationText");
        C41536l.m120489i(bVar2, "giftCardFlowMode");
        C41536l.m120489i(str8, "owner");
        this.f74069a = j;
        this.f74070b = l;
        this.f74071c = l2;
        this.f74072d = str;
        this.f74073e = aVar;
        this.f74074f = z;
        this.f74075g = str2;
        this.f74076h = bigDecimal;
        this.f74077i = j2;
        this.f74078j = l3;
        this.f74079k = z2;
        this.f74080l = str7;
        this.f74081m = z3;
        this.f74082n = gVar;
        this.f74083o = str4;
        this.f74084p = str5;
        this.f74085q = jVar;
        this.f74086r = lVar;
        this.f74087s = bVar2;
        this.f74088t = str8;
    }

    /* renamed from: b */
    public static /* synthetic */ C29078d m88927b(C29078d dVar, long j, Long l, Long l2, String str, C29075a aVar, boolean z, String str2, BigDecimal bigDecimal, long j2, Long l3, boolean z2, String str3, boolean z3, C29790g gVar, String str4, String str5, C29793j jVar, C29796l lVar, C29076b bVar, String str6, int i, Object obj) {
        C29078d dVar2 = dVar;
        int i2 = i;
        return dVar.mo68935a((i2 & 1) != 0 ? dVar2.f74069a : j, (i2 & 2) != 0 ? dVar2.f74070b : l, (i2 & 4) != 0 ? dVar2.f74071c : l2, (i2 & 8) != 0 ? dVar2.f74072d : str, (i2 & 16) != 0 ? dVar2.f74073e : aVar, (i2 & 32) != 0 ? dVar2.f74074f : z, (i2 & 64) != 0 ? dVar2.f74075g : str2, (i2 & 128) != 0 ? dVar2.f74076h : bigDecimal, (i2 & C11398b.f33139r) != 0 ? dVar2.f74077i : j2, (i2 & C11398b.f33140s) != 0 ? dVar2.f74078j : l3, (i2 & C11398b.f33141t) != 0 ? dVar2.f74079k : z2, (i2 & C11398b.f33142u) != 0 ? dVar2.f74080l : str3, (i2 & C11398b.f33143v) != 0 ? dVar2.f74081m : z3, (i2 & 8192) != 0 ? dVar2.f74082n : gVar, (i2 & 16384) != 0 ? dVar2.f74083o : str4, (i2 & 32768) != 0 ? dVar2.f74084p : str5, (i2 & 65536) != 0 ? dVar2.f74085q : jVar, (i2 & 131072) != 0 ? dVar2.f74086r : lVar, (i2 & 262144) != 0 ? dVar2.f74087s : bVar, (i2 & 524288) != 0 ? dVar2.f74088t : str6);
    }

    /* renamed from: a */
    public final C29078d mo68935a(long j, Long l, Long l2, String str, C29075a aVar, boolean z, String str2, BigDecimal bigDecimal, long j2, Long l3, boolean z2, String str3, boolean z3, C29790g gVar, String str4, String str5, C29793j jVar, C29796l lVar, C29076b bVar, String str6) {
        long j3 = j;
        C41536l.m120489i(str, "phoneNumber");
        C41536l.m120489i(str3, "nominationText");
        C41536l.m120489i(bVar, "giftCardFlowMode");
        C41536l.m120489i(str6, "owner");
        return new C29078d(j, l, l2, str, aVar, z, str2, bigDecimal, j2, l3, z2, str3, z3, gVar, str4, str5, jVar, lVar, bVar, str6);
    }

    /* renamed from: c */
    public final String mo68936c() {
        return this.f74083o;
    }

    /* renamed from: d */
    public final String mo68937d() {
        return this.f74075g;
    }

    /* renamed from: e */
    public final Long mo68938e() {
        return this.f74078j;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C29078d)) {
            return false;
        }
        C29078d dVar = (C29078d) obj;
        return this.f74069a == dVar.f74069a && C41536l.m120484d(this.f74070b, dVar.f74070b) && C41536l.m120484d(this.f74071c, dVar.f74071c) && C41536l.m120484d(this.f74072d, dVar.f74072d) && C41536l.m120484d(this.f74073e, dVar.f74073e) && this.f74074f == dVar.f74074f && C41536l.m120484d(this.f74075g, dVar.f74075g) && C41536l.m120484d(this.f74076h, dVar.f74076h) && this.f74077i == dVar.f74077i && C41536l.m120484d(this.f74078j, dVar.f74078j) && this.f74079k == dVar.f74079k && C41536l.m120484d(this.f74080l, dVar.f74080l) && this.f74081m == dVar.f74081m && this.f74082n == dVar.f74082n && C41536l.m120484d(this.f74083o, dVar.f74083o) && C41536l.m120484d(this.f74084p, dVar.f74084p) && C41536l.m120484d(this.f74085q, dVar.f74085q) && C41536l.m120484d(this.f74086r, dVar.f74086r) && this.f74087s == dVar.f74087s && C41536l.m120484d(this.f74088t, dVar.f74088t);
    }

    /* renamed from: f */
    public final long mo68940f() {
        return this.f74077i;
    }

    /* renamed from: g */
    public final C29075a mo68941g() {
        return this.f74073e;
    }

    /* renamed from: h */
    public final Long mo68942h() {
        return this.f74071c;
    }

    public int hashCode() {
        int a = C7397t.m28148a(this.f74069a) * 31;
        Long l = this.f74070b;
        int i = 0;
        int hashCode = (a + (l == null ? 0 : l.hashCode())) * 31;
        Long l2 = this.f74071c;
        int hashCode2 = (((hashCode + (l2 == null ? 0 : l2.hashCode())) * 31) + this.f74072d.hashCode()) * 31;
        C29075a aVar = this.f74073e;
        int hashCode3 = (hashCode2 + (aVar == null ? 0 : aVar.hashCode())) * 31;
        boolean z = this.f74074f;
        boolean z2 = true;
        if (z) {
            z = true;
        }
        int i2 = (hashCode3 + (z ? 1 : 0)) * 31;
        String str = this.f74075g;
        int hashCode4 = (i2 + (str == null ? 0 : str.hashCode())) * 31;
        BigDecimal bigDecimal = this.f74076h;
        int hashCode5 = (((hashCode4 + (bigDecimal == null ? 0 : bigDecimal.hashCode())) * 31) + C7397t.m28148a(this.f74077i)) * 31;
        Long l3 = this.f74078j;
        int hashCode6 = (hashCode5 + (l3 == null ? 0 : l3.hashCode())) * 31;
        boolean z3 = this.f74079k;
        if (z3) {
            z3 = true;
        }
        int hashCode7 = (((hashCode6 + (z3 ? 1 : 0)) * 31) + this.f74080l.hashCode()) * 31;
        boolean z4 = this.f74081m;
        if (!z4) {
            z2 = z4;
        }
        int i3 = (hashCode7 + (z2 ? 1 : 0)) * 31;
        C29790g gVar = this.f74082n;
        int hashCode8 = (i3 + (gVar == null ? 0 : gVar.hashCode())) * 31;
        String str2 = this.f74083o;
        int hashCode9 = (hashCode8 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f74084p;
        int hashCode10 = (hashCode9 + (str3 == null ? 0 : str3.hashCode())) * 31;
        C29793j jVar = this.f74085q;
        int hashCode11 = (hashCode10 + (jVar == null ? 0 : jVar.hashCode())) * 31;
        C29796l lVar = this.f74086r;
        if (lVar != null) {
            i = lVar.hashCode();
        }
        return ((((hashCode11 + i) * 31) + this.f74087s.hashCode()) * 31) + this.f74088t.hashCode();
    }

    /* renamed from: i */
    public final C29790g mo68944i() {
        return this.f74082n;
    }

    /* renamed from: j */
    public final C29076b mo68945j() {
        return this.f74087s;
    }

    /* renamed from: k */
    public final Long mo68946k() {
        return this.f74070b;
    }

    /* renamed from: l */
    public final C29793j mo68947l() {
        return this.f74085q;
    }

    /* renamed from: m */
    public final BigDecimal mo68948m() {
        return this.f74076h;
    }

    /* renamed from: n */
    public final String mo68949n() {
        return this.f74084p;
    }

    /* renamed from: o */
    public final boolean mo68950o() {
        return this.f74081m;
    }

    /* renamed from: p */
    public final String mo68951p() {
        return this.f74080l;
    }

    /* renamed from: q */
    public final long mo68952q() {
        return this.f74069a;
    }

    /* renamed from: r */
    public final String mo68953r() {
        return this.f74088t;
    }

    /* renamed from: s */
    public final String mo68954s() {
        return this.f74072d;
    }

    /* renamed from: t */
    public final C29796l mo68955t() {
        return this.f74086r;
    }

    public String toString() {
        long j = this.f74069a;
        Long l = this.f74070b;
        Long l2 = this.f74071c;
        String str = this.f74072d;
        C29075a aVar = this.f74073e;
        boolean z = this.f74074f;
        String str2 = this.f74075g;
        BigDecimal bigDecimal = this.f74076h;
        long j2 = this.f74077i;
        Long l3 = this.f74078j;
        boolean z2 = this.f74079k;
        String str3 = this.f74080l;
        boolean z3 = this.f74081m;
        C29790g gVar = this.f74082n;
        String str4 = this.f74083o;
        String str5 = this.f74084p;
        C29793j jVar = this.f74085q;
        C29796l lVar = this.f74086r;
        C29076b bVar = this.f74087s;
        String str6 = this.f74088t;
        return "PurchaseModel(offerId=" + j + ", giftCardId=" + l + ", dstClientKey=" + l2 + ", phoneNumber=" + str + ", design=" + aVar + ", isForRecipient=" + z + ", amount=" + str2 + ", giveAwayAmount=" + bigDecimal + ", chosenDate=" + j2 + ", cardExpirationDate=" + l3 + ", isDateSelected=" + z2 + ", nominationText=" + str3 + ", nominationFromTemplate=" + z3 + ", expirationType=" + gVar + ", afterPurchaseDays=" + str4 + ", merchantOfferName=" + str5 + ", giftCardOfferDetails=" + jVar + ", selectedAccount=" + lVar + ", giftCardFlowMode=" + bVar + ", owner=" + str6 + ")";
    }

    /* renamed from: u */
    public final boolean mo68957u() {
        return this.f74079k;
    }

    /* renamed from: v */
    public final boolean mo68958v() {
        return this.f74074f;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ C29078d(long r23, java.lang.Long r25, java.lang.Long r26, java.lang.String r27, vh0.C29075a r28, boolean r29, java.lang.String r30, java.math.BigDecimal r31, long r32, java.lang.Long r34, boolean r35, java.lang.String r36, boolean r37, xh0.C29790g r38, java.lang.String r39, java.lang.String r40, xh0.C29793j r41, xh0.C29796l r42, vh0.C29076b r43, java.lang.String r44, int r45, kotlin.jvm.internal.DefaultConstructorMarker r46) {
        /*
            r22 = this;
            r0 = r45
            r1 = r0 & 1
            if (r1 == 0) goto L_0x0009
            r1 = -1
            goto L_0x000b
        L_0x0009:
            r1 = r23
        L_0x000b:
            r3 = r0 & 2
            if (r3 == 0) goto L_0x0011
            r3 = 0
            goto L_0x0013
        L_0x0011:
            r3 = r25
        L_0x0013:
            r5 = r0 & 4
            if (r5 == 0) goto L_0x0019
            r5 = 0
            goto L_0x001b
        L_0x0019:
            r5 = r26
        L_0x001b:
            r6 = r0 & 8
            java.lang.String r7 = ""
            if (r6 == 0) goto L_0x0023
            r6 = r7
            goto L_0x0025
        L_0x0023:
            r6 = r27
        L_0x0025:
            r8 = r0 & 16
            if (r8 == 0) goto L_0x002b
            r8 = 0
            goto L_0x002d
        L_0x002b:
            r8 = r28
        L_0x002d:
            r9 = r0 & 32
            if (r9 == 0) goto L_0x0033
            r9 = 0
            goto L_0x0035
        L_0x0033:
            r9 = r29
        L_0x0035:
            r11 = r0 & 64
            if (r11 == 0) goto L_0x003b
            r11 = 0
            goto L_0x003d
        L_0x003b:
            r11 = r30
        L_0x003d:
            r12 = r0 & 128(0x80, float:1.794E-43)
            if (r12 == 0) goto L_0x0043
            r12 = 0
            goto L_0x0045
        L_0x0043:
            r12 = r31
        L_0x0045:
            r13 = r0 & 256(0x100, float:3.59E-43)
            if (r13 == 0) goto L_0x004c
            r13 = 0
            goto L_0x004e
        L_0x004c:
            r13 = r32
        L_0x004e:
            r15 = r0 & 512(0x200, float:7.175E-43)
            if (r15 == 0) goto L_0x0054
            r15 = 0
            goto L_0x0056
        L_0x0054:
            r15 = r34
        L_0x0056:
            r4 = r0 & 1024(0x400, float:1.435E-42)
            if (r4 == 0) goto L_0x005c
            r4 = 0
            goto L_0x005e
        L_0x005c:
            r4 = r35
        L_0x005e:
            r10 = r0 & 2048(0x800, float:2.87E-42)
            if (r10 == 0) goto L_0x0064
            r10 = r7
            goto L_0x0066
        L_0x0064:
            r10 = r36
        L_0x0066:
            r25 = r7
            r7 = r0 & 4096(0x1000, float:5.74E-42)
            if (r7 == 0) goto L_0x006e
            r7 = 0
            goto L_0x0070
        L_0x006e:
            r7 = r37
        L_0x0070:
            r46 = r7
            r7 = r0 & 8192(0x2000, float:1.14794E-41)
            if (r7 == 0) goto L_0x0078
            r7 = 0
            goto L_0x007a
        L_0x0078:
            r7 = r38
        L_0x007a:
            r16 = r7
            r7 = r0 & 16384(0x4000, float:2.2959E-41)
            if (r7 == 0) goto L_0x0082
            r7 = 0
            goto L_0x0084
        L_0x0082:
            r7 = r39
        L_0x0084:
            r17 = 32768(0x8000, float:4.5918E-41)
            r17 = r0 & r17
            if (r17 == 0) goto L_0x008e
            r17 = 0
            goto L_0x0090
        L_0x008e:
            r17 = r40
        L_0x0090:
            r18 = 65536(0x10000, float:9.18355E-41)
            r18 = r0 & r18
            if (r18 == 0) goto L_0x0099
            r18 = 0
            goto L_0x009b
        L_0x0099:
            r18 = r41
        L_0x009b:
            r19 = 131072(0x20000, float:1.83671E-40)
            r19 = r0 & r19
            if (r19 == 0) goto L_0x00a4
            r19 = 0
            goto L_0x00a6
        L_0x00a4:
            r19 = r42
        L_0x00a6:
            r20 = 262144(0x40000, float:3.67342E-40)
            r20 = r0 & r20
            if (r20 == 0) goto L_0x00af
            vh0.b r20 = vh0.C29076b.PURCHASE
            goto L_0x00b1
        L_0x00af:
            r20 = r43
        L_0x00b1:
            r21 = 524288(0x80000, float:7.34684E-40)
            r0 = r0 & r21
            if (r0 == 0) goto L_0x00ba
            r0 = r25
            goto L_0x00bc
        L_0x00ba:
            r0 = r44
        L_0x00bc:
            r23 = r22
            r24 = r1
            r26 = r3
            r27 = r5
            r28 = r6
            r29 = r8
            r30 = r9
            r31 = r11
            r32 = r12
            r33 = r13
            r35 = r15
            r36 = r4
            r37 = r10
            r38 = r46
            r39 = r16
            r40 = r7
            r41 = r17
            r42 = r18
            r43 = r19
            r44 = r20
            r45 = r0
            r23.<init>(r24, r26, r27, r28, r29, r30, r31, r32, r33, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: vh0.C29078d.<init>(long, java.lang.Long, java.lang.Long, java.lang.String, vh0.a, boolean, java.lang.String, java.math.BigDecimal, long, java.lang.Long, boolean, java.lang.String, boolean, xh0.g, java.lang.String, java.lang.String, xh0.j, xh0.l, vh0.b, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
