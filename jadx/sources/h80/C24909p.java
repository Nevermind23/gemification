package h80;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import p086g1.C6201a;
import p086g1.C6202b;
import p341ge.bog.designsystem.components.list.ListItem;
import p341ge.bog.designsystem.components.list.SingleLineTextItem;
import p341ge.bog.designsystem.components.list.TwoLineTextItem;
import p341ge.bog.mobilebank.p975ui.views.widgets.BigDividerView;
import u70.C28606b;
import u70.C28607c;

/* renamed from: h80.p */
public final class C24909p implements C6201a {

    /* renamed from: d */
    private final LinearLayout f64040d;

    /* renamed from: e */
    public final BigDividerView f64041e;

    /* renamed from: f */
    public final TwoLineTextItem f64042f;

    /* renamed from: g */
    public final ListItem f64043g;

    /* renamed from: h */
    public final SingleLineTextItem f64044h;

    /* renamed from: i */
    public final ListItem f64045i;

    private C24909p(LinearLayout linearLayout, BigDividerView bigDividerView, TwoLineTextItem twoLineTextItem, ListItem listItem, SingleLineTextItem singleLineTextItem, ListItem listItem2) {
        this.f64040d = linearLayout;
        this.f64041e = bigDividerView;
        this.f64042f = twoLineTextItem;
        this.f64043g = listItem;
        this.f64044h = singleLineTextItem;
        this.f64045i = listItem2;
    }

    /* renamed from: a */
    public static C24909p m79621a(View view) {
        int i = C28606b.f72568B;
        BigDividerView bigDividerView = (BigDividerView) C6202b.m24689a(view, i);
        if (bigDividerView != null) {
            i = C28606b.f72576H0;
            TwoLineTextItem twoLineTextItem = (TwoLineTextItem) C6202b.m24689a(view, i);
            if (twoLineTextItem != null) {
                i = C28606b.selected_list_item;
                ListItem listItem = (ListItem) C6202b.m24689a(view, i);
                if (listItem != null) {
                    i = C28606b.unselected;
                    SingleLineTextItem singleLineTextItem = (SingleLineTextItem) C6202b.m24689a(view, i);
                    if (singleLineTextItem != null) {
                        i = C28606b.unselected_list_item;
                        ListItem listItem2 = (ListItem) C6202b.m24689a(view, i);
                        if (listItem2 != null) {
                            return new C24909p((LinearLayout) view, bigDividerView, twoLineTextItem, listItem, singleLineTextItem, listItem2);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: d */
    public static C24909p m79622d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C28607c.country_list_item, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m79621a(inflate);
    }

    /* renamed from: c */
    public LinearLayout mo3946b() {
        return this.f64040d;
    }
}
