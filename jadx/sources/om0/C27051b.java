package om0;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import km0.C25745c;
import km0.C25746d;
import p086g1.C6201a;
import p086g1.C6202b;
import p341ge.bog.designsystem.components.buttons.Button;
import p341ge.bog.designsystem.components.input.Input;
import p341ge.bog.designsystem.components.pagedescription.PageDescriptionView;

/* renamed from: om0.b */
public final class C27051b implements C6201a {

    /* renamed from: d */
    private final LinearLayout f67929d;

    /* renamed from: e */
    public final LinearLayout f67930e;

    /* renamed from: f */
    public final PageDescriptionView f67931f;

    /* renamed from: g */
    public final Button f67932g;

    /* renamed from: h */
    public final Input f67933h;

    private C27051b(LinearLayout linearLayout, LinearLayout linearLayout2, PageDescriptionView pageDescriptionView, Button button, Input input) {
        this.f67929d = linearLayout;
        this.f67930e = linearLayout2;
        this.f67931f = pageDescriptionView;
        this.f67932g = button;
        this.f67933h = input;
    }

    /* renamed from: a */
    public static C27051b m83875a(View view) {
        int i = C25745c.f65523h;
        LinearLayout linearLayout = (LinearLayout) C6202b.m24689a(view, i);
        if (linearLayout != null) {
            i = C25745c.child_verificiation_description;
            PageDescriptionView pageDescriptionView = (PageDescriptionView) C6202b.m24689a(view, i);
            if (pageDescriptionView != null) {
                i = C25745c.f65517B;
                Button button = (Button) C6202b.m24689a(view, i);
                if (button != null) {
                    i = C25745c.otp_input;
                    Input input = (Input) C6202b.m24689a(view, i);
                    if (input != null) {
                        return new C27051b((LinearLayout) view, linearLayout, pageDescriptionView, button, input);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: d */
    public static C27051b m83876d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C25746d.actionsheet_verify_child_number, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m83875a(inflate);
    }

    /* renamed from: c */
    public LinearLayout mo3946b() {
        return this.f67929d;
    }
}
