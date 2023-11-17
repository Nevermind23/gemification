package ue0;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import ie0.C25187g;
import ie0.C25188h;
import p086g1.C6201a;
import p086g1.C6202b;
import p341ge.bog.designsystem.components.buttons.Button;
import p341ge.bog.designsystem.components.layersandshadows.LayerView;

/* renamed from: ue0.k */
public final class C28734k implements C6201a {

    /* renamed from: d */
    private final LinearLayout f73324d;

    /* renamed from: e */
    public final LinearLayout f73325e;

    /* renamed from: f */
    public final LayerView f73326f;

    /* renamed from: g */
    public final TextView f73327g;

    /* renamed from: h */
    public final LayerView f73328h;

    /* renamed from: i */
    public final TextView f73329i;

    /* renamed from: j */
    public final LinearLayout f73330j;

    /* renamed from: k */
    public final TextView f73331k;

    /* renamed from: l */
    public final Button f73332l;

    /* renamed from: m */
    public final LayerView f73333m;

    /* renamed from: n */
    public final TextView f73334n;

    private C28734k(LinearLayout linearLayout, LinearLayout linearLayout2, LayerView layerView, TextView textView, LayerView layerView2, TextView textView2, LinearLayout linearLayout3, TextView textView3, Button button, LayerView layerView3, TextView textView4) {
        this.f73324d = linearLayout;
        this.f73325e = linearLayout2;
        this.f73326f = layerView;
        this.f73327g = textView;
        this.f73328h = layerView2;
        this.f73329i = textView2;
        this.f73330j = linearLayout3;
        this.f73331k = textView3;
        this.f73332l = button;
        this.f73333m = layerView3;
        this.f73334n = textView4;
    }

    /* renamed from: a */
    public static C28734k m88060a(View view) {
        int i = C25187g.f64697h;
        LinearLayout linearLayout = (LinearLayout) C6202b.m24689a(view, i);
        if (linearLayout != null) {
            i = C25187g.daily_button;
            LayerView layerView = (LayerView) C6202b.m24689a(view, i);
            if (layerView != null) {
                i = C25187g.daily_text;
                TextView textView = (TextView) C6202b.m24689a(view, i);
                if (textView != null) {
                    i = C25187g.date_button;
                    LayerView layerView2 = (LayerView) C6202b.m24689a(view, i);
                    if (layerView2 != null) {
                        i = C25187g.date_hint;
                        TextView textView2 = (TextView) C6202b.m24689a(view, i);
                        if (textView2 != null) {
                            i = C25187g.date_picker;
                            LinearLayout linearLayout2 = (LinearLayout) C6202b.m24689a(view, i);
                            if (linearLayout2 != null) {
                                i = C25187g.f64677N0;
                                TextView textView3 = (TextView) C6202b.m24689a(view, i);
                                if (textView3 != null) {
                                    i = C25187g.f64689Z0;
                                    Button button = (Button) C6202b.m24689a(view, i);
                                    if (button != null) {
                                        i = C25187g.monthly_button;
                                        LayerView layerView3 = (LayerView) C6202b.m24689a(view, i);
                                        if (layerView3 != null) {
                                            i = C25187g.monthly_text;
                                            TextView textView4 = (TextView) C6202b.m24689a(view, i);
                                            if (textView4 != null) {
                                                return new C28734k((LinearLayout) view, linearLayout, layerView, textView, layerView2, textView2, linearLayout2, textView3, button, layerView3, textView4);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: d */
    public static C28734k m88061d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C25188h.action_sheet_gt_transactions_download, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m88060a(inflate);
    }

    /* renamed from: c */
    public LinearLayout mo3946b() {
        return this.f73324d;
    }
}
