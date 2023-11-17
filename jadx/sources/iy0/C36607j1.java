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
import p341ge.bog.mobilebank.p975ui.views.widgets.BigDividerView;

/* renamed from: iy0.j1 */
public final class C36607j1 implements C6201a {

    /* renamed from: d */
    private final LayerView f88287d;

    /* renamed from: e */
    public final TextView f88288e;

    /* renamed from: f */
    public final BigDividerView f88289f;

    /* renamed from: g */
    public final ListItem f88290g;

    /* renamed from: h */
    public final TextView f88291h;

    /* renamed from: i */
    public final ListItem f88292i;

    /* renamed from: j */
    public final TextView f88293j;

    /* renamed from: k */
    public final ListItem f88294k;

    /* renamed from: l */
    public final EmptyWidget f88295l;

    private C36607j1(LayerView layerView, TextView textView, BigDividerView bigDividerView, ListItem listItem, TextView textView2, ListItem listItem2, TextView textView3, ListItem listItem3, EmptyWidget emptyWidget) {
        this.f88287d = layerView;
        this.f88288e = textView;
        this.f88289f = bigDividerView;
        this.f88290g = listItem;
        this.f88291h = textView2;
        this.f88292i = listItem2;
        this.f88293j = textView3;
        this.f88294k = listItem3;
        this.f88295l = emptyWidget;
    }

    /* renamed from: a */
    public static C36607j1 m108558a(View view) {
        int i = C36271e.full_payment;
        TextView textView = (TextView) C6202b.m24689a(view, i);
        if (textView != null) {
            i = C36271e.full_payment_divider;
            BigDividerView bigDividerView = (BigDividerView) C6202b.m24689a(view, i);
            if (bigDividerView != null) {
                i = C36271e.full_payment_item;
                ListItem listItem = (ListItem) C6202b.m24689a(view, i);
                if (listItem != null) {
                    i = C36271e.minimum_payment;
                    TextView textView2 = (TextView) C6202b.m24689a(view, i);
                    if (textView2 != null) {
                        i = C36271e.minimum_payment_item;
                        ListItem listItem2 = (ListItem) C6202b.m24689a(view, i);
                        if (listItem2 != null) {
                            i = C36271e.f87492J1;
                            TextView textView3 = (TextView) C6202b.m24689a(view, i);
                            if (textView3 != null) {
                                i = C36271e.payment_date_item;
                                ListItem listItem3 = (ListItem) C6202b.m24689a(view, i);
                                if (listItem3 != null) {
                                    i = C36271e.f87542r2;
                                    EmptyWidget emptyWidget = (EmptyWidget) C6202b.m24689a(view, i);
                                    if (emptyWidget != null) {
                                        return new C36607j1((LayerView) view, textView, bigDividerView, listItem, textView2, listItem2, textView3, listItem3, emptyWidget);
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
    public static C36607j1 m108559d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C36272f.item_credit_card_payment_details, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m108558a(inflate);
    }

    /* renamed from: c */
    public LayerView mo3946b() {
        return this.f88287d;
    }
}
