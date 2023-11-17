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

/* renamed from: ua1.y */
public final class C28693y implements C6201a {

    /* renamed from: d */
    private final ScrollView f73051d;

    /* renamed from: e */
    public final Button f73052e;

    /* renamed from: f */
    public final Button f73053f;

    /* renamed from: g */
    public final PageDescriptionView f73054g;

    /* renamed from: h */
    public final ButtonListView f73055h;

    private C28693y(ScrollView scrollView, Button button, Button button2, PageDescriptionView pageDescriptionView, ButtonListView buttonListView) {
        this.f73051d = scrollView;
        this.f73052e = button;
        this.f73053f = button2;
        this.f73054g = pageDescriptionView;
        this.f73055h = buttonListView;
    }

    /* renamed from: a */
    public static C28693y m87890a(View view) {
        int i = C10216u.change_later_button;
        Button button = (Button) C6202b.m24689a(view, i);
        if (button != null) {
            i = C10216u.change_password_button;
            Button button2 = (Button) C6202b.m24689a(view, i);
            if (button2 != null) {
                i = C10216u.f28293C1;
                PageDescriptionView pageDescriptionView = (PageDescriptionView) C6202b.m24689a(view, i);
                if (pageDescriptionView != null) {
                    i = C10216u.statement_category_view;
                    ButtonListView buttonListView = (ButtonListView) C6202b.m24689a(view, i);
                    if (buttonListView != null) {
                        return new C28693y((ScrollView) view, button, button2, pageDescriptionView, buttonListView);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: d */
    public static C28693y m87891d(LayoutInflater layoutInflater) {
        return m87892e(layoutInflater, (ViewGroup) null, false);
    }

    /* renamed from: e */
    public static C28693y m87892e(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C10217v.fragment_offer_change_password_sign_in, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m87890a(inflate);
    }

    /* renamed from: c */
    public ScrollView mo3946b() {
        return this.f73051d;
    }
}
