package p413eo;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.widget.NestedScrollView;
import p086g1.C6201a;
import p086g1.C6202b;
import p341ge.bog.designsystem.components.buttons.Button;
import p341ge.bog.designsystem.components.packagecard.PackageCardView;
import p341ge.bog.designsystem.components.pagedescription.PageDescriptionView;
import p356ao.C10114f;
import p356ao.C10115g;

/* renamed from: eo.p */
public final class C12762p implements C6201a {

    /* renamed from: d */
    private final NestedScrollView f37816d;

    /* renamed from: e */
    public final Button f37817e;

    /* renamed from: f */
    public final Button f37818f;

    /* renamed from: g */
    public final PackageCardView f37819g;

    /* renamed from: h */
    public final PageDescriptionView f37820h;

    private C12762p(NestedScrollView nestedScrollView, Button button, Button button2, PackageCardView packageCardView, PageDescriptionView pageDescriptionView) {
        this.f37816d = nestedScrollView;
        this.f37817e = button;
        this.f37818f = button2;
        this.f37819g = packageCardView;
        this.f37820h = pageDescriptionView;
    }

    /* renamed from: a */
    public static C12762p m48443a(View view) {
        int i = C10114f.f27929K;
        Button button = (Button) C6202b.m24689a(view, i);
        if (button != null) {
            i = C10114f.cancel_primary_button;
            Button button2 = (Button) C6202b.m24689a(view, i);
            if (button2 != null) {
                i = C10114f.offer_package;
                PackageCardView packageCardView = (PackageCardView) C6202b.m24689a(view, i);
                if (packageCardView != null) {
                    i = C10114f.f27931M0;
                    PageDescriptionView pageDescriptionView = (PageDescriptionView) C6202b.m24689a(view, i);
                    if (pageDescriptionView != null) {
                        return new C12762p((NestedScrollView) view, button, button2, packageCardView, pageDescriptionView);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: d */
    public static C12762p m48444d(LayoutInflater layoutInflater) {
        return m48445e(layoutInflater, (ViewGroup) null, false);
    }

    /* renamed from: e */
    public static C12762p m48445e(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C10115g.fragment_package_cancel, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m48443a(inflate);
    }

    /* renamed from: c */
    public NestedScrollView mo3946b() {
        return this.f37816d;
    }
}
