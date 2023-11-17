package p341ge.bog.mobilebank.galtandtaggart.presentation.transactions;

import androidx.lifecycle.C1644x;
import b41.C31128a;
import c41.C31270e;
import ed1.C40749p;
import ed1.C40754t;
import ee1.C40765a;
import g91.C32343x;
import hd1.C41204a;
import hd1.C41205b;
import he1.C41224m;
import he1.C41238w;
import hf0.C24983b;
import ie0.C25190j;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import jf0.C25434b;
import jf0.C25435c;
import kotlin.jvm.internal.C41535k;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import og0.C26997e;
import og0.C26998f;
import og0.C26999g;
import og0.C27000h;
import og0.C27001i;
import og0.C27002j;
import og0.C27003k;
import p341ge.bog.mobilebank.cleanarch.presentation.common.C21481a;
import p341ge.bog.mobilebank.galtandtaggart.presentation.transactions.model.TransactionsFilterData;
import p341ge.bog.mobilebank.model.Client;
import tg0.C28384f;
import ue1.C43075l;
import ue1.C43079p;
import we0.C29336h0;

/* renamed from: ge.bog.mobilebank.galtandtaggart.presentation.transactions.TransactionHistoryViewModel$ViewModel */
public final class TransactionHistoryViewModel$ViewModel extends C21481a implements C26997e, C26998f {
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final C25434b f62167d;

    /* renamed from: e */
    private final C25435c f62168e;

    /* renamed from: f */
    private final C29336h0 f62169f;

    /* renamed from: g */
    private final Client f62170g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public final TransactionsFilterData f62171h;

    /* renamed from: i */
    private final C26998f f62172i = this;

    /* renamed from: j */
    private final C26997e f62173j = this;

    /* renamed from: k */
    private final C40765a f62174k;

    /* renamed from: l */
    private final C1644x f62175l;

    /* renamed from: ge.bog.mobilebank.galtandtaggart.presentation.transactions.TransactionHistoryViewModel$ViewModel$a */
    static final class C23932a extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ TransactionHistoryViewModel$ViewModel f62176d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C23932a(TransactionHistoryViewModel$ViewModel transactionHistoryViewModel$ViewModel) {
            super(1);
            this.f62176d = transactionHistoryViewModel$ViewModel;
        }

