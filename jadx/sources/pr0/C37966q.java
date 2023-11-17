package pr0;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import lr0.C37131f;
import p086g1.C6201a;
import p341ge.bog.designsystem.components.loading.LoadingView;

/* renamed from: pr0.q */
public final class C37966q implements C6201a {

    /* renamed from: d */
    private final LoadingView f91246d;

    /* renamed from: e */
    public final LoadingView f91247e;

    private C37966q(LoadingView loadingView, LoadingView loadingView2) {
        this.f91246d = loadingView;
        this.f91247e = loadingView2;
    }

    /* renamed from: a */
    public static C37966q m111609a(View view) {
        if (view != null) {
            LoadingView loadingView = (LoadingView) view;
            return new C37966q(loadingView, loadingView);
        }
        throw new NullPointerException("rootView");
    }

    /* renamed from: d */
    public static C37966q m111610d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C37131f.item_loan_history_schedule_loading_view, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m111609a(inflate);
    }

    /* renamed from: c */
    public LoadingView mo3946b() {
        return this.f91246d;
    }
}
