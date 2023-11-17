package ev0;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import bv0.C31204d;
import bv0.C31205e;
import p086g1.C6201a;
import p086g1.C6202b;
import p341ge.bog.designsystem.components.buttons.Button;
import p341ge.bog.designsystem.components.loading.LoadingView;
import p341ge.bog.mobilebank.cleanarch.presentation.common.StateView;

/* renamed from: ev0.i */
public final class C31828i implements C6201a {

    /* renamed from: d */
    private final StateView f78505d;

    /* renamed from: e */
    public final RecyclerView f78506e;

    /* renamed from: f */
    public final LinearLayout f78507f;

    /* renamed from: g */
    public final Button f78508g;

    /* renamed from: h */
    public final LoadingView f78509h;

    private C31828i(StateView stateView, RecyclerView recyclerView, LinearLayout linearLayout, Button button, LoadingView loadingView) {
        this.f78505d = stateView;
        this.f78506e = recyclerView;
        this.f78507f = linearLayout;
        this.f78508g = button;
        this.f78509h = loadingView;
    }

    /* renamed from: a */
    public static C31828i m94101a(View view) {
        int i = C31204d.f77531f;
        RecyclerView recyclerView = (RecyclerView) C6202b.m24689a(view, i);
        if (recyclerView != null) {
            i = C31204d.f77536s;
            LinearLayout linearLayout = (LinearLayout) C6202b.m24689a(view, i);
            if (linearLayout != null) {
                i = C31204d.f77519T;
                Button button = (Button) C6202b.m24689a(view, i);
                if (button != null) {
                    i = C31204d.f77524a0;
                    LoadingView loadingView = (LoadingView) C6202b.m24689a(view, i);
                    if (loadingView != null) {
                        return new C31828i((StateView) view, recyclerView, linearLayout, button, loadingView);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: d */
    public static C31828i m94102d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C31205e.fragment_bank_list, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m94101a(inflate);
    }

    /* renamed from: c */
    public StateView mo3946b() {
        return this.f78505d;
    }
}
