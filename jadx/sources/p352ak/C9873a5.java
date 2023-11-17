package p352ak;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import p086g1.C6201a;
import p086g1.C6202b;
import p341ge.bog.designsystem.components.buttons.Button;
import p601sg.C17782g;
import p601sg.C17783h;

/* renamed from: ak.a5 */
public final class C9873a5 implements C6201a {

    /* renamed from: d */
    private final View f26772d;

    /* renamed from: e */
    public final AppCompatImageView f26773e;

    /* renamed from: f */
    public final AppCompatTextView f26774f;

    /* renamed from: g */
    public final AppCompatTextView f26775g;

    /* renamed from: h */
    public final Button f26776h;

    private C9873a5(View view, AppCompatImageView appCompatImageView, AppCompatTextView appCompatTextView, AppCompatTextView appCompatTextView2, Button button) {
        this.f26772d = view;
        this.f26773e = appCompatImageView;
        this.f26774f = appCompatTextView;
        this.f26775g = appCompatTextView2;
        this.f26776h = button;
    }

    /* renamed from: a */
    public static C9873a5 m36213a(View view) {
        int i = C17782g.saved_user_icon;
        AppCompatImageView appCompatImageView = (AppCompatImageView) C6202b.m24689a(view, i);
        if (appCompatImageView != null) {
            i = C17782g.saved_user_name;
            AppCompatTextView appCompatTextView = (AppCompatTextView) C6202b.m24689a(view, i);
            if (appCompatTextView != null) {
                i = C17782g.saved_user_title;
                AppCompatTextView appCompatTextView2 = (AppCompatTextView) C6202b.m24689a(view, i);
                if (appCompatTextView2 != null) {
                    i = C17782g.user_change_btn;
                    Button button = (Button) C6202b.m24689a(view, i);
                    if (button != null) {
                        return new C9873a5(view, appCompatImageView, appCompatTextView, appCompatTextView2, button);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: c */
    public static C9873a5 m36214c(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (viewGroup != null) {
            layoutInflater.inflate(C17783h.view_saved_user_card, viewGroup);
            return m36213a(viewGroup);
        }
        throw new NullPointerException("parent");
    }

    /* renamed from: b */
    public View mo3946b() {
        return this.f26772d;
    }
}
