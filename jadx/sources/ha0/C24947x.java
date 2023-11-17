package ha0;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import da0.C19952f;
import p086g1.C6201a;
import p341ge.bog.designsystem.components.depositcard.DepositCardView;

/* renamed from: ha0.x */
public final class C24947x implements C6201a {

    /* renamed from: d */
    private final DepositCardView f64260d;

    /* renamed from: e */
    public final DepositCardView f64261e;

    private C24947x(DepositCardView depositCardView, DepositCardView depositCardView2) {
        this.f64260d = depositCardView;
        this.f64261e = depositCardView2;
    }

    /* renamed from: a */
    public static C24947x m79768a(View view) {
        if (view != null) {
            DepositCardView depositCardView = (DepositCardView) view;
            return new C24947x(depositCardView, depositCardView);
        }
        throw new NullPointerException("rootView");
    }

    /* renamed from: d */
    public static C24947x m79769d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C19952f.list_item_deposit_type, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m79768a(inflate);
    }

    /* renamed from: c */
    public DepositCardView mo3946b() {
        return this.f64260d;
    }
}
