package om0;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.widget.NestedScrollView;
import km0.C25745c;
import km0.C25746d;
import p086g1.C6201a;
import p086g1.C6202b;
import p341ge.bog.designsystem.components.checkbox.CheckboxView;
import p341ge.bog.designsystem.components.fixedbutton.FixedButtonView;
import p341ge.bog.designsystem.components.input.Input;
import p341ge.bog.designsystem.components.pagedescription.PageDescriptionView;

/* renamed from: om0.d */
public final class C27053d implements C6201a {

    /* renamed from: d */
    private final NestedScrollView f67937d;

    /* renamed from: e */
    public final PageDescriptionView f67938e;

    /* renamed from: f */
    public final FixedButtonView f67939f;

    /* renamed from: g */
    public final Input f67940g;

    /* renamed from: h */
    public final Input f67941h;

    /* renamed from: i */
    public final CheckboxView f67942i;

    /* renamed from: j */
    public final PageDescriptionView f67943j;

    private C27053d(NestedScrollView nestedScrollView, PageDescriptionView pageDescriptionView, FixedButtonView fixedButtonView, Input input, Input input2, CheckboxView checkboxView, PageDescriptionView pageDescriptionView2) {
        this.f67937d = nestedScrollView;
        this.f67938e = pageDescriptionView;
        this.f67939f = fixedButtonView;
        this.f67940g = input;
        this.f67941h = input2;
        this.f67942i = checkboxView;
        this.f67943j = pageDescriptionView2;
    }

    /* renamed from: a */
    public static C27053d m83884a(View view) {
        int i = C25745c.activation_description;
        PageDescriptionView pageDescriptionView = (PageDescriptionView) C6202b.m24689a(view, i);
        if (pageDescriptionView != null) {
            i = C25745c.approve_button;
            FixedButtonView fixedButtonView = (FixedButtonView) C6202b.m24689a(view, i);
            if (fixedButtonView != null) {
                i = C25745c.f65533z;
                Input input = (Input) C6202b.m24689a(view, i);
                if (input != null) {
                    i = C25745c.f65519E;
                    Input input2 = (Input) C6202b.m24689a(view, i);
                    if (input2 != null) {
                        i = C25745c.f65521I;
                        CheckboxView checkboxView = (CheckboxView) C6202b.m24689a(view, i);
                        if (checkboxView != null) {
                            i = C25745c.terms_description;
                            PageDescriptionView pageDescriptionView2 = (PageDescriptionView) C6202b.m24689a(view, i);
                            if (pageDescriptionView2 != null) {
                                return new C27053d((NestedScrollView) view, pageDescriptionView, fixedButtonView, input, input2, checkboxView, pageDescriptionView2);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: d */
    public static C27053d m83885d(LayoutInflater layoutInflater) {
        return m83886e(layoutInflater, (ViewGroup) null, false);
    }

    /* renamed from: e */
    public static C27053d m83886e(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C25746d.fragment_financial_contact_approval, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m83884a(inflate);
    }

    /* renamed from: c */
    public NestedScrollView mo3946b() {
        return this.f67937d;
    }
}
