package xb0;

import android.view.View;
import androidx.appcompat.widget.AppCompatTextView;
import p086g1.C6201a;
import p086g1.C6202b;
import p341ge.bog.designsystem.components.emptywidget.EmptyWidget;
import p341ge.bog.designsystem.components.layersandshadows.LayerView;
import p341ge.bog.designsystem.components.list.SingleLineTextItem;
import p341ge.bog.designsystem.components.list.TwoLineReverseTextItem;
import rb0.C27985d;

/* renamed from: xb0.j */
public final class C29722j implements C6201a {

    /* renamed from: d */
    private final LayerView f75081d;

    /* renamed from: e */
    public final EmptyWidget f75082e;

    /* renamed from: f */
    public final TwoLineReverseTextItem f75083f;

    /* renamed from: g */
    public final AppCompatTextView f75084g;

    /* renamed from: h */
    public final LayerView f75085h;

    /* renamed from: i */
    public final SingleLineTextItem f75086i;

    /* renamed from: j */
    public final AppCompatTextView f75087j;

    /* renamed from: k */
    public final SingleLineTextItem f75088k;

    /* renamed from: l */
    public final AppCompatTextView f75089l;

    /* renamed from: m */
    public final SingleLineTextItem f75090m;

    /* renamed from: n */
    public final AppCompatTextView f75091n;

    private C29722j(LayerView layerView, EmptyWidget emptyWidget, TwoLineReverseTextItem twoLineReverseTextItem, AppCompatTextView appCompatTextView, LayerView layerView2, SingleLineTextItem singleLineTextItem, AppCompatTextView appCompatTextView2, SingleLineTextItem singleLineTextItem2, AppCompatTextView appCompatTextView3, SingleLineTextItem singleLineTextItem3, AppCompatTextView appCompatTextView4) {
        this.f75081d = layerView;
        this.f75082e = emptyWidget;
        this.f75083f = twoLineReverseTextItem;
        this.f75084g = appCompatTextView;
        this.f75085h = layerView2;
        this.f75086i = singleLineTextItem;
        this.f75087j = appCompatTextView2;
        this.f75088k = singleLineTextItem2;
        this.f75089l = appCompatTextView3;
        this.f75090m = singleLineTextItem3;
        this.f75091n = appCompatTextView4;
    }

    /* renamed from: a */
    public static C29722j m90255a(View view) {
        int i = C27985d.block_title;
        EmptyWidget emptyWidget = (EmptyWidget) C6202b.m24689a(view, i);
        if (emptyWidget != null) {
            i = C27985d.extra_interest_title;
            TwoLineReverseTextItem twoLineReverseTextItem = (TwoLineReverseTextItem) C6202b.m24689a(view, i);
            if (twoLineReverseTextItem != null) {
                i = C27985d.extra_interest_value;
                AppCompatTextView appCompatTextView = (AppCompatTextView) C6202b.m24689a(view, i);
                if (appCompatTextView != null) {
                    LayerView layerView = (LayerView) view;
                    i = C27985d.f71296t0;
                    SingleLineTextItem singleLineTextItem = (SingleLineTextItem) C6202b.m24689a(view, i);
                    if (singleLineTextItem != null) {
                        i = C27985d.interest_value;
                        AppCompatTextView appCompatTextView2 = (AppCompatTextView) C6202b.m24689a(view, i);
                        if (appCompatTextView2 != null) {
                            i = C27985d.planed_interest_title;
                            SingleLineTextItem singleLineTextItem2 = (SingleLineTextItem) C6202b.m24689a(view, i);
                            if (singleLineTextItem2 != null) {
                                i = C27985d.planed_interest_value;
                                AppCompatTextView appCompatTextView3 = (AppCompatTextView) C6202b.m24689a(view, i);
                                if (appCompatTextView3 != null) {
                                    i = C27985d.total_interest_title;
                                    SingleLineTextItem singleLineTextItem3 = (SingleLineTextItem) C6202b.m24689a(view, i);
                                    if (singleLineTextItem3 != null) {
                                        i = C27985d.total_interest_value;
                                        AppCompatTextView appCompatTextView4 = (AppCompatTextView) C6202b.m24689a(view, i);
                                        if (appCompatTextView4 != null) {
                                            return new C29722j(layerView, emptyWidget, twoLineReverseTextItem, appCompatTextView, layerView, singleLineTextItem, appCompatTextView2, singleLineTextItem2, appCompatTextView3, singleLineTextItem3, appCompatTextView4);
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

    /* renamed from: c */
    public LayerView mo3946b() {
        return this.f75081d;
    }
}
