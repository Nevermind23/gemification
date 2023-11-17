package p352ak;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import p086g1.C6201a;
import p601sg.C17783h;

/* renamed from: ak.y4 */
public final class C10055y4 implements C6201a {

    /* renamed from: d */
    private final RecyclerView f27779d;

    /* renamed from: e */
    public final RecyclerView f27780e;

    private C10055y4(RecyclerView recyclerView, RecyclerView recyclerView2) {
        this.f27779d = recyclerView;
        this.f27780e = recyclerView2;
    }

    /* renamed from: a */
    public static C10055y4 m36881a(View view) {
        if (view != null) {
            RecyclerView recyclerView = (RecyclerView) view;
            return new C10055y4(recyclerView, recyclerView);
        }
        throw new NullPointerException("rootView");
    }

    /* renamed from: d */
    public static C10055y4 m36882d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C17783h.view_rate_star, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m36881a(inflate);
    }

    /* renamed from: c */
    public RecyclerView mo3946b() {
        return this.f27779d;
    }
}
