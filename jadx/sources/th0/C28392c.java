package th0;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import oh0.C27011f;
import p086g1.C6201a;

/* renamed from: th0.c */
public final class C28392c implements C6201a {

    /* renamed from: d */
    private final RecyclerView f71989d;

    /* renamed from: e */
    public final RecyclerView f71990e;

    private C28392c(RecyclerView recyclerView, RecyclerView recyclerView2) {
        this.f71989d = recyclerView;
        this.f71990e = recyclerView2;
    }

    /* renamed from: a */
    public static C28392c m87088a(View view) {
        if (view != null) {
            RecyclerView recyclerView = (RecyclerView) view;
            return new C28392c(recyclerView, recyclerView);
        }
        throw new NullPointerException("rootView");
    }

    /* renamed from: d */
    public static C28392c m87089d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C27011f.action_sheet_gift_cards_stores, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m87088a(inflate);
    }

    /* renamed from: c */
    public RecyclerView mo3946b() {
        return this.f71989d;
    }
}
