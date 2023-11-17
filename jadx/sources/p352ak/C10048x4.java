package p352ak;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import p086g1.C6201a;
import p086g1.C6202b;
import p601sg.C17782g;
import p601sg.C17783h;

/* renamed from: ak.x4 */
public final class C10048x4 implements C6201a {

    /* renamed from: d */
    private final View f27752d;

    /* renamed from: e */
    public final View f27753e;

    private C10048x4(View view, View view2) {
        this.f27752d = view;
        this.f27753e = view2;
    }

    /* renamed from: a */
    public static C10048x4 m36855a(View view) {
        int i = C17782g.progress_badge;
        View a = C6202b.m24689a(view, i);
        if (a != null) {
            return new C10048x4(view, a);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: c */
    public static C10048x4 m36856c(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (viewGroup != null) {
            layoutInflater.inflate(C17783h.view_progress_badge, viewGroup);
            return m36855a(viewGroup);
        }
        throw new NullPointerException("parent");
    }

    /* renamed from: b */
    public View mo3946b() {
        return this.f27752d;
    }
}
