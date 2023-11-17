package ua1;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ScrollView;
import ba1.C10216u;
import ba1.C10217v;
import p086g1.C6201a;
import p086g1.C6202b;
import p341ge.bog.designsystem.components.buttonlist.ButtonListView;
import p341ge.bog.designsystem.components.buttons.Button;
import p341ge.bog.designsystem.components.pagedescription.PageDescriptionView;

/* renamed from: ua1.a0 */
public final class C28625a0 implements C6201a {

    /* renamed from: d */
    private final ScrollView f72644d;

    /* renamed from: e */
    public final Button f72645e;

    /* renamed from: f */
    public final PageDescriptionView f72646f;

    /* renamed from: g */
    public final ButtonListView f72647g;

    private C28625a0(ScrollView scrollView, Button button, PageDescriptionView pageDescriptionView, ButtonListView buttonListView) {
        this.f72644d = scrollView;
        this.f72645e = button;
        this.f72646f = pageDescriptionView;
        this.f72647g = buttonListView;
    }

    /* renamed from: a */
    public static C28625a0 m87594a(View view) {
        int i = C10216u.change_username_button;
        Button button = (Button) C6202b.m24689a(view, i);
        if (button != null) {
            i = C10216u.f28293C1;
            PageDescriptionView pageDescriptionView = (PageDescriptionView) C6202b.m24689a(view, i);
            if (pageDescriptionView != null) {
                i = C10216u.statement_category_view;
                ButtonListView buttonListView = (ButtonListView) C6202b.m24689a(view, i);
                if (buttonListView != null) {
                    return new C28625a0((ScrollView) view, button, pageDescriptionView, buttonListView);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: d */
    public static C28625a0 m87595d(LayoutInflater layoutInflater) {
        return m87596e(layoutInflater, (ViewGroup) null, false);
    }

    /* renamed from: e */
    public static C28625a0 m87596e(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C10217v.fragment_offer_update_username_sign_in, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m87594a(inflate);
    }

    /* renamed from: c */
    public ScrollView mo3946b() {
        return this.f72644d;
    }
}
