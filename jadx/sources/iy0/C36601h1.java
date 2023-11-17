package iy0;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import hy0.C36271e;
import hy0.C36272f;
import p086g1.C6201a;
import p086g1.C6202b;
import p341ge.bog.designsystem.components.emptywidget.EmptyWidget;
import p341ge.bog.designsystem.components.layersandshadows.LayerView;
import p341ge.bog.designsystem.components.list.TwoLineTextItem;

/* renamed from: iy0.h1 */
public final class C36601h1 implements C6201a {

    /* renamed from: d */
    private final LayerView f88250d;

    /* renamed from: e */
    public final TwoLineTextItem f88251e;

    /* renamed from: f */
    public final TwoLineTextItem f88252f;

    /* renamed from: g */
    public final TwoLineTextItem f88253g;

    /* renamed from: h */
    public final TwoLineTextItem f88254h;

    /* renamed from: i */
    public final TwoLineTextItem f88255i;

    /* renamed from: j */
    public final EmptyWidget f88256j;

    /* renamed from: k */
    public final TwoLineTextItem f88257k;

    private C36601h1(LayerView layerView, TwoLineTextItem twoLineTextItem, TwoLineTextItem twoLineTextItem2, TwoLineTextItem twoLineTextItem3, TwoLineTextItem twoLineTextItem4, TwoLineTextItem twoLineTextItem5, EmptyWidget emptyWidget, TwoLineTextItem twoLineTextItem6) {
        this.f88250d = layerView;
        this.f88251e = twoLineTextItem;
        this.f88252f = twoLineTextItem2;
        this.f88253g = twoLineTextItem3;
        this.f88254h = twoLineTextItem4;
        this.f88255i = twoLineTextItem5;
        this.f88256j = emptyWidget;
        this.f88257k = twoLineTextItem6;
    }

    /* renamed from: a */
    public static C36601h1 m108532a(View view) {
        int i = C36271e.accrued_interest;
        TwoLineTextItem twoLineTextItem = (TwoLineTextItem) C6202b.m24689a(view, i);
        if (twoLineTextItem != null) {
            i = C36271e.billing_date;
            TwoLineTextItem twoLineTextItem2 = (TwoLineTextItem) C6202b.m24689a(view, i);
            if (twoLineTextItem2 != null) {
                i = C36271e.f87494M;
                TwoLineTextItem twoLineTextItem3 = (TwoLineTextItem) C6202b.m24689a(view, i);
                if (twoLineTextItem3 != null) {
                    i = C36271e.minimum_payment;
                    TwoLineTextItem twoLineTextItem4 = (TwoLineTextItem) C6202b.m24689a(view, i);
                    if (twoLineTextItem4 != null) {
                        i = C36271e.principal_amount;
                        TwoLineTextItem twoLineTextItem5 = (TwoLineTextItem) C6202b.m24689a(view, i);
                        if (twoLineTextItem5 != null) {
                            i = C36271e.f87542r2;
                            EmptyWidget emptyWidget = (EmptyWidget) C6202b.m24689a(view, i);
                            if (emptyWidget != null) {
                                i = C36271e.used_bill_amount;
                                TwoLineTextItem twoLineTextItem6 = (TwoLineTextItem) C6202b.m24689a(view, i);
                                if (twoLineTextItem6 != null) {
                                    return new C36601h1((LayerView) view, twoLineTextItem, twoLineTextItem2, twoLineTextItem3, twoLineTextItem4, twoLineTextItem5, emptyWidget, twoLineTextItem6);
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
    public static C36601h1 m108533d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C36272f.item_credit_card_billing_details, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m108532a(inflate);
    }

    /* renamed from: c */
    public LayerView mo3946b() {
        return this.f88250d;
    }
}
