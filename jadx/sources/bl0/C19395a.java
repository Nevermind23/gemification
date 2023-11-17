package bl0;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.C41536l;

/* renamed from: bl0.a */
public final class C19395a extends RecyclerView.C1746o {

    /* renamed from: a */
    private int f53619a;

    public C19395a(int i) {
        this.f53619a = i;
    }

    /* renamed from: e */
    public void mo5615e(Rect rect, View view, RecyclerView recyclerView, RecyclerView.C1726b0 b0Var) {
        C41536l.m120489i(rect, "outRect");
        C41536l.m120489i(view, "view");
        C41536l.m120489i(recyclerView, "parent");
        C41536l.m120489i(b0Var, "state");
        int i = this.f53619a;
        rect.bottom = i;
        rect.top = i;
    }
}
