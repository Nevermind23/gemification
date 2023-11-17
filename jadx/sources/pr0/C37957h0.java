package pr0;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.widget.NestedScrollView;
import androidx.recyclerview.widget.RecyclerView;
import lr0.C37130e;
import lr0.C37131f;
import p086g1.C6201a;
import p086g1.C6202b;
import p341ge.bog.designsystem.components.buttons.Button;
import p341ge.bog.designsystem.components.emptywidget.EmptyWidget;
import p341ge.bog.designsystem.components.inlinefeedback.InlineFeedback;
import p341ge.bog.designsystem.components.layersandshadows.LayerView;
import p341ge.bog.designsystem.components.pagestate.PageState;

/* renamed from: pr0.h0 */
public final class C37957h0 implements C6201a {

    /* renamed from: d */
    private final NestedScrollView f91203d;

    /* renamed from: e */
    public final Button f91204e;

    /* renamed from: f */
    public final LayerView f91205f;

    /* renamed from: g */
    public final PageState f91206g;

    /* renamed from: h */
    public final RecyclerView f91207h;

    /* renamed from: i */
    public final InlineFeedback f91208i;

    /* renamed from: j */
    public final EmptyWidget f91209j;

    /* renamed from: k */
    public final LayerView f91210k;

    private C37957h0(NestedScrollView nestedScrollView, Button button, LayerView layerView, PageState pageState, RecyclerView recyclerView, InlineFeedback inlineFeedback, EmptyWidget emptyWidget, LayerView layerView2) {
        this.f91203d = nestedScrollView;
        this.f91204e = button;
        this.f91205f = layerView;
        this.f91206g = pageState;
        this.f91207h = recyclerView;
        this.f91208i = inlineFeedback;
        this.f91209j = emptyWidget;
        this.f91210k = layerView2;
    }

    /* renamed from: a */
    public static C37957h0 m111573a(View view) {
        int i = C37130e.button_back;
        Button button = (Button) C6202b.m24689a(view, i);
        if (button != null) {
            i = C37130e.f89418D;
            LayerView layerView = (LayerView) C6202b.m24689a(view, i);
            if (layerView != null) {
                i = C37130e.f89415B0;
                PageState pageState = (PageState) C6202b.m24689a(view, i);
                if (pageState != null) {
                    i = C37130e.payment_details_list;
                    RecyclerView recyclerView = (RecyclerView) C6202b.m24689a(view, i);
                    if (recyclerView != null) {
                        i = C37130e.pending_feedback;
                        InlineFeedback inlineFeedback = (InlineFeedback) C6202b.m24689a(view, i);
                        if (inlineFeedback != null) {
                            i = C37130e.result_details_text;
                            EmptyWidget emptyWidget = (EmptyWidget) C6202b.m24689a(view, i);
                            if (emptyWidget != null) {
                                i = C37130e.result_view;
                                LayerView layerView2 = (LayerView) C6202b.m24689a(view, i);
                                if (layerView2 != null) {
                                    return new C37957h0((NestedScrollView) view, button, layerView, pageState, recyclerView, inlineFeedback, emptyWidget, layerView2);
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
    public static C37957h0 m111574d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C37131f.repayment_success_fragment, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m111573a(inflate);
    }

    /* renamed from: c */
    public NestedScrollView mo3946b() {
        return this.f91203d;
    }
}
