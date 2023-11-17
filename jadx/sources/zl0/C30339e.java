package zl0;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.C41536l;
import z71.C40194u;

/* renamed from: zl0.e */
public final class C30339e extends RecyclerView.C1734f0 {

    /* renamed from: d */
    private final C40194u f76262d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C30339e(C40194u uVar) {
        super(uVar.mo3946b());
        C41536l.m120489i(uVar, "binding");
        this.f76262d = uVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: j */
    public static final void m91477j(C30336b bVar, C30337c cVar, View view) {
        C41536l.m120489i(bVar, "$itemClickListener");
        C41536l.m120489i(cVar, "$model");
        bVar.mo70660a(cVar);
    }

    /* renamed from: i */
    public final void mo70668i(C30337c cVar, C30336b bVar) {
        C41536l.m120489i(cVar, "model");
        C41536l.m120489i(bVar, "itemClickListener");
        this.f76262d.f95577g.setText(cVar.mo70661a());
        this.f76262d.f95576f.setOnClickListener(new C30338d(bVar, cVar));
    }
}
