package ua1;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import ba1.C10216u;
import ba1.C10217v;
import p086g1.C6201a;
import p086g1.C6202b;
import p341ge.bog.designsystem.components.buttons.Button;
import p341ge.bog.designsystem.components.onetimepassword.OneTimePasswordView;

/* renamed from: ua1.n1 */
public final class C28665n1 implements C6201a {

    /* renamed from: d */
    private final ConstraintLayout f72864d;

    /* renamed from: e */
    public final Button f72865e;

    /* renamed from: f */
    public final OneTimePasswordView f72866f;

    private C28665n1(ConstraintLayout constraintLayout, Button button, OneTimePasswordView oneTimePasswordView) {
        this.f72864d = constraintLayout;
        this.f72865e = button;
        this.f72866f = oneTimePasswordView;
    }

    /* renamed from: a */
    public static C28665n1 m87772a(View view) {
        int i = C10216u.f28315a;
        Button button = (Button) C6202b.m24689a(view, i);
        if (button != null) {
            i = C10216u.f28349z1;
            OneTimePasswordView oneTimePasswordView = (OneTimePasswordView) C6202b.m24689a(view, i);
            if (oneTimePasswordView != null) {
                return new C28665n1((ConstraintLayout) view, button, oneTimePasswordView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: d */
    public static C28665n1 m87773d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C10217v.layout_confirm_number_second, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m87772a(inflate);
    }

    /* renamed from: c */
    public ConstraintLayout mo3946b() {
        return this.f72864d;
    }
}
