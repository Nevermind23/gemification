package sp0;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import np0.C37439e;
import np0.C37440f;
import p086g1.C6201a;
import p086g1.C6202b;
import p341ge.bog.designsystem.components.buttons.Button;
import p341ge.bog.designsystem.components.emptywidget.EmptyWidget;
import p341ge.bog.designsystem.components.pagestate.PageState;

/* renamed from: sp0.m */
public final class C38494m implements C6201a {

    /* renamed from: d */
    private final ScrollView f92238d;

    /* renamed from: e */
    public final LinearLayout f92239e;

    /* renamed from: f */
    public final EmptyWidget f92240f;

    /* renamed from: g */
    public final PageState f92241g;

    /* renamed from: h */
    public final Button f92242h;

    private C38494m(ScrollView scrollView, LinearLayout linearLayout, EmptyWidget emptyWidget, PageState pageState, Button button) {
        this.f92238d = scrollView;
        this.f92239e = linearLayout;
        this.f92240f = emptyWidget;
        this.f92241g = pageState;
        this.f92242h = button;
    }

    /* renamed from: a */
    public static C38494m m112990a(View view) {
        int i = C37439e.f90015w;
        LinearLayout linearLayout = (LinearLayout) C6202b.m24689a(view, i);
        if (linearLayout != null) {
            i = C37439e.details_container_header;
            EmptyWidget emptyWidget = (EmptyWidget) C6202b.m24689a(view, i);
            if (emptyWidget != null) {
                i = C37439e.f90014q0;
                PageState pageState = (PageState) C6202b.m24689a(view, i);
                if (pageState != null) {
                    i = C37439e.f89989O0;
                    Button button = (Button) C6202b.m24689a(view, i);
                    if (button != null) {
                        return new C38494m((ScrollView) view, linearLayout, emptyWidget, pageState, button);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: d */
    public static C38494m m112991d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C37440f.fragment_activation_result, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m112990a(inflate);
    }

    /* renamed from: c */
    public ScrollView mo3946b() {
        return this.f92238d;
    }
}
