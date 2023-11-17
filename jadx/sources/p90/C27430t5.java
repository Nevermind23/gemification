package p90;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import p086g1.C6201a;
import p086g1.C6202b;
import p366bk.C10322k;
import p366bk.C10324m;

/* renamed from: p90.t5 */
public final class C27430t5 implements C6201a {

    /* renamed from: d */
    private final FrameLayout f69848d;

    /* renamed from: e */
    public final RecyclerView f69849e;

    private C27430t5(FrameLayout frameLayout, RecyclerView recyclerView) {
        this.f69848d = frameLayout;
        this.f69849e = recyclerView;
    }

    /* renamed from: a */
    public static C27430t5 m85029a(View view) {
        int i = C10322k.operations_recycler;
        RecyclerView recyclerView = (RecyclerView) C6202b.m24689a(view, i);
        if (recyclerView != null) {
            return new C27430t5((FrameLayout) view, recyclerView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: d */
    public static C27430t5 m85030d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C10324m.item_money_request_details_operations_horizontal_list, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m85029a(inflate);
    }

    /* renamed from: c */
    public FrameLayout mo3946b() {
        return this.f69848d;
    }
}
