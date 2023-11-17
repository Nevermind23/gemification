package p563pk;

import com.salesforce.marketingcloud.C11398b;
import kotlin.jvm.internal.C41536l;

/* renamed from: pk.k */
public final class C17381k {

    /* renamed from: a */
    private final Integer f48765a;

    /* renamed from: b */
    private final Integer f48766b;

    /* renamed from: c */
    private final String f48767c;

    /* renamed from: d */
    private final boolean f48768d;

    /* renamed from: e */
    private final C17372b f48769e;

    /* renamed from: f */
    private final Long f48770f;

    /* renamed from: g */
    private final C17373c f48771g;

    /* renamed from: h */
    private final Integer f48772h;

    /* renamed from: i */
    private final C17379i f48773i;

    public C17381k(Integer num, Integer num2, String str, boolean z, C17372b bVar, Long l, C17373c cVar, Integer num3, C17379i iVar) {
        C41536l.m120489i(iVar, "paymentMethod");
        this.f48765a = num;
        this.f48766b = num2;
        this.f48767c = str;
        this.f48768d = z;
        this.f48769e = bVar;
        this.f48770f = l;
        this.f48771g = cVar;
        this.f48772h = num3;
        this.f48773i = iVar;
    }

    /* renamed from: b */
    public static /* synthetic */ C17381k m60811b(C17381k kVar, Integer num, Integer num2, String str, boolean z, C17372b bVar, Long l, C17373c cVar, Integer num3, C17379i iVar, int i, Object obj) {
        C17381k kVar2 = kVar;
        int i2 = i;
        return kVar.mo44870a((i2 & 1) != 0 ? kVar2.f48765a : num, (i2 & 2) != 0 ? kVar2.f48766b : num2, (i2 & 4) != 0 ? kVar2.f48767c : str, (i2 & 8) != 0 ? kVar2.f48768d : z, (i2 & 16) != 0 ? kVar2.f48769e : bVar, (i2 & 32) != 0 ? kVar2.f48770f : l, (i2 & 64) != 0 ? kVar2.f48771g : cVar, (i2 & 128) != 0 ? kVar2.f48772h : num3, (i2 & C11398b.f33139r) != 0 ? kVar2.f48773i : iVar);
    }

    /* renamed from: a */
    public final C17381k mo44870a(Integer num, Integer num2, String str, boolean z, C17372b bVar, Long l, C17373c cVar, Integer num3, C17379i iVar) {
        C17379i iVar2 = iVar;
        C41536l.m120489i(iVar2, "paymentMethod");
        return new C17381k(num, num2, str, z, bVar, l, cVar, num3, iVar2);
    }

    /* renamed from: c */
    public final Long mo44871c() {
        return this.f48770f;
    }

    /* renamed from: d */
    public final boolean mo44872d() {
        return this.f48768d;
    }