        /* renamed from: a */
        public final C41224m invoke(TransactionsFilterData transactionsFilterData) {
            int i;
            C41536l.m120489i(transactionsFilterData, "it");
            if (transactionsFilterData == this.f62176d.f62171h) {
                i = 1;
            } else {
                i = 4;
            }
            return new C41224m(transactionsFilterData, Integer.valueOf(i));
        }
    }

    /* renamed from: ge.bog.mobilebank.galtandtaggart.presentation.transactions.TransactionHistoryViewModel$ViewModel$b */
    static final class C23933b extends C41537m implements C43079p {

        /* renamed from: d */
        public static final C23933b f62177d = new C23933b();

        C23933b() {
            super(2);
        }

        /* renamed from: a */
        public final C41224m invoke(Integer num, TransactionsFilterData transactionsFilterData) {
            C41536l.m120489i(num, "requestCode");
            C41536l.m120489i(transactionsFilterData, "filter");
            return new C41224m(transactionsFilterData, num);
        }
    }

    /* renamed from: ge.bog.mobilebank.galtandtaggart.presentation.transactions.TransactionHistoryViewModel$ViewModel$c */
    static final class C23934c extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ TransactionHistoryViewModel$ViewModel f62178d;

        /* renamed from: ge.bog.mobilebank.galtandtaggart.presentation.transactions.TransactionHistoryViewModel$ViewModel$c$a */
        /* synthetic */ class C23935a extends C41535k implements C43075l {
            C23935a(Object obj) {
                super(1, obj, C28384f.C28385a.class, "mapFromList", "mapFromList(Ljava/util/List;)Ljava/util/List;", 0);
            }

            public final List invoke(List list) {
                C41536l.m120489i(list, "p0");
                return ((C28384f.C28385a) this.receiver).mo68016c(list);
            }
        }

        /* renamed from: ge.bog.mobilebank.galtandtaggart.presentation.transactions.TransactionHistoryViewModel$ViewModel$c$b */
        public /* synthetic */ class C23936b {

            /* renamed from: a */
            public static final /* synthetic */ int[] f62179a;

            /* JADX WARNING: Can't wrap try/catch for region: R(15:0|1|2|3|4|5|6|7|8|9|10|11|12|13|15) */
            /* JADX WARNING: Failed to process nested try/catch */
            /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x0034 */
            /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
            /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
            /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0022 */
            /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x002b */
            static {
                /*
                    tg0.g[] r0 = tg0.C28387g.values()
                    int r0 = r0.length
                    int[] r0 = new int[r0]
                    tg0.g r1 = tg0.C28387g.ORDER_1_S     // Catch:{ NoSuchFieldError -> 0x0010 }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                    r2 = 1
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
                L_0x0010:
                    tg0.g r1 = tg0.C28387g.ORDER_1_B     // Catch:{ NoSuchFieldError -> 0x0019 }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                    r2 = 2
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
                L_0x0019:
                    tg0.g r1 = tg0.C28387g.SPUR     // Catch:{ NoSuchFieldError -> 0x0022 }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                    r2 = 3
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
                L_0x0022:
                    tg0.g r1 = tg0.C28387g.SSAL     // Catch:{ NoSuchFieldError -> 0x002b }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002b }
                    r2 = 4
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002b }
                L_0x002b:
                    tg0.g r1 = tg0.C28387g.CSR     // Catch:{ NoSuchFieldError -> 0x0034 }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0034 }
                    r2 = 5
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0034 }
                L_0x0034:
                    tg0.g r1 = tg0.C28387g.CSD     // Catch:{ NoSuchFieldError -> 0x003d }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003d }
                    r2 = 6
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003d }
                L_0x003d:
                    f62179a = r0
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: p341ge.bog.mobilebank.galtandtaggart.presentation.transactions.TransactionHistoryViewModel$ViewModel.C23934c.C23936b.<clinit>():void");
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C23934c(TransactionHistoryViewModel$ViewModel transactionHistoryViewModel$ViewModel) {
            super(1);
            this.f62178d = transactionHistoryViewModel$ViewModel;
        }

        /* access modifiers changed from: private */
        /* renamed from: c */
        public static final List m77244c(C43075l lVar, Object obj) {
            C41536l.m120489i(lVar, "$tmp0");
            return (List) lVar.invoke(obj);
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v0, resolved type: java.util.List} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v1, resolved type: java.util.List} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v2, resolved type: java.util.List} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v3, resolved type: java.util.List} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v4, resolved type: java.util.List} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v2, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v1, resolved type: java.lang.String} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v5, resolved type: java.util.List} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* renamed from: b */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final ed1.C40754t invoke(he1.C41224m r13) {
            /*
                r12 = this;
                java.lang.String r0 = "<name for destructuring parameter 0>"
                kotlin.jvm.internal.C41536l.m120489i(r13, r0)
                java.lang.Object r0 = r13.mo95675a()
                ge.bog.mobilebank.galtandtaggart.presentation.transactions.model.TransactionsFilterData r0 = (p341ge.bog.mobilebank.galtandtaggart.presentation.transactions.model.TransactionsFilterData) r0
                java.lang.Object r13 = r13.mo95676b()
                java.lang.Number r13 = (java.lang.Number) r13
                int r13 = r13.intValue()
                r1 = 2
                r2 = 0
                r3 = 1
                if (r13 == r1) goto L_0x001f
                if (r13 != r3) goto L_0x001d
                goto L_0x001f
            L_0x001d:
                r1 = r2
                goto L_0x0020
            L_0x001f:
                r1 = r3
            L_0x0020:
                java.util.List r4 = r0.mo60945a()
                r5 = 0
                if (r4 != 0) goto L_0x0029
                goto L_0x00a1
            L_0x0029:
                java.util.List r4 = r0.mo60945a()
                java.util.Iterator r4 = r4.iterator()
            L_0x0031:
                boolean r6 = r4.hasNext()
                if (r6 == 0) goto L_0x0047
                java.lang.Object r6 = r4.next()
                r7 = r6
                java.lang.String r7 = (java.lang.String) r7
                java.lang.String r8 = "DEFAULT"
                boolean r7 = kotlin.jvm.internal.C41536l.m120484d(r7, r8)
                if (r7 == 0) goto L_0x0031
                r5 = r6
            L_0x0047:
                if (r5 == 0) goto L_0x009d
                java.util.List r4 = r0.mo60945a()
                java.util.List r5 = ie1.C41358y.m119991B0(r4)
                tg0.g[] r4 = tg0.C28387g.values()
                java.util.ArrayList r6 = new java.util.ArrayList
                r6.<init>()
                int r7 = r4.length
                r8 = r2
            L_0x005c:
                if (r8 >= r7) goto L_0x0076
                r9 = r4[r8]
                int[] r10 = p341ge.bog.mobilebank.galtandtaggart.presentation.transactions.TransactionHistoryViewModel$ViewModel.C23934c.C23936b.f62179a
                int r11 = r9.ordinal()
                r10 = r10[r11]
                switch(r10) {
                    case 1: goto L_0x006d;
                    case 2: goto L_0x006d;
                    case 3: goto L_0x006d;
                    case 4: goto L_0x006d;
                    case 5: goto L_0x006d;
                    case 6: goto L_0x006d;
                    default: goto L_0x006b;
                }
            L_0x006b:
                r10 = r3
                goto L_0x006e
            L_0x006d:
                r10 = r2
            L_0x006e:
                if (r10 == 0) goto L_0x0073
                r6.add(r9)
            L_0x0073:
                int r8 = r8 + 1
                goto L_0x005c
            L_0x0076:
                java.util.ArrayList r2 = new java.util.ArrayList
                r3 = 10
                int r3 = ie1.C41343r.m119925u(r6, r3)
                r2.<init>(r3)
                java.util.Iterator r3 = r6.iterator()
            L_0x0085:
                boolean r4 = r3.hasNext()
                if (r4 == 0) goto L_0x0099
                java.lang.Object r4 = r3.next()
                tg0.g r4 = (tg0.C28387g) r4
                java.lang.String r4 = r4.name()
                r2.add(r4)
                goto L_0x0085
            L_0x0099:
                r5.addAll(r2)
                goto L_0x00a1
            L_0x009d:
                java.util.List r5 = r0.mo60945a()
            L_0x00a1:
                ge.bog.mobilebank.galtandtaggart.presentation.transactions.TransactionHistoryViewModel$ViewModel r2 = r12.f62178d
                jf0.b r2 = r2.f62167d
                java.lang.Long r3 = r0.mo60946b()
                java.lang.Long r0 = r0.mo60947d()
                ed1.p r0 = r2.mo64018a(r3, r0, r5, r1)
                ge.bog.mobilebank.galtandtaggart.presentation.transactions.TransactionHistoryViewModel$ViewModel$c$a r1 = new ge.bog.mobilebank.galtandtaggart.presentation.transactions.TransactionHistoryViewModel$ViewModel$c$a
                tg0.f$a r2 = tg0.C28384f.f71932i
                r1.<init>(r2)
                ge.bog.mobilebank.galtandtaggart.presentation.transactions.c r2 = new ge.bog.mobilebank.galtandtaggart.presentation.transactions.c
                r2.<init>(r1)
                ed1.p r0 = r0.mo95026k0(r2)
                java.lang.String r1 = "getGTTransactionHistoryU…dapterModel::mapFromList)"
                kotlin.jvm.internal.C41536l.m120488h(r0, r1)
                ed1.p r13 = c41.C31270e.m92879h(r0, r13)
                return r13
            */
            throw new UnsupportedOperationException("Method not decompiled: p341ge.bog.mobilebank.galtandtaggart.presentation.transactions.TransactionHistoryViewModel$ViewModel.C23934c.invoke(he1.m):ed1.t");
        }
    }

    /* renamed from: ge.bog.mobilebank.galtandtaggart.presentation.transactions.TransactionHistoryViewModel$ViewModel$d */
    static final class C23937d extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ TransactionHistoryViewModel$ViewModel f62180d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C23937d(TransactionHistoryViewModel$ViewModel transactionHistoryViewModel$ViewModel) {
            super(1);
            this.f62180d = transactionHistoryViewModel$ViewModel;
        }

        /* renamed from: a */
        public final void mo60910a(C41238w wVar) {
            this.f62180d.onRefresh(2);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo60910a((C41238w) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.galtandtaggart.presentation.transactions.TransactionHistoryViewModel$ViewModel$e */
    static final class C23938e extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ TransactionHistoryViewModel$ViewModel f62181d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C23938e(TransactionHistoryViewModel$ViewModel transactionHistoryViewModel$ViewModel) {
            super(1);
            this.f62181d = transactionHistoryViewModel$ViewModel;
        }

        /* renamed from: a */
        public final void mo60911a(C24983b.C24984a aVar) {
            Object obj;
            C31128a aVar2 = (C31128a) this.f62181d.mo60899Si().mo4814f();
            if (aVar2 != null && (aVar2 instanceof C31128a.C31131c)) {
                List B0 = C41358y.m119991B0((Collection) ((C31128a.C31131c) aVar2).mo71340a());
                Iterator it = B0.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj = null;
                        break;
                    }
                    obj = it.next();
                    if (C41536l.m120484d(((C28384f) obj).mo68011g().mo60179y(), aVar.mo63392a().mo60179y())) {
                        break;
                    }
                }
                C28384f fVar = (C28384f) obj;
                if (fVar != null) {
                    int indexOf = B0.indexOf(fVar);
                    B0.remove(indexOf);
                    B0.add(indexOf, C28384f.f71932i.mo68015a(aVar.mo63392a()));
                    this.f62181d.mo60899Si().mo4823o(new C31128a.C31131c(B0, 0, 2, (DefaultConstructorMarker) null));
                }
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo60911a((C24983b.C24984a) obj);
            return C41238w.f97225a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TransactionHistoryViewModel$ViewModel(C25434b bVar, C25435c cVar, C29336h0 h0Var, Client client) {
        super((C41204a) null, 1, (DefaultConstructorMarker) null);
        C41536l.m120489i(bVar, "getGTTransactionHistoryUseCase");
        C41536l.m120489i(cVar, "getTransactionEventUseCase");
        C41536l.m120489i(h0Var, "getTransactionsRefreshSubjectUseCase");
        C41536l.m120489i(client, "client");
        this.f62167d = bVar;
        this.f62168e = cVar;
        this.f62169f = h0Var;
        this.f62170g = client;
        TransactionsFilterData transactionsFilterData = new TransactionsFilterData((Long) null, (Long) null, (List) null, 7, (DefaultConstructorMarker) null);
        this.f62171h = transactionsFilterData;
        C40765a i1 = C40765a.m118199i1(transactionsFilterData);
        C41536l.m120488h(i1, "createDefault(defaultFilter)");
        this.f62174k = i1;
        this.f62175l = new C1644x();
        C40749p L0 = C40749p.m118047l0(i1.mo95026k0(new C26999g(new C23932a(this))), onRefresh().mo95014Y0(i1, new C27000h(C23933b.f62177d))).mo94989L0(new C27001i(new C23934c(this)));
        C41536l.m120488h(L0, "merge(\n                t…equestCode)\n            }");
        bindToLifecycle(C31270e.m92876e(C32343x.m95413R0(L0), mo60899Si()));
        C41205b F0 = h0Var.mo69191a().mo94981F0(new C27002j(new C23937d(this)));
        C41536l.m120488h(F0, "getTransactionsRefreshSu…PE_REFRESH)\n            }");
        bindToLifecycle(F0);
        C41205b F02 = cVar.mo64019a().mo95030q0(C24983b.C24984a.class).mo94981F0(new C27003k(new C23938e(this)));
        C41536l.m120488h(F02, "getTransactionEventUseCa…      }\n                }");
        bindToLifecycle(F02);
    }

    /* access modifiers changed from: private */
    /* renamed from: iw */
    public static final C41224m m77227iw(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (C41224m) lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: jw */
    public static final C41224m m77228jw(C43079p pVar, Object obj, Object obj2) {
        C41536l.m120489i(pVar, "$tmp0");
        return (C41224m) pVar.invoke(obj, obj2);
    }

    /* access modifiers changed from: private */
    /* renamed from: kw */
    public static final C40754t m77229kw(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (C40754t) lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: lw */
    public static final void m77230lw(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: mw */
    public static final void m77231mw(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* renamed from: is */
    public boolean mo60900is() {
        boolean z;
        TransactionsFilterData pw = mo60901pw();
        List a = pw.mo60945a();
        if (a == null || a.isEmpty()) {
            z = true;
        } else {
            z = false;
        }
        if (z && pw.mo60946b() == null && pw.mo60947d() == null) {
            return false;
        }
        return true;
    }

    /* renamed from: pw */
    public TransactionsFilterData mo60901pw() {
        TransactionsFilterData transactionsFilterData = (TransactionsFilterData) this.f62174k.mo95100j1();
        return transactionsFilterData == null ? this.f62171h : transactionsFilterData;
    }

    /* renamed from: qw */
    public int mo60902qw() {
        if (this.f62170g.getUserInfo().isRBClient()) {
            return C25190j.gt_history_no_data;
        }
        return C25190j.gt_history_no_data_solo;
    }

    /* renamed from: rw */
    public final C26998f mo60903rw() {
        return this.f62172i;
    }

    /* renamed from: sw */
    public C1644x mo60899Si() {
        return this.f62175l;
    }

    /* renamed from: tw */
    public void mo60905tw(TransactionsFilterData transactionsFilterData) {
        C41536l.m120489i(transactionsFilterData, "filterData");
        this.f62174k.onNext(transactionsFilterData);
    }
}
