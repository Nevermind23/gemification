package p352ak;

import android.view.View;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import p086g1.C6201a;
import p086g1.C6202b;
import p341ge.bog.designsystem.components.inlinefeedback.InlineFeedback;
import p601sg.C17782g;

/* renamed from: ak.w */
public final class C10036w implements C6201a {

    /* renamed from: d */
    private final LinearLayout f27679d;

    /* renamed from: e */
    public final RecyclerView f27680e;

    /* renamed from: f */
    public final InlineFeedback f27681f;

    /* renamed from: g */
    public final LinearLayout f27682g;

    private C10036w(LinearLayout linearLayout, RecyclerView recyclerView, InlineFeedback inlineFeedback, LinearLayout linearLayout2) {
        this.f27679d = linearLayout;
        this.f27680e = recyclerView;
        this.f27681f = inlineFeedback;
        this.f27682g = linearLayout2;
    }

    /* renamed from: a */
    public static C10036w m36811a(View view) {
        int i = C17782g.action_types_recycler;
        RecyclerView recyclerView = (RecyclerView) C6202b.m24689a(view, i);
        if (recyclerView != null) {
            i = C17782g.f49725S3;
            InlineFeedback inlineFeedback = (InlineFeedback) C6202b.m24689a(view, i);
            if (inlineFeedback != null) {
                LinearLayout linearLayout = (LinearLayout) view;
                return new C10036w(linearLayout, recyclerView, inlineFeedback, linearLayout);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: c */
    public LinearLayout mo3946b() {
        return this.f27679d;
    }
}
