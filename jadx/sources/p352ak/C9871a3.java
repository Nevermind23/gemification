package p352ak;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import p086g1.C6201a;
import p086g1.C6202b;
import p341ge.bog.designsystem.components.layersandshadows.LayerView;
import p601sg.C17782g;
import p601sg.C17783h;

/* renamed from: ak.a3 */
public final class C9871a3 implements C6201a {

    /* renamed from: d */
    private final View f26754d;

    /* renamed from: e */
    public final ImageView f26755e;

    /* renamed from: f */
    public final LayerView f26756f;

    /* renamed from: g */
    public final TextView f26757g;

    /* renamed from: h */
    public final TextView f26758h;

    /* renamed from: i */
    public final TextView f26759i;

    /* renamed from: j */
    public final TextView f26760j;

    private C9871a3(View view, ImageView imageView, LayerView layerView, TextView textView, TextView textView2, TextView textView3, TextView textView4) {
        this.f26754d = view;
        this.f26755e = imageView;
        this.f26756f = layerView;
        this.f26757g = textView;
        this.f26758h = textView2;
        this.f26759i = textView3;
        this.f26760j = textView4;
    }

    /* renamed from: a */
    public static C9871a3 m36207a(View view) {
        int i = C17782g.f49766j4;
        ImageView imageView = (ImageView) C6202b.m24689a(view, i);
        if (imageView != null) {
            i = C17782g.f49749c5;
            LayerView layerView = (LayerView) C6202b.m24689a(view, i);
            if (layerView != null) {
                i = C17782g.f49756e5;
                TextView textView = (TextView) C6202b.m24689a(view, i);
                if (textView != null) {
                    i = C17782g.f49805v8;
                    TextView textView2 = (TextView) C6202b.m24689a(view, i);
                    if (textView2 != null) {
                        i = C17782g.f49809w8;
                        TextView textView3 = (TextView) C6202b.m24689a(view, i);
                        if (textView3 != null) {
                            i = C17782g.f49751c9;
                            TextView textView4 = (TextView) C6202b.m24689a(view, i);
                            if (textView4 != null) {
                                return new C9871a3(view, imageView, layerView, textView, textView2, textView3, textView4);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: c */
    public static C9871a3 m36208c(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (viewGroup != null) {
            layoutInflater.inflate(C17783h.view_deposit_card, viewGroup);
            return m36207a(viewGroup);
        }
        throw new NullPointerException("parent");
    }

    /* renamed from: b */
    public View mo3946b() {
        return this.f26754d;
    }
}
