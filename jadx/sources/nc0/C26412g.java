package nc0;

import androidx.lifecycle.C1644x;
import b41.C31128a;
import bc0.C19369a;
import c21.C31260a;
import c41.C31270e;
import e41.C31658b;
import ed1.C40734b;
import ed1.C40749p;
import ed1.C40754t;
import ed1.C40762x;
import ee1.C40767b;
import fc0.C20461a;
import fc0.C20462b;
import g21.C32053a;
import g91.C32300e0;
import hc0.C24973a;
import hd1.C41204a;
import he1.C41238w;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import k70.C25677a;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ky0.C37020g;
import m41.C37224b;
import my0.C37301d;
import my0.C37302e;
import oy0.C37839e;
import oy0.C37840f;
import p341ge.bog.mobilebank.cleanarch.presentation.common.C21481a;
import p341ge.bog.mobilebank.deposits.data.entity.depositbreak.ValidateDepositBreakParams;
import p341ge.bog.mobilebank.rest.model.otpparameter.OtpParams;
import p341ge.bog.mobilebank.shared.cardaccountselector.presentation.model.CardAccountSelectorData;
import p341ge.bog.mobilebank.shared.cardaccountselector.presentation.model.CardAccountSelectorUiModel;
import p341ge.bog.mobilebank.shared.tmx_profiling.TMXFlags;
import pc0.C27494a;
import ue1.C43075l;
import zb0.C30279b;

/* renamed from: nc0.g */
public final class C26412g extends C21481a implements C26406b, C26408c {

    /* renamed from: A */
    private final C40767b f66910A;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final C30279b f66911d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public final C37302e f66912e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public final C37301d f66913f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public final C37020g f66914g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public final C25677a f66915h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public final C24973a f66916i;

    /* renamed from: j */
    private final C32053a f66917j;

    /* renamed from: k */
    private final C31658b f66918k;

    /* renamed from: l */
    private final C27494a f66919l;

    /* renamed from: m */
    private final C26406b f66920m = this;

    /* renamed from: n */
    private final C26408c f66921n = this;
    /* access modifiers changed from: private */

    /* renamed from: o */
    public C19369a f66922o;
    /* access modifiers changed from: private */

    /* renamed from: p */
    public C20462b f66923p = new C20462b(new C20461a((CardAccountSelectorUiModel) null), false);

    /* renamed from: q */
    private ValidateDepositBreakParams f66924q;

    /* renamed from: r */
    private final C1644x f66925r = new C1644x();

    /* renamed from: s */
    private final C1644x f66926s = new C1644x();

    /* renamed from: t */
    private final C1644x f66927t = new C1644x();

    /* renamed from: u */
    private final C1644x f66928u = new C1644x(this.f66923p);

    /* renamed from: v */
    private final C1644x f66929v = new C1644x();

    /* renamed from: w */
    private final C1644x f66930w = new C1644x();

    /* renamed from: x */
    private final C1644x f66931x = new C1644x();

    /* renamed from: y */
    private final C1644x f66932y = new C1644x();

    /* renamed from: z */
    private final C40767b f66933z;

