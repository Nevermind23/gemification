package ua1;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import ba1.C10216u;
import ba1.C10217v;
import p086g1.C6201a;
import p086g1.C6202b;
import p341ge.bog.designsystem.components.buttons.Button;
import p341ge.bog.designsystem.components.onetimepassword.OneTimePasswordView;

/* renamed from: ua1.h0 */
public final class C28646h0 implements C6201a {

    /* renamed from: d */
    private final LinearLayout f72749d;

    /* renamed from: e */
    public final OneTimePasswordView f72750e;

    /* renamed from: f */
    public final Button f72751f;

    private C28646h0(LinearLayout linearLayout, OneTimePasswordView oneTimePasswordView, Button button) {
        this.f72749d = linearLayout;
        this.f72750e = oneTimePasswordView;
        this.f72751f = button;
    }

    /* renamed from: a */
    public static C28646h0 m87688a(View view) {
        int i = C10216u.f28349z1;
        OneTimePasswordView oneTimePasswordView = (OneTimePasswordView) C6202b.m24689a(view, i);
        if (oneTimePasswordView != null) {
            i = C10216u.sing_in_button;
            Button button = (Button) C6202b.m24689a(view, i);
            if (button != null) {
                return new C28646h0((LinearLayout) view, oneTimePasswordView, button);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: d */
    public static C28646h0 m87689d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C10217v.fragment_one_time_password, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m87688a(inflate);
    }

    /* renamed from: c */
    public LinearLayout mo3946b() {
        return this.f72749d;
    }
}
