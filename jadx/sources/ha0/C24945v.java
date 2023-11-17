package ha0;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import da0.C19951e;
import da0.C19952f;
import p086g1.C6201a;
import p086g1.C6202b;
import p341ge.bog.designsystem.components.depositcard.DepositCardView;

/* renamed from: ha0.v */
public final class C24945v implements C6201a {

    /* renamed from: d */
    private final LinearLayout f64256d;

    /* renamed from: e */
    public final DepositCardView f64257e;

    /* renamed from: f */
    public final LinearLayout f64258f;

    private C24945v(LinearLayout linearLayout, DepositCardView depositCardView, LinearLayout linearLayout2) {
        this.f64256d = linearLayout;
        this.f64257e = depositCardView;
        this.f64258f = linearLayout2;
    }

    /* renamed from: a */
    public static C24945v m79760a(View view) {
        int i = C19951e.deposit_card;
        DepositCardView depositCardView = (DepositCardView) C6202b.m24689a(view, i);
        if (depositCardView != null) {
            i = C19951e.deposit_features_view;
            LinearLayout linearLayout = (LinearLayout) C6202b.m24689a(view, i);
            if (linearLayout != null) {
                return new C24945v((LinearLayout) view, depositCardView, linearLayout);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: d */
    public static C24945v m79761d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C19952f.list_item_deposit_card, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m79760a(inflate);
    }

    /* renamed from: c */
    public LinearLayout mo3946b() {
        return this.f64256d;
    }
}
