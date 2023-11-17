package p352ak;

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
import p601sg.C17782g;
import p601sg.C17783h;

/* renamed from: ak.c */
public final class C9883c implements C6201a {

    /* renamed from: d */
    private final ConstraintLayout f26827d;

    /* renamed from: e */
    public final Button f26828e;

    /* renamed from: f */
    public final InlineFeedback f26829f;

    /* renamed from: g */
    public final SearchView f26830g;

    /* renamed from: h */
    public final RecyclerView f26831h;

    private C9883c(ConstraintLayout constraintLayout, Button button, InlineFeedback inlineFeedback, SearchView searchView, RecyclerView recyclerView) {
        this.f26827d = constraintLayout;
        this.f26828e = button;
        this.f26829f = inlineFeedback;
        this.f26830g = searchView;
        this.f26831h = recyclerView;
    }

    /* renamed from: a */
    public static C9883c m36249a(View view) {
        int i = C17782g.f49724S1;
        Button button = (Button) C6202b.m24689a(view, i);
        if (button != null) {
            i = C17782g.f49725S3;
            InlineFeedback inlineFeedback = (InlineFeedback) C6202b.m24689a(view, i);
            if (inlineFeedback != null) {
                i = C17782g.f49792s7;
                SearchView searchView = (SearchView) C6202b.m24689a(view, i);
                if (searchView != null) {
                    i = C17782g.f49778o8;
                    RecyclerView recyclerView = (RecyclerView) C6202b.m24689a(view, i);
                    if (recyclerView != null) {
                        return new C9883c((ConstraintLayout) view, button, inlineFeedback, searchView, recyclerView);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: d */
    public static C9883c m36250d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C17783h.action_sheet_selector, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m36249a(inflate);
    }

    /* renamed from: c */
    public ConstraintLayout mo3946b() {
        return this.f26827d;
    }
}
