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

/* renamed from: ua1.o */
public final class C28666o implements C6201a {

    /* renamed from: d */
    private final ConstraintLayout f72867d;

    /* renamed from: e */
    public final Button f72868e;

    /* renamed from: f */
    public final OneTimePasswordView f72869f;

    private C28666o(ConstraintLayout constraintLayout, Button button, OneTimePasswordView oneTimePasswordView) {
        this.f72867d = constraintLayout;
        this.f72868e = button;
        this.f72869f = oneTimePasswordView;
    }

    /* renamed from: a */
    public static C28666o m87776a(View view) {
        int i = C10216u.f28315a;
        Button button = (Button) C6202b.m24689a(view, i);
        if (button != null) {
            i = C10216u.f28349z1;
            OneTimePasswordView oneTimePasswordView = (OneTimePasswordView) C6202b.m24689a(view, i);
            if (oneTimePasswordView != null) {
                return new C28666o((ConstraintLayout) view, button, oneTimePasswordView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: d */
    public static C28666o m87777d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C10217v.fragment_confirm_favorite_phone_action_sheet, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m87776a(inflate);
    }

    /* renamed from: c */
    public ConstraintLayout mo3946b() {
        return this.f72867d;
    }
}
