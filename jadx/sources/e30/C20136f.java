package e30;

import a30.C19166f;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import d30.C19892c;
import g91.C32289b0;
import kotlin.jvm.internal.C41536l;
import p90.C27270c6;
import ue1.C43075l;

/* renamed from: e30.f */
public final class C20136f extends RecyclerView.C1734f0 {

    /* renamed from: d */
    private final C27270c6 f54806d;

    /* renamed from: e */
    private C43075l f54807e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C20136f(C27270c6 c6Var) {
        super(c6Var.mo3946b());
        C41536l.m120489i(c6Var, "binding");
        this.f54806d = c6Var;
    }

    /* access modifiers changed from: private */
    /* renamed from: j */
    public static final void m66125j(C20136f fVar, C19892c.C19893a aVar, View view) {
        C41536l.m120489i(fVar, "this$0");
        C41536l.m120489i(aVar, "$item");
        C43075l lVar = fVar.f54807e;
        if (lVar != null) {
            lVar.invoke(aVar.mo48243b());
        }
    }

    /* renamed from: i */
    public final void mo48567i(C19892c.C19893a aVar) {
        C41536l.m120489i(aVar, "item");
        this.f54806d.f68487g.setText(aVar.mo48243b().mo47384g());
        this.f54806d.f68486f.setImageResource(aVar.mo48243b().mo47378b());
        if (C41536l.m120484d(aVar.mo48243b().mo47380d(), "")) {
            this.f54806d.f68488h.setVisibility(8);
        } else {
            this.f54806d.f68488h.setVisibility(0);
            this.f54806d.f68488h.setText(aVar.mo48243b().mo47380d());
        }
        if (aVar.mo48243b().mo47385h() == C19166f.CONTACT && aVar.mo48243b().mo47383f() != null) {
            C32289b0.m95097i(this.f54806d.f68486f, aVar.mo48243b().mo47383f());
        }
        this.f54806d.f68485e.setOnClickListener(new C20135e(this, aVar));
    }

    /* renamed from: k */
    public final void mo48568k(C43075l lVar) {
        this.f54807e = lVar;
    }
}
