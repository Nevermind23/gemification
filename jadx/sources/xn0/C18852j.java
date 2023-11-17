package xn0;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import p086g1.C6201a;
import sn0.C17902f;

/* renamed from: xn0.j */
public final class C18852j implements C6201a {

    /* renamed from: d */
    private final RecyclerView f52755d;

    /* renamed from: e */
    public final RecyclerView f52756e;

    private C18852j(RecyclerView recyclerView, RecyclerView recyclerView2) {
        this.f52755d = recyclerView;
        this.f52756e = recyclerView2;
    }

    /* renamed from: a */
    public static C18852j m63778a(View view) {
        if (view != null) {
            RecyclerView recyclerView = (RecyclerView) view;
            return new C18852j(recyclerView, recyclerView);
        }
        throw new NullPointerException("rootView");
    }

    /* renamed from: d */
    public static C18852j m63779d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C17902f.fragment_progress_list, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m63778a(inflate);
    }

    /* renamed from: c */
    public RecyclerView mo3946b() {
        return this.f52755d;
    }
}
