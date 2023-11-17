package p341ge.bog.mobilebank.giftcards.presentation.chooseamount;

import ai0.C19248a;
import androidx.lifecycle.C1644x;
import androidx.lifecycle.LiveData;
import bi0.C19387b;
import ci0.C19757a;
import ci0.C19758b;
import ci0.C19759c;
import ci0.C19760d;
import ci0.C19761e;
import g91.C32303f;
import hd1.C41204a;
import he1.C41238w;
import java.math.BigDecimal;
import java.util.List;
import jj0.C25459a;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import m41.C37224b;
import p341ge.bog.mobilebank.cleanarch.presentation.common.C21481a;
import ue1.C43075l;
import vh0.C29075a;
import wh0.C29398f;
import wh0.C29411r;
import xh0.C29788e;
import xh0.C29790g;
import xh0.C29793j;
import xh0.C29798n;
import xh0.C29799o;

/* renamed from: ge.bog.mobilebank.giftcards.presentation.chooseamount.GiftCardsChooseAmountViewModel$ViewModel */
public final class GiftCardsChooseAmountViewModel$ViewModel extends C21481a {

    /* renamed from: q */
    public static final C24092a f62458q = new C24092a((DefaultConstructorMarker) null);

    /* renamed from: d */
    private final C29398f f62459d;

    /* renamed from: e */
    private final C29411r f62460e;

    /* renamed from: f */
    private final C25459a f62461f;

    /* renamed from: g */
    private final C1644x f62462g;

    /* renamed from: h */
    private final C1644x f62463h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public final C1644x f62464i;

    /* renamed from: j */
    private final C1644x f62465j;

    /* renamed from: k */
    private final C1644x f62466k;

    /* renamed from: l */
    private final C1644x f62467l;

    /* renamed from: m */
    private final C1644x f62468m;

    /* renamed from: n */
    private final C1644x f62469n;

    /* renamed from: o */
    private int f62470o;

    /* renamed from: p */
    private String f62471p;

    /* renamed from: ge.bog.mobilebank.giftcards.presentation.chooseamount.GiftCardsChooseAmountViewModel$ViewModel$a */
    public static final class C24092a {
        private C24092a() {
        }

        public /* synthetic */ C24092a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: ge.bog.mobilebank.giftcards.presentation.chooseamount.GiftCardsChooseAmountViewModel$ViewModel$b */
    public /* synthetic */ class C24093b {

        /* renamed from: a */
        public static final /* synthetic */ int[] f62472a;

        /* JADX WARNING: Can't wrap try/catch for region: R(9:0|1|2|3|4|5|6|7|9) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
        static {
            /*
                xh0.e[] r0 = xh0.C29788e.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                xh0.e r1 = xh0.C29788e.MAX_CAPACITY     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                xh0.e r1 = xh0.C29788e.FIX_AMOUNTS     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                xh0.e r1 = xh0.C29788e.UNLIMITED     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                f62472a = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p341ge.bog.mobilebank.giftcards.presentation.chooseamount.GiftCardsChooseAmountViewModel$ViewModel.C24093b.<clinit>():void");
        }
    }

    /* renamed from: ge.bog.mobilebank.giftcards.presentation.chooseamount.GiftCardsChooseAmountViewModel$ViewModel$c */
    static final class C24094c extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ CharSequence f62473d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C24094c(CharSequence charSequence) {
            super(1);
            this.f62473d = charSequence;
        }

        /* renamed from: a */
        public final C19760d invoke(C19760d dVar) {
            C41536l.m120488h(dVar, "amountInputState");
            return C19760d.m65466b(dVar, false, String.valueOf(this.f62473d), 1, (Object) null);
        }
    }

    /* renamed from: ge.bog.mobilebank.giftcards.presentation.chooseamount.GiftCardsChooseAmountViewModel$ViewModel$d */
    static final class C24095d extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ GiftCardsChooseAmountViewModel$ViewModel f62474d;

