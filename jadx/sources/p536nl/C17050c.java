package p536nl;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import p086g1.C6201a;
import p086g1.C6202b;
import p480jl.C16213d;
import p480jl.C16214e;

/* renamed from: nl.c */
public final class C17050c implements C6201a {

    /* renamed from: d */
    private final ConstraintLayout f47560d;

    /* renamed from: e */
    public final View f47561e;

    /* renamed from: f */
    public final TextView f47562f;

    /* renamed from: g */
    public final ConstraintLayout f47563g;

    /* renamed from: h */
    public final ConstraintLayout f47564h;

    /* renamed from: i */
    public final TextView f47565i;

    private C17050c(ConstraintLayout constraintLayout, View view, TextView textView, ConstraintLayout constraintLayout2, ConstraintLayout constraintLayout3, TextView textView2) {
        this.f47560d = constraintLayout;
        this.f47561e = view;
        this.f47562f = textView;
        this.f47563g = constraintLayout2;
        this.f47564h = constraintLayout3;
        this.f47565i = textView2;
    }

    /* renamed from: a */
    public static C17050c m59900a(View view) {
        int i = C16213d.f45759v;
        View a = C6202b.m24689a(view, i);
        if (a != null) {
            i = C16213d.hisotry_tv;
            TextView textView = (TextView) C6202b.m24689a(view, i);
            if (textView != null) {
                i = C16213d.history_item;
                ConstraintLayout constraintLayout = (ConstraintLayout) C6202b.m24689a(view, i);
                if (constraintLayout != null) {
                    i = C16213d.schedule_item;
                    ConstraintLayout constraintLayout2 = (ConstraintLayout) C6202b.m24689a(view, i);
                    if (constraintLayout2 != null) {
                        i = C16213d.schedule_tv;
                        TextView textView2 = (TextView) C6202b.m24689a(view, i);
                        if (textView2 != null) {
                            return new C17050c((ConstraintLayout) view, a, textView, constraintLayout, constraintLayout2, textView2);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: d */
    public static C17050c m59901d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C16214e.action_sheet_bnpl_schedule_history_pdf, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m59900a(inflate);
    }

    /* renamed from: c */
    public ConstraintLayout mo3946b() {
        return this.f47560d;
    }
}
