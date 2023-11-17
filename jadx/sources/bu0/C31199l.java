package bu0;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.recyclerview.widget.C1819o;
import androidx.recyclerview.widget.RecyclerView;
import du0.C31606a;
import g91.C32343x;
import java.util.List;
import kotlin.jvm.internal.C41536l;
import o31.C37599g;
import vt0.C39470g;

/* renamed from: bu0.l */
public final class C31199l extends C1819o {

    /* renamed from: bu0.l$a */
    public final class C31200a extends RecyclerView.C1734f0 {

        /* renamed from: d */
        private final C39470g f77496d;

        /* renamed from: e */
        final /* synthetic */ C31199l f77497e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C31200a(C31199l lVar, C39470g gVar) {
            super(gVar.mo3946b());
            C41536l.m120489i(gVar, "binding");
            this.f77497e = lVar;
            this.f77496d = gVar;
        }

        /* renamed from: h */
        public final void mo71427h(C31606a aVar) {
            C41536l.m120489i(aVar, "newsKeyUI");
            this.f77496d.f93907e.setText(C32343x.m95388F(aVar.mo72017a(), new Object[0]));
        }
    }

    public C31199l() {
        super(C37599g.f90345a.mo90787d());
    }

    /* renamed from: i */
    public void mo6029i(List list) {
        super.mo6029i(list);
    }

    /* renamed from: k */
    public void onBindViewHolder(C31200a aVar, int i) {
        C41536l.m120489i(aVar, "holder");
        Object g = mo6027g(i);
        C41536l.m120488h(g, "getItem(position)");
        aVar.mo71427h((C31606a) g);
    }

    /* renamed from: l */
    public C31200a onCreateViewHolder(ViewGroup viewGroup, int i) {
        C41536l.m120489i(viewGroup, "parent");
        C39470g d = C39470g.m114737d(LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
        C41536l.m120488h(d, "inflate(\n               …      false\n            )");
        return new C31200a(this, d);
    }
}
