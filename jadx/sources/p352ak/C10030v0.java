package p352ak;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import p086g1.C6201a;
import p086g1.C6202b;
import p341ge.bog.designsystem.components.layersandshadows.LayerView;
import p601sg.C17782g;
import p601sg.C17783h;

/* renamed from: ak.v0 */
public final class C10030v0 implements C6201a {

    /* renamed from: d */
    private final LayerView f27634d;

    /* renamed from: e */
    public final LayerView f27635e;

    /* renamed from: f */
    public final TextView f27636f;

    /* renamed from: g */
    public final TextView f27637g;

    /* renamed from: h */
    public final LayerView f27638h;

    /* renamed from: i */
    public final TextView f27639i;

    /* renamed from: j */
    public final TextView f27640j;

    /* renamed from: k */
    public final TextView f27641k;

    /* renamed from: l */
    public final TextView f27642l;

    private C10030v0(LayerView layerView, LayerView layerView2, TextView textView, TextView textView2, LayerView layerView3, TextView textView3, TextView textView4, TextView textView5, TextView textView6) {
        this.f27634d = layerView;
        this.f27635e = layerView2;
        this.f27636f = textView;
        this.f27637g = textView2;
        this.f27638h = layerView3;
        this.f27639i = textView3;
        this.f27640j = textView4;
        this.f27641k = textView5;
        this.f27642l = textView6;
    }

    /* renamed from: a */
    public static C10030v0 m36788a(View view) {
        int i = C17782g.f49771l5;
        LayerView layerView = (LayerView) C6202b.m24689a(view, i);
        if (layerView != null) {
            i = C17782g.leftText;
            TextView textView = (TextView) C6202b.m24689a(view, i);
            if (textView != null) {
                i = C17782g.leftTitle;
                TextView textView2 = (TextView) C6202b.m24689a(view, i);
                if (textView2 != null) {
                    i = C17782g.f49758f7;
                    LayerView layerView2 = (LayerView) C6202b.m24689a(view, i);
                    if (layerView2 != null) {
                        i = C17782g.rightText;
                        TextView textView3 = (TextView) C6202b.m24689a(view, i);
                        if (textView3 != null) {
                            i = C17782g.rightTitle;
                            TextView textView4 = (TextView) C6202b.m24689a(view, i);
                            if (textView4 != null) {
                                i = C17782g.f49816z8;
                                TextView textView5 = (TextView) C6202b.m24689a(view, i);
                                if (textView5 != null) {
                                    i = C17782g.f49745Y8;
                                    TextView textView6 = (TextView) C6202b.m24689a(view, i);
                                    if (textView6 != null) {
                                        return new C10030v0((LayerView) view, layerView, textView, textView2, layerView2, textView3, textView4, textView5, textView6);
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
    public static C10030v0 m36789d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C17783h.view_balance_widget, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m36788a(inflate);
    }

    /* renamed from: c */
    public LayerView mo3946b() {
        return this.f27634d;
    }
}
