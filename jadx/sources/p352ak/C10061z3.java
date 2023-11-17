package p352ak;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import p086g1.C6201a;
import p086g1.C6202b;
import p341ge.bog.designsystem.components.layersandshadows.LayerView;
import p601sg.C17782g;
import p601sg.C17783h;

/* renamed from: ak.z3 */
public final class C10061z3 implements C6201a {

    /* renamed from: d */
    private final LinearLayout f27812d;

    /* renamed from: e */
    public final ImageView f27813e;

    /* renamed from: f */
    public final LayerView f27814f;

    /* renamed from: g */
    public final TextView f27815g;

    /* renamed from: h */
    public final TextView f27816h;

    private C10061z3(LinearLayout linearLayout, ImageView imageView, LayerView layerView, TextView textView, TextView textView2) {
        this.f27812d = linearLayout;
        this.f27813e = imageView;
        this.f27814f = layerView;
        this.f27815g = textView;
        this.f27816h = textView2;
    }

    /* renamed from: a */
    public static C10061z3 m36903a(View view) {
        int i = C17782g.f49744Y3;
        ImageView imageView = (ImageView) C6202b.m24689a(view, i);
        if (imageView != null) {
            i = C17782g.icon_layer;
            LayerView layerView = (LayerView) C6202b.m24689a(view, i);
            if (layerView != null) {
                i = C17782g.f49816z8;
                TextView textView = (TextView) C6202b.m24689a(view, i);
                if (textView != null) {
                    i = C17782g.f49745Y8;
                    TextView textView2 = (TextView) C6202b.m24689a(view, i);
                    if (textView2 != null) {
                        return new C10061z3((LinearLayout) view, imageView, layerView, textView, textView2);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: d */
    public static C10061z3 m36904d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C17783h.view_media_text, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m36903a(inflate);
    }

    /* renamed from: c */
    public LinearLayout mo3946b() {
        return this.f27812d;
    }
}