    /* renamed from: e */
    public final String mo44873e() {
        return this.f48767c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C17381k)) {
            return false;
        }
        C17381k kVar = (C17381k) obj;
        return C41536l.m120484d(this.f48765a, kVar.f48765a) && C41536l.m120484d(this.f48766b, kVar.f48766b) && C41536l.m120484d(this.f48767c, kVar.f48767c) && this.f48768d == kVar.f48768d && C41536l.m120484d(this.f48769e, kVar.f48769e) && C41536l.m120484d(this.f48770f, kVar.f48770f) && C41536l.m120484d(this.f48771g, kVar.f48771g) && C41536l.m120484d(this.f48772h, kVar.f48772h) && this.f48773i == kVar.f48773i;
    }

    /* renamed from: f */
    public final C17372b mo44875f() {
        return this.f48769e;
    }

    /* renamed from: g */
    public final C17373c mo44876g() {
        return this.f48771g;
    }

    /* renamed from: h */
    public final Integer mo44877h() {
        return this.f48766b;
    }

    public int hashCode() {
        Integer num = this.f48765a;
        int i = 0;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.f48766b;
        int hashCode2 = (hashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str = this.f48767c;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        boolean z = this.f48768d;
        if (z) {
            z = true;
        }
        int i2 = (hashCode3 + (z ? 1 : 0)) * 31;
        C17372b bVar = this.f48769e;
        int hashCode4 = (i2 + (bVar == null ? 0 : bVar.hashCode())) * 31;
        Long l = this.f48770f;
        int hashCode5 = (hashCode4 + (l == null ? 0 : l.hashCode())) * 31;
        C17373c cVar = this.f48771g;
        int hashCode6 = (hashCode5 + (cVar == null ? 0 : cVar.hashCode())) * 31;
        Integer num3 = this.f48772h;
        if (num3 != null) {
            i = num3.hashCode();
        }
        return ((hashCode6 + i) * 31) + this.f48773i.hashCode();
    }

    /* renamed from: i */
    public final C17379i mo44879i() {
        return this.f48773i;
    }

    /* renamed from: j */
    public final Integer mo44880j() {
        return this.f48765a;
    }

    /* renamed from: k */
    public final Integer mo44881k() {
        return this.f48772h;
    }

    public String toString() {
        Integer num = this.f48765a;
        Integer num2 = this.f48766b;
        String str = this.f48767c;
        boolean z = this.f48768d;
        C17372b bVar = this.f48769e;
        Long l = this.f48770f;
        C17373c cVar = this.f48771g;
        Integer num3 = this.f48772h;
        C17379i iVar = this.f48773i;
        return "PolicyDetails(providerIndex=" + num + ", insurancePackageIndex=" + num2 + ", carNumber=" + str + ", carIsMine=" + z + ", carOwnerInfo=" + bVar + ", activationDate=" + l + ", contactInfo=" + cVar + ", selectedCardIndex=" + num3 + ", paymentMethod=" + iVar + ")";
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ C17381k(java.lang.Integer r11, java.lang.Integer r12, java.lang.String r13, boolean r14, p563pk.C17372b r15, java.lang.Long r16, p563pk.C17373c r17, java.lang.Integer r18, p563pk.C17379i r19, int r20, kotlin.jvm.internal.DefaultConstructorMarker r21) {
        /*
            r10 = this;
            r0 = r20
            r1 = r0 & 1
            r2 = 0
            if (r1 == 0) goto L_0x0009
            r1 = r2
            goto L_0x000a
        L_0x0009:
            r1 = r11
        L_0x000a:
            r3 = r0 & 2
            if (r3 == 0) goto L_0x0010
            r3 = r2
            goto L_0x0011
        L_0x0010:
            r3 = r12
        L_0x0011:
            r4 = r0 & 4
            if (r4 == 0) goto L_0x0017
            r4 = r2
            goto L_0x0018
        L_0x0017:
            r4 = r13
        L_0x0018:
            r5 = r0 & 8
            if (r5 == 0) goto L_0x001e
            r5 = 1
            goto L_0x001f
        L_0x001e:
            r5 = r14
        L_0x001f:
            r6 = r0 & 16
            if (r6 == 0) goto L_0x0025
            r6 = r2
            goto L_0x0026
        L_0x0025:
            r6 = r15
        L_0x0026:
            r7 = r0 & 32
            if (r7 == 0) goto L_0x002c
            r7 = r2
            goto L_0x002e
        L_0x002c:
            r7 = r16
        L_0x002e:
            r8 = r0 & 64
            if (r8 == 0) goto L_0x0034
            r8 = r2
            goto L_0x0036
        L_0x0034:
            r8 = r17
        L_0x0036:
            r9 = r0 & 128(0x80, float:1.794E-43)
            if (r9 == 0) goto L_0x003b
            goto L_0x003d
        L_0x003b:
            r2 = r18
        L_0x003d:
            r0 = r0 & 256(0x100, float:3.59E-43)
            if (r0 == 0) goto L_0x0044
            pk.i r0 = p563pk.C17379i.ANNUAL
            goto L_0x0046
        L_0x0044:
            r0 = r19
        L_0x0046:
            r11 = r10
            r12 = r1
            r13 = r3
            r14 = r4
            r15 = r5
            r16 = r6
            r17 = r7
            r18 = r8
            r19 = r2
            r20 = r0
            r11.<init>(r12, r13, r14, r15, r16, r17, r18, r19, r20)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p563pk.C17381k.<init>(java.lang.Integer, java.lang.Integer, java.lang.String, boolean, pk.b, java.lang.Long, pk.c, java.lang.Integer, pk.i, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
