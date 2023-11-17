package ua1;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ScrollView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.Guideline;
import ba1.C10216u;
import ba1.C10217v;
import p086g1.C6201a;
import p086g1.C6202b;
import p341ge.bog.designsystem.components.buttonlist.ButtonListView;
import p341ge.bog.designsystem.components.buttons.Button;
import p341ge.bog.designsystem.components.pagedescription.PageDescriptionView;

/* renamed from: ua1.l */
public final class C28657l implements C6201a {

    /* renamed from: d */
    private final ScrollView f72798d;

    /* renamed from: e */
    public final PageDescriptionView f72799e;

    /* renamed from: f */
    public final Guideline f72800f;

    /* renamed from: g */
    public final Button f72801g;

    /* renamed from: h */
    public final PageDescriptionView f72802h;

    /* renamed from: i */
    public final Guideline f72803i;

    /* renamed from: j */
    public final AppCompatImageView f72804j;

    /* renamed from: k */
    public final Guideline f72805k;

    /* renamed from: l */
    public final ButtonListView f72806l;

    /* renamed from: m */
    public final Button f72807m;

    private C28657l(ScrollView scrollView, PageDescriptionView pageDescriptionView, Guideline guideline, Button button, PageDescriptionView pageDescriptionView2, Guideline guideline2, AppCompatImageView appCompatImageView, Guideline guideline3, ButtonListView buttonListView, Button button2) {
        this.f72798d = scrollView;
        this.f72799e = pageDescriptionView;
        this.f72800f = guideline;
        this.f72801g = button;
        this.f72802h = pageDescriptionView2;
        this.f72803i = guideline2;
        this.f72804j = appCompatImageView;
        this.f72805k = guideline3;
        this.f72806l = buttonListView;
        this.f72807m = button2;
    }

    /* renamed from: a */
    public static C28657l m87736a(View view) {
        int i = C10216u.biometric_only_description;
        PageDescriptionView pageDescriptionView = (PageDescriptionView) C6202b.m24689a(view, i);
        if (pageDescriptionView != null) {
            i = C10216u.bottom_guideLine;
            Guideline guideline = (Guideline) C6202b.m24689a(view, i);
            if (guideline != null) {
                i = C10216u.enter_passcode;
                Button button = (Button) C6202b.m24689a(view, i);
                if (button != null) {
                    i = C10216u.enter_passcode_title;
                    PageDescriptionView pageDescriptionView2 = (PageDescriptionView) C6202b.m24689a(view, i);
                    if (pageDescriptionView2 != null) {
                        i = C10216u.left_guideline;
                        Guideline guideline2 = (Guideline) C6202b.m24689a(view, i);
                        if (guideline2 != null) {
                            i = C10216u.page_description_icon;
                            AppCompatImageView appCompatImageView = (AppCompatImageView) C6202b.m24689a(view, i);
                            if (appCompatImageView != null) {
                                i = C10216u.right_guideline;
                                Guideline guideline3 = (Guideline) C6202b.m24689a(view, i);
                                if (guideline3 != null) {
                                    i = C10216u.statement_category_view;
                                    ButtonListView buttonListView = (ButtonListView) C6202b.m24689a(view, i);
                                    if (buttonListView != null) {
                                        i = C10216u.try_again;
                                        Button button2 = (Button) C6202b.m24689a(view, i);
                                        if (button2 != null) {
                                            return new C28657l((ScrollView) view, pageDescriptionView, guideline, button, pageDescriptionView2, guideline2, appCompatImageView, guideline3, buttonListView, button2);
                                        }
                                    }
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
    public static C28657l m87737d(LayoutInflater layoutInflater) {
        return m87738e(layoutInflater, (ViewGroup) null, false);
    }

    /* renamed from: e */
    public static C28657l m87738e(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C10217v.fragment_biometric_only_sign_in, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m87736a(inflate);
    }

    /* renamed from: c */
    public ScrollView mo3946b() {
        return this.f72798d;
    }
}
