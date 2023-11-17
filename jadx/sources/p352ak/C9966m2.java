package p352ak;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import p086g1.C6201a;
import p086g1.C6202b;
import p601sg.C17782g;
import p601sg.C17783h;

/* renamed from: ak.m2 */
public final class C9966m2 implements C6201a {

    /* renamed from: d */
    private final View f27266d;

    /* renamed from: e */
    public final TextView f27267e;

    private C9966m2(View view, TextView textView) {
        this.f27266d = view;
        this.f27267e = textView;
    }

    /* renamed from: a */
    public static C9966m2 m36554a(View view) {
        int i = C17782g.clear_caption;
        TextView textView = (TextView) C6202b.m24689a(view, i);
        if (textView != null) {
            return new C9966m2(view, textView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: c */
    public static C9966m2 m36555c(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (viewGroup != null) {
            layoutInflater.inflate(C17783h.view_clear_inline_feedback, viewGroup);
            return m36554a(viewGroup);
        }
        throw new NullPointerException("parent");
    }

    /* renamed from: b */
    public View mo3946b() {
        return this.f27266d;
    }
}
