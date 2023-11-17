package p413eo;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import p086g1.C6201a;
import p086g1.C6202b;
import p341ge.bog.designsystem.components.buttons.Button;
import p341ge.bog.designsystem.components.layersandshadows.LayerView;
import p356ao.C10114f;
import p356ao.C10115g;

/* renamed from: eo.b0 */
public final class C12730b0 implements C6201a {

    /* renamed from: d */
    private final LayerView f37674d;

    /* renamed from: e */
    public final Button f37675e;

    /* renamed from: f */
    public final TextView f37676f;

    /* renamed from: g */
    public final LinearLayout f37677g;

    private C12730b0(LayerView layerView, Button button, TextView textView, LinearLayout linearLayout) {
        this.f37674d = layerView;
        this.f37675e = button;
        this.f37676f = textView;
        this.f37677g = linearLayout;
    }

    /* renamed from: a */
    public static C12730b0 m48313a(View view) {
        int i = C10114f.add_info_button;
        Button button = (Button) C6202b.m24689a(view, i);
        if (button != null) {
            i = C10114f.f27940U;
            TextView textView = (TextView) C6202b.m24689a(view, i);
            if (textView != null) {
                i = C10114f.f27965n0;
                LinearLayout linearLayout = (LinearLayout) C6202b.m24689a(view, i);
                if (linearLayout != null) {
                    return new C12730b0((LayerView) view, button, textView, linearLayout);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: d */
    public static C12730b0 m48314d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C10115g.item_application_second_stage_financial_info, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m48313a(inflate);
    }

    /* renamed from: c */
    public LayerView mo3946b() {
        return this.f37674d;
    }
}
