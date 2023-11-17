package p341ge.bog.mobilebank.shared.accountselector.presentation;

import androidx.lifecycle.C1644x;
import b41.C31128a;
import b41.C31132b;
import c41.C31270e;
import ed1.C40749p;
import ed1.C40754t;
import ee1.C40767b;
import g91.C32343x;
import gd1.C40992a;
import hd1.C41204a;
import hd1.C41205b;
import he1.C41224m;
import he1.C41233s;
import he1.C41238w;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p341ge.bog.mobilebank.cleanarch.domain.transferaccounts.model.TransferAccount;
import p341ge.bog.mobilebank.cleanarch.domain.transferaccounts.model.TransferAccountItem;
import p341ge.bog.mobilebank.cleanarch.domain.transferaccounts.model.TransferAccounts;
import p341ge.bog.mobilebank.cleanarch.domain.transferaccounts.model.TransferExternalFile;
import p341ge.bog.mobilebank.cleanarch.presentation.common.C21481a;
import p775gx.C24836a;
import ue1.C43075l;
import ue1.C43079p;
import y11.C39989a;
import y11.C40004e;
import y11.C40005f;
import y11.C40006g;
import y11.C40007h;
import y11.C40008i;
import z11.C40139a;

/* renamed from: ge.bog.mobilebank.shared.accountselector.presentation.DomesticAccountSelectorActionSheetViewModel$ViewModel */
public final class DomesticAccountSelectorActionSheetViewModel$ViewModel extends C21481a implements C40004e, C40005f {
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final C24836a f83648d;

    /* renamed from: e */
    private final C40004e f83649e = this;

    /* renamed from: f */
    private final C40005f f83650f = this;

    /* renamed from: g */
    private final C1644x f83651g = new C1644x();

    /* renamed from: h */
    private final C1644x f83652h = new C1644x();

    /* renamed from: i */
    private final C1644x f83653i = new C1644x();

    /* renamed from: j */
    private Long f83654j;

    /* renamed from: k */
    private C39989a f83655k;

    /* renamed from: l */
    private String f83656l;

    /* renamed from: m */
    private final C40767b f83657m;
    /* access modifiers changed from: private */

    /* renamed from: n */
    public final ArrayList f83658n;

    /* renamed from: ge.bog.mobilebank.shared.accountselector.presentation.DomesticAccountSelectorActionSheetViewModel$ViewModel$a */
    static final class C34616a extends C41537m implements C43079p {

        /* renamed from: d */
        public static final C34616a f83659d = new C34616a();

        C34616a() {
            super(2);
        }

        /* renamed from: a */
        public final C41224m invoke(Integer num, C41224m mVar) {
            C41536l.m120489i(num, "requestCode");
            C41536l.m120489i(mVar, "<name for destructuring parameter 1>");
            return C41233s.m119492a(num, (C40139a) mVar.mo95676b());
        }
    }

    /* renamed from: ge.bog.mobilebank.shared.accountselector.presentation.DomesticAccountSelectorActionSheetViewModel$ViewModel$b */
    static final class C34617b extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ DomesticAccountSelectorActionSheetViewModel$ViewModel f83660d;

        /* renamed from: ge.bog.mobilebank.shared.accountselector.presentation.DomesticAccountSelectorActionSheetViewModel$ViewModel$b$a */
        static final class C34618a extends C41537m implements C43075l {

            /* renamed from: d */
            final /* synthetic */ DomesticAccountSelectorActionSheetViewModel$ViewModel f83661d;

            /* renamed from: e */
            final /* synthetic */ C40139a f83662e;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C34618a(DomesticAccountSelectorActionSheetViewModel$ViewModel domesticAccountSelectorActionSheetViewModel$ViewModel, C40139a aVar) {
                super(1);
                this.f83661d = domesticAccountSelectorActionSheetViewModel$ViewModel;
                this.f83662e = aVar;
            }

            /* renamed from: a */
            public final List invoke(TransferAccounts transferAccounts) {
                C41536l.m120489i(transferAccounts, "it");
                return this.f83661d.m101622qw(transferAccounts, this.f83662e);
            }
        }

