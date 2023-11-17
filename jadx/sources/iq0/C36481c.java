package iq0;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.C1819o;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.C41536l;
import o31.C37599g;
import sp0.C38505x;

/* renamed from: iq0.c */
public final class C36481c extends C1819o {

    /* renamed from: f */
    private final C36482a f87982f;

    /* renamed from: iq0.c$a */
    public interface C36482a {
        /* renamed from: a */
        void mo71995a(int i);
    }

    /* renamed from: iq0.c$b */
    public static final class C36483b extends RecyclerView.C1734f0 {

        /* renamed from: d */
        private final C38505x f87983d;

        /* renamed from: e */
        private final C36482a f87984e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C36483b(C38505x xVar, C36482a aVar) {
            super(xVar.mo3946b());
            C41536l.m120489i(xVar, "binding");
            C41536l.m120489i(aVar, "onTermClicked");
            this.f87983d = xVar;
            this.f87984e = aVar;
        }

        /* access modifiers changed from: private */
        /* renamed from: j */
        public static final void m108222j(C36483b bVar, int i, View view) {
            C41536l.m120489i(bVar, "this$0");
            bVar.f87984e.mo71995a(i);
        }

        /* renamed from: i */
        public final void mo89283i(int i) {
            this.f87983d.f92302g.setText(String.valueOf(i));
            this.f87983d.mo3946b().setOnClickListener(new C36484d(this, i));
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C36481c(C36482a aVar) {
        super(C37599g.f90345a.mo90787d());
        C41536l.m120489i(aVar, "onTermClicked");
        this.f87982f = aVar;
    }

    /* renamed from: k */
    public void onBindViewHolder(C36483b bVar, int i) {
        C41536l.m120489i(bVar, "holder");
        Object g = mo6027g(i);
        C41536l.m120488h(g, "getItem(position)");
        bVar.mo89283i(((Number) g).intValue());
    }

    /* renamed from: l */
    public C36483b onCreateViewHolder(ViewGroup viewGroup, int i) {
        C41536l.m120489i(viewGroup, "parent");
        C38505x d = C38505x.m113035d(LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
        C41536l.m120488h(d, "inflate(\n               …      false\n            )");
        return new C36483b(d, this.f87982f);
    }
}
