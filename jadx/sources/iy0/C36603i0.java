package iy0;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewpager2.widget.ViewPager2;
import hy0.C36271e;
import hy0.C36272f;
import p086g1.C6201a;
import p086g1.C6202b;

/* renamed from: iy0.i0 */
public final class C36603i0 implements C6201a {

    /* renamed from: d */
    private final ConstraintLayout f88268d;

    /* renamed from: e */
    public final ViewPager2 f88269e;

    private C36603i0(ConstraintLayout constraintLayout, ViewPager2 viewPager2) {
        this.f88268d = constraintLayout;
        this.f88269e = viewPager2;
    }

    /* renamed from: a */
    public static C36603i0 m108541a(View view) {
        int i = C36271e.cards_view_pager;
        ViewPager2 viewPager2 = (ViewPager2) C6202b.m24689a(view, i);
        if (viewPager2 != null) {
            return new C36603i0((ConstraintLayout) view, viewPager2);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: d */
    public static C36603i0 m108542d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C36272f.item_account_cards_swiper, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m108541a(inflate);
    }

    /* renamed from: c */
    public ConstraintLayout mo3946b() {
        return this.f88268d;
    }
}
