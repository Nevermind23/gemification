package p576qj;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.recyclerview.widget.C1819o;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.C41536l;
import p341ge.bog.designsystem.components.thumbnailbadgecard.ThumbnailBadgeCardView;
import p352ak.C10015t;
import p615tg.C17963d;

/* renamed from: qj.a */
public final class C17513a extends C1819o {

    /* renamed from: qj.a$a */
    public final class C17514a extends RecyclerView.C1734f0 {

        /* renamed from: d */
        private final C10015t f49043d;

        /* renamed from: e */
        final /* synthetic */ C17513a f49044e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C17514a(C17513a aVar, C10015t tVar) {
            super(tVar.mo3946b());
            C41536l.m120489i(tVar, "binding");
            this.f49044e = aVar;
            this.f49043d = tVar;
        }

        /* renamed from: h */
        public final void mo45037h(ThumbnailBadgeCardView.C13546c cVar) {
            C41536l.m120489i(cVar, "item");
            this.f49043d.f27549e.setText(cVar.mo36953b());
            this.f49043d.f27549e.setIconProperties(cVar.mo36952a());
        }
    }

    public C17513a() {
        super(C17963d.f51158a.mo45633d());
    }

    /* renamed from: k */
    public void onBindViewHolder(C17514a aVar, int i) {
        C41536l.m120489i(aVar, "holder");
        Object obj = mo6026f().get(i);
        C41536l.m120488h(obj, "currentList[position]");
        aVar.mo45037h((ThumbnailBadgeCardView.C13546c) obj);
    }

    /* renamed from: l */
    public C17514a onCreateViewHolder(ViewGroup viewGroup, int i) {
        C41536l.m120489i(viewGroup, "parent");
        C10015t d = C10015t.m36734d(LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
        C41536l.m120488h(d, "inflate(\n               …      false\n            )");
        return new C17514a(this, d);
    }
}
