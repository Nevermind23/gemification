package p341ge.bog.mobilebank.linksharing.presentation;

import androidx.lifecycle.C1644x;
import cp0.C12025d;
import cp0.C12026e;
import fp0.C12955b;
import fp0.C12956c;
import fp0.C12957d;
import g91.C32343x;
import hd1.C41204a;
import hd1.C41205b;
import he1.C41238w;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import m41.C37224b;
import p341ge.bog.mobilebank.cleanarch.presentation.common.C21481a;
import ue1.C43075l;

/* renamed from: ge.bog.mobilebank.linksharing.presentation.P2PLinkViewModel$ViewModel */
public final class P2PLinkViewModel$ViewModel extends C21481a implements C12955b, C12956c {

    /* renamed from: d */
    private final C12026e f43420d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public final C12025d f43421e;

    /* renamed from: f */
    private final C12955b f43422f = this;

    /* renamed from: g */
    private final C12956c f43423g = this;

    /* renamed from: h */
    private final C1644x f43424h = new C1644x();

    /* renamed from: ge.bog.mobilebank.linksharing.presentation.P2PLinkViewModel$ViewModel$a */
    static final class C15125a extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ P2PLinkViewModel$ViewModel f43425d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C15125a(P2PLinkViewModel$ViewModel p2PLinkViewModel$ViewModel) {
            super(1);
            this.f43425d = p2PLinkViewModel$ViewModel;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Boolean) obj);
            return C41238w.f97225a;
        }

        public final void invoke(Boolean bool) {
            C41536l.m120488h(bool, "result");
            if (bool.booleanValue()) {
                C37224b.m109965d(this.f43425d.mo33720oc(), C41238w.f97225a);
                this.f43425d.f43421e.mo32119a().mo94886E();
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public P2PLinkViewModel$ViewModel(C12026e eVar, C12025d dVar) {
        super((C41204a) null, 1, (DefaultConstructorMarker) null);
        C41536l.m120489i(eVar, "p2PShowHelpTooltipUseCase");
        C41536l.m120489i(dVar, "p2PSetHelpTooltipWasShownUseCase");
        this.f43420d = eVar;
        this.f43421e = dVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: iw */
    public static final void m55321iw(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* renamed from: fw */
    public final C12955b mo42155fw() {
        return this.f43422f;
    }

    /* renamed from: gi */
    public void mo33719gi() {
        C41205b H = C32343x.m95415S0(this.f43420d.mo32120a()).mo95069H(new C12957d(new C15125a(this)));
        C41536l.m120488h(H, "override fun shouldShowP…ndToLifecycle()\n        }");
        bindToLifecycle(H);
    }

    /* renamed from: gw */
    public final C12956c mo42156gw() {
        return this.f43423g;
    }

    /* renamed from: hw */
    public C1644x mo33720oc() {
        return this.f43424h;
    }
}
