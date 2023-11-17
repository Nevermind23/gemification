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

/* renamed from: ak.g6 */
public final class C9922g6 implements C6201a {

    /* renamed from: d */
    private final LayerView f27037d;

    /* renamed from: e */
    public final TextView f27038e;

    /* renamed from: f */
    public final TextView f27039f;

    /* renamed from: g */
    public final TextView f27040g;

    /* renamed from: h */
    public final TextView f27041h;

    /* renamed from: i */
    public final ImageView f27042i;

    /* renamed from: j */
    public final LinearLayout f27043j;

    /* renamed from: k */
    public final TextView f27044k;

    /* renamed from: l */
    public final TextView f27045l;

    /* renamed from: m */
    public final TextView f27046m;

    /* renamed from: n */
    public final TextView f27047n;

    private C9922g6(LayerView layerView, TextView textView, TextView textView2, TextView textView3, TextView textView4, ImageView imageView, LinearLayout linearLayout, TextView textView5, TextView textView6, TextView textView7, TextView textView8) {
        this.f27037d = layerView;
        this.f27038e = textView;
        this.f27039f = textView2;
        this.f27040g = textView3;
        this.f27041h = textView4;
        this.f27042i = imageView;
        this.f27043j = linearLayout;
        this.f27044k = textView5;
        this.f27045l = textView6;
        this.f27046m = textView7;
        this.f27047n = textView8;
    }

    /* renamed from: a */
    public static C9922g6 m36394a(View view) {
        int i = C17782g.bottomLeftText;
        TextView textView = (TextView) C6202b.m24689a(view, i);
        if (textView != null) {
            i = C17782g.bottomLeftTitle;
            TextView textView2 = (TextView) C6202b.m24689a(view, i);
            if (textView2 != null) {
                i = C17782g.bottomRightText;
                TextView textView3 = (TextView) C6202b.m24689a(view, i);
                if (textView3 != null) {
                    i = C17782g.bottomRightTitle;
                    TextView textView4 = (TextView) C6202b.m24689a(view, i);
                    if (textView4 != null) {
                        i = C17782g.f49744Y3;
                        ImageView imageView = (ImageView) C6202b.m24689a(view, i);
                        if (imageView != null) {
                            i = C17782g.topLeft;
                            LinearLayout linearLayout = (LinearLayout) C6202b.m24689a(view, i);
                            if (linearLayout != null) {
                                i = C17782g.topLeftText;
                                TextView textView5 = (TextView) C6202b.m24689a(view, i);
                                if (textView5 != null) {
                                    i = C17782g.topLeftTitle;
                                    TextView textView6 = (TextView) C6202b.m24689a(view, i);
                                    if (textView6 != null) {
                                        i = C17782g.topRightText;
                                        TextView textView7 = (TextView) C6202b.m24689a(view, i);
                                        if (textView7 != null) {
                                            i = C17782g.topRightTitle;
                                            TextView textView8 = (TextView) C6202b.m24689a(view, i);
                                            if (textView8 != null) {
                                                return new C9922g6((LayerView) view, textView, textView2, textView3, textView4, imageView, linearLayout, textView5, textView6, textView7, textView8);
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
    public static C9922g6 m36395d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C17783h.view_thumbnail_group_text, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m36394a(inflate);
    }

    /* renamed from: c */
    public LayerView mo3946b() {
        return this.f27037d;
    }
}
