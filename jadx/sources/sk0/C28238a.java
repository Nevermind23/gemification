package sk0;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import androidx.recyclerview.widget.RecyclerView;
import ok0.C27029e;
import ok0.C27030f;
import p086g1.C6201a;
import p086g1.C6202b;
import p341ge.bog.designsystem.components.loading.LoadingView;

/* renamed from: sk0.a */
public final class C28238a implements C6201a {

    /* renamed from: d */
    private final FrameLayout f71599d;

    /* renamed from: e */
    public final ProgressBar f71600e;

    /* renamed from: f */
    public final RecyclerView f71601f;

    /* renamed from: g */
    public final LoadingView f71602g;

    private C28238a(FrameLayout frameLayout, ProgressBar progressBar, RecyclerView recyclerView, LoadingView loadingView) {
        this.f71599d = frameLayout;
        this.f71600e = progressBar;
        this.f71601f = recyclerView;
        this.f71602g = loadingView;
    }

    /* renamed from: a */
    public static C28238a m86774a(View view) {
        int i = C27029e.f67890h;
        ProgressBar progressBar = (ProgressBar) C6202b.m24689a(view, i);
        if (progressBar != null) {
            i = C27029e.f67884P;
            RecyclerView recyclerView = (RecyclerView) C6202b.m24689a(view, i);
            if (recyclerView != null) {
                i = C27029e.f67886a0;
                LoadingView loadingView = (LoadingView) C6202b.m24689a(view, i);
                if (loadingView != null) {
                    return new C28238a((FrameLayout) view, progressBar, recyclerView, loadingView);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: d */
    public static C28238a m86775d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C27030f.action_sheet_transfers, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m86774a(inflate);
    }

    /* renamed from: c */
    public FrameLayout mo3946b() {
        return this.f71599d;
    }
}