    /* renamed from: nc0.g$a */
    public /* synthetic */ class C26413a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f66934a;

        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        static {
            /*
                oy0.f[] r0 = oy0.C37840f.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                oy0.f r1 = oy0.C37840f.WARNING     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                oy0.f r1 = oy0.C37840f.OKAY     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                f66934a = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: nc0.C26412g.C26413a.<clinit>():void");
        }
    }

    /* renamed from: nc0.g$b */
    static final class C26414b extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C26412g f66935d;

        /* renamed from: e */
        final /* synthetic */ long f66936e;

        /* renamed from: nc0.g$b$a */
        static final class C26415a extends C41537m implements C43075l {

            /* renamed from: d */
            final /* synthetic */ C26412g f66937d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C26415a(C26412g gVar) {
                super(1);
                this.f66937d = gVar;
            }

            /* renamed from: a */
            public final void mo65668a(C19369a aVar) {
                C26412g gVar = this.f66937d;
                C41536l.m120488h(aVar, "it");
                gVar.f66922o = aVar;
                this.f66937d.mo65651Nn().mo4823o(this.f66937d.f66916i.mo63375a(aVar));
                C26412g gVar2 = this.f66937d;
                gVar2.m82526Fw(C20462b.m66661b(gVar2.f66923p, new C20461a(this.f66937d.m82550tw()), false, 2, (Object) null));
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                mo65668a((C19369a) obj);
                return C41238w.f97225a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C26414b(C26412g gVar, long j) {
            super(1);
            this.f66935d = gVar;
            this.f66936e = j;
        }

        /* access modifiers changed from: private */
        /* renamed from: c */
        public static final void m82576c(C43075l lVar, Object obj) {
            C41536l.m120489i(lVar, "$tmp0");
            lVar.invoke(obj);
        }

        /* renamed from: b */
        public final C40754t invoke(Integer num) {
            C41536l.m120489i(num, "rc");
            C40762x m = this.f66935d.f66911d.mo70619d(this.f66936e).mo95084m(new C26420h(new C26415a(this.f66935d)));
            C41536l.m120488h(m, "private fun subscribeToI…ndToLifecycle()\n        }");
            return C31270e.m92880i(m, num.intValue());
        }
    }

    /* renamed from: nc0.g$c */
    static final class C26416c extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C26412g f66938d;

        /* renamed from: nc0.g$c$a */
        static final class C26417a extends C41537m implements C43075l {

            /* renamed from: d */
            final /* synthetic */ C26412g f66939d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C26417a(C26412g gVar) {
                super(1);
                this.f66939d = gVar;
            }

            /* renamed from: a */
            public final void mo65670a(List list) {
                this.f66939d.f66914g.mo89943a();
                this.f66939d.f66915h.invoke();
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                mo65670a((List) obj);
                return C41238w.f97225a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C26416c(C26412g gVar) {
            super(1);
            this.f66938d = gVar;
        }

        /* access modifiers changed from: private */
        /* renamed from: c */
        public static final void m82580c(C43075l lVar, Object obj) {
            C41536l.m120489i(lVar, "$tmp0");
            lVar.invoke(obj);
        }

        /* renamed from: b */
        public final C40754t invoke(ValidateDepositBreakParams validateDepositBreakParams) {
            C41536l.m120489i(validateDepositBreakParams, "params");
            C40734b a = this.f66938d.f66913f.mo90409a(validateDepositBreakParams.getAgreeKey(), validateDepositBreakParams.getDstAcctKey());
            C24973a kw = this.f66938d.f66916i;
            C19369a ow = this.f66938d.f66922o;
            if (ow == null) {
                C41536l.m120506z("resources");
                ow = null;
            }
            C40762x m = a.mo94898g(C40762x.m118162z(kw.mo63376d(ow, this.f66938d.f66923p.mo48996c().mo48991a()))).mo95084m(new C26421i(new C26417a(this.f66938d)));
            C41536l.m120488h(m, "private fun subscribeToP…ndToLifecycle()\n        }");
            return C31270e.m92880i(m, -1);
        }
    }

    /* renamed from: nc0.g$d */
    static final class C26418d extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C26412g f66940d;

        /* renamed from: nc0.g$d$a */
        static final class C26419a extends C41537m implements C43075l {

            /* renamed from: d */
            final /* synthetic */ C26412g f66941d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C26419a(C26412g gVar) {
                super(1);
                this.f66941d = gVar;
            }

            /* renamed from: a */
            public final void mo65672a(C37839e eVar) {
                this.f66941d.m82549sw(eVar.mo91184a());
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                mo65672a((C37839e) obj);
                return C41238w.f97225a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C26418d(C26412g gVar) {
            super(1);
            this.f66940d = gVar;
        }

        /* access modifiers changed from: private */
        /* renamed from: c */
        public static final void m82584c(C43075l lVar, Object obj) {
            C41536l.m120489i(lVar, "$tmp0");
            lVar.invoke(obj);
        }

        /* renamed from: b */
        public final C40754t invoke(ValidateDepositBreakParams validateDepositBreakParams) {
            C41536l.m120489i(validateDepositBreakParams, "it");
            C40762x m = this.f66940d.f66912e.mo90410a(this.f66940d.mo65656Aw(validateDepositBreakParams)).mo95084m(new C26422j(new C26419a(this.f66940d)));
            C41536l.m120488h(m, "private fun subscribeToV…ndToLifecycle()\n        }");
            return C31270e.m92880i(m, -1);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C26412g(C30279b bVar, C37302e eVar, C37301d dVar, C37020g gVar, C25677a aVar, C24973a aVar2, C32053a aVar3, C31658b bVar2, C27494a aVar4, long j) {
        super((C41204a) null, 1, (DefaultConstructorMarker) null);
        C41536l.m120489i(bVar, "getDepositBreakResources");
        C41536l.m120489i(eVar, "validateDepositBreakProcess");
        C41536l.m120489i(dVar, "processDepositBreak");
        C41536l.m120489i(gVar, "refreshDepositsAndBonds");
        C41536l.m120489i(aVar, "refreshAccountsAndDetails");
        C41536l.m120489i(aVar2, "mapper");
        C41536l.m120489i(aVar3, "cardSelectorMapper");
        C41536l.m120489i(bVar2, "startTMXProfilingUseCase");
        C41536l.m120489i(aVar4, "otpParamsMapBuilder");
        this.f66911d = bVar;
        this.f66912e = eVar;
        this.f66913f = dVar;
        this.f66914g = gVar;
        this.f66915h = aVar;
        this.f66916i = aVar2;
        this.f66917j = aVar3;
        this.f66918k = bVar2;
        this.f66919l = aVar4;
        C40767b h1 = C40767b.m118210h1();
        C41536l.m120488h(h1, "create<ValidateDepositBreakParams>()");
        this.f66933z = h1;
        C40767b h12 = C40767b.m118210h1();
        C41536l.m120488h(h12, "create<ValidateDepositBreakParams>()");
        this.f66910A = h12;
        m82528Hw(j);
        m82532Lw();
        m82530Jw();
        m82527Gw();
    }

    /* access modifiers changed from: private */
    /* renamed from: Fw */
    public final void m82526Fw(C20462b bVar) {
        this.f66923p = bVar;
        mo65655f().mo4823o(bVar);
    }

    /* renamed from: Gw */
    private final void m82527Gw() {
        bindToLifecycle(this.f66918k.mo72084b(TMXFlags.TMX_FLAG_DEPOSIT_BREAK_KEY));
    }

    /* renamed from: Hw */
    private final void m82528Hw(long j) {
        C40749p L0 = C40749p.m118047l0(onInit(), onRefresh()).mo94989L0(new C26410e(new C26414b(this, j)));
        C41536l.m120488h(L0, "private fun subscribeToI…ndToLifecycle()\n        }");
        bindToLifecycle(C31270e.m92876e(L0, mo65654Zf()));
    }

    /* access modifiers changed from: private */
    /* renamed from: Iw */
    public static final C40754t m82529Iw(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (C40754t) lVar.invoke(obj);
    }

    /* renamed from: Jw */
    private final void m82530Jw() {
        C40749p L0 = this.f66910A.mo94989L0(new C26411f(new C26416c(this)));
        C41536l.m120488h(L0, "private fun subscribeToP…ndToLifecycle()\n        }");
        bindToLifecycle(C31270e.m92876e(L0, mo65648Ac()));
    }

    /* access modifiers changed from: private */
    /* renamed from: Kw */
    public static final C40754t m82531Kw(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (C40754t) lVar.invoke(obj);
    }

    /* renamed from: Lw */
    private final void m82532Lw() {
        C40749p L0 = this.f66933z.mo94989L0(new C26409d(new C26418d(this)));
        C41536l.m120488h(L0, "private fun subscribeToV…ndToLifecycle()\n        }");
        bindToLifecycle(C31270e.m92876e(L0, mo65650Nb()));
    }

    /* access modifiers changed from: private */
    /* renamed from: Mw */
    public static final C40754t m82533Mw(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (C40754t) lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: sw */
    public final void m82549sw(C37840f fVar) {
        int i = C26413a.f66934a[fVar.ordinal()];
        if (i == 1) {
            C37224b.m109962a(mo65653Su());
        } else if (i == 2) {
            this.f66914g.mo89943a();
            this.f66915h.invoke();
            C1644x Cw = mo65648Ac();
            C24973a aVar = this.f66916i;
            C19369a aVar2 = this.f66922o;
            if (aVar2 == null) {
                C41536l.m120506z("resources");
                aVar2 = null;
            }
            Cw.mo4823o(new C31128a.C31131c(aVar.mo63376d(aVar2, this.f66923p.mo48996c().mo48991a()), 0, 2, (DefaultConstructorMarker) null));
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v8, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v5, resolved type: c21.a} */
    /* access modifiers changed from: private */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: tw */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final p341ge.bog.mobilebank.shared.cardaccountselector.presentation.model.CardAccountSelectorUiModel m82550tw() {
        /*
            r8 = this;
            bc0.a r0 = r8.f66922o
            java.lang.String r1 = "resources"
            r2 = 0
            if (r0 != 0) goto L_0x000b
            kotlin.jvm.internal.C41536l.m120506z(r1)
            r0 = r2
        L_0x000b:
            java.util.List r0 = r0.mo47576c()
            java.util.Iterator r0 = r0.iterator()
        L_0x0013:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L_0x003e
            java.lang.Object r3 = r0.next()
            r4 = r3
            c21.a r4 = (c21.C31260a) r4
            long r4 = r4.mo71505a()
            bc0.a r6 = r8.f66922o
            if (r6 != 0) goto L_0x002c
            kotlin.jvm.internal.C41536l.m120506z(r1)
            r6 = r2
        L_0x002c:
            ny0.b r6 = r6.mo47574a()
            long r6 = r6.mo90664E()
            int r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r4 != 0) goto L_0x003a
            r4 = 1
            goto L_0x003b
        L_0x003a:
            r4 = 0
        L_0x003b:
            if (r4 == 0) goto L_0x0013
            goto L_0x003f
        L_0x003e:
            r3 = r2
        L_0x003f:
            c21.a r3 = (c21.C31260a) r3
            if (r3 != 0) goto L_0x0056
            bc0.a r0 = r8.f66922o
            if (r0 != 0) goto L_0x004b
            kotlin.jvm.internal.C41536l.m120506z(r1)
            r0 = r2
        L_0x004b:
            java.util.List r0 = r0.mo47576c()
            java.lang.Object r0 = ie1.C41358y.m120009Y(r0)
            r3 = r0
            c21.a r3 = (c21.C31260a) r3
        L_0x0056:
            if (r3 == 0) goto L_0x005e
            g21.a r0 = r8.f66917j
            ge.bog.mobilebank.shared.cardaccountselector.presentation.model.CardAccountSelectorUiModel r2 = r0.mo72551a(r3)
        L_0x005e:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: nc0.C26412g.m82550tw():ge.bog.mobilebank.shared.cardaccountselector.presentation.model.CardAccountSelectorUiModel");
    }

    /* renamed from: Aw */
    public HashMap mo65656Aw(OtpParams otpParams) {
        C41536l.m120489i(otpParams, "otpParams");
        return this.f66919l.mo66809a(otpParams);
    }

    /* renamed from: Bk */
    public void mo65643Bk(CardAccountSelectorUiModel cardAccountSelectorUiModel) {
        C41536l.m120489i(cardAccountSelectorUiModel, "account");
        m82526Fw(C20462b.m66661b(this.f66923p, new C20461a(cardAccountSelectorUiModel), false, 2, (Object) null));
    }

    /* renamed from: Bw */
    public final C26408c mo65657Bw() {
        return this.f66921n;
    }

    /* renamed from: Cw */
    public C1644x mo65648Ac() {
        return this.f66932y;
    }

    /* renamed from: Dw */
    public C1644x mo65653Su() {
        return this.f66931x;
    }

    /* renamed from: En */
    public void mo65644En(boolean z) {
        m82526Fw(C20462b.m66661b(this.f66923p, (C20461a) null, z, 1, (Object) null));
    }

    /* renamed from: Ew */
    public C1644x mo65650Nb() {
        return this.f66930w;
    }

    /* renamed from: H0 */
    public void mo65645H0() {
        C1644x yw = mo65649Ct();
        C19369a aVar = this.f66922o;
        Long l = null;
        if (aVar == null) {
            C41536l.m120506z("resources");
            aVar = null;
        }
        List<C31260a> c = aVar.mo47576c();
        C32053a aVar2 = this.f66917j;
        ArrayList arrayList = new ArrayList(C41343r.m119925u(c, 10));
        for (C31260a a : c) {
            arrayList.add(aVar2.mo72551a(a));
        }
        CardAccountSelectorUiModel a2 = this.f66923p.mo48996c().mo48991a();
        if (a2 != null) {
            l = Long.valueOf(a2.mo84203a());
        }
        C37224b.m109965d(yw, new CardAccountSelectorData(arrayList, l));
    }

    /* renamed from: Vs */
    public void mo65646Vs() {
        ValidateDepositBreakParams validateDepositBreakParams = this.f66924q;
        if (validateDepositBreakParams != null) {
            this.f66910A.onNext(validateDepositBreakParams);
        }
    }

    /* renamed from: pf */
    public void mo65647pf(String str, String str2, String str3) {
        ValidateDepositBreakParams copy$default;
        if (C32300e0.f79712a.mo72816a(str, str2, str3)) {
            ValidateDepositBreakParams validateDepositBreakParams = this.f66924q;
            if (validateDepositBreakParams != null && (copy$default = ValidateDepositBreakParams.copy$default(validateDepositBreakParams, 0, 0, (String) null, str, str2, str3, 7, (Object) null)) != null) {
                this.f66933z.onNext(copy$default);
                return;
            }
            return;
        }
        C19369a aVar = this.f66922o;
        if (aVar == null) {
            C41536l.m120506z("resources");
            aVar = null;
        }
        long d = aVar.mo47574a().mo90668d();
        CardAccountSelectorUiModel a = this.f66923p.mo48996c().mo48991a();
        if (a != null) {
            ValidateDepositBreakParams validateDepositBreakParams2 = new ValidateDepositBreakParams(d, a.mo84203a(), (String) null, (String) null, (String) null, (String) null, 60, (DefaultConstructorMarker) null);
            C37224b.m109965d(mo65652Pq(), validateDepositBreakParams2);
            this.f66924q = validateDepositBreakParams2;
        }
    }

    /* renamed from: uw */
    public C1644x mo65651Nn() {
        return this.f66926s;
    }

    /* renamed from: vw */
    public C1644x mo65654Zf() {
        return this.f66925r;
    }

    /* renamed from: ww */
    public final C26406b mo65663ww() {
        return this.f66920m;
    }

    /* renamed from: xw */
    public C1644x mo65655f() {
        return this.f66928u;
    }

    /* renamed from: yw */
    public C1644x mo65649Ct() {
        return this.f66927t;
    }

    /* renamed from: zw */
    public C1644x mo65652Pq() {
        return this.f66929v;
    }
}
