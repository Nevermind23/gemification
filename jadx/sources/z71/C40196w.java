package z71;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import p086g1.C6201a;
import p086g1.C6202b;
import p341ge.bog.designsystem.components.buttons.Button;
import p341ge.bog.designsystem.components.pagedescription.PageDescriptionView;
import y71.C40030d;
import y71.C40031e;

/* renamed from: z71.w */
public final class C40196w implements C6201a {

    /* renamed from: d */
    private final LinearLayout f95580d;

    /* renamed from: e */
    public final PageDescriptionView f95581e;

    /* renamed from: f */
    public final Button f95582f;

    private C40196w(LinearLayout linearLayout, PageDescriptionView pageDescriptionView, Button button) {
        this.f95580d = linearLayout;
        this.f95581e = pageDescriptionView;
        this.f95582f = button;
    }

    /* renamed from: a */
    public static C40196w m116491a(View view) {
        int i = C40030d.f95092C;
        PageDescriptionView pageDescriptionView = (PageDescriptionView) C6202b.m24689a(view, i);
        if (pageDescriptionView != null) {
            i = C40030d.f95108m0;
            Button button = (Button) C6202b.m24689a(view, i);
            if (button != null) {
                return new C40196w((LinearLayout) view, pageDescriptionView, button);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: d */
    public static C40196w m116492d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C40031e.item_travel_insurance_provider_error, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m116491a(inflate);
    }

    /* renamed from: c */
    public LinearLayout mo3946b() {
        return this.f95580d;
    }
}