        /* renamed from: ge.bog.mobilebank.shared.accountselector.presentation.DomesticAccountSelectorActionSheetViewModel$ViewModel$b$b */
        static final class C34619b extends C41537m implements C43075l {

            /* renamed from: d */
            final /* synthetic */ DomesticAccountSelectorActionSheetViewModel$ViewModel f83663d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C34619b(DomesticAccountSelectorActionSheetViewModel$ViewModel domesticAccountSelectorActionSheetViewModel$ViewModel) {
                super(1);
                this.f83663d = domesticAccountSelectorActionSheetViewModel$ViewModel;
            }

            /* renamed from: a */
            public final C41224m invoke(List list) {
                C41536l.m120489i(list, "it");
                return C41233s.m119492a(this.f83663d.m101623rw(list), list);
            }
        }

        /* renamed from: ge.bog.mobilebank.shared.accountselector.presentation.DomesticAccountSelectorActionSheetViewModel$ViewModel$b$c */
        static final class C34620c extends C41537m implements C43075l {

            /* renamed from: d */
            final /* synthetic */ DomesticAccountSelectorActionSheetViewModel$ViewModel f83664d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C34620c(DomesticAccountSelectorActionSheetViewModel$ViewModel domesticAccountSelectorActionSheetViewModel$ViewModel) {
                super(1);
                this.f83664d = domesticAccountSelectorActionSheetViewModel$ViewModel;
            }

            /* renamed from: a */
            public final C41224m invoke(C41224m mVar) {
                C41536l.m120489i(mVar, "<name for destructuring parameter 0>");
                return C41233s.m119492a(this.f83664d.m101625yw((List) mVar.mo95675a()), (List) mVar.mo95676b());
            }
        }

        /* renamed from: ge.bog.mobilebank.shared.accountselector.presentation.DomesticAccountSelectorActionSheetViewModel$ViewModel$b$d */
        static final class C34621d extends C41537m implements C43075l {

            /* renamed from: d */
            final /* synthetic */ DomesticAccountSelectorActionSheetViewModel$ViewModel f83665d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C34621d(DomesticAccountSelectorActionSheetViewModel$ViewModel domesticAccountSelectorActionSheetViewModel$ViewModel) {
                super(1);
                this.f83665d = domesticAccountSelectorActionSheetViewModel$ViewModel;
            }

            /* renamed from: a */
            public final List invoke(C41224m mVar) {
                C41536l.m120489i(mVar, "<name for destructuring parameter 0>");
                List list = (List) mVar.mo95675a();
                List list2 = (List) mVar.mo95676b();
                C32343x.m95475p(this.f83665d.f83658n, list);
                DomesticAccountSelectorActionSheetViewModel$ViewModel domesticAccountSelectorActionSheetViewModel$ViewModel = this.f83665d;
                C41536l.m120488h(list2, "all");
                return domesticAccountSelectorActionSheetViewModel$ViewModel.m101608Bw(list, list2);
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C34617b(DomesticAccountSelectorActionSheetViewModel$ViewModel domesticAccountSelectorActionSheetViewModel$ViewModel) {
            super(1);
            this.f83660d = domesticAccountSelectorActionSheetViewModel$ViewModel;
        }

        /* access modifiers changed from: private */
        /* renamed from: f */
        public static final C41224m m101642f(C43075l lVar, Object obj) {
            C41536l.m120489i(lVar, "$tmp0");
            return (C41224m) lVar.invoke(obj);
        }

        /* access modifiers changed from: private */
        /* renamed from: g */
        public static final C41224m m101643g(C43075l lVar, Object obj) {
            C41536l.m120489i(lVar, "$tmp0");
            return (C41224m) lVar.invoke(obj);
        }

        /* access modifiers changed from: private */
        /* renamed from: h */
        public static final List m101644h(C43075l lVar, Object obj) {
            C41536l.m120489i(lVar, "$tmp0");
            return (List) lVar.invoke(obj);
        }

        /* access modifiers changed from: private */
        public static final List invoke$lambda$0(C43075l lVar, Object obj) {
            C41536l.m120489i(lVar, "$tmp0");
            return (List) lVar.invoke(obj);
        }

        /* renamed from: e */
        public final C40754t invoke(C41224m mVar) {
            C41536l.m120489i(mVar, "<name for destructuring parameter 0>");
            int intValue = ((Number) mVar.mo95675a()).intValue();
            C40749p k0 = this.f83660d.f83648d.mo63245a().mo95075O().mo95026k0(new C34624a(new C34618a(this.f83660d, (C40139a) mVar.mo95676b()))).mo95026k0(new C34625b(new C34619b(this.f83660d))).mo95026k0(new C34626c(new C34620c(this.f83660d))).mo95026k0(new C34627d(new C34621d(this.f83660d)));
            C41536l.m120488h(k0, "@HiltViewModel\n    class…    )\n            }\n    }");
            return C31270e.m92879h(k0, intValue);
        }
    }