        /* renamed from: e */
        final /* synthetic */ CharSequence f62475e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C24095d(GiftCardsChooseAmountViewModel$ViewModel giftCardsChooseAmountViewModel$ViewModel, CharSequence charSequence) {
            super(1);
            this.f62474d = giftCardsChooseAmountViewModel$ViewModel;
            this.f62475e = charSequence;
        }

        /* renamed from: a */
        public final C19758b invoke(C19758b bVar) {
            GiftCardsChooseAmountViewModel$ViewModel giftCardsChooseAmountViewModel$ViewModel = this.f62474d;
            return bVar.mo47961a(giftCardsChooseAmountViewModel$ViewModel.m77685hw(giftCardsChooseAmountViewModel$ViewModel.m77686iw(String.valueOf(this.f62475e))));
        }
    }

    /* renamed from: ge.bog.mobilebank.giftcards.presentation.chooseamount.GiftCardsChooseAmountViewModel$ViewModel$e */
    static final class C24096e extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ boolean f62476d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C24096e(boolean z) {
            super(1);
            this.f62476d = z;
        }

        /* renamed from: a */
        public final C19758b invoke(C19758b bVar) {
            return bVar.mo47961a(this.f62476d);
        }
    }

    /* renamed from: ge.bog.mobilebank.giftcards.presentation.chooseamount.GiftCardsChooseAmountViewModel$ViewModel$f */
    static final class C24097f extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ int f62477d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C24097f(int i) {
            super(1);
            this.f62477d = i;
        }

        /* renamed from: a */
        public final C19757a invoke(C19757a aVar) {
            return aVar.mo47956a(this.f62477d == -1);
        }
    }

    /* renamed from: ge.bog.mobilebank.giftcards.presentation.chooseamount.GiftCardsChooseAmountViewModel$ViewModel$g */
    static final class C24098g extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ Long f62478d;

        /* renamed from: e */
        final /* synthetic */ boolean f62479e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C24098g(Long l, boolean z) {
            super(1);
            this.f62478d = l;
            this.f62479e = z;
        }

        /* renamed from: a */
        public final C19761e invoke(C19761e eVar) {
            boolean z;
            C41536l.m120488h(eVar, "timePickerInputState");
            if (this.f62478d != null || !this.f62479e) {
                z = false;
            } else {
                z = true;
            }
            return C19761e.m65470b(eVar, false, (Long) null, (String) null, z, 7, (Object) null);
        }
    }

    /* renamed from: ge.bog.mobilebank.giftcards.presentation.chooseamount.GiftCardsChooseAmountViewModel$ViewModel$h */
    static final class C24099h extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ String f62480d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C24099h(String str) {
            super(1);
            this.f62480d = str;
        }

        /* renamed from: a */
        public final C19760d invoke(C19760d dVar) {
            C41536l.m120488h(dVar, "amountInputState");
            return C19760d.m65466b(dVar, false, this.f62480d, 1, (Object) null);
        }
    }

    /* renamed from: ge.bog.mobilebank.giftcards.presentation.chooseamount.GiftCardsChooseAmountViewModel$ViewModel$i */
    static final class C24100i extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ GiftCardsChooseAmountViewModel$ViewModel f62481d;

        /* renamed from: e */
        final /* synthetic */ String f62482e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C24100i(GiftCardsChooseAmountViewModel$ViewModel giftCardsChooseAmountViewModel$ViewModel, String str) {
            super(1);
            this.f62481d = giftCardsChooseAmountViewModel$ViewModel;
            this.f62482e = str;
        }

        /* renamed from: a */
        public final C19758b invoke(C19758b bVar) {
            return bVar.mo47961a(this.f62481d.m77685hw(this.f62482e));
        }
    }

    /* renamed from: ge.bog.mobilebank.giftcards.presentation.chooseamount.GiftCardsChooseAmountViewModel$ViewModel$j */
    static final class C24101j extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ Long f62483d;

        /* renamed from: e */
        final /* synthetic */ boolean f62484e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C24101j(Long l, boolean z) {
            super(1);
            this.f62483d = l;
            this.f62484e = z;
        }

        /* renamed from: a */
        public final C19761e invoke(C19761e eVar) {
            boolean z;
            C41536l.m120488h(eVar, "timePickerInputState");
            if (this.f62483d != null || !this.f62484e) {
                z = false;
            } else {
                z = true;
            }
            return C19761e.m65470b(eVar, false, (Long) null, (String) null, z, 7, (Object) null);
        }
    }

    /* renamed from: ge.bog.mobilebank.giftcards.presentation.chooseamount.GiftCardsChooseAmountViewModel$ViewModel$k */
    static final class C24102k extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ boolean f62485d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C24102k(boolean z) {
            super(1);
            this.f62485d = z;
        }

        /* renamed from: a */
        public final C19758b invoke(C19758b bVar) {
            return bVar.mo47961a(this.f62485d);
        }
    }

    /* renamed from: ge.bog.mobilebank.giftcards.presentation.chooseamount.GiftCardsChooseAmountViewModel$ViewModel$l */
    static final class C24103l extends C41537m implements C43075l {

        /* renamed from: d */
        public static final C24103l f62486d = new C24103l();

        C24103l() {
            super(1);
        }

        /* renamed from: a */
        public final C19757a invoke(C19757a aVar) {
            return aVar.mo47956a(false);
        }
    }

    /* renamed from: ge.bog.mobilebank.giftcards.presentation.chooseamount.GiftCardsChooseAmountViewModel$ViewModel$m */
    static final class C24104m extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ boolean f62487d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C24104m(boolean z) {
            super(1);
            this.f62487d = z;
        }

        /* renamed from: a */
        public final C19761e invoke(C19761e eVar) {
            C41536l.m120488h(eVar, "timePickerInputState");
            return C19761e.m65470b(eVar, this.f62487d, (Long) null, (String) null, false, 6, (Object) null);
        }
    }

    /* renamed from: ge.bog.mobilebank.giftcards.presentation.chooseamount.GiftCardsChooseAmountViewModel$ViewModel$n */
    static final class C24105n extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ GiftCardsChooseAmountViewModel$ViewModel f62488d;

        /* renamed from: ge.bog.mobilebank.giftcards.presentation.chooseamount.GiftCardsChooseAmountViewModel$ViewModel$n$a */
        static final class C24106a extends C41537m implements C43075l {

            /* renamed from: d */
            final /* synthetic */ long f62489d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C24106a(long j) {
                super(1);
                this.f62489d = j;
            }

            /* renamed from: a */
            public final C19761e invoke(C19761e eVar) {
                C41536l.m120488h(eVar, "timePickerInputState");
                return C19761e.m65470b(eVar, false, Long.valueOf(this.f62489d), "giftcard.application.amount.page.schedule.date.info", false, 1, (Object) null);
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C24105n(GiftCardsChooseAmountViewModel$ViewModel giftCardsChooseAmountViewModel$ViewModel) {
            super(1);
            this.f62488d = giftCardsChooseAmountViewModel$ViewModel;
        }

        /* renamed from: a */
        public final void mo61691a(long j) {
            GiftCardsChooseAmountViewModel$ViewModel giftCardsChooseAmountViewModel$ViewModel = this.f62488d;
            giftCardsChooseAmountViewModel$ViewModel.m77680Cw(giftCardsChooseAmountViewModel$ViewModel.f62464i, new C24106a(j));
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo61691a(((Number) obj).longValue());
            return C41238w.f97225a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public GiftCardsChooseAmountViewModel$ViewModel(C19248a aVar, C29398f fVar, C29411r rVar, C25459a aVar2) {
        super((C41204a) null, 1, (DefaultConstructorMarker) null);
        C29788e eVar;
        boolean z;
        C19759c cVar;
        List list;
        C29798n e;
        C29788e c;
        C19248a aVar3 = aVar;
        C29398f fVar2 = fVar;
        C29411r rVar2 = rVar;
        C25459a aVar4 = aVar2;
        C41536l.m120489i(aVar3, "fixedAmountsMapper");
        C41536l.m120489i(fVar2, "getDraftPurchaseModel");
        C41536l.m120489i(rVar2, "saveChooseAmountInfoUseCase");
        C41536l.m120489i(aVar4, "giftCardsAnimationsUiMapper");
        this.f62459d = fVar2;
        this.f62460e = rVar2;
        this.f62461f = aVar4;
        C29793j l = fVar.mo69239a().mo68947l();
        if (l != null) {
            eVar = l.mo70004c();
        } else {
            eVar = null;
        }
        if (eVar != C29788e.FIX_AMOUNTS) {
            z = true;
        } else {
            z = false;
        }
        this.f62462g = new C1644x(new C19760d(z, (String) null, 2, (DefaultConstructorMarker) null));
        C29793j l2 = fVar.mo69239a().mo68947l();
        if (l2 == null || (c = l2.mo70004c()) == null) {
            cVar = null;
        } else {
            cVar = m77687mw(c);
        }
        this.f62463h = new C1644x(cVar);
        this.f62464i = new C1644x(new C19761e(false, (Long) null, (String) null, false, 15, (DefaultConstructorMarker) null));
        this.f62465j = new C1644x();
        C29793j l3 = fVar.mo69239a().mo68947l();
        if (l3 == null || (e = l3.mo70006e()) == null) {
            list = null;
        } else {
            list = e.mo70038a();
        }
        this.f62466k = new C1644x(C19248a.m64691b(aVar3, list, (String) null, 2, (Object) null));
        C1644x xVar = new C1644x();
        this.f62467l = xVar;
        this.f62468m = new C1644x(new C19758b(false));
        this.f62469n = new C1644x(new C19757a(false, 1, (DefaultConstructorMarker) null));
        this.f62470o = -1;
        this.f62471p = "";
        C29075a g = fVar.mo69239a().mo68941g();
        if (g != null) {
            xVar.mo4823o(C25459a.m80628b(aVar2, g.mo68929b(), g.mo68931d(), (BigDecimal) null, 4, (Object) null));
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: Cw */
    public final void m77680Cw(C1644x xVar, C43075l lVar) {
        Object f = xVar.mo4814f();
        if (f != null) {
            xVar.mo4826r(lVar.invoke(f));
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: hw */
    public final boolean m77685hw(String str) {
        boolean z;
        BigDecimal bigDecimal;
        String a;
        String b;
        if (str.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return true;
        }
        C19759c cVar = (C19759c) mo61671lw().mo4814f();
        BigDecimal bigDecimal2 = null;
        if (cVar == null || (b = cVar.mo47967b()) == null) {
            bigDecimal = null;
        } else {
            bigDecimal = new BigDecimal(b);
        }
        C19759c cVar2 = (C19759c) mo61671lw().mo4814f();
        if (!(cVar2 == null || (a = cVar2.mo47966a()) == null)) {
            bigDecimal2 = new BigDecimal(a);
        }
        BigDecimal bigDecimal3 = new BigDecimal(C40440x.m117146P0(str).toString());
        if (bigDecimal3.compareTo(bigDecimal) < 0 || bigDecimal3.compareTo(bigDecimal2) > 0) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: private */
    /* renamed from: iw */
    public final String m77686iw(String str) {
        String obj = C40440x.m117146P0(str).toString();
        String h = C32303f.m95197h("GEL");
        C41536l.m120488h(h, "getCcyLogo(Consts.GEL)");
        return C40439w.m117103B(obj, h, "", false, 4, (Object) null);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0083, code lost:
        if (r0 == null) goto L_0x0085;
     */
    /* renamed from: mw */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final ci0.C19759c m77687mw(xh0.C29788e r5) {
        /*
            r4 = this;
            int[] r0 = p341ge.bog.mobilebank.giftcards.presentation.chooseamount.GiftCardsChooseAmountViewModel$ViewModel.C24093b.f62472a
            int r5 = r5.ordinal()
            r5 = r0[r5]
            r0 = 1
            r1 = 0
            if (r5 == r0) goto L_0x0049
            r0 = 2
            if (r5 == r0) goto L_0x0048
            r0 = 3
            if (r5 != r0) goto L_0x0042
            ci0.c r5 = new ci0.c
            wh0.f r0 = r4.f62459d
            vh0.d r0 = r0.mo69239a()
            xh0.j r0 = r0.mo68947l()
            if (r0 == 0) goto L_0x0025
            java.math.BigDecimal r0 = r0.mo70003b()
            goto L_0x0026
        L_0x0025:
            r0 = r1
        L_0x0026:
            java.lang.String r0 = java.lang.String.valueOf(r0)
            wh0.f r2 = r4.f62459d
            vh0.d r2 = r2.mo69239a()
            xh0.j r2 = r2.mo68947l()
            if (r2 == 0) goto L_0x003a
            java.math.BigDecimal r1 = r2.mo70002a()
        L_0x003a:
            java.lang.String r1 = java.lang.String.valueOf(r1)
            r5.<init>(r0, r1)
            return r5
        L_0x0042:
            kotlin.NoWhenBranchMatchedException r5 = new kotlin.NoWhenBranchMatchedException
            r5.<init>()
            throw r5
        L_0x0048:
            return r1
        L_0x0049:
            wh0.f r5 = r4.f62459d
            vh0.d r5 = r5.mo69239a()
            xh0.j r5 = r5.mo68947l()
            if (r5 == 0) goto L_0x005b
            java.math.BigDecimal r5 = r5.mo70002a()
            if (r5 != 0) goto L_0x005d
        L_0x005b:
            java.math.BigDecimal r5 = java.math.BigDecimal.ZERO
        L_0x005d:
            wh0.f r0 = r4.f62459d
            vh0.d r0 = r0.mo69239a()
            xh0.j r0 = r0.mo68947l()
            if (r0 == 0) goto L_0x0085
            xh0.n r0 = r0.mo70006e()
            if (r0 == 0) goto L_0x0085
            java.lang.Integer r0 = r0.mo70039b()
            if (r0 == 0) goto L_0x0085
            int r0 = r0.intValue()
            long r2 = (long) r0
            java.math.BigDecimal r0 = java.math.BigDecimal.valueOf(r2)
            java.lang.String r2 = "valueOf(this.toLong())"
            kotlin.jvm.internal.C41536l.m120488h(r0, r2)
            if (r0 != 0) goto L_0x0087
        L_0x0085:
            java.math.BigDecimal r0 = java.math.BigDecimal.ZERO
        L_0x0087:
            java.lang.Comparable r5 = ke1.C41507e.m120412k(r5, r0)
            java.math.BigDecimal r5 = (java.math.BigDecimal) r5
            ci0.c r0 = new ci0.c
            wh0.f r2 = r4.f62459d
            vh0.d r2 = r2.mo69239a()
            xh0.j r2 = r2.mo68947l()
            if (r2 == 0) goto L_0x009f
            java.math.BigDecimal r1 = r2.mo70003b()
        L_0x009f:
            java.lang.String r1 = java.lang.String.valueOf(r1)
            java.lang.String r5 = r5.toString()
            r0.<init>(r1, r5)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p341ge.bog.mobilebank.giftcards.presentation.chooseamount.GiftCardsChooseAmountViewModel$ViewModel.m77687mw(xh0.e):ci0.c");
    }

    /* renamed from: sw */
    private final void m77688sw(CharSequence charSequence) {
        m77680Cw(this.f62462g, new C24094c(charSequence));
        m77680Cw(this.f62468m, new C24095d(this, charSequence));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x003a, code lost:
        if (r1 == null) goto L_0x003c;
     */
    /* renamed from: tw */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void m77689tw(java.math.BigDecimal r4) {
        /*
            r3 = this;
            wh0.f r0 = r3.f62459d
            vh0.d r0 = r0.mo69239a()
            xh0.j r0 = r0.mo68947l()
            if (r0 == 0) goto L_0x0012
            java.math.BigDecimal r0 = r0.mo70002a()
            if (r0 != 0) goto L_0x0014
        L_0x0012:
            java.math.BigDecimal r0 = java.math.BigDecimal.ZERO
        L_0x0014:
            wh0.f r1 = r3.f62459d
            vh0.d r1 = r1.mo69239a()
            xh0.j r1 = r1.mo68947l()
            if (r1 == 0) goto L_0x003c
            xh0.n r1 = r1.mo70006e()
            if (r1 == 0) goto L_0x003c
            java.lang.Integer r1 = r1.mo70039b()
            if (r1 == 0) goto L_0x003c
            int r1 = r1.intValue()
            long r1 = (long) r1
            java.math.BigDecimal r1 = java.math.BigDecimal.valueOf(r1)
            java.lang.String r2 = "valueOf(this.toLong())"
            kotlin.jvm.internal.C41536l.m120488h(r1, r2)
            if (r1 != 0) goto L_0x003e
        L_0x003c:
            java.math.BigDecimal r1 = java.math.BigDecimal.ZERO
        L_0x003e:
            java.lang.Comparable r0 = ke1.C41507e.m120412k(r0, r1)
            java.math.BigDecimal r0 = (java.math.BigDecimal) r0
            wh0.f r1 = r3.f62459d
            vh0.d r1 = r1.mo69239a()
            xh0.j r1 = r1.mo68947l()
            if (r1 == 0) goto L_0x0055
            java.math.BigDecimal r1 = r1.mo70003b()
            goto L_0x0056
        L_0x0055:
            r1 = 0
        L_0x0056:
            int r1 = r4.compareTo(r1)
            if (r1 < 0) goto L_0x0065
            int r4 = r4.compareTo(r0)
            if (r4 <= 0) goto L_0x0063
            goto L_0x0065
        L_0x0063:
            r4 = 0
            goto L_0x0066
        L_0x0065:
            r4 = 1
        L_0x0066:
            androidx.lifecycle.x r0 = r3.f62468m
            ge.bog.mobilebank.giftcards.presentation.chooseamount.GiftCardsChooseAmountViewModel$ViewModel$e r1 = new ge.bog.mobilebank.giftcards.presentation.chooseamount.GiftCardsChooseAmountViewModel$ViewModel$e
            r1.<init>(r4)
            r3.m77680Cw(r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p341ge.bog.mobilebank.giftcards.presentation.chooseamount.GiftCardsChooseAmountViewModel$ViewModel.m77689tw(java.math.BigDecimal):void");
    }

    /* renamed from: uw */
    private final void m77690uw(String str, boolean z, int i) {
        Long l;
        C29790g gVar;
        C29799o f;
        C29790g gVar2;
        String str2;
        C29799o f2;
        boolean z2 = z;
        int i2 = i;
        String iw = m77686iw(str);
        C19761e eVar = (C19761e) this.f62464i.mo4814f();
        String str3 = null;
        if (eVar != null) {
            l = eVar.mo47978c();
        } else {
            l = null;
        }
        m77680Cw(this.f62469n, new C24097f(i2));
        m77680Cw(this.f62464i, new C24098g(l, z2));
        if (i2 != -1 && !z2) {
            C29411r rVar = this.f62460e;
            String obj = C40440x.m117146P0(iw).toString();
            C29793j l2 = this.f62459d.mo69239a().mo68947l();
            if (l2 != null) {
                gVar2 = l2.mo70005d();
            } else {
                gVar2 = null;
            }
            C29793j l3 = this.f62459d.mo69239a().mo68947l();
            if (l3 == null || (f2 = l3.mo70008f()) == null) {
                str2 = null;
            } else {
                str2 = f2.mo70043a();
            }
            C29411r.m89500b(rVar, obj, false, (Long) null, gVar2, String.valueOf(str2), 4, (Object) null);
            this.f62470o = -1;
            C37224b.m109966e(this.f62465j, C19387b.C19390b.f53618a);
        }
        if (i2 != -1 && z2 && l != null) {
            C29411r rVar2 = this.f62460e;
            String obj2 = C40440x.m117146P0(iw).toString();
            C29793j l4 = this.f62459d.mo69239a().mo68947l();
            if (l4 != null) {
                gVar = l4.mo70005d();
            } else {
                gVar = null;
            }
            C29793j l5 = this.f62459d.mo69239a().mo68947l();
            if (!(l5 == null || (f = l5.mo70008f()) == null)) {
                str3 = f.mo70043a();
            }
            rVar2.mo69251a(obj2, true, l, gVar, String.valueOf(str3));
            this.f62470o = -1;
            C37224b.m109966e(this.f62465j, C19387b.C19390b.f53618a);
        }
    }

    /* renamed from: vw */
    private final void m77691vw(boolean z, String str) {
        Long l;
        C29790g gVar;
        C29799o f;
        C29790g gVar2;
        String str2;
        C29799o f2;
        boolean z2 = z;
        String str3 = str;
        String iw = m77686iw(str3);
        C19761e eVar = (C19761e) this.f62464i.mo4814f();
        String str4 = null;
        if (eVar != null) {
            l = eVar.mo47978c();
        } else {
            l = null;
        }
        m77680Cw(this.f62462g, new C24099h(str3));
        m77680Cw(this.f62468m, new C24100i(this, iw));
        m77680Cw(this.f62464i, new C24101j(l, z2));
        if (!m77685hw(iw) && !z2) {
            C29411r rVar = this.f62460e;
            String obj = C40440x.m117146P0(iw).toString();
            C29793j l2 = this.f62459d.mo69239a().mo68947l();
            if (l2 != null) {
                gVar2 = l2.mo70005d();
            } else {
                gVar2 = null;
            }
            C29793j l3 = this.f62459d.mo69239a().mo68947l();
            if (l3 == null || (f2 = l3.mo70008f()) == null) {
                str2 = null;
            } else {
                str2 = f2.mo70043a();
            }
            C29411r.m89500b(rVar, obj, false, (Long) null, gVar2, String.valueOf(str2), 4, (Object) null);
            C37224b.m109966e(this.f62465j, C19387b.C19390b.f53618a);
        }
        if (!m77685hw(iw) && z2 && l != null) {
            C29411r rVar2 = this.f62460e;
            String obj2 = C40440x.m117146P0(iw).toString();
            C29793j l4 = this.f62459d.mo69239a().mo68947l();
            if (l4 != null) {
                gVar = l4.mo70005d();
            } else {
                gVar = null;
            }
            C29793j l5 = this.f62459d.mo69239a().mo68947l();
            if (!(l5 == null || (f = l5.mo70008f()) == null)) {
                str4 = f.mo70043a();
            }
            rVar2.mo69251a(obj2, true, l, gVar, String.valueOf(str4));
            C37224b.m109966e(this.f62465j, C19387b.C19390b.f53618a);
        }
    }

    /* renamed from: ww */
    private final void m77692ww(BigDecimal bigDecimal) {
        BigDecimal bigDecimal2;
        boolean z;
        C29793j l = this.f62459d.mo69239a().mo68947l();
        BigDecimal bigDecimal3 = null;
        if (l != null) {
            bigDecimal2 = l.mo70003b();
        } else {
            bigDecimal2 = null;
        }
        if (bigDecimal.compareTo(bigDecimal2) >= 0) {
            C29793j l2 = this.f62459d.mo69239a().mo68947l();
            if (l2 != null) {
                bigDecimal3 = l2.mo70002a();
            }
            if (bigDecimal.compareTo(bigDecimal3) <= 0) {
                z = false;
                m77680Cw(this.f62468m, new C24102k(z));
            }
        }
        z = true;
        m77680Cw(this.f62468m, new C24102k(z));
    }

    /* renamed from: Aw */
    public void mo61667Aw(boolean z) {
        m77680Cw(this.f62464i, new C24104m(z));
    }

    /* renamed from: Bw */
    public void mo61668Bw() {
        Long l;
        long j;
        C29799o f;
        Long b;
        C1644x xVar = this.f62465j;
        C19761e eVar = (C19761e) this.f62464i.mo4814f();
        if (eVar != null) {
            l = eVar.mo47978c();
        } else {
            l = null;
        }
        C29793j l2 = this.f62459d.mo69239a().mo68947l();
        if (l2 == null || (f = l2.mo70008f()) == null || (b = f.mo70044b()) == null) {
            j = -1;
        } else {
            j = b.longValue();
        }
        C37224b.m109966e(xVar, new C19387b.C19388a(l, j, new C24105n(this)));
    }

    /* renamed from: jw */
    public LiveData mo61669jw() {
        return this.f62469n;
    }

    /* renamed from: kw */
    public LiveData mo61670kw() {
        return this.f62468m;
    }

    /* renamed from: lw */
    public LiveData mo61671lw() {
        return this.f62463h;
    }

    /* renamed from: nw */
    public LiveData mo61672nw() {
        return this.f62462g;
    }

    /* renamed from: ow */
    public LiveData mo61673ow() {
        return this.f62467l;
    }

    /* renamed from: pw */
    public LiveData mo61674pw() {
        return this.f62465j;
    }

    /* renamed from: qw */
    public LiveData mo61675qw() {
        return this.f62466k;
    }

    /* renamed from: rw */
    public LiveData mo61676rw() {
        return this.f62464i;
    }

    /* renamed from: xw */
    public void mo61677xw(String str) {
        boolean z;
        C29788e eVar;
        int i;
        C41536l.m120489i(str, "amount");
        String U0 = C40445z.m117190U0(str, 2);
        if (U0.length() > 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            BigDecimal bigDecimal = new BigDecimal(U0);
            C29793j l = this.f62459d.mo69239a().mo68947l();
            if (l != null) {
                eVar = l.mo70004c();
            } else {
                eVar = null;
            }
            if (eVar == null) {
                i = -1;
            } else {
                i = C24093b.f62472a[eVar.ordinal()];
            }
            if (i == 1) {
                m77689tw(bigDecimal);
            } else if (i == 3) {
                m77692ww(bigDecimal);
            }
        }
    }

    /* renamed from: yw */
    public void mo61678yw(CharSequence charSequence, int i) {
        C29788e eVar;
        int i2;
        m77680Cw(this.f62469n, C24103l.f62486d);
        this.f62471p = String.valueOf(charSequence);
        this.f62470o = i;
        C29793j l = this.f62459d.mo69239a().mo68947l();
        if (l != null) {
            eVar = l.mo70004c();
        } else {
            eVar = null;
        }
        if (eVar == null) {
            i2 = -1;
        } else {
            i2 = C24093b.f62472a[eVar.ordinal()];
        }
        if (i2 == 1) {
            m77688sw(charSequence);
        } else if (i2 == 3) {
            m77688sw(charSequence);
        }
    }

    /* renamed from: zw */
    public void mo61679zw(boolean z, String str) {
        C29788e eVar;
        int i;
        C41536l.m120489i(str, "currentAmount");
        C29793j l = this.f62459d.mo69239a().mo68947l();
        if (l != null) {
            eVar = l.mo70004c();
        } else {
            eVar = null;
        }
        if (eVar == null) {
            i = -1;
        } else {
            i = C24093b.f62472a[eVar.ordinal()];
        }
        if (i == 1) {
            m77691vw(z, str);
        } else if (i == 2) {
            m77690uw(this.f62471p, z, this.f62470o);
        } else if (i == 3) {
            m77691vw(z, str);
        }
    }
}
