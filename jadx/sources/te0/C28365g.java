package te0;

import ed1.C40734b;
import ed1.C40749p;
import ed1.C40754t;
import ee1.C40765a;
import ee1.C40767b;
import hd1.C41205b;
import he1.C41238w;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import je0.C25429w0;
import kf0.C25723a;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p341ge.bog.mobilebank.galtandtaggart.data.transactionhistory.model.GTTransactionHistoryApiModel;
import se0.C28191a;
import ue1.C43075l;

/* renamed from: te0.g */
public final class C28365g implements C25723a {

    /* renamed from: n */
    public static final C28366a f71877n = new C28366a((DefaultConstructorMarker) null);

    /* renamed from: d */
    private final C25429w0 f71878d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public final C28191a f71879e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public final AtomicReference f71880f = new AtomicReference((Object) null);

    /* renamed from: g */
    private final C40767b f71881g;

    /* renamed from: h */
    private Long f71882h;

    /* renamed from: i */
    private Long f71883i;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public AtomicBoolean f71884j;
    /* access modifiers changed from: private */

    /* renamed from: k */
    public AtomicBoolean f71885k;

    /* renamed from: l */
    private C40765a f71886l;

    /* renamed from: m */
    private C40767b f71887m;

    /* renamed from: te0.g$a */
    public static final class C28366a {
        private C28366a() {
        }

        public /* synthetic */ C28366a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: te0.g$b */
    static final class C28367b extends C41537m implements C43075l {

        /* renamed from: d */
        public static final C28367b f71888d = new C28367b();

        C28367b() {
            super(1);
        }

        /* renamed from: a */
        public final C40754t invoke(C40749p pVar) {
            C41536l.m120489i(pVar, "it");
            return pVar;
        }
    }

