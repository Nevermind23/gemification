package e30;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import d30.C19892c;
import g91.C32343x;
import kotlin.jvm.internal.C41536l;
import p90.C27250a6;
import ue1.C43075l;

/* renamed from: e30.h */
public final class C20138h extends RecyclerView.C1734f0 {

    /* renamed from: d */
    private final C27250a6 f54809d;

    /* renamed from: e */
    private C43075l f54810e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C20138h(C27250a6 a6Var) {
        super(a6Var.mo3946b());
        C41536l.m120489i(a6Var, "binding");
        this.f54809d = a6Var;
    }

    /* access modifiers changed from: private */
    /* renamed from: j */
    public static final void m66129j(C20138h hVar, View view) {
        C41536l.m120489i(hVar, "this$0");
        C43075l lVar = hVar.f54810e;
        if (lVar != null) {
            C41536l.m120488h(view, "it");
            lVar.invoke(view);
        }
    }

    /* renamed from: i */
    public final void mo48570i(C19892c.C19895c cVar) {
        C41536l.m120489i(cVar, "item");
        this.f54809d.f68325f.setText(C32343x.m95408P(cVar.mo48251b().mo48264b(), "GEL"));
        this.f54809d.f68325f.setOnClickListener(new C20137g(this));
    }

    /* renamed from: k */
    public final void mo48571k(C43075l lVar) {
        this.f54810e = lVar;
    }
}
