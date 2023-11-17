package pr0;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import lr0.C37130e;
import lr0.C37131f;
import p086g1.C6201a;
import p086g1.C6202b;
import p341ge.bog.designsystem.components.inlinefeedback2.InlineFeedback2;
import p341ge.bog.designsystem.components.layersandshadows.LayerView;

/* renamed from: pr0.k */
public final class C37960k implements C6201a {

    /* renamed from: d */
    private final LayerView f91222d;

    /* renamed from: e */
    public final LinearLayout f91223e;

    /* renamed from: f */
    public final InlineFeedback2 f91224f;

    private C37960k(LayerView layerView, LinearLayout linearLayout, InlineFeedback2 inlineFeedback2) {
        this.f91222d = layerView;
        this.f91223e = linearLayout;
        this.f91224f = inlineFeedback2;
    }

    /* renamed from: a */
    public static C37960k m111585a(View view) {
        int i = C37130e.f89447v;
        LinearLayout linearLayout = (LinearLayout) C6202b.m24689a(view, i);
        if (linearLayout != null) {
            i = C37130e.f89423H;
            InlineFeedback2 inlineFeedback2 = (InlineFeedback2) C6202b.m24689a(view, i);
            if (inlineFeedback2 != null) {
                return new C37960k((LayerView) view, linearLayout, inlineFeedback2);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: d */
    public static C37960k m111586d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C37131f.item_loan_action_buttons, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m111585a(inflate);
    }

    /* renamed from: c */
    public LayerView mo3946b() {
        return this.f91222d;
    }
}
