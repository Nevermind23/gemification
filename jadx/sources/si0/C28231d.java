package si0;

import android.view.View;
import p341ge.bog.designsystem.components.bigchips.BigChips;
import p341ge.bog.mobilebank.giftcards.presentation.filter.GiftCardsFilterFragment;

/* renamed from: si0.d */
public final /* synthetic */ class C28231d implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ BigChips f71592d;

    /* renamed from: e */
    public final /* synthetic */ GiftCardsFilterFragment f71593e;

    /* renamed from: f */
    public final /* synthetic */ C28228a f71594f;

    public /* synthetic */ C28231d(BigChips bigChips, GiftCardsFilterFragment giftCardsFilterFragment, C28228a aVar) {
        this.f71592d = bigChips;
        this.f71593e = giftCardsFilterFragment;
        this.f71594f = aVar;
    }

    public final void onClick(View view) {
        GiftCardsFilterFragment.m77992q1(this.f71592d, this.f71593e, this.f71594f, view);
    }
}
