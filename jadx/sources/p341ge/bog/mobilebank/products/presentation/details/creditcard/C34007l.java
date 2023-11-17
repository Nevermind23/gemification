package p341ge.bog.mobilebank.products.presentation.details.creditcard;

import com.salesforce.marketingcloud.C11398b;
import java.util.List;
import kotlin.jvm.internal.C41536l;
import p190o1.C7397t;
import p341ge.bog.mobilebank.products.presentation.details.creditcard.C33950d;

/* renamed from: ge.bog.mobilebank.products.presentation.details.creditcard.l */
public final class C34007l {

    /* renamed from: a */
    private final C33950d.C33967q f82704a;

    /* renamed from: b */
    private final C33950d.C33961k f82705b;

    /* renamed from: c */
    private final C33950d.C33951a f82706c;

    /* renamed from: d */
    private final C33950d.C33955e f82707d;

    /* renamed from: e */
    private final C33950d.C33966p f82708e;

    /* renamed from: f */
    private final C33950d.C33954d f82709f;

    /* renamed from: g */
    private final C33950d.C33952b f82710g;

    /* renamed from: h */
    private final List f82711h;

    /* renamed from: i */
    private final List f82712i;

    /* renamed from: j */
    private final Boolean f82713j;

    /* renamed from: k */
    private final Boolean f82714k;

    /* renamed from: l */
    private final long f82715l;

    /* renamed from: m */
    private final C33950d.C33957g f82716m;

    public C34007l(C33950d.C33967q qVar, C33950d.C33961k kVar, C33950d.C33951a aVar, C33950d.C33955e eVar, C33950d.C33966p pVar, C33950d.C33954d dVar, C33950d.C33952b bVar, List list, List list2, Boolean bool, Boolean bool2, long j, C33950d.C33957g gVar) {
        C41536l.m120489i(list, "linkedLoans");
        C41536l.m120489i(list2, "operations");
        this.f82704a = qVar;
        this.f82705b = kVar;
        this.f82706c = aVar;
        this.f82707d = eVar;
        this.f82708e = pVar;
        this.f82709f = dVar;
        this.f82710g = bVar;
        this.f82711h = list;
        this.f82712i = list2;
        this.f82713j = bool;
        this.f82714k = bool2;
        this.f82715l = j;
        this.f82716m = gVar;
    }

    /* renamed from: b */
    public static /* synthetic */ C34007l m100026b(C34007l lVar, C33950d.C33967q qVar, C33950d.C33961k kVar, C33950d.C33951a aVar, C33950d.C33955e eVar, C33950d.C33966p pVar, C33950d.C33954d dVar, C33950d.C33952b bVar, List list, List list2, Boolean bool, Boolean bool2, long j, C33950d.C33957g gVar, int i, Object obj) {
        C34007l lVar2 = lVar;
        int i2 = i;
        return lVar.mo82264a((i2 & 1) != 0 ? lVar2.f82704a : qVar, (i2 & 2) != 0 ? lVar2.f82705b : kVar, (i2 & 4) != 0 ? lVar2.f82706c : aVar, (i2 & 8) != 0 ? lVar2.f82707d : eVar, (i2 & 16) != 0 ? lVar2.f82708e : pVar, (i2 & 32) != 0 ? lVar2.f82709f : dVar, (i2 & 64) != 0 ? lVar2.f82710g : bVar, (i2 & 128) != 0 ? lVar2.f82711h : list, (i2 & C11398b.f33139r) != 0 ? lVar2.f82712i : list2, (i2 & C11398b.f33140s) != 0 ? lVar2.f82713j : bool, (i2 & C11398b.f33141t) != 0 ? lVar2.f82714k : bool2, (i2 & C11398b.f33142u) != 0 ? lVar2.f82715l : j, (i2 & C11398b.f33143v) != 0 ? lVar2.f82716m : gVar);
    }

    /* renamed from: a */
    public final C34007l mo82264a(C33950d.C33967q qVar, C33950d.C33961k kVar, C33950d.C33951a aVar, C33950d.C33955e eVar, C33950d.C33966p pVar, C33950d.C33954d dVar, C33950d.C33952b bVar, List list, List list2, Boolean bool, Boolean bool2, long j, C33950d.C33957g gVar) {
        List list3 = list;
        C41536l.m120489i(list3, "linkedLoans");
        List list4 = list2;
        C41536l.m120489i(list4, "operations");
        return new C34007l(qVar, kVar, aVar, eVar, pVar, dVar, bVar, list3, list4, bool, bool2, j, gVar);
    }

    /* renamed from: c */
    public final C33950d.C33951a mo82265c() {
        return this.f82706c;
    }

    /* renamed from: d */
    public final C33950d.C33952b mo82266d() {
        return this.f82710g;
    }

