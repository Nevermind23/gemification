package p352ak;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import p086g1.C6201a;
import p086g1.C6202b;
import p601sg.C17782g;
import p601sg.C17783h;

/* renamed from: ak.g4 */
public final class C9920g4 implements C6201a {

    /* renamed from: d */
    private final View f27030d;

    /* renamed from: e */
    public final TextView f27031e;

    private C9920g4(View view, TextView textView) {
        this.f27030d = view;
        this.f27031e = textView;
    }

    /* renamed from: a */
    public static C9920g4 m36388a(View view) {
        int i = C17782g.normal_caption;
        TextView textView = (TextView) C6202b.m24689a(view, i);
        if (textView != null) {
            return new C9920g4(view, textView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: c */
    public static C9920g4 m36389c(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (viewGroup != null) {
            layoutInflater.inflate(C17783h.view_normal_text_inline_feedback_binding, viewGroup);
            return m36388a(viewGroup);
        }
        throw new NullPointerException("parent");
    }

    /* renamed from: b */
    public View mo3946b() {
        return this.f27030d;
    }
}
