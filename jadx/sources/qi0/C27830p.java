package qi0;

import android.view.View;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import mj0.C26238b;
import oh0.C27009d;
import oi0.C27016b;
import p341ge.bog.designsystem.components.bannercard.BannerCard;
import p341ge.bog.designsystem.components.common.Image;
import pi0.C27534a;
import th0.C28393c0;

/* renamed from: qi0.p */
public final class C27830p extends C26238b {

    /* renamed from: f */
    private final C27016b f70959f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C27830p(C28393c0 c0Var, C27016b bVar) {
        super(c0Var);
        C41536l.m120489i(c0Var, "binding");
        C41536l.m120489i(bVar, "listener");
        this.f70959f = bVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: o */
    public static final void m86016o(C27830p pVar, View view) {
        C41536l.m120489i(pVar, "this$0");
        pVar.f70959f.mo61792c0();
    }

    /* renamed from: n */
    public void mo48397j(C27534a.C27543h hVar) {
        C41536l.m120489i(hVar, "item");
        BannerCard bannerCard = ((C28393c0) mo65241h()).f71992e;
        super.mo48397j(hVar);
        bannerCard.setButtonVisible(true);
        bannerCard.setBannerImage(new Image.Resource(C27009d.number_information_illustration, (Boolean) null, 2, (DefaultConstructorMarker) null));
        bannerCard.setShowMoreText(hVar.mo66898a());
        bannerCard.setInfoText(hVar.mo66899b());
        bannerCard.setOnClickListener(new C27829o(this));
    }
}
