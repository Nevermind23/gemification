package p493kk;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import p086g1.C6201a;
import p086g1.C6202b;
import p451hk.C15526d;
import p451hk.C15527e;

/* renamed from: kk.d */
public final class C16450d implements C6201a {

    /* renamed from: d */
    private final LinearLayout f46466d;

    /* renamed from: e */
    public final RecyclerView f46467e;

    private C16450d(LinearLayout linearLayout, RecyclerView recyclerView) {
        this.f46466d = linearLayout;
        this.f46467e = recyclerView;
    }

    /* renamed from: a */
    public static C16450d m58603a(View view) {
        int i = C15526d.cards;
        RecyclerView recyclerView = (RecyclerView) C6202b.m24689a(view, i);
        if (recyclerView != null) {
            return new C16450d((LinearLayout) view, recyclerView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: d */
    public static C16450d m58604d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C15527e.action_sheet_select_insurance_card, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m58603a(inflate);
    }

    /* renamed from: c */
    public LinearLayout mo3946b() {
        return this.f46466d;
    }
}
