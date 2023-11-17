package p90;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import p086g1.C6201a;
import p086g1.C6202b;
import p341ge.bog.designsystem.components.buttons.Button;
import p341ge.bog.mobilebank.p975ui.components.BogSwipeRefreshLayout;
import p366bk.C10322k;

/* renamed from: p90.d7 */
public final class C27281d7 implements C6201a {

    /* renamed from: d */
    private final ConstraintLayout f68559d;

    /* renamed from: e */
    public final Button f68560e;

    /* renamed from: f */
    public final RecyclerView f68561f;

    /* renamed from: g */
    public final BogSwipeRefreshLayout f68562g;

    private C27281d7(ConstraintLayout constraintLayout, Button button, RecyclerView recyclerView, BogSwipeRefreshLayout bogSwipeRefreshLayout) {
        this.f68559d = constraintLayout;
        this.f68560e = button;
        this.f68561f = recyclerView;
        this.f68562g = bogSwipeRefreshLayout;
    }

    /* renamed from: a */
    public static C27281d7 m84425a(View view) {
        int i = C10322k.nextBtn;
        Button button = (Button) C6202b.m24689a(view, i);
        if (button != null) {
            i = C10322k.f28709Ar;
            RecyclerView recyclerView = (RecyclerView) C6202b.m24689a(view, i);
            if (recyclerView != null) {
                i = C10322k.f28720Dw;
                BogSwipeRefreshLayout bogSwipeRefreshLayout = (BogSwipeRefreshLayout) C6202b.m24689a(view, i);
                if (bogSwipeRefreshLayout != null) {
                    return new C27281d7((ConstraintLayout) view, button, recyclerView, bogSwipeRefreshLayout);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: c */
    public ConstraintLayout mo3946b() {
        return this.f68559d;
    }
}
