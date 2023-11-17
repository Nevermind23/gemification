package x00;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.core.content.C0767a;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.C41536l;

/* renamed from: x00.a */
public abstract class C29606a extends RecyclerView.C1746o {

    /* renamed from: a */
    private final Drawable f74766a;

    public C29606a(Context context, int i) {
        C41536l.m120489i(context, "context");
        Drawable e = C0767a.m2895e(context, i);
        C41536l.m120486f(e);
        this.f74766a = e;
    }

    /* renamed from: e */
    public void mo5615e(Rect rect, View view, RecyclerView recyclerView, RecyclerView.C1726b0 b0Var) {
        int i;
        C41536l.m120489i(rect, "outRect");
        C41536l.m120489i(view, "view");
        C41536l.m120489i(recyclerView, "parent");
        C41536l.m120489i(b0Var, "state");
        if (mo39050j(view, recyclerView)) {
            i = this.f74766a.getIntrinsicHeight();
        } else {
            i = 0;
        }
        rect.set(0, 0, 0, i);
    }

    /* renamed from: g */
    public void mo5617g(Canvas canvas, RecyclerView recyclerView, RecyclerView.C1726b0 b0Var) {
        C41536l.m120489i(canvas, "c");
        C41536l.m120489i(recyclerView, "parent");
        C41536l.m120489i(b0Var, "state");
        int childCount = recyclerView.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = recyclerView.getChildAt(i);
            C41536l.m120488h(childAt, "view");
            if (mo39050j(childAt, recyclerView)) {
                int bottom = childAt.getBottom() + C43193c.m123893c(childAt.getTranslationY());
                this.f74766a.setBounds(childAt.getLeft(), bottom, childAt.getRight(), this.f74766a.getIntrinsicHeight() + bottom);
                this.f74766a.draw(canvas);
            }
        }
    }

    /* renamed from: j */
    public abstract boolean mo39050j(View view, RecyclerView recyclerView);
}
