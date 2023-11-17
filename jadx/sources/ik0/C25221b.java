package ik0;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.C1819o;
import androidx.recyclerview.widget.RecyclerView;
import kk0.C25741a;
import kotlin.jvm.internal.C41536l;
import p615tg.C17963d;
import yj0.C30080b;

/* renamed from: ik0.b */
public final class C25221b extends C1819o {

    /* renamed from: f */
    private final C25223c f64788f;

    /* renamed from: ik0.b$a */
    public static final class C25222a extends RecyclerView.C1734f0 {

        /* renamed from: d */
        private final C30080b f64789d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C25222a(C30080b bVar) {
            super(bVar.mo3946b());
            C41536l.m120489i(bVar, "binding");
            this.f64789d = bVar;
        }

        /* access modifiers changed from: private */
        /* renamed from: j */
        public static final void m80289j(C25223c cVar, C25741a aVar, View view) {
            C41536l.m120489i(cVar, "$onClick");
            C41536l.m120489i(aVar, "$card");
            cVar.mo62188a(aVar);
        }

        /* renamed from: i */
        public final void mo63747i(C25741a aVar, C25223c cVar) {
            C41536l.m120489i(aVar, "card");
            C41536l.m120489i(cVar, "onClick");
            this.f64789d.mo3946b().setOnClickListener(new C25220a(cVar, aVar));
            this.f64789d.mo3946b().setCreditCard(aVar.mo64328e());
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C25221b(C25223c cVar) {
        super(C17963d.f51158a.mo45633d());
        C41536l.m120489i(cVar, "onClick");
        this.f64788f = cVar;
    }

    /* renamed from: k */
    public void onBindViewHolder(C25222a aVar, int i) {
        C41536l.m120489i(aVar, "holder");
        Object g = mo6027g(i);
        C41536l.m120488h(g, "getItem(position)");
        aVar.mo63747i((C25741a) g, this.f64788f);
    }

    /* renamed from: l */
    public C25222a onCreateViewHolder(ViewGroup viewGroup, int i) {
        C41536l.m120489i(viewGroup, "parent");
        C30080b d = C30080b.m91047d(LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
        C41536l.m120488h(d, "inflate(\n               …      false\n            )");
        return new C25222a(d);
    }
}
