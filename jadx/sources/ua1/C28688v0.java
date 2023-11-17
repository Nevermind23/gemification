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

/* renamed from: ua1.v0 */
public final class C28688v0 implements C6201a {

    /* renamed from: d */
    private final LinearLayout f73015d;

    /* renamed from: e */
    public final Button f73016e;

    /* renamed from: f */
    public final LinearLayout f73017f;

    /* renamed from: g */
    public final PageDescriptionView f73018g;

    /* renamed from: h */
    public final NestedScrollView f73019h;

    private C28688v0(LinearLayout linearLayout, Button button, LinearLayout linearLayout2, PageDescriptionView pageDescriptionView, NestedScrollView nestedScrollView) {
        this.f73015d = linearLayout;
        this.f73016e = button;
        this.f73017f = linearLayout2;
        this.f73018g = pageDescriptionView;
        this.f73019h = nestedScrollView;
    }

    /* renamed from: a */
    public static C28688v0 m87869a(View view) {
        int i = C10216u.activation_button;
        Button button = (Button) C6202b.m24689a(view, i);
        if (button != null) {
            i = C10216u.content_linear_layout;
            LinearLayout linearLayout = (LinearLayout) C6202b.m24689a(view, i);
            if (linearLayout != null) {
                i = C10216u.f28293C1;
                PageDescriptionView pageDescriptionView = (PageDescriptionView) C6202b.m24689a(view, i);
                if (pageDescriptionView != null) {
                    i = C10216u.f28344w2;
                    NestedScrollView nestedScrollView = (NestedScrollView) C6202b.m24689a(view, i);
                    if (nestedScrollView != null) {
                        return new C28688v0((LinearLayout) view, button, linearLayout, pageDescriptionView, nestedScrollView);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: d */
    public static C28688v0 m87870d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C10217v.fragment_setup_trusted_device, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m87869a(inflate);
    }

    /* renamed from: c */
    public LinearLayout mo3946b() {
        return this.f73015d;
    }
}
