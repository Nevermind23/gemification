package ua1;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import ba1.C10216u;
import ba1.C10217v;
import p086g1.C6201a;
import p086g1.C6202b;
import p341ge.bog.designsystem.components.buttons.Button;
import p341ge.bog.designsystem.components.input.Input;
import p341ge.bog.designsystem.components.pagedescription.PageDescriptionView;

/* renamed from: ua1.f0 */
public final class C28640f0 implements C6201a {

    /* renamed from: d */
    private final ConstraintLayout f72725d;

    /* renamed from: e */
    public final Button f72726e;

    /* renamed from: f */
    public final Input f72727f;

    /* renamed from: g */
    public final PageDescriptionView f72728g;

    private C28640f0(ConstraintLayout constraintLayout, Button button, Input input, PageDescriptionView pageDescriptionView) {
        this.f72725d = constraintLayout;
        this.f72726e = button;
        this.f72727f = input;
        this.f72728g = pageDescriptionView;
    }

    /* renamed from: a */
    public static C28640f0 m87661a(View view) {
        int i = C10216u.f28315a;
        Button button = (Button) C6202b.m24689a(view, i);
        if (button != null) {
            i = C10216u.pin_input;
            Input input = (Input) C6202b.m24689a(view, i);
            if (input != null) {
                i = C10216u.pin_page_description;
                PageDescriptionView pageDescriptionView = (PageDescriptionView) C6202b.m24689a(view, i);
                if (pageDescriptionView != null) {
                    return new C28640f0((ConstraintLayout) view, button, input, pageDescriptionView);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: d */
    public static C28640f0 m87662d(LayoutInflater layoutInflater) {
        return m87663e(layoutInflater, (ViewGroup) null, false);
    }

    /* renamed from: e */
    public static C28640f0 m87663e(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C10217v.fragment_onboarding_pin, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m87661a(inflate);
    }

    /* renamed from: c */
    public ConstraintLayout mo3946b() {
        return this.f72725d;
    }
}
