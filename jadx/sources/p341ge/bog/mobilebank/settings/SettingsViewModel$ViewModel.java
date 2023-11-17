package p341ge.bog.mobilebank.settings;

import androidx.lifecycle.C1644x;
import androidx.lifecycle.LiveData;
import ee1.C40767b;
import f11.C31913g;
import f11.C31914h;
import f11.C31915i;
import f11.C31916j;
import f11.C31917k;
import f11.C31918l;
import g11.C32041b;
import g31.C32080b;
import gd1.C40992a;
import hd1.C41204a;
import hd1.C41205b;
import he1.C41238w;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import m41.C37224b;
import p341ge.bog.mobilebank.cleanarch.presentation.common.C21481a;
import p341ge.bog.mobilebank.rest.model.DarkModeType;
import q11.C38103c;
import q11.C38105e;
import q11.C38108h;
import q11.C38113l;
import r11.C38277b;
import ue1.C43075l;

/* renamed from: ge.bog.mobilebank.settings.SettingsViewModel$ViewModel */
public final class SettingsViewModel$ViewModel extends C21481a implements C31913g, C31914h {

    /* renamed from: F */
    public static final C34570a f83538F = new C34570a((DefaultConstructorMarker) null);

    /* renamed from: A */
    private final C1644x f83539A;

    /* renamed from: B */
    private final C1644x f83540B;

    /* renamed from: C */
    private final C1644x f83541C;

    /* renamed from: D */
    private final C1644x f83542D;

    /* renamed from: E */
    private final C1644x f83543E;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final C38277b f83544d;

    /* renamed from: e */
    private final C38105e f83545e;

    /* renamed from: f */
    private final C38113l f83546f;

    /* renamed from: g */
    private final C38103c f83547g;

    /* renamed from: h */
    private final C38108h f83548h;

    /* renamed from: i */
    private final C32080b f83549i;

    /* renamed from: j */
    private final AtomicBoolean f83550j = new AtomicBoolean(false);

    /* renamed from: k */
    private final AtomicInteger f83551k = new AtomicInteger(0);

    /* renamed from: l */
    private final AtomicInteger f83552l = new AtomicInteger(0);

    /* renamed from: m */
    private final C40767b f83553m;

    /* renamed from: n */
    private final C31914h f83554n;

    /* renamed from: o */
    private final C31913g f83555o;
    /* access modifiers changed from: private */

    /* renamed from: p */
    public final C1644x f83556p;

    /* renamed from: q */
    private final C1644x f83557q;

    /* renamed from: r */
    private final C1644x f83558r;

    /* renamed from: s */
    private final C1644x f83559s;

    /* renamed from: t */
    private final C1644x f83560t;

    /* renamed from: u */
    private final C1644x f83561u;

    /* renamed from: v */
    private final C1644x f83562v;

    /* renamed from: w */
    private final C1644x f83563w;

    /* renamed from: x */
    private final C1644x f83564x;

    /* renamed from: y */
    private final C1644x f83565y;

    /* renamed from: z */
    private final C1644x f83566z;

    /* renamed from: ge.bog.mobilebank.settings.SettingsViewModel$ViewModel$a */
    public static final class C34570a {
        private C34570a() {
        }

        public /* synthetic */ C34570a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: ge.bog.mobilebank.settings.SettingsViewModel$ViewModel$b */
    static final class C34571b extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ SettingsViewModel$ViewModel f83567d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C34571b(SettingsViewModel$ViewModel settingsViewModel$ViewModel) {
            super(1);
            this.f83567d = settingsViewModel$ViewModel;
        }

