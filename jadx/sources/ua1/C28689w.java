package ua1;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import ba1.C10216u;
import ba1.C10217v;
import p086g1.C6201a;
import p086g1.C6202b;
import p341ge.bog.designsystem.components.buttons.Button;
import p341ge.bog.designsystem.components.pagedescription.PageDescriptionView;

/* renamed from: ua1.w */
public final class C28689w implements C6201a {

    /* renamed from: d */
    private final ConstraintLayout f73020d;

    /* renamed from: e */
    public final Button f73021e;

    /* renamed from: f */
    public final Button f73022f;

    /* renamed from: g */
    public final PageDescriptionView f73023g;

    /* renamed from: h */
    public final AppCompatImageView f73024h;

    private C28689w(ConstraintLayout constraintLayout, Button button, Button button2, PageDescriptionView pageDescriptionView, AppCompatImageView appCompatImageView) {
        this.f73020d = constraintLayout;
        this.f73021e = button;
        this.f73022f = button2;
        this.f73023g = pageDescriptionView;
        this.f73024h = appCompatImageView;
    }

    /* renamed from: a */
    public static C28689w m87873a(View view) {
        int i = C10216u.button_select_id;
        Button button = (Button) C6202b.m24689a(view, i);
        if (button != null) {
            i = C10216u.button_select_passport;
            Button button2 = (Button) C6202b.m24689a(view, i);
            if (button2 != null) {
                i = C10216u.identomat_description;
                PageDescriptionView pageDescriptionView = (PageDescriptionView) C6202b.m24689a(view, i);
                if (pageDescriptionView != null) {
                    i = C10216u.identomat_img;
                    AppCompatImageView appCompatImageView = (AppCompatImageView) C6202b.m24689a(view, i);
                    if (appCompatImageView != null) {
                        return new C28689w((ConstraintLayout) view, button, button2, pageDescriptionView, appCompatImageView);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: d */
    public static C28689w m87874d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C10217v.fragment_identomat_document_selection, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m87873a(inflate);
    }

    /* renamed from: c */
    public ConstraintLayout mo3946b() {
        return this.f73020d;
    }
}
