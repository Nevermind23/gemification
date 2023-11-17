package z00;

import androidx.viewpager2.widget.ViewPager2;
import p341ge.bog.mobilebank.cleanarch.presentation.common.compoundview.ScrollingPagerIndicator;

/* renamed from: z00.d */
public final /* synthetic */ class C30128d implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ ScrollingPagerIndicator f75967d;

    /* renamed from: e */
    public final /* synthetic */ ViewPager2 f75968e;

    /* renamed from: f */
    public final /* synthetic */ ScrollingPagerIndicator.C21495a f75969f;

    public /* synthetic */ C30128d(ScrollingPagerIndicator scrollingPagerIndicator, ViewPager2 viewPager2, ScrollingPagerIndicator.C21495a aVar) {
        this.f75967d = scrollingPagerIndicator;
        this.f75968e = viewPager2;
        this.f75969f = aVar;
    }

    public final void run() {
        ScrollingPagerIndicator.m69467e(this.f75967d, this.f75968e, this.f75969f);
    }
}
