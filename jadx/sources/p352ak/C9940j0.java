package p352ak;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatTextView;
import p086g1.C6201a;
import p086g1.C6202b;
import p601sg.C17782g;
import p601sg.C17783h;

/* renamed from: ak.j0 */
public final class C9940j0 implements C6201a {

    /* renamed from: d */
    private final View f27130d;

    /* renamed from: e */
    public final LinearLayout f27131e;

    /* renamed from: f */
    public final AppCompatTextView f27132f;

    /* renamed from: g */
    public final AppCompatTextView f27133g;

    private C9940j0(View view, LinearLayout linearLayout, AppCompatTextView appCompatTextView, AppCompatTextView appCompatTextView2) {
        this.f27130d = view;
        this.f27131e = linearLayout;
        this.f27132f = appCompatTextView;
        this.f27133g = appCompatTextView2;
    }

    /* renamed from: a */
    public static C9940j0 m36458a(View view) {
        int i = C17782g.f49675B5;
        LinearLayout linearLayout = (LinearLayout) C6202b.m24689a(view, i);
        if (linearLayout != null) {
            i = C17782g.f49681D8;
            AppCompatTextView appCompatTextView = (AppCompatTextView) C6202b.m24689a(view, i);
            if (appCompatTextView != null) {
                i = C17782g.titleView;
                AppCompatTextView appCompatTextView2 = (AppCompatTextView) C6202b.m24689a(view, i);
                if (appCompatTextView2 != null) {
                    return new C9940j0(view, linearLayout, appCompatTextView, appCompatTextView2);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: c */
    public static C9940j0 m36459c(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (viewGroup != null) {
            layoutInflater.inflate(C17783h.layout_two_line_reverse_text_item, viewGroup);
            return m36458a(viewGroup);
        }
        throw new NullPointerException("parent");
    }

    /* renamed from: b */
    public View mo3946b() {
        return this.f27130d;
    }
}
