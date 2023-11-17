package o51;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import n51.C37357c;
import p086g1.C6201a;
import p341ge.bog.designsystem.components.loading.LoadingView;

/* renamed from: o51.l */
public final class C37655l implements C6201a {

    /* renamed from: d */
    private final LoadingView f90503d;

    private C37655l(LoadingView loadingView) {
        this.f90503d = loadingView;
    }

    /* renamed from: a */
    public static C37655l m110711a(View view) {
        if (view != null) {
            return new C37655l((LoadingView) view);
        }
        throw new NullPointerException("rootView");
    }

    /* renamed from: d */
    public static C37655l m110712d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C37357c.item_statements_more_loading, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m110711a(inflate);
    }

    /* renamed from: c */
    public LoadingView mo3946b() {
        return this.f90503d;
    }
}
