package h80;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import p086g1.C6201a;
import p086g1.C6202b;
import p341ge.bog.designsystem.components.list.ThreeLineTextItem;
import p341ge.bog.mobilebank.p975ui.views.widgets.BigDividerView;
import p341ge.bog.mobilebank.p975ui.views.widgets.BogImageView;
import u70.C28606b;
import u70.C28607c;

/* renamed from: h80.q */
public final class C24910q implements C6201a {

    /* renamed from: d */
    private final LinearLayout f64046d;

    /* renamed from: e */
    public final BigDividerView f64047e;

    /* renamed from: f */
    public final BogImageView f64048f;

    /* renamed from: g */
    public final ThreeLineTextItem f64049g;

    private C24910q(LinearLayout linearLayout, BigDividerView bigDividerView, BogImageView bogImageView, ThreeLineTextItem threeLineTextItem) {
        this.f64046d = linearLayout;
        this.f64047e = bigDividerView;
        this.f64048f = bogImageView;
        this.f64049g = threeLineTextItem;
    }

    /* renamed from: a */
    public static C24910q m79625a(View view) {
        int i = C28606b.f72568B;
        BigDividerView bigDividerView = (BigDividerView) C6202b.m24689a(view, i);
        if (bigDividerView != null) {
            i = C28606b.f72572F;
            BogImageView bogImageView = (BogImageView) C6202b.m24689a(view, i);
            if (bogImageView != null) {
                i = C28606b.f72590W;
                ThreeLineTextItem threeLineTextItem = (ThreeLineTextItem) C6202b.m24689a(view, i);
                if (threeLineTextItem != null) {
                    return new C24910q((LinearLayout) view, bigDividerView, bogImageView, threeLineTextItem);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: d */
    public static C24910q m79626d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C28607c.income_list_item, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m79625a(inflate);
    }

    /* renamed from: c */
    public LinearLayout mo3946b() {
        return this.f64046d;
    }
}
