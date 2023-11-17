package ua1;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.core.widget.NestedScrollView;
import ba1.C10216u;
import ba1.C10217v;
import p086g1.C6201a;
import p086g1.C6202b;
import p341ge.bog.designsystem.components.buttons.Button;
import p341ge.bog.designsystem.components.pagedescription.PageDescriptionView;

/* renamed from: ua1.z */
public final class C28695z implements C6201a {

    /* renamed from: d */
    private final LinearLayout f73062d;

    /* renamed from: e */
    public final Button f73063e;

    /* renamed from: f */
    public final LinearLayout f73064f;

    /* renamed from: g */
    public final Button f73065g;

    /* renamed from: h */
    public final PageDescriptionView f73066h;

    /* renamed from: i */
    public final NestedScrollView f73067i;

    private C28695z(LinearLayout linearLayout, Button button, LinearLayout linearLayout2, Button button2, PageDescriptionView pageDescriptionView, NestedScrollView nestedScrollView) {
        this.f73062d = linearLayout;
        this.f73063e = button;
        this.f73064f = linearLayout2;
        this.f73065g = button2;
        this.f73066h = pageDescriptionView;
        this.f73067i = nestedScrollView;
    }

    /* renamed from: a */
    public static C28695z m87900a(View view) {
        int i = C10216u.activation_button;
        Button button = (Button) C6202b.m24689a(view, i);
        if (button != null) {
            i = C10216u.content_linear_layout;
            LinearLayout linearLayout = (LinearLayout) C6202b.m24689a(view, i);
            if (linearLayout != null) {
                i = C10216u.dont_ask_button;
                Button button2 = (Button) C6202b.m24689a(view, i);
                if (button2 != null) {
                    i = C10216u.f28293C1;
                    PageDescriptionView pageDescriptionView = (PageDescriptionView) C6202b.m24689a(view, i);
                    if (pageDescriptionView != null) {
                        i = C10216u.f28344w2;
                        NestedScrollView nestedScrollView = (NestedScrollView) C6202b.m24689a(view, i);
                        if (nestedScrollView != null) {
                            return new C28695z((LinearLayout) view, button, linearLayout, button2, pageDescriptionView, nestedScrollView);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: d */
    public static C28695z m87901d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C10217v.fragment_offer_parameters_setup, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m87900a(inflate);
    }

    /* renamed from: c */
    public LinearLayout mo3946b() {
        return this.f73062d;
    }
}
