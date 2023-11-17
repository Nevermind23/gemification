package dz0;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.recyclerview.widget.C1819o;
import androidx.recyclerview.widget.RecyclerView;
import ez0.C31897c;
import iy0.C36625p1;
import kotlin.jvm.internal.C41536l;
import p615tg.C17963d;

/* renamed from: dz0.a */
public final class C31627a extends C1819o {

    /* renamed from: dz0.a$a */
    public static final class C31628a extends RecyclerView.C1734f0 {

        /* renamed from: d */
        private final C36625p1 f78197d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C31628a(C36625p1 p1Var) {
            super(p1Var.mo3946b());
            C41536l.m120489i(p1Var, "binding");
            this.f78197d = p1Var;
        }

        /* renamed from: h */
        public final void mo72065h(C31897c cVar) {
            C41536l.m120489i(cVar, "info");
            this.f78197d.f88376e.setText(cVar.mo72325a());
            this.f78197d.f88377f.setText(cVar.mo72326b());
        }
    }

    public C31627a() {
        super(C17963d.f51158a.mo45633d());
    }

    /* renamed from: k */
    public void onBindViewHolder(C31628a aVar, int i) {
        C41536l.m120489i(aVar, "holder");
        Object g = mo6027g(i);
        C41536l.m120488h(g, "getItem(position)");
        aVar.mo72065h((C31897c) g);
    }

    /* renamed from: l */
    public C31628a onCreateViewHolder(ViewGroup viewGroup, int i) {
        C41536l.m120489i(viewGroup, "parent");
        C36625p1 d = C36625p1.m108636d(LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
        C41536l.m120488h(d, "inflate(\n            Lay…, parent, false\n        )");
        return new C31628a(d);
    }
}
