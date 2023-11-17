package th0;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import oh0.C27011f;
import p086g1.C6201a;

/* renamed from: th0.g */
public final class C28400g implements C6201a {

    /* renamed from: d */
    private final RecyclerView f72022d;

    /* renamed from: e */
    public final RecyclerView f72023e;

    private C28400g(RecyclerView recyclerView, RecyclerView recyclerView2) {
        this.f72022d = recyclerView;
        this.f72023e = recyclerView2;
    }

    /* renamed from: a */
    public static C28400g m87121a(View view) {
        if (view != null) {
            RecyclerView recyclerView = (RecyclerView) view;
            return new C28400g(recyclerView, recyclerView);
        }
        throw new NullPointerException("rootView");
    }

    /* renamed from: d */
    public static C28400g m87122d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C27011f.fragment_gift_card_details, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m87121a(inflate);
    }

    /* renamed from: c */
    public RecyclerView mo3946b() {
        return this.f72022d;
    }
}
