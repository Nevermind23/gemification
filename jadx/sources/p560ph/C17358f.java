package p560ph;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.C41536l;

/* renamed from: ph.f */
public final class C17358f extends RecyclerView.C1746o {

    /* renamed from: a */
    private final int f48685a;

    public C17358f(int i) {
        this.f48685a = i;
    }

    /* renamed from: e */
    public void mo5615e(Rect rect, View view, RecyclerView recyclerView, RecyclerView.C1726b0 b0Var) {
        C41536l.m120489i(rect, "outRect");
        C41536l.m120489i(view, "view");
        C41536l.m120489i(recyclerView, "parent");
        C41536l.m120489i(b0Var, "state");
        super.mo5615e(rect, view, recyclerView, b0Var);
        int i = this.f48685a;
        rect.left = i / 2;
        rect.right = i / 2;
    }
}
