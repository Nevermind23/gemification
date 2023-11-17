package th0;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewpager2.widget.ViewPager2;
import oh0.C27010e;
import oh0.C27011f;
import p086g1.C6201a;
import p086g1.C6202b;
import p341ge.bog.mobilebank.cleanarch.presentation.common.compoundview.ScrollingPagerIndicator;

/* renamed from: th0.b0 */
public final class C28391b0 implements C6201a {

    /* renamed from: d */
    private final ConstraintLayout f71986d;

    /* renamed from: e */
    public final ViewPager2 f71987e;

    /* renamed from: f */
    public final ScrollingPagerIndicator f71988f;

    private C28391b0(ConstraintLayout constraintLayout, ViewPager2 viewPager2, ScrollingPagerIndicator scrollingPagerIndicator) {
        this.f71986d = constraintLayout;
        this.f71987e = viewPager2;
        this.f71988f = scrollingPagerIndicator;
    }

    /* renamed from: a */
    public static C28391b0 m87084a(View view) {
        int i = C27010e.animations_view_pager;
        ViewPager2 viewPager2 = (ViewPager2) C6202b.m24689a(view, i);
        if (viewPager2 != null) {
            i = C27010e.f67807Q1;
            ScrollingPagerIndicator scrollingPagerIndicator = (ScrollingPagerIndicator) C6202b.m24689a(view, i);
            if (scrollingPagerIndicator != null) {
                return new C28391b0((ConstraintLayout) view, viewPager2, scrollingPagerIndicator);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: d */
    public static C28391b0 m87085d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C27011f.item_gift_card_details_animation_pager, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m87084a(inflate);
    }

    /* renamed from: c */
    public ConstraintLayout mo3946b() {
        return this.f71986d;
    }
}
