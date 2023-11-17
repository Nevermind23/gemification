package wr0;

import android.content.res.Resources;
import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.C41536l;
import lr0.C37128c;

/* renamed from: wr0.l */
public final class C39667l extends RecyclerView.C1746o {
    /* renamed from: e */
    public void mo5615e(Rect rect, View view, RecyclerView recyclerView, RecyclerView.C1726b0 b0Var) {
        int i;
        C41536l.m120489i(rect, "outRect");
        C41536l.m120489i(view, "view");
        C41536l.m120489i(recyclerView, "parent");
        C41536l.m120489i(b0Var, "state");
        Resources resources = view.getContext().getResources();
        int k0 = recyclerView.mo5355k0(view);
        if (k0 != -1) {
            RecyclerView.C1736h adapter = recyclerView.getAdapter();
            boolean z = false;
            if (adapter != null) {
                i = adapter.getItemCount();
            } else {
                i = 0;
            }
            if (i - 1 == k0) {
                z = true;
            }
            if (z) {
                rect.bottom = resources.getDimensionPixelSize(C37128c.f89406d);
            }
        }
    }
}
