package p341ge.bog.mobilebank.bnpl.presentation.details;

import java.util.List;
import kotlin.jvm.internal.C41536l;
import p190o1.C7397t;
import p341ge.bog.mobilebank.bnpl.presentation.details.C13838d;

/* renamed from: ge.bog.mobilebank.bnpl.presentation.details.l */
public final class C13877l {

    /* renamed from: a */
    private final C13838d.C13842d f41194a;

    /* renamed from: b */
    private final C13838d.C13841c f41195b;

    /* renamed from: c */
    private final C13838d.C13839a f41196c;

    /* renamed from: d */
    private final long f41197d;

    /* renamed from: e */
    private final Boolean f41198e;

    /* renamed from: f */
    private final Boolean f41199f;

    /* renamed from: g */
    private final List f41200g;

    /* renamed from: h */
    private final C13838d.C13848j f41201h;

    public C13877l(C13838d.C13842d dVar, C13838d.C13841c cVar, C13838d.C13839a aVar, long j, Boolean bool, Boolean bool2, List list, C13838d.C13848j jVar) {
        C41536l.m120489i(list, "scheduleItems");
        this.f41194a = dVar;
        this.f41195b = cVar;
        this.f41196c = aVar;
        this.f41197d = j;
        this.f41198e = bool;
        this.f41199f = bool2;
        this.f41200g = list;
        this.f41201h = jVar;
    }

    /* renamed from: b */
    public static /* synthetic */ C13877l m51703b(C13877l lVar, C13838d.C13842d dVar, C13838d.C13841c cVar, C13838d.C13839a aVar, long j, Boolean bool, Boolean bool2, List list, C13838d.C13848j jVar, int i, Object obj) {
        C13877l lVar2 = lVar;
        int i2 = i;
        return lVar.mo38268a((i2 & 1) != 0 ? lVar2.f41194a : dVar, (i2 & 2) != 0 ? lVar2.f41195b : cVar, (i2 & 4) != 0 ? lVar2.f41196c : aVar, (i2 & 8) != 0 ? lVar2.f41197d : j, (i2 & 16) != 0 ? lVar2.f41198e : bool, (i2 & 32) != 0 ? lVar2.f41199f : bool2, (i2 & 64) != 0 ? lVar2.f41200g : list, (i2 & 128) != 0 ? lVar2.f41201h : jVar);
    }

    /* renamed from: a */
    public final C13877l mo38268a(C13838d.C13842d dVar, C13838d.C13841c cVar, C13838d.C13839a aVar, long j, Boolean bool, Boolean bool2, List list, C13838d.C13848j jVar) {
        List list2 = list;
        C41536l.m120489i(list2, "scheduleItems");
        return new C13877l(dVar, cVar, aVar, j, bool, bool2, list2, jVar);
    }

    /* renamed from: c */
    public final C13838d.C13839a mo38269c() {
        return this.f41196c;
    }

    /* renamed from: d */
    public final C13838d.C13841c mo38270d() {
        return this.f41195b;
    }

