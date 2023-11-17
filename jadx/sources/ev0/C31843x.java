package ev0;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import bv0.C31205e;
import p086g1.C6201a;
import p341ge.bog.designsystem.components.loading.LoadingView;

/* renamed from: ev0.x */
public final class C31843x implements C6201a {

    /* renamed from: d */
    private final LoadingView f78549d;

    private C31843x(LoadingView loadingView) {
        this.f78549d = loadingView;
    }

    /* renamed from: a */
    public static C31843x m94161a(View view) {
        if (view != null) {
            return new C31843x((LoadingView) view);
        }
        throw new NullPointerException("rootView");
    }

    /* renamed from: d */
    public static C31843x m94162d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C31205e.item_operation_loading_skeleton, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m94161a(inflate);
    }

    /* renamed from: c */
    public LoadingView mo3946b() {
        return this.f78549d;
    }
}
