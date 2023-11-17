package ot0;

import androidx.lifecycle.C1607m0;
import androidx.lifecycle.C1644x;
import androidx.lifecycle.LiveData;
import b41.C31128a;
import b41.C31132b;
import c41.C31270e;
import de1.C40640a;
import ed1.C40749p;
import ed1.C40754t;
import ed1.C40762x;
import ee1.C40765a;
import ee1.C40767b;
import g91.C32306g0;
import g91.C32343x;
import gd1.C40992a;
import hd0.C24978b;
import hd1.C41204a;
import he1.C41238w;
import j51.C36735g;
import j70.C25351j;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ld0.C25950a;
import lt0.C37152a;
import lt0.C37153b;
import lt0.C37154c;
import m41.C37224b;
import m51.C37228a;
import p341ge.bog.mobilebank.cleanarch.loyaltyprograms.presentation.model.BonusCasServiceUiModel;
import p341ge.bog.mobilebank.cleanarch.loyaltyprograms.presentation.model.BonusDepositAccountUiModel;
import p341ge.bog.mobilebank.cleanarch.loyaltyprograms.presentation.model.BonusWrapperUiModel;
import p341ge.bog.mobilebank.cleanarch.presentation.common.C21481a;
import p341ge.bog.mobilebank.loyaltyandbonusprograms.presentation.model.cas.CasAccountUiModel;
import p341ge.bog.mobilebank.loyaltyandbonusprograms.presentation.model.moneybox.MoneyBoxDataUiModel;
import p341ge.bog.mobilebank.loyaltyandbonusprograms.presentation.model.moneybox.MoneyBoxTariffUiModel;
import p729cv.C19804f;
import p895sy.C28291b;
import ue1.C43075l;
import xd0.C29742a;
import xs0.C39863i0;
import xs0.C39871l0;
import xs0.C39877p;
import xs0.C39885x;
import yd0.C29991a;

/* renamed from: ot0.u */
public final class C37783u extends C21481a implements C37772p, C37775q {

    /* renamed from: A */
    private final LiveData f90700A;
    /* access modifiers changed from: private */

    /* renamed from: B */
    public final C1644x f90701B;
    /* access modifiers changed from: private */

    /* renamed from: C */
    public MoneyBoxDataUiModel f90702C;
    /* access modifiers changed from: private */

    /* renamed from: D */
    public C37153b f90703D;

    /* renamed from: E */
    private final C40765a f90704E;

    /* renamed from: F */
    private final C40767b f90705F;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final C39885x f90706d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public final C39871l0 f90707e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public final C28291b f90708f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public final C19804f f90709g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public final C39877p f90710h;

    /* renamed from: i */
    private final C36735g f90711i;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public final C39863i0 f90712j;
    /* access modifiers changed from: private */

    /* renamed from: k */
    public final C29742a f90713k;
    /* access modifiers changed from: private */

    /* renamed from: l */
    public final C25351j f90714l;
    /* access modifiers changed from: private */

    /* renamed from: m */
    public final C37154c f90715m;
    /* access modifiers changed from: private */

    /* renamed from: n */
    public final long f90716n;

    /* renamed from: o */
    private final C37772p f90717o = this;

    /* renamed from: p */
    private final C37775q f90718p = this;
    /* access modifiers changed from: private */

    /* renamed from: q */
    public final DecimalFormat f90719q;

    /* renamed from: r */
    private final C1644x f90720r;

    /* renamed from: s */
    private final LiveData f90721s;

    /* renamed from: t */
    private final C1644x f90722t;

    /* renamed from: u */
    private final C1644x f90723u;

    /* renamed from: v */
    private final C1644x f90724v;

    /* renamed from: w */
    private final C1644x f90725w;

    /* renamed from: x */
    private final LiveData f90726x;

    /* renamed from: y */
    private final C1644x f90727y;

    /* renamed from: z */
    private final C1644x f90728z;

    /* renamed from: ot0.u$a */
    static final class C37784a extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C37783u f90729d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C37784a(C37783u uVar) {
            super(1);
            this.f90729d = uVar;
        }

