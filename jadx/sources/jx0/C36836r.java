package jx0;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import fx0.C32024d;
import fx0.C32025e;
import p086g1.C6201a;
import p086g1.C6202b;

/* renamed from: jx0.r */
public final class C36836r implements C6201a {

    /* renamed from: d */
    private final FrameLayout f88898d;

    /* renamed from: e */
    public final TextView f88899e;

    private C36836r(FrameLayout frameLayout, TextView textView) {
        this.f88898d = frameLayout;
        this.f88899e = textView;
    }

    /* renamed from: a */
    public static C36836r m109156a(View view) {
        int i = C32024d.f78859x;
        TextView textView = (TextView) C6202b.m24689a(view, i);
        if (textView != null) {
            return new C36836r((FrameLayout) view, textView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: d */
    public static C36836r m109157d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C32025e.item_form_element_title, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m109156a(inflate);
    }

    /* renamed from: c */
    public FrameLayout mo3946b() {
        return this.f88898d;
    }
}
