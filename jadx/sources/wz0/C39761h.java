package wz0;

import a41.C30482a;
import android.content.Context;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import hy0.C36275i;
import iy0.C36612l0;
import kotlin.jvm.internal.C41536l;
import p630ui.C18168a;

/* renamed from: wz0.h */
public final class C39761h extends RecyclerView.C1734f0 {

    /* renamed from: d */
    private final C36612l0 f94454d;

    /* renamed from: e */
    private final C30482a f94455e;

    /* renamed from: f */
    private final C18168a f94456f;

    /* renamed from: g */
    private final C18168a f94457g;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C39761h(C36612l0 l0Var, C30482a aVar) {
        super(l0Var.mo3946b());
        C41536l.m120489i(l0Var, "binding");
        C41536l.m120489i(aVar, "viewModel");
        this.f94454d = l0Var;
        this.f94455e = aVar;
        Context context = this.itemView.getContext();
        C41536l.m120488h(context, "itemView.context");
        this.f94456f = new C18168a(context, C36275i.f87586d);
        Context context2 = this.itemView.getContext();
        C41536l.m120488h(context2, "itemView.context");
        this.f94457g = new C18168a(context2, C36275i.f87584b);
    }

    /* access modifiers changed from: private */
    /* renamed from: j */
    public static final void m115537j(C39761h hVar, long j, int i, View view) {
        C41536l.m120489i(hVar, "this$0");
        hVar.f94455e.mo38217Bb(j, 3, i);
    }

    /* renamed from: i */
    public final void mo93502i(long j, String str, String str2, int i, boolean z) {
        C41536l.m120489i(str, "loanType");
        C41536l.m120489i(str2, "amount");
        this.f94454d.f88321g.setText(str);
        this.f94454d.f88320f.setText(str2);
        if (z) {
            C18168a aVar = this.f94456f;
            ConstraintLayout c = this.f94454d.mo3946b();
            C41536l.m120488h(c, "binding.root");
            aVar.mo45824a(c);
        } else {
            C18168a aVar2 = this.f94457g;
            ConstraintLayout c2 = this.f94454d.mo3946b();
            C41536l.m120488h(c2, "binding.root");
            aVar2.mo45824a(c2);
        }
        this.f94454d.mo3946b().setOnClickListener(new C39760g(this, j, i));
    }
}
