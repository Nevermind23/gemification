package p492kj;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.recyclerview.widget.C1819o;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.C41536l;
import p352ak.C9994q;
import p615tg.C17963d;

/* renamed from: kj.i */
public final class C16445i extends C1819o {

    /* renamed from: kj.i$a */
    public final class C16446a extends RecyclerView.C1734f0 {

        /* renamed from: d */
        private final C9994q f46446d;

        /* renamed from: e */
        final /* synthetic */ C16445i f46447e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C16446a(C16445i iVar, C9994q qVar) {
            super(qVar.mo3946b());
            C41536l.m120489i(qVar, "binding");
            this.f46447e = iVar;
            this.f46446d = qVar;
        }

        /* renamed from: h */
        public final void mo43605h(C16436c cVar) {
            C41536l.m120489i(cVar, "item");
            this.f46446d.f27409e.setText(cVar.mo43573b());
            this.f46446d.f27409e.setIconProperties(cVar.mo43572a());
        }
    }

    public C16445i() {
        super(C17963d.f51158a.mo45633d());
    }

    /* renamed from: k */
    public void onBindViewHolder(C16446a aVar, int i) {
        C41536l.m120489i(aVar, "holder");
        Object obj = mo6026f().get(i);
        C41536l.m120488h(obj, "currentList[position]");
        aVar.mo43605h((C16436c) obj);
    }

    /* renamed from: l */
    public C16446a onCreateViewHolder(ViewGroup viewGroup, int i) {
        C41536l.m120489i(viewGroup, "parent");
        C9994q d = C9994q.m36656d(LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
        C41536l.m120488h(d, "inflate(\n               …      false\n            )");
        return new C16446a(this, d);
    }
}
