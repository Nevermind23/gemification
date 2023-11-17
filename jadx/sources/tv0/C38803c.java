package tv0;

import android.content.Context;
import android.view.View;
import androidx.core.content.C0767a;
import androidx.recyclerview.widget.RecyclerView;
import ev0.C31818b0;
import kotlin.jvm.internal.C41536l;
import ue1.C43075l;

/* renamed from: tv0.c */
public final class C38803c extends RecyclerView.C1734f0 {

    /* renamed from: d */
    private final C31818b0 f92865d;

    /* renamed from: e */
    private final C43075l f92866e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C38803c(C31818b0 b0Var, C43075l lVar) {
        super(b0Var.mo3946b());
        C41536l.m120489i(b0Var, "binding");
        this.f92865d = b0Var;
        this.f92866e = lVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: j */
    public static final void m113581j(C38803c cVar, C38801a aVar, View view) {
        C41536l.m120489i(cVar, "this$0");
        C41536l.m120489i(aVar, "$item");
        C43075l lVar = cVar.f92866e;
        if (lVar != null) {
            lVar.invoke(aVar.mo92520f());
        }
    }

    /* renamed from: i */
    public final void mo92524i(C38801a aVar) {
        C41536l.m120489i(aVar, "item");
        Context context = this.f92865d.mo3946b().getContext();
        this.f92865d.f78460h.setText(context.getString(aVar.mo92517d()));
        this.f92865d.f78460h.setTextColor(C0767a.m2893c(context, aVar.mo92518e()));
        this.f92865d.f78458f.setImageResource(aVar.mo92514a());
        if (aVar.mo92516c() != null) {
            this.f92865d.f78458f.setColorFilter(C0767a.m2893c(context, aVar.mo92516c().intValue()));
        }
        this.f92865d.f78459g.setBackgroundResource(aVar.mo92515b());
        this.f92865d.mo3946b().setOnClickListener(new C38802b(this, aVar));
    }
}
