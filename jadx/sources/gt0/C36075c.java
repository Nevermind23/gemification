package gt0;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.recyclerview.widget.C1819o;
import androidx.recyclerview.widget.RecyclerView;
import g91.C32303f;
import g91.C32343x;
import kotlin.jvm.internal.C41536l;
import p341ge.bog.mobilebank.loyaltyandbonusprograms.presentation.model.piggybank.CasDetailsUiModel;
import p615tg.C17963d;
import vs0.C39458q;

/* renamed from: gt0.c */
public final class C36075c extends C1819o {

    /* renamed from: gt0.c$a */
    public static final class C36076a extends RecyclerView.C1734f0 {

        /* renamed from: d */
        private final C39458q f87206d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C36076a(C39458q qVar) {
            super(qVar.mo3946b());
            C41536l.m120489i(qVar, "binding");
            this.f87206d = qVar;
            qVar.f93838f.setText(C32343x.m95388F("cas.details.available.amount", new Object[0]));
        }

        /* renamed from: h */
        public final void mo88796h(CasDetailsUiModel casDetailsUiModel) {
            C41536l.m120489i(casDetailsUiModel, "details");
            this.f87206d.f93837e.setText(C32303f.m95200k(casDetailsUiModel.mo75132i().mo75085d(), casDetailsUiModel.mo75133j()));
        }
    }

    public C36075c() {
        super(C17963d.f51158a.mo45633d());
    }

    /* renamed from: k */
    public void onBindViewHolder(C36076a aVar, int i) {
        C41536l.m120489i(aVar, "holder");
        Object g = mo6027g(i);
        C41536l.m120488h(g, "getItem(position)");
        aVar.mo88796h((CasDetailsUiModel) g);
    }

    /* renamed from: l */
    public C36076a onCreateViewHolder(ViewGroup viewGroup, int i) {
        C41536l.m120489i(viewGroup, "parent");
        C39458q d = C39458q.m114688d(LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
        C41536l.m120488h(d, "inflate(\n            Lay…, parent, false\n        )");
        return new C36076a(d);
    }
}
