package l01;

import ed1.C40749p;
import ed1.C40754t;
import j70.C25341c;
import java.util.List;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import md0.C26186e;
import o70.C26766e;
import ue1.C43075l;
import ue1.C43079p;

/* renamed from: l01.e */
public final class C37048e {

    /* renamed from: d */
    public static final C37049a f89199d = new C37049a((DefaultConstructorMarker) null);

    /* renamed from: a */
    private final C25341c f89200a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final C37044b f89201b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final C37054h f89202c;

    /* renamed from: l01.e$a */
    public static final class C37049a {
        private C37049a() {
        }

        public /* synthetic */ C37049a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: l01.e$b */
    static final class C37050b extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C37048e f89203d;

        /* renamed from: l01.e$b$a */
        static final class C37051a extends C41537m implements C43079p {

            /* renamed from: d */
            final /* synthetic */ C26766e f89204d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C37051a(C26766e eVar) {
                super(2);
                this.f89204d = eVar;
            }

            /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v2, resolved type: java.lang.String} */
            /* JADX WARNING: type inference failed for: r11v0 */
            /* JADX WARNING: type inference failed for: r11v1, types: [java.lang.Object] */
            /* JADX WARNING: type inference failed for: r13v13, types: [ge.bog.mobilebank.qrwithdrawal.presentation.model.CardUiModel] */
            /* JADX WARNING: type inference failed for: r11v5 */
            /* JADX WARNING: Code restructure failed: missing block: B:48:0x0118, code lost:
                if (r12 == null) goto L_0x011c;
             */
            /* JADX WARNING: Multi-variable type inference failed */
            /* JADX WARNING: Removed duplicated region for block: B:88:0x01d8  */
            /* JADX WARNING: Removed duplicated region for block: B:92:0x0027 A[SYNTHETIC] */
            /* renamed from: a */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final java.util.List invoke(m01.C37187a r33, java.util.List r34) {
                /*
                    r32 = this;
                    java.lang.String r0 = "debitCards"
                    r1 = r33
                    kotlin.jvm.internal.C41536l.m120489i(r1, r0)
                    java.lang.String r0 = "creditCards"
                    r2 = r34
                    kotlin.jvm.internal.C41536l.m120489i(r2, r0)
                    r0 = r32
                    o70.e r3 = r0.f89204d
                    java.util.Map r3 = r3.mo66048a()
                    java.util.Collection r3 = r3.values()
                    java.util.List r3 = ie1.C41343r.m119927w(r3)
                    java.util.ArrayList r4 = new java.util.ArrayList
                    r4.<init>()
                    java.util.Iterator r3 = r3.iterator()
                L_0x0027:
                    boolean r5 = r3.hasNext()
                    if (r5 == 0) goto L_0x01dd
                    java.lang.Object r5 = r3.next()
                    o70.d r5 = (o70.C26765d) r5
                    java.lang.String r6 = r5.mo66001F()
                    java.lang.String r7 = "DEBITCARD"
                    boolean r8 = kotlin.jvm.internal.C41536l.m120484d(r6, r7)
                    r9 = 1
                    r10 = 0
                    r11 = 0
                    if (r8 == 0) goto L_0x00b5
                    java.util.List r6 = r33.mo90206a()
                    java.util.Iterator r6 = r6.iterator()
                L_0x004a:
                    boolean r8 = r6.hasNext()
                    if (r8 == 0) goto L_0x0070
                    java.lang.Object r8 = r6.next()
                    r12 = r8
                    m01.b r12 = (m01.C37188b) r12
                    java.lang.Long r12 = r12.mo90210a()
                    long r13 = r5.mo66019a()
                    if (r12 != 0) goto L_0x0062
                    goto L_0x006c
                L_0x0062:
                    long r15 = r12.longValue()
                    int r12 = (r15 > r13 ? 1 : (r15 == r13 ? 0 : -1))
                    if (r12 != 0) goto L_0x006c
                    r12 = r9
                    goto L_0x006d
                L_0x006c:
                    r12 = r10
                L_0x006d:
                    if (r12 == 0) goto L_0x004a
                    goto L_0x0071
                L_0x0070:
                    r8 = r11
                L_0x0071:
                    m01.b r8 = (m01.C37188b) r8
                    if (r8 == 0) goto L_0x007a
                    java.lang.String r6 = r8.mo90211b()
                    goto L_0x007b
                L_0x007a:
                    r6 = r11
                L_0x007b:
                    if (r8 == 0) goto L_0x00af
                    java.util.List r8 = r8.mo90212c()
                    if (r8 == 0) goto L_0x00af
                    java.util.ArrayList r12 = new java.util.ArrayList
                    r13 = 10
                    int r13 = ie1.C41343r.m119925u(r8, r13)
                    r12.<init>(r13)
                    java.util.Iterator r8 = r8.iterator()
                L_0x0092:
                    boolean r13 = r8.hasNext()
                    if (r13 == 0) goto L_0x0120
                    java.lang.Object r13 = r8.next()
                    m01.c r13 = (m01.C37189c) r13
                    ge.bog.mobilebank.qrwithdrawal.presentation.model.AvailableAmount r14 = new ge.bog.mobilebank.qrwithdrawal.presentation.model.AvailableAmount
                    java.math.BigDecimal r15 = r13.mo90216a()
                    java.lang.String r13 = r13.mo90217b()
                    r14.<init>(r15, r13)
                    r12.add(r14)
                    goto L_0x0092
                L_0x00af:
                    java.util.List r12 = ie1.C41341q.m119907j()
                    goto L_0x0120
                L_0x00b5:
                    java.lang.String r8 = "CREDITCARD"
                    boolean r6 = kotlin.jvm.internal.C41536l.m120484d(r6, r8)
                    if (r6 == 0) goto L_0x01d6
                    java.util.Iterator r6 = r34.iterator()
                L_0x00c1:
                    boolean r8 = r6.hasNext()
                    if (r8 == 0) goto L_0x00e7
                    java.lang.Object r8 = r6.next()
                    r12 = r8
                    m01.f r12 = (m01.C37192f) r12
                    java.lang.Long r12 = r12.mo90227a()
                    long r13 = r5.mo66019a()
                    if (r12 != 0) goto L_0x00d9
                    goto L_0x00e3
                L_0x00d9:
                    long r15 = r12.longValue()
                    int r12 = (r15 > r13 ? 1 : (r15 == r13 ? 0 : -1))
                    if (r12 != 0) goto L_0x00e3
                    r12 = r9
                    goto L_0x00e4
                L_0x00e3:
                    r12 = r10
                L_0x00e4:
                    if (r12 == 0) goto L_0x00c1
                    goto L_0x00e8
                L_0x00e7:
                    r8 = r11
                L_0x00e8:
                    m01.f r8 = (m01.C37192f) r8
                    if (r8 == 0) goto L_0x011b
                    java.lang.String r6 = r8.mo90228b()
                    ge.bog.mobilebank.qrwithdrawal.presentation.model.AvailableAmount r12 = new ge.bog.mobilebank.qrwithdrawal.presentation.model.AvailableAmount
                    java.lang.Double r13 = r8.mo90229c()
                    if (r13 == 0) goto L_0x0106
                    java.math.BigDecimal r14 = new java.math.BigDecimal
                    double r15 = r13.doubleValue()
                    java.lang.String r13 = java.lang.String.valueOf(r15)
                    r14.<init>(r13)
                    goto L_0x0108
                L_0x0106:
                    java.math.BigDecimal r14 = java.math.BigDecimal.ZERO
                L_0x0108:
                    java.lang.String r13 = "it.availableAmount?.toBi…       ?: BigDecimal.ZERO"
                    kotlin.jvm.internal.C41536l.m120488h(r14, r13)
                    java.lang.String r8 = r8.mo90230d()
                    r12.<init>(r14, r8)
                    java.util.List r12 = ie1.C41339p.m119900e(r12)
                    if (r12 != 0) goto L_0x0120
                    goto L_0x011c
                L_0x011b:
                    r6 = r11
                L_0x011c:
                    java.util.List r12 = ie1.C41341q.m119907j()
                L_0x0120:
                    r21 = r6
                    r25 = r12
                    long r12 = r5.mo66030j()
                    java.lang.String r14 = java.lang.String.valueOf(r12)
                    java.lang.String r15 = r5.mo65997B()
                    java.lang.String r17 = r5.mo66009N()
                    long r18 = r5.mo66019a()
                    if (r21 != 0) goto L_0x013c
                    goto L_0x01d6
                L_0x013c:
                    o70.b r6 = r5.mo66043v()
                    if (r6 == 0) goto L_0x0147
                    java.lang.String r6 = r6.mo65985b()
                    goto L_0x0148
                L_0x0147:
                    r6 = r11
                L_0x0148:
                    o70.b r8 = r5.mo66043v()
                    if (r8 == 0) goto L_0x0156
                    boolean r8 = r8.mo65987d()
                    if (r8 != r9) goto L_0x0156
                    r8 = r9
                    goto L_0x0157
                L_0x0156:
                    r8 = r10
                L_0x0157:
                    o70.b r12 = r5.mo66043v()
                    if (r12 == 0) goto L_0x0168
                    java.lang.String r12 = r12.mo65986c()
                    if (r12 == 0) goto L_0x0168
                    java.lang.String r12 = g91.C32289b0.m95091c(r12)
                    goto L_0x0169
                L_0x0168:
                    r12 = r11
                L_0x0169:
                    ge.bog.mobilebank.qrwithdrawal.presentation.model.CardExternalFileData r13 = new ge.bog.mobilebank.qrwithdrawal.presentation.model.CardExternalFileData
                    r13.<init>(r6, r8, r12)
                    o70.b r6 = r5.mo66025f()
                    if (r6 == 0) goto L_0x0179
                    java.lang.String r6 = r6.mo65985b()
                    goto L_0x017a
                L_0x0179:
                    r6 = r11
                L_0x017a:
                    o70.b r8 = r5.mo66025f()
                    if (r8 == 0) goto L_0x0187
                    boolean r8 = r8.mo65987d()
                    if (r8 != r9) goto L_0x0187
                    goto L_0x0188
                L_0x0187:
                    r9 = r10
                L_0x0188:
                    o70.b r8 = r5.mo66025f()
                    if (r8 == 0) goto L_0x0198
                    java.lang.String r8 = r8.mo65986c()
                    if (r8 == 0) goto L_0x0198
                    java.lang.String r11 = g91.C32289b0.m95091c(r8)
                L_0x0198:
                    ge.bog.mobilebank.qrwithdrawal.presentation.model.CardExternalFileData r8 = new ge.bog.mobilebank.qrwithdrawal.presentation.model.CardExternalFileData
                    r8.<init>(r6, r9, r11)
                    java.lang.String r6 = r5.mo66022d()
                    xh.a r6 = o31.C37603j.m110584g(r6)
                    if (r6 != 0) goto L_0x01a9
                    xh.a r6 = p669xh.C18763a.VISA
                L_0x01a9:
                    r22 = r6
                    java.lang.String r6 = r5.mo66001F()
                    boolean r16 = kotlin.jvm.internal.C41536l.m120484d(r6, r7)
                    boolean r27 = r5.mo66013R()
                    java.lang.Object r6 = ie1.C41358y.m120007W(r25)
                    r26 = r6
                    ge.bog.mobilebank.qrwithdrawal.presentation.model.AvailableAmount r26 = (p341ge.bog.mobilebank.qrwithdrawal.presentation.model.AvailableAmount) r26
                    java.lang.String r20 = r5.mo66047z()
                    ge.bog.mobilebank.qrwithdrawal.presentation.model.CardUiModel r11 = new ge.bog.mobilebank.qrwithdrawal.presentation.model.CardUiModel
                    r5 = r13
                    r13 = r11
                    r28 = 0
                    r29 = 0
                    r30 = 24576(0x6000, float:3.4438E-41)
                    r31 = 0
                    r23 = r5
                    r24 = r8
                    r13.<init>(r14, r15, r16, r17, r18, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31)
                L_0x01d6:
                    if (r11 == 0) goto L_0x0027
                    r4.add(r11)
                    goto L_0x0027
                L_0x01dd:
                    return r4
                */
                throw new UnsupportedOperationException("Method not decompiled: l01.C37048e.C37050b.C37051a.invoke(m01.a, java.util.List):java.util.List");
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C37050b(C37048e eVar) {
            super(1);
            this.f89203d = eVar;
        }

        /* access modifiers changed from: private */
        /* renamed from: c */
        public static final List m109574c(C43079p pVar, Object obj, Object obj2) {
            C41536l.m120489i(pVar, "$tmp0");
            return (List) pVar.invoke(obj, obj2);
        }

        /* JADX WARNING: Removed duplicated region for block: B:15:0x004c  */
        /* JADX WARNING: Removed duplicated region for block: B:23:0x0061  */
        /* JADX WARNING: Removed duplicated region for block: B:27:0x0076  */
        /* JADX WARNING: Removed duplicated region for block: B:38:0x0014 A[SYNTHETIC] */
        /* JADX WARNING: Removed duplicated region for block: B:43:0x0055 A[EDGE_INSN: B:43:0x0055->B:19:0x0055 ?: BREAK  , SYNTHETIC] */
        /* renamed from: b */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final ed1.C40754t invoke(o70.C26766e r11) {
            /*
                r10 = this;
                java.lang.String r0 = "result"
                kotlin.jvm.internal.C41536l.m120489i(r11, r0)
                java.util.Map r0 = r11.mo66048a()
                java.util.Collection r0 = r0.values()
                java.util.Iterator r0 = r0.iterator()
                r1 = 0
                r2 = r1
                r3 = r2
            L_0x0014:
                boolean r4 = r0.hasNext()
                if (r4 == 0) goto L_0x0078
                java.lang.Object r4 = r0.next()
                java.util.List r4 = (java.util.List) r4
                boolean r5 = r4 instanceof java.util.Collection
                r6 = 1
                if (r5 == 0) goto L_0x002d
                boolean r7 = r4.isEmpty()
                if (r7 == 0) goto L_0x002d
            L_0x002b:
                r7 = r1
                goto L_0x004a
            L_0x002d:
                java.util.Iterator r7 = r4.iterator()
            L_0x0031:
                boolean r8 = r7.hasNext()
                if (r8 == 0) goto L_0x002b
                java.lang.Object r8 = r7.next()
                o70.d r8 = (o70.C26765d) r8
                java.lang.String r8 = r8.mo66001F()
                java.lang.String r9 = "DEBITCARD"
                boolean r8 = kotlin.jvm.internal.C41536l.m120484d(r8, r9)
                if (r8 == 0) goto L_0x0031
                r7 = r6
            L_0x004a:
                if (r7 == 0) goto L_0x004d
                r2 = r6
            L_0x004d:
                if (r5 == 0) goto L_0x0057
                boolean r5 = r4.isEmpty()
                if (r5 == 0) goto L_0x0057
            L_0x0055:
                r4 = r1
                goto L_0x0074
            L_0x0057:
                java.util.Iterator r4 = r4.iterator()
            L_0x005b:
                boolean r5 = r4.hasNext()
                if (r5 == 0) goto L_0x0055
                java.lang.Object r5 = r4.next()
                o70.d r5 = (o70.C26765d) r5
                java.lang.String r5 = r5.mo66001F()
                java.lang.String r7 = "CREDITCARD"
                boolean r5 = kotlin.jvm.internal.C41536l.m120484d(r5, r7)
                if (r5 == 0) goto L_0x005b
                r4 = r6
            L_0x0074:
                if (r4 == 0) goto L_0x0014
                r3 = r6
                goto L_0x0014
            L_0x0078:
                if (r2 == 0) goto L_0x0085
                l01.e r0 = r10.f89203d
                l01.b r0 = r0.f89201b
                ed1.p r0 = r0.mo89965b()
                goto L_0x0097
            L_0x0085:
                m01.a r0 = new m01.a
                java.util.List r1 = ie1.C41341q.m119907j()
                r0.<init>(r1)
                ed1.p r0 = ed1.C40749p.m118043h0(r0)
                java.lang.String r1 = "{\n                      …)))\n                    }"
                kotlin.jvm.internal.C41536l.m120488h(r0, r1)
            L_0x0097:
                if (r3 == 0) goto L_0x00a4
                l01.e r1 = r10.f89203d
                l01.h r1 = r1.f89202c
                ed1.p r1 = r1.mo89971b()
                goto L_0x00b1
            L_0x00a4:
                java.util.List r1 = ie1.C41341q.m119907j()
                ed1.p r1 = ed1.C40749p.m118043h0(r1)
                java.lang.String r2 = "{\n                      …())\n                    }"
                kotlin.jvm.internal.C41536l.m120488h(r1, r2)
            L_0x00b1:
                l01.e$b$a r2 = new l01.e$b$a
                r2.<init>(r11)
                l01.f r11 = new l01.f
                r11.<init>(r2)
                ed1.p r11 = ed1.C40749p.m118037d1(r0, r1, r11)
                return r11
            */
            throw new UnsupportedOperationException("Method not decompiled: l01.C37048e.C37050b.invoke(o70.e):ed1.t");
        }
    }

    public C37048e(C25341c cVar, C37044b bVar, C37054h hVar) {
        C41536l.m120489i(cVar, "getCardsAndDetails");
        C41536l.m120489i(bVar, "getAccountsAndDetailsUseCase");
        C41536l.m120489i(hVar, "getCreditCardsAndDetailsUseCase");
        this.f89200a = cVar;
        this.f89201b = bVar;
        this.f89202c = hVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public static final C40754t m109571e(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (C40754t) lVar.invoke(obj);
    }

    /* renamed from: d */
    public final C40749p mo89968d() {
        C40749p Q = C26186e.m81987e(C25341c.C25342a.m80514a(this.f89200a, false, 1, (Object) null)).mo94998Q(new C37047d(new C37050b(this)));
        C41536l.m120488h(Q, "operator fun invoke(): O…    }\n            }\n    }");
        return Q;
    }
}
