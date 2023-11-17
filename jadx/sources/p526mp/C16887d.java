package p526mp;

import com.salesforce.marketingcloud.C11398b;
import java.util.List;
import kotlin.jvm.internal.C41536l;
import p455ho.C15557j;
import p469io.C15709b;

/* renamed from: mp.d */
public final class C16887d {

    /* renamed from: a */
    private final C15709b f47211a;

    /* renamed from: b */
    private final C15709b f47212b;

    /* renamed from: c */
    private final List f47213c;

    /* renamed from: d */
    private final C15557j f47214d;

    /* renamed from: e */
    private final List f47215e;

    /* renamed from: f */
    private List f47216f;

    /* renamed from: g */
    private final List f47217g;

    /* renamed from: h */
    private final boolean f47218h;

    /* renamed from: i */
    private final List f47219i;

    public C16887d(C15709b bVar, C15709b bVar2, List list, C15557j jVar, List list2, List list3, List list4, boolean z, List list5) {
        C41536l.m120489i(list3, "benefits");
        C41536l.m120489i(list4, "eligibleCards");
        C41536l.m120489i(list5, "becomeSoloBenefs");
        this.f47211a = bVar;
        this.f47212b = bVar2;
        this.f47213c = list;
        this.f47214d = jVar;
        this.f47215e = list2;
        this.f47216f = list3;
        this.f47217g = list4;
        this.f47218h = z;
        this.f47219i = list5;
    }

    /* renamed from: b */
    public static /* synthetic */ C16887d m59459b(C16887d dVar, C15709b bVar, C15709b bVar2, List list, C15557j jVar, List list2, List list3, List list4, boolean z, List list5, int i, Object obj) {
        C16887d dVar2 = dVar;
        int i2 = i;
        return dVar.mo44038a((i2 & 1) != 0 ? dVar2.f47211a : bVar, (i2 & 2) != 0 ? dVar2.f47212b : bVar2, (i2 & 4) != 0 ? dVar2.f47213c : list, (i2 & 8) != 0 ? dVar2.f47214d : jVar, (i2 & 16) != 0 ? dVar2.f47215e : list2, (i2 & 32) != 0 ? dVar2.f47216f : list3, (i2 & 64) != 0 ? dVar2.f47217g : list4, (i2 & 128) != 0 ? dVar2.f47218h : z, (i2 & C11398b.f33139r) != 0 ? dVar2.f47219i : list5);
    }

    /* renamed from: a */
    public final C16887d mo44038a(C15709b bVar, C15709b bVar2, List list, C15557j jVar, List list2, List list3, List list4, boolean z, List list5) {
        List list6 = list3;
        C41536l.m120489i(list6, "benefits");
        List list7 = list4;
        C41536l.m120489i(list7, "eligibleCards");
        List list8 = list5;
        C41536l.m120489i(list8, "becomeSoloBenefs");
        return new C16887d(bVar, bVar2, list, jVar, list2, list6, list7, z, list8);
    }

    /* renamed from: c */
    public final C15709b mo44039c() {
        return this.f47211a;
    }

    /* renamed from: d */
    public final List mo44040d() {
        return this.f47219i;
    }

