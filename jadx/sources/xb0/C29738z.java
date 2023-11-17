package xb0;

import android.view.View;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import p086g1.C6201a;
import p086g1.C6202b;
import p341ge.bog.designsystem.components.buttons.Button;
import p341ge.bog.designsystem.components.emptywidget.EmptyWidget;
import p341ge.bog.designsystem.components.layersandshadows.LayerView;
import p341ge.bog.designsystem.components.loading.LoadingView;
import p341ge.bog.mobilebank.cleanarch.presentation.common.StateView;
import rb0.C27985d;

/* renamed from: xb0.z */
public final class C29738z implements C6201a {

    /* renamed from: d */
    private final LayerView f75161d;

    /* renamed from: e */
    public final Button f75162e;

    /* renamed from: f */
    public final LinearLayout f75163f;

    /* renamed from: g */
    public final EmptyWidget f75164g;

    /* renamed from: h */
    public final RecyclerView f75165h;

    /* renamed from: i */
    public final LoadingView f75166i;

    /* renamed from: j */
    public final StateView f75167j;

    private C29738z(LayerView layerView, Button button, LinearLayout linearLayout, EmptyWidget emptyWidget, RecyclerView recyclerView, LoadingView loadingView, StateView stateView) {
        this.f75161d = layerView;
        this.f75162e = button;
        this.f75163f = linearLayout;
        this.f75164g = emptyWidget;
        this.f75165h = recyclerView;
        this.f75166i = loadingView;
        this.f75167j = stateView;
    }

    /* renamed from: a */
    public static C29738z m90317a(View view) {
        int i = C27985d.f71264M0;
        Button button = (Button) C6202b.m24689a(view, i);
        if (button != null) {
            i = C27985d.section_error_layout;
            LinearLayout linearLayout = (LinearLayout) C6202b.m24689a(view, i);
            if (linearLayout != null) {
                i = C27985d.section_header;
                EmptyWidget emptyWidget = (EmptyWidget) C6202b.m24689a(view, i);
                if (emptyWidget != null) {
                    i = C27985d.section_recycler;
                    RecyclerView recyclerView = (RecyclerView) C6202b.m24689a(view, i);
                    if (recyclerView != null) {
                        i = C27985d.section_skeleton;
                        LoadingView loadingView = (LoadingView) C6202b.m24689a(view, i);
                        if (loadingView != null) {
                            i = C27985d.section_state;
                            StateView stateView = (StateView) C6202b.m24689a(view, i);
                            if (stateView != null) {
                                return new C29738z((LayerView) view, button, linearLayout, emptyWidget, recyclerView, loadingView, stateView);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: c */
    public LayerView mo3946b() {
        return this.f75161d;
    }
}
