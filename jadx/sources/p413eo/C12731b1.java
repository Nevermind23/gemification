package p413eo;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import p086g1.C6201a;
import p086g1.C6202b;
import p341ge.bog.designsystem.components.buttons.Button;
import p341ge.bog.designsystem.components.packagecard.PackageCardView;
import p341ge.bog.designsystem.components.pagedescription.PageDescriptionView;
import p356ao.C10114f;
import p356ao.C10115g;

/* renamed from: eo.b1 */
public final class C12731b1 implements C6201a {

    /* renamed from: d */
    private final LinearLayout f37678d;

    /* renamed from: e */
    public final PageDescriptionView f37679e;

    /* renamed from: f */
    public final Button f37680f;

    /* renamed from: g */
    public final PackageCardView f37681g;

    /* renamed from: h */
    public final Button f37682h;

    private C12731b1(LinearLayout linearLayout, PageDescriptionView pageDescriptionView, Button button, PackageCardView packageCardView, Button button2) {
        this.f37678d = linearLayout;
        this.f37679e = pageDescriptionView;
        this.f37680f = button;
        this.f37681g = packageCardView;
        this.f37682h = button2;
    }

    /* renamed from: a */
    public static C12731b1 m48317a(View view) {
        int i = C10114f.f27938S;
        PageDescriptionView pageDescriptionView = (PageDescriptionView) C6202b.m24689a(view, i);
        if (pageDescriptionView != null) {
            i = C10114f.f27941W0;
            Button button = (Button) C6202b.m24689a(view, i);
            if (button != null) {
                i = C10114f.recommended_card;
                PackageCardView packageCardView = (PackageCardView) C6202b.m24689a(view, i);
                if (packageCardView != null) {
                    i = C10114f.f27961k1;
                    Button button2 = (Button) C6202b.m24689a(view, i);
                    if (button2 != null) {
                        return new C12731b1((LinearLayout) view, pageDescriptionView, button, packageCardView, button2);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: d */
    public static C12731b1 m48318d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C10115g.list_item_no_active_packages, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m48317a(inflate);
    }

    /* renamed from: c */
    public LinearLayout mo3946b() {
        return this.f37678d;
    }
}
