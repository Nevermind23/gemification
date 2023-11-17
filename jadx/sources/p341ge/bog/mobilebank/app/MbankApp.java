package p341ge.bog.mobilebank.app;

import f41.C31923a;
import f41.C31924b;
import kotlin.jvm.internal.C41536l;
import p395dk.C12291f0;
import p395dk.C12305r;
import q31.C38117b;
import q31.C38119c;
import q31.C38120d;
import q31.C38121e;
import q31.C38122f;
import q31.C38124g;
import q31.C38126i;
import q31.C38127j;
import r31.C38281a;
import r31.C38283b;
import x41.C39780a;

/* renamed from: ge.bog.mobilebank.app.MbankApp */
public final class MbankApp extends C12305r implements C38124g {

    /* renamed from: F */
    public C12291f0 f40619F;

    /* renamed from: G */
    public C38117b f40620G;

    /* renamed from: H */
    public C39780a f40621H;

    /* renamed from: I */
    public C31923a f40622I;

    /* renamed from: J */
    public C38126i f40623J;

    /* renamed from: K */
    public C38127j f40624K;

    /* renamed from: L */
    public C38119c f40625L;

    /* renamed from: M */
    public C38121e f40626M;

    /* renamed from: A0 */
    public final C38117b mo37162A0() {
        C38117b bVar = this.f40620G;
        if (bVar != null) {
            return bVar;
        }
        C41536l.m120506z("appNavigator");
        return null;
    }

    /* renamed from: B0 */
    public final C38119c mo37163B0() {
        C38119c cVar = this.f40625L;
        if (cVar != null) {
            return cVar;
        }
        C41536l.m120506z("gamificationNavigator");
        return null;
    }

    /* renamed from: C0 */
    public final C38121e mo37164C0() {
        C38121e eVar = this.f40626M;
        if (eVar != null) {
            return eVar;
        }
        C41536l.m120506z("giftCardsNavigator");
        return null;
    }

    /* renamed from: D0 */
    public final C39780a mo37165D0() {
        C39780a aVar = this.f40621H;
        if (aVar != null) {
            return aVar;
        }
        C41536l.m120506z("serverStatusMonitor");
        return null;
    }

    /* renamed from: E0 */
    public final C38126i mo37166E0() {
        C38126i iVar = this.f40623J;
        if (iVar != null) {
            return iVar;
        }
        C41536l.m120506z("settingsNavigator");
        return null;
    }

    /* renamed from: F0 */
    public final C12291f0 mo37167F0() {
        C12291f0 f0Var = this.f40619F;
        if (f0Var != null) {
            return f0Var;
        }
        C41536l.m120506z("setupPaymentConfiguration");
        return null;
    }

    /* renamed from: G0 */
    public final C31923a mo37168G0() {
        C31923a aVar = this.f40622I;
        if (aVar != null) {
            return aVar;
        }
        C41536l.m120506z("sharedTools");
        return null;
    }

    /* renamed from: a */
    public C38122f mo37169a() {
        return mo37162A0();
    }

    /* renamed from: b */
    public C38120d mo37170b() {
        return mo37164C0();
    }

    /* renamed from: c */
    public C38283b mo37171c() {
        return mo37166E0();
    }

    /* renamed from: d */
    public C31924b mo37172d() {
        return mo37168G0();
    }

    /* renamed from: g */
    public C38281a mo37173g() {
        return mo37163B0();
    }

    public void onCreate() {
        super.onCreate();
        mo37167F0().mo32898f();
        mo37165D0().mo93513b();
    }
}
