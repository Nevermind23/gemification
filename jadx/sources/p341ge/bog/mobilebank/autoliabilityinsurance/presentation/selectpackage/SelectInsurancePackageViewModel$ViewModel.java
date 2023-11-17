package p341ge.bog.mobilebank.autoliabilityinsurance.presentation.selectpackage;

import androidx.lifecycle.C1644x;
import ed1.C40749p;
import g91.C32343x;
import hd1.C41204a;
import hd1.C41205b;
import he1.C41238w;
import java.util.List;
import kotlin.jvm.internal.C41535k;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p341ge.bog.mobilebank.cleanarch.presentation.common.C21481a;
import p438gl.C15295e;
import p438gl.C15296f;
import p438gl.C15297g;
import p438gl.C15298h;
import p438gl.C15299i;
import p466il.C15699a;
import p535nk.C17035o;
import p535nk.C17042t;
import p563pk.C17371a;
import ue1.C43075l;

/* renamed from: ge.bog.mobilebank.autoliabilityinsurance.presentation.selectpackage.SelectInsurancePackageViewModel$ViewModel */
public final class SelectInsurancePackageViewModel$ViewModel extends C21481a implements C15296f, C15297g {

    /* renamed from: d */
    private final C17042t f40983d;

    /* renamed from: e */
    private final C15296f f40984e = this;

    /* renamed from: f */
    private final C15297g f40985f = this;

    /* renamed from: g */
    private final C1644x f40986g = new C1644x();

    /* renamed from: ge.bog.mobilebank.autoliabilityinsurance.presentation.selectpackage.SelectInsurancePackageViewModel$ViewModel$a */
    /* synthetic */ class C13753a extends C41535k implements C43075l {
        C13753a(Object obj) {
            super(1, obj, C15699a.class, "covert", "covert(Lge/bog/mobilebank/autoliabilityinsurance/domain/model/AutoLiabilityInsuranceProvider;)Lge/bog/mobilebank/autoliabilityinsurance/presentation/selectpackage/SelectInsurancePackageUiState;", 0);
        }

        /* renamed from: b */
        public final C15295e invoke(C17371a aVar) {
            C41536l.m120489i(aVar, "p0");
            return ((C15699a) this.receiver).mo43009a(aVar);
        }
    }

    /* renamed from: ge.bog.mobilebank.autoliabilityinsurance.presentation.selectpackage.SelectInsurancePackageViewModel$ViewModel$b */
    static final class C13754b extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ SelectInsurancePackageViewModel$ViewModel f40987d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C13754b(SelectInsurancePackageViewModel$ViewModel selectInsurancePackageViewModel$ViewModel) {
            super(1);
            this.f40987d = selectInsurancePackageViewModel$ViewModel;
        }

        /* renamed from: a */
        public final void mo37656a(C15295e eVar) {
            this.f40987d.mo37653md().mo4826r(eVar);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo37656a((C15295e) obj);
            return C41238w.f97225a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SelectInsurancePackageViewModel$ViewModel(C17035o oVar, C15699a aVar, C17042t tVar) {
        super((C41204a) null, 1, (DefaultConstructorMarker) null);
        C41536l.m120489i(oVar, "getSelectedProvider");
        C41536l.m120489i(aVar, "selectPackageUiStateMapper");
        C41536l.m120489i(tVar, "onPackageSelectedUseCase");
        this.f40983d = tVar;
        C40749p k0 = oVar.mo44226c().mo95026k0(new C15298h(new C13753a(aVar)));
        C41536l.m120488h(k0, "getSelectedProvider()\n  …ageUiStateMapper::covert)");
        C41205b F0 = C32343x.m95413R0(k0).mo94981F0(new C15299i(new C13754b(this)));
        C41536l.m120488h(F0, "getSelectedProvider()\n  …ue = it\n                }");
        bindToLifecycle(F0);
    }

    /* access modifiers changed from: private */
    /* renamed from: fw */
    public static final C15295e m51374fw(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (C15295e) lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: gw */
    public static final void m51375gw(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* renamed from: hw */
    public final C15296f mo37650hw() {
        return this.f40984e;
    }

    /* renamed from: iw */
    public final C15297g mo37651iw() {
        return this.f40985f;
    }

    /* renamed from: jw */
    public C1644x mo37653md() {
        return this.f40986g;
    }

    /* renamed from: z0 */
    public void mo37654z0(int i) {
        C15295e eVar;
        boolean z;
        this.f40983d.mo44233a(i);
        C1644x jw = mo37653md();
        C15295e eVar2 = (C15295e) mo37653md().mo4814f();
        if (eVar2 != null) {
            if (i != -1) {
                z = true;
            } else {
                z = false;
            }
            eVar = C15295e.m55691b(eVar2, (String) null, (String) null, (String) null, (List) null, z, 15, (Object) null);
        } else {
            eVar = null;
        }
        jw.mo4826r(eVar);
    }
}
