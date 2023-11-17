package lj0;

import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import lj0.C26044f;
import zh0.C30308a;

/* renamed from: lj0.e */
public final class C26043e extends RecyclerView.C1756u {

    /* renamed from: a */
    private final C30308a f66137a;

    /* renamed from: b */
    private final C26044f f66138b;

    /* renamed from: c */
    private final boolean f66139c;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C26043e(C30308a aVar, C26044f fVar, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(aVar, (i & 2) != 0 ? new C26044f.C26045a() : fVar, (i & 4) != 0 ? true : z);
    }

    /* renamed from: e */
    public void mo5740e(RecyclerView recyclerView, int i, int i2) {
        C41536l.m120489i(recyclerView, "recyclerView");
        C30308a aVar = this.f66137a;
        super.mo5740e(recyclerView, i, i2);
        boolean canScrollVertically = recyclerView.canScrollVertically(-1);
        aVar.mo61582M(this.f66138b.mo64936a(canScrollVertically).mo64937a());
        aVar.mo61583q0(canScrollVertically, this.f66139c);
    }

    public C26043e(C30308a aVar, C26044f fVar, boolean z) {
        C41536l.m120489i(aVar, "contentScrollListener");
        C41536l.m120489i(fVar, "colorFactory");
        this.f66137a = aVar;
        this.f66138b = fVar;
        this.f66139c = z;
    }
}
