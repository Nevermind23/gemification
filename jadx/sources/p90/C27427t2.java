package p90;

import android.view.View;
import android.widget.LinearLayout;
import p086g1.C6201a;
import p086g1.C6202b;
import p366bk.C10322k;

/* renamed from: p90.t2 */
public final class C27427t2 implements C6201a {

    /* renamed from: d */
    private final LinearLayout f69829d;

    /* renamed from: e */
    public final C27262b8 f69830e;

    private C27427t2(LinearLayout linearLayout, C27262b8 b8Var) {
        this.f69829d = linearLayout;
        this.f69830e = b8Var;
    }

    /* renamed from: a */
    public static C27427t2 m85017a(View view) {
        int i = C10322k.f28845if;
        View a = C6202b.m24689a(view, i);
        if (a != null) {
            return new C27427t2((LinearLayout) view, C27262b8.m84346a(a));
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: c */
    public LinearLayout mo3946b() {
        return this.f69829d;
    }
}
