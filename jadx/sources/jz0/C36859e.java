package jz0;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.core.content.C0767a;
import androidx.recyclerview.widget.RecyclerView;
import hy0.C36269c;
import hy0.C36270d;
import hy0.C36272f;
import kotlin.jvm.internal.C41536l;

/* renamed from: jz0.e */
public final class C36859e extends RecyclerView.C1746o {

    /* renamed from: a */
    private final Drawable f88953a;

    public C36859e(Context context) {
        C41536l.m120489i(context, "context");
        Drawable e = C0767a.m2895e(context, C36270d.f87471b);
        C41536l.m120486f(e);
        this.f88953a = e;
    }

    /* renamed from: e */
    public void mo5615e(Rect rect, View view, RecyclerView recyclerView, RecyclerView.C1726b0 b0Var) {
        Integer num;
        int i;
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
                num = Integer.valueOf(adapter.getItemViewType(k0));
            } else {
                num = null;
            }
            boolean z = false;
            if (C41358y.m119999O(C41357x0.m119989i(Integer.valueOf(C36272f.f87557Q), Integer.valueOf(C36272f.item_operations_buttons), Integer.valueOf(C36272f.item_account_cards_swiper), Integer.valueOf(C36272f.item_account_linked_loans_header), Integer.valueOf(C36272f.item_account_linked_money_boxes_header), Integer.valueOf(C36272f.item_account_linked_deposits_header), Integer.valueOf(C36272f.item_account_card_insurance_offer), Integer.valueOf(C36272f.item_account_operations_header), Integer.valueOf(C36272f.item_account_overdraft_header), Integer.valueOf(C36272f.item_account_stud_dep_info_header)), num)) {
                rect.top = resources.getDimensionPixelSize(C36269c.f87462c);
            }
            RecyclerView.C1736h adapter2 = recyclerView.getAdapter();
            if (adapter2 != null) {
                i = adapter2.getItemCount();
            } else {
                i = 0;
            }
            if (i - 1 == k0) {
                z = true;
            }
            if (z) {
                rect.bottom = resources.getDimensionPixelSize(C36269c.f87462c);
            }
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
                if (!z) {
                    RecyclerView.C1736h adapter2 = recyclerView.getAdapter();
                    Integer num2 = null;
                    if (adapter2 != null) {
                        num = Integer.valueOf(adapter2.getItemViewType(k0));
                    } else {
                        num = null;
                    }
                    RecyclerView.C1736h adapter3 = recyclerView.getAdapter();
                    if (adapter3 != null) {
                        num2 = Integer.valueOf(adapter3.getItemViewType(k0 + 1));
                    }
                    int i3 = C36272f.item_account_linked_loan;
                    if (num != null && num.intValue() == i3 && num.intValue() == C36272f.item_account_linked_deposit && num.intValue() == C36272f.item_account_overdraft && num.intValue() == C36272f.item_account_linked_money_box && C41536l.m120484d(num, num2)) {
                        int bottom = (childAt.getBottom() + C43193c.m123893c(childAt.getTranslationY())) - this.f88953a.getIntrinsicHeight();
                        this.f88953a.setBounds(childAt.getLeft(), bottom, childAt.getRight(), this.f88953a.getIntrinsicHeight() + bottom);
                        this.f88953a.draw(canvas);
                    }
                }
            }
        }
    }
}
