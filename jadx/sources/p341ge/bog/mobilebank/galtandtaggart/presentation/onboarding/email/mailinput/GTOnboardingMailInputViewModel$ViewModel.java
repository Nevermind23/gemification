package p341ge.bog.mobilebank.galtandtaggart.presentation.onboarding.email.mailinput;

import af0.C19234a;
import androidx.lifecycle.C1644x;
import b41.C31128a;
import c41.C31270e;
import ed1.C40749p;
import ed1.C40754t;
import ee1.C40767b;
import g91.C32343x;
import gd1.C40992a;
import hd1.C41204a;
import he1.C41238w;
import j51.C36732d;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;
import k51.C36873a;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p341ge.bog.mobilebank.cleanarch.presentation.common.C21481a;
import tf0.C28373b;
import tf0.C28374c;
import tf0.C28375d;
import tf0.C28376e;
import ue1.C43075l;
import ye0.C30005a;

/* renamed from: ge.bog.mobilebank.galtandtaggart.presentation.onboarding.email.mailinput.GTOnboardingMailInputViewModel$ViewModel */
public final class GTOnboardingMailInputViewModel$ViewModel extends C21481a implements C28373b, C28374c {
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final C30005a f61428d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public final C19234a f61429e;

    /* renamed from: f */
    private final C36732d f61430f;

    /* renamed from: g */
    private final C28373b f61431g = this;

    /* renamed from: h */
    private final C28374c f61432h = this;

    /* renamed from: i */
    private final C1644x f61433i = new C1644x();

    /* renamed from: j */
    private final C1644x f61434j = new C1644x();

    /* renamed from: k */
    private final C1644x f61435k = new C1644x(C32343x.m95466m(m76096kw()));

    /* renamed from: l */
    private final C40767b f61436l;

    /* renamed from: m */
    private final C40767b f61437m;

    /* renamed from: n */
    private AtomicReference f61438n;

    /* renamed from: ge.bog.mobilebank.galtandtaggart.presentation.onboarding.email.mailinput.GTOnboardingMailInputViewModel$ViewModel$a */
    static final class C23524a extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ GTOnboardingMailInputViewModel$ViewModel f61439d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C23524a(GTOnboardingMailInputViewModel$ViewModel gTOnboardingMailInputViewModel$ViewModel) {
            super(1);
            this.f61439d = gTOnboardingMailInputViewModel$ViewModel;
        }

        /* renamed from: a */
        public final C40754t invoke(String str) {
            C41536l.m120489i(str, "email");
            C40749p O = this.f61439d.f61428d.mo70306a(str).mo95075O();
            C41536l.m120488h(O, "getEmailRequestId(email)…          .toObservable()");
            return C31270e.m92879h(O, 1);
        }
    }

    /* renamed from: ge.bog.mobilebank.galtandtaggart.presentation.onboarding.email.mailinput.GTOnboardingMailInputViewModel$ViewModel$b */
    static final class C23525b extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ GTOnboardingMailInputViewModel$ViewModel f61440d;

        /* renamed from: ge.bog.mobilebank.galtandtaggart.presentation.onboarding.email.mailinput.GTOnboardingMailInputViewModel$ViewModel$b$a */
        static final class C23526a extends C41537m implements C43075l {

            /* renamed from: d */
            public static final C23526a f61441d = new C23526a();

            C23526a() {
                super(1);
            }

            /* renamed from: a */
            public final C31128a invoke(Throwable th) {
                C41536l.m120489i(th, "error");
                return new C31128a.C31129a(th, 0, (Object) null, 6, (DefaultConstructorMarker) null);
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C23525b(GTOnboardingMailInputViewModel$ViewModel gTOnboardingMailInputViewModel$ViewModel) {
            super(1);
            this.f61440d = gTOnboardingMailInputViewModel$ViewModel;
        }

        /* access modifiers changed from: private */
        /* renamed from: c */
        public static final C31128a m76110c(C43075l lVar, Object obj) {
            C41536l.m120489i(lVar, "$tmp0");
            return (C31128a) lVar.invoke(obj);
        }

        /* renamed from: b */
        public final C40754t invoke(C41238w wVar) {
            C41536l.m120489i(wVar, "it");
            return this.f61440d.f61429e.mo47473a().mo95092y().mo94893M(new C31128a.C31131c(C41238w.f97225a, 0, 2, (DefaultConstructorMarker) null)).mo95075O().mo94977D0(new C31128a.C31130b(0, (Object) null, 3, (DefaultConstructorMarker) null)).mo95035t0(new C23527a(C23526a.f61441d));
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public GTOnboardingMailInputViewModel$ViewModel(C30005a aVar, C19234a aVar2, C36732d dVar) {
        super((C41204a) null, 1, (DefaultConstructorMarker) null);
        C41536l.m120489i(aVar, "getEmailRequestId");
        C41536l.m120489i(aVar2, "getDisclosureTypesUseCase");
        C41536l.m120489i(dVar, "getClientMails");
        this.f61428d = aVar;
        this.f61429e = aVar2;
        this.f61430f = dVar;
        C40767b h1 = C40767b.m118210h1();
        C41536l.m120488h(h1, "create<String>()");
        this.f61436l = h1;
        C40767b h12 = C40767b.m118210h1();
        C41536l.m120488h(h12, "create<Unit>()");
        this.f61437m = h12;
        this.f61438n = new AtomicReference(m76096kw());
        C40749p o0 = h1.mo94989L0(new C28375d(new C23524a(this))).mo95027o0(C40992a.m118827a());
        C41536l.m120488h(o0, "mailRequestIdSubject.swi…dSchedulers.mainThread())");
        bindToLifecycle(C31270e.m92876e(o0, mo60376hm()));
        C40749p L0 = h12.mo94989L0(new C28376e(new C23525b(this)));
        C41536l.m120488h(L0, "disclosureTypesSubject.s…or(error) }\n            }");
        bindToLifecycle(C31270e.m92876e(C32343x.m95413R0(L0), mo60374D()));
    }

    /* access modifiers changed from: private */
    /* renamed from: fw */
    public static final C40754t m76092fw(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (C40754t) lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: gw */
    public static final C40754t m76093gw(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (C40754t) lVar.invoke(obj);
    }

    /* renamed from: kw */
    private final String m76096kw() {
        Object obj;
        String b;
        Iterator it = this.f61430f.mo89559a().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((C36873a) obj).mo89802d()) {
                break;
            }
        }
        C36873a aVar = (C36873a) obj;
        if (aVar == null || (b = aVar.mo89800b()) == null) {
            return "";
        }
        return b;
    }

    /* renamed from: bo */
    public void mo60375bo() {
        this.f61437m.onNext(C41238w.f97225a);
    }

    /* renamed from: jw */
    public C1644x mo60383rv() {
        return this.f61435k;
    }

    /* renamed from: lw */
    public C1644x mo60374D() {
        return this.f61434j;
    }

    /* renamed from: mw */
    public C1644x mo60376hm() {
        return this.f61433i;
    }

    /* renamed from: nw */
    public final C28373b mo60380nw() {
        return this.f61431g;
    }

    /* renamed from: ow */
    public String mo60381ow() {
        Object obj = this.f61438n.get();
        C41536l.m120488h(obj, "mail.get()");
        return (String) obj;
    }

    /* renamed from: pw */
    public final C28374c mo60382pw() {
        return this.f61432h;
    }

    /* renamed from: ti */
    public void mo60384ti(String str) {
        C41536l.m120489i(str, "email");
        this.f61438n.set(str);
        this.f61436l.onNext(this.f61438n.get());
    }
}
