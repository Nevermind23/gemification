package cc0;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.C1819o;
import androidx.recyclerview.widget.RecyclerView;
import ec0.C20210b;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p341ge.bog.designsystem.components.bannercard.BannerCard;
import p341ge.bog.designsystem.components.common.Image;
import p341ge.bog.mobilebank.shared.helper.C34646b;
import p615tg.C17963d;
import xb0.C29727o;

/* renamed from: cc0.c */
public final class C19695c extends C1819o {

    /* renamed from: f */
    private final C19697d f54037f;

    /* renamed from: g */
    private final C19698e f54038g;

    /* renamed from: cc0.c$a */
    public static final class C19696a extends RecyclerView.C1734f0 {

        /* renamed from: d */
        private final C29727o f54039d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C19696a(C29727o oVar) {
            super(oVar.mo3946b());
            C41536l.m120489i(oVar, "binding");
            this.f54039d = oVar;
        }

        /* access modifiers changed from: private */
        /* renamed from: k */
        public static final void m65364k(C19698e eVar, C20210b bVar, View view) {
            C41536l.m120489i(eVar, "$onBannerClosed");
            C41536l.m120489i(bVar, "$banner");
            eVar.mo47896a(bVar);
        }

        /* access modifiers changed from: private */
        /* renamed from: l */
        public static final void m65365l(C19697d dVar, C20210b bVar, View view) {
            C41536l.m120489i(dVar, "$onBannerClicked");
            C41536l.m120489i(bVar, "$banner");
            dVar.mo47895a(bVar);
        }

        /* renamed from: j */
        public final void mo47894j(C20210b bVar, C19697d dVar, C19698e eVar) {
            C41536l.m120489i(bVar, "banner");
            C41536l.m120489i(dVar, "onBannerClicked");
            C41536l.m120489i(eVar, "onBannerClosed");
            BannerCard c = this.f54039d.mo3946b();
            c.setInfoText(C34646b.m101752f(bVar.mo48621b(), (Context) null, 1, (Object) null));
            c.setShowMoreText(C34646b.m101752f(bVar.mo48622c(), (Context) null, 1, (Object) null));
            c.setBannerImage(new Image.Resource(bVar.mo48623e(), (Boolean) null, 2, (DefaultConstructorMarker) null));
            c.setTintColor(Integer.valueOf(bVar.mo48624f()));
            c.setCloseButtonClickListener(new C19693a(eVar, bVar));
            c.setOnClickListener(new C19694b(dVar, bVar));
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C19695c(C19697d dVar, C19698e eVar) {
        super(C17963d.f51158a.mo45633d());
        C41536l.m120489i(dVar, "onBannerClicked");
        C41536l.m120489i(eVar, "onBannerClosed");
        this.f54037f = dVar;
        this.f54038g = eVar;
    }

    /* renamed from: k */
    public void onBindViewHolder(C19696a aVar, int i) {
        C41536l.m120489i(aVar, "holder");
        Object g = mo6027g(i);
        C41536l.m120488h(g, "getItem(position)");
        aVar.mo47894j((C20210b) g, this.f54037f, this.f54038g);
    }

    /* renamed from: l */
    public C19696a onCreateViewHolder(ViewGroup viewGroup, int i) {
        C41536l.m120489i(viewGroup, "parent");
        C29727o d = C29727o.m90274d(LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
        C41536l.m120488h(d, "inflate(LayoutInflater.f….context), parent, false)");
        return new C19696a(d);
    }
}
