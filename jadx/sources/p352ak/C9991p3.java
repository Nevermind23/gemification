package p352ak;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import p086g1.C6201a;
import p086g1.C6202b;
import p601sg.C17782g;
import p601sg.C17783h;

/* renamed from: ak.p3 */
public final class C9991p3 implements C6201a {

    /* renamed from: d */
    private final View f27397d;

    /* renamed from: e */
    public final AppCompatTextView f27398e;

    /* renamed from: f */
    public final AppCompatTextView f27399f;

    /* renamed from: g */
    public final AppCompatImageView f27400g;

    private C9991p3(View view, AppCompatTextView appCompatTextView, AppCompatTextView appCompatTextView2, AppCompatImageView appCompatImageView) {
        this.f27397d = view;
        this.f27398e = appCompatTextView;
        this.f27399f = appCompatTextView2;
        this.f27400g = appCompatImageView;
    }

    /* renamed from: a */
    public static C9991p3 m36644a(View view) {
        int i = C17782g.feedback_caption;
        AppCompatTextView appCompatTextView = (AppCompatTextView) C6202b.m24689a(view, i);
        if (appCompatTextView != null) {
            i = C17782g.feedback_title;
            AppCompatTextView appCompatTextView2 = (AppCompatTextView) C6202b.m24689a(view, i);
            if (appCompatTextView2 != null) {
                i = C17782g.inline_feedback_image;
                AppCompatImageView appCompatImageView = (AppCompatImageView) C6202b.m24689a(view, i);
                if (appCompatImageView != null) {
                    return new C9991p3(view, appCompatTextView, appCompatTextView2, appCompatImageView);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: c */
    public static C9991p3 m36645c(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (viewGroup != null) {
            layoutInflater.inflate(C17783h.view_inline_feedback, viewGroup);
            return m36644a(viewGroup);
        }
        throw new NullPointerException("parent");
    }

    /* renamed from: b */
    public View mo3946b() {
        return this.f27397d;
    }
}
