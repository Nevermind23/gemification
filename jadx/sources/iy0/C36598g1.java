package iy0;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import hy0.C36271e;
import hy0.C36272f;
import p086g1.C6201a;
import p086g1.C6202b;
import p341ge.bog.designsystem.components.emptywidget.EmptyWidget;
import p341ge.bog.designsystem.components.layersandshadows.LayerView;
import p341ge.bog.designsystem.components.list.ListItem;
import p341ge.bog.designsystem.components.list.SingleLineTextItem;
import p341ge.bog.designsystem.components.list.TwoLineTextItem;
import p341ge.bog.mobilebank.p975ui.views.widgets.BigDividerView;

/* renamed from: iy0.g1 */
public final class C36598g1 implements C6201a {

    /* renamed from: d */
    private final LayerView f88209d;

    /* renamed from: e */
    public final ListItem f88210e;

    /* renamed from: f */
    public final BigDividerView f88211f;

    /* renamed from: g */
    public final SingleLineTextItem f88212g;

    /* renamed from: h */
    public final TwoLineTextItem f88213h;

    /* renamed from: i */
    public final TextView f88214i;

    /* renamed from: j */
    public final BigDividerView f88215j;

    /* renamed from: k */
    public final ListItem f88216k;

    /* renamed from: l */
    public final TwoLineTextItem f88217l;

    /* renamed from: m */
    public final EmptyWidget f88218m;

    private C36598g1(LayerView layerView, ListItem listItem, BigDividerView bigDividerView, SingleLineTextItem singleLineTextItem, TwoLineTextItem twoLineTextItem, TextView textView, BigDividerView bigDividerView2, ListItem listItem2, TwoLineTextItem twoLineTextItem2, EmptyWidget emptyWidget) {
        this.f88209d = layerView;
        this.f88210e = listItem;
        this.f88211f = bigDividerView;
        this.f88212g = singleLineTextItem;
        this.f88213h = twoLineTextItem;
        this.f88214i = textView;
        this.f88215j = bigDividerView2;
        this.f88216k = listItem2;
        this.f88217l = twoLineTextItem2;
        this.f88218m = emptyWidget;
    }

    /* renamed from: a */
    public static C36598g1 m108519a(View view) {
        int i = C36271e.agreement;
        ListItem listItem = (ListItem) C6202b.m24689a(view, i);
        if (listItem != null) {
            i = C36271e.agreement_divider;
            BigDividerView bigDividerView = (BigDividerView) C6202b.m24689a(view, i);
            if (bigDividerView != null) {
                i = C36271e.f87523j;
                SingleLineTextItem singleLineTextItem = (SingleLineTextItem) C6202b.m24689a(view, i);
                if (singleLineTextItem != null) {
                    i = C36271e.atm_percent;
                    TwoLineTextItem twoLineTextItem = (TwoLineTextItem) C6202b.m24689a(view, i);
                    if (twoLineTextItem != null) {
                        i = C36271e.credit_limit;
                        TextView textView = (TextView) C6202b.m24689a(view, i);
                        if (textView != null) {
                            i = C36271e.credit_limit_divider;
                            BigDividerView bigDividerView2 = (BigDividerView) C6202b.m24689a(view, i);
                            if (bigDividerView2 != null) {
                                i = C36271e.credit_limit_item;
                                ListItem listItem2 = (ListItem) C6202b.m24689a(view, i);
                                if (listItem2 != null) {
                                    i = C36271e.pos_percent;
                                    TwoLineTextItem twoLineTextItem2 = (TwoLineTextItem) C6202b.m24689a(view, i);
                                    if (twoLineTextItem2 != null) {
                                        i = C36271e.f87542r2;
                                        EmptyWidget emptyWidget = (EmptyWidget) C6202b.m24689a(view, i);
                                        if (emptyWidget != null) {
                                            return new C36598g1((LayerView) view, listItem, bigDividerView, singleLineTextItem, twoLineTextItem, textView, bigDividerView2, listItem2, twoLineTextItem2, emptyWidget);
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
    public static C36598g1 m108520d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C36272f.item_credit_account_details, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m108519a(inflate);
    }

    /* renamed from: c */
    public LayerView mo3946b() {
        return this.f88209d;
    }
}
