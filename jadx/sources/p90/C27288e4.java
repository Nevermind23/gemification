package p90;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.viewpager2.widget.ViewPager2;
import p086g1.C6201a;
import p086g1.C6202b;
import p341ge.bog.designsystem.components.tabs.TabsView;
import p366bk.C10322k;
import p366bk.C10324m;

/* renamed from: p90.e4 */
public final class C27288e4 implements C6201a {

    /* renamed from: d */
    private final LinearLayout f68647d;

    /* renamed from: e */
    public final TabsView f68648e;

    /* renamed from: f */
    public final ViewPager2 f68649f;

    private C27288e4(LinearLayout linearLayout, TabsView tabsView, ViewPager2 viewPager2) {
        this.f68647d = linearLayout;
        this.f68648e = tabsView;
        this.f68649f = viewPager2;
    }

    /* renamed from: a */
    public static C27288e4 m84453a(View view) {
        int i = C10322k.products_tab_layout;
        TabsView tabsView = (TabsView) C6202b.m24689a(view, i);
        if (tabsView != null) {
            i = C10322k.f28909wq;
            ViewPager2 viewPager2 = (ViewPager2) C6202b.m24689a(view, i);
            if (viewPager2 != null) {
                return new C27288e4((LinearLayout) view, tabsView, viewPager2);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: d */
    public static C27288e4 m84454d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C10324m.fragment_products, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m84453a(inflate);
    }

    /* renamed from: c */
    public LinearLayout mo3946b() {
        return this.f68647d;
    }
}
