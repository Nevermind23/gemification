package z71;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import p086g1.C6201a;
import p086g1.C6202b;
import p341ge.bog.designsystem.components.progressbar.ProgressBarView;
import y71.C40030d;
import y71.C40031e;

/* renamed from: z71.f */
public final class C40179f implements C6201a {

    /* renamed from: d */
    private final LinearLayout f95495d;

    /* renamed from: e */
    public final ProgressBarView f95496e;

    /* renamed from: f */
    public final RecyclerView f95497f;

    /* renamed from: g */
    public final ProgressBarView f95498g;

    /* renamed from: h */
    public final ProgressBarView f95499h;

    private C40179f(LinearLayout linearLayout, ProgressBarView progressBarView, RecyclerView recyclerView, ProgressBarView progressBarView2, ProgressBarView progressBarView3) {
        this.f95495d = linearLayout;
        this.f95496e = progressBarView;
        this.f95497f = recyclerView;
        this.f95498g = progressBarView2;
        this.f95499h = progressBarView3;
    }

    /* renamed from: a */
    public static C40179f m116423a(View view) {
        int i = C40030d.first_progress_badge;
        ProgressBarView progressBarView = (ProgressBarView) C6202b.m24689a(view, i);
        if (progressBarView != null) {
            i = C40030d.insurance_providers_list;
            RecyclerView recyclerView = (RecyclerView) C6202b.m24689a(view, i);
            if (recyclerView != null) {
                i = C40030d.second_progress_badge;
                ProgressBarView progressBarView2 = (ProgressBarView) C6202b.m24689a(view, i);
                if (progressBarView2 != null) {
                    i = C40030d.third_progress_badge;
                    ProgressBarView progressBarView3 = (ProgressBarView) C6202b.m24689a(view, i);
                    if (progressBarView3 != null) {
                        return new C40179f((LinearLayout) view, progressBarView, recyclerView, progressBarView2, progressBarView3);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: d */
    public static C40179f m116424d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C40031e.fragment_insurance_providers, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m116423a(inflate);
    }

    /* renamed from: c */
    public LinearLayout mo3946b() {
        return this.f95495d;
    }
}
