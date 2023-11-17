package e30;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import d30.C19892c;
import g91.C32343x;
import kotlin.jvm.internal.C41536l;
import p90.C27484z5;
import ue1.C43064a;

/* renamed from: e30.j */
public final class C20140j extends RecyclerView.C1734f0 {

    /* renamed from: d */
    private final C27484z5 f54812d;

    /* renamed from: e */
    private C43064a f54813e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C20140j(C27484z5 z5Var) {
        super(z5Var.mo3946b());
        C41536l.m120489i(z5Var, "binding");
        this.f54812d = z5Var;
    }

    /* access modifiers changed from: private */
    /* renamed from: j */
    public static final void m66133j(C20140j jVar, View view) {
        C41536l.m120489i(jVar, "this$0");
        C43064a aVar = jVar.f54813e;
        if (aVar != null) {
            aVar.invoke();
        }
    }

    /* renamed from: i */
    public final void mo48573i(C19892c.C19894b bVar) {
        C41536l.m120489i(bVar, "item");
        this.f54812d.f70353g.setText(String.valueOf(bVar.mo48247b().mo48258b()));
        this.f54812d.f70352f.setText(C32343x.m95408P(bVar.mo48247b().mo48259c(), "GEL"));
        this.f54812d.f70354h.setOnClickListener(new C20139i(this));
        if (bVar.mo48247b().mo48258b() > 1) {
            this.f54812d.f70351e.setVisibility(0);
            this.f54812d.f70357k.setVisibility(0);
            return;
        }
        this.f54812d.f70351e.setVisibility(8);
        this.f54812d.f70357k.setVisibility(8);
    }

    /* renamed from: k */
    public final void mo48574k(C43064a aVar) {
        this.f54813e = aVar;
    }
}
