package p546oh;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.recyclerview.widget.C1819o;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.C41536l;
import p341ge.bog.designsystem.components.cardobjective.InfoBadgeData;
import p341ge.bog.designsystem.components.infobadge.InfoBadgeView;
import p352ak.C9939j;
import p615tg.C17963d;

/* renamed from: oh.a */
public final class C17197a extends C1819o {

    /* renamed from: oh.a$a */
    public static final class C17198a extends RecyclerView.C1734f0 {

        /* renamed from: d */
        private final C9939j f48411d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C17198a(C9939j jVar) {
            super(jVar.mo3946b());
            C41536l.m120489i(jVar, "binding");
            this.f48411d = jVar;
        }

        /* renamed from: h */
        public final void mo44612h(InfoBadgeData infoBadgeData) {
            C41536l.m120489i(infoBadgeData, "item");
            InfoBadgeView infoBadgeView = this.f48411d.f27129e;
            C41536l.m120488h(infoBadgeView, "bind$lambda$0");
            InfoBadgeView.m50233e(infoBadgeView, infoBadgeData.mo35088d(), (String) null, (String) null, 6, (Object) null);
            infoBadgeView.setIcon(infoBadgeData.mo35086a());
            infoBadgeView.setSize(infoBadgeData.mo35087b());
        }
    }

    public C17197a() {
        super(C17963d.f51158a.mo45633d());
    }

    /* renamed from: k */
    public void onBindViewHolder(C17198a aVar, int i) {
        C41536l.m120489i(aVar, "holder");
        InfoBadgeData infoBadgeData = (InfoBadgeData) mo6027g(i);
        C41536l.m120487g(infoBadgeData, "null cannot be cast to non-null type ge.bog.designsystem.components.cardobjective.InfoBadgeData");
        aVar.mo44612h(infoBadgeData);
    }

    /* renamed from: l */
    public C17198a onCreateViewHolder(ViewGroup viewGroup, int i) {
        C41536l.m120489i(viewGroup, "parent");
        C9939j d = C9939j.m36455d(LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
        C41536l.m120488h(d, "inflate(inflater, parent, false)");
        return new C17198a(d);
    }
}
