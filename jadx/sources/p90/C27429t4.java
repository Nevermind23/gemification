package p90;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import p086g1.C6201a;
import p086g1.C6202b;
import p341ge.bog.designsystem.components.buttons.Button;
import p341ge.bog.designsystem.components.pagestate.PageState;
import p366bk.C10322k;
import p366bk.C10324m;

/* renamed from: p90.t4 */
public final class C27429t4 implements C6201a {

    /* renamed from: d */
    private final ConstraintLayout f69844d;

    /* renamed from: e */
    public final View f69845e;

    /* renamed from: f */
    public final Button f69846f;

    /* renamed from: g */
    public final PageState f69847g;

    private C27429t4(ConstraintLayout constraintLayout, View view, Button button, PageState pageState) {
        this.f69844d = constraintLayout;
        this.f69845e = view;
        this.f69846f = button;
        this.f69847g = pageState;
    }

    /* renamed from: a */
    public static C27429t4 m85025a(View view) {
        int i = C10322k.f28850jc;
        View a = C6202b.m24689a(view, i);
        if (a != null) {
            i = C10322k.merchant_redirect_button;
            Button button = (Button) C6202b.m24689a(view, i);
            if (button != null) {
                i = C10322k.f28877oo;
                PageState pageState = (PageState) C6202b.m24689a(view, i);
                if (pageState != null) {
                    return new C27429t4((ConstraintLayout) view, a, button, pageState);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: d */
    public static C27429t4 m85026d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C10324m.installment_details_action_sheet, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m85025a(inflate);
    }

    /* renamed from: c */
    public ConstraintLayout mo3946b() {
        return this.f69844d;
    }
}
