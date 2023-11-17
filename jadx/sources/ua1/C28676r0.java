package ua1;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.widget.NestedScrollView;
import ba1.C10216u;
import ba1.C10217v;
import p086g1.C6201a;
import p086g1.C6202b;
import p341ge.bog.designsystem.components.buttons.Button;
import p341ge.bog.designsystem.components.input.Input;
import p341ge.bog.designsystem.components.pagedescription.PageDescriptionView;
import p341ge.bog.designsystem.components.strength.StrengthView;

/* renamed from: ua1.r0 */
public final class C28676r0 implements C6201a {

    /* renamed from: d */
    private final NestedScrollView f72904d;

    /* renamed from: e */
    public final Button f72905e;

    /* renamed from: f */
    public final PageDescriptionView f72906f;

    /* renamed from: g */
    public final NestedScrollView f72907g;

    /* renamed from: h */
    public final Input f72908h;

    /* renamed from: i */
    public final Input f72909i;

    /* renamed from: j */
    public final StrengthView f72910j;

    /* renamed from: k */
    public final Input f72911k;

    /* renamed from: l */
    public final StrengthView f72912l;

    private C28676r0(NestedScrollView nestedScrollView, Button button, PageDescriptionView pageDescriptionView, NestedScrollView nestedScrollView2, Input input, Input input2, StrengthView strengthView, Input input3, StrengthView strengthView2) {
        this.f72904d = nestedScrollView;
        this.f72905e = button;
        this.f72906f = pageDescriptionView;
        this.f72907g = nestedScrollView2;
        this.f72908h = input;
        this.f72909i = input2;
        this.f72910j = strengthView;
        this.f72911k = input3;
        this.f72912l = strengthView2;
    }

    /* renamed from: a */
    public static C28676r0 m87818a(View view) {
        int i = C10216u.f28315a;
        Button button = (Button) C6202b.m24689a(view, i);
        if (button != null) {
            i = C10216u.header_page_desc;
            PageDescriptionView pageDescriptionView = (PageDescriptionView) C6202b.m24689a(view, i);
            if (pageDescriptionView != null) {
                NestedScrollView nestedScrollView = (NestedScrollView) view;
                i = C10216u.password_again_input;
                Input input = (Input) C6202b.m24689a(view, i);
                if (input != null) {
                    i = C10216u.password_input;
                    Input input2 = (Input) C6202b.m24689a(view, i);
                    if (input2 != null) {
                        i = C10216u.password_strength;
                        StrengthView strengthView = (StrengthView) C6202b.m24689a(view, i);
                        if (strengthView != null) {
                            i = C10216u.user_name_input;
                            Input input3 = (Input) C6202b.m24689a(view, i);
                            if (input3 != null) {
                                i = C10216u.user_name_strength;
                                StrengthView strengthView2 = (StrengthView) C6202b.m24689a(view, i);
                                if (strengthView2 != null) {
                                    return new C28676r0(nestedScrollView, button, pageDescriptionView, nestedScrollView, input, input2, strengthView, input3, strengthView2);
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: d */
    public static C28676r0 m87819d(LayoutInflater layoutInflater) {
        return m87820e(layoutInflater, (ViewGroup) null, false);
    }

    /* renamed from: e */
    public static C28676r0 m87820e(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C10217v.fragment_set_username_password, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m87818a(inflate);
    }

    /* renamed from: c */
    public NestedScrollView mo3946b() {
        return this.f72904d;
    }
}
