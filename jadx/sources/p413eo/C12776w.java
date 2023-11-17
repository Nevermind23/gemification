package p413eo;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import p086g1.C6201a;
import p086g1.C6202b;
import p341ge.bog.designsystem.components.buttons.Button;
import p341ge.bog.designsystem.components.inlinefeedback.InlineFeedback;
import p341ge.bog.designsystem.components.layersandshadows.LayerView;
import p356ao.C10114f;
import p356ao.C10115g;

/* renamed from: eo.w */
public final class C12776w implements C6201a {

    /* renamed from: d */
    private final LayerView f37880d;

    /* renamed from: e */
    public final Button f37881e;

    /* renamed from: f */
    public final LinearLayout f37882f;

    /* renamed from: g */
    public final InlineFeedback f37883g;

    private C12776w(LayerView layerView, Button button, LinearLayout linearLayout, InlineFeedback inlineFeedback) {
        this.f37880d = layerView;
        this.f37881e = button;
        this.f37882f = linearLayout;
        this.f37883g = inlineFeedback;
    }

    /* renamed from: a */
    public static C12776w m48503a(View view) {
        int i = C10114f.f27967p;
        Button button = (Button) C6202b.m24689a(view, i);
        if (button != null) {
            i = C10114f.no_email_container;
            LinearLayout linearLayout = (LinearLayout) C6202b.m24689a(view, i);
            if (linearLayout != null) {
                i = C10114f.no_email_feedback;
                InlineFeedback inlineFeedback = (InlineFeedback) C6202b.m24689a(view, i);
                if (inlineFeedback != null) {
                    return new C12776w((LayerView) view, button, linearLayout, inlineFeedback);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: d */
    public static C12776w m48504d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C10115g.item_application_first_stage_no_email, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m48503a(inflate);
    }

    /* renamed from: c */
    public LayerView mo3946b() {
        return this.f37880d;
    }
}
