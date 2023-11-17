package o31;

import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.C41536l;

/* renamed from: o31.h */
public abstract class C37600h extends RecyclerView.C1756u {

    /* renamed from: a */
    private final C37601a f90346a;

    /* renamed from: o31.h$a */
    public interface C37601a {
        /* renamed from: C9 */
        boolean mo60611C9();
    }

    public C37600h(C37601a aVar) {
        C41536l.m120489i(aVar, "hasMoreCallback");
        this.f90346a = aVar;
    }

    /* renamed from: e */
    public void mo5740e(RecyclerView recyclerView, int i, int i2) {
        C41536l.m120489i(recyclerView, "recyclerView");
        if (i2 > 0 && !recyclerView.canScrollVertically(1) && this.f90346a.mo60611C9()) {
            mo60667f();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public abstract void mo60667f();
}
