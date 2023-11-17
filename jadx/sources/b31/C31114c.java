package b31;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import p086g1.C6201a;
import p086g1.C6202b;
import p341ge.bog.designsystem.components.buttons.Button;
import p341ge.bog.designsystem.components.inlinefeedback.InlineFeedback;
import p341ge.bog.designsystem.components.search.SearchView;
import x11.C39771d;
import x11.C39772e;

/* renamed from: b31.c */
public final class C31114c implements C6201a {

    /* renamed from: d */
    private final ConstraintLayout f77322d;

    /* renamed from: e */
    public final Button f77323e;

    /* renamed from: f */
    public final InlineFeedback f77324f;

    /* renamed from: g */
    public final RecyclerView f77325g;

    /* renamed from: h */
    public final SearchView f77326h;

    private C31114c(ConstraintLayout constraintLayout, Button button, InlineFeedback inlineFeedback, RecyclerView recyclerView, SearchView searchView) {
        this.f77322d = constraintLayout;
        this.f77323e = button;
        this.f77324f = inlineFeedback;
        this.f77325g = recyclerView;
        this.f77326h = searchView;
    }

    /* renamed from: a */
    public static C31114c m92574a(View view) {
        int i = C39771d.f94469e;
        Button button = (Button) C6202b.m24689a(view, i);
        if (button != null) {
            i = C39771d.f94472j;
            InlineFeedback inlineFeedback = (InlineFeedback) C6202b.m24689a(view, i);
            if (inlineFeedback != null) {
                i = C39771d.f94477r;
                RecyclerView recyclerView = (RecyclerView) C6202b.m24689a(view, i);
                if (recyclerView != null) {
                    i = C39771d.f94481v;
                    SearchView searchView = (SearchView) C6202b.m24689a(view, i);
                    if (searchView != null) {
                        return new C31114c((ConstraintLayout) view, button, inlineFeedback, recyclerView, searchView);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: d */
    public static C31114c m92575d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C39772e.action_sheet_chooser, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m92574a(inflate);
    }

    /* renamed from: c */
    public ConstraintLayout mo3946b() {
        return this.f77322d;
    }
}
