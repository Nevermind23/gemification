package ua1;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import ba1.C10216u;
import ba1.C10217v;
import p086g1.C6201a;
import p086g1.C6202b;
import p341ge.bog.designsystem.components.buttons.Button;
import p341ge.bog.designsystem.components.pagedescription.PageDescriptionView;

/* renamed from: ua1.q0 */
public final class C28673q0 implements C6201a {

    /* renamed from: d */
    private final LinearLayout f72894d;

    /* renamed from: e */
    public final Button f72895e;

    /* renamed from: f */
    public final PageDescriptionView f72896f;

    private C28673q0(LinearLayout linearLayout, Button button, PageDescriptionView pageDescriptionView) {
        this.f72894d = linearLayout;
        this.f72895e = button;
        this.f72896f = pageDescriptionView;
    }

    /* renamed from: a */
    public static C28673q0 m87805a(View view) {
        int i = C10216u.f28295F;
        Button button = (Button) C6202b.m24689a(view, i);
        if (button != null) {
            i = C10216u.texts;
            PageDescriptionView pageDescriptionView = (PageDescriptionView) C6202b.m24689a(view, i);
            if (pageDescriptionView != null) {
                return new C28673q0((LinearLayout) view, button, pageDescriptionView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: d */
    public static C28673q0 m87806d(LayoutInflater layoutInflater) {
        return m87807e(layoutInflater, (ViewGroup) null, false);
    }

    /* renamed from: e */
    public static C28673q0 m87807e(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C10217v.fragment_select_intro, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m87805a(inflate);
    }

    /* renamed from: c */
    public LinearLayout mo3946b() {
        return this.f72894d;
    }
}
