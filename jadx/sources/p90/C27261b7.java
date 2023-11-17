package p90;

import android.view.View;
import androidx.core.widget.NestedScrollView;
import androidx.recyclerview.widget.RecyclerView;
import p086g1.C6201a;
import p086g1.C6202b;
import p341ge.bog.mobilebank.cleanarch.presentation.common.StateView;
import p341ge.bog.mobilebank.cleanarch.presentation.common.compoundview.InfoMessageView;
import p366bk.C10322k;

/* renamed from: p90.b7 */
public final class C27261b7 implements C6201a {

    /* renamed from: d */
    private final StateView f68398d;

    /* renamed from: e */
    public final RecyclerView f68399e;

    /* renamed from: f */
    public final StateView f68400f;

    /* renamed from: g */
    public final NestedScrollView f68401g;

    /* renamed from: h */
    public final InfoMessageView f68402h;

    /* renamed from: i */
    public final NestedScrollView f68403i;

    /* renamed from: j */
    public final InfoMessageView f68404j;

    private C27261b7(StateView stateView, RecyclerView recyclerView, StateView stateView2, NestedScrollView nestedScrollView, InfoMessageView infoMessageView, NestedScrollView nestedScrollView2, InfoMessageView infoMessageView2) {
        this.f68398d = stateView;
        this.f68399e = recyclerView;
        this.f68400f = stateView2;
        this.f68401g = nestedScrollView;
        this.f68402h = infoMessageView;
        this.f68403i = nestedScrollView2;
        this.f68404j = infoMessageView2;
    }

    /* renamed from: a */
    public static C27261b7 m84343a(View view) {
        int i = C10322k.f28867m9;
        RecyclerView recyclerView = (RecyclerView) C6202b.m24689a(view, i);
        if (recyclerView != null) {
            StateView stateView = (StateView) view;
            i = C10322k.empty_state_scroll_view;
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
                            return new C27261b7(stateView, recyclerView, stateView, nestedScrollView, infoMessageView, nestedScrollView2, infoMessageView2);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: c */
    public StateView mo3946b() {
        return this.f68398d;
    }
}
