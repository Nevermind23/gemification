package sp0;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import np0.C37439e;
import np0.C37440f;
import p086g1.C6201a;
import p086g1.C6202b;
import p341ge.bog.designsystem.components.buttons.Button;

/* renamed from: sp0.b */
public final class C38482b implements C6201a {

    /* renamed from: d */
    private final LinearLayout f92168d;

    /* renamed from: e */
    public final Button f92169e;

    /* renamed from: f */
    public final Button f92170f;

    /* renamed from: g */
    public final LinearLayout f92171g;

    private C38482b(LinearLayout linearLayout, Button button, Button button2, LinearLayout linearLayout2) {
        this.f92168d = linearLayout;
        this.f92169e = button;
        this.f92170f = button2;
        this.f92171g = linearLayout2;
    }

    /* renamed from: a */
    public static C38482b m112940a(View view) {
        int i = C37439e.f90006k;
        Button button = (Button) C6202b.m24689a(view, i);
        if (button != null) {
            i = C37439e.button_terms;
            Button button2 = (Button) C6202b.m24689a(view, i);
            if (button2 != null) {
                i = C37439e.provider_container;
                LinearLayout linearLayout = (LinearLayout) C6202b.m24689a(view, i);
                if (linearLayout != null) {
                    return new C38482b((LinearLayout) view, button, button2, linearLayout);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: d */
    public static C38482b m112941d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C37440f.action_sheet_insurance_provider, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m112940a(inflate);
    }

    /* renamed from: c */
    public LinearLayout mo3946b() {
        return this.f92168d;
    }
}
