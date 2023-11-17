package p341ge.bog.mobilebank.autoliabilityinsurance.presentation.carnumberinput;

import androidx.lifecycle.C1644x;
import hd1.C41204a;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import m41.C37224b;
import p341ge.bog.mobilebank.cleanarch.presentation.common.C21481a;
import p535nk.C17039q;
import p591rk.C17630j;
import p591rk.C17631k;
import p591rk.C17632l;
import p591rk.C17633m;

/* renamed from: ge.bog.mobilebank.autoliabilityinsurance.presentation.carnumberinput.CarNumberInputViewModel$ViewModel */
public final class CarNumberInputViewModel$ViewModel extends C21481a implements C17632l, C17633m {

    /* renamed from: d */
    private final C17039q f40695d;

    /* renamed from: e */
    private final C17633m f40696e = this;

    /* renamed from: f */
    private final C17632l f40697f = this;

    /* renamed from: g */
    private final C1644x f40698g = new C1644x(new C17631k((String) null, (C13606a) null, false, false, 15, (DefaultConstructorMarker) null));

    /* renamed from: h */
    private final C1644x f40699h = new C1644x();

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CarNumberInputViewModel$ViewModel(C17039q qVar) {
        super((C41204a) null, 1, (DefaultConstructorMarker) null);
        C41536l.m120489i(qVar, "onCarNumberEntered");
        this.f40695d = qVar;
    }

    /* renamed from: Ep */
    public void mo37465Ep(C13606a aVar) {
        C17631k kVar;
        C41536l.m120489i(aVar, "carOwnerOption");
        C1644x xVar = this.f40698g;
        C17631k kVar2 = (C17631k) xVar.mo4814f();
        if (kVar2 != null) {
            kVar = C17631k.m61276b(kVar2, (String) null, aVar, false, false, 13, (Object) null);
        } else {
            kVar = null;
        }
        xVar.mo4826r(kVar);
    }

    /* renamed from: T3 */
    public void mo37467T3(boolean z) {
        C1644x xVar = this.f40698g;
        C17631k kVar = (C17631k) xVar.mo4814f();
        xVar.mo4826r(kVar != null ? C17631k.m61276b(kVar, (String) null, (C13606a) null, false, z, 7, (Object) null) : null);
    }

    /* renamed from: T4 */
    public void mo37468T4(String str) {
        C17631k kVar;
        C41536l.m120489i(str, "carNumber");
        C1644x xVar = this.f40698g;
        C17631k kVar2 = (C17631k) xVar.mo4814f();
        if (kVar2 != null) {
            kVar = C17631k.m61276b(kVar2, str, (C13606a) null, false, false, 14, (Object) null);
        } else {
            kVar = null;
        }
        xVar.mo4826r(kVar);
    }

    /* renamed from: dw */
    public C1644x mo37473hr() {
        return this.f40698g;
    }

    /* renamed from: ew */
    public final C17632l mo37470ew() {
        return this.f40697f;
    }

    /* renamed from: fw */
    public C1644x mo37466K3() {
        return this.f40699h;
    }

    /* renamed from: gw */
    public final C17633m mo37472gw() {
        return this.f40696e;
    }

    /* renamed from: lv */
    public void mo37474lv(boolean z) {
        C1644x xVar = this.f40698g;
        C17631k kVar = (C17631k) xVar.mo4814f();
        xVar.mo4826r(kVar != null ? C17631k.m61276b(kVar, (String) null, (C13606a) null, z, false, 11, (Object) null) : null);
    }

    /* renamed from: s2 */
    public void mo37475s2() {
        String c;
        C13606a aVar;
        C17631k kVar = (C17631k) this.f40698g.mo4814f();
        if (kVar != null && (c = kVar.mo45216c()) != null) {
            this.f40695d.mo44230a(c);
            C17631k kVar2 = (C17631k) this.f40698g.mo4814f();
            if (kVar2 != null) {
                aVar = kVar2.mo45217d();
            } else {
                aVar = null;
            }
            if (aVar == C13606a.OTHERS) {
                C37224b.m109966e(this.f40699h, C17630j.NavigateToCarOwnerInput);
            } else {
                C37224b.m109966e(this.f40699h, C17630j.NavigateToStartDateInput);
            }
        }
    }
}
