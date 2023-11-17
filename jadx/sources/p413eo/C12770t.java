package p413eo;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import p086g1.C6201a;
import p086g1.C6202b;
import p341ge.bog.designsystem.components.buttons.Button;
import p341ge.bog.designsystem.components.pagestate.PageState;
import p356ao.C10114f;
import p356ao.C10115g;

/* renamed from: eo.t */
public final class C12770t implements C6201a {

    /* renamed from: d */
    private final LinearLayout f37862d;

    /* renamed from: e */
    public final Button f37863e;

    /* renamed from: f */
    public final PageState f37864f;

    private C12770t(LinearLayout linearLayout, Button button, PageState pageState) {
        this.f37862d = linearLayout;
        this.f37863e = button;
        this.f37864f = pageState;
    }

    /* renamed from: a */
    public static C12770t m48479a(View view) {
        int i = C10114f.f27922B;
        Button button = (Button) C6202b.m24689a(view, i);
        if (button != null) {
            i = C10114f.f27933O0;
            PageState pageState = (PageState) C6202b.m24689a(view, i);
            if (pageState != null) {
                return new C12770t((LinearLayout) view, button, pageState);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: d */
    public static C12770t m48480d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C10115g.fragment_set_concierge, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m48479a(inflate);
    }

    /* renamed from: c */
    public LinearLayout mo3946b() {
        return this.f37862d;
    }
}
