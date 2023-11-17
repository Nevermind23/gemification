package ap0;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import p086g1.C6201a;
import p086g1.C6202b;
import wo0.C18652b;
import wo0.C18653c;

/* renamed from: ap0.b */
public final class C10129b implements C6201a {

    /* renamed from: d */
    private final LinearLayout f28053d;

    /* renamed from: e */
    public final RecyclerView f28054e;

    private C10129b(LinearLayout linearLayout, RecyclerView recyclerView) {
        this.f28053d = linearLayout;
        this.f28054e = recyclerView;
    }

    /* renamed from: a */
    public static C10129b m37044a(View view) {
        int i = C18652b.rv_accounts;
        RecyclerView recyclerView = (RecyclerView) C6202b.m24689a(view, i);
        if (recyclerView != null) {
            return new C10129b((LinearLayout) view, recyclerView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: d */
    public static C10129b m37045d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C18653c.dialog_choose_account_p2p, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m37044a(inflate);
    }

    /* renamed from: c */
    public LinearLayout mo3946b() {
        return this.f28053d;
    }
}
