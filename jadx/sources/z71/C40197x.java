package z71;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import p086g1.C6201a;
import p341ge.bog.designsystem.components.loading.LoadingView;
import y71.C40031e;

/* renamed from: z71.x */
public final class C40197x implements C6201a {

    /* renamed from: d */
    private final LoadingView f95583d;

    /* renamed from: e */
    public final LoadingView f95584e;

    private C40197x(LoadingView loadingView, LoadingView loadingView2) {
        this.f95583d = loadingView;
        this.f95584e = loadingView2;
    }

    /* renamed from: a */
    public static C40197x m116495a(View view) {
        if (view != null) {
            LoadingView loadingView = (LoadingView) view;
            return new C40197x(loadingView, loadingView);
        }
        throw new NullPointerException("rootView");
    }

    /* renamed from: d */
    public static C40197x m116496d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C40031e.item_travel_insurance_provider_skeleton, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m116495a(inflate);
    }

    /* renamed from: c */
    public LoadingView mo3946b() {
        return this.f95583d;
    }
}
