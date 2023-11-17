package wz0;

import androidx.recyclerview.widget.RecyclerView;
import iy0.C36630r0;
import kotlin.jvm.internal.C41536l;

/* renamed from: wz0.k */
public final class C39764k extends RecyclerView.C1734f0 {

    /* renamed from: d */
    private final C36630r0 f94462d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C39764k(C36630r0 r0Var) {
        super(r0Var.mo3946b());
        C41536l.m120489i(r0Var, "binding");
        this.f94462d = r0Var;
    }

    /* renamed from: h */
    public final void mo93505h(String str) {
        C41536l.m120489i(str, "date");
        this.f94462d.f88407e.setText(str);
    }
}
