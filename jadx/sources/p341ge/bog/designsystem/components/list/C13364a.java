package p341ge.bog.designsystem.components.list;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: ge.bog.designsystem.components.list.a */
public class C13364a extends RecyclerView.C1746o {

    /* renamed from: a */
    private Drawable f39750a;

    /* renamed from: b */
    private boolean f39751b;

    /* renamed from: c */
    private boolean f39752c;

    public C13364a(Drawable drawable) {
        this.f39751b = false;
        this.f39752c = false;
        this.f39750a = drawable;
    }

    /* renamed from: j */
    private int m50288j(RecyclerView recyclerView) {
        if (recyclerView.getLayoutManager() instanceof LinearLayoutManager) {
            return ((LinearLayoutManager) recyclerView.getLayoutManager()).mo5191B2();
        }
        throw new IllegalStateException("LinearDividerItemDecoration can only be used with a LinearLayoutManager.");
    }

    /* renamed from: e */
    public void mo5615e(Rect rect, View view, RecyclerView recyclerView, RecyclerView.C1726b0 b0Var) {
        super.mo5615e(rect, view, recyclerView, b0Var);
        if (this.f39750a == null || recyclerView.mo5361m0(view) < 1) {
            return;
        }
        if (m50288j(recyclerView) == 1) {
            rect.top = this.f39750a.getIntrinsicHeight();
        } else {
            rect.left = this.f39750a.getIntrinsicWidth();
        }
    }

    /* renamed from: i */
    public void mo5619i(Canvas canvas, RecyclerView recyclerView, RecyclerView.C1726b0 b0Var) {
        int i;
        int i2;
        int i3;
        int i4;
        if (this.f39750a == null) {
            super.mo5619i(canvas, recyclerView, b0Var);
            return;
        }
        int j = m50288j(recyclerView);
        int childCount = recyclerView.getChildCount();
        int i5 = 0;
        if (j == 1) {
            int intrinsicHeight = this.f39750a.getIntrinsicHeight();
            int paddingLeft = recyclerView.getPaddingLeft();
            i2 = recyclerView.getWidth() - recyclerView.getPaddingRight();
            i = intrinsicHeight;
            i4 = 0;
            i5 = paddingLeft;
            i3 = 0;
        } else {
            int intrinsicWidth = this.f39750a.getIntrinsicWidth();
            i3 = recyclerView.getPaddingTop();
            i = intrinsicWidth;
            i4 = recyclerView.getHeight() - recyclerView.getPaddingBottom();
            i2 = 0;
        }
        for (int i6 = !this.f39751b; i6 < childCount; i6++) {
            View childAt = recyclerView.getChildAt(i6);
            RecyclerView.C1752q qVar = (RecyclerView.C1752q) childAt.getLayoutParams();
            if (j == 1) {
                i4 = childAt.getTop() - qVar.topMargin;
                i3 = i4 - i;
            } else {
                int left = childAt.getLeft() - qVar.leftMargin;
                i2 = left;
                i5 = left - i;
            }
            this.f39750a.setBounds(i5, i3, i2, i4);
            this.f39750a.draw(canvas);
        }
        if (this.f39752c && childCount > 0) {
            View childAt2 = recyclerView.getChildAt(childCount - 1);
            RecyclerView.C1752q qVar2 = (RecyclerView.C1752q) childAt2.getLayoutParams();
            if (j == 1) {
                i4 = childAt2.getBottom() + qVar2.bottomMargin;
                i3 = i4 - i;
            } else {
                i2 = childAt2.getRight() + qVar2.rightMargin;
                i5 = i2 - i;
            }
            this.f39750a.setBounds(i5, i3, i2, i4);
            this.f39750a.draw(canvas);
        }
    }

    public C13364a(Drawable drawable, boolean z, boolean z2) {
        this(drawable);
        this.f39751b = z;
        this.f39752c = z2;
    }
}
