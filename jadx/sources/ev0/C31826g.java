package ev0;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import bv0.C31204d;
import bv0.C31205e;
import p086g1.C6201a;
import p086g1.C6202b;
import p341ge.bog.designsystem.components.buttons.Button;
import p341ge.bog.designsystem.components.pagedescription.PageDescriptionView;

/* renamed from: ev0.g */
public final class C31826g implements C6201a {

    /* renamed from: d */
    private final LinearLayout f78500d;

    /* renamed from: e */
    public final Button f78501e;

    /* renamed from: f */
    public final PageDescriptionView f78502f;

    private C31826g(LinearLayout linearLayout, Button button, PageDescriptionView pageDescriptionView) {
        this.f78500d = linearLayout;
        this.f78501e = button;
        this.f78502f = pageDescriptionView;
    }

    /* renamed from: a */
    public static C31826g m94093a(View view) {
        int i = C31204d.f77511E;
        Button button = (Button) C6202b.m24689a(view, i);
        if (button != null) {
            i = C31204d.f77515P;
            PageDescriptionView pageDescriptionView = (PageDescriptionView) C6202b.m24689a(view, i);
            if (pageDescriptionView != null) {
                return new C31826g((LinearLayout) view, button, pageDescriptionView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: d */
    public static C31826g m94094d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C31205e.dialog_fragment_consider, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m94093a(inflate);
    }

    /* renamed from: c */
    public LinearLayout mo3946b() {
        return this.f78500d;
    }
}
