package p341ge.bog.mobilebank.giftcards.presentation.filtered;

import android.content.Context;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import th0.C28414n;

/* renamed from: ge.bog.mobilebank.giftcards.presentation.filtered.GiftCardsFilteredOffersFragment$initViews$1$1 */
public final class GiftCardsFilteredOffersFragment$initViews$1$1 extends LinearLayoutManager {

    /* renamed from: L */
    final /* synthetic */ C28414n f62715L;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    GiftCardsFilteredOffersFragment$initViews$1$1(C28414n nVar, Context context) {
        super(context);
        this.f62715L = nVar;
    }

    /* renamed from: K1 */
    public int mo5153K1(int i, RecyclerView.C1759w wVar, RecyclerView.C1726b0 b0Var) {
        if (this.f62715L.f72147e.getScrollState() != 2 || mo5683h0() == null) {
            return super.mo5153K1(i, wVar, b0Var);
        }
        return 0;
    }
}
