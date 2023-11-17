package ei0;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.recyclerview.widget.C1819o;
import fi0.C20491c;
import fi0.C20493e;
import hi0.C25032e;
import kotlin.jvm.internal.C41536l;
import o31.C37599g;
import th0.C28427t0;

/* renamed from: ei0.b */
public final class C20245b extends C1819o {

    /* renamed from: f */
    private final C20491c f55135f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C20245b(C20491c cVar) {
        super(C37599g.f90345a.mo90787d());
        C41536l.m120489i(cVar, "phoneContactItemClickListener");
        this.f55135f = cVar;
    }

    /* renamed from: k */
    public void onBindViewHolder(C20493e eVar, int i) {
        C41536l.m120489i(eVar, "holder");
        Object g = mo6027g(i);
        C41536l.m120488h(g, "getItem(position)");
        eVar.mo49035i((C25032e) g);
    }

    /* renamed from: l */
    public C20493e onCreateViewHolder(ViewGroup viewGroup, int i) {
        C41536l.m120489i(viewGroup, "parent");
        C28427t0 d = C28427t0.m87230d(LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
        C41536l.m120488h(d, "inflate(LayoutInflater.f….context), parent, false)");
        return new C20493e(d, this.f55135f);
    }
}
