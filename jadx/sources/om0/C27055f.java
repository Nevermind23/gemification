package om0;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.widget.NestedScrollView;
import km0.C25745c;
import km0.C25746d;
import p086g1.C6201a;
import p086g1.C6202b;
import p341ge.bog.designsystem.components.buttons.Button;
import p341ge.bog.designsystem.components.emptywidget.EmptyWidget;
import p341ge.bog.designsystem.components.layersandshadows.LayerView;
import p341ge.bog.designsystem.components.list.TwoLineTextItem;
import p341ge.bog.designsystem.components.pagestate.PageState;
import p341ge.bog.mobilebank.p975ui.views.widgets.BigDividerView;

/* renamed from: om0.f */
public final class C27055f implements C6201a {

    /* renamed from: d */
    private final NestedScrollView f67960d;

    /* renamed from: e */
    public final TwoLineTextItem f67961e;

    /* renamed from: f */
    public final EmptyWidget f67962f;

    /* renamed from: g */
    public final Button f67963g;

    /* renamed from: h */
    public final TwoLineTextItem f67964h;

    /* renamed from: i */
    public final BigDividerView f67965i;

    /* renamed from: j */
    public final LayerView f67966j;

    /* renamed from: k */
    public final TwoLineTextItem f67967k;

    /* renamed from: l */
    public final PageState f67968l;

    /* renamed from: m */
    public final LayerView f67969m;

    private C27055f(NestedScrollView nestedScrollView, TwoLineTextItem twoLineTextItem, EmptyWidget emptyWidget, Button button, TwoLineTextItem twoLineTextItem2, BigDividerView bigDividerView, LayerView layerView, TwoLineTextItem twoLineTextItem3, PageState pageState, LayerView layerView2) {
        this.f67960d = nestedScrollView;
        this.f67961e = twoLineTextItem;
        this.f67962f = emptyWidget;
        this.f67963g = button;
        this.f67964h = twoLineTextItem2;
        this.f67965i = bigDividerView;
        this.f67966j = layerView;
        this.f67967k = twoLineTextItem3;
        this.f67968l = pageState;
        this.f67969m = layerView2;
    }

    /* renamed from: a */
    public static C27055f m83894a(View view) {
        int i = C25745c.birth_day;
        TwoLineTextItem twoLineTextItem = (TwoLineTextItem) C6202b.m24689a(view, i);
        if (twoLineTextItem != null) {
            i = C25745c.f65526m;
            EmptyWidget emptyWidget = (EmptyWidget) C6202b.m24689a(view, i);
            if (emptyWidget != null) {
                i = C25745c.f65530r;
                Button button = (Button) C6202b.m24689a(view, i);
                if (button != null) {
                    i = C25745c.f65531s;
                    TwoLineTextItem twoLineTextItem2 = (TwoLineTextItem) C6202b.m24689a(view, i);
                    if (twoLineTextItem2 != null) {
                        i = C25745c.id_number_divider;
                        BigDividerView bigDividerView = (BigDividerView) C6202b.m24689a(view, i);
                        if (bigDividerView != null) {
                            i = C25745c.info_container_shape;
                            LayerView layerView = (LayerView) C6202b.m24689a(view, i);
                            if (layerView != null) {
                                i = C25745c.name_last_name;
                                TwoLineTextItem twoLineTextItem3 = (TwoLineTextItem) C6202b.m24689a(view, i);
                                if (twoLineTextItem3 != null) {
                                    i = C25745c.f65518D;
                                    PageState pageState = (PageState) C6202b.m24689a(view, i);
                                    if (pageState != null) {
                                        i = C25745c.success_container_shape;
                                        LayerView layerView2 = (LayerView) C6202b.m24689a(view, i);
                                        if (layerView2 != null) {
                                            return new C27055f((NestedScrollView) view, twoLineTextItem, emptyWidget, button, twoLineTextItem2, bigDividerView, layerView, twoLineTextItem3, pageState, layerView2);
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
    public static C27055f m83895d(LayoutInflater layoutInflater) {
        return m83896e(layoutInflater, (ViewGroup) null, false);
    }

    /* renamed from: e */
    public static C27055f m83896e(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C25746d.fragment_junior_result, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m83894a(inflate);
    }

    /* renamed from: c */
    public NestedScrollView mo3946b() {
        return this.f67960d;
    }
}
