package yv0;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import p086g1.C6201a;
import p086g1.C6202b;
import p341ge.bog.designsystem.components.inlinefeedback.InlineFeedback;
import uv0.C39106c;
import uv0.C39107d;

/* renamed from: yv0.b */
public final class C40077b implements C6201a {

    /* renamed from: d */
    private final LinearLayout f95253d;

    /* renamed from: e */
    public final InlineFeedback f95254e;

    /* renamed from: f */
    public final RecyclerView f95255f;

    private C40077b(LinearLayout linearLayout, InlineFeedback inlineFeedback, RecyclerView recyclerView) {
        this.f95253d = linearLayout;
        this.f95254e = inlineFeedback;
        this.f95255f = recyclerView;
    }

    /* renamed from: a */
    public static C40077b m116113a(View view) {
        int i = C39106c.f93251i;
        InlineFeedback inlineFeedback = (InlineFeedback) C6202b.m24689a(view, i);
        if (inlineFeedback != null) {
            i = C39106c.rv_cards;
            RecyclerView recyclerView = (RecyclerView) C6202b.m24689a(view, i);
            if (recyclerView != null) {
                return new C40077b((LinearLayout) view, inlineFeedback, recyclerView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: d */
    public static C40077b m116114d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C39107d.dialog_choose_card_p2p, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m116113a(inflate);
    }

    /* renamed from: c */
    public LinearLayout mo3946b() {
        return this.f95253d;
    }
}
