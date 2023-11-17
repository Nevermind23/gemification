package nv0;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.core.content.C0767a;
import androidx.recyclerview.widget.RecyclerView;
import bv0.C31202b;
import bv0.C31203c;
import bv0.C31205e;
import kotlin.jvm.internal.C41536l;

/* renamed from: nv0.f */
public final class C37474f extends RecyclerView.C1746o {

    /* renamed from: a */
    private final Drawable f90089a;

    public C37474f(Context context) {
        C41536l.m120489i(context, "context");
        Drawable e = C0767a.m2895e(context, C31203c.f77502a);
        C41536l.m120486f(e);
        this.f90089a = e;
    }

    /* renamed from: e */
    public void mo5615e(Rect rect, View view, RecyclerView recyclerView, RecyclerView.C1726b0 b0Var) {
        int i;
        boolean z;
        Integer num;
        C41536l.m120489i(rect, "outRect");
        C41536l.m120489i(view, "view");
        C41536l.m120489i(recyclerView, "parent");
        C41536l.m120489i(b0Var, "state");
        super.mo5615e(rect, view, recyclerView, b0Var);
        Resources resources = view.getContext().getResources();
        int k0 = recyclerView.mo5355k0(view);
        if (k0 != -1) {
            RecyclerView.C1736h adapter = recyclerView.getAdapter();
            if (adapter != null) {
                i = adapter.getItemCount();
            } else {
                i = 0;
            }
            if (i - 1 == k0) {
                z = true;
            } else {
                z = false;
            }
            RecyclerView.C1736h adapter2 = recyclerView.getAdapter();
            if (adapter2 != null) {
                num = Integer.valueOf(adapter2.getItemViewType(k0));
            } else {
                num = null;
            }
            if (!z) {
                if (!C41358y.m119999O(C41357x0.m119989i(Integer.valueOf(C31205e.item_product_details_header), Integer.valueOf(C31205e.f77543m)), num)) {
                    return;
                }
            }
            rect.bottom = resources.getDimensionPixelSize(C31202b.f77500a);
        }
    }

    /* renamed from: i */
    public void mo5619i(Canvas canvas, RecyclerView recyclerView, RecyclerView.C1726b0 b0Var) {
        int i;
        Integer num;
        C41536l.m120489i(canvas, "c");
        C41536l.m120489i(recyclerView, "parent");
        C41536l.m120489i(b0Var, "state");
        int childCount = recyclerView.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = recyclerView.getChildAt(i2);
            int k0 = recyclerView.mo5355k0(childAt);
            if (k0 != -1) {
                RecyclerView.C1736h adapter = recyclerView.getAdapter();
                if (adapter != null) {
                    i = adapter.getItemCount();
                } else {
                    i = 0;
                }
                boolean z = true;
                if (i - 1 != k0) {
                    z = false;
                }
                RecyclerView.C1736h adapter2 = recyclerView.getAdapter();
                if (adapter2 != null) {
                    num = Integer.valueOf(adapter2.getItemViewType(k0));
                } else {
                    num = null;
                }
                int i3 = C31205e.item_operation;
                if (num != null && num.intValue() == i3 && !z) {
                    int bottom = (childAt.getBottom() + C43193c.m123893c(childAt.getTranslationY())) - this.f90089a.getIntrinsicHeight();
                    this.f90089a.setBounds(childAt.getLeft(), bottom, childAt.getRight(), this.f90089a.getIntrinsicHeight() + bottom);
                    this.f90089a.draw(canvas);
                }
            }
        }
    }
}
