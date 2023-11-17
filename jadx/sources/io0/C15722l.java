package io0;

import p341ge.bog.designsystem.components.tabs.TabsView;
import p341ge.bog.mobilebank.lifestyleoffers.presentation.offer.activity.LifestyleOffersByCategoryActivity;

/* renamed from: io0.l */
public final /* synthetic */ class C15722l implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ LifestyleOffersByCategoryActivity f44593d;

    /* renamed from: e */
    public final /* synthetic */ long f44594e;

    /* renamed from: f */
    public final /* synthetic */ TabsView f44595f;

    public /* synthetic */ C15722l(LifestyleOffersByCategoryActivity lifestyleOffersByCategoryActivity, long j, TabsView tabsView) {
        this.f44593d = lifestyleOffersByCategoryActivity;
        this.f44594e = j;
        this.f44595f = tabsView;
    }

    public final void run() {
        LifestyleOffersByCategoryActivity.m55131Z2(this.f44593d, this.f44594e, this.f44595f);
    }
}
