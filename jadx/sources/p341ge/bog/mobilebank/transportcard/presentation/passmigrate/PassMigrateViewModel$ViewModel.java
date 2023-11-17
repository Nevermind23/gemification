package p341ge.bog.mobilebank.transportcard.presentation.passmigrate;

import androidx.lifecycle.C1644x;
import b41.C31128a;
import c41.C31270e;
import ed1.C40749p;
import ed1.C40754t;
import ee1.C40765a;
import ee1.C40767b;
import g91.C32343x;
import hd1.C41204a;
import hd1.C41205b;
import he1.C41224m;
import he1.C41238w;
import i71.C36358a;
import i71.C36361c;
import i71.C36363e;
import j71.C36748a;
import j71.C36753f;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.C41535k;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import l71.C37095e;
import m41.C37224b;
import md0.C26186e;
import o71.C37664c;
import o71.C37665d;
import o71.C37666e;
import o71.C37667f;
import o71.C37668g;
import o71.C37669h;
import o71.C37670i;
import o71.C37671j;
import o71.C37692r;
import p341ge.bog.designsystem.components.creditcard.CreditCardView;
import p341ge.bog.mobilebank.cleanarch.presentation.common.C21481a;
import ue1.C43075l;
import ue1.C43079p;
import zd1.C43413a;

/* renamed from: ge.bog.mobilebank.transportcard.presentation.passmigrate.PassMigrateViewModel$ViewModel */
public final class PassMigrateViewModel$ViewModel extends C21481a implements C37665d, C37666e, C37095e {
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final C36363e f84492d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public final C37664c f84493e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public final C36358a f84494f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public final C36361c f84495g;

    /* renamed from: h */
    private final /* synthetic */ C37095e f84496h;

    /* renamed from: i */
    private final C37665d f84497i = this;

    /* renamed from: j */
    private final C37666e f84498j = this;

    /* renamed from: k */
    private final C1644x f84499k = new C1644x();

    /* renamed from: l */
    private final C1644x f84500l = new C1644x();

    /* renamed from: m */
    private final C1644x f84501m = new C1644x();

    /* renamed from: n */
    private final C1644x f84502n = new C1644x();

    /* renamed from: o */
    private final C1644x f84503o = new C1644x();

    /* renamed from: p */
    private final C40765a f84504p;

    /* renamed from: q */
    private final C40767b f84505q;

    /* renamed from: ge.bog.mobilebank.transportcard.presentation.passmigrate.PassMigrateViewModel$ViewModel$a */
    /* synthetic */ class C35015a extends C41535k implements C43079p {

        /* renamed from: d */
        public static final C35015a f84506d = new C35015a();

        C35015a() {
            super(2, C41224m.class, "<init>", "<init>(Ljava/lang/Object;Ljava/lang/Object;)V", 0);
        }

        /* renamed from: b */
        public final C41224m invoke(List list, Long l) {
            C41536l.m120489i(list, "p0");
            return new C41224m(list, l);
        }
    }

    /* renamed from: ge.bog.mobilebank.transportcard.presentation.passmigrate.PassMigrateViewModel$ViewModel$b */
    static final class C35016b extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ PassMigrateViewModel$ViewModel f84507d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C35016b(PassMigrateViewModel$ViewModel passMigrateViewModel$ViewModel) {
            super(1);
            this.f84507d = passMigrateViewModel$ViewModel;
        }

