package p541oc;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.identomat.subfragments.views.LoadingView;
import p086g1.C6201a;
import p485kc.C16347e;
import p485kc.C16348f;

/* renamed from: oc.s */
public final class C17165s implements C6201a {

    /* renamed from: d */
    private final RelativeLayout f48153d;

    /* renamed from: e */
    public final RelativeLayout f48154e;

    /* renamed from: f */
    public final LoadingView f48155f;

    private C17165s(RelativeLayout relativeLayout, RelativeLayout relativeLayout2, LoadingView loadingView) {
        this.f48153d = relativeLayout;
        this.f48154e = relativeLayout2;
        this.f48155f = loadingView;
    }

    /* renamed from: a */
    public static C17165s m60313a(View view) {
        int i = C16347e.loading_panel;
        RelativeLayout relativeLayout = (RelativeLayout) view.findViewById(i);
        if (relativeLayout != null) {
            i = C16347e.f46193n0;
            LoadingView loadingView = (LoadingView) view.findViewById(i);
            if (loadingView != null) {
                return new C17165s((RelativeLayout) view, relativeLayout, loadingView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: d */
    public static C17165s m60314d(LayoutInflater layoutInflater) {
        return m60315e(layoutInflater, (ViewGroup) null, false);
    }

    /* renamed from: e */
    public static C17165s m60315e(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C16348f.fragment_start_identomat, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m60313a(inflate);
    }

    /* renamed from: c */
    public RelativeLayout mo3946b() {
        return this.f48153d;
    }
}
