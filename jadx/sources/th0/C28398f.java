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
import p341ge.bog.designsystem.components.tabgroup.TabsGroupView;

/* renamed from: th0.f */
public final class C28398f implements C6201a {

    /* renamed from: d */
    private final ConstraintLayout f72016d;

    /* renamed from: e */
    public final ConstraintLayout f72017e;

    /* renamed from: f */
    public final TabsGroupView f72018f;

    /* renamed from: g */
    public final ViewPager2 f72019g;

    private C28398f(ConstraintLayout constraintLayout, ConstraintLayout constraintLayout2, TabsGroupView tabsGroupView, ViewPager2 viewPager2) {
        this.f72016d = constraintLayout;
        this.f72017e = constraintLayout2;
        this.f72018f = tabsGroupView;
        this.f72019g = viewPager2;
    }

    /* renamed from: a */
    public static C28398f m87113a(View view) {
        ConstraintLayout constraintLayout = (ConstraintLayout) view;
        int i = C27010e.discovery_page_tabs;
        TabsGroupView tabsGroupView = (TabsGroupView) C6202b.m24689a(view, i);
        if (tabsGroupView != null) {
            i = C27010e.fragment_container_view_pager;
            ViewPager2 viewPager2 = (ViewPager2) C6202b.m24689a(view, i);
            if (viewPager2 != null) {
                return new C28398f(constraintLayout, constraintLayout, tabsGroupView, viewPager2);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: d */
    public static C28398f m87114d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C27011f.fragment_discovery_container, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m87113a(inflate);
    }

    /* renamed from: c */
    public ConstraintLayout mo3946b() {
        return this.f72016d;
    }
}