        /* renamed from: a */
        public final void mo85867a(C41224m mVar) {
            List list = (List) mVar.mo95675a();
            Long l = (Long) mVar.mo95676b();
            C1644x uw = this.f84507d.mo85854gk();
            C37664c qw = this.f84507d.f84493e;
            C41536l.m120488h(list, "activeCards");
            List b = qw.mo90853b(list);
            PassMigrateViewModel$ViewModel passMigrateViewModel$ViewModel = this.f84507d;
            int i = 0;
            for (Object next : b) {
                int i2 = i + 1;
                if (i < 0) {
                    C41341q.m119917t();
                }
                if (C41536l.m120484d(((CreditCardView.C13270b) next).mo35446g(), String.valueOf(l))) {
                    passMigrateViewModel$ViewModel.mo85849Z2(i);
                }
                i = i2;
            }
            uw.mo4826r(b);
            if (!(!list.isEmpty())) {
                return;
            }
            if (list.size() > 1) {
                C37224b.m109962a(this.f84507d.mo85862wt());
            } else {
                C37224b.m109962a(this.f84507d.mo85865yu());
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo85867a((C41224m) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.transportcard.presentation.passmigrate.PassMigrateViewModel$ViewModel$c */
    static final class C35017c extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ PassMigrateViewModel$ViewModel f84508d;

        /* renamed from: ge.bog.mobilebank.transportcard.presentation.passmigrate.PassMigrateViewModel$ViewModel$c$a */
        static final class C35018a extends C41537m implements C43075l {

            /* renamed from: d */
            final /* synthetic */ PassMigrateViewModel$ViewModel f84509d;

            /* renamed from: e */
            final /* synthetic */ Integer f84510e;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C35018a(PassMigrateViewModel$ViewModel passMigrateViewModel$ViewModel, Integer num) {
                super(1);
                this.f84509d = passMigrateViewModel$ViewModel;
                this.f84510e = num;
            }

            /* renamed from: a */
            public final void mo85869a(List list) {
                Object obj;
                List list2 = (List) this.f84509d.mo85854gk().mo4814f();
                if (list2 != null) {
                    Integer num = this.f84510e;
                    Iterator it = list2.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            obj = null;
                            break;
                        }
                        obj = it.next();
                        if (((CreditCardView.C13270b) obj).mo35451k()) {
                            break;
                        }
                    }
                    CreditCardView.C13270b bVar = (CreditCardView.C13270b) obj;
                    if (bVar != null) {
                        bVar.mo35453m(false);
                    }
                    C41536l.m120488h(num, "position");
                    ((CreditCardView.C13270b) list2.get(num.intValue())).mo35453m(true);
                }
                C1644x ww = this.f84509d.mo85846Nj();
                C37664c qw = this.f84509d.f84493e;
                Integer num2 = this.f84510e;
                C41536l.m120488h(num2, "position");
                CreditCardView.C13270b a = qw.mo90852a((C36748a) list.get(num2.intValue()));
                a.mo35453m(true);
                Integer num3 = this.f84510e;
                C41536l.m120488h(num3, "position");
                ww.mo4826r(new C37692r(a, ((C36748a) list.get(num3.intValue())).mo89582i()));
                Integer num4 = this.f84510e;
                C41536l.m120488h(num4, "position");
                if (!((C36748a) list.get(num4.intValue())).mo89582i().isEmpty()) {
                    PassMigrateViewModel$ViewModel passMigrateViewModel$ViewModel = this.f84509d;
                    Integer num5 = this.f84510e;
                    C41536l.m120488h(num5, "position");
                    String a2 = ((C36753f) ((C36748a) list.get(num5.intValue())).mo89582i().get(0)).mo89614a();
                    Integer num6 = this.f84510e;
                    C41536l.m120488h(num6, "position");
                    passMigrateViewModel$ViewModel.mo85855j8(a2, ((C36753f) ((C36748a) list.get(num6.intValue())).mo89582i().get(0)).mo89617d());
                }
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                mo85869a((List) obj);
                return C41238w.f97225a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C35017c(PassMigrateViewModel$ViewModel passMigrateViewModel$ViewModel) {
            super(1);
            this.f84508d = passMigrateViewModel$ViewModel;
        }

        /* access modifiers changed from: private */
        /* renamed from: c */
        public static final void m102950c(C43075l lVar, Object obj) {
            C41536l.m120489i(lVar, "$tmp0");
            lVar.invoke(obj);
        }

        /* renamed from: b */
        public final void mo85868b(Integer num) {
            C32343x.m95413R0(C26186e.m81987e(C36363e.m107895b(this.f84508d.f84492d, false, 1, (Object) null))).mo94981F0(new C35023b(new C35018a(this.f84508d, num)));
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo85868b((Integer) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.transportcard.presentation.passmigrate.PassMigrateViewModel$ViewModel$d */
    static final class C35019d extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ PassMigrateViewModel$ViewModel f84511d;

        /* renamed from: ge.bog.mobilebank.transportcard.presentation.passmigrate.PassMigrateViewModel$ViewModel$d$a */
        static final class C35020a extends C41537m implements C43075l {

            /* renamed from: d */
            final /* synthetic */ PassMigrateViewModel$ViewModel f84512d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C35020a(PassMigrateViewModel$ViewModel passMigrateViewModel$ViewModel) {
                super(1);
                this.f84512d = passMigrateViewModel$ViewModel;
            }

            /* renamed from: a */
            public final C40754t invoke(C36358a.C36359a aVar) {
                C41536l.m120489i(aVar, "it");
                C40749p O = this.f84512d.f84494f.mo89081a(aVar).mo95075O();
                C41536l.m120488h(O, "cardSubstitutionUseCase(it).toObservable()");
                return C31270e.m92879h(O, -1);
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C35019d(PassMigrateViewModel$ViewModel passMigrateViewModel$ViewModel) {
            super(1);
            this.f84511d = passMigrateViewModel$ViewModel;
        }

        /* access modifiers changed from: private */
        /* renamed from: c */
        public static final C40754t m102954c(C43075l lVar, Object obj) {
            C41536l.m120489i(lVar, "$tmp0");
            return (C40754t) lVar.invoke(obj);
        }

        /* renamed from: b */
        public final C40754t invoke(C41238w wVar) {
            C41536l.m120489i(wVar, "it");
            return this.f84511d.mo85847Tr().mo94998Q(new C35024c(new C35020a(this.f84511d)));
        }
    }

    /* renamed from: ge.bog.mobilebank.transportcard.presentation.passmigrate.PassMigrateViewModel$ViewModel$e */
    static final class C35021e extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ PassMigrateViewModel$ViewModel f84513d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C35021e(PassMigrateViewModel$ViewModel passMigrateViewModel$ViewModel) {
            super(1);
            this.f84513d = passMigrateViewModel$ViewModel;
        }

        /* renamed from: a */
        public final void mo85872a(C31128a aVar) {
            this.f84513d.mo85850Za().mo4826r(aVar);
            if (aVar instanceof C31128a.C31131c) {
                C32343x.m95413R0(this.f84513d.f84495g.mo89090a(true)).mo94979E0();
                C32343x.m95413R0(this.f84513d.f84492d.mo89092a(true)).mo94979E0();
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo85872a((C31128a) obj);
            return C41238w.f97225a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PassMigrateViewModel$ViewModel(C36363e eVar, C37664c cVar, C36358a aVar, C36361c cVar2, C37095e eVar2) {
        super((C41204a) null, 1, (DefaultConstructorMarker) null);
        C41536l.m120489i(eVar, "getMigratedPassDevicesUseCase");
        C41536l.m120489i(cVar, "mapper");
        C41536l.m120489i(aVar, "cardSubstitutionUseCase");
        C41536l.m120489i(cVar2, "getActivePassesUseCase");
        C41536l.m120489i(eVar2, "delegate");
        this.f84492d = eVar;
        this.f84493e = cVar;
        this.f84494f = aVar;
        this.f84495g = cVar2;
        this.f84496h = eVar2;
        C40765a i1 = C40765a.m118199i1(0);
        C41536l.m120488h(i1, "createDefault(0)");
        this.f84504p = i1;
        C40767b h1 = C40767b.m118210h1();
        C41536l.m120488h(h1, "create<Unit>()");
        this.f84505q = h1;
        C43413a w0 = C26186e.m81987e(C36363e.m107895b(eVar, false, 1, (Object) null)).mo95040w0();
        C40749p Y0 = w0.mo95014Y0(mo85853g6(), new C37667f(C35015a.f84506d));
        C41536l.m120488h(Y0, "migratedDevicesObservabl…atestFrom(cardId, ::Pair)");
        C41205b F0 = C32343x.m95413R0(Y0).mo94981F0(new C37668g(new C35016b(this)));
        C41536l.m120488h(F0, "migratedDevicesObservabl…      }\n                }");
        bindToLifecycle(F0);
        C41205b F02 = C32343x.m95413R0(i1).mo94981F0(new C37669h(new C35017c(this)));
        C41536l.m120488h(F02, "substituteCardSubject.ob…          }\n            }");
        bindToLifecycle(F02);
        C40749p L0 = h1.mo94989L0(new C37670i(new C35019d(this)));
        C41536l.m120488h(L0, "onSubstituteDevice.switc…          }\n            }");
        C41205b F03 = C32343x.m95413R0(L0).mo94981F0(new C37671j(new C35021e(this)));
        C41536l.m120488h(F03, "onSubstituteDevice.switc…          }\n            }");
        bindToLifecycle(F03);
        w0.mo102094i1();
    }

    /* access modifiers changed from: private */
    /* renamed from: iw */
    public static final C41224m m102918iw(C43079p pVar, Object obj, Object obj2) {
        C41536l.m120489i(pVar, "$tmp0");
        return (C41224m) pVar.invoke(obj, obj2);
    }

    /* access modifiers changed from: private */
    /* renamed from: jw */
    public static final void m102919jw(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: kw */
    public static final void m102920kw(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: lw */
    public static final C40754t m102921lw(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (C40754t) lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: mw */
    public static final void m102922mw(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* renamed from: Tr */
    public C40749p mo85847Tr() {
        return this.f84496h.mo85847Tr();
    }

    /* renamed from: X2 */
    public void mo85848X2() {
        this.f84505q.onNext(C41238w.f97225a);
    }

    /* renamed from: Z2 */
    public void mo85849Z2(int i) {
        this.f84504p.onNext(Integer.valueOf(i));
    }

    /* renamed from: a4 */
    public void mo85851a4() {
        C37224b.m109962a(mo85865yu());
    }

    /* renamed from: fh */
    public void mo85852fh() {
        C37224b.m109962a(mo85862wt());
    }

    /* renamed from: g6 */
    public C40749p mo85853g6() {
        return this.f84496h.mo85853g6();
    }

    /* renamed from: j8 */
    public void mo85855j8(String str, String str2) {
        C41536l.m120489i(str, "deviceId");
        C41536l.m120489i(str2, "deviceType");
        this.f84496h.mo85855j8(str, str2);
    }

    /* renamed from: ns */
    public void mo85856ns(String str, String str2) {
        C41536l.m120489i(str, "deviceId");
        C41536l.m120489i(str2, "deviceType");
        mo85855j8(str, str2);
    }

    /* renamed from: rw */
    public final C37665d mo85857rw() {
        return this.f84497i;
    }

    /* renamed from: sw */
    public C1644x mo85862wt() {
        return this.f84501m;
    }

    /* renamed from: tw */
    public C1644x mo85865yu() {
        return this.f84502n;
    }

    /* renamed from: uw */
    public C1644x mo85854gk() {
        return this.f84499k;
    }

    /* renamed from: vw */
    public final C37666e mo85861vw() {
        return this.f84498j;
    }

    /* renamed from: ww */
    public C1644x mo85846Nj() {
        return this.f84500l;
    }

    /* renamed from: xw */
    public C1644x mo85850Za() {
        return this.f84503o;
    }
}
