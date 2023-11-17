package pr0;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import lr0.C37131f;
import p086g1.C6201a;
import p341ge.bog.designsystem.components.loading.LoadingView;

/* renamed from: pr0.l */
public final class C37961l implements C6201a {

    /* renamed from: d */
    private final LoadingView f91225d;

    /* renamed from: e */
    public final LoadingView f91226e;

    private C37961l(LoadingView loadingView, LoadingView loadingView2) {
        this.f91225d = loadingView;
        this.f91226e = loadingView2;
    }

    /* renamed from: a */
    public static C37961l m111589a(View view) {
        if (view != null) {
            LoadingView loadingView = (LoadingView) view;
            return new C37961l(loadingView, loadingView);
        }
        throw new NullPointerException("rootView");
    }

    /* renamed from: d */
    public static C37961l m111590d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C37131f.item_loan_details_loading_view, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m111589a(inflate);
    }

    /* renamed from: c */
    public LoadingView mo3946b() {
        return this.f91225d;
    }
}
