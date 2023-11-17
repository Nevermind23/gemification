package mz0;

import android.content.res.Resources;
import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import hy0.C36269c;
import hy0.C36272f;
import kotlin.jvm.internal.C41536l;

/* renamed from: mz0.r */
public final class C37333r extends RecyclerView.C1746o {
    /* renamed from: e */
    public void mo5615e(Rect rect, View view, RecyclerView recyclerView, RecyclerView.C1726b0 b0Var) {
        Integer num;
        int i;
        C41536l.m120489i(rect, "outRect");
        C41536l.m120489i(view, "view");
        C41536l.m120489i(recyclerView, "parent");
        C41536l.m120489i(b0Var, "state");
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
            if (C41358y.m119999O(C41357x0.m119989i(Integer.valueOf(C36272f.item_account_cards_swiper), Integer.valueOf(C36272f.item_account_card_insurance_offer), Integer.valueOf(C36272f.item_credit_account_details), Integer.valueOf(C36272f.item_credit_card_billing_details), Integer.valueOf(C36272f.item_credit_card_payment_details), Integer.valueOf(C36272f.item_account_linked_loans_header), Integer.valueOf(C36272f.item_account_operations_header), Integer.valueOf(C36272f.item_account_linked_loan)), num)) {
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
}
