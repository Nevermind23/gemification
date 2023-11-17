package ua1;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import ba1.C10216u;
import ba1.C10217v;
import p086g1.C6201a;
import p086g1.C6202b;
import p341ge.bog.designsystem.components.buttons.Button;
import p341ge.bog.designsystem.components.pagedescription.PageDescriptionView;

/* renamed from: ua1.c0 */
public final class C28631c0 implements C6201a {

    /* renamed from: d */
    private final ConstraintLayout f72688d;

    /* renamed from: e */
    public final Button f72689e;

    /* renamed from: f */
    public final PageDescriptionView f72690f;

    /* renamed from: g */
    public final RecyclerView f72691g;

    private C28631c0(ConstraintLayout constraintLayout, Button button, PageDescriptionView pageDescriptionView, RecyclerView recyclerView) {
        this.f72688d = constraintLayout;
        this.f72689e = button;
        this.f72690f = pageDescriptionView;
        this.f72691g = recyclerView;
    }

    /* renamed from: a */
    public static C28631c0 m87620a(View view) {
        int i = C10216u.f28315a;
        Button button = (Button) C6202b.m24689a(view, i);
        if (button != null) {
            i = C10216u.aml_page_description;
            PageDescriptionView pageDescriptionView = (PageDescriptionView) C6202b.m24689a(view, i);
            if (pageDescriptionView != null) {
                i = C10216u.f28331i2;
                RecyclerView recyclerView = (RecyclerView) C6202b.m24689a(view, i);
                if (recyclerView != null) {
                    return new C28631c0((ConstraintLayout) view, button, pageDescriptionView, recyclerView);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: d */
    public static C28631c0 m87621d(LayoutInflater layoutInflater) {
        return m87622e(layoutInflater, (ViewGroup) null, false);
    }

    /* renamed from: e */
    public static C28631c0 m87622e(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C10217v.fragment_onboarding_aml, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m87620a(inflate);
    }

    /* renamed from: c */
    public ConstraintLayout mo3946b() {
        return this.f72688d;
    }
}
