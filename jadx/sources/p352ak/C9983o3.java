package p352ak;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import p086g1.C6201a;
import p086g1.C6202b;
import p341ge.bog.designsystem.components.buttons.Button;
import p341ge.bog.designsystem.components.layersandshadows.LayerView;
import p601sg.C17782g;
import p601sg.C17783h;

/* renamed from: ak.o3 */
public final class C9983o3 implements C6201a {

    /* renamed from: d */
    private final LinearLayout f27358d;

    /* renamed from: e */
    public final LinearLayout f27359e;

    /* renamed from: f */
    public final LayerView f27360f;

    /* renamed from: g */
    public final TextView f27361g;

    /* renamed from: h */
    public final LayerView f27362h;

    /* renamed from: i */
    public final TextView f27363i;

    /* renamed from: j */
    public final Button f27364j;

    /* renamed from: k */
    public final ImageView f27365k;

    /* renamed from: l */
    public final TextView f27366l;

    private C9983o3(LinearLayout linearLayout, LinearLayout linearLayout2, LayerView layerView, TextView textView, LayerView layerView2, TextView textView2, Button button, ImageView imageView, TextView textView3) {
        this.f27358d = linearLayout;
        this.f27359e = linearLayout2;
        this.f27360f = layerView;
        this.f27361g = textView;
        this.f27362h = layerView2;
        this.f27363i = textView2;
        this.f27364j = button;
        this.f27365k = imageView;
        this.f27366l = textView3;
    }

    /* renamed from: a */
    public static C9983o3 m36614a(View view) {
        LinearLayout linearLayout = (LinearLayout) view;
        int i = C17782g.f49680D0;
        LayerView layerView = (LayerView) C6202b.m24689a(view, i);
        if (layerView != null) {
            i = C17782g.f49709N0;
            TextView textView = (TextView) C6202b.m24689a(view, i);
            if (textView != null) {
                i = C17782g.f49710N1;
                LayerView layerView2 = (LayerView) C6202b.m24689a(view, i);
                if (layerView2 != null) {
                    i = C17782g.f49677C2;
                    TextView textView2 = (TextView) C6202b.m24689a(view, i);
                    if (textView2 != null) {
                        i = C17782g.description_button;
                        Button button = (Button) C6202b.m24689a(view, i);
                        if (button != null) {
                            i = C17782g.f49744Y3;
                            ImageView imageView = (ImageView) C6202b.m24689a(view, i);
                            if (imageView != null) {
                                i = C17782g.f49745Y8;
                                TextView textView3 = (TextView) C6202b.m24689a(view, i);
                                if (textView3 != null) {
                                    return new C9983o3(linearLayout, linearLayout, layerView, textView, layerView2, textView2, button, imageView, textView3);
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
    public static C9983o3 m36615d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C17783h.view_inline_feedback_2, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m36614a(inflate);
    }

    /* renamed from: c */
    public LinearLayout mo3946b() {
        return this.f27358d;
    }
}
