package xb0;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.recyclerview.widget.RecyclerView;
import p086g1.C6201a;
import p086g1.C6202b;
import p341ge.bog.designsystem.components.buttons.Button;
import p341ge.bog.designsystem.components.emptywidget.EmptyWidget;
import p341ge.bog.designsystem.components.inlinefeedback2.InlineFeedback2;
import p341ge.bog.designsystem.components.layersandshadows.LayerView;
import p341ge.bog.designsystem.components.pagestate.PageState;
import rb0.C27985d;
import rb0.C27986e;

/* renamed from: xb0.l */
public final class C29724l implements C6201a {

    /* renamed from: d */
    private final CoordinatorLayout f75110d;

    /* renamed from: e */
    public final LayerView f75111e;

    /* renamed from: f */
    public final RecyclerView f75112f;

    /* renamed from: g */
    public final EmptyWidget f75113g;

    /* renamed from: h */
    public final InlineFeedback2 f75114h;

    /* renamed from: i */
    public final Button f75115i;

    /* renamed from: j */
    public final PageState f75116j;

    /* renamed from: k */
    public final LinearLayout f75117k;

    private C29724l(CoordinatorLayout coordinatorLayout, LayerView layerView, RecyclerView recyclerView, EmptyWidget emptyWidget, InlineFeedback2 inlineFeedback2, Button button, PageState pageState, LinearLayout linearLayout) {
        this.f75110d = coordinatorLayout;
        this.f75111e = layerView;
        this.f75112f = recyclerView;
        this.f75113g = emptyWidget;
        this.f75114h = inlineFeedback2;
        this.f75115i = button;
        this.f75116j = pageState;
        this.f75117k = linearLayout;
    }

    /* renamed from: a */
    public static C29724l m90262a(View view) {
        int i = C27985d.f71270U;
        LayerView layerView = (LayerView) C6202b.m24689a(view, i);
        if (layerView != null) {
            i = C27985d.f71273Y;
            RecyclerView recyclerView = (RecyclerView) C6202b.m24689a(view, i);
            if (recyclerView != null) {
                i = C27985d.f71274Z;
                EmptyWidget emptyWidget = (EmptyWidget) C6202b.m24689a(view, i);
                if (emptyWidget != null) {
                    i = C27985d.f71289q0;
                    InlineFeedback2 inlineFeedback2 = (InlineFeedback2) C6202b.m24689a(view, i);
                    if (inlineFeedback2 != null) {
                        i = C27985d.f71302z0;
                        Button button = (Button) C6202b.m24689a(view, i);
                        if (button != null) {
                            i = C27985d.f71259F0;
                            PageState pageState = (PageState) C6202b.m24689a(view, i);
                            if (pageState != null) {
                                i = C27985d.f71283j1;
                                LinearLayout linearLayout = (LinearLayout) C6202b.m24689a(view, i);
                                if (linearLayout != null) {
                                    return new C29724l((CoordinatorLayout) view, layerView, recyclerView, emptyWidget, inlineFeedback2, button, pageState, linearLayout);
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: d */
    public static C29724l m90263d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C27986e.fragment_deposit_prolongation_result, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m90262a(inflate);
    }

    /* renamed from: c */
    public CoordinatorLayout mo3946b() {
        return this.f75110d;
    }
}
