package ha0;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import da0.C19951e;
import da0.C19952f;
import p086g1.C6201a;
import p086g1.C6202b;

/* renamed from: ha0.d */
public final class C24927d implements C6201a {

    /* renamed from: d */
    private final FrameLayout f64104d;

    /* renamed from: e */
    public final RecyclerView f64105e;

    private C24927d(FrameLayout frameLayout, RecyclerView recyclerView) {
        this.f64104d = frameLayout;
        this.f64105e = recyclerView;
    }

    /* renamed from: a */
    public static C24927d m79685a(View view) {
        int i = C19951e.f54535q0;
        RecyclerView recyclerView = (RecyclerView) C6202b.m24689a(view, i);
        if (recyclerView != null) {
            return new C24927d((FrameLayout) view, recyclerView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: d */
    public static C24927d m79686d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C19952f.f54544d, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m79685a(inflate);
    }

    /* renamed from: c */
    public FrameLayout mo3946b() {
        return this.f64104d;
    }
}