    /* renamed from: e */
    public final C13838d.C13842d mo38271e() {
        return this.f41194a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C13877l)) {
            return false;
        }
        C13877l lVar = (C13877l) obj;
        return C41536l.m120484d(this.f41194a, lVar.f41194a) && C41536l.m120484d(this.f41195b, lVar.f41195b) && C41536l.m120484d(this.f41196c, lVar.f41196c) && this.f41197d == lVar.f41197d && C41536l.m120484d(this.f41198e, lVar.f41198e) && C41536l.m120484d(this.f41199f, lVar.f41199f) && C41536l.m120484d(this.f41200g, lVar.f41200g) && C41536l.m120484d(this.f41201h, lVar.f41201h);
    }

    /* renamed from: f */
    public final Boolean mo38273f() {
        return this.f41199f;
    }

    /* renamed from: g */
    public final List mo38274g() {
        return this.f41200g;
    }

    /* renamed from: h */
    public final Boolean mo38275h() {
        return this.f41198e;
    }

    public int hashCode() {
        C13838d.C13842d dVar = this.f41194a;
        int i = 0;
        int hashCode = (dVar == null ? 0 : dVar.hashCode()) * 31;
        C13838d.C13841c cVar = this.f41195b;
        int hashCode2 = (hashCode + (cVar == null ? 0 : cVar.hashCode())) * 31;
        C13838d.C13839a aVar = this.f41196c;
        int hashCode3 = (((hashCode2 + (aVar == null ? 0 : aVar.hashCode())) * 31) + C7397t.m28148a(this.f41197d)) * 31;
        Boolean bool = this.f41198e;
        int hashCode4 = (hashCode3 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.f41199f;
        int hashCode5 = (((hashCode4 + (bool2 == null ? 0 : bool2.hashCode())) * 31) + this.f41200g.hashCode()) * 31;
        C13838d.C13848j jVar = this.f41201h;
        if (jVar != null) {
            i = jVar.hashCode();
        }
        return hashCode5 + i;
    }

    /* renamed from: i */
    public final long mo38277i() {
        return this.f41197d;
    }

    /* renamed from: j */
    public final C13838d.C13848j mo38278j() {
        return this.f41201h;
    }

    public String toString() {
        C13838d.C13842d dVar = this.f41194a;
        C13838d.C13841c cVar = this.f41195b;
        C13838d.C13839a aVar = this.f41196c;
        long j = this.f41197d;
        Boolean bool = this.f41198e;
        Boolean bool2 = this.f41199f;
        List list = this.f41200g;
        C13838d.C13848j jVar = this.f41201h;
        return "ViewState(productHeader=" + dVar + ", operationButtons=" + cVar + ", details=" + aVar + ", selectedBnplLoanKey=" + j + ", scheduleLoading=" + bool + ", scheduleError=" + bool2 + ", scheduleItems=" + list + ", termsItem=" + jVar + ")";
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ C13877l(p341ge.bog.mobilebank.bnpl.presentation.details.C13838d.C13842d r14, p341ge.bog.mobilebank.bnpl.presentation.details.C13838d.C13841c r15, p341ge.bog.mobilebank.bnpl.presentation.details.C13838d.C13839a r16, long r17, java.lang.Boolean r19, java.lang.Boolean r20, java.util.List r21, p341ge.bog.mobilebank.bnpl.presentation.details.C13838d.C13848j r22, int r23, kotlin.jvm.internal.DefaultConstructorMarker r24) {
        /*
            r13 = this;
            r0 = r23
            r1 = r0 & 1
            r2 = 0
            if (r1 == 0) goto L_0x0009
            r4 = r2
            goto L_0x000a
        L_0x0009:
            r4 = r14
        L_0x000a:
            r1 = r0 & 2
            if (r1 == 0) goto L_0x0010
            r5 = r2
            goto L_0x0011
        L_0x0010:
            r5 = r15
        L_0x0011:
            r1 = r0 & 4
            if (r1 == 0) goto L_0x0017
            r6 = r2
            goto L_0x0019
        L_0x0017:
            r6 = r16
        L_0x0019:
            r1 = r0 & 16
            if (r1 == 0) goto L_0x001f
            r9 = r2
            goto L_0x0021
        L_0x001f:
            r9 = r19
        L_0x0021:
            r1 = r0 & 32
            if (r1 == 0) goto L_0x0027
            r10 = r2
            goto L_0x0029
        L_0x0027:
            r10 = r20
        L_0x0029:
            r1 = r0 & 64
            if (r1 == 0) goto L_0x0033
            java.util.List r1 = ie1.C41341q.m119907j()
            r11 = r1
            goto L_0x0035
        L_0x0033:
            r11 = r21
        L_0x0035:
            r0 = r0 & 128(0x80, float:1.794E-43)
            if (r0 == 0) goto L_0x003b
            r12 = r2
            goto L_0x003d
        L_0x003b:
            r12 = r22
        L_0x003d:
            r3 = r13
            r7 = r17
            r3.<init>(r4, r5, r6, r7, r9, r10, r11, r12)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p341ge.bog.mobilebank.bnpl.presentation.details.C13877l.<init>(ge.bog.mobilebank.bnpl.presentation.details.d$d, ge.bog.mobilebank.bnpl.presentation.details.d$c, ge.bog.mobilebank.bnpl.presentation.details.d$a, long, java.lang.Boolean, java.lang.Boolean, java.util.List, ge.bog.mobilebank.bnpl.presentation.details.d$j, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
