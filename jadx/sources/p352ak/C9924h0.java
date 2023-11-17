package p352ak;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatTextView;
import p086g1.C6201a;
import p086g1.C6202b;
import p601sg.C17782g;
import p601sg.C17783h;

/* renamed from: ak.h0 */
public final class C9924h0 implements C6201a {

    /* renamed from: d */
    private final View f27049d;

    /* renamed from: e */
    public final AppCompatTextView f27050e;

    private C9924h0(View view, AppCompatTextView appCompatTextView) {
        this.f27049d = view;
        this.f27050e = appCompatTextView;
    }

    /* renamed from: a */
    public static C9924h0 m36402a(View view) {
        int i = C17782g.f49681D8;
        AppCompatTextView appCompatTextView = (AppCompatTextView) C6202b.m24689a(view, i);
        if (appCompatTextView != null) {
            return new C9924h0(view, appCompatTextView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: c */
    public static C9924h0 m36403c(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (viewGroup != null) {
            layoutInflater.inflate(C17783h.layout_single_line_text_item, viewGroup);
            return m36402a(viewGroup);
        }
        throw new NullPointerException("parent");
    }

    /* renamed from: b */
    public View mo3946b() {
        return this.f27049d;
    }
}
