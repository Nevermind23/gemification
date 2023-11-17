package p90;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import p086g1.C6201a;
import p341ge.bog.designsystem.components.loading.LoadingView;
import p366bk.C10324m;

/* renamed from: p90.l5 */
public final class C27358l5 implements C6201a {

    /* renamed from: d */
    private final LoadingView f69249d;

    private C27358l5(LoadingView loadingView) {
        this.f69249d = loadingView;
    }

    /* renamed from: a */
    public static C27358l5 m84741a(View view) {
        if (view != null) {
            return new C27358l5((LoadingView) view);
        }
        throw new NullPointerException("rootView");
    }

    /* renamed from: d */
    public static C27358l5 m84742d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C10324m.item_contact_loading_skeleton, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m84741a(inflate);
    }

    /* renamed from: c */
    public LoadingView mo3946b() {
        return this.f69249d;
    }
}
