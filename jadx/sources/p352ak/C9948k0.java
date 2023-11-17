package p352ak;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatTextView;
import p086g1.C6201a;
import p086g1.C6202b;
import p601sg.C17782g;
import p601sg.C17783h;

/* renamed from: ak.k0 */
public final class C9948k0 implements C6201a {

    /* renamed from: d */
    private final View f27184d;

    /* renamed from: e */
    public final AppCompatTextView f27185e;

    /* renamed from: f */
    public final AppCompatTextView f27186f;

    private C9948k0(View view, AppCompatTextView appCompatTextView, AppCompatTextView appCompatTextView2) {
        this.f27184d = view;
        this.f27185e = appCompatTextView;
        this.f27186f = appCompatTextView2;
    }

    /* renamed from: a */
    public static C9948k0 m36486a(View view) {
        int i = C17782g.f49681D8;
        AppCompatTextView appCompatTextView = (AppCompatTextView) C6202b.m24689a(view, i);
        if (appCompatTextView != null) {
            i = C17782g.titleView;
            AppCompatTextView appCompatTextView2 = (AppCompatTextView) C6202b.m24689a(view, i);
            if (appCompatTextView2 != null) {
                return new C9948k0(view, appCompatTextView, appCompatTextView2);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: c */
    public static C9948k0 m36487c(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (viewGroup != null) {
            layoutInflater.inflate(C17783h.layout_two_line_text_item, viewGroup);
            return m36486a(viewGroup);
        }
        throw new NullPointerException("parent");
    }

    /* renamed from: b */
    public View mo3946b() {
        return this.f27184d;
    }
}