    /* renamed from: te0.g$c */
    static final class C28368c extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C28365g f71889d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C28368c(C28365g gVar) {
            super(1);
            this.f71889d = gVar;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Throwable) obj);
            return C41238w.f97225a;
        }

        public final void invoke(Throwable th) {
            this.f71889d.f71885k.set(true);
            this.f71889d.f71884j.set(false);
        }
    }

    /* renamed from: te0.g$d */
    static final class C28369d extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C28365g f71890d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C28369d(C28365g gVar) {
            super(1);
            this.f71890d = gVar;
        }

        /* renamed from: a */
        public final void mo67994a(C41205b bVar) {
            this.f71890d.f71885k.set(false);
            this.f71890d.f71884j.set(true);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo67994a((C41205b) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: te0.g$e */
    static final class C28370e extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C28365g f71891d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C28370e(C28365g gVar) {
            super(1);
            this.f71891d = gVar;
        }

        /* renamed from: a */
        public final void mo67995a(GTTransactionHistoryApiModel gTTransactionHistoryApiModel) {
            this.f71891d.f71885k.set(false);
            this.f71891d.f71884j.set(false);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo67995a((GTTransactionHistoryApiModel) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: te0.g$f */
    static final class C28371f extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C28365g f71892d;

        /* renamed from: e */
        final /* synthetic */ List f71893e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C28371f(C28365g gVar, List list) {
            super(1);
            this.f71892d = gVar;
            this.f71893e = list;
        }

        /* renamed from: a */
        public final List invoke(GTTransactionHistoryApiModel gTTransactionHistoryApiModel) {
            C41536l.m120489i(gTTransactionHistoryApiModel, "it");
            List h = this.f71892d.f71879e.mo67713h(gTTransactionHistoryApiModel);
            this.f71892d.f71880f.set(h);
            return this.f71892d.m87017m4(h, this.f71893e);
        }
    }

    public C28365g(C25429w0 w0Var, C28191a aVar) {
        C41536l.m120489i(w0Var, "service");
        C41536l.m120489i(aVar, "mapper");
        this.f71878d = w0Var;
        this.f71879e = aVar;
        C40767b h1 = C40767b.m118210h1();
        C41536l.m120488h(h1, "create<TransactionEvent>()");
        this.f71881g = h1;
        this.f71884j = new AtomicBoolean(false);
        this.f71885k = new AtomicBoolean(false);
        C40765a i1 = C40765a.m118199i1(m87019p4((Long) null, (Long) null, (List) null));
        C41536l.m120488h(i1, "createDefault(getTransac…rvable(null, null, null))");
        this.f71886l = i1;
        C40767b h12 = C40767b.m118210h1();
        C41536l.m120488h(h12, "create<Unit>()");
        this.f71887m = h12;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v0, resolved type: ge.bog.mobilebank.galtandtaggart.domain.transactionhistory.model.GTTransaction} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v1, resolved type: ge.bog.mobilebank.galtandtaggart.domain.transactionhistory.model.GTTransaction} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v2, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v1, resolved type: ge.bog.mobilebank.galtandtaggart.domain.transactionhistory.model.GTTransaction} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v5, resolved type: ge.bog.mobilebank.galtandtaggart.domain.transactionhistory.model.GTTransaction} */
    /* access modifiers changed from: private */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: k4 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m87015k4(te0.C28365g r49, java.lang.String r50) {
        /*
            r0 = r49
            r1 = r50
            java.lang.String r2 = "this$0"
            kotlin.jvm.internal.C41536l.m120489i(r0, r2)
            java.lang.String r2 = "$orderId"
            kotlin.jvm.internal.C41536l.m120489i(r1, r2)
            java.util.concurrent.atomic.AtomicReference r2 = r0.f71880f
            java.lang.Object r2 = r2.get()
            java.util.List r2 = (java.util.List) r2
            r3 = 0
            if (r2 == 0) goto L_0x001e
            java.util.List r2 = ie1.C41358y.m119991B0(r2)
            goto L_0x001f
        L_0x001e:
            r2 = r3
        L_0x001f:
            if (r2 == 0) goto L_0x00b1
            java.util.Iterator r4 = r2.iterator()
        L_0x0025:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x003d
            java.lang.Object r5 = r4.next()
            r6 = r5
            ge.bog.mobilebank.galtandtaggart.domain.transactionhistory.model.GTTransaction r6 = (p341ge.bog.mobilebank.galtandtaggart.domain.transactionhistory.model.GTTransaction) r6
            java.lang.String r6 = r6.mo60179y()
            boolean r6 = kotlin.jvm.internal.C41536l.m120484d(r6, r1)
            if (r6 == 0) goto L_0x0025
            r3 = r5
        L_0x003d:
            ge.bog.mobilebank.galtandtaggart.domain.transactionhistory.model.GTTransaction r3 = (p341ge.bog.mobilebank.galtandtaggart.domain.transactionhistory.model.GTTransaction) r3
            if (r3 != 0) goto L_0x0042
            goto L_0x00b1
        L_0x0042:
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            r15 = 0
            r16 = 0
            r17 = 0
            r18 = 0
            r19 = 0
            r20 = 0
            r21 = 0
            r22 = 0
            r23 = 0
            r24 = 0
            r25 = 0
            r26 = 0
            r27 = 0
            r28 = 0
            r1 = 6
            java.lang.Integer r29 = java.lang.Integer.valueOf(r1)
            r30 = 0
            r31 = 0
            r32 = 0
            r33 = 0
            r34 = 0
            r35 = 0
            r36 = 0
            r37 = 0
            r38 = 0
            r39 = 0
            r40 = 0
            r41 = 0
            r42 = 0
            r43 = 0
            r44 = 0
            r45 = 0
            r46 = -16777217(0xfffffffffeffffff, float:-1.7014117E38)
            r47 = 511(0x1ff, float:7.16E-43)
            r48 = 0
            r4 = r3
            ge.bog.mobilebank.galtandtaggart.domain.transactionhistory.model.GTTransaction r1 = p341ge.bog.mobilebank.galtandtaggart.domain.transactionhistory.model.GTTransaction.m75720b(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45, r46, r47, r48)
            int r3 = r2.indexOf(r3)
            r2.remove(r3)
            r2.add(r3, r1)
            java.util.concurrent.atomic.AtomicReference r3 = r0.f71880f
            r3.set(r2)
            ee1.b r0 = r0.f71881g
            hf0.b$a r2 = new hf0.b$a
            r2.<init>(r1)
            r0.onNext(r2)
        L_0x00b1:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: te0.C28365g.m87015k4(te0.g, java.lang.String):void");
    }

    /* renamed from: l4 */
    private final String m87016l4(Long l) {
        if (l == null) {
            return null;
        }
        l.longValue();
        return new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss'.000Z'", Locale.getDefault()).format(new Date(l.longValue()));
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0045, code lost:
        if (r6 != null) goto L_0x0026;
     */
    /* renamed from: m4 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.List m87017m4(java.util.List r10, java.util.List r11) {
        /*
            r9 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r10 = r10.iterator()
        L_0x0009:
            boolean r1 = r10.hasNext()
            if (r1 == 0) goto L_0x004e
            java.lang.Object r1 = r10.next()
            r2 = r1
            ge.bog.mobilebank.galtandtaggart.domain.transactionhistory.model.GTTransaction r2 = (p341ge.bog.mobilebank.galtandtaggart.domain.transactionhistory.model.GTTransaction) r2
            r3 = 0
            r4 = 1
            if (r11 == 0) goto L_0x0023
            boolean r5 = r11.isEmpty()
            if (r5 == 0) goto L_0x0021
            goto L_0x0023
        L_0x0021:
            r5 = r3
            goto L_0x0024
        L_0x0023:
            r5 = r4
        L_0x0024:
            if (r5 == 0) goto L_0x0028
        L_0x0026:
            r3 = r4
            goto L_0x0048
        L_0x0028:
            java.util.Iterator r5 = r11.iterator()
        L_0x002c:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L_0x0044
            java.lang.Object r6 = r5.next()
            r7 = r6
            java.lang.String r7 = (java.lang.String) r7
            java.lang.String r8 = r2.mo60170r()
            boolean r7 = kotlin.jvm.internal.C41536l.m120484d(r7, r8)
            if (r7 == 0) goto L_0x002c
            goto L_0x0045
        L_0x0044:
            r6 = 0
        L_0x0045:
            if (r6 == 0) goto L_0x0048
            goto L_0x0026
        L_0x0048:
            if (r3 == 0) goto L_0x0009
            r0.add(r1)
            goto L_0x0009
        L_0x004e:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: te0.C28365g.m87017m4(java.util.List, java.util.List):java.util.List");
    }

    /* access modifiers changed from: private */
    /* renamed from: n4 */
    public static final C40754t m87018n4(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (C40754t) lVar.invoke(obj);
    }

    /* renamed from: p4 */
    private final C40749p m87019p4(Long l, Long l2, List list) {
        int i;
        this.f71882h = l;
        this.f71883i = l2;
        C25429w0 w0Var = this.f71878d;
        String l4 = m87016l4(l);
        String l42 = m87016l4(l2);
        if (l == null && l2 == null) {
            i = 1;
        } else {
            i = 0;
        }
        C40749p g = w0Var.mo63996J1(l4, l42, Integer.valueOf(i)).mo95082k(new C28361c(new C28368c(this))).mo95083l(new C28362d(new C28369d(this))).mo95084m(new C28363e(new C28370e(this))).mo95062A(new C28364f(new C28371f(this, list))).mo95075O().mo95021g();
        C41536l.m120488h(g, "private fun getTransacti…           .cache()\n    }");
        return g;
    }

    /* access modifiers changed from: private */
    /* renamed from: q4 */
    public static final void m87020q4(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: r4 */
    public static final void m87021r4(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: s4 */
    public static final void m87022s4(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: t4 */
    public static final List m87023t4(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (List) lVar.invoke(obj);
    }

    /* renamed from: u4 */
    private final C40749p m87024u4(Long l, Long l2, List list) {
        C40749p p4 = m87019p4(l, l2, list);
        this.f71886l.onNext(p4);
        return p4;
    }

    /* renamed from: B1 */
    public C40749p mo64300B1(Long l, Long l2, List list, boolean z) {
        if (this.f71884j.compareAndSet(false, true) || this.f71885k.compareAndSet(true, false) || z || !C41536l.m120484d(this.f71882h, l) || !C41536l.m120484d(this.f71883i, l2)) {
            return m87024u4(l, l2, list);
        }
        C40749p L0 = this.f71886l.mo94989L0(new C28360b(C28367b.f71888d));
        C41536l.m120488h(L0, "{\n            transactio…t\n            }\n        }");
        return L0;
    }

    /* renamed from: M1 */
    public void mo64301M1() {
        m87024u4((Long) null, (Long) null, (List) null);
        this.f71887m.onNext(C41238w.f97225a);
    }

    /* renamed from: Q3 */
    public C40767b mo64302Q3() {
        return this.f71887m;
    }

    public void clean() {
        this.f71880f.set((Object) null);
        this.f71883i = null;
        this.f71882h = null;
    }

    /* renamed from: u3 */
    public C40749p mo64303u3() {
        return this.f71881g;
    }

    /* renamed from: z1 */
    public C40734b mo64304z1(String str) {
        C41536l.m120489i(str, "orderId");
        C40734b o = this.f71878d.mo64003s1(str).mo94902o(new C28359a(this, str));
        C41536l.m120488h(o, "service.cancelOrder(orde…edTransaction))\n        }");
        return o;
    }
}
