package pr0;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import lr0.C37131f;
import p086g1.C6201a;

/* renamed from: pr0.d0 */
public final class C37949d0 implements C6201a {

    /* renamed from: d */
    private final RecyclerView f91106d;

    /* renamed from: e */
    public final RecyclerView f91107e;

    private C37949d0(RecyclerView recyclerView, RecyclerView recyclerView2) {
        this.f91106d = recyclerView;
        this.f91107e = recyclerView2;
    }

    /* renamed from: a */
    public static C37949d0 m111539a(View view) {
        if (view != null) {
            RecyclerView recyclerView = (RecyclerView) view;
            return new C37949d0(recyclerView, recyclerView);
        }
        throw new NullPointerException("rootView");
    }

    /* renamed from: d */
    public static C37949d0 m111540d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C37131f.loan_details_fragment, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m111539a(inflate);
    }

    /* renamed from: c */
    public RecyclerView mo3946b() {
        return this.f91106d;
    }
}
