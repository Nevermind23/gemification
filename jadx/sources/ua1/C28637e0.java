package ua1;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import ba1.C10216u;
import ba1.C10217v;
import p086g1.C6201a;
import p086g1.C6202b;
import p341ge.bog.designsystem.components.buttons.Button;
import p341ge.bog.designsystem.components.input.Input;
import p341ge.bog.designsystem.components.pagedescription.PageDescriptionView;

/* renamed from: ua1.e0 */
public final class C28637e0 implements C6201a {

    /* renamed from: d */
    private final ConstraintLayout f72713d;

    /* renamed from: e */
    public final Button f72714e;

    /* renamed from: f */
    public final Input f72715f;

    /* renamed from: g */
    public final LinearLayout f72716g;

    /* renamed from: h */
    public final Input f72717h;

    /* renamed from: i */
    public final PageDescriptionView f72718i;

    private C28637e0(ConstraintLayout constraintLayout, Button button, Input input, LinearLayout linearLayout, Input input2, PageDescriptionView pageDescriptionView) {
        this.f72713d = constraintLayout;
        this.f72714e = button;
        this.f72715f = input;
        this.f72716g = linearLayout;
        this.f72717h = input2;
        this.f72718i = pageDescriptionView;
    }

    /* renamed from: a */
    public static C28637e0 m87647a(View view) {
        int i = C10216u.f28315a;
        Button button = (Button) C6202b.m24689a(view, i);
        if (button != null) {
            i = C10216u.f28346y0;
            Input input = (Input) C6202b.m24689a(view, i);
            if (input != null) {
                i = C10216u.f28320c1;
                LinearLayout linearLayout = (LinearLayout) C6202b.m24689a(view, i);
                if (linearLayout != null) {
                    i = C10216u.f28299P1;
                    Input input2 = (Input) C6202b.m24689a(view, i);
                    if (input2 != null) {
                        i = C10216u.pin_page_description;
                        PageDescriptionView pageDescriptionView = (PageDescriptionView) C6202b.m24689a(view, i);
                        if (pageDescriptionView != null) {
                            return new C28637e0((ConstraintLayout) view, button, input, linearLayout, input2, pageDescriptionView);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: d */
    public static C28637e0 m87648d(LayoutInflater layoutInflater) {
        return m87649e(layoutInflater, (ViewGroup) null, false);
    }

    /* renamed from: e */
    public static C28637e0 m87649e(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C10217v.fragment_onboarding_phone, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m87647a(inflate);
    }

    /* renamed from: c */
    public ConstraintLayout mo3946b() {
        return this.f72713d;
    }
}
