package jx0;

import android.view.View;
import android.widget.LinearLayout;
import fx0.C32024d;
import p086g1.C6201a;
import p086g1.C6202b;
import p341ge.bog.designsystem.components.buttons.Button;
import p341ge.bog.designsystem.components.pagedescription.PageDescriptionView;

/* renamed from: jx0.f */
public final class C36819f implements C6201a {

    /* renamed from: d */
    private final LinearLayout f88850d;

    /* renamed from: e */
    public final LinearLayout f88851e;

    /* renamed from: f */
    public final PageDescriptionView f88852f;

    /* renamed from: g */
    public final Button f88853g;

    private C36819f(LinearLayout linearLayout, LinearLayout linearLayout2, PageDescriptionView pageDescriptionView, Button button) {
        this.f88850d = linearLayout;
        this.f88851e = linearLayout2;
        this.f88852f = pageDescriptionView;
        this.f88853g = button;
    }

    /* renamed from: a */
    public static C36819f m109091a(View view) {
        LinearLayout linearLayout = (LinearLayout) view;
        int i = C32024d.f78839R;
        PageDescriptionView pageDescriptionView = (PageDescriptionView) C6202b.m24689a(view, i);
        if (pageDescriptionView != null) {
            i = C32024d.f78842c0;
            Button button = (Button) C6202b.m24689a(view, i);
            if (button != null) {
                return new C36819f(linearLayout, linearLayout, pageDescriptionView, button);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: c */
    public LinearLayout mo3946b() {
        return this.f88850d;
    }
}
