package pr0;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import lr0.C37130e;
import lr0.C37131f;
import p086g1.C6201a;
import p086g1.C6202b;

/* renamed from: pr0.c */
public final class C37946c implements C6201a {

    /* renamed from: d */
    private final LinearLayout f91094d;

    /* renamed from: e */
    public final RecyclerView f91095e;

    private C37946c(LinearLayout linearLayout, RecyclerView recyclerView) {
        this.f91094d = linearLayout;
        this.f91095e = recyclerView;
    }

    /* renamed from: a */
    public static C37946c m111527a(View view) {
        int i = C37130e.payment_method_recycler_view;
        RecyclerView recyclerView = (RecyclerView) C6202b.m24689a(view, i);
        if (recyclerView != null) {
            return new C37946c((LinearLayout) view, recyclerView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: d */
    public static C37946c m111528d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C37131f.action_sheet_offered_plans, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m111527a(inflate);
    }

    /* renamed from: c */
    public LinearLayout mo3946b() {
        return this.f91094d;
    }
}
