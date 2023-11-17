package p376cg;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import p086g1.C6201a;
import p086g1.C6202b;
import p341ge.bog.designsystem.components.fixedbutton.FixedButtonView;
import p653wf.C18588q;
import p653wf.C18589r;

/* renamed from: cg.a */
public final class C10422a implements C6201a {

    /* renamed from: d */
    private final ConstraintLayout f29631d;

    /* renamed from: e */
    public final View f29632e;

    /* renamed from: f */
    public final FixedButtonView f29633f;

    /* renamed from: g */
    public final RecyclerView f29634g;

    private C10422a(ConstraintLayout constraintLayout, View view, FixedButtonView fixedButtonView, RecyclerView recyclerView) {
        this.f29631d = constraintLayout;
        this.f29632e = view;
        this.f29633f = fixedButtonView;
        this.f29634g = recyclerView;
    }

    /* renamed from: a */
    public static C10422a m37853a(View view) {
        int i = C18588q.f52165p;
        View a = C6202b.m24689a(view, i);
        if (a != null) {
            i = C18588q.f52152I;
            FixedButtonView fixedButtonView = (FixedButtonView) C6202b.m24689a(view, i);
            if (fixedButtonView != null) {
                i = C18588q.f52168u0;
                RecyclerView recyclerView = (RecyclerView) C6202b.m24689a(view, i);
                if (recyclerView != null) {
                    return new C10422a((ConstraintLayout) view, a, fixedButtonView, recyclerView);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: d */
    public static C10422a m37854d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C18589r.actionsheet_accounts_selector_component, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m37853a(inflate);
    }

    /* renamed from: c */
    public ConstraintLayout mo3946b() {
        return this.f29631d;
    }
}
