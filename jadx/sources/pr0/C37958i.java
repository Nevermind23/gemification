package pr0;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import lr0.C37130e;
import lr0.C37131f;
import p086g1.C6201a;
import p086g1.C6202b;
import p341ge.bog.designsystem.components.emptywidget.EmptyWidget;
import p341ge.bog.designsystem.components.layersandshadows.LayerView;

/* renamed from: pr0.i */
public final class C37958i implements C6201a {

    /* renamed from: d */
    private final LayerView f91211d;

    /* renamed from: e */
    public final TextView f91212e;

    /* renamed from: f */
    public final TextView f91213f;

    /* renamed from: g */
    public final EmptyWidget f91214g;

    /* renamed from: h */
    public final LayerView f91215h;

    /* renamed from: i */
    public final ImageView f91216i;

    /* renamed from: j */
    public final TextView f91217j;

    /* renamed from: k */
    public final TextView f91218k;

    private C37958i(LayerView layerView, TextView textView, TextView textView2, EmptyWidget emptyWidget, LayerView layerView2, ImageView imageView, TextView textView3, TextView textView4) {
        this.f91211d = layerView;
        this.f91212e = textView;
        this.f91213f = textView2;
        this.f91214g = emptyWidget;
        this.f91215h = layerView2;
        this.f91216i = imageView;
        this.f91217j = textView3;
        this.f91218k = textView4;
    }

    /* renamed from: a */
    public static C37958i m111577a(View view) {
        int i = C37130e.f89413A;
        TextView textView = (TextView) C6202b.m24689a(view, i);
        if (textView != null) {
            i = C37130e.f89414B;
            TextView textView2 = (TextView) C6202b.m24689a(view, i);
            if (textView2 != null) {
                i = C37130e.f89425L;
                EmptyWidget emptyWidget = (EmptyWidget) C6202b.m24689a(view, i);
                if (emptyWidget != null) {
                    i = C37130e.f89426M;
                    LayerView layerView = (LayerView) C6202b.m24689a(view, i);
                    if (layerView != null) {
                        i = C37130e.info_icon;
                        ImageView imageView = (ImageView) C6202b.m24689a(view, i);
                        if (imageView != null) {
                            i = C37130e.interest_rate;
                            TextView textView3 = (TextView) C6202b.m24689a(view, i);
                            if (textView3 != null) {
                                i = C37130e.interest_rate_title;
                                TextView textView4 = (TextView) C6202b.m24689a(view, i);
                                if (textView4 != null) {
                                    return new C37958i((LayerView) view, textView, textView2, emptyWidget, layerView, imageView, textView3, textView4);
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
    public static C37958i m111578d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C37131f.item_info_box, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m111577a(inflate);
    }

    /* renamed from: c */
    public LayerView mo3946b() {
        return this.f91211d;
    }
}
