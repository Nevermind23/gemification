package pf0;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.recyclerview.widget.C1819o;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.C41536l;
import p341ge.bog.mobilebank.shared.helper.C34646b;
import p615tg.C17963d;
import qf0.C27791b;
import ue0.C28743o0;

/* renamed from: pf0.c */
public final class C27522c extends C1819o {

    /* renamed from: pf0.c$a */
    public static final class C27523a extends RecyclerView.C1734f0 {

        /* renamed from: d */
        private final C28743o0 f70416d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C27523a(C28743o0 o0Var) {
            super(o0Var.mo3946b());
            C41536l.m120489i(o0Var, "binding");
            this.f70416d = o0Var;
        }

        /* renamed from: h */
        public final void mo66842h(C27791b bVar) {
            C41536l.m120489i(bVar, "item");
            this.f70416d.f73403e.setTitle(C34646b.m101752f(bVar.mo67329d(), (Context) null, 1, (Object) null));
            this.f70416d.f73403e.setText(C34646b.m101752f(bVar.mo67328c(), (Context) null, 1, (Object) null));
            this.f70416d.f73403e.setImage(bVar.mo67327b());
        }
    }

    public C27522c() {
        super(C17963d.f51158a.mo45633d());
    }

    /* renamed from: k */
    public void onBindViewHolder(C27523a aVar, int i) {
        C41536l.m120489i(aVar, "holder");
        Object g = mo6027g(i);
        C41536l.m120488h(g, "getItem(position)");
        aVar.mo66842h((C27791b) g);
    }

    /* renamed from: l */
    public C27523a onCreateViewHolder(ViewGroup viewGroup, int i) {
        C41536l.m120489i(viewGroup, "parent");
        C28743o0 d = C28743o0.m88098d(LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
        C41536l.m120488h(d, "inflate(\n            Lay…, parent, false\n        )");
        return new C27523a(d);
    }
}
