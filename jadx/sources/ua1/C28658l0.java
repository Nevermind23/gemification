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

/* renamed from: ua1.l0 */
public final class C28658l0 implements C6201a {

    /* renamed from: d */
    private final ConstraintLayout f72808d;

    /* renamed from: e */
    public final Button f72809e;

    /* renamed from: f */
    public final Button f72810f;

    /* renamed from: g */
    public final RecyclerView f72811g;

    /* renamed from: h */
    public final PageDescriptionView f72812h;

    /* renamed from: i */
    public final PageDescriptionView f72813i;

    private C28658l0(ConstraintLayout constraintLayout, Button button, Button button2, RecyclerView recyclerView, PageDescriptionView pageDescriptionView, PageDescriptionView pageDescriptionView2) {
        this.f72808d = constraintLayout;
        this.f72809e = button;
        this.f72810f = button2;
        this.f72811g = recyclerView;
        this.f72812h = pageDescriptionView;
        this.f72813i = pageDescriptionView2;
    }

    /* renamed from: a */
    public static C28658l0 m87741a(View view) {
        int i = C10216u.f28315a;
        Button button = (Button) C6202b.m24689a(view, i);
        if (button != null) {
            i = C10216u.add_new_contact_btn;
            Button button2 = (Button) C6202b.m24689a(view, i);
            if (button2 != null) {
                i = C10216u.f28333k0;
                RecyclerView recyclerView = (RecyclerView) C6202b.m24689a(view, i);
                if (recyclerView != null) {
                    i = C10216u.new_contact_title;
                    PageDescriptionView pageDescriptionView = (PageDescriptionView) C6202b.m24689a(view, i);
                    if (pageDescriptionView != null) {
                        i = C10216u.f28290B1;
                        PageDescriptionView pageDescriptionView2 = (PageDescriptionView) C6202b.m24689a(view, i);
                        if (pageDescriptionView2 != null) {
                            return new C28658l0((ConstraintLayout) view, button, button2, recyclerView, pageDescriptionView, pageDescriptionView2);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: d */
    public static C28658l0 m87742d(LayoutInflater layoutInflater) {
        return m87743e(layoutInflater, (ViewGroup) null, false);
    }

    /* renamed from: e */
    public static C28658l0 m87743e(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C10217v.fragment_pass_recovery_contacts, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m87741a(inflate);
    }

    /* renamed from: c */
    public ConstraintLayout mo3946b() {
        return this.f72808d;
    }
}
