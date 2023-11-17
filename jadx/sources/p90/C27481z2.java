package p90;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import p086g1.C6201a;
import p086g1.C6202b;
import p341ge.bog.designsystem.components.layersandshadows.LayerView;
import p366bk.C10322k;
import p366bk.C10324m;

/* renamed from: p90.z2 */
public final class C27481z2 implements C6201a {

    /* renamed from: d */
    private final LayerView f70335d;

    /* renamed from: e */
    public final FrameLayout f70336e;

    /* renamed from: f */
    public final LayerView f70337f;

    /* renamed from: g */
    public final TextView f70338g;

    /* renamed from: h */
    public final ImageView f70339h;

    /* renamed from: i */
    public final TextView f70340i;

    /* renamed from: j */
    public final TextView f70341j;

    /* renamed from: k */
    public final TextView f70342k;

    private C27481z2(LayerView layerView, FrameLayout frameLayout, LayerView layerView2, TextView textView, ImageView imageView, TextView textView2, TextView textView3, TextView textView4) {
        this.f70335d = layerView;
        this.f70336e = frameLayout;
        this.f70337f = layerView2;
        this.f70338g = textView;
        this.f70339h = imageView;
        this.f70340i = textView2;
        this.f70341j = textView3;
        this.f70342k = textView4;
    }

    /* renamed from: a */
    public static C27481z2 m85229a(View view) {
        int i = C10322k.button_no;
        FrameLayout frameLayout = (FrameLayout) C6202b.m24689a(view, i);
        if (frameLayout != null) {
            i = C10322k.button_yes;
            LayerView layerView = (LayerView) C6202b.m24689a(view, i);
            if (layerView != null) {
                i = C10322k.f28833fb;
                TextView textView = (TextView) C6202b.m24689a(view, i);
                if (textView != null) {
                    i = C10322k.main_image;
                    ImageView imageView = (ImageView) C6202b.m24689a(view, i);
                    if (imageView != null) {
                        i = C10322k.no_button_tv;
                        TextView textView2 = (TextView) C6202b.m24689a(view, i);
                        if (textView2 != null) {
                            i = C10322k.f28721Dx;
                            TextView textView3 = (TextView) C6202b.m24689a(view, i);
                            if (textView3 != null) {
                                i = C10322k.yes_button_tv;
                                TextView textView4 = (TextView) C6202b.m24689a(view, i);
                                if (textView4 != null) {
                                    return new C27481z2((LayerView) view, frameLayout, layerView, textView, imageView, textView2, textView3, textView4);
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
    public static C27481z2 m85230d(LayoutInflater layoutInflater) {
        return m85231e(layoutInflater, (ViewGroup) null, false);
    }

    /* renamed from: e */
    public static C27481z2 m85231e(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C10324m.dialog_fragment_referrals_popup, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m85229a(inflate);
    }

    /* renamed from: c */
    public LayerView mo3946b() {
        return this.f70335d;
    }
}
