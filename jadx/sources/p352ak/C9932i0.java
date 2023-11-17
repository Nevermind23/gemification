package p352ak;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatTextView;
import p086g1.C6201a;
import p086g1.C6202b;
import p601sg.C17782g;
import p601sg.C17783h;

/* renamed from: ak.i0 */
public final class C9932i0 implements C6201a {

    /* renamed from: d */
    private final View f27087d;

    /* renamed from: e */
    public final AppCompatTextView f27088e;

    /* renamed from: f */
    public final AppCompatTextView f27089f;

    /* renamed from: g */
    public final AppCompatTextView f27090g;

    private C9932i0(View view, AppCompatTextView appCompatTextView, AppCompatTextView appCompatTextView2, AppCompatTextView appCompatTextView3) {
        this.f27087d = view;
        this.f27088e = appCompatTextView;
        this.f27089f = appCompatTextView2;
        this.f27090g = appCompatTextView3;
    }

    /* renamed from: a */
    public static C9932i0 m36431a(View view) {
        int i = C17782g.subtitleView;
        AppCompatTextView appCompatTextView = (AppCompatTextView) C6202b.m24689a(view, i);
        if (appCompatTextView != null) {
            i = C17782g.f49681D8;
            AppCompatTextView appCompatTextView2 = (AppCompatTextView) C6202b.m24689a(view, i);
            if (appCompatTextView2 != null) {
                i = C17782g.titleView;
                AppCompatTextView appCompatTextView3 = (AppCompatTextView) C6202b.m24689a(view, i);
                if (appCompatTextView3 != null) {
                    return new C9932i0(view, appCompatTextView, appCompatTextView2, appCompatTextView3);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: c */
    public static C9932i0 m36432c(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (viewGroup != null) {
            layoutInflater.inflate(C17783h.layout_three_line_text_item, viewGroup);
            return m36431a(viewGroup);
        }
        throw new NullPointerException("parent");
    }

    /* renamed from: b */
    public View mo3946b() {
        return this.f27087d;
    }
}
