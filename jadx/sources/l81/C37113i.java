package l81;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.core.view.ViewCompat;
import androidx.recyclerview.widget.RecyclerView;
import g91.C32290b1;

/* renamed from: l81.i */
public class C37113i extends RecyclerView.C1746o {

    /* renamed from: a */
    private Drawable f89306a;

    public C37113i(Drawable drawable) {
        this.f89306a = drawable;
    }

    /* renamed from: j */
    private void m109711j(Canvas canvas, RecyclerView recyclerView) {
        int paddingLeft = recyclerView.getPaddingLeft();
        int width = recyclerView.getWidth() - recyclerView.getPaddingRight();
        int childCount = recyclerView.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = recyclerView.getChildAt(i);
            View findViewWithTag = childAt.findViewWithTag("dividerStart");
            if (findViewWithTag != null) {
                paddingLeft = C32290b1.m95120j(findViewWithTag, recyclerView);
            }
            int bottom = childAt.getBottom() + ((RecyclerView.C1752q) childAt.getLayoutParams()).bottomMargin + Math.round(ViewCompat.m3561L(childAt));
            this.f89306a.setBounds(paddingLeft, bottom, width, this.f89306a.getIntrinsicHeight() + bottom);
            this.f89306a.draw(canvas);
        }
    }

    /* renamed from: e */
    public void mo5615e(Rect rect, View view, RecyclerView recyclerView, RecyclerView.C1726b0 b0Var) {
        rect.set(0, 0, 0, this.f89306a.getIntrinsicHeight());
    }

    /* renamed from: g */
    public void mo5617g(Canvas canvas, RecyclerView recyclerView, RecyclerView.C1726b0 b0Var) {
        m109711j(canvas, recyclerView);
    }
}
