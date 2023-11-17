package o51;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import n51.C37356b;
import n51.C37357c;
import p086g1.C6201a;
import p086g1.C6202b;

/* renamed from: o51.j */
public final class C37653j implements C6201a {

    /* renamed from: d */
    private final FrameLayout f90500d;

    /* renamed from: e */
    public final TextView f90501e;

    private C37653j(FrameLayout frameLayout, TextView textView) {
        this.f90500d = frameLayout;
        this.f90501e = textView;
    }

    /* renamed from: a */
    public static C37653j m110703a(View view) {
        int i = C37356b.f89810A0;
        TextView textView = (TextView) C6202b.m24689a(view, i);
        if (textView != null) {
            return new C37653j((FrameLayout) view, textView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: d */
    public static C37653j m110704d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C37357c.item_statements_header, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m110703a(inflate);
    }

    /* renamed from: c */
    public FrameLayout mo3946b() {
        return this.f90500d;
    }
}
