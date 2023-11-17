package b31;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import p086g1.C6201a;
import x11.C39772e;

/* renamed from: b31.a */
public final class C31112a implements C6201a {

    /* renamed from: d */
    private final RecyclerView f77317d;

    /* renamed from: e */
    public final RecyclerView f77318e;

    private C31112a(RecyclerView recyclerView, RecyclerView recyclerView2) {
        this.f77317d = recyclerView;
        this.f77318e = recyclerView2;
    }

    /* renamed from: a */
    public static C31112a m92566a(View view) {
        if (view != null) {
            RecyclerView recyclerView = (RecyclerView) view;
            return new C31112a(recyclerView, recyclerView);
        }
        throw new NullPointerException("rootView");
    }

    /* renamed from: d */
    public static C31112a m92567d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C39772e.action_sheet_card_account_selector, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m92566a(inflate);
    }

    /* renamed from: c */
    public RecyclerView mo3946b() {
        return this.f77317d;
    }
}
