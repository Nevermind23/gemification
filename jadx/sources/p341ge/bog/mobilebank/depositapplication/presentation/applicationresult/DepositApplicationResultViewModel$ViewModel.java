package p341ge.bog.mobilebank.depositapplication.presentation.applicationresult;

import androidx.lifecycle.C1644x;
import c41.C31270e;
import g91.C32343x;
import hd1.C41204a;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ky0.C37020g;
import m41.C37224b;
import p341ge.bog.mobilebank.cleanarch.presentation.common.C21481a;
import sa0.C28168c;
import sa0.C28169d;
import xd0.C29742a;
import yd0.C29991a;

/* renamed from: ge.bog.mobilebank.depositapplication.presentation.applicationresult.DepositApplicationResultViewModel$ViewModel */
public final class DepositApplicationResultViewModel$ViewModel extends C21481a implements C28168c, C28169d {

    /* renamed from: d */
    private final C37020g f60193d;

    /* renamed from: e */
    private final C28168c f60194e = this;

    /* renamed from: f */
    private final C28169d f60195f = this;

    /* renamed from: g */
    private final C1644x f60196g = new C1644x();

    /* renamed from: h */
    private final C1644x f60197h = new C1644x();

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DepositApplicationResultViewModel$ViewModel(C29742a aVar, C37020g gVar) {
        super((C41204a) null, 1, (DefaultConstructorMarker) null);
        C41536l.m120489i(aVar, "getClientCampaignInfo");
        C41536l.m120489i(gVar, "refreshDepositsAndBonds");
        this.f60193d = gVar;
        bindToLifecycle(C31270e.m92876e(C31270e.m92880i(C32343x.m95465l1(aVar.mo47470a(C29991a.C29994c.C29998d.f75810e)), -1), mo56909C3()));
    }

    /* renamed from: K5 */
    public void mo56910K5() {
        this.f60193d.mo89943a();
        C37224b.m109962a(mo56911X());
    }

    /* renamed from: dw */
    public C1644x mo56911X() {
        return this.f60197h;
    }

    /* renamed from: ew */
    public C1644x mo56909C3() {
        return this.f60196g;
    }

    /* renamed from: fw */
    public final C28168c mo56914fw() {
        return this.f60194e;
    }

    /* renamed from: gw */
    public final C28169d mo56915gw() {
        return this.f60195f;
    }
}
