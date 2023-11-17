package ua1;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.FragmentContainerView;
import ba1.C10216u;
import ba1.C10217v;
import p086g1.C6201a;
import p086g1.C6202b;
import p341ge.bog.designsystem.components.buttons.Button;

/* renamed from: ua1.w0 */
public final class C28690w0 implements C6201a {

    /* renamed from: d */
    private final ConstraintLayout f73025d;

    /* renamed from: e */
    public final AppCompatImageView f73026e;

    /* renamed from: f */
    public final Button f73027f;

    /* renamed from: g */
    public final FragmentContainerView f73028g;

    /* renamed from: h */
    public final Button f73029h;

    /* renamed from: i */
    public final AppCompatTextView f73030i;

    /* renamed from: j */
    public final AppCompatTextView f73031j;

    private C28690w0(ConstraintLayout constraintLayout, AppCompatImageView appCompatImageView, Button button, FragmentContainerView fragmentContainerView, Button button2, AppCompatTextView appCompatTextView, AppCompatTextView appCompatTextView2) {
        this.f73025d = constraintLayout;
        this.f73026e = appCompatImageView;
        this.f73027f = button;
        this.f73028g = fragmentContainerView;
        this.f73029h = button2;
        this.f73030i = appCompatTextView;
        this.f73031j = appCompatTextView2;
    }

    /* renamed from: a */
    public static C28690w0 m87877a(View view) {
        int i = C10216u.f28288A;
        AppCompatImageView appCompatImageView = (AppCompatImageView) C6202b.m24689a(view, i);
        if (appCompatImageView != null) {
            i = C10216u.change_language_button;
            Button button = (Button) C6202b.m24689a(view, i);
            if (button != null) {
                i = C10216u.f28301Q0;
                FragmentContainerView fragmentContainerView = (FragmentContainerView) C6202b.m24689a(view, i);
                if (fragmentContainerView != null) {
                    i = C10216u.f28336o2;
                    Button button2 = (Button) C6202b.m24689a(view, i);
                    if (button2 != null) {
                        i = C10216u.title_primary;
                        AppCompatTextView appCompatTextView = (AppCompatTextView) C6202b.m24689a(view, i);
                        if (appCompatTextView != null) {
                            i = C10216u.title_secondary;
                            AppCompatTextView appCompatTextView2 = (AppCompatTextView) C6202b.m24689a(view, i);
                            if (appCompatTextView2 != null) {
                                return new C28690w0((ConstraintLayout) view, appCompatImageView, button, fragmentContainerView, button2, appCompatTextView, appCompatTextView2);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: d */
    public static C28690w0 m87878d(LayoutInflater layoutInflater) {
        return m87879e(layoutInflater, (ViewGroup) null, false);
    }

    /* renamed from: e */
    public static C28690w0 m87879e(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C10217v.fragment_sign_in, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m87877a(inflate);
    }

    /* renamed from: c */
    public ConstraintLayout mo3946b() {
        return this.f73025d;
    }
}
