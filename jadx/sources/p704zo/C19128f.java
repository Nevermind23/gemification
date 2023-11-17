package p704zo;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.C1819o;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.C41536l;
import o31.C37599g;
import p341ge.bog.mobilebank.categorypackages.presentation.application.secondstage.solo_lounge_selector.model.SoloLoungeItem;
import p413eo.C12769s0;

/* renamed from: zo.f */
public final class C19128f extends C1819o {

    /* renamed from: f */
    private final C19129a f53304f;

    /* renamed from: zo.f$a */
    public interface C19129a {
        /* renamed from: a */
        void mo47311a(SoloLoungeItem soloLoungeItem);
    }

    /* renamed from: zo.f$b */
    public static final class C19130b extends RecyclerView.C1734f0 {

        /* renamed from: d */
        private final C12769s0 f53305d;

        /* renamed from: e */
        private final C19129a f53306e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C19130b(C12769s0 s0Var, C19129a aVar) {
            super(s0Var.mo3946b());
            C41536l.m120489i(s0Var, "binding");
            C41536l.m120489i(aVar, "onSoloLoungeListItemClick");
            this.f53305d = s0Var;
            this.f53306e = aVar;
        }

        /* access modifiers changed from: private */
        /* renamed from: j */
        public static final void m64497j(C19130b bVar, SoloLoungeItem soloLoungeItem, View view) {
            C41536l.m120489i(bVar, "this$0");
            C41536l.m120489i(soloLoungeItem, "$item");
            bVar.f53306e.mo47311a(soloLoungeItem);
        }

        /* renamed from: i */
        public final void mo47326i(SoloLoungeItem soloLoungeItem) {
            C41536l.m120489i(soloLoungeItem, "item");
            this.f53305d.f37861f.setText(soloLoungeItem.mo40895e());
            this.f53305d.mo3946b().setOnClickListener(new C19131g(this, soloLoungeItem));
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C19128f(C19129a aVar) {
        super(C37599g.f90345a.mo90787d());
        C41536l.m120489i(aVar, "onSoloLoungeListItemClick");
        this.f53304f = aVar;
    }

    /* renamed from: k */
    public void onBindViewHolder(C19130b bVar, int i) {
        C41536l.m120489i(bVar, "holder");
        Object obj = mo6026f().get(i);
        C41536l.m120488h(obj, "currentList[position]");
        bVar.mo47326i((SoloLoungeItem) obj);
    }

    /* renamed from: l */
    public C19130b onCreateViewHolder(ViewGroup viewGroup, int i) {
        C41536l.m120489i(viewGroup, "parent");
        C12769s0 d = C12769s0.m48476d(LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
        C41536l.m120488h(d, "inflate(\n               …      false\n            )");
        return new C19130b(d, this.f53304f);
    }
}
