package a50;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.content.C0767a;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.C41536l;
import p366bk.C10320i;

/* renamed from: a50.a */
public final class C19169a extends RecyclerView.C1746o {

    /* renamed from: a */
    private final Drawable f53372a;

    public C19169a(Context context) {
        C41536l.m120489i(context, "context");
        Drawable e = C0767a.m2895e(context, C10320i.statements_vertical_divider);
        C41536l.m120486f(e);
        this.f53372a = e;
    }

    /* renamed from: i */
    public void mo5619i(Canvas canvas, RecyclerView recyclerView, RecyclerView.C1726b0 b0Var) {
        C41536l.m120489i(canvas, "canvas");
        C41536l.m120489i(recyclerView, "parent");
        C41536l.m120489i(b0Var, "state");
        int paddingLeft = recyclerView.getPaddingLeft();
        int width = recyclerView.getWidth() - recyclerView.getPaddingRight();
        int childCount = recyclerView.getChildCount() - 2;
        if (childCount >= 0) {
            int i = 0;
            while (true) {
                View childAt = recyclerView.getChildAt(i);
                ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                C41536l.m120487g(layoutParams, "null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView.LayoutParams");
                int bottom = childAt.getBottom() + ((RecyclerView.C1752q) layoutParams).bottomMargin;
                this.f53372a.setBounds(paddingLeft, bottom, width, this.f53372a.getIntrinsicHeight() + bottom);
                this.f53372a.draw(canvas);
                if (i != childCount) {
                    i++;
                } else {
                    return;
                }
            }
        }
    }
}
