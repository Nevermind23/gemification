package p493kk;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import p086g1.C6201a;
import p341ge.bog.designsystem.components.loading.LoadingView;
import p451hk.C15527e;

/* renamed from: kk.u */
public final class C16467u implements C6201a {

    /* renamed from: d */
    private final LoadingView f46615d;

    private C16467u(LoadingView loadingView) {
        this.f46615d = loadingView;
    }

    /* renamed from: a */
    public static C16467u m58673a(View view) {
        if (view != null) {
            return new C16467u((LoadingView) view);
        }
        throw new NullPointerException("rootView");
    }

    /* renamed from: d */
    public static C16467u m58674d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C15527e.item_skeleton_providers, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m58673a(inflate);
    }

    /* renamed from: c */
    public LoadingView mo3946b() {
        return this.f46615d;
    }
}
