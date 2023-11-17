package gt0;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.recyclerview.widget.C1819o;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.C41536l;
import mt0.C37263g;
import p615tg.C17963d;
import vs0.C39460s;

/* renamed from: gt0.d */
public final class C36077d extends C1819o {

    /* renamed from: gt0.d$a */
    public static final class C36078a extends RecyclerView.C1734f0 {

        /* renamed from: d */
        private final C39460s f87207d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C36078a(C39460s sVar) {
            super(sVar.mo3946b());
            C41536l.m120489i(sVar, "binding");
            this.f87207d = sVar;
        }

        /* renamed from: h */
        public final void mo88799h(C37263g gVar) {
            C41536l.m120489i(gVar, "item");
            this.f87207d.f93843e.setImageResource(gVar.mo90374a());
            this.f87207d.f93844f.setText(gVar.mo90375b());
        }
    }

    public C36077d() {
        super(C17963d.f51158a.mo45633d());
    }

    /* renamed from: k */
    public void onBindViewHolder(C36078a aVar, int i) {
        C41536l.m120489i(aVar, "holder");
        Object g = mo6027g(i);
        C41536l.m120488h(g, "getItem(position)");
        aVar.mo88799h((C37263g) g);
    }

    /* renamed from: l */
    public C36078a onCreateViewHolder(ViewGroup viewGroup, int i) {
        C41536l.m120489i(viewGroup, "parent");
        C39460s d = C39460s.m114696d(LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
        C41536l.m120488h(d, "inflate(\n               …rent, false\n            )");
        return new C36078a(d);
    }
}
