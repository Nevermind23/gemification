package ti0;

import android.view.View;
import p341ge.bog.mobilebank.giftcards.presentation.filtered.GiftCardsFilteredOffersFragment;
import th0.C28414n;

/* renamed from: ti0.a */
public final /* synthetic */ class C28439a implements View.OnScrollChangeListener {

    /* renamed from: a */
    public final /* synthetic */ C28414n f72238a;

    /* renamed from: b */
    public final /* synthetic */ GiftCardsFilteredOffersFragment f72239b;

    public /* synthetic */ C28439a(C28414n nVar, GiftCardsFilteredOffersFragment giftCardsFilteredOffersFragment) {
        this.f72238a = nVar;
        this.f72239b = giftCardsFilteredOffersFragment;
    }

    public final void onScrollChange(View view, int i, int i2, int i3, int i4) {
        GiftCardsFilteredOffersFragment.m78039t1(this.f72238a, this.f72239b, view, i, i2, i3, i4);
    }
}
