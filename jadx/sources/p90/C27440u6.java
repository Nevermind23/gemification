package p90;

import android.view.View;
import androidx.core.widget.NestedScrollView;
import androidx.recyclerview.widget.RecyclerView;
import p086g1.C6201a;
import p086g1.C6202b;
import p341ge.bog.mobilebank.cleanarch.presentation.common.StateView;
import p341ge.bog.mobilebank.cleanarch.presentation.common.compoundview.InfoMessageView;
import p366bk.C10322k;

/* renamed from: p90.u6 */
public final class C27440u6 implements C6201a {

    /* renamed from: d */
    private final StateView f69976d;

    /* renamed from: e */
    public final NestedScrollView f69977e;

    /* renamed from: f */
    public final InfoMessageView f69978f;

    /* renamed from: g */
    public final NestedScrollView f69979g;

    /* renamed from: h */
    public final InfoMessageView f69980h;

    /* renamed from: i */
    public final RecyclerView f69981i;

    /* renamed from: j */
    public final StateView f69982j;

    private C27440u6(StateView stateView, NestedScrollView nestedScrollView, InfoMessageView infoMessageView, NestedScrollView nestedScrollView2, InfoMessageView infoMessageView2, RecyclerView recyclerView, StateView stateView2) {
        this.f69976d = stateView;
        this.f69977e = nestedScrollView;
        this.f69978f = infoMessageView;
        this.f69979g = nestedScrollView2;
        this.f69980h = infoMessageView2;
        this.f69981i = recyclerView;
        this.f69982j = stateView2;
    }

    /* renamed from: a */
    public static C27440u6 m85070a(View view) {
        int i = C10322k.empty_state_scroll_view;
        NestedScrollView nestedScrollView = (NestedScrollView) C6202b.m24689a(view, i);
        if (nestedScrollView != null) {
            i = C10322k.f28725Ec;
            InfoMessageView infoMessageView = (InfoMessageView) C6202b.m24689a(view, i);
            if (infoMessageView != null) {
                i = C10322k.error_state_scroll_view;
                NestedScrollView nestedScrollView2 = (NestedScrollView) C6202b.m24689a(view, i);
                if (nestedScrollView2 != null) {
                    i = C10322k.error_state_view;
                    InfoMessageView infoMessageView2 = (InfoMessageView) C6202b.m24689a(view, i);
                    if (infoMessageView2 != null) {
                        i = C10322k.operations_recycler;
                        RecyclerView recyclerView = (RecyclerView) C6202b.m24689a(view, i);
                        if (recyclerView != null) {
                            StateView stateView = (StateView) view;
                            return new C27440u6(stateView, nestedScrollView, infoMessageView, nestedScrollView2, infoMessageView2, recyclerView, stateView);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: c */
    public StateView mo3946b() {
        return this.f69976d;
    }
}
