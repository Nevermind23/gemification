package p352ak;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import p086g1.C6201a;
import p086g1.C6202b;
import p601sg.C17782g;
import p601sg.C17783h;

/* renamed from: ak.c1 */
public final class C9885c1 implements C6201a {

    /* renamed from: d */
    private final LinearLayout f26835d;

    /* renamed from: e */
    public final AppCompatTextView f26836e;

    /* renamed from: f */
    public final AppCompatTextView f26837f;

    /* renamed from: g */
    public final AppCompatImageView f26838g;

    private C9885c1(LinearLayout linearLayout, AppCompatTextView appCompatTextView, AppCompatTextView appCompatTextView2, AppCompatImageView appCompatImageView) {
        this.f26835d = linearLayout;
        this.f26836e = appCompatTextView;
        this.f26837f = appCompatTextView2;
        this.f26838g = appCompatImageView;
    }

    /* renamed from: a */
    public static C9885c1 m36257a(View view) {
        int i = C17782g.f49703L;
        AppCompatTextView appCompatTextView = (AppCompatTextView) C6202b.m24689a(view, i);
        if (appCompatTextView != null) {
            i = C17782g.f49709N0;
            AppCompatTextView appCompatTextView2 = (AppCompatTextView) C6202b.m24689a(view, i);
            if (appCompatTextView2 != null) {
                i = C17782g.logo;
                AppCompatImageView appCompatImageView = (AppCompatImageView) C6202b.m24689a(view, i);
                if (appCompatImageView != null) {
                    return new C9885c1((LinearLayout) view, appCompatTextView, appCompatTextView2, appCompatImageView);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: d */
    public static C9885c1 m36258d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C17783h.view_button_action_logo, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m36257a(inflate);
    }

    /* renamed from: c */
    public LinearLayout mo3946b() {
        return this.f26835d;
    }
}
