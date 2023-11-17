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

/* renamed from: ak.a */
public final class C9867a implements C6201a {

    /* renamed from: d */
    private final LinearLayout f26731d;

    /* renamed from: e */
    public final AppCompatImageView f26732e;

    /* renamed from: f */
    public final AppCompatTextView f26733f;

    private C9867a(LinearLayout linearLayout, AppCompatImageView appCompatImageView, AppCompatTextView appCompatTextView) {
        this.f26731d = linearLayout;
        this.f26732e = appCompatImageView;
        this.f26733f = appCompatTextView;
    }

    /* renamed from: a */
    public static C9867a m36192a(View view) {
        int i = C17782g.f49689H0;
        AppCompatImageView appCompatImageView = (AppCompatImageView) C6202b.m24689a(view, i);
        if (appCompatImageView != null) {
            i = C17782g.f49709N0;
            AppCompatTextView appCompatTextView = (AppCompatTextView) C6202b.m24689a(view, i);
            if (appCompatTextView != null) {
                return new C9867a((LinearLayout) view, appCompatImageView, appCompatTextView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: d */
    public static C9867a m36193d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C17783h.action_round_thumbnail, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m36192a(inflate);
    }

    /* renamed from: c */
    public LinearLayout mo3946b() {
        return this.f26731d;
    }
}