        /* renamed from: a */
        public final void mo84094a(C41238w wVar) {
            this.f83567d.m101429Vw();
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo84094a((C41238w) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.settings.SettingsViewModel$ViewModel$c */
    static final class C34572c extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ SettingsViewModel$ViewModel f83568d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C34572c(SettingsViewModel$ViewModel settingsViewModel$ViewModel) {
            super(1);
            this.f83568d = settingsViewModel$ViewModel;
        }

        /* renamed from: a */
        public final void mo84095a(DarkModeType darkModeType) {
            this.f83568d.m101414Gw();
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo84095a((DarkModeType) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.settings.SettingsViewModel$ViewModel$d */
    static final class C34573d extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ SettingsViewModel$ViewModel f83569d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C34573d(SettingsViewModel$ViewModel settingsViewModel$ViewModel) {
            super(1);
            this.f83569d = settingsViewModel$ViewModel;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Throwable) obj);
            return C41238w.f97225a;
        }

        public final void invoke(Throwable th) {
            SettingsViewModel$ViewModel settingsViewModel$ViewModel = this.f83569d;
            C41536l.m120488h(th, "throwable");
            settingsViewModel$ViewModel.m101411Dw(th);
        }
    }

    /* renamed from: ge.bog.mobilebank.settings.SettingsViewModel$ViewModel$e */
    static final class C34574e extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ SettingsViewModel$ViewModel f83570d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C34574e(SettingsViewModel$ViewModel settingsViewModel$ViewModel) {
            super(1);
            this.f83570d = settingsViewModel$ViewModel;
        }

        /* renamed from: a */
        public final void mo84097a(C41238w wVar) {
            this.f83570d.f83556p.mo4823o(this.f83570d.f83544d.mo91830h());
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo84097a((C41238w) obj);
            return C41238w.f97225a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SettingsViewModel$ViewModel(C38277b bVar, C38105e eVar, C38113l lVar, C38103c cVar, C38108h hVar, C32080b bVar2) {
        super((C41204a) null, 1, (DefaultConstructorMarker) null);
        C41536l.m120489i(bVar, "settingsManagementItemsLocator");
        C41536l.m120489i(eVar, "getSecurityItems");
        C41536l.m120489i(lVar, "updateLocale");
        C41536l.m120489i(cVar, "getLanguage");
        C41536l.m120489i(hVar, "updateDarkModeType");
        C41536l.m120489i(bVar2, "isAuthorized");
        this.f83544d = bVar;
        this.f83545e = eVar;
        this.f83546f = lVar;
        this.f83547g = cVar;
        this.f83548h = hVar;
        this.f83549i = bVar2;
        C40767b h1 = C40767b.m118210h1();
        C41536l.m120488h(h1, "create<Unit>()");
        this.f83553m = h1;
        this.f83554n = this;
        this.f83555o = this;
        this.f83556p = new C1644x(bVar.mo91830h());
        this.f83557q = new C1644x(eVar.mo91530a());
        this.f83558r = new C1644x();
        this.f83559s = new C1644x(cVar.mo91529a());
        this.f83560t = new C1644x();
        this.f83561u = new C1644x();
        this.f83562v = new C1644x();
        this.f83563w = new C1644x();
        this.f83564x = new C1644x();
        this.f83565y = new C1644x();
        this.f83566z = new C1644x();
        this.f83539A = new C1644x();
        this.f83540B = new C1644x();
        this.f83541C = new C1644x();
        this.f83542D = new C1644x();
        this.f83543E = new C1644x();
        C41205b Aw = m101408Aw();
        C41536l.m120488h(Aw, "getUpdateDarkModeDisposable()");
        C41205b nw = m101441nw();
        C41536l.m120488h(nw, "getDebugScreenClickDisposable()");
        addDisposables(Aw, nw);
    }

    /* renamed from: Aw */
    private final C41205b m101408Aw() {
        return this.f83548h.mo91532a().mo94981F0(new C31915i(new C34572c(this)));
    }

    /* access modifiers changed from: private */
    /* renamed from: Bw */
    public static final void m101409Bw(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* renamed from: Cw */
    private final void m101410Cw() {
        if (m101440mw()) {
            m101429Vw();
            m101422Ow();
        } else if (m101430Ww()) {
            m101429Vw();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: Dw */
    public final void m101411Dw(Throwable th) {
        C37224b.m109965d(this.f83541C, th);
    }

    /* renamed from: Ew */
    private final void m101412Ew() {
        if (this.f83549i.mo72555a()) {
            m101414Gw();
            m101413Fw(true);
            return;
        }
        m101413Fw(false);
    }

    /* renamed from: Fw */
    private final void m101413Fw(boolean z) {
        C37224b.m109965d(this.f83558r, Boolean.valueOf(z));
    }

    /* access modifiers changed from: private */
    /* renamed from: Gw */
    public final void m101414Gw() {
        C41205b F0 = this.f83544d.mo91831i().mo94974C(new C31916j(new C34573d(this))).mo94981F0(new C31917k(new C34574e(this)));
        C41536l.m120488h(F0, "private fun initManageme…}\n            )\n        }");
        addDisposable(F0);
    }

    /* access modifiers changed from: private */
    /* renamed from: Hw */
    public static final void m101415Hw(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: Iw */
    public static final void m101416Iw(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* renamed from: Jw */
    private final void m101417Jw() {
        C37224b.m109962a(this.f83562v);
    }

    /* renamed from: Kw */
    private final void m101418Kw() {
        C37224b.m109962a(this.f83560t);
    }

    /* renamed from: Lw */
    private final void m101419Lw() {
        C37224b.m109962a(this.f83543E);
    }

    /* renamed from: Mw */
    private final void m101420Mw() {
        C37224b.m109962a(this.f83563w);
    }

    /* renamed from: Nw */
    private final void m101421Nw(C32041b.C32042a aVar) {
        if (aVar instanceof C32041b.C32042a.C32045c) {
            m101418Kw();
        } else if (aVar instanceof C32041b.C32042a.C32049g) {
            m101428Uw();
        } else if (aVar instanceof C32041b.C32042a.C32043a) {
            m101417Jw();
        } else if (aVar instanceof C32041b.C32042a.C32046d) {
            m101419Lw();
        } else if (aVar instanceof C32041b.C32042a.C32047e) {
            m101420Mw();
        } else if (aVar instanceof C32041b.C32042a.C32048f) {
            m101426Sw();
        } else if (aVar instanceof C32041b.C32042a.C32044b) {
            m101424Qw();
        }
    }

    /* renamed from: Ow */
    private final void m101422Ow() {
        C37224b.m109962a(this.f83542D);
    }

    /* renamed from: Pw */
    private final void m101423Pw() {
        C37224b.m109962a(this.f83539A);
    }

    /* renamed from: Qw */
    private final void m101424Qw() {
        C37224b.m109962a(this.f83565y);
    }

    /* renamed from: Rw */
    private final void m101425Rw(C32041b.C32050b bVar) {
        if (bVar instanceof C32041b.C32050b.C32052b) {
            m101427Tw();
        } else if (bVar instanceof C32041b.C32050b.C32051a) {
            m101423Pw();
        } else {
            throw new IllegalStateException("Only SecuritySettings.SignInAndAuth and SecuritySettings.PrivacyPolicy support clicks handlers");
        }
    }

    /* renamed from: Sw */
    private final void m101426Sw() {
        C37224b.m109962a(this.f83564x);
    }

    /* renamed from: Tw */
    private final void m101427Tw() {
        C37224b.m109962a(this.f83566z);
    }

    /* renamed from: Uw */
    private final void m101428Uw() {
        C37224b.m109962a(this.f83561u);
    }

    /* access modifiers changed from: private */
    /* renamed from: Vw */
    public final void m101429Vw() {
        this.f83551k.set(0);
        this.f83552l.set(0);
    }

    /* renamed from: Ww */
    private final boolean m101430Ww() {
        if (this.f83551k.get() <= 5 || this.f83552l.get() <= 3) {
            return false;
        }
        return true;
    }

    /* renamed from: mw */
    private final boolean m101440mw() {
        if (this.f83551k.get() == 5 && this.f83552l.get() == 3) {
            return true;
        }
        return false;
    }

    /* renamed from: nw */
    private final C41205b m101441nw() {
        return this.f83553m.mo95032s(8000, TimeUnit.MILLISECONDS).mo95027o0(C40992a.m118827a()).mo94981F0(new C31918l(new C34571b(this)));
    }

    /* access modifiers changed from: private */
    /* renamed from: ow */
    public static final void m101442ow(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* renamed from: Bf */
    public LiveData mo72354Bf() {
        return this.f83541C;
    }

    /* renamed from: Di */
    public void mo72349Di(boolean z) {
        this.f83550j.set(z);
        m101412Ew();
    }

    /* renamed from: Nl */
    public LiveData mo72356Nl() {
        return this.f83557q;
    }

    /* renamed from: Oq */
    public LiveData mo72357Oq() {
        return this.f83556p;
    }

    /* renamed from: Pf */
    public void mo72350Pf() {
        this.f83551k.incrementAndGet();
        this.f83553m.onNext(C41238w.f97225a);
        m101410Cw();
    }

    /* renamed from: R */
    public LiveData mo72358R() {
        return this.f83540B;
    }

    /* renamed from: Ts */
    public void mo72351Ts(int i) {
        if (this.f83547g.mo91529a().mo72534c() != i) {
            this.f83546f.mo91535c(i);
            C37224b.m109962a(this.f83540B);
        }
    }

    public LiveData getLanguage() {
        return this.f83559s;
    }

    /* renamed from: kg */
    public LiveData mo72367kg() {
        return this.f83542D;
    }

    /* renamed from: kv */
    public void mo72352kv() {
        this.f83552l.incrementAndGet();
        this.f83553m.onNext(C41238w.f97225a);
        m101410Cw();
    }

    /* renamed from: pw */
    public final C31913g mo84083pw() {
        return this.f83555o;
    }

    /* renamed from: qw */
    public C1644x mo72365i1() {
        return this.f83562v;
    }

    /* renamed from: rw */
    public C1644x mo72368p0() {
        return this.f83560t;
    }

    /* renamed from: sw */
    public C1644x mo72359S2() {
        return this.f83543E;
    }

    /* renamed from: tw */
    public C1644x mo72362Z0() {
        return this.f83563w;
    }

    /* renamed from: uw */
    public C1644x mo72363Z1() {
        return this.f83539A;
    }

    /* renamed from: vw */
    public C1644x mo72361V1() {
        return this.f83565y;
    }

    /* renamed from: ww */
    public C1644x mo72360U2() {
        return this.f83564x;
    }

    /* renamed from: xw */
    public C1644x mo72366k1() {
        return this.f83566z;
    }

    /* renamed from: yw */
    public C1644x mo72355N1() {
        return this.f83561u;
    }

    /* renamed from: z2 */
    public void mo72353z2(C32041b bVar) {
        C41536l.m120489i(bVar, "settingsItem");
        if (bVar instanceof C32041b.C32042a) {
            m101421Nw((C32041b.C32042a) bVar);
        } else if (bVar instanceof C32041b.C32050b) {
            m101425Rw((C32041b.C32050b) bVar);
        }
    }

    /* renamed from: zm */
    public LiveData mo72369zm() {
        return this.f83558r;
    }

    /* renamed from: zw */
    public final C31914h mo84093zw() {
        return this.f83554n;
    }
}
