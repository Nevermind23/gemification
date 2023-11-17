package bm0;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.recyclerview.widget.C1819o;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.C41536l;
import o31.C37599g;
import z71.C40186m;

/* renamed from: bm0.a */
public final class C19396a extends C1819o {

    /* renamed from: bm0.a$a */
    public static final class C19397a extends RecyclerView.C1734f0 {

        /* renamed from: d */
        private final C40186m f53620d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C19397a(C40186m mVar) {
            super(mVar.mo3946b());
            C41536l.m120489i(mVar, "binding");
            this.f53620d = mVar;
        }

        /* renamed from: h */
        public final void mo47618h(C19398b bVar) {
            C41536l.m120489i(bVar, "item");
            this.f53620d.f95545e.setText(bVar.mo47619a());
        }
    }

    public C19396a() {
        super(C37599g.f90345a.mo90787d());
    }

    /* renamed from: k */
    public void onBindViewHolder(C19397a aVar, int i) {
        C41536l.m120489i(aVar, "holder");
        Object g = mo6027g(i);
        C41536l.m120488h(g, "getItem(position)");
        aVar.mo47618h((C19398b) g);
    }

    /* renamed from: l */
    public C19397a onCreateViewHolder(ViewGroup viewGroup, int i) {
        C41536l.m120489i(viewGroup, "parent");
        C40186m d = C40186m.m116452d(LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
        C41536l.m120488h(d, "inflate(\n            Lay…          false\n        )");
        return new C19397a(d);
    }
}
