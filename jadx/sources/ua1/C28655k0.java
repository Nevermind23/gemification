package ua1;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ScrollView;
import ba1.C10216u;
import ba1.C10217v;
import p086g1.C6201a;
import p086g1.C6202b;
import p341ge.bog.designsystem.components.buttons.Button;
import p341ge.bog.designsystem.components.cardinput.CardInput;
import p341ge.bog.designsystem.components.checkbox.CheckboxView;
import p341ge.bog.designsystem.components.pagedescription.PageDescriptionView;

/* renamed from: ua1.k0 */
public final class C28655k0 implements C6201a {

    /* renamed from: d */
    private final ScrollView f72790d;

    /* renamed from: e */
    public final Button f72791e;

    /* renamed from: f */
    public final CardInput f72792f;

    /* renamed from: g */
    public final PageDescriptionView f72793g;

    /* renamed from: h */
    public final CheckboxView f72794h;

    /* renamed from: i */
    public final Button f72795i;

    private C28655k0(ScrollView scrollView, Button button, CardInput cardInput, PageDescriptionView pageDescriptionView, CheckboxView checkboxView, Button button2) {
        this.f72790d = scrollView;
        this.f72791e = button;
        this.f72792f = cardInput;
        this.f72793g = pageDescriptionView;
        this.f72794h = checkboxView;
        this.f72795i = button2;
    }

    /* renamed from: a */
    public static C28655k0 m87727a(View view) {
        int i = C10216u.button_no_card;
        Button button = (Button) C6202b.m24689a(view, i);
        if (button != null) {
            i = C10216u.card_input;
            CardInput cardInput = (CardInput) C6202b.m24689a(view, i);
            if (cardInput != null) {
                i = C10216u.card_page_description;
                PageDescriptionView pageDescriptionView = (PageDescriptionView) C6202b.m24689a(view, i);
                if (pageDescriptionView != null) {
                    i = C10216u.f28305T;
                    CheckboxView checkboxView = (CheckboxView) C6202b.m24689a(view, i);
                    if (checkboxView != null) {
                        i = C10216u.f28342v1;
                        Button button2 = (Button) C6202b.m24689a(view, i);
                        if (button2 != null) {
                            return new C28655k0((ScrollView) view, button, cardInput, pageDescriptionView, checkboxView, button2);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: d */
    public static C28655k0 m87728d(LayoutInflater layoutInflater) {
        return m87729e(layoutInflater, (ViewGroup) null, false);
    }

    /* renamed from: e */
    public static C28655k0 m87729e(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C10217v.fragment_pass_recovery_card, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m87727a(inflate);
    }

    /* renamed from: c */
    public ScrollView mo3946b() {
        return this.f72790d;
    }
}
