package b31;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewpager2.widget.ViewPager2;
import p086g1.C6201a;
import p086g1.C6202b;
import p341ge.bog.mobilebank.cleanarch.presentation.common.compoundview.ScrollingPagerIndicator;
import x11.C39771d;
import x11.C39772e;

/* renamed from: b31.l */
public final class C31123l implements C6201a {

    /* renamed from: d */
    private final ConstraintLayout f77350d;

    /* renamed from: e */
    public final ViewPager2 f77351e;

    /* renamed from: f */
    public final ScrollingPagerIndicator f77352f;

    private C31123l(ConstraintLayout constraintLayout, ViewPager2 viewPager2, ScrollingPagerIndicator scrollingPagerIndicator) {
        this.f77350d = constraintLayout;
        this.f77351e = viewPager2;
        this.f77352f = scrollingPagerIndicator;
    }

    /* renamed from: a */
    public static C31123l m92611a(View view) {
        int i = C39771d.headers_view_pager;
        ViewPager2 viewPager2 = (ViewPager2) C6202b.m24689a(view, i);
        if (viewPager2 != null) {
            i = C39771d.f94482w;
            ScrollingPagerIndicator scrollingPagerIndicator = (ScrollingPagerIndicator) C6202b.m24689a(view, i);
            if (scrollingPagerIndicator != null) {
                return new C31123l((ConstraintLayout) view, viewPager2, scrollingPagerIndicator);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: d */
    public static C31123l m92612d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C39772e.f94483l, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m92611a(inflate);
    }

    /* renamed from: c */
    public ConstraintLayout mo3946b() {
        return this.f77350d;
    }
}