        /* renamed from: a */
        public final C40754t invoke(Integer num) {
            C41536l.m120489i(num, "it");
            C40762x B = C32343x.m95456i1(this.f90729d.f90706d.mo93584h(this.f90729d.f90716n)).mo95063B(C40992a.m118827a());
            C41536l.m120488h(B, "getMoneyBoxData(depositA…dSchedulers.mainThread())");
            return C31270e.m92880i(B, -1);
        }
    }

    /* renamed from: ot0.u$b */
    static final class C37785b extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C37783u f90730d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C37785b(C37783u uVar) {
            super(1);
            this.f90730d = uVar;
        }

        /* JADX WARNING: Removed duplicated region for block: B:36:0x0048 A[SYNTHETIC] */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final b41.C31128a invoke(b41.C31128a r14) {
            /*
                r13 = this;
                java.lang.String r0 = "it"
                kotlin.jvm.internal.C41536l.m120488h(r14, r0)
                ot0.u r0 = r13.f90730d
                boolean r1 = r14 instanceof b41.C31128a.C31131c     // Catch:{ all -> 0x00a3 }
                r2 = 0
                if (r1 == 0) goto L_0x0075
                r1 = r14
                b41.a$c r1 = (b41.C31128a.C31131c) r1     // Catch:{ all -> 0x00a3 }
                java.lang.Object r1 = r1.mo71340a()     // Catch:{ all -> 0x00a3 }
                ys0.a r1 = (ys0.C40057a) r1     // Catch:{ all -> 0x00a3 }
                lt0.c r3 = r0.f90715m     // Catch:{ all -> 0x00a3 }
                java.util.List r4 = r1.mo93928e()     // Catch:{ all -> 0x00a3 }
                java.util.Iterator r4 = r4.iterator()     // Catch:{ all -> 0x00a3 }
            L_0x0021:
                boolean r5 = r4.hasNext()     // Catch:{ all -> 0x00a3 }
                r6 = 1
                r7 = 0
                if (r5 == 0) goto L_0x0049
                java.lang.Object r5 = r4.next()     // Catch:{ all -> 0x00a3 }
                r8 = r5
                ty.e r8 = (p906ty.C28527e) r8     // Catch:{ all -> 0x00a3 }
                java.lang.Long r8 = r8.mo68196f()     // Catch:{ all -> 0x00a3 }
                long r9 = r0.f90716n     // Catch:{ all -> 0x00a3 }
                if (r8 != 0) goto L_0x003b
                goto L_0x0045
            L_0x003b:
                long r11 = r8.longValue()     // Catch:{ all -> 0x00a3 }
                int r8 = (r11 > r9 ? 1 : (r11 == r9 ? 0 : -1))
                if (r8 != 0) goto L_0x0045
                r8 = r6
                goto L_0x0046
            L_0x0045:
                r8 = r7
            L_0x0046:
                if (r8 == 0) goto L_0x0021
                goto L_0x004a
            L_0x0049:
                r5 = r2
            L_0x004a:
                ty.e r5 = (p906ty.C28527e) r5     // Catch:{ all -> 0x00a3 }
                if (r5 == 0) goto L_0x0053
                java.lang.String r4 = r5.mo68194e()     // Catch:{ all -> 0x00a3 }
                goto L_0x0054
            L_0x0053:
                r4 = r2
            L_0x0054:
                ge.bog.mobilebank.loyaltyandbonusprograms.presentation.model.moneybox.MoneyBoxDataUiModel r1 = r3.mo90142a(r1, r4)     // Catch:{ all -> 0x00a3 }
                r0.f90702C = r1     // Catch:{ all -> 0x00a3 }
                ot0.C37783u.m111015Aw(r0, r7, r6, r2)     // Catch:{ all -> 0x00a3 }
                ge.bog.mobilebank.loyaltyandbonusprograms.presentation.model.moneybox.MoneyBoxDataUiModel r0 = r0.f90702C     // Catch:{ all -> 0x00a3 }
                if (r0 != 0) goto L_0x006a
                java.lang.String r0 = "data"
                kotlin.jvm.internal.C41536l.m120506z(r0)     // Catch:{ all -> 0x00a3 }
                goto L_0x006b
            L_0x006a:
                r2 = r0
            L_0x006b:
                int r0 = r14.mo71341b()     // Catch:{ all -> 0x00a3 }
                b41.a$c r1 = new b41.a$c     // Catch:{ all -> 0x00a3 }
                r1.<init>(r2, r0)     // Catch:{ all -> 0x00a3 }
                goto L_0x00b2
            L_0x0075:
                boolean r0 = r14 instanceof b41.C31128a.C31129a     // Catch:{ all -> 0x00a3 }
                if (r0 == 0) goto L_0x008e
                b41.a$a r1 = new b41.a$a     // Catch:{ all -> 0x00a3 }
                r0 = r14
                b41.a$a r0 = (b41.C31128a.C31129a) r0     // Catch:{ all -> 0x00a3 }
                java.lang.Throwable r4 = r0.mo71342c()     // Catch:{ all -> 0x00a3 }
                int r5 = r14.mo71341b()     // Catch:{ all -> 0x00a3 }
                r6 = 0
                r7 = 4
                r8 = 0
                r3 = r1
                r3.<init>(r4, r5, r6, r7, r8)     // Catch:{ all -> 0x00a3 }
                goto L_0x00b2
            L_0x008e:
                boolean r0 = r14 instanceof b41.C31128a.C31130b     // Catch:{ all -> 0x00a3 }
                if (r0 == 0) goto L_0x009d
                b41.a$b r1 = new b41.a$b     // Catch:{ all -> 0x00a3 }
                int r0 = r14.mo71341b()     // Catch:{ all -> 0x00a3 }
                r3 = 2
                r1.<init>(r0, r2, r3, r2)     // Catch:{ all -> 0x00a3 }
                goto L_0x00b2
            L_0x009d:
                kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException     // Catch:{ all -> 0x00a3 }
                r0.<init>()     // Catch:{ all -> 0x00a3 }
                throw r0     // Catch:{ all -> 0x00a3 }
            L_0x00a3:
                r0 = move-exception
                r2 = r0
                b41.a$a r0 = new b41.a$a
                int r3 = r14.mo71341b()
                r4 = 0
                r5 = 4
                r6 = 0
                r1 = r0
                r1.<init>(r2, r3, r4, r5, r6)
            L_0x00b2:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: ot0.C37783u.C37785b.invoke(b41.a):b41.a");
        }
    }

    /* renamed from: ot0.u$c */
    static final class C37786c extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C37783u f90731d;

        /* renamed from: ot0.u$c$a */
        static final class C37787a extends C41537m implements C43075l {

            /* renamed from: d */
            final /* synthetic */ C37783u f90732d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C37787a(C37783u uVar) {
                super(1);
                this.f90732d = uVar;
            }

            /* renamed from: a */
            public final void mo91044a(String str) {
                C41536l.m120489i(str, "contract");
                this.f90732d.f90701B.mo4823o(C32343x.m95466m(str));
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                mo91044a((String) obj);
                return C41238w.f97225a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C37786c(C37783u uVar) {
            super(1);
            this.f90731d = uVar;
        }

        /* renamed from: a */
        public final C31128a invoke(C31128a aVar) {
            C41536l.m120488h(aVar, "it");
            C31132b.m92648j(aVar, (int[]) null, new C37787a(this.f90731d), 1, (Object) null);
            try {
                if (aVar instanceof C31128a.C31131c) {
                    String str = (String) ((C31128a.C31131c) aVar).mo71340a();
                    return new C31128a.C31131c(C41238w.f97225a, aVar.mo71341b());
                } else if (aVar instanceof C31128a.C31129a) {
                    Throwable c = ((C31128a.C31129a) aVar).mo71342c();
                    int b = aVar.mo71341b();
                    String str2 = (String) aVar.mo71340a();
                    return new C31128a.C31129a(c, b, C41238w.f97225a);
                } else if (aVar instanceof C31128a.C31130b) {
                    int b2 = aVar.mo71341b();
                    String str3 = (String) aVar.mo71340a();
                    return new C31128a.C31130b(b2, C41238w.f97225a);
                } else {
                    throw new NoWhenBranchMatchedException();
                }
            } catch (Throwable th) {
                return new C31128a.C31129a(th, aVar.mo71341b(), (Object) null, 4, (DefaultConstructorMarker) null);
            }
        }
    }

    /* renamed from: ot0.u$d */
    static final class C37788d extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C37783u f90733d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C37788d(C37783u uVar) {
            super(1);
            this.f90733d = uVar;
        }

        /* renamed from: a */
        public final C31128a invoke(C31128a aVar) {
            if (aVar instanceof C31128a.C31131c) {
                this.f90733d.f90708f.mo67919a();
                this.f90733d.f90709g.mo48092a();
                this.f90733d.f90712j.mo93569a();
                this.f90733d.f90714l.invoke();
                C32306g0.m95220a("money_box_created");
            }
            C41536l.m120488h(aVar, "it");
            return aVar;
        }
    }

    /* renamed from: ot0.u$e */
    static final class C37789e extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C37783u f90734d;

        /* renamed from: e */
        final /* synthetic */ long f90735e;

        /* renamed from: ot0.u$e$a */
        static final class C37790a extends C41537m implements C43075l {

            /* renamed from: d */
            public static final C37790a f90736d = new C37790a();

            C37790a() {
                super(1);
            }

            /* renamed from: a */
            public final CharSequence invoke(CasAccountUiModel casAccountUiModel) {
                C41536l.m120489i(casAccountUiModel, "it");
                return String.valueOf(casAccountUiModel.mo75002a());
            }
        }

        /* renamed from: ot0.u$e$b */
        static final class C37791b extends C41537m implements C43075l {

            /* renamed from: d */
            public static final C37791b f90737d = new C37791b();

            C37791b() {
                super(1);
            }

            /* renamed from: a */
            public final String invoke(C25950a aVar) {
                C41536l.m120489i(aVar, "it");
                return aVar.mo64864a();
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C37789e(C37783u uVar, long j) {
            super(1);
            this.f90734d = uVar;
            this.f90735e = j;
        }

        /* access modifiers changed from: private */
        /* renamed from: c */
        public static final String m111063c(C43075l lVar, Object obj) {
            C41536l.m120489i(lVar, "$tmp0");
            return (String) lVar.invoke(obj);
        }

        /* renamed from: b */
        public final C40754t invoke(C41238w wVar) {
            Double d;
            String str;
            String str2;
            MoneyBoxTariffUiModel a;
            C41536l.m120489i(wVar, "it");
            C39877p mw = this.f90734d.f90710h;
            long j = this.f90735e;
            String e = C24978b.NO.mo63391e();
            C41536l.m120488h(e, "NO.value");
            String g0 = C41358y.m120017g0(this.f90734d.f90703D.mo90135c(), ",", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, C37790a.f90736d, 30, (Object) null);
            C37152a d2 = this.f90734d.f90703D.mo90136d();
            String str3 = null;
            if (d2 == null || (a = d2.mo90129a()) == null) {
                d = null;
            } else {
                d = Double.valueOf(a.mo75113e());
            }
            BonusDepositAccountUiModel e2 = this.f90734d.f90703D.mo90137e();
            if (e2 != null) {
                str = e2.mo52747d();
            } else {
                str = null;
            }
            String str4 = d + " " + str;
            BonusDepositAccountUiModel e3 = this.f90734d.f90703D.mo90137e();
            if (e3 != null) {
                str2 = e3.mo52751f();
            } else {
                str2 = null;
            }
            BonusDepositAccountUiModel e4 = this.f90734d.f90703D.mo90137e();
            if (e4 != null) {
                str3 = e4.mo52746b();
            }
            C40749p o0 = mw.mo93579a(j, e, g0, str4, str2, str3).mo95062A(new C37795v(C37791b.f90737d)).mo95075O().mo94987J0(C40640a.m117458b()).mo95027o0(C40992a.m118827a());
            C41536l.m120488h(o0, "getPreContract(\n        …dSchedulers.mainThread())");
            return C31270e.m92879h(o0, -1);
        }
    }

    /* renamed from: ot0.u$f */
    static final class C37792f extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C37783u f90738d;

        /* renamed from: ot0.u$f$a */
        static final class C37793a extends C41537m implements C43075l {

            /* renamed from: d */
            public static final C37793a f90739d = new C37793a();

            C37793a() {
                super(1);
            }

            /* renamed from: a */
            public final CharSequence invoke(CasAccountUiModel casAccountUiModel) {
                C41536l.m120489i(casAccountUiModel, "it");
                return String.valueOf(casAccountUiModel.mo75002a());
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C37792f(C37783u uVar) {
            super(1);
            this.f90738d = uVar;
        }

        /* renamed from: a */
        public final C40754t invoke(C41238w wVar) {
            MoneyBoxTariffUiModel moneyBoxTariffUiModel;
            long j;
            C41536l.m120489i(wVar, "it");
            BonusDepositAccountUiModel e = this.f90738d.f90703D.mo90137e();
            C41536l.m120486f(e);
            C37152a d = this.f90738d.f90703D.mo90136d();
            if (d != null) {
                moneyBoxTariffUiModel = d.mo90129a();
            } else {
                moneyBoxTariffUiModel = null;
            }
            C41536l.m120486f(moneyBoxTariffUiModel);
            String g0 = C41358y.m120017g0(this.f90738d.f90703D.mo90135c(), ",", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, C37793a.f90739d, 30, (Object) null);
            C39871l0 tw = this.f90738d.f90707e;
            Long e2 = e.mo52749e();
            if (e2 != null) {
                j = e2.longValue();
            } else {
                j = -1;
            }
            String d2 = e.mo52747d();
            C41536l.m120486f(d2);
            String format = this.f90738d.f90719q.format(moneyBoxTariffUiModel.mo75113e());
            C41536l.m120488h(format, "amount.tariff.let(formatter::format)");
            C40762x g = tw.mo93574b(j, d2, format, g0, (Long) null).mo94898g(this.f90738d.f90713k.mo47470a(C29991a.C29994c.C30001g.f75813e));
            C41536l.m120488h(g, "saveMoneyBox(\n          …Result.PiggyBankSuccess))");
            return C31270e.m92880i(C32343x.m95465l1(g), -1);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C37783u(C39885x xVar, C39871l0 l0Var, C28291b bVar, C19804f fVar, C39877p pVar, C36735g gVar, C39863i0 i0Var, C29742a aVar, C25351j jVar, C37154c cVar, long j) {
        super((C41204a) null, 1, (DefaultConstructorMarker) null);
        C41536l.m120489i(xVar, "getMoneyBoxData");
        C41536l.m120489i(l0Var, "saveMoneyBox");
        C41536l.m120489i(bVar, "refreshBonuses");
        C41536l.m120489i(fVar, "refreshProductTypeList");
        C41536l.m120489i(pVar, "getPreContract");
        C41536l.m120489i(gVar, "getLoginInfo");
        C41536l.m120489i(i0Var, "refreshCasClientServiceInfo");
        C41536l.m120489i(aVar, "getClientCampaignInfo");
        C41536l.m120489i(jVar, "reloadProducts");
        C41536l.m120489i(cVar, "moneyBoxUiMapper");
        this.f90706d = xVar;
        this.f90707e = l0Var;
        this.f90708f = bVar;
        this.f90709g = fVar;
        this.f90710h = pVar;
        this.f90711i = gVar;
        this.f90712j = i0Var;
        this.f90713k = aVar;
        this.f90714l = jVar;
        this.f90715m = cVar;
        this.f90716n = j;
        DecimalFormat decimalFormat = new DecimalFormat("#.####");
        DecimalFormatSymbols instance = DecimalFormatSymbols.getInstance();
        instance.setDecimalSeparator('.');
        decimalFormat.setDecimalFormatSymbols(instance);
        this.f90719q = decimalFormat;
        C1644x xVar2 = new C1644x();
        this.f90720r = xVar2;
        this.f90721s = C1607m0.m5655c(xVar2, new C37785b(this));
        this.f90722t = new C1644x();
        this.f90723u = new C1644x();
        this.f90724v = new C1644x(Boolean.FALSE);
        C1644x xVar3 = new C1644x();
        this.f90725w = xVar3;
        this.f90726x = C1607m0.m5655c(xVar3, new C37788d(this));
        this.f90727y = new C1644x();
        C1644x xVar4 = new C1644x();
        this.f90728z = xVar4;
        this.f90700A = C1607m0.m5655c(xVar4, new C37786c(this));
        this.f90701B = new C1644x();
        this.f90703D = new C37153b((BonusDepositAccountUiModel) null, (C37152a) null, (List) null, 7, (DefaultConstructorMarker) null);
        C40765a h1 = C40765a.m118198h1();
        C41536l.m120488h(h1, "create<Unit>()");
        this.f90704E = h1;
        C40767b h12 = C40767b.m118210h1();
        C41536l.m120488h(h12, "create<Unit>()");
        this.f90705F = h12;
        C40749p Q = C40749p.m118047l0(onInit(), onRefresh()).mo94998Q(new C37781t(new C37784a(this)));
        C41536l.m120488h(Q, "merge(onInit(), onRefres…QUEST_CODE)\n            }");
        bindToLifecycle(C31270e.m92876e(Q, xVar2));
        m111018Dw();
        m111016Bw();
    }

    /* renamed from: Aw */
    static /* synthetic */ void m111015Aw(C37783u uVar, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        uVar.m111042zw(z);
    }

    /* renamed from: Bw */
    private final void m111016Bw() {
        C37228a a = this.f90711i.mo89562a();
        if (a != null) {
            C40749p L0 = this.f90705F.mo94989L0(new C37777r(new C37789e(this, a.mo90305b())));
            C41536l.m120488h(L0, "private fun subscribeToP…ndToLifecycle()\n        }");
            bindToLifecycle(C31270e.m92876e(L0, this.f90728z));
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: Cw */
    public static final C40754t m111017Cw(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (C40754t) lVar.invoke(obj);
    }

    /* renamed from: Dw */
    private final void m111018Dw() {
        C40749p L0 = this.f90704E.mo94989L0(new C37779s(new C37792f(this)));
        C41536l.m120488h(L0, "private fun subscribeToS…ndToLifecycle()\n        }");
        bindToLifecycle(C31270e.m92876e(L0, this.f90725w));
    }

    /* access modifiers changed from: private */
    /* renamed from: Ew */
    public static final C40754t m111019Ew(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (C40754t) lVar.invoke(obj);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v0, resolved type: ge.bog.mobilebank.shared.helper.ImageSource$Url} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v1, resolved type: ge.bog.mobilebank.shared.helper.ImageSource$Resource} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v2, resolved type: ge.bog.mobilebank.shared.helper.ImageSource$Resource} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v3, resolved type: ge.bog.mobilebank.shared.helper.ImageSource$Url} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v4, resolved type: ge.bog.mobilebank.shared.helper.ImageSource$Url} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v8, resolved type: ge.bog.mobilebank.shared.helper.ImageSource$Url} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: Fw */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final p341ge.bog.mobilebank.loyaltyandbonusprograms.presentation.model.piggybank.PiggyBankAccountUiModel m111020Fw(p341ge.bog.mobilebank.loyaltyandbonusprograms.presentation.model.cas.CasAccountUiModel r10) {
        /*
            r9 = this;
            java.lang.String r1 = r10.mo75011j()
            if (r1 == 0) goto L_0x0011
            ge.bog.mobilebank.shared.helper.ImageSource$Url r6 = new ge.bog.mobilebank.shared.helper.ImageSource$Url
            r2 = 0
            r3 = 0
            r4 = 6
            r5 = 0
            r0 = r6
            r0.<init>(r1, r2, r3, r4, r5)
            goto L_0x0028
        L_0x0011:
            java.lang.Integer r0 = r10.mo75006e()
            if (r0 == 0) goto L_0x0021
            int r0 = r0.intValue()
            ge.bog.mobilebank.shared.helper.ImageSource$Resource r6 = new ge.bog.mobilebank.shared.helper.ImageSource$Resource
            r6.<init>(r0)
            goto L_0x0028
        L_0x0021:
            ge.bog.mobilebank.shared.helper.ImageSource$Resource r6 = new ge.bog.mobilebank.shared.helper.ImageSource$Resource
            int r0 = rs0.C38335b.f91849a
            r6.<init>(r0)
        L_0x0028:
            lt0.b r0 = r9.f90703D
            java.util.List r0 = r0.mo90135c()
            boolean r1 = r0 instanceof java.util.Collection
            r2 = 0
            if (r1 == 0) goto L_0x003a
            boolean r1 = r0.isEmpty()
            if (r1 == 0) goto L_0x003a
            goto L_0x005d
        L_0x003a:
            java.util.Iterator r0 = r0.iterator()
        L_0x003e:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x005d
            java.lang.Object r1 = r0.next()
            ge.bog.mobilebank.loyaltyandbonusprograms.presentation.model.cas.CasAccountUiModel r1 = (p341ge.bog.mobilebank.loyaltyandbonusprograms.presentation.model.cas.CasAccountUiModel) r1
            long r3 = r1.mo75002a()
            long r7 = r10.mo75002a()
            int r1 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            r3 = 1
            if (r1 != 0) goto L_0x0059
            r1 = r3
            goto L_0x005a
        L_0x0059:
            r1 = r2
        L_0x005a:
            if (r1 == 0) goto L_0x003e
            r2 = r3
        L_0x005d:
            ge.bog.mobilebank.loyaltyandbonusprograms.presentation.model.piggybank.PiggyBankAccountUiModel r0 = new ge.bog.mobilebank.loyaltyandbonusprograms.presentation.model.piggybank.PiggyBankAccountUiModel
            r0.<init>(r10, r6, r2)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: ot0.C37783u.m111020Fw(ge.bog.mobilebank.loyaltyandbonusprograms.presentation.model.cas.CasAccountUiModel):ge.bog.mobilebank.loyaltyandbonusprograms.presentation.model.piggybank.PiggyBankAccountUiModel");
    }

    /* renamed from: Gw */
    private final void m111021Gw() {
        this.f90727y.mo4823o(this.f90703D);
        this.f90724v.mo4823o(Boolean.valueOf(this.f90703D.mo90139f()));
    }

    /* access modifiers changed from: private */
    /* renamed from: gw */
    public static final C40754t m111025gw(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (C40754t) lVar.invoke(obj);
    }

    /* renamed from: ww */
    private final void m111041ww() {
        MoneyBoxDataUiModel moneyBoxDataUiModel;
        boolean z;
        boolean z2;
        boolean z3;
        MoneyBoxDataUiModel moneyBoxDataUiModel2 = this.f90702C;
        if (moneyBoxDataUiModel2 == null) {
            C41536l.m120506z("data");
            moneyBoxDataUiModel2 = null;
        }
        if (moneyBoxDataUiModel2.mo75098e().mo52792d(this.f90716n) != null && this.f90716n == -1) {
            MoneyBoxDataUiModel moneyBoxDataUiModel3 = this.f90702C;
            if (moneyBoxDataUiModel3 == null) {
                C41536l.m120506z("data");
                moneyBoxDataUiModel = null;
            } else {
                moneyBoxDataUiModel = moneyBoxDataUiModel3;
            }
            MoneyBoxDataUiModel moneyBoxDataUiModel4 = this.f90702C;
            if (moneyBoxDataUiModel4 == null) {
                C41536l.m120506z("data");
                moneyBoxDataUiModel4 = null;
            }
            List f = moneyBoxDataUiModel4.mo75100f();
            ArrayList arrayList = new ArrayList();
            for (Object next : f) {
                BonusDepositAccountUiModel bonusDepositAccountUiModel = (BonusDepositAccountUiModel) next;
                MoneyBoxDataUiModel moneyBoxDataUiModel5 = this.f90702C;
                if (moneyBoxDataUiModel5 == null) {
                    C41536l.m120506z("data");
                    moneyBoxDataUiModel5 = null;
                }
                List<BonusCasServiceUiModel> e = moneyBoxDataUiModel5.mo75098e().mo52794e();
                boolean z4 = false;
                if (e != null) {
                    ArrayList arrayList2 = new ArrayList(C41343r.m119925u(e, 10));
                    for (BonusCasServiceUiModel g : e) {
                        List g2 = g.mo52717g();
                        if (g2 == null) {
                            g2 = C41341q.m119907j();
                        }
                        arrayList2.add(g2);
                    }
                    if (!arrayList2.isEmpty()) {
                        Iterator it = arrayList2.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                break;
                            }
                            List list = (List) it.next();
                            if (!(list instanceof Collection) || !list.isEmpty()) {
                                Iterator it2 = list.iterator();
                                while (true) {
                                    if (!it2.hasNext()) {
                                        break;
                                    }
                                    BonusDepositAccountUiModel bonusDepositAccountUiModel2 = (BonusDepositAccountUiModel) it2.next();
                                    if (bonusDepositAccountUiModel2.mo52745a() == null || !C41536l.m120484d(bonusDepositAccountUiModel2.mo52745a(), bonusDepositAccountUiModel.mo52745a())) {
                                        z3 = false;
                                        continue;
                                    } else {
                                        z3 = true;
                                        continue;
                                    }
                                    if (z3) {
                                        z2 = true;
                                        continue;
                                        break;
                                    }
                                }
                            }
                            z2 = false;
                            continue;
                            if (z2) {
                                z = true;
                                break;
                            }
                        }
                    }
                    z = false;
                    if (z) {
                        z4 = true;
                    }
                }
                if (z4) {
                    arrayList.add(next);
                }
            }
            this.f90702C = MoneyBoxDataUiModel.m97560b(moneyBoxDataUiModel, (BonusWrapperUiModel) null, arrayList, (List) null, (List) null, 13, (Object) null);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:45:0x00bf A[LOOP:1: B:34:0x0098->B:45:0x00bf, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x0153  */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x00c3 A[EDGE_INSN: B:90:0x00c3->B:47:0x00c3 ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x0103 A[SYNTHETIC] */
    /* renamed from: zw */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void m111042zw(boolean r21) {
        /*
            r20 = this;
            r0 = r20
            r1 = 1
            java.lang.String r2 = "data"
            r3 = 0
            r4 = 0
            if (r21 == 0) goto L_0x0050
            r20.m111041ww()
            lt0.b r5 = r0.f90703D
            ge.bog.mobilebank.loyaltyandbonusprograms.presentation.model.moneybox.MoneyBoxDataUiModel r6 = r0.f90702C
            if (r6 != 0) goto L_0x0016
            kotlin.jvm.internal.C41536l.m120506z(r2)
            r6 = r3
        L_0x0016:
            java.util.List r6 = r6.mo75100f()
            java.util.Iterator r6 = r6.iterator()
        L_0x001e:
            boolean r7 = r6.hasNext()
            if (r7 == 0) goto L_0x0042
            java.lang.Object r7 = r6.next()
            r8 = r7
            ge.bog.mobilebank.cleanarch.loyaltyprograms.presentation.model.BonusDepositAccountUiModel r8 = (p341ge.bog.mobilebank.cleanarch.loyaltyprograms.presentation.model.BonusDepositAccountUiModel) r8
            java.lang.Long r8 = r8.mo52749e()
            long r9 = r0.f90716n
            if (r8 != 0) goto L_0x0034
            goto L_0x003e
        L_0x0034:
            long r11 = r8.longValue()
            int r8 = (r11 > r9 ? 1 : (r11 == r9 ? 0 : -1))
            if (r8 != 0) goto L_0x003e
            r8 = r1
            goto L_0x003f
        L_0x003e:
            r8 = r4
        L_0x003f:
            if (r8 == 0) goto L_0x001e
            goto L_0x0043
        L_0x0042:
            r7 = r3
        L_0x0043:
            r6 = r7
            ge.bog.mobilebank.cleanarch.loyaltyprograms.presentation.model.BonusDepositAccountUiModel r6 = (p341ge.bog.mobilebank.cleanarch.loyaltyprograms.presentation.model.BonusDepositAccountUiModel) r6
            r7 = 0
            r8 = 0
            r9 = 6
            r10 = 0
            lt0.b r5 = lt0.C37153b.m109813b(r5, r6, r7, r8, r9, r10)
            r0.f90703D = r5
        L_0x0050:
            ge.bog.mobilebank.loyaltyandbonusprograms.presentation.model.moneybox.MoneyBoxDataUiModel r5 = r0.f90702C
            if (r5 != 0) goto L_0x0058
            kotlin.jvm.internal.C41536l.m120506z(r2)
            r5 = r3
        L_0x0058:
            ge.bog.mobilebank.cleanarch.loyaltyprograms.presentation.model.BonusWrapperUiModel r5 = r5.mo75098e()
            lt0.b r6 = r0.f90703D
            ge.bog.mobilebank.cleanarch.loyaltyprograms.presentation.model.BonusDepositAccountUiModel r6 = r6.mo90137e()
            if (r6 == 0) goto L_0x006f
            java.lang.Long r6 = r6.mo52749e()
            if (r6 == 0) goto L_0x006f
            long r6 = r6.longValue()
            goto L_0x0071
        L_0x006f:
            r6 = -1
        L_0x0071:
            ge.bog.mobilebank.cleanarch.loyaltyprograms.presentation.model.BonusCasServiceUiModel r5 = r5.mo52792d(r6)
            androidx.lifecycle.x r6 = r0.f90723u
            if (r5 != 0) goto L_0x007c
            int r7 = rs0.C38338e.header_text_create_money_box
            goto L_0x007e
        L_0x007c:
            int r7 = rs0.C38338e.header_text_edit_money_box
        L_0x007e:
            java.lang.Object[] r8 = new java.lang.Object[r4]
            java.lang.String r7 = g91.C32343x.m95452h0(r7, r8)
            r6.mo4823o(r7)
            ge.bog.mobilebank.loyaltyandbonusprograms.presentation.model.moneybox.MoneyBoxDataUiModel r6 = r0.f90702C
            if (r6 != 0) goto L_0x008f
            kotlin.jvm.internal.C41536l.m120506z(r2)
            r6 = r3
        L_0x008f:
            java.util.List r6 = r6.mo75101g()
            java.util.Iterator r6 = r6.iterator()
            r7 = r4
        L_0x0098:
            boolean r8 = r6.hasNext()
            if (r8 == 0) goto L_0x00c2
            java.lang.Object r8 = r6.next()
            ge.bog.mobilebank.loyaltyandbonusprograms.presentation.model.moneybox.MoneyBoxTariffUiModel r8 = (p341ge.bog.mobilebank.loyaltyandbonusprograms.presentation.model.moneybox.MoneyBoxTariffUiModel) r8
            if (r5 == 0) goto L_0x00bb
            long r8 = r8.mo75111d()
            java.lang.Long r10 = r5.mo52720i()
            if (r10 != 0) goto L_0x00b1
            goto L_0x00bb
        L_0x00b1:
            long r10 = r10.longValue()
            int r8 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r8 != 0) goto L_0x00bb
            r8 = r1
            goto L_0x00bc
        L_0x00bb:
            r8 = r4
        L_0x00bc:
            if (r8 == 0) goto L_0x00bf
            goto L_0x00c3
        L_0x00bf:
            int r7 = r7 + 1
            goto L_0x0098
        L_0x00c2:
            r7 = -1
        L_0x00c3:
            lt0.b r8 = r0.f90703D
            r9 = 0
            ge.bog.mobilebank.loyaltyandbonusprograms.presentation.model.moneybox.MoneyBoxDataUiModel r6 = r0.f90702C
            if (r6 != 0) goto L_0x00ce
            kotlin.jvm.internal.C41536l.m120506z(r2)
            r6 = r3
        L_0x00ce:
            java.util.List r6 = r6.mo75101g()
            java.lang.Object r6 = ie1.C41358y.m120010Z(r6, r7)
            ge.bog.mobilebank.loyaltyandbonusprograms.presentation.model.moneybox.MoneyBoxTariffUiModel r6 = (p341ge.bog.mobilebank.loyaltyandbonusprograms.presentation.model.moneybox.MoneyBoxTariffUiModel) r6
            if (r6 == 0) goto L_0x00e0
            lt0.a r10 = new lt0.a
            r10.<init>(r6, r7)
            goto L_0x00e1
        L_0x00e0:
            r10 = r3
        L_0x00e1:
            r11 = 0
            r12 = 5
            r13 = 0
            lt0.b r14 = lt0.C37153b.m109813b(r8, r9, r10, r11, r12, r13)
            r0.f90703D = r14
            r15 = 0
            r16 = 0
            ge.bog.mobilebank.loyaltyandbonusprograms.presentation.model.moneybox.MoneyBoxDataUiModel r6 = r0.f90702C
            if (r6 != 0) goto L_0x00f5
            kotlin.jvm.internal.C41536l.m120506z(r2)
            goto L_0x00f6
        L_0x00f5:
            r3 = r6
        L_0x00f6:
            java.util.List r2 = r3.mo75096d()
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.Iterator r2 = r2.iterator()
        L_0x0103:
            boolean r6 = r2.hasNext()
            if (r6 == 0) goto L_0x0157
            java.lang.Object r6 = r2.next()
            r7 = r6
            ge.bog.mobilebank.loyaltyandbonusprograms.presentation.model.cas.CasAccountUiModel r7 = (p341ge.bog.mobilebank.loyaltyandbonusprograms.presentation.model.cas.CasAccountUiModel) r7
            if (r5 == 0) goto L_0x0118
            java.util.List r8 = r5.mo52710a()
            if (r8 != 0) goto L_0x011c
        L_0x0118:
            java.util.List r8 = ie1.C41341q.m119907j()
        L_0x011c:
            boolean r9 = r8 instanceof java.util.Collection
            if (r9 == 0) goto L_0x0128
            boolean r9 = r8.isEmpty()
            if (r9 == 0) goto L_0x0128
        L_0x0126:
            r7 = r4
            goto L_0x0151
        L_0x0128:
            java.util.Iterator r8 = r8.iterator()
        L_0x012c:
            boolean r9 = r8.hasNext()
            if (r9 == 0) goto L_0x0126
            java.lang.Object r9 = r8.next()
            ge.bog.mobilebank.cleanarch.loyaltyprograms.presentation.model.BonusAccountUiModel r9 = (p341ge.bog.mobilebank.cleanarch.loyaltyprograms.presentation.model.BonusAccountUiModel) r9
            java.lang.Long r9 = r9.mo52685a()
            long r10 = r7.mo75002a()
            if (r9 != 0) goto L_0x0143
            goto L_0x014d
        L_0x0143:
            long r12 = r9.longValue()
            int r9 = (r12 > r10 ? 1 : (r12 == r10 ? 0 : -1))
            if (r9 != 0) goto L_0x014d
            r9 = r1
            goto L_0x014e
        L_0x014d:
            r9 = r4
        L_0x014e:
            if (r9 == 0) goto L_0x012c
            r7 = r1
        L_0x0151:
            if (r7 == 0) goto L_0x0103
            r3.add(r6)
            goto L_0x0103
        L_0x0157:
            r18 = 3
            r19 = 0
            r17 = r3
            lt0.b r1 = lt0.C37153b.m109813b(r14, r15, r16, r17, r18, r19)
            r0.f90703D = r1
            r20.m111021Gw()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ot0.C37783u.m111042zw(boolean):void");
    }

    /* renamed from: Nc */
    public void mo91027Nc(List list) {
        C41536l.m120489i(list, "accounts");
        this.f90703D = C37153b.m109813b(this.f90703D, (BonusDepositAccountUiModel) null, (C37152a) null, list, 3, (Object) null);
        m111021Gw();
    }

    /* renamed from: U1 */
    public LiveData mo91031U1() {
        return this.f90700A;
    }

    /* renamed from: V */
    public void mo91028V(int i) {
        C37153b bVar = this.f90703D;
        MoneyBoxDataUiModel moneyBoxDataUiModel = this.f90702C;
        C37152a aVar = null;
        if (moneyBoxDataUiModel == null) {
            C41536l.m120506z("data");
            moneyBoxDataUiModel = null;
        }
        MoneyBoxTariffUiModel moneyBoxTariffUiModel = (MoneyBoxTariffUiModel) C41358y.m120010Z(moneyBoxDataUiModel.mo75101g(), i);
        if (moneyBoxTariffUiModel != null) {
            aVar = new C37152a(moneyBoxTariffUiModel, i);
        }
        this.f90703D = C37153b.m109813b(bVar, (BonusDepositAccountUiModel) null, aVar, (List) null, 5, (Object) null);
        m111021Gw();
    }

    /* renamed from: W5 */
    public LiveData mo91032W5() {
        return this.f90723u;
    }

    /* renamed from: Wm */
    public LiveData mo91033Wm() {
        return this.f90722t;
    }

    /* renamed from: ak */
    public LiveData mo91034ak() {
        return this.f90721s;
    }

    /* renamed from: c8 */
    public void mo91029c8(boolean z) {
        if (z) {
            this.f90704E.onNext(C41238w.f97225a);
        } else {
            this.f90705F.onNext(C41238w.f97225a);
        }
    }

    /* renamed from: e4 */
    public LiveData mo91035e4() {
        return this.f90727y;
    }

    /* renamed from: k */
    public LiveData mo91036k() {
        return this.f90701B;
    }

    /* renamed from: r8 */
    public void mo91030r8() {
        C1644x xVar = this.f90722t;
        MoneyBoxDataUiModel moneyBoxDataUiModel = this.f90702C;
        if (moneyBoxDataUiModel == null) {
            C41536l.m120506z("data");
            moneyBoxDataUiModel = null;
        }
        List<CasAccountUiModel> d = moneyBoxDataUiModel.mo75096d();
        ArrayList arrayList = new ArrayList(C41343r.m119925u(d, 10));
        for (CasAccountUiModel Fw : d) {
            arrayList.add(m111020Fw(Fw));
        }
        C37224b.m109965d(xVar, arrayList);
    }

    /* renamed from: to */
    public LiveData mo91037to() {
        return this.f90726x;
    }

    /* renamed from: xe */
    public LiveData mo91038xe() {
        return this.f90724v;
    }

    /* renamed from: xw */
    public final C37772p mo91039xw() {
        return this.f90717o;
    }

    /* renamed from: yw */
    public final C37775q mo91040yw() {
        return this.f90718p;
    }
}
