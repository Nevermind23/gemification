package kr0;

import af1.C40303i;
import androidx.lifecycle.C1644x;
import androidx.lifecycle.LiveData;
import c41.C31270e;
import de1.C40640a;
import dr0.C31578a;
import dr0.C31579b;
import dr0.C31581d;
import dr0.C31583e;
import ed0.C20217b;
import ed1.C40749p;
import ed1.C40754t;
import ee1.C40767b;
import er0.C31768a;
import er0.C31769b;
import fd0.C20463a;
import g91.C32343x;
import gd1.C40992a;
import hd1.C41204a;
import he1.C41224m;
import he1.C41238w;
import ir0.C36491a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import jr0.C36783a;
import jr0.C36786b;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.C41520a0;
import kotlin.jvm.internal.C41535k;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.C41539o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.properties.C41551a;
import kotlin.properties.C41553c;
import kotlin.properties.C41555e;
import m41.C37224b;
import o31.C37591c;
import p341ge.bog.mobilebank.cleanarch.domain.offer.model.OfferInfo;
import p341ge.bog.mobilebank.cleanarch.domain.offer.model.OfferProductCode;
import p341ge.bog.mobilebank.cleanarch.presentation.common.C21481a;
import p341ge.bog.mobilebank.loanoffers.presentation.model.securedloan.PropertyInfoTextData;
import p341ge.bog.mobilebank.model.Client;
import p341ge.bog.mobilebank.model.usrinfo.UserInfo;
import ue1.C43064a;
import ue1.C43075l;

/* renamed from: kr0.m */
public final class C36946m extends C21481a implements C36935c, C36939f {

    /* renamed from: G */
    static final /* synthetic */ C40303i[] f89065G;
    /* access modifiers changed from: private */

    /* renamed from: A */
    public final C40767b f89066A;
    /* access modifiers changed from: private */

    /* renamed from: B */
    public final C40767b f89067B;
    /* access modifiers changed from: private */

    /* renamed from: C */
    public final C40767b f89068C;

    /* renamed from: D */
    private final C40767b f89069D;

    /* renamed from: E */
    private final C40767b f89070E;
    /* access modifiers changed from: private */

    /* renamed from: F */
    public final ArrayList f89071F;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final C31581d f89072d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public final C20217b f89073e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public final C31579b f89074f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public final C31578a f89075g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public final C31583e f89076h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public final C36491a f89077i;

    /* renamed from: j */
    private final Client f89078j;

    /* renamed from: k */
    private final C36935c f89079k = this;

    /* renamed from: l */
    private final C36939f f89080l = this;

    /* renamed from: m */
    private final C1644x f89081m = new C1644x();
    /* access modifiers changed from: private */

    /* renamed from: n */
    public final C1644x f89082n;

    /* renamed from: o */
    private final C1644x f89083o;

    /* renamed from: p */
    private final C1644x f89084p;

    /* renamed from: q */
    private final C1644x f89085q;

    /* renamed from: r */
    private final C1644x f89086r;

    /* renamed from: s */
    private final C1644x f89087s;

    /* renamed from: t */
    private final C1644x f89088t;

    /* renamed from: u */
    private final C1644x f89089u;

    /* renamed from: v */
    private final C1644x f89090v;
    /* access modifiers changed from: private */

    /* renamed from: w */
    public final C1644x f89091w;

    /* renamed from: x */
    private final C41555e f89092x;
    /* access modifiers changed from: private */

    /* renamed from: y */
    public OfferInfo f89093y;

    /* renamed from: z */
    private final C41555e f89094z;

    /* renamed from: kr0.m$a */
    static final class C36947a extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C36946m f89095d;

        /* renamed from: e */
        final /* synthetic */ String f89096e;

        /* renamed from: f */
        final /* synthetic */ String f89097f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C36947a(C36946m mVar, String str, String str2) {
            super(1);
            this.f89095d = mVar;
            this.f89096e = str;
            this.f89097f = str2;
        }

