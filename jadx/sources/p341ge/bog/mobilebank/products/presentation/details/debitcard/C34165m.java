package p341ge.bog.mobilebank.products.presentation.details.debitcard;

import com.salesforce.marketingcloud.C11398b;
import java.util.List;
import kotlin.jvm.internal.C41536l;
import p190o1.C7397t;
import p341ge.bog.mobilebank.products.presentation.details.debitcard.C34093e;

/* renamed from: ge.bog.mobilebank.products.presentation.details.debitcard.m */
public final class C34165m {

    /* renamed from: a */
    private final C34093e.C34115v f82992a;

    /* renamed from: b */
    private final C34093e.C34095b f82993b;

    /* renamed from: c */
    private final C34093e.C34108o f82994c;

    /* renamed from: d */
    private final C34093e.C34094a f82995d;

    /* renamed from: e */
    private final C34093e.C34097d f82996e;

    /* renamed from: f */
    private final C34093e.C34098e f82997f;

    /* renamed from: g */
    private final List f82998g;

    /* renamed from: h */
    private final List f82999h;

    /* renamed from: i */
    private final List f83000i;

    /* renamed from: j */
    private final List f83001j;

    /* renamed from: k */
    private final List f83002k;

    /* renamed from: l */
    private final List f83003l;

    /* renamed from: m */
    private final C34093e.C34100g f83004m;

    /* renamed from: n */
    private final Boolean f83005n;

    /* renamed from: o */
    private final Boolean f83006o;

    /* renamed from: p */
    private final long f83007p;

    public C34165m(C34093e.C34115v vVar, C34093e.C34095b bVar, C34093e.C34108o oVar, C34093e.C34094a aVar, C34093e.C34097d dVar, C34093e.C34098e eVar, List list, List list2, List list3, List list4, List list5, List list6, C34093e.C34100g gVar, Boolean bool, Boolean bool2, long j) {
        List list7 = list2;
        List list8 = list3;
        List list9 = list4;
        List list10 = list5;
        List list11 = list6;
        C41536l.m120489i(list, "linkedLoans");
        C41536l.m120489i(list7, "linkedMoneyBoxes");
        C41536l.m120489i(list8, "linkedDeposits");
        C41536l.m120489i(list9, "overdraftItems");
        C41536l.m120489i(list10, "studDepInfoItems");
        C41536l.m120489i(list11, "operations");
        this.f82992a = vVar;
        this.f82993b = bVar;
        this.f82994c = oVar;
        this.f82995d = aVar;
        this.f82996e = dVar;
        this.f82997f = eVar;
        this.f82998g = list;
        this.f82999h = list7;
        this.f83000i = list8;
        this.f83001j = list9;
        this.f83002k = list10;
        this.f83003l = list11;
        this.f83004m = gVar;
        this.f83005n = bool;
        this.f83006o = bool2;
        this.f83007p = j;
    }

    /* renamed from: b */
    public static /* synthetic */ C34165m m100546b(C34165m mVar, C34093e.C34115v vVar, C34093e.C34095b bVar, C34093e.C34108o oVar, C34093e.C34094a aVar, C34093e.C34097d dVar, C34093e.C34098e eVar, List list, List list2, List list3, List list4, List list5, List list6, C34093e.C34100g gVar, Boolean bool, Boolean bool2, long j, int i, Object obj) {
        C34165m mVar2 = mVar;
        int i2 = i;
        return mVar.mo82520a((i2 & 1) != 0 ? mVar2.f82992a : vVar, (i2 & 2) != 0 ? mVar2.f82993b : bVar, (i2 & 4) != 0 ? mVar2.f82994c : oVar, (i2 & 8) != 0 ? mVar2.f82995d : aVar, (i2 & 16) != 0 ? mVar2.f82996e : dVar, (i2 & 32) != 0 ? mVar2.f82997f : eVar, (i2 & 64) != 0 ? mVar2.f82998g : list, (i2 & 128) != 0 ? mVar2.f82999h : list2, (i2 & C11398b.f33139r) != 0 ? mVar2.f83000i : list3, (i2 & C11398b.f33140s) != 0 ? mVar2.f83001j : list4, (i2 & C11398b.f33141t) != 0 ? mVar2.f83002k : list5, (i2 & C11398b.f33142u) != 0 ? mVar2.f83003l : list6, (i2 & C11398b.f33143v) != 0 ? mVar2.f83004m : gVar, (i2 & 8192) != 0 ? mVar2.f83005n : bool, (i2 & 16384) != 0 ? mVar2.f83006o : bool2, (i2 & 32768) != 0 ? mVar2.f83007p : j);
    }

