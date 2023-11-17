package th0;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import oh0.C27011f;
import p086g1.C6201a;
import p341ge.bog.designsystem.components.loading.LoadingView;

/* renamed from: th0.e0 */
public final class C28397e0 implements C6201a {

    /* renamed from: d */
    private final LoadingView f72014d;

    /* renamed from: e */
    public final LoadingView f72015e;

    private C28397e0(LoadingView loadingView, LoadingView loadingView2) {
        this.f72014d = loadingView;
        this.f72015e = loadingView2;
    }

    /* renamed from: a */
    public static C28397e0 m87109a(View view) {
        if (view != null) {
            LoadingView loadingView = (LoadingView) view;
            return new C28397e0(loadingView, loadingView);
        }
        throw new NullPointerException("rootView");
    }

    /* renamed from: d */
    public static C28397e0 m87110d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C27011f.item_gift_card_details_loading, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m87109a(inflate);
    }

    /* renamed from: c */
    public LoadingView mo3946b() {
        return this.f72014d;
    }
}