        /* renamed from: a */
        public final void mo89908a(Integer num) {
            C40767b nw = this.f89095d.f89067B;
            String str = this.f89096e;
            String str2 = this.f89097f;
            C41536l.m120488h(num, "rc");
            nw.onNext(new C36938e(str, str2, num.intValue()));
            this.f89095d.f89068C.onNext(num);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo89908a((Integer) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: kr0.m$b */
    public /* synthetic */ class C36948b {

        /* renamed from: a */
        public static final /* synthetic */ int[] f89098a;

        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        static {
            /*
                kr0.d[] r0 = kr0.C36937d.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                kr0.d r1 = kr0.C36937d.MY_REAL_ESTATE     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                kr0.d r1 = kr0.C36937d.OTHER_REAL_ESTATE     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                f89098a = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: kr0.C36946m.C36948b.<clinit>():void");
        }
    }

    /* renamed from: kr0.m$c */
    public static final class C36949c extends C41553c {

        /* renamed from: a */
        final /* synthetic */ C36946m f89099a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C36949c(Object obj, C36946m mVar) {
            super(obj);
            this.f89099a = mVar;
        }

        /* access modifiers changed from: protected */
        public void afterChange(C40303i iVar, Object obj, Object obj2) {
            C41536l.m120489i(iVar, "property");
            C36940g gVar = (C36940g) obj;
            this.f89099a.f89082n.mo4823o((C36940g) obj2);
            this.f89099a.m109401Aw();
        }
    }

    /* renamed from: kr0.m$d */
    static final class C36950d extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C36946m f89100d;

        /* renamed from: kr0.m$d$a */
        static final class C36951a extends C41537m implements C43075l {

            /* renamed from: d */
            final /* synthetic */ C36946m f89101d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C36951a(C36946m mVar) {
                super(1);
                this.f89101d = mVar;
            }

            /* renamed from: a */
            public final C36783a invoke(C31768a aVar) {
                C41536l.m120489i(aVar, "it");
                C36783a.C36785b f = C36783a.C36785b.m108998f(this.f89101d.f89077i.mo89289a(aVar), 0, (String) null, (String) null, (String) null, true, 15, (Object) null);
                C41536l.m120487g(f, "null cannot be cast to non-null type ge.bog.mobilebank.loanoffers.presentation.model.securedloan.LoanPropertyListItem");
                return f;
            }
        }

        /* renamed from: kr0.m$d$b */
        static final class C36952b extends C41537m implements C43075l {

            /* renamed from: d */
            final /* synthetic */ C36946m f89102d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C36952b(C36946m mVar) {
                super(1);
                this.f89102d = mVar;
            }

            /* renamed from: a */
            public final void mo89911a(C36783a aVar) {
                this.f89102d.m109403Dw().mo89898d().add(aVar);
                this.f89102d.f89082n.mo4823o(this.f89102d.m109403Dw());
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                mo89911a((C36783a) obj);
                return C41238w.f97225a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C36950d(C36946m mVar) {
            super(1);
            this.f89100d = mVar;
        }

        /* access modifiers changed from: private */
        /* renamed from: d */
        public static final C36783a m109463d(C43075l lVar, Object obj) {
            C41536l.m120489i(lVar, "$tmp0");
            return (C36783a) lVar.invoke(obj);
        }

        /* access modifiers changed from: private */
        /* renamed from: e */
        public static final void m109464e(C43075l lVar, Object obj) {
            C41536l.m120489i(lVar, "$tmp0");
            lVar.invoke(obj);
        }

        /* renamed from: c */
        public final C40754t invoke(String str) {
            C41536l.m120489i(str, "it");
            C40749p o0 = this.f89100d.f89075g.mo72001a(str).mo95062A(new C36963n(new C36951a(this.f89100d))).mo95084m(new C36964o(new C36952b(this.f89100d))).mo95075O().mo94987J0(C40640a.m117458b()).mo95027o0(C40992a.m118827a());
            C41536l.m120488h(o0, "private fun subscribeToC…ndToLifecycle()\n        }");
            return C31270e.m92879h(o0, -1);
        }
    }

    /* renamed from: kr0.m$e */
    static final class C36953e extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C36946m f89103d;

        /* renamed from: kr0.m$e$a */
        static final class C36954a extends C41537m implements C43075l {

            /* renamed from: d */
            final /* synthetic */ C36946m f89104d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C36954a(C36946m mVar) {
                super(1);
                this.f89104d = mVar;
            }

            public final List invoke(List list) {
                C41536l.m120489i(list, "it");
                C36491a uw = this.f89104d.f89077i;
                ArrayList arrayList = new ArrayList(C41343r.m119925u(list, 10));
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(uw.mo89290b((C20463a) it.next()));
                }
                return arrayList;
            }
        }

        /* renamed from: kr0.m$e$b */
        /* synthetic */ class C36955b extends C41535k implements C43075l {
            C36955b(Object obj) {
                super(1, obj, C32343x.class, "clearAndAdd", "clearAndAdd(Ljava/util/Collection;Ljava/util/Collection;)V", 1);
            }

            /* renamed from: b */
            public final void mo89914b(Collection collection) {
                C41536l.m120489i(collection, "p0");
                C32343x.m95475p((Collection) this.receiver, collection);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                mo89914b((Collection) obj);
                return C41238w.f97225a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C36953e(C36946m mVar) {
            super(1);
            this.f89103d = mVar;
        }

        /* access modifiers changed from: private */
        /* renamed from: d */
        public static final void m109470d(C43075l lVar, Object obj) {
            C41536l.m120489i(lVar, "$tmp0");
            lVar.invoke(obj);
        }

        /* access modifiers changed from: private */
        public static final List invoke$lambda$0(C43075l lVar, Object obj) {
            C41536l.m120489i(lVar, "$tmp0");
            return (List) lVar.invoke(obj);
        }

        /* renamed from: c */
        public final C40754t invoke(Integer num) {
            C41536l.m120489i(num, "rc");
            C40749p O = this.f89103d.f89073e.mo48650b("LOAN_PURPOSE_TYPES").mo95062A(new C36965p(new C36954a(this.f89103d))).mo95084m(new C36966q(new C36955b(this.f89103d.f89071F))).mo95075O();
            C41536l.m120488h(O, "private fun subscribeToG…ndToLifecycle()\n        }");
            return C31270e.m92879h(O, num.intValue());
        }
    }

    /* renamed from: kr0.m$f */
    static final class C36956f extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C36946m f89105d;

        /* renamed from: kr0.m$f$a */
        static final class C36957a extends C41537m implements C43075l {

            /* renamed from: d */
            final /* synthetic */ C36946m f89106d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C36957a(C36946m mVar) {
                super(1);
                this.f89106d = mVar;
            }

            public final List invoke(List list) {
                C41536l.m120489i(list, "it");
                C36946m mVar = this.f89106d;
                ArrayList arrayList = new ArrayList(C41343r.m119925u(list, 10));
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(mVar.f89077i.mo89291c((C31769b) it.next(), mVar.m109404Ew()));
                }
                return arrayList;
            }
        }

        /* renamed from: kr0.m$f$b */
        static final class C36958b extends C41537m implements C43075l {

            /* renamed from: d */
            final /* synthetic */ C36946m f89107d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C36958b(C36946m mVar) {
                super(1);
                this.f89107d = mVar;
            }

            /* renamed from: a */
            public final void mo89917a(List list) {
                C36946m mVar = this.f89107d;
                mVar.m109406Hw(C36940g.m109393b(mVar.m109403Dw(), 0, new ArrayList(list), (ArrayList) null, 5, (Object) null));
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                mo89917a((List) obj);
                return C41238w.f97225a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C36956f(C36946m mVar) {
            super(1);
            this.f89105d = mVar;
        }

        /* access modifiers changed from: private */
        /* renamed from: d */
        public static final void m109475d(C43075l lVar, Object obj) {
            C41536l.m120489i(lVar, "$tmp0");
            lVar.invoke(obj);
        }

        /* access modifiers changed from: private */
        public static final List invoke$lambda$0(C43075l lVar, Object obj) {
            C41536l.m120489i(lVar, "$tmp0");
            return (List) lVar.invoke(obj);
        }

        /* renamed from: c */
        public final C40754t invoke(Integer num) {
            C41536l.m120489i(num, "rc");
            C40749p O = this.f89105d.f89074f.mo72002a().mo95062A(new C36967r(new C36957a(this.f89105d))).mo95084m(new C36968s(new C36958b(this.f89105d))).mo95075O();
            C41536l.m120488h(O, "private fun subscribeToG…ndToLifecycle()\n        }");
            return C31270e.m92879h(O, num.intValue());
        }
    }

    /* renamed from: kr0.m$g */
    static final class C36959g extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C36946m f89108d;

        /* renamed from: kr0.m$g$a */
        static final class C36960a extends C41537m implements C43075l {

            /* renamed from: d */
            final /* synthetic */ C36946m f89109d;

            /* renamed from: e */
            final /* synthetic */ C36938e f89110e;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C36960a(C36946m mVar, C36938e eVar) {
                super(1);
                this.f89109d = mVar;
                this.f89110e = eVar;
            }

            /* renamed from: a */
            public final void mo89919a(OfferInfo offerInfo) {
                if (C41536l.m120484d(offerInfo.getProductCode(), OfferProductCode.C21019ML.f56477f)) {
                    this.f89109d.f89066A.onNext(Integer.valueOf(this.f89110e.mo89881c()));
                }
                this.f89109d.f89093y = offerInfo;
                this.f89109d.m109401Aw();
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                mo89919a((OfferInfo) obj);
                return C41238w.f97225a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C36959g(C36946m mVar) {
            super(1);
            this.f89108d = mVar;
        }

        /* access modifiers changed from: private */
        /* renamed from: c */
        public static final void m109479c(C43075l lVar, Object obj) {
            C41536l.m120489i(lVar, "$tmp0");
            lVar.invoke(obj);
        }

        /* renamed from: b */
        public final C40754t invoke(C36938e eVar) {
            C41536l.m120489i(eVar, "request");
            C40749p O = this.f89108d.f89072d.mo72003b(eVar.mo89880b(), eVar.mo89879a()).mo95084m(new C36969t(new C36960a(this.f89108d, eVar))).mo95075O();
            C41536l.m120488h(O, "private fun subscribeToO…ndToLifecycle()\n        }");
            return C31270e.m92879h(O, eVar.mo89881c());
        }
    }

    /* renamed from: kr0.m$h */
    static final class C36961h extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C36946m f89111d;

        /* renamed from: kr0.m$h$a */
        static final class C36962a extends C41537m implements C43075l {

            /* renamed from: d */
            public static final C36962a f89112d = new C36962a();

            C36962a() {
                super(1);
            }

            /* renamed from: a */
            public final CharSequence invoke(C36783a aVar) {
                C41536l.m120489i(aVar, "it");
                String b = aVar.mo89662b();
                if (b != null) {
                    return b;
                }
                return "";
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C36961h(C36946m mVar) {
            super(1);
            this.f89111d = mVar;
        }

        /* access modifiers changed from: private */
        /* renamed from: c */
        public static final void m109483c(C36946m mVar) {
            C41536l.m120489i(mVar, "this$0");
            C37224b.m109962a(mVar.f89091w);
        }

        /* renamed from: b */
        public final C40754t invoke(C36940g gVar) {
            OfferProductCode offerProductCode;
            C41224m mVar;
            String str;
            String str2;
            C41536l.m120489i(gVar, "it");
            OfferInfo sw = this.f89111d.f89093y;
            String str3 = null;
            if (sw != null) {
                offerProductCode = sw.getProductCode();
            } else {
                offerProductCode = null;
            }
            if (C41536l.m120484d(offerProductCode, OfferProductCode.C21019ML.f56477f)) {
                mVar = C36933a.f89049b;
            } else {
                mVar = C36933a.f89050c;
            }
            String str4 = (String) mVar.mo95675a();
            String str5 = (String) mVar.mo95676b();
            C31583e vw = this.f89111d.f89076h;
            OfferInfo sw2 = this.f89111d.f89093y;
            if (sw2 != null) {
                str = sw2.getOfferAmount();
            } else {
                str = null;
            }
            String valueOf = String.valueOf(str);
            OfferInfo sw3 = this.f89111d.f89093y;
            if (sw3 != null) {
                str2 = sw3.getOfferCcy();
            } else {
                str2 = null;
            }
            String valueOf2 = String.valueOf(str2);
            String g0 = C41358y.m120017g0(this.f89111d.m109403Dw().mo89901f(), ",", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, C36962a.f89112d, 30, (Object) null);
            C36786b bVar = (C36786b) C41358y.m120010Z(this.f89111d.f89071F, this.f89111d.m109403Dw().mo89899e());
            if (bVar != null) {
                str3 = bVar.mo89675b();
            }
            C40749p o0 = vw.mo72005a("CREDIT_LEAD", str4, str5, valueOf, valueOf2, g0, str3).mo94902o(new C36970u(this.f89111d)).mo94897f(C40749p.m118043h0(C41238w.f97225a)).mo94987J0(C40640a.m117458b()).mo95027o0(C40992a.m118827a());
            C41536l.m120488h(o0, "sendApplication(\n       …dSchedulers.mainThread())");
            return C31270e.m92879h(o0, -1);
        }
    }

    static {
        Class<C36946m> cls = C36946m.class;
        f89065G = new C40303i[]{C41520a0.m120439e(new C41539o(cls, "loanInput", "getLoanInput()Lge/bog/mobilebank/loanoffers/presentation/viewmodel/SecuredLoanViewModel$SecuredLoanInput;", 0)), C41520a0.m120439e(new C41539o(cls, "enableSendButton", "getEnableSendButton()Z", 0))};
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C36946m(C31581d dVar, C20217b bVar, C31579b bVar2, C31578a aVar, C31583e eVar, C36491a aVar2, Client client, String str, String str2) {
        super((C41204a) null, 1, (DefaultConstructorMarker) null);
        C31578a aVar3 = aVar;
        C31583e eVar2 = eVar;
        C36491a aVar4 = aVar2;
        Client client2 = client;
        String str3 = str;
        String str4 = str2;
        C41536l.m120489i(dVar, "getOfferInfo");
        C41536l.m120489i(bVar, "getLookup");
        C41536l.m120489i(bVar2, "getProperties");
        C41536l.m120489i(aVar3, "getExternalProperty");
        C41536l.m120489i(eVar2, "sendApplication");
        C41536l.m120489i(aVar4, "securedLoansMapper");
        C41536l.m120489i(client2, "client");
        C41536l.m120489i(str3, "productType");
        C41536l.m120489i(str4, "productCode");
        this.f89072d = dVar;
        this.f89073e = bVar;
        this.f89074f = bVar2;
        this.f89075g = aVar3;
        this.f89076h = eVar2;
        this.f89077i = aVar4;
        this.f89078j = client2;
        C1644x xVar = new C1644x();
        this.f89082n = xVar;
        this.f89083o = new C1644x();
        C1644x xVar2 = new C1644x();
        this.f89084p = xVar2;
        this.f89085q = new C1644x();
        this.f89086r = new C1644x();
        this.f89087s = new C1644x();
        this.f89088t = new C1644x();
        this.f89089u = new C1644x();
        this.f89090v = new C1644x();
        this.f89091w = new C1644x();
        C41551a aVar5 = C41551a.f97718a;
        this.f89092x = new C36949c(new C36940g(0, (ArrayList) null, (ArrayList) null, 7, (DefaultConstructorMarker) null), this);
        this.f89094z = C37591c.m110557b(C37591c.f90334a, Boolean.FALSE, xVar2, (C43075l) null, 4, (Object) null);
        C40767b h1 = C40767b.m118210h1();
        C41536l.m120488h(h1, "create<Int>()");
        this.f89066A = h1;
        C40767b h12 = C40767b.m118210h1();
        C41536l.m120488h(h12, "create<OfferInfoRequest>()");
        this.f89067B = h12;
        C40767b h13 = C40767b.m118210h1();
        C41536l.m120488h(h13, "create<Int>()");
        this.f89068C = h13;
        C40767b h14 = C40767b.m118210h1();
        C41536l.m120488h(h14, "create<String>()");
        this.f89069D = h14;
        C40767b h15 = C40767b.m118210h1();
        C41536l.m120488h(h15, "create<SecuredLoanInput>()");
        this.f89070E = h15;
        this.f89071F = new ArrayList();
        m109405Gw(false);
        C40749p l0 = C40749p.m118047l0(onInit(), onRefresh());
        C41536l.m120488h(l0, "merge(onInit(), onRefresh())");
        C32343x.m95487t(l0, (C43064a) null, (C43075l) null, new C36947a(this, str3, str4), 3, (Object) null);
        m109409Kw();
        m109413Ow();
        m109411Mw();
        m109407Iw();
        m109415Qw();
        xVar.mo4823o(m109403Dw());
    }

    /* access modifiers changed from: private */
    /* renamed from: Aw */
    public final void m109401Aw() {
        OfferInfo offerInfo = this.f89093y;
        m109405Gw(!C41536l.m120484d(offerInfo != null ? offerInfo.getProductCode() : null, OfferProductCode.C21019ML.f56477f) || m109403Dw().mo89903h());
    }

    /* renamed from: Bw */
    private final void m109402Bw(ArrayList arrayList, C36783a aVar, boolean z) {
        Iterator it = arrayList.iterator();
        int i = 0;
        while (true) {
            if (!it.hasNext()) {
                i = -1;
                break;
            }
            C36783a aVar2 = (C36783a) it.next();
            boolean z2 = true;
            if (!(aVar instanceof C36783a.C36785b) || !(aVar2 instanceof C36783a.C36785b) ? !(aVar instanceof C36783a.C36784a) || !(aVar2 instanceof C36783a.C36784a) : ((C36783a.C36785b) aVar).mo89671g() != ((C36783a.C36785b) aVar2).mo89671g()) {
                z2 = false;
            }
            if (z2) {
                break;
            }
            i++;
        }
        if (i != -1) {
            Object obj = arrayList.get(i);
            C41536l.m120488h(obj, "properties[index]");
            C36783a aVar3 = (C36783a) obj;
            if (aVar3 instanceof C36783a.C36784a) {
                arrayList.set(i, ((C36783a.C36784a) aVar3).mo89665e(z));
            } else if (aVar3 instanceof C36783a.C36785b) {
                arrayList.set(i, C36783a.C36785b.m108998f((C36783a.C36785b) aVar3, 0, (String) null, (String) null, (String) null, z, 15, (Object) null));
            }
            this.f89082n.mo4823o(m109403Dw());
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: Dw */
    public final C36940g m109403Dw() {
        return (C36940g) this.f89092x.getValue(this, f89065G[0]);
    }

    /* access modifiers changed from: private */
    /* renamed from: Ew */
    public final String m109404Ew() {
        String str;
        String str2;
        String language = Locale.getDefault().getLanguage();
        C41536l.m120488h(language, "getDefault().language");
        Locale locale = Locale.getDefault();
        C41536l.m120488h(locale, "getDefault()");
        String lowerCase = language.toLowerCase(locale);
        C41536l.m120488h(lowerCase, "this as java.lang.String).toLowerCase(locale)");
        boolean M = C40440x.m117139M(lowerCase, "ka", false, 2, (Object) null);
        UserInfo client = this.f89078j.getUserInfo().getClient();
        if (M) {
            str = client.firstName;
        } else {
            str = client.firstNameInt;
        }
        if (M) {
            str2 = client.lastName;
        } else {
            str2 = client.lastNameInt;
        }
        return str + " " + str2;
    }

    /* renamed from: Gw */
    private final void m109405Gw(boolean z) {
        this.f89094z.setValue(this, f89065G[1], Boolean.valueOf(z));
    }

    /* access modifiers changed from: private */
    /* renamed from: Hw */
    public final void m109406Hw(C36940g gVar) {
        this.f89092x.setValue(this, f89065G[0], gVar);
    }

    /* renamed from: Iw */
    private final void m109407Iw() {
        C40749p L0 = this.f89069D.mo94989L0(new C36944k(new C36950d(this)));
        C41536l.m120488h(L0, "private fun subscribeToC…ndToLifecycle()\n        }");
        bindToLifecycle(C31270e.m92876e(L0, this.f89088t));
    }

    /* access modifiers changed from: private */
    /* renamed from: Jw */
    public static final C40754t m109408Jw(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (C40754t) lVar.invoke(obj);
    }

    /* renamed from: Kw */
    private final void m109409Kw() {
        C40749p L0 = this.f89066A.mo94989L0(new C36941h(new C36953e(this)));
        C41536l.m120488h(L0, "private fun subscribeToG…ndToLifecycle()\n        }");
        bindToLifecycle(C31270e.m92876e(L0, this.f89081m));
    }

    /* access modifiers changed from: private */
    /* renamed from: Lw */
    public static final C40754t m109410Lw(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (C40754t) lVar.invoke(obj);
    }

    /* renamed from: Mw */
    private final void m109411Mw() {
        C40749p L0 = this.f89068C.mo94989L0(new C36943j(new C36956f(this)));
        C41536l.m120488h(L0, "private fun subscribeToG…ndToLifecycle()\n        }");
        bindToLifecycle(C31270e.m92876e(L0, this.f89087s));
    }

    /* access modifiers changed from: private */
    /* renamed from: Nw */
    public static final C40754t m109412Nw(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (C40754t) lVar.invoke(obj);
    }

    /* renamed from: Ow */
    private final void m109413Ow() {
        C40749p L0 = this.f89067B.mo94989L0(new C36942i(new C36959g(this)));
        C41536l.m120488h(L0, "private fun subscribeToO…ndToLifecycle()\n        }");
        bindToLifecycle(C31270e.m92876e(L0, this.f89083o));
    }

    /* access modifiers changed from: private */
    /* renamed from: Pw */
    public static final C40754t m109414Pw(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (C40754t) lVar.invoke(obj);
    }

    /* renamed from: Qw */
    private final void m109415Qw() {
        C40749p L0 = this.f89070E.mo94989L0(new C36945l(new C36961h(this)));
        C41536l.m120488h(L0, "private fun subscribeToS…ndToLifecycle()\n        }");
        bindToLifecycle(C31270e.m92876e(L0, this.f89090v));
    }

    /* access modifiers changed from: private */
    /* renamed from: Rw */
    public static final C40754t m109416Rw(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (C40754t) lVar.invoke(obj);
    }

    /* renamed from: Cg */
    public void mo89872Cg(C36937d dVar) {
        String str;
        String str2;
        PropertyInfoTextData propertyInfoTextData;
        C41536l.m120489i(dVar, "type");
        OfferInfo offerInfo = this.f89093y;
        if (offerInfo != null) {
            boolean d = C41536l.m120484d(offerInfo.getProductCode(), OfferProductCode.C21019ML.f56477f);
            if (d) {
                str = "loan.page.real.estate.block.title";
            } else {
                str = "loan.page.real.estate.block.title.SL";
            }
            if (d) {
                str2 = "loan.page.real.estate.collateral.hint.ipo";
            } else {
                str2 = "loan.page.real.estate.collateral.hint.SL";
            }
            C1644x xVar = this.f89085q;
            int i = C36948b.f89098a[dVar.ordinal()];
            if (i == 1) {
                propertyInfoTextData = new PropertyInfoTextData("loan.page.real.estate.my.properties", "loan.page.real.estate.my.properties.hint", "loan.page.button.add.real.estate");
            } else if (i == 2) {
                propertyInfoTextData = new PropertyInfoTextData(str, str2, "loan.page.button.add.real.estate");
            } else {
                throw new NoWhenBranchMatchedException();
            }
            C37224b.m109965d(xVar, propertyInfoTextData);
        }
    }

    /* renamed from: Cw */
    public final C36935c mo89906Cw() {
        return this.f89079k;
    }

    /* renamed from: Eh */
    public LiveData mo89885Eh() {
        return this.f89083o;
    }

    /* renamed from: Es */
    public void mo89873Es(boolean z) {
        String str;
        OfferProductCode productCode;
        if (z || m109403Dw().mo89902g()) {
            this.f89070E.onNext(m109403Dw());
            OfferInfo offerInfo = this.f89093y;
            if (offerInfo == null || (productCode = offerInfo.getProductCode()) == null) {
                str = null;
            } else {
                str = productCode.mo51954a();
            }
            C32343x.m95501z0(this, "offers", "CREDIT_LEAD_" + str, "send_lead_application");
            return;
        }
        C37224b.m109962a(this.f89089u);
    }

    /* renamed from: Fw */
    public final C36939f mo89907Fw() {
        return this.f89080l;
    }

    /* renamed from: Gs */
    public LiveData mo89886Gs() {
        return this.f89091w;
    }

    /* renamed from: O6 */
    public void mo89874O6(C36783a aVar, boolean z) {
        C41536l.m120489i(aVar, "item");
        m109402Bw(m109403Dw().mo89897c(), aVar, z);
    }

    /* renamed from: O7 */
    public LiveData mo89887O7() {
        return this.f89085q;
    }

    /* renamed from: Vj */
    public void mo89875Vj(String str) {
        C41536l.m120489i(str, "purposeValue");
        C36940g Dw = m109403Dw();
        Iterator it = this.f89071F.iterator();
        int i = 0;
        while (true) {
            if (!it.hasNext()) {
                i = -1;
                break;
            } else if (C41536l.m120484d(((C36786b) it.next()).mo89675b(), str)) {
                break;
            } else {
                i++;
            }
        }
        m109406Hw(C36940g.m109393b(Dw, i, (ArrayList) null, (ArrayList) null, 6, (Object) null));
    }

    /* renamed from: Yb */
    public LiveData mo89888Yb() {
        return this.f89082n;
    }

    /* renamed from: ag */
    public LiveData mo89889ag() {
        return this.f89086r;
    }

    /* renamed from: cb */
    public LiveData mo89890cb() {
        return this.f89090v;
    }

    /* renamed from: em */
    public LiveData mo89891em() {
        return this.f89087s;
    }

    /* renamed from: gl */
    public LiveData mo89892gl() {
        return this.f89088t;
    }

    /* renamed from: i5 */
    public void mo89876i5(C36783a aVar, boolean z) {
        C41536l.m120489i(aVar, "item");
        m109402Bw(m109403Dw().mo89898d(), aVar, z);
    }

    /* renamed from: ic */
    public LiveData mo89893ic() {
        return this.f89089u;
    }

    /* renamed from: lg */
    public void mo89877lg() {
        C37224b.m109962a(this.f89086r);
    }

    /* renamed from: o9 */
    public LiveData mo89894o9() {
        return this.f89084p;
    }

    /* renamed from: td */
    public LiveData mo89895td() {
        return this.f89081m;
    }

    /* renamed from: zp */
    public void mo89878zp(String str) {
        C41536l.m120489i(str, "cadastralCode");
        this.f89069D.onNext(str);
    }
}
