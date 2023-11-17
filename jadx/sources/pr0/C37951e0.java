package pr0;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import lr0.C37131f;
import p086g1.C6201a;

/* renamed from: pr0.e0 */
public final class C37951e0 implements C6201a {

    /* renamed from: d */
    private final RecyclerView f91117d;

    /* renamed from: e */
    public final RecyclerView f91118e;

    private C37951e0(RecyclerView recyclerView, RecyclerView recyclerView2) {
        this.f91117d = recyclerView;
        this.f91118e = recyclerView2;
    }

    /* renamed from: a */
    public static C37951e0 m111548a(View view) {
        if (view != null) {
            RecyclerView recyclerView = (RecyclerView) view;
            return new C37951e0(recyclerView, recyclerView);
        }
        throw new NullPointerException("rootView");
    }

    /* renamed from: d */
    public static C37951e0 m111549d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C37131f.loans_history_graphics_fragment, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m111548a(inflate);
    }

    /* renamed from: c */
    public RecyclerView mo3946b() {
        return this.f91117d;
    }
}
