package p413eo;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import p086g1.C6201a;
import p086g1.C6202b;
import p341ge.bog.mobilebank.p975ui.components.BogProgressBar;
import p356ao.C10114f;
import p356ao.C10115g;

/* renamed from: eo.j */
public final class C12750j implements C6201a {

    /* renamed from: d */
    private final ConstraintLayout f37757d;

    /* renamed from: e */
    public final BogProgressBar f37758e;

    private C12750j(ConstraintLayout constraintLayout, BogProgressBar bogProgressBar) {
        this.f37757d = constraintLayout;
        this.f37758e = bogProgressBar;
    }

    /* renamed from: a */
    public static C12750j m48394a(View view) {
        int i = C10114f.f27943X0;
        BogProgressBar bogProgressBar = (BogProgressBar) C6202b.m24689a(view, i);
        if (bogProgressBar != null) {
            return new C12750j((ConstraintLayout) view, bogProgressBar);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: d */
    public static C12750j m48395d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C10115g.fragment_application_navigator, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m48394a(inflate);
    }

    /* renamed from: c */
    public ConstraintLayout mo3946b() {
        return this.f37757d;
    }
}
