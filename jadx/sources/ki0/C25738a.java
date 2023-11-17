package ki0;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.recyclerview.widget.C1819o;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.C41536l;
import o31.C37599g;
import th0.C28431v0;

/* renamed from: ki0.a */
public final class C25738a extends C1819o {

    /* renamed from: ki0.a$a */
    public static final class C25739a extends RecyclerView.C1734f0 {

        /* renamed from: d */
        private final C28431v0 f65499d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C25739a(C28431v0 v0Var) {
            super(v0Var.mo3946b());
            C41536l.m120489i(v0Var, "binding");
            this.f65499d = v0Var;
        }

        /* renamed from: h */
        public final void mo64312h(String str) {
            C41536l.m120489i(str, "store");
            this.f65499d.f72224e.setText(str);
        }
    }

    public C25738a() {
        super(C37599g.f90345a.mo90787d());
    }

    /* renamed from: k */
    public void onBindViewHolder(C25739a aVar, int i) {
        C41536l.m120489i(aVar, "holder");
        Object g = mo6027g(i);
        C41536l.m120488h(g, "getItem(position)");
        aVar.mo64312h((String) g);
    }

    /* renamed from: l */
    public C25739a onCreateViewHolder(ViewGroup viewGroup, int i) {
        C41536l.m120489i(viewGroup, "parent");
        C28431v0 d = C28431v0.m87247d(LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
        C41536l.m120488h(d, "inflate(\n            Lay…          false\n        )");
        return new C25739a(d);
    }
}
