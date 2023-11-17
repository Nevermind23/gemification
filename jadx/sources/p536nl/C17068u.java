package p536nl;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import p086g1.C6201a;
import p086g1.C6202b;
import p341ge.bog.designsystem.components.buttons.Button;
import p480jl.C16213d;
import p480jl.C16214e;

/* renamed from: nl.u */
public final class C17068u implements C6201a {

    /* renamed from: d */
    private final ConstraintLayout f47675d;

    /* renamed from: e */
    public final Button f47676e;

    /* renamed from: f */
    public final TextView f47677f;

    private C17068u(ConstraintLayout constraintLayout, Button button, TextView textView) {
        this.f47675d = constraintLayout;
        this.f47676e = button;
        this.f47677f = textView;
    }

    /* renamed from: a */
    public static C17068u m59978a(View view) {
        int i = C16213d.f45764z0;
        Button button = (Button) C6202b.m24689a(view, i);
        if (button != null) {
            i = C16213d.terms_text;
            TextView textView = (TextView) C6202b.m24689a(view, i);
            if (textView != null) {
                return new C17068u((ConstraintLayout) view, button, textView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: d */
    public static C17068u m59979d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C16214e.item_bnpl_terms, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m59978a(inflate);
    }

    /* renamed from: c */
    public ConstraintLayout mo3946b() {
        return this.f47675d;
    }
}
