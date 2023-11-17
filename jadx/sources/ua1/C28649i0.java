package ua1;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ScrollView;
import androidx.constraintlayout.widget.Guideline;
import ba1.C10216u;
import ba1.C10217v;
import p086g1.C6201a;
import p086g1.C6202b;
import p341ge.bog.designsystem.components.buttonlist.ButtonListView;
import p341ge.bog.designsystem.components.buttons.Button;
import p341ge.bog.designsystem.components.layersandshadows.LayerView;
import p341ge.bog.designsystem.components.onetimepassword.OneTimePasswordView;

/* renamed from: ua1.i0 */
public final class C28649i0 implements C6201a {

    /* renamed from: d */
    private final ScrollView f72760d;

    /* renamed from: e */
    public final Guideline f72761e;

    /* renamed from: f */
    public final LayerView f72762f;

    /* renamed from: g */
    public final Guideline f72763g;

    /* renamed from: h */
    public final OneTimePasswordView f72764h;

    /* renamed from: i */
    public final Guideline f72765i;

    /* renamed from: j */
    public final ButtonListView f72766j;

    /* renamed from: k */
    public final Button f72767k;

    /* renamed from: l */
    public final Guideline f72768l;

    private C28649i0(ScrollView scrollView, Guideline guideline, LayerView layerView, Guideline guideline2, OneTimePasswordView oneTimePasswordView, Guideline guideline3, ButtonListView buttonListView, Button button, Guideline guideline4) {
        this.f72760d = scrollView;
        this.f72761e = guideline;
        this.f72762f = layerView;
        this.f72763g = guideline2;
        this.f72764h = oneTimePasswordView;
        this.f72765i = guideline3;
        this.f72766j = buttonListView;
        this.f72767k = button;
        this.f72768l = guideline4;
    }

    /* renamed from: a */
    public static C28649i0 m87700a(View view) {
        int i = C10216u.bottom_guideLine;
        Guideline guideline = (Guideline) C6202b.m24689a(view, i);
        if (guideline != null) {
            i = C10216u.f28325g1;
            LayerView layerView = (LayerView) C6202b.m24689a(view, i);
            if (layerView != null) {
                i = C10216u.left_guideline;
                Guideline guideline2 = (Guideline) C6202b.m24689a(view, i);
                if (guideline2 != null) {
                    i = C10216u.f28349z1;
                    OneTimePasswordView oneTimePasswordView = (OneTimePasswordView) C6202b.m24689a(view, i);
                    if (oneTimePasswordView != null) {
                        i = C10216u.right_guideline;
                        Guideline guideline3 = (Guideline) C6202b.m24689a(view, i);
                        if (guideline3 != null) {
                            i = C10216u.statement_category_view;
                            ButtonListView buttonListView = (ButtonListView) C6202b.m24689a(view, i);
                            if (buttonListView != null) {
                                i = C10216u.submit;
                                Button button = (Button) C6202b.m24689a(view, i);
                                if (button != null) {
                                    i = C10216u.f28330h3;
                                    Guideline guideline4 = (Guideline) C6202b.m24689a(view, i);
                                    if (guideline4 != null) {
                                        return new C28649i0((ScrollView) view, guideline, layerView, guideline2, oneTimePasswordView, guideline3, buttonListView, button, guideline4);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: d */
    public static C28649i0 m87701d(LayoutInflater layoutInflater) {
        return m87702e(layoutInflater, (ViewGroup) null, false);
    }

    /* renamed from: e */
    public static C28649i0 m87702e(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C10217v.fragment_otp_sign_in, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m87700a(inflate);
    }

    /* renamed from: c */
    public ScrollView mo3946b() {
        return this.f72760d;
    }
}
