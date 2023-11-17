package yi0;

import android.view.View;
import p341ge.bog.mobilebank.giftcards.presentation.nomination.GiftCardsNominationFragment;
import p341ge.bog.mobilebank.shared.helper.StringSource;

/* renamed from: yi0.c */
public final /* synthetic */ class C30069c implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ GiftCardsNominationFragment f75895d;

    /* renamed from: e */
    public final /* synthetic */ StringSource f75896e;

    public /* synthetic */ C30069c(GiftCardsNominationFragment giftCardsNominationFragment, StringSource stringSource) {
        this.f75895d = giftCardsNominationFragment;
        this.f75896e = stringSource;
    }

    public final void onClick(View view) {
        GiftCardsNominationFragment.m78146s1(this.f75895d, this.f75896e, view);
    }
}
