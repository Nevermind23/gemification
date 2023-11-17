package h80;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import p086g1.C6201a;
import p086g1.C6202b;
import p341ge.bog.designsystem.components.layersandshadows.LayerView;
import p341ge.bog.designsystem.components.list.TwoLineTextItem;
import u70.C28606b;
import u70.C28607c;

/* renamed from: h80.u */
public final class C24914u implements C6201a {

    /* renamed from: d */
    private final LayerView f64061d;

    /* renamed from: e */
    public final TextView f64062e;

    /* renamed from: f */
    public final TwoLineTextItem f64063f;

    /* renamed from: g */
    public final TwoLineTextItem f64064g;

    /* renamed from: h */
    public final TwoLineTextItem f64065h;

    private C24914u(LayerView layerView, TextView textView, TwoLineTextItem twoLineTextItem, TwoLineTextItem twoLineTextItem2, TwoLineTextItem twoLineTextItem3) {
        this.f64061d = layerView;
        this.f64062e = textView;
        this.f64063f = twoLineTextItem;
        this.f64064g = twoLineTextItem2;
        this.f64065h = twoLineTextItem3;
    }

    /* renamed from: a */
    public static C24914u m79641a(View view) {
        int i = C28606b.f72580M;
        TextView textView = (TextView) C6202b.m24689a(view, i);
        if (textView != null) {
            i = C28606b.f72591Y;
            TwoLineTextItem twoLineTextItem = (TwoLineTextItem) C6202b.m24689a(view, i);
            if (twoLineTextItem != null) {
                i = C28606b.f72593b0;
                TwoLineTextItem twoLineTextItem2 = (TwoLineTextItem) C6202b.m24689a(view, i);
                if (twoLineTextItem2 != null) {
                    i = C28606b.f72594d0;
                    TwoLineTextItem twoLineTextItem3 = (TwoLineTextItem) C6202b.m24689a(view, i);
                    if (twoLineTextItem3 != null) {
                        return new C24914u((LayerView) view, textView, twoLineTextItem, twoLineTextItem2, twoLineTextItem3);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: d */
    public static C24914u m79642d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C28607c.item_result_loan_details, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m79641a(inflate);
    }

    /* renamed from: c */
    public LayerView mo3946b() {
        return this.f64061d;
    }
}
