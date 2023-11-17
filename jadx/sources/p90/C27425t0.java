package p90;

import android.view.View;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.button.MaterialButton;
import p086g1.C6201a;
import p086g1.C6202b;
import p366bk.C10322k;

/* renamed from: p90.t0 */
public final class C27425t0 implements C6201a {

    /* renamed from: d */
    private final ConstraintLayout f69818d;

    /* renamed from: e */
    public final FrameLayout f69819e;

    /* renamed from: f */
    public final MaterialButton f69820f;

    /* renamed from: g */
    public final FrameLayout f69821g;

    /* renamed from: h */
    public final RecyclerView f69822h;

    /* renamed from: i */
    public final ConstraintLayout f69823i;

    /* renamed from: j */
    public final C27272c8 f69824j;

    private C27425t0(ConstraintLayout constraintLayout, FrameLayout frameLayout, MaterialButton materialButton, FrameLayout frameLayout2, RecyclerView recyclerView, ConstraintLayout constraintLayout2, C27272c8 c8Var) {
        this.f69818d = constraintLayout;
        this.f69819e = frameLayout;
        this.f69820f = materialButton;
        this.f69821g = frameLayout2;
        this.f69822h = recyclerView;
        this.f69823i = constraintLayout2;
        this.f69824j = c8Var;
    }

    /* renamed from: a */
    public static C27425t0 m85009a(View view) {
        int i = C10322k.button_frame;
        FrameLayout frameLayout = (FrameLayout) C6202b.m24689a(view, i);
        if (frameLayout != null) {
            i = C10322k.f28781Pm;
            MaterialButton materialButton = (MaterialButton) C6202b.m24689a(view, i);
            if (materialButton != null) {
                i = C10322k.progress_bar_frame;
                FrameLayout frameLayout2 = (FrameLayout) C6202b.m24689a(view, i);
                if (frameLayout2 != null) {
                    i = C10322k.f28712Br;
                    RecyclerView recyclerView = (RecyclerView) C6202b.m24689a(view, i);
                    if (recyclerView != null) {
                        ConstraintLayout constraintLayout = (ConstraintLayout) view;
                        i = C10322k.f28730Ex;
                        View a = C6202b.m24689a(view, i);
                        if (a != null) {
                            return new C27425t0(constraintLayout, frameLayout, materialButton, frameLayout2, recyclerView, constraintLayout, C27272c8.m84388a(a));
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: c */
    public ConstraintLayout mo3946b() {
        return this.f69818d;
    }
}
