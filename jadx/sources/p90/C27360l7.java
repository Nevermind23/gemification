package p90;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import p086g1.C6201a;
import p086g1.C6202b;
import p341ge.bog.designsystem.components.buttons.Button;
import p341ge.bog.designsystem.components.layersandshadows.LayerView;
import p366bk.C10322k;
import p366bk.C10324m;

/* renamed from: p90.l7 */
public final class C27360l7 implements C6201a {

    /* renamed from: d */
    private final ConstraintLayout f69253d;

    /* renamed from: e */
    public final Button f69254e;

    /* renamed from: f */
    public final TextView f69255f;

    /* renamed from: g */
    public final CardView f69256g;

    /* renamed from: h */
    public final LayerView f69257h;

    private C27360l7(ConstraintLayout constraintLayout, Button button, TextView textView, CardView cardView, LayerView layerView) {
        this.f69253d = constraintLayout;
        this.f69254e = button;
        this.f69255f = textView;
        this.f69256g = cardView;
        this.f69257h = layerView;
    }

    /* renamed from: a */
    public static C27360l7 m84749a(View view) {
        int i = C10322k.contact_banker_button;
        Button button = (Button) C6202b.m24689a(view, i);
        if (button != null) {
            i = C10322k.f28833fb;
            TextView textView = (TextView) C6202b.m24689a(view, i);
            if (textView != null) {
                i = C10322k.f28719Dq;
                CardView cardView = (CardView) C6202b.m24689a(view, i);
                if (cardView != null) {
                    i = C10322k.warning_image_container;
                    LayerView layerView = (LayerView) C6202b.m24689a(view, i);
                    if (layerView != null) {
                        return new C27360l7((ConstraintLayout) view, button, textView, cardView, layerView);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: d */
    public static C27360l7 m84750d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C10324m.lead_application_action_sheet, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m84749a(inflate);
    }

    /* renamed from: c */
    public ConstraintLayout mo3946b() {
        return this.f69253d;
    }
}
