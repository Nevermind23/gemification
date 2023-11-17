package iy0;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import hy0.C36271e;
import hy0.C36272f;
import p086g1.C6201a;
import p086g1.C6202b;
import p341ge.bog.designsystem.components.buttons.Button;
import p341ge.bog.designsystem.components.layersandshadows.LayerView;

/* renamed from: iy0.i1 */
public final class C36604i1 implements C6201a {

    /* renamed from: d */
    private final LayerView f88270d;

    /* renamed from: e */
    public final Button f88271e;

    /* renamed from: f */
    public final Button f88272f;

    /* renamed from: g */
    public final ImageView f88273g;

    /* renamed from: h */
    public final Button f88274h;

    /* renamed from: i */
    public final Button f88275i;

    /* renamed from: j */
    public final Button f88276j;

    /* renamed from: k */
    public final Button f88277k;

    private C36604i1(LayerView layerView, Button button, Button button2, ImageView imageView, Button button3, Button button4, Button button5, Button button6) {
        this.f88270d = layerView;
        this.f88271e = button;
        this.f88272f = button2;
        this.f88273g = imageView;
        this.f88274h = button3;
        this.f88275i = button4;
        this.f88276j = button5;
        this.f88277k = button6;
    }

    /* renamed from: a */
    public static C36604i1 m108545a(View view) {
        int i = C36271e.f87493L;
        Button button = (Button) C6202b.m24689a(view, i);
        if (button != null) {
            i = C36271e.p2p_top_up;
            Button button2 = (Button) C6202b.m24689a(view, i);
            if (button2 != null) {
                i = C36271e.p2p_top_up_new_badge;
                ImageView imageView = (ImageView) C6202b.m24689a(view, i);
                if (imageView != null) {
                    i = C36271e.requisites;
                    Button button3 = (Button) C6202b.m24689a(view, i);
                    if (button3 != null) {
                        i = C36271e.share;
                        Button button4 = (Button) C6202b.m24689a(view, i);
                        if (button4 != null) {
                            i = C36271e.statements;
                            Button button5 = (Button) C6202b.m24689a(view, i);
                            if (button5 != null) {
                                i = C36271e.top_up;
                                Button button6 = (Button) C6202b.m24689a(view, i);
                                if (button6 != null) {
                                    return new C36604i1((LayerView) view, button, button2, imageView, button3, button4, button5, button6);
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
    public static C36604i1 m108546d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C36272f.item_credit_card_operations_buttons, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m108545a(inflate);
    }

    /* renamed from: c */
    public LayerView mo3946b() {
        return this.f88270d;
    }
}
