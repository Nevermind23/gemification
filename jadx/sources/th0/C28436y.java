package th0;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import oh0.C27011f;
import p086g1.C6201a;
import p341ge.bog.designsystem.components.tabgroup.TabsGroupView;

/* renamed from: th0.y */
public final class C28436y implements C6201a {

    /* renamed from: d */
    private final TabsGroupView f72234d;

    /* renamed from: e */
    public final TabsGroupView f72235e;

    private C28436y(TabsGroupView tabsGroupView, TabsGroupView tabsGroupView2) {
        this.f72234d = tabsGroupView;
        this.f72235e = tabsGroupView2;
    }

    /* renamed from: a */
    public static C28436y m87267a(View view) {
        if (view != null) {
            TabsGroupView tabsGroupView = (TabsGroupView) view;
            return new C28436y(tabsGroupView, tabsGroupView);
        }
        throw new NullPointerException("rootView");
    }

    /* renamed from: d */
    public static C28436y m87268d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C27011f.item_filtered_categories, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m87267a(inflate);
    }

    /* renamed from: c */
    public TabsGroupView mo3946b() {
        return this.f72234d;
    }
}
