package tx0;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.recyclerview.widget.C1819o;
import androidx.recyclerview.widget.RecyclerView;
import jx0.C36835q;
import kotlin.jvm.internal.C41536l;
import o31.C37599g;
import ox0.C37834d;
import u61.C39033a;

/* renamed from: tx0.i */
public final class C38845i extends C1819o {

    /* renamed from: f */
    private final C38846a f92922f;

    /* renamed from: tx0.i$a */
    public interface C38846a {
        /* renamed from: a */
        void mo92225a(C39033a aVar);
    }

    /* renamed from: tx0.i$b */
    public static final class C38847b extends RecyclerView.C1734f0 {

        /* renamed from: d */
        private final C36835q f92923d;

        /* renamed from: e */
        private final C38846a f92924e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C38847b(C36835q qVar, C38846a aVar) {
            super(qVar.mo3946b());
            C41536l.m120489i(qVar, "binding");
            C41536l.m120489i(aVar, "onTemplateClickedListener");
            this.f92923d = qVar;
            this.f92924e = aVar;
        }

        /* access modifiers changed from: private */
        /* renamed from: j */
        public static final void m113660j(C38847b bVar, C39033a aVar, View view) {
            C41536l.m120489i(bVar, "this$0");
            C41536l.m120489i(aVar, "$item");
            bVar.f92924e.mo92225a(aVar);
        }

        /* renamed from: i */
        public final void mo92557i(C39033a aVar) {
            C41536l.m120489i(aVar, "item");
            C36835q qVar = this.f92923d;
            qVar.f88895e.setOnClickListener(new C38848j(this, aVar));
            qVar.f88897g.setText(aVar.mo92704g());
            AppCompatImageView appCompatImageView = qVar.f88896f;
            C41536l.m120488h(appCompatImageView, "icon");
            C37834d.m111290b(aVar, appCompatImageView);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C38845i(C38846a aVar) {
        super(C37599g.f90345a.mo90787d());
        C41536l.m120489i(aVar, "onTemplateClickedListener");
        this.f92922f = aVar;
    }

    /* renamed from: k */
    public void onBindViewHolder(C38847b bVar, int i) {
        C41536l.m120489i(bVar, "holder");
        Object g = mo6027g(i);
        C41536l.m120488h(g, "getItem(position)");
        bVar.mo92557i((C39033a) g);
    }

    /* renamed from: l */
    public C38847b onCreateViewHolder(ViewGroup viewGroup, int i) {
        C41536l.m120489i(viewGroup, "parent");
        C36835q d = C36835q.m109153d(LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
        C41536l.m120488h(d, "inflate(\n               …rent, false\n            )");
        return new C38847b(d, this.f92922f);
    }
}
