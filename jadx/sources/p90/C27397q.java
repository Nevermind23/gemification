package p90;

import android.view.View;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.button.MaterialButton;
import p086g1.C6201a;
import p086g1.C6202b;
import p366bk.C10322k;

/* renamed from: p90.q */
public final class C27397q implements C6201a {

    /* renamed from: d */
    private final ConstraintLayout f69559d;

    /* renamed from: e */
    public final FrameLayout f69560e;

    /* renamed from: f */
    public final MaterialButton f69561f;

    /* renamed from: g */
    public final FrameLayout f69562g;

    /* renamed from: h */
    public final RecyclerView f69563h;

    /* renamed from: i */
    public final ConstraintLayout f69564i;

    /* renamed from: j */
    public final C27272c8 f69565j;

    private C27397q(ConstraintLayout constraintLayout, FrameLayout frameLayout, MaterialButton materialButton, FrameLayout frameLayout2, RecyclerView recyclerView, ConstraintLayout constraintLayout2, C27272c8 c8Var) {
        this.f69559d = constraintLayout;
        this.f69560e = frameLayout;
        this.f69561f = materialButton;
        this.f69562g = frameLayout2;
        this.f69563h = recyclerView;
        this.f69564i = constraintLayout2;
        this.f69565j = c8Var;
    }

    /* renamed from: a */
    public static C27397q m84891a(View view) {
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
                            return new C27397q(constraintLayout, frameLayout, materialButton, frameLayout2, recyclerView, constraintLayout, C27272c8.m84388a(a));
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: c */
    public ConstraintLayout mo3946b() {
        return this.f69559d;
    }
}
