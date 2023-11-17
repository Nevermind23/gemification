package g20;

import androidx.recyclerview.widget.RecyclerView;
import d20.C19877n;
import java.util.List;
import kotlin.jvm.internal.C41536l;
import p90.C27368m6;

/* renamed from: g20.f0 */
public final class C20606f0 extends RecyclerView.C1734f0 {

    /* renamed from: d */
    private final C19877n f55675d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C20606f0(C19877n nVar, C27368m6 m6Var) {
        super(m6Var.mo3946b());
        C41536l.m120489i(nVar, "adapter");
        C41536l.m120489i(m6Var, "binding");
        this.f55675d = nVar;
        m6Var.mo3946b().setAdapter(nVar);
        m6Var.mo3946b().setItemAnimator((RecyclerView.C1742m) null);
    }

    /* renamed from: h */
    public final void mo49152h(List list) {
        C41536l.m120489i(list, "items");
        this.f55675d.mo6029i(list);
    }
}
