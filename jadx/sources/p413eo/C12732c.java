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

/* renamed from: eo.c */
public final class C12732c implements C6201a {

    /* renamed from: d */
    private final LinearLayout f37683d;

    /* renamed from: e */
    public final Button f37684e;

    /* renamed from: f */
    public final PageDescriptionView f37685f;

    /* renamed from: g */
    public final Button f37686g;

    private C12732c(LinearLayout linearLayout, Button button, PageDescriptionView pageDescriptionView, Button button2) {
        this.f37683d = linearLayout;
        this.f37684e = button;
        this.f37685f = pageDescriptionView;
        this.f37686g = button2;
    }

    /* renamed from: a */
    public static C12732c m48321a(View view) {
        int i = C10114f.f27929K;
        Button button = (Button) C6202b.m24689a(view, i);
        if (button != null) {
            i = C10114f.f27938S;
            PageDescriptionView pageDescriptionView = (PageDescriptionView) C6202b.m24689a(view, i);
            if (pageDescriptionView != null) {
                i = C10114f.f27947a0;
                Button button2 = (Button) C6202b.m24689a(view, i);
                if (button2 != null) {
                    return new C12732c((LinearLayout) view, button, pageDescriptionView, button2);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: d */
    public static C12732c m48322d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C10115g.action_sheet_edit_package_confirmation, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m48321a(inflate);
    }

    /* renamed from: c */
    public LinearLayout mo3946b() {
        return this.f37683d;
    }
}
