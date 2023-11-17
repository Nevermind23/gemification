package il0;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import el0.C20264b;
import el0.C20265c;
import p086g1.C6201a;
import p086g1.C6202b;
import p341ge.bog.designsystem.components.cardbadgesupdate.CardBadgeView;
import p341ge.bog.designsystem.components.list.ListItem;
import p341ge.bog.designsystem.components.list.ThreeLineTextItem;

/* renamed from: il0.b */
public final class C25225b implements C6201a {

    /* renamed from: d */
    private final ListItem f64798d;

    /* renamed from: e */
    public final CardBadgeView f64799e;

    /* renamed from: f */
    public final ImageView f64800f;

    /* renamed from: g */
    public final ThreeLineTextItem f64801g;

    private C25225b(ListItem listItem, CardBadgeView cardBadgeView, ImageView imageView, ThreeLineTextItem threeLineTextItem) {
        this.f64798d = listItem;
        this.f64799e = cardBadgeView;
        this.f64800f = imageView;
        this.f64801g = threeLineTextItem;
    }

    /* renamed from: a */
    public static C25225b m80297a(View view) {
        int i = C20264b.amex_icon;
        CardBadgeView cardBadgeView = (CardBadgeView) C6202b.m24689a(view, i);
        if (cardBadgeView != null) {
            i = C20264b.f55162b;
            ImageView imageView = (ImageView) C6202b.m24689a(view, i);
            if (imageView != null) {
                i = C20264b.policy_info;
                ThreeLineTextItem threeLineTextItem = (ThreeLineTextItem) C6202b.m24689a(view, i);
                if (threeLineTextItem != null) {
                    return new C25225b((ListItem) view, cardBadgeView, imageView, threeLineTextItem);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: d */
    public static C25225b m80298d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C20265c.item_inner_policy, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m80297a(inflate);
    }

    /* renamed from: c */
    public ListItem mo3946b() {
        return this.f64798d;
    }
}