    /* renamed from: ge.bog.mobilebank.shared.accountselector.presentation.DomesticAccountSelectorActionSheetViewModel$ViewModel$c */
    static final class C34622c extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ DomesticAccountSelectorActionSheetViewModel$ViewModel f83666d;

        /* renamed from: ge.bog.mobilebank.shared.accountselector.presentation.DomesticAccountSelectorActionSheetViewModel$ViewModel$c$a */
        static final class C34623a extends C41537m implements C43075l {

            /* renamed from: d */
            final /* synthetic */ DomesticAccountSelectorActionSheetViewModel$ViewModel f83667d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C34623a(DomesticAccountSelectorActionSheetViewModel$ViewModel domesticAccountSelectorActionSheetViewModel$ViewModel) {
                super(1);
                this.f83667d = domesticAccountSelectorActionSheetViewModel$ViewModel;
            }

            /* renamed from: a */
            public final void mo84182a(List list) {
                this.f83667d.m101626zw();
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                mo84182a((List) obj);
                return C41238w.f97225a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C34622c(DomesticAccountSelectorActionSheetViewModel$ViewModel domesticAccountSelectorActionSheetViewModel$ViewModel) {
            super(1);
            this.f83666d = domesticAccountSelectorActionSheetViewModel$ViewModel;
        }

        /* renamed from: a */
        public final void mo84181a(C31128a aVar) {
            this.f83666d.mo84168j0().mo4823o(aVar);
            C41536l.m120488h(aVar, "result");
            C31132b.m92648j(aVar, (int[]) null, new C34623a(this.f83666d), 1, (Object) null);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo84181a((C31128a) obj);
            return C41238w.f97225a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DomesticAccountSelectorActionSheetViewModel$ViewModel(C24836a aVar) {
        super((C41204a) null, 1, (DefaultConstructorMarker) null);
        C41536l.m120489i(aVar, "getAccountsUseCase");
        this.f83648d = aVar;
        C40767b h1 = C40767b.m118210h1();
        C41536l.m120488h(h1, "create<Pair<Int, AccountType>>()");
        this.f83657m = h1;
        this.f83658n = new ArrayList();
        C41205b F0 = C40749p.m118047l0(h1, onRefresh().mo95014Y0(h1, new C40006g(C34616a.f83659d))).mo94989L0(new C40007h(new C34617b(this))).mo95027o0(C40992a.m118827a()).mo94981F0(new C40008i(new C34622c(this)));
        C41536l.m120488h(F0, "merge(\n                a…unt() }\n                }");
        bindToLifecycle(F0);
    }

    /* renamed from: Aw */
    private final void m101607Aw(Long l) {
        if (l != null) {
            if (mo84168j0().mo4814f() instanceof C31128a.C31131c) {
                m101626zw();
            } else {
                this.f83654j = l;
            }
        }
    }

    /* JADX WARNING: type inference failed for: r12v2, types: [ge.bog.designsystem.components.common.Image$Resource] */
    /* access modifiers changed from: private */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: Bw */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.List m101608Bw(java.util.List r27, java.util.List r28) {
        /*
            r26 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r1 = 10
            r2 = r27
            int r1 = ie1.C41343r.m119925u(r2, r1)
            r0.<init>(r1)
            java.util.Iterator r1 = r27.iterator()
        L_0x0011:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x010b
            java.lang.Object r2 = r1.next()
            ge.bog.mobilebank.cleanarch.domain.transferaccounts.model.TransferAccountItem r2 = (p341ge.bog.mobilebank.cleanarch.domain.transferaccounts.model.TransferAccountItem) r2
            xg.d r9 = new xg.d
            java.lang.String r3 = r2.mo52142i()
            java.lang.String r10 = ""
            if (r3 != 0) goto L_0x0028
            r3 = r10
        L_0x0028:
            java.util.Currency r4 = java.util.Currency.getInstance(r3)
            java.lang.String r3 = "getInstance(account.ccy ?: \"\")"
            kotlin.jvm.internal.C41536l.m120488h(r4, r3)
            java.math.BigDecimal r5 = r2.mo52139g()
            r6 = 0
            r7 = 4
            r8 = 0
            r3 = r9
            r3.<init>(r4, r5, r6, r7, r8)
            java.util.Iterator r3 = r28.iterator()
        L_0x0040:
            boolean r4 = r3.hasNext()
            r5 = 1
            r6 = 0
            if (r4 == 0) goto L_0x0061
            java.lang.Object r4 = r3.next()
            r7 = r4
            ge.bog.mobilebank.cleanarch.domain.transferaccounts.model.TransferAccountItem r7 = (p341ge.bog.mobilebank.cleanarch.domain.transferaccounts.model.TransferAccountItem) r7
            long r7 = r7.mo52146m()
            long r11 = r2.mo52147p()
            int r7 = (r7 > r11 ? 1 : (r7 == r11 ? 0 : -1))
            if (r7 != 0) goto L_0x005d
            r7 = r5
            goto L_0x005e
        L_0x005d:
            r7 = 0
        L_0x005e:
            if (r7 == 0) goto L_0x0040
            goto L_0x0062
        L_0x0061:
            r4 = r6
        L_0x0062:
            ge.bog.mobilebank.cleanarch.domain.transferaccounts.model.TransferAccountItem r4 = (p341ge.bog.mobilebank.cleanarch.domain.transferaccounts.model.TransferAccountItem) r4
            if (r4 == 0) goto L_0x0071
            long r7 = r4.mo52146m()
            r13 = r26
            ge.bog.mobilebank.model.account.ProductProperties$CardBackgroundInfoContainer r3 = r13.m101624ww(r7)
            goto L_0x0074
        L_0x0071:
            r13 = r26
            r3 = r6
        L_0x0074:
            long r14 = r2.mo52146m()
            java.lang.String r7 = r2.mo52148q()
            if (r7 != 0) goto L_0x0085
            java.lang.String r7 = r2.mo52134d()
            if (r7 != 0) goto L_0x0085
            r7 = r10
        L_0x0085:
            java.util.List r8 = ie1.C41339p.m119900e(r9)
            boolean r2 = r2.mo52154v()
            if (r4 == 0) goto L_0x00b3
            ge.bog.mobilebank.cleanarch.domain.transferaccounts.model.TransferExternalFile r11 = r4.mo52143j()
            if (r11 == 0) goto L_0x00b3
            java.lang.String r17 = r11.mo52204a()
            if (r17 == 0) goto L_0x00b3
            ge.bog.designsystem.components.common.Image$Url r11 = new ge.bog.designsystem.components.common.Image$Url
            r18 = 0
            r19 = 0
            r20 = 0
            r21 = 0
            r22 = 0
            r23 = 0
            r24 = 126(0x7e, float:1.77E-43)
            r25 = 0
            r16 = r11
            r16.<init>(r17, r18, r19, r20, r21, r22, r23, r24, r25)
            goto L_0x00c0
        L_0x00b3:
            if (r3 == 0) goto L_0x00bf
            int r11 = r3.resId
            ge.bog.designsystem.components.common.Image$Resource r12 = new ge.bog.designsystem.components.common.Image$Resource
            r10 = 2
            r12.<init>(r11, r6, r10, r6)
            r11 = r12
            goto L_0x00c0
        L_0x00bf:
            r11 = r6
        L_0x00c0:
            if (r4 == 0) goto L_0x00cd
            ge.bog.mobilebank.cleanarch.domain.transferaccounts.model.TransferExternalFile r10 = r4.mo52143j()
            if (r10 == 0) goto L_0x00cd
            java.lang.String r10 = r10.mo52204a()
            goto L_0x00ce
        L_0x00cd:
            r10 = r6
        L_0x00ce:
            if (r10 == 0) goto L_0x00e0
            ge.bog.mobilebank.cleanarch.domain.transferaccounts.model.TransferExternalFile r3 = r4.mo52143j()
            if (r3 == 0) goto L_0x00ea
            boolean r3 = r3.mo52205b()
            r3 = r3 ^ r5
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)
            goto L_0x00e8
        L_0x00e0:
            if (r3 == 0) goto L_0x00ea
            boolean r3 = r3.isLightText
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)
        L_0x00e8:
            r10 = r3
            goto L_0x00eb
        L_0x00ea:
            r10 = r6
        L_0x00eb:
            r12 = 16
            r16 = 0
            ge.bog.designsystem.components.accountselector.AccountSelectorItemView$a r6 = new ge.bog.designsystem.components.accountselector.AccountSelectorItemView$a
            r3 = r6
            r4 = r7
            r5 = r9
            r9 = r6
            r6 = r8
            r7 = r2
            r2 = 0
            r8 = r2
            r2 = r9
            r9 = r11
            r11 = r12
            r12 = r16
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12)
            z11.b r3 = new z11.b
            r3.<init>(r14, r2)
            r0.add(r3)
            goto L_0x0011
        L_0x010b:
            r13 = r26
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p341ge.bog.mobilebank.shared.accountselector.presentation.DomesticAccountSelectorActionSheetViewModel$ViewModel.m101608Bw(java.util.List, java.util.List):java.util.List");
    }

    /* access modifiers changed from: private */
    /* renamed from: gw */
    public static final C41224m m101612gw(C43079p pVar, Object obj, Object obj2) {
        C41536l.m120489i(pVar, "$tmp0");
        return (C41224m) pVar.invoke(obj, obj2);
    }

    /* access modifiers changed from: private */
    /* renamed from: hw */
    public static final C40754t m101613hw(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (C40754t) lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: iw */
    public static final void m101614iw(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: qw */
    public final List m101622qw(TransferAccounts transferAccounts, C40139a aVar) {
        List list = null;
        if (aVar == C40139a.DST) {
            TransferAccount b = transferAccounts.mo52162b();
            if (b != null) {
                list = b.mo52122a();
            }
        } else {
            TransferAccount b2 = transferAccounts.mo52162b();
            if (b2 != null) {
                list = b2.mo52123b();
            }
        }
        if (list == null) {
            return C41341q.m119907j();
        }
        return list;
    }

    /* access modifiers changed from: private */
    /* renamed from: rw */
    public final List m101623rw(List list) {
        C39989a aVar = this.f83655k;
        if (aVar == null) {
            return list;
        }
        ArrayList arrayList = new ArrayList();
        for (Object next : list) {
            if (aVar.mo57048z((TransferAccountItem) next)) {
                arrayList.add(next);
            }
        }
        return arrayList;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v5, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v6, resolved type: l50.r} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: ww */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final p341ge.bog.mobilebank.model.account.ProductProperties.CardBackgroundInfoContainer m101624ww(long r4) {
        /*
            r3 = this;
            r0 = 0
            l50.p r1 = p341ge.bog.mobilebank.model.account.ProductProperties.cardsAndDetailsUIModel     // Catch:{ Exception -> 0x003e }
            l50.l r4 = n50.C26371b.m82431a(r1, r4)     // Catch:{ Exception -> 0x003e }
            if (r4 == 0) goto L_0x003e
            java.util.List r4 = r4.mo64522a()     // Catch:{ Exception -> 0x003e }
            if (r4 == 0) goto L_0x003e
            java.util.Iterator r5 = r4.iterator()     // Catch:{ Exception -> 0x003e }
        L_0x0013:
            boolean r1 = r5.hasNext()     // Catch:{ Exception -> 0x003e }
            if (r1 == 0) goto L_0x0027
            java.lang.Object r1 = r5.next()     // Catch:{ Exception -> 0x003e }
            r2 = r1
            l50.r r2 = (l50.C25838r) r2     // Catch:{ Exception -> 0x003e }
            boolean r2 = r2.mo64602z()     // Catch:{ Exception -> 0x003e }
            if (r2 == 0) goto L_0x0013
            goto L_0x0028
        L_0x0027:
            r1 = r0
        L_0x0028:
            l50.r r1 = (l50.C25838r) r1     // Catch:{ Exception -> 0x003e }
            if (r1 != 0) goto L_0x0033
            java.lang.Object r4 = ie1.C41358y.m120009Y(r4)     // Catch:{ Exception -> 0x003e }
            r1 = r4
            l50.r r1 = (l50.C25838r) r1     // Catch:{ Exception -> 0x003e }
        L_0x0033:
            if (r1 == 0) goto L_0x003e
            java.lang.String r4 = r1.mo64595t()     // Catch:{ Exception -> 0x003e }
            ge.bog.mobilebank.model.account.ProductProperties$CardBackgroundInfoContainer r4 = p341ge.bog.mobilebank.model.account.ProductProperties.getCardBackgroundInfo(r4)     // Catch:{ Exception -> 0x003e }
            r0 = r4
        L_0x003e:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p341ge.bog.mobilebank.shared.accountselector.presentation.DomesticAccountSelectorActionSheetViewModel$ViewModel.m101624ww(long):ge.bog.mobilebank.model.account.ProductProperties$CardBackgroundInfoContainer");
    }

    /* access modifiers changed from: private */
    /* renamed from: yw */
    public final List m101625yw(List list) {
        TransferAccountItem transferAccountItem;
        Object obj;
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            TransferAccountItem transferAccountItem2 = (TransferAccountItem) it.next();
            Iterator it2 = transferAccountItem2.mo52151t().iterator();
            while (true) {
                transferAccountItem = null;
                if (!it2.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it2.next();
                String i = ((TransferAccountItem) obj).mo52142i();
                String str = this.f83656l;
                if (str == null) {
                    C41536l.m120506z("mainCurrency");
                    str = null;
                }
                if (C41536l.m120484d(i, str)) {
                    break;
                }
            }
            TransferAccountItem transferAccountItem3 = (TransferAccountItem) obj;
            if (transferAccountItem3 != null) {
                transferAccountItem = TransferAccountItem.m68075b(transferAccountItem3, false, false, 0, (String) null, (String) null, (String) null, (BigDecimal) null, 0, (BigDecimal) null, false, (String) null, false, (String) null, (List) null, (String) null, transferAccountItem2.mo52143j(), transferAccountItem2.mo52144k(), (TransferExternalFile) null, 163839, (Object) null);
            }
            if (transferAccountItem != null) {
                arrayList.add(transferAccountItem);
            }
        }
        return arrayList;
    }

    /* access modifiers changed from: private */
    /* renamed from: zw */
    public final void m101626zw() {
        if (this.f83654j != null) {
            C1644x tw = mo84166ih();
            Long l = this.f83654j;
            C41536l.m120486f(l);
            tw.mo4823o(C32343x.m95466m(l));
            this.f83654j = null;
        }
    }

    /* renamed from: im */
    public void mo84167im(C40139a aVar, String str, C39989a aVar2, Long l) {
        C41536l.m120489i(aVar, "accountType");
        C41536l.m120489i(str, "mainCurrency");
        this.f83655k = aVar2;
        this.f83656l = str;
        this.f83657m.onNext(C41233s.m119492a(-1, aVar));
        m101607Aw(l);
    }

    /* renamed from: sw */
    public C1644x mo84168j0() {
        return this.f83651g;
    }

    /* renamed from: tw */
    public C1644x mo84166ih() {
        return this.f83652h;
    }

    /* renamed from: uw */
    public final C40004e mo84171uw() {
        return this.f83649e;
    }

    /* renamed from: vw */
    public final C40005f mo84172vw() {
        return this.f83650f;
    }

    /* renamed from: w8 */
    public void mo84173w8(long j) {
        Object obj;
        boolean z;
        Iterator it = this.f83658n.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((TransferAccountItem) obj).mo52146m() == j) {
                z = true;
                continue;
            } else {
                z = false;
                continue;
            }
            if (z) {
                break;
            }
        }
        TransferAccountItem transferAccountItem = (TransferAccountItem) obj;
        if (transferAccountItem != null) {
            mo84165O1().mo4823o(transferAccountItem);
        }
    }

    /* renamed from: xw */
    public C1644x mo84165O1() {
        return this.f83653i;
    }
}
