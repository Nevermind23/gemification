package g20;

import androidx.recyclerview.widget.RecyclerView;
import ih0.C25209b;
import kotlin.jvm.internal.C41536l;
import p341ge.bog.mobilebank.cleanarch.gamification.views.GamificationBanner;
import p90.C27384o4;

/* renamed from: g20.k */
public final class C20619k extends RecyclerView.C1734f0 {

    /* renamed from: d */
    private final C27384o4 f55699d;

    /* renamed from: e */
    private final GamificationBanner.C21046a f55700e;

    /* renamed from: f */
    private final GamificationBanner.C21046a f55701f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C20619k(C27384o4 o4Var, GamificationBanner.C21046a aVar, GamificationBanner.C21046a aVar2) {
        super(o4Var.mo3946b());
        C41536l.m120489i(o4Var, "binding");
        C41536l.m120489i(aVar, "onBannerClicked");
        C41536l.m120489i(aVar2, "onBannerClosed");
        this.f55699d = o4Var;
        this.f55700e = aVar;
        this.f55701f = aVar2;
        o4Var.mo3946b().setOnBannerClicked(aVar);
        o4Var.mo3946b().setOnBannerClosed(aVar2);
    }

    /* renamed from: h */
    public final void mo49168h(C25209b bVar) {
        C41536l.m120489i(bVar, "gamificationBannerType");
        this.f55699d.mo3946b().setBannerType(bVar);
    }
}
