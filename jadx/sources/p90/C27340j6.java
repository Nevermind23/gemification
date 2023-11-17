package p90;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import p086g1.C6201a;
import p086g1.C6202b;
import p341ge.bog.designsystem.components.buttons.Button;
import p341ge.bog.designsystem.components.layersandshadows.LayerView;
import p341ge.bog.mobilebank.p975ui.views.widgets.BogImageView;
import p366bk.C10322k;
import p366bk.C10324m;

/* renamed from: p90.j6 */
public final class C27340j6 implements C6201a {

    /* renamed from: d */
    private final LayerView f69085d;

    /* renamed from: e */
    public final Button f69086e;

    /* renamed from: f */
    public final TextView f69087f;

    /* renamed from: g */
    public final BogImageView f69088g;

    /* renamed from: h */
    public final LayerView f69089h;

    /* renamed from: i */
    public final LayerView f69090i;

    private C27340j6(LayerView layerView, Button button, TextView textView, BogImageView bogImageView, LayerView layerView2, LayerView layerView3) {
        this.f69085d = layerView;
        this.f69086e = button;
        this.f69087f = textView;
        this.f69088g = bogImageView;
        this.f69089h = layerView2;
        this.f69090i = layerView3;
    }

    /* renamed from: a */
    public static C27340j6 m84669a(View view) {
        int i = C10322k.f28804X7;
        Button button = (Button) C6202b.m24689a(view, i);
        if (button != null) {
            i = C10322k.f28819ab;
            TextView textView = (TextView) C6202b.m24689a(view, i);
            if (textView != null) {
                i = C10322k.f28822bh;
                BogImageView bogImageView = (BogImageView) C6202b.m24689a(view, i);
                if (bogImageView != null) {
                    LayerView layerView = (LayerView) view;
                    i = C10322k.verifyContactsBtn;
                    LayerView layerView2 = (LayerView) C6202b.m24689a(view, i);
                    if (layerView2 != null) {
                        return new C27340j6(layerView, button, textView, bogImageView, layerView, layerView2);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: d */
    public static C27340j6 m84670d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C10324m.item_security_green_activate_button, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m84669a(inflate);
    }

    /* renamed from: c */
    public LayerView mo3946b() {
        return this.f69085d;
    }
}
