package p90;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import p086g1.C6201a;
import p341ge.bog.designsystem.components.productcards.AccountCardView;
import p366bk.C10324m;

/* renamed from: p90.n4 */
public final class C27375n4 implements C6201a {

    /* renamed from: d */
    private final AccountCardView f69379d;

    private C27375n4(AccountCardView accountCardView) {
        this.f69379d = accountCardView;
    }

    /* renamed from: a */
    public static C27375n4 m84807a(View view) {
        if (view != null) {
            return new C27375n4((AccountCardView) view);
        }
        throw new NullPointerException("rootView");
    }

    /* renamed from: d */
    public static C27375n4 m84808d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C10324m.home_card_swiper_item_card_layout, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m84807a(inflate);
    }

    /* renamed from: c */
    public AccountCardView mo3946b() {
        return this.f69379d;
    }
}
