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

/* renamed from: ua1.p */
public final class C28669p implements C6201a {

    /* renamed from: d */
    private final ConstraintLayout f72876d;

    /* renamed from: e */
    public final Button f72877e;

    /* renamed from: f */
    public final Button f72878f;

    /* renamed from: g */
    public final OneTimePasswordView f72879g;

    private C28669p(ConstraintLayout constraintLayout, Button button, Button button2, OneTimePasswordView oneTimePasswordView) {
        this.f72876d = constraintLayout;
        this.f72877e = button;
        this.f72878f = button2;
        this.f72879g = oneTimePasswordView;
    }

    /* renamed from: a */
    public static C28669p m87788a(View view) {
        int i = C10216u.f28315a;
        Button button = (Button) C6202b.m24689a(view, i);
        if (button != null) {
            i = C10216u.button_change_number;
            Button button2 = (Button) C6202b.m24689a(view, i);
            if (button2 != null) {
                i = C10216u.f28349z1;
                OneTimePasswordView oneTimePasswordView = (OneTimePasswordView) C6202b.m24689a(view, i);
                if (oneTimePasswordView != null) {
                    return new C28669p((ConstraintLayout) view, button, button2, oneTimePasswordView);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: d */
    public static C28669p m87789d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C10217v.fragment_confirm_phone, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m87788a(inflate);
    }

    /* renamed from: c */
    public ConstraintLayout mo3946b() {
        return this.f72876d;
    }
}
