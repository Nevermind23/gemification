package i01;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import e01.C31638b;
import e01.C31639c;
import p086g1.C6201a;
import p086g1.C6202b;
import p341ge.bog.designsystem.components.inlinefeedback2.InlineFeedback2;

/* renamed from: i01.a */
public final class C36333a implements C6201a {

    /* renamed from: d */
    private final LinearLayout f87667d;

    /* renamed from: e */
    public final InlineFeedback2 f87668e;

    /* renamed from: f */
    public final RecyclerView f87669f;

    private C36333a(LinearLayout linearLayout, InlineFeedback2 inlineFeedback2, RecyclerView recyclerView) {
        this.f87667d = linearLayout;
        this.f87668e = inlineFeedback2;
        this.f87669f = recyclerView;
    }

    /* renamed from: a */
    public static C36333a m107821a(View view) {
        int i = C31638b.f78219p;
        InlineFeedback2 inlineFeedback2 = (InlineFeedback2) C6202b.m24689a(view, i);
        if (inlineFeedback2 != null) {
            i = C31638b.f78224w;
            RecyclerView recyclerView = (RecyclerView) C6202b.m24689a(view, i);
            if (recyclerView != null) {
                return new C36333a((LinearLayout) view, inlineFeedback2, recyclerView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: d */
    public static C36333a m107822d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C31639c.action_sheet_card_chooser, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m107821a(inflate);
    }

    /* renamed from: c */
    public LinearLayout mo3946b() {
        return this.f87667d;
    }
}
