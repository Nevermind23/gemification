package p482jn;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import p086g1.C6201a;
import p426fn.C12930d;

/* renamed from: jn.a */
public final class C16248a implements C6201a {

    /* renamed from: d */
    private final RecyclerView f46017d;

    /* renamed from: e */
    public final RecyclerView f46018e;

    private C16248a(RecyclerView recyclerView, RecyclerView recyclerView2) {
        this.f46017d = recyclerView;
        this.f46018e = recyclerView2;
    }

    /* renamed from: a */
    public static C16248a m57926a(View view) {
        if (view != null) {
            RecyclerView recyclerView = (RecyclerView) view;
            return new C16248a(recyclerView, recyclerView);
        }
        throw new NullPointerException("rootView");
    }

    /* renamed from: d */
    public static C16248a m57927d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C12930d.action_sheet_card_benefits, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m57926a(inflate);
    }

    /* renamed from: c */
    public RecyclerView mo3946b() {
        return this.f46017d;
    }
}
