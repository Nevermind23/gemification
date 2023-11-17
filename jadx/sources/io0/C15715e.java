package io0;

import android.view.View;
import p341ge.bog.mobilebank.cleanarch.domain.offer.model.OfferInfo;
import p341ge.bog.mobilebank.lifestyleoffers.presentation.offer.activity.LifestyleOfferDetailedActivity;

/* renamed from: io0.e */
public final /* synthetic */ class C15715e implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ LifestyleOfferDetailedActivity f44587d;

    /* renamed from: e */
    public final /* synthetic */ OfferInfo f44588e;

    public /* synthetic */ C15715e(LifestyleOfferDetailedActivity lifestyleOfferDetailedActivity, OfferInfo offerInfo) {
        this.f44587d = lifestyleOfferDetailedActivity;
        this.f44588e = offerInfo;
    }

    public final void onClick(View view) {
        LifestyleOfferDetailedActivity.m55091O2(this.f44587d, this.f44588e, view);
    }
}
