package p413eo;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import p086g1.C6201a;
import p086g1.C6202b;
import p341ge.bog.designsystem.components.buttons.Button;
import p341ge.bog.designsystem.components.pagedescription.PageDescriptionView;
import p356ao.C10114f;
import p356ao.C10115g;

/* renamed from: eo.a1 */
public final class C12728a1 implements C6201a {

    /* renamed from: d */
    private final LinearLayout f37663d;

    /* renamed from: e */
    public final PageDescriptionView f37664e;

    /* renamed from: f */
    public final Button f37665f;

    private C12728a1(LinearLayout linearLayout, PageDescriptionView pageDescriptionView, Button button) {
        this.f37663d = linearLayout;
        this.f37664e = pageDescriptionView;
        this.f37665f = button;
    }

    /* renamed from: a */
    public static C12728a1 m48305a(View view) {
        int i = C10114f.f27931M0;
        PageDescriptionView pageDescriptionView = (PageDescriptionView) C6202b.m24689a(view, i);
        if (pageDescriptionView != null) {
            i = C10114f.f27955g1;
            Button button = (Button) C6202b.m24689a(view, i);
            if (button != null) {
                return new C12728a1((LinearLayout) view, pageDescriptionView, button);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: d */
    public static C12728a1 m48306d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C10115g.list_item_error, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m48305a(inflate);
    }

    /* renamed from: c */
    public LinearLayout mo3946b() {
        return this.f37663d;
    }
}
