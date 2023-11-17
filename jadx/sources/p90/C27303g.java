package p90;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import androidx.recyclerview.widget.RecyclerView;
import p086g1.C6201a;
import p086g1.C6202b;
import p341ge.bog.designsystem.components.loading.LoadingView;
import p366bk.C10322k;
import p366bk.C10324m;

/* renamed from: p90.g */
public final class C27303g implements C6201a {

    /* renamed from: d */
    private final FrameLayout f68743d;

    /* renamed from: e */
    public final ProgressBar f68744e;

    /* renamed from: f */
    public final RecyclerView f68745f;

    /* renamed from: g */
    public final LoadingView f68746g;

    private C27303g(FrameLayout frameLayout, ProgressBar progressBar, RecyclerView recyclerView, LoadingView loadingView) {
        this.f68743d = frameLayout;
        this.f68744e = progressBar;
        this.f68745f = recyclerView;
        this.f68746g = loadingView;
    }

    /* renamed from: a */
    public static C27303g m84515a(View view) {
        int i = C10322k.f28779P7;
        ProgressBar progressBar = (ProgressBar) C6202b.m24689a(view, i);
        if (progressBar != null) {
            i = C10322k.f28917zr;
            RecyclerView recyclerView = (RecyclerView) C6202b.m24689a(view, i);
            if (recyclerView != null) {
                i = C10322k.f28816Zu;
                LoadingView loadingView = (LoadingView) C6202b.m24689a(view, i);
                if (loadingView != null) {
                    return new C27303g((FrameLayout) view, progressBar, recyclerView, loadingView);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: d */
    public static C27303g m84516d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C10324m.action_sheet_new_product, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m84515a(inflate);
    }

    /* renamed from: c */
    public FrameLayout mo3946b() {
        return this.f68743d;
    }
}