    /* renamed from: e */
    public final C33950d.C33954d mo82267e() {
        return this.f82709f;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C34007l)) {
            return false;
        }
        C34007l lVar = (C34007l) obj;
        return C41536l.m120484d(this.f82704a, lVar.f82704a) && C41536l.m120484d(this.f82705b, lVar.f82705b) && C41536l.m120484d(this.f82706c, lVar.f82706c) && C41536l.m120484d(this.f82707d, lVar.f82707d) && C41536l.m120484d(this.f82708e, lVar.f82708e) && C41536l.m120484d(this.f82709f, lVar.f82709f) && C41536l.m120484d(this.f82710g, lVar.f82710g) && C41536l.m120484d(this.f82711h, lVar.f82711h) && C41536l.m120484d(this.f82712i, lVar.f82712i) && C41536l.m120484d(this.f82713j, lVar.f82713j) && C41536l.m120484d(this.f82714k, lVar.f82714k) && this.f82715l == lVar.f82715l && C41536l.m120484d(this.f82716m, lVar.f82716m);
    }

    /* renamed from: f */
    public final C33950d.C33955e mo82269f() {
        return this.f82707d;
    }

    /* renamed from: g */
    public final C33950d.C33957g mo82270g() {
        return this.f82716m;
    }

    /* renamed from: h */
    public final List mo82271h() {
        return this.f82711h;
    }

    public int hashCode() {
        C33950d.C33967q qVar = this.f82704a;
        int i = 0;
        int hashCode = (qVar == null ? 0 : qVar.hashCode()) * 31;
        C33950d.C33961k kVar = this.f82705b;
        int hashCode2 = (hashCode + (kVar == null ? 0 : kVar.hashCode())) * 31;
        C33950d.C33951a aVar = this.f82706c;
        int hashCode3 = (hashCode2 + (aVar == null ? 0 : aVar.hashCode())) * 31;
        C33950d.C33955e eVar = this.f82707d;
        int hashCode4 = (hashCode3 + (eVar == null ? 0 : eVar.hashCode())) * 31;
        C33950d.C33966p pVar = this.f82708e;
        int hashCode5 = (hashCode4 + (pVar == null ? 0 : pVar.hashCode())) * 31;
        C33950d.C33954d dVar = this.f82709f;
        int hashCode6 = (hashCode5 + (dVar == null ? 0 : dVar.hashCode())) * 31;
        C33950d.C33952b bVar = this.f82710g;
        int hashCode7 = (((((hashCode6 + (bVar == null ? 0 : bVar.hashCode())) * 31) + this.f82711h.hashCode()) * 31) + this.f82712i.hashCode()) * 31;
        Boolean bool = this.f82713j;
        int hashCode8 = (hashCode7 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.f82714k;
        int hashCode9 = (((hashCode8 + (bool2 == null ? 0 : bool2.hashCode())) * 31) + C7397t.m28148a(this.f82715l)) * 31;
        C33950d.C33957g gVar = this.f82716m;
        if (gVar != null) {
            i = gVar.hashCode();
        }
        return hashCode9 + i;
    }

    /* renamed from: i */
    public final List mo82273i() {
        return this.f82712i;
    }

    /* renamed from: j */
    public final C33950d.C33961k mo82274j() {
        return this.f82705b;
    }

    /* renamed from: k */
    public final Boolean mo82275k() {
        return this.f82713j;
    }

    /* renamed from: l */
    public final Boolean mo82276l() {
        return this.f82714k;
    }

    /* renamed from: m */
    public final C33950d.C33966p mo82277m() {
        return this.f82708e;
    }

    /* renamed from: n */
    public final C33950d.C33967q mo82278n() {
        return this.f82704a;
    }

    /* renamed from: o */
    public final long mo82279o() {
        return this.f82715l;
    }

    public String toString() {
        C33950d.C33967q qVar = this.f82704a;
        C33950d.C33961k kVar = this.f82705b;
        C33950d.C33951a aVar = this.f82706c;
        C33950d.C33955e eVar = this.f82707d;
        C33950d.C33966p pVar = this.f82708e;
        C33950d.C33954d dVar = this.f82709f;
        C33950d.C33952b bVar = this.f82710g;
        List list = this.f82711h;
        List list2 = this.f82712i;
        Boolean bool = this.f82713j;
        Boolean bool2 = this.f82714k;
        long j = this.f82715l;
        C33950d.C33957g gVar = this.f82716m;
        return "ViewState(productHeader=" + qVar + ", operationsButtons=" + kVar + ", accountCards=" + aVar + ", cardInsuranceOffer=" + eVar + ", paymentDetails=" + pVar + ", billingDetails=" + dVar + ", accountDetails=" + bVar + ", linkedLoans=" + list + ", operations=" + list2 + ", operationsIsLoading=" + bool + ", operationsLoadingError=" + bool2 + ", selectedAccKey=" + j + ", googlePayBanner=" + gVar + ")";
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ C34007l(p341ge.bog.mobilebank.products.presentation.details.creditcard.C33950d.C33967q r19, p341ge.bog.mobilebank.products.presentation.details.creditcard.C33950d.C33961k r20, p341ge.bog.mobilebank.products.presentation.details.creditcard.C33950d.C33951a r21, p341ge.bog.mobilebank.products.presentation.details.creditcard.C33950d.C33955e r22, p341ge.bog.mobilebank.products.presentation.details.creditcard.C33950d.C33966p r23, p341ge.bog.mobilebank.products.presentation.details.creditcard.C33950d.C33954d r24, p341ge.bog.mobilebank.products.presentation.details.creditcard.C33950d.C33952b r25, java.util.List r26, java.util.List r27, java.lang.Boolean r28, java.lang.Boolean r29, long r30, p341ge.bog.mobilebank.products.presentation.details.creditcard.C33950d.C33957g r32, int r33, kotlin.jvm.internal.DefaultConstructorMarker r34) {
        /*
            r18 = this;
            r0 = r33
            r1 = r0 & 1
            r2 = 0
            if (r1 == 0) goto L_0x0009
            r4 = r2
            goto L_0x000b
        L_0x0009:
            r4 = r19
        L_0x000b:
            r1 = r0 & 2
            if (r1 == 0) goto L_0x0011
            r5 = r2
            goto L_0x0013
        L_0x0011:
            r5 = r20
        L_0x0013:
            r1 = r0 & 4
            if (r1 == 0) goto L_0x0019
            r6 = r2
            goto L_0x001b
        L_0x0019:
            r6 = r21
        L_0x001b:
            r1 = r0 & 8
            if (r1 == 0) goto L_0x0021
            r7 = r2
            goto L_0x0023
        L_0x0021:
            r7 = r22
        L_0x0023:
            r1 = r0 & 16
            if (r1 == 0) goto L_0x0029
            r8 = r2
            goto L_0x002b
        L_0x0029:
            r8 = r23
        L_0x002b:
            r1 = r0 & 32
            if (r1 == 0) goto L_0x0031
            r9 = r2
            goto L_0x0033
        L_0x0031:
            r9 = r24
        L_0x0033:
            r1 = r0 & 64
            if (r1 == 0) goto L_0x0039
            r10 = r2
            goto L_0x003b
        L_0x0039:
            r10 = r25
        L_0x003b:
            r1 = r0 & 128(0x80, float:1.794E-43)
            if (r1 == 0) goto L_0x0045
            java.util.List r1 = ie1.C41341q.m119907j()
            r11 = r1
            goto L_0x0047
        L_0x0045:
            r11 = r26
        L_0x0047:
            r1 = r0 & 256(0x100, float:3.59E-43)
            if (r1 == 0) goto L_0x0051
            java.util.List r1 = ie1.C41341q.m119907j()
            r12 = r1
            goto L_0x0053
        L_0x0051:
            r12 = r27
        L_0x0053:
            r1 = r0 & 512(0x200, float:7.175E-43)
            if (r1 == 0) goto L_0x0059
            r13 = r2
            goto L_0x005b
        L_0x0059:
            r13 = r28
        L_0x005b:
            r1 = r0 & 1024(0x400, float:1.435E-42)
            if (r1 == 0) goto L_0x0061
            r14 = r2
            goto L_0x0063
        L_0x0061:
            r14 = r29
        L_0x0063:
            r0 = r0 & 4096(0x1000, float:5.74E-42)
            if (r0 == 0) goto L_0x006a
            r17 = r2
            goto L_0x006c
        L_0x006a:
            r17 = r32
        L_0x006c:
            r3 = r18
            r15 = r30
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r17)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p341ge.bog.mobilebank.products.presentation.details.creditcard.C34007l.<init>(ge.bog.mobilebank.products.presentation.details.creditcard.d$q, ge.bog.mobilebank.products.presentation.details.creditcard.d$k, ge.bog.mobilebank.products.presentation.details.creditcard.d$a, ge.bog.mobilebank.products.presentation.details.creditcard.d$e, ge.bog.mobilebank.products.presentation.details.creditcard.d$p, ge.bog.mobilebank.products.presentation.details.creditcard.d$d, ge.bog.mobilebank.products.presentation.details.creditcard.d$b, java.util.List, java.util.List, java.lang.Boolean, java.lang.Boolean, long, ge.bog.mobilebank.products.presentation.details.creditcard.d$g, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
