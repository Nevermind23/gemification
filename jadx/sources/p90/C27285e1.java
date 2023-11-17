package p90;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import p086g1.C6201a;
import p086g1.C6202b;
import p366bk.C10322k;
import p366bk.C10324m;

/* renamed from: p90.e1 */
public final class C27285e1 implements C6201a {

    /* renamed from: d */
    private final LinearLayout f68581d;

    /* renamed from: e */
    public final C27272c8 f68582e;

    /* renamed from: f */
    public final RecyclerView f68583f;

    private C27285e1(LinearLayout linearLayout, C27272c8 c8Var, RecyclerView recyclerView) {
        this.f68581d = linearLayout;
        this.f68582e = c8Var;
        this.f68583f = recyclerView;
    }

    /* renamed from: a */
    public static C27285e1 m84440a(View view) {
        int i = C10322k.f28730Ex;
        View a = C6202b.m24689a(view, i);
        if (a != null) {
            C27272c8 a2 = C27272c8.m84388a(a);
            int i2 = C10322k.transfer_types_recycler;
            RecyclerView recyclerView = (RecyclerView) C6202b.m24689a(view, i2);
            if (recyclerView != null) {
                return new C27285e1((LinearLayout) view, a2, recyclerView);
            }
            i = i2;
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: d */
    public static C27285e1 m84441d(LayoutInflater layoutInflater) {
        return m84442e(layoutInflater, (ViewGroup) null, false);
    }

    /* renamed from: e */
    public static C27285e1 m84442e(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C10324m.activity_other_transfer_type_list, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m84440a(inflate);
    }

    /* renamed from: c */
    public LinearLayout mo3946b() {
        return this.f68581d;
    }
}