    /* renamed from: e */
    public final List mo44041e() {
        return this.f47216f;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C16887d)) {
            return false;
        }
        C16887d dVar = (C16887d) obj;
        return C41536l.m120484d(this.f47211a, dVar.f47211a) && C41536l.m120484d(this.f47212b, dVar.f47212b) && C41536l.m120484d(this.f47213c, dVar.f47213c) && C41536l.m120484d(this.f47214d, dVar.f47214d) && C41536l.m120484d(this.f47215e, dVar.f47215e) && C41536l.m120484d(this.f47216f, dVar.f47216f) && C41536l.m120484d(this.f47217g, dVar.f47217g) && this.f47218h == dVar.f47218h && C41536l.m120484d(this.f47219i, dVar.f47219i);
    }

    /* renamed from: f */
    public final List mo44043f() {
        return this.f47213c;
    }

    /* renamed from: g */
    public final List mo44044g() {
        return this.f47217g;
    }

    /* renamed from: h */
    public final boolean mo44045h() {
        return this.f47218h;
    }

    public int hashCode() {
        C15709b bVar = this.f47211a;
        int i = 0;
        int hashCode = (bVar == null ? 0 : bVar.hashCode()) * 31;
        C15709b bVar2 = this.f47212b;
        int hashCode2 = (hashCode + (bVar2 == null ? 0 : bVar2.hashCode())) * 31;
        List list = this.f47213c;
        int hashCode3 = (hashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        C15557j jVar = this.f47214d;
        int hashCode4 = (hashCode3 + (jVar == null ? 0 : jVar.hashCode())) * 31;
        List list2 = this.f47215e;
        if (list2 != null) {
            i = list2.hashCode();
        }
        int hashCode5 = (((((hashCode4 + i) * 31) + this.f47216f.hashCode()) * 31) + this.f47217g.hashCode()) * 31;
        boolean z = this.f47218h;
        if (z) {
            z = true;
        }
        return ((hashCode5 + (z ? 1 : 0)) * 31) + this.f47219i.hashCode();
    }

    /* renamed from: i */
    public final List mo44047i() {
        return this.f47215e;
    }

    /* renamed from: j */
    public final C15557j mo44048j() {
        return this.f47214d;
    }

    /* renamed from: k */
    public final C15709b mo44049k() {
        return this.f47212b;
    }

    /* renamed from: l */
    public final void mo44050l(List list) {
        C41536l.m120489i(list, "<set-?>");
        this.f47216f = list;
    }

    public String toString() {
        C15709b bVar = this.f47211a;
        C15709b bVar2 = this.f47212b;
        List list = this.f47213c;
        C15557j jVar = this.f47214d;
        List list2 = this.f47215e;
        List list3 = this.f47216f;
        List list4 = this.f47217g;
        boolean z = this.f47218h;
        List list5 = this.f47219i;
        return "PackageDetailsData(activePackage=" + bVar + ", pendingPackage=" + bVar2 + ", clientPackages=" + list + ", packageLimit=" + jVar + ", packageFees=" + list2 + ", benefits=" + list3 + ", eligibleCards=" + list4 + ", kycBadgeStatus=" + z + ", becomeSoloBenefs=" + list5 + ")";
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ C16887d(p469io.C15709b r10, p469io.C15709b r11, java.util.List r12, p455ho.C15557j r13, java.util.List r14, java.util.List r15, java.util.List r16, boolean r17, java.util.List r18, int r19, kotlin.jvm.internal.DefaultConstructorMarker r20) {
        /*
            r9 = this;
            r0 = r19
            r1 = r0 & 1
            r2 = 0
            if (r1 == 0) goto L_0x0009
            r1 = r2
            goto L_0x000a
        L_0x0009:
            r1 = r10
        L_0x000a:
            r3 = r0 & 2
            if (r3 == 0) goto L_0x0010
            r3 = r2
            goto L_0x0011
        L_0x0010:
            r3 = r11
        L_0x0011:
            r4 = r0 & 4
            if (r4 == 0) goto L_0x0017
            r4 = r2
            goto L_0x0018
        L_0x0017:
            r4 = r12
        L_0x0018:
            r5 = r0 & 8
            if (r5 == 0) goto L_0x001e
            r5 = r2
            goto L_0x001f
        L_0x001e:
            r5 = r13
        L_0x001f:
            r6 = r0 & 16
            if (r6 == 0) goto L_0x0024
            goto L_0x0025
        L_0x0024:
            r2 = r14
        L_0x0025:
            r6 = r0 & 32
            if (r6 == 0) goto L_0x002e
            java.util.List r6 = ie1.C41341q.m119907j()
            goto L_0x002f
        L_0x002e:
            r6 = r15
        L_0x002f:
            r7 = r0 & 64
            if (r7 == 0) goto L_0x0038
            java.util.List r7 = ie1.C41341q.m119907j()
            goto L_0x003a
        L_0x0038:
            r7 = r16
        L_0x003a:
            r8 = r0 & 128(0x80, float:1.794E-43)
            if (r8 == 0) goto L_0x0040
            r8 = 0
            goto L_0x0042
        L_0x0040:
            r8 = r17
        L_0x0042:
            r0 = r0 & 256(0x100, float:3.59E-43)
            if (r0 == 0) goto L_0x004b
            java.util.List r0 = ie1.C41341q.m119907j()
            goto L_0x004d
        L_0x004b:
            r0 = r18
        L_0x004d:
            r10 = r9
            r11 = r1
            r12 = r3
            r13 = r4
            r14 = r5
            r15 = r2
            r16 = r6
            r17 = r7
            r18 = r8
            r19 = r0
            r10.<init>(r11, r12, r13, r14, r15, r16, r17, r18, r19)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p526mp.C16887d.<init>(io.b, io.b, java.util.List, ho.j, java.util.List, java.util.List, java.util.List, boolean, java.util.List, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