    /* renamed from: a */
    public final C34165m mo82520a(C34093e.C34115v vVar, C34093e.C34095b bVar, C34093e.C34108o oVar, C34093e.C34094a aVar, C34093e.C34097d dVar, C34093e.C34098e eVar, List list, List list2, List list3, List list4, List list5, List list6, C34093e.C34100g gVar, Boolean bool, Boolean bool2, long j) {
        C34093e.C34115v vVar2 = vVar;
        C41536l.m120489i(list, "linkedLoans");
        C41536l.m120489i(list2, "linkedMoneyBoxes");
        C41536l.m120489i(list3, "linkedDeposits");
        C41536l.m120489i(list4, "overdraftItems");
        C41536l.m120489i(list5, "studDepInfoItems");
        C41536l.m120489i(list6, "operations");
        return new C34165m(vVar, bVar, oVar, aVar, dVar, eVar, list, list2, list3, list4, list5, list6, gVar, bool, bool2, j);
    }

    /* renamed from: c */
    public final C34093e.C34094a mo82521c() {
        return this.f82995d;
    }

    /* renamed from: d */
    public final C34093e.C34095b mo82522d() {
        return this.f82993b;
    }

    /* renamed from: e */
    public final C34093e.C34097d mo82523e() {
        return this.f82996e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C34165m)) {
            return false;
        }
        C34165m mVar = (C34165m) obj;
        return C41536l.m120484d(this.f82992a, mVar.f82992a) && C41536l.m120484d(this.f82993b, mVar.f82993b) && C41536l.m120484d(this.f82994c, mVar.f82994c) && C41536l.m120484d(this.f82995d, mVar.f82995d) && C41536l.m120484d(this.f82996e, mVar.f82996e) && C41536l.m120484d(this.f82997f, mVar.f82997f) && C41536l.m120484d(this.f82998g, mVar.f82998g) && C41536l.m120484d(this.f82999h, mVar.f82999h) && C41536l.m120484d(this.f83000i, mVar.f83000i) && C41536l.m120484d(this.f83001j, mVar.f83001j) && C41536l.m120484d(this.f83002k, mVar.f83002k) && C41536l.m120484d(this.f83003l, mVar.f83003l) && C41536l.m120484d(this.f83004m, mVar.f83004m) && C41536l.m120484d(this.f83005n, mVar.f83005n) && C41536l.m120484d(this.f83006o, mVar.f83006o) && this.f83007p == mVar.f83007p;
    }

    /* renamed from: f */
    public final C34093e.C34098e mo82525f() {
        return this.f82997f;
    }

    /* renamed from: g */
    public final C34093e.C34100g mo82526g() {
        return this.f83004m;
    }

    /* renamed from: h */
    public final List mo82527h() {
        return this.f83000i;
    }

    public int hashCode() {
        C34093e.C34115v vVar = this.f82992a;
        int i = 0;
        int hashCode = (vVar == null ? 0 : vVar.hashCode()) * 31;
        C34093e.C34095b bVar = this.f82993b;
        int hashCode2 = (hashCode + (bVar == null ? 0 : bVar.hashCode())) * 31;
        C34093e.C34108o oVar = this.f82994c;
        int hashCode3 = (hashCode2 + (oVar == null ? 0 : oVar.hashCode())) * 31;
        C34093e.C34094a aVar = this.f82995d;
        int hashCode4 = (hashCode3 + (aVar == null ? 0 : aVar.hashCode())) * 31;
        C34093e.C34097d dVar = this.f82996e;
        int hashCode5 = (hashCode4 + (dVar == null ? 0 : dVar.hashCode())) * 31;
        C34093e.C34098e eVar = this.f82997f;
        int hashCode6 = (((((((((((((hashCode5 + (eVar == null ? 0 : eVar.hashCode())) * 31) + this.f82998g.hashCode()) * 31) + this.f82999h.hashCode()) * 31) + this.f83000i.hashCode()) * 31) + this.f83001j.hashCode()) * 31) + this.f83002k.hashCode()) * 31) + this.f83003l.hashCode()) * 31;
        C34093e.C34100g gVar = this.f83004m;
        int hashCode7 = (hashCode6 + (gVar == null ? 0 : gVar.hashCode())) * 31;
        Boolean bool = this.f83005n;
        int hashCode8 = (hashCode7 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.f83006o;
        if (bool2 != null) {
            i = bool2.hashCode();
        }
        return ((hashCode8 + i) * 31) + C7397t.m28148a(this.f83007p);
    }

    /* renamed from: i */
    public final List mo82529i() {
        return this.f82998g;
    }

    /* renamed from: j */
    public final List mo82530j() {
        return this.f82999h;
    }

    /* renamed from: k */
    public final List mo82531k() {
        return this.f83003l;
    }

    /* renamed from: l */
    public final C34093e.C34108o mo82532l() {
        return this.f82994c;
    }

    /* renamed from: m */
    public final Boolean mo82533m() {
        return this.f83005n;
    }

    /* renamed from: n */
    public final Boolean mo82534n() {
        return this.f83006o;
    }

    /* renamed from: o */
    public final List mo82535o() {
        return this.f83001j;
    }

    /* renamed from: p */
    public final C34093e.C34115v mo82536p() {
        return this.f82992a;
    }

    /* renamed from: q */
    public final long mo82537q() {
        return this.f83007p;
    }

    /* renamed from: r */
    public final List mo82538r() {
        return this.f83002k;
    }

    public String toString() {
        C34093e.C34115v vVar = this.f82992a;
        C34093e.C34095b bVar = this.f82993b;
        C34093e.C34108o oVar = this.f82994c;
        C34093e.C34094a aVar = this.f82995d;
        C34093e.C34097d dVar = this.f82996e;
        C34093e.C34098e eVar = this.f82997f;
        List list = this.f82998g;
        List list2 = this.f82999h;
        List list3 = this.f83000i;
        List list4 = this.f83001j;
        List list5 = this.f83002k;
        List list6 = this.f83003l;
        C34093e.C34100g gVar = this.f83004m;
        Boolean bool = this.f83005n;
        long j = this.f83007p;
        return "ViewState(productHeader=" + vVar + ", accountNumber=" + bVar + ", operationsButtons=" + oVar + ", accountCards=" + aVar + ", cardInsuranceOffer=" + dVar + ", childMBankOffer=" + eVar + ", linkedLoans=" + list + ", linkedMoneyBoxes=" + list2 + ", linkedDeposits=" + list3 + ", overdraftItems=" + list4 + ", studDepInfoItems=" + list5 + ", operations=" + list6 + ", googlePay=" + gVar + ", operationsIsLoading=" + bool + ", operationsLoadingError=" + this.f83006o + ", selectedAccKey=" + j + ")";
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ C34165m(p341ge.bog.mobilebank.products.presentation.details.debitcard.C34093e.C34115v r22, p341ge.bog.mobilebank.products.presentation.details.debitcard.C34093e.C34095b r23, p341ge.bog.mobilebank.products.presentation.details.debitcard.C34093e.C34108o r24, p341ge.bog.mobilebank.products.presentation.details.debitcard.C34093e.C34094a r25, p341ge.bog.mobilebank.products.presentation.details.debitcard.C34093e.C34097d r26, p341ge.bog.mobilebank.products.presentation.details.debitcard.C34093e.C34098e r27, java.util.List r28, java.util.List r29, java.util.List r30, java.util.List r31, java.util.List r32, java.util.List r33, p341ge.bog.mobilebank.products.presentation.details.debitcard.C34093e.C34100g r34, java.lang.Boolean r35, java.lang.Boolean r36, long r37, int r39, kotlin.jvm.internal.DefaultConstructorMarker r40) {
        /*
            r21 = this;
            r0 = r39
            r1 = r0 & 1
            r2 = 0
            if (r1 == 0) goto L_0x0009
            r4 = r2
            goto L_0x000b
        L_0x0009:
            r4 = r22
        L_0x000b:
            r1 = r0 & 2
            if (r1 == 0) goto L_0x0011
            r5 = r2
            goto L_0x0013
        L_0x0011:
            r5 = r23
        L_0x0013:
            r1 = r0 & 4
            if (r1 == 0) goto L_0x0019
            r6 = r2
            goto L_0x001b
        L_0x0019:
            r6 = r24
        L_0x001b:
            r1 = r0 & 8
            if (r1 == 0) goto L_0x0021
            r7 = r2
            goto L_0x0023
        L_0x0021:
            r7 = r25
        L_0x0023:
            r1 = r0 & 16
            if (r1 == 0) goto L_0x0029
            r8 = r2
            goto L_0x002b
        L_0x0029:
            r8 = r26
        L_0x002b:
            r1 = r0 & 32
            if (r1 == 0) goto L_0x0031
            r9 = r2
            goto L_0x0033
        L_0x0031:
            r9 = r27
        L_0x0033:
            r1 = r0 & 64
            if (r1 == 0) goto L_0x003d
            java.util.List r1 = ie1.C41341q.m119907j()
            r10 = r1
            goto L_0x003f
        L_0x003d:
            r10 = r28
        L_0x003f:
            r1 = r0 & 128(0x80, float:1.794E-43)
            if (r1 == 0) goto L_0x0049
            java.util.List r1 = ie1.C41341q.m119907j()
            r11 = r1
            goto L_0x004b
        L_0x0049:
            r11 = r29
        L_0x004b:
            r1 = r0 & 256(0x100, float:3.59E-43)
            if (r1 == 0) goto L_0x0055
            java.util.List r1 = ie1.C41341q.m119907j()
            r12 = r1
            goto L_0x0057
        L_0x0055:
            r12 = r30
        L_0x0057:
            r1 = r0 & 512(0x200, float:7.175E-43)
            if (r1 == 0) goto L_0x0061
            java.util.List r1 = ie1.C41341q.m119907j()
            r13 = r1
            goto L_0x0063
        L_0x0061:
            r13 = r31
        L_0x0063:
            r1 = r0 & 1024(0x400, float:1.435E-42)
            if (r1 == 0) goto L_0x006d
            java.util.List r1 = ie1.C41341q.m119907j()
            r14 = r1
            goto L_0x006f
        L_0x006d:
            r14 = r32
        L_0x006f:
            r1 = r0 & 2048(0x800, float:2.87E-42)
            if (r1 == 0) goto L_0x0079
            java.util.List r1 = ie1.C41341q.m119907j()
            r15 = r1
            goto L_0x007b
        L_0x0079:
            r15 = r33
        L_0x007b:
            r1 = r0 & 4096(0x1000, float:5.74E-42)
            if (r1 == 0) goto L_0x0082
            r16 = r2
            goto L_0x0084
        L_0x0082:
            r16 = r34
        L_0x0084:
            r1 = r0 & 8192(0x2000, float:1.14794E-41)
            if (r1 == 0) goto L_0x008b
            r17 = r2
            goto L_0x008d
        L_0x008b:
            r17 = r35
        L_0x008d:
            r0 = r0 & 16384(0x4000, float:2.2959E-41)
            if (r0 == 0) goto L_0x0094
            r18 = r2
            goto L_0x0096
        L_0x0094:
            r18 = r36
        L_0x0096:
            r3 = r21
            r19 = r37
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p341ge.bog.mobilebank.products.presentation.details.debitcard.C34165m.<init>(ge.bog.mobilebank.products.presentation.details.debitcard.e$v, ge.bog.mobilebank.products.presentation.details.debitcard.e$b, ge.bog.mobilebank.products.presentation.details.debitcard.e$o, ge.bog.mobilebank.products.presentation.details.debitcard.e$a, ge.bog.mobilebank.products.presentation.details.debitcard.e$d, ge.bog.mobilebank.products.presentation.details.debitcard.e$e, java.util.List, java.util.List, java.util.List, java.util.List, java.util.List, java.util.List, ge.bog.mobilebank.products.presentation.details.debitcard.e$g, java.lang.Boolean, java.lang.Boolean, long, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
