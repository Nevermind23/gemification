package p413eo;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import p086g1.C6201a;
import p341ge.bog.designsystem.components.packagecard.PackageCardView;
import p356ao.C10115g;

/* renamed from: eo.p0 */
public final class C12763p0 implements C6201a {

    /* renamed from: d */
    private final PackageCardView f37821d;

    /* renamed from: e */
    public final PackageCardView f37822e;

    private C12763p0(PackageCardView packageCardView, PackageCardView packageCardView2) {
        this.f37821d = packageCardView;
        this.f37822e = packageCardView2;
    }

    /* renamed from: a */
    public static C12763p0 m48448a(View view) {
        if (view != null) {
            PackageCardView packageCardView = (PackageCardView) view;
            return new C12763p0(packageCardView, packageCardView);
        }
        throw new NullPointerException("rootView");
    }

    /* renamed from: d */
    public static C12763p0 m48449d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C10115g.item_package_card, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m48448a(inflate);
    }

    /* renamed from: c */
    public PackageCardView mo3946b() {
        return this.f37821d;
    }
}
