package o31;

import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.C41536l;
import x11.C39769b;

/* renamed from: o31.s */
public abstract class C37616s {
    /* renamed from: a */
    public static final void m110617a(RecyclerView recyclerView, int i, int i2, boolean z) {
        int i3;
        C41536l.m120489i(recyclerView, "<this>");
        int dimensionPixelSize = recyclerView.getContext().getResources().getDimensionPixelSize(i);
        if (z) {
            i3 = dimensionPixelSize;
        } else {
            i3 = recyclerView.getContext().getResources().getDimensionPixelSize(C39769b.f94464a);
        }
        recyclerView.mo5351j(new C37621w(i3, (int) (((float) dimensionPixelSize) / 2.0f), i2));
    }

    /* renamed from: b */
    public static /* synthetic */ void m110618b(RecyclerView recyclerView, int i, int i2, boolean z, int i3, Object obj) {
        if ((i3 & 4) != 0) {
            z = false;
        }
        m110617a(recyclerView, i, i2, z);
    }
}
