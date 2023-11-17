package p621tm;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.recyclerview.widget.C1819o;
import androidx.recyclerview.widget.RecyclerView;
import com.bumptech.glide.C2379b;
import com.bumptech.glide.C2394j;
import kotlin.jvm.internal.C41536l;
import p341ge.bog.mobilebank.shared.helper.ImageSource;
import p369bn.C10338b;
import p481jm.C16223d0;
import p615tg.C17963d;

/* renamed from: tm.c */
public final class C17994c extends C1819o {

    /* renamed from: tm.c$a */
    public static final class C17995a extends RecyclerView.C1734f0 {

        /* renamed from: d */
        private final C16223d0 f51217d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C17995a(C16223d0 d0Var) {
            super(d0Var.mo3946b());
            C41536l.m120489i(d0Var, "binding");
            this.f51217d = d0Var;
        }

        /* renamed from: h */
        public final void mo45688h(C10338b bVar) {
            C41536l.m120489i(bVar, "header");
            ImageSource a = bVar.mo26933a();
            if (a instanceof ImageSource.Resource) {
                this.f51217d.f45789e.setImageResource(((ImageSource.Resource) bVar.mo26933a()).mo84372a());
            } else if (a instanceof ImageSource.Url) {
                ((C2394j) ((C2394j) C2379b.m9211u(this.f51217d.f45789e).mo7757y(((ImageSource.Url) bVar.mo26933a()).mo84384d()).mo7232j(bVar.mo26934b())).mo7220c0(bVar.mo26934b())).mo7718L0(this.f51217d.f45789e);
            }
            this.f51217d.f45790f.setText(bVar.mo26935c());
        }
    }

    public C17994c() {
        super(C17963d.f51158a.mo45633d());
    }

    /* renamed from: k */
    public void onBindViewHolder(C17995a aVar, int i) {
        C41536l.m120489i(aVar, "holder");
        Object g = mo6027g(i);
        C41536l.m120488h(g, "getItem(position)");
        aVar.mo45688h((C10338b) g);
    }

    /* renamed from: l */
    public C17995a onCreateViewHolder(ViewGroup viewGroup, int i) {
        C41536l.m120489i(viewGroup, "parent");
        C16223d0 d = C16223d0.m57821d(LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
        C41536l.m120488h(d, "inflate(\n            Lay…, parent, false\n        )");
        return new C17995a(d);
    }
}
