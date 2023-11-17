package p376cg;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import p086g1.C6201a;
import p086g1.C6202b;
import p341ge.bog.designsystem.components.layersandshadows.LayerView;
import p653wf.C18588q;
import p653wf.C18589r;

/* renamed from: cg.l */
public final class C10433l implements C6201a {

    /* renamed from: d */
    private final LayerView f29705d;

    /* renamed from: e */
    public final LinearLayout f29706e;

    /* renamed from: f */
    public final ImageView f29707f;

    /* renamed from: g */
    public final LinearLayout f29708g;

    /* renamed from: h */
    public final AppCompatTextView f29709h;

    /* renamed from: i */
    public final LayerView f29710i;

    /* renamed from: j */
    public final TextView f29711j;

    /* renamed from: k */
    public final TextView f29712k;

    /* renamed from: l */
    public final TextView f29713l;

    /* renamed from: m */
    public final TextView f29714m;

    private C10433l(LayerView layerView, LinearLayout linearLayout, ImageView imageView, LinearLayout linearLayout2, AppCompatTextView appCompatTextView, LayerView layerView2, TextView textView, TextView textView2, TextView textView3, TextView textView4) {
        this.f29705d = layerView;
        this.f29706e = linearLayout;
        this.f29707f = imageView;
        this.f29708g = linearLayout2;
        this.f29709h = appCompatTextView;
        this.f29710i = layerView2;
        this.f29711j = textView;
        this.f29712k = textView2;
        this.f29713l = textView3;
        this.f29714m = textView4;
    }

    /* renamed from: a */
    public static C10433l m37896a(View view) {
        int i = C18588q.features;
        LinearLayout linearLayout = (LinearLayout) C6202b.m24689a(view, i);
        if (linearLayout != null) {
            i = C18588q.f52153J;
            ImageView imageView = (ImageView) C6202b.m24689a(view, i);
            if (imageView != null) {
                i = C18588q.info_layer;
                LinearLayout linearLayout2 = (LinearLayout) C6202b.m24689a(view, i);
                if (linearLayout2 != null) {
                    i = C18588q.f52154N;
                    AppCompatTextView appCompatTextView = (AppCompatTextView) C6202b.m24689a(view, i);
                    if (appCompatTextView != null) {
                        i = C18588q.f52156P;
                        LayerView layerView = (LayerView) C6202b.m24689a(view, i);
                        if (layerView != null) {
                            i = C18588q.f52157Q;
                            TextView textView = (TextView) C6202b.m24689a(view, i);
                            if (textView != null) {
                                i = C18588q.f52172x0;
                                TextView textView2 = (TextView) C6202b.m24689a(view, i);
                                if (textView2 != null) {
                                    i = C18588q.f52173y0;
                                    TextView textView3 = (TextView) C6202b.m24689a(view, i);
                                    if (textView3 != null) {
                                        i = C18588q.f52147A0;
                                        TextView textView4 = (TextView) C6202b.m24689a(view, i);
                                        if (textView4 != null) {
                                            return new C10433l((LayerView) view, linearLayout, imageView, linearLayout2, appCompatTextView, layerView, textView, textView2, textView3, textView4);
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
    public static C10433l m37897d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C18589r.item_product_slider, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m37896a(inflate);
    }

    /* renamed from: c */
    public LayerView mo3946b() {
        return this.f29705d;
    }
}
