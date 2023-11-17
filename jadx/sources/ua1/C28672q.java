package ua1;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.widget.NestedScrollView;
import androidx.recyclerview.widget.RecyclerView;
import ba1.C10216u;
import ba1.C10217v;
import p086g1.C6201a;
import p086g1.C6202b;
import p341ge.bog.designsystem.components.buttons.Button;
import p341ge.bog.designsystem.components.pagedescription.PageDescriptionView;

/* renamed from: ua1.q */
public final class C28672q implements C6201a {

    /* renamed from: d */
    private final ConstraintLayout f72888d;

    /* renamed from: e */
    public final Button f72889e;

    /* renamed from: f */
    public final Button f72890f;

    /* renamed from: g */
    public final RecyclerView f72891g;

    /* renamed from: h */
    public final NestedScrollView f72892h;

    /* renamed from: i */
    public final PageDescriptionView f72893i;

    private C28672q(ConstraintLayout constraintLayout, Button button, Button button2, RecyclerView recyclerView, NestedScrollView nestedScrollView, PageDescriptionView pageDescriptionView) {
        this.f72888d = constraintLayout;
        this.f72889e = button;
        this.f72890f = button2;
        this.f72891g = recyclerView;
        this.f72892h = nestedScrollView;
        this.f72893i = pageDescriptionView;
    }

    /* renamed from: a */
    public static C28672q m87801a(View view) {
        int i = C10216u.f28315a;
        Button button = (Button) C6202b.m24689a(view, i);
        if (button != null) {
            i = C10216u.add_new_contact_btn;
            Button button2 = (Button) C6202b.m24689a(view, i);
            if (button2 != null) {
                i = C10216u.contact_list;
                RecyclerView recyclerView = (RecyclerView) C6202b.m24689a(view, i);
                if (recyclerView != null) {
                    i = C10216u.contact_list_sv;
                    NestedScrollView nestedScrollView = (NestedScrollView) C6202b.m24689a(view, i);
                    if (nestedScrollView != null) {
                        i = C10216u.new_contact_title;
                        PageDescriptionView pageDescriptionView = (PageDescriptionView) C6202b.m24689a(view, i);
                        if (pageDescriptionView != null) {
                            return new C28672q((ConstraintLayout) view, button, button2, recyclerView, nestedScrollView, pageDescriptionView);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: d */
    public static C28672q m87802d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C10217v.fragment_confirm_phone_contact_list, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m87801a(inflate);
    }

    /* renamed from: c */
    public ConstraintLayout mo3946b() {
        return this.f72888d;
    }
}
