package en0;

import an0.C10106b;
import an0.C10107c;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import p086g1.C6201a;
import p086g1.C6202b;
import p341ge.bog.designsystem.components.buttons.Button;
import p341ge.bog.designsystem.components.loading.LoadingView;
import p341ge.bog.designsystem.components.search.SearchView;
import p341ge.bog.mobilebank.cleanarch.presentation.common.StateView;

/* renamed from: en0.a */
public final class C12715a implements C6201a {

    /* renamed from: d */
    private final StateView f37600d;

    /* renamed from: e */
    public final LinearLayout f37601e;

    /* renamed from: f */
    public final LinearLayout f37602f;

    /* renamed from: g */
    public final RecyclerView f37603g;

    /* renamed from: h */
    public final Button f37604h;

    /* renamed from: i */
    public final SearchView f37605i;

    /* renamed from: j */
    public final LoadingView f37606j;

    private C12715a(StateView stateView, LinearLayout linearLayout, LinearLayout linearLayout2, RecyclerView recyclerView, Button button, SearchView searchView, LoadingView loadingView) {
        this.f37600d = stateView;
        this.f37601e = linearLayout;
        this.f37602f = linearLayout2;
        this.f37603g = recyclerView;
        this.f37604h = button;
        this.f37605i = searchView;
        this.f37606j = loadingView;
    }

    /* renamed from: a */
    public static C12715a m48253a(View view) {
        int i = C10106b.f27885p;
        LinearLayout linearLayout = (LinearLayout) C6202b.m24689a(view, i);
        if (linearLayout != null) {
            i = C10106b.f27888v;
            LinearLayout linearLayout2 = (LinearLayout) C6202b.m24689a(view, i);
            if (linearLayout2 != null) {
                i = C10106b.f27877K;
                RecyclerView recyclerView = (RecyclerView) C6202b.m24689a(view, i);
                if (recyclerView != null) {
                    i = C10106b.f27878L;
                    Button button = (Button) C6202b.m24689a(view, i);
                    if (button != null) {
                        i = C10106b.f27879M;
                        SearchView searchView = (SearchView) C6202b.m24689a(view, i);
                        if (searchView != null) {
                            i = C10106b.f27880O;
                            LoadingView loadingView = (LoadingView) C6202b.m24689a(view, i);
                            if (loadingView != null) {
                                return new C12715a((StateView) view, linearLayout, linearLayout2, recyclerView, button, searchView, loadingView);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: d */
    public static C12715a m48254d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C10107c.action_sheet_city_selector, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m48253a(inflate);
    }

    /* renamed from: c */
    public StateView mo3946b() {
        return this.f37600d;
    }
}
