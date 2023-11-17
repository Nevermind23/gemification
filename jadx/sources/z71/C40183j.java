package z71;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import p086g1.C6201a;
import p086g1.C6202b;
import p341ge.bog.designsystem.components.buttons.Button;
import p341ge.bog.designsystem.components.emptywidget.EmptyWidget;
import p341ge.bog.designsystem.components.layersandshadows.LayerView;
import p341ge.bog.designsystem.components.list.TwoLineTextItem;
import p341ge.bog.designsystem.components.pagestate.PageState;
import p341ge.bog.designsystem.components.smallsteps.SmallStepsView;
import y71.C40030d;
import y71.C40031e;

/* renamed from: z71.j */
public final class C40183j implements C6201a {

    /* renamed from: d */
    private final FrameLayout f95526d;

    /* renamed from: e */
    public final Button f95527e;

    /* renamed from: f */
    public final TwoLineTextItem f95528f;

    /* renamed from: g */
    public final SmallStepsView f95529g;

    /* renamed from: h */
    public final TwoLineTextItem f95530h;

    /* renamed from: i */
    public final EmptyWidget f95531i;

    /* renamed from: j */
    public final TwoLineTextItem f95532j;

    /* renamed from: k */
    public final FrameLayout f95533k;

    /* renamed from: l */
    public final PageState f95534l;

    /* renamed from: m */
    public final TwoLineTextItem f95535m;

    /* renamed from: n */
    public final LayerView f95536n;

    private C40183j(FrameLayout frameLayout, Button button, TwoLineTextItem twoLineTextItem, SmallStepsView smallStepsView, TwoLineTextItem twoLineTextItem2, EmptyWidget emptyWidget, TwoLineTextItem twoLineTextItem3, FrameLayout frameLayout2, PageState pageState, TwoLineTextItem twoLineTextItem4, LayerView layerView) {
        this.f95526d = frameLayout;
        this.f95527e = button;
        this.f95528f = twoLineTextItem;
        this.f95529g = smallStepsView;
        this.f95530h = twoLineTextItem2;
        this.f95531i = emptyWidget;
        this.f95532j = twoLineTextItem3;
        this.f95533k = frameLayout2;
        this.f95534l = pageState;
        this.f95535m = twoLineTextItem4;
        this.f95536n = layerView;
    }

    /* renamed from: a */
    public static C40183j m116439a(View view) {
        int i = C40030d.button_return_to_home_page;
        Button button = (Button) C6202b.m24689a(view, i);
        if (button != null) {
            i = C40030d.f95117v;
            TwoLineTextItem twoLineTextItem = (TwoLineTextItem) C6202b.m24689a(view, i);
            if (twoLineTextItem != null) {
                i = C40030d.f95120x;
                SmallStepsView smallStepsView = (SmallStepsView) C6202b.m24689a(view, i);
                if (smallStepsView != null) {
                    i = C40030d.first_name;
                    TwoLineTextItem twoLineTextItem2 = (TwoLineTextItem) C6202b.m24689a(view, i);
                    if (twoLineTextItem2 != null) {
                        i = C40030d.insured_person_info;
                        EmptyWidget emptyWidget = (EmptyWidget) C6202b.m24689a(view, i);
                        if (emptyWidget != null) {
                            i = C40030d.last_name;
                            TwoLineTextItem twoLineTextItem3 = (TwoLineTextItem) C6202b.m24689a(view, i);
                            if (twoLineTextItem3 != null) {
                                FrameLayout frameLayout = (FrameLayout) view;
                                i = C40030d.f95099a0;
                                PageState pageState = (PageState) C6202b.m24689a(view, i);
                                if (pageState != null) {
                                    i = C40030d.personal_id;
                                    TwoLineTextItem twoLineTextItem4 = (TwoLineTextItem) C6202b.m24689a(view, i);
                                    if (twoLineTextItem4 != null) {
                                        i = C40030d.f95102f0;
                                        LayerView layerView = (LayerView) C6202b.m24689a(view, i);
                                        if (layerView != null) {
                                            return new C40183j(frameLayout, button, twoLineTextItem, smallStepsView, twoLineTextItem2, emptyWidget, twoLineTextItem3, frameLayout, pageState, twoLineTextItem4, layerView);
                                        }
                                    }
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
    public static C40183j m116440d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C40031e.fragment_travel_insurance_success, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m116439a(inflate);
    }

    /* renamed from: c */
    public FrameLayout mo3946b() {
        return this.f95526d;
    }
}
