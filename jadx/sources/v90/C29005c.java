package v90;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import p086g1.C6201a;
import p086g1.C6202b;
import p341ge.bog.designsystem.components.layersandshadows.LayerView;
import p341ge.bog.designsystem.components.list.SingleLineTextItem;
import p341ge.bog.designsystem.components.list.TwoLineReverseTextItem;
import s90.C28164b;
import s90.C28165c;

/* renamed from: v90.c */
public final class C29005c implements C6201a {

    /* renamed from: d */
    private final LayerView f73961d;

    /* renamed from: e */
    public final LayerView f73962e;

    /* renamed from: f */
    public final ImageView f73963f;

    /* renamed from: g */
    public final LayerView f73964g;

    /* renamed from: h */
    public final TwoLineReverseTextItem f73965h;

    /* renamed from: i */
    public final SingleLineTextItem f73966i;

    /* renamed from: j */
    public final TwoLineReverseTextItem f73967j;

    /* renamed from: k */
    public final SingleLineTextItem f73968k;

    private C29005c(LayerView layerView, LayerView layerView2, ImageView imageView, LayerView layerView3, TwoLineReverseTextItem twoLineReverseTextItem, SingleLineTextItem singleLineTextItem, TwoLineReverseTextItem twoLineReverseTextItem2, SingleLineTextItem singleLineTextItem2) {
        this.f73961d = layerView;
        this.f73962e = layerView2;
        this.f73963f = imageView;
        this.f73964g = layerView3;
        this.f73965h = twoLineReverseTextItem;
        this.f73966i = singleLineTextItem;
        this.f73967j = twoLineReverseTextItem2;
        this.f73968k = singleLineTextItem2;
    }

    /* renamed from: a */
    public static C29005c m88745a(View view) {
        LayerView layerView = (LayerView) view;
        int i = C28164b.f71511i;
        ImageView imageView = (ImageView) C6202b.m24689a(view, i);
        if (imageView != null) {
            i = C28164b.f71512j;
            LayerView layerView2 = (LayerView) C6202b.m24689a(view, i);
            if (layerView2 != null) {
                i = C28164b.f71513k;
                TwoLineReverseTextItem twoLineReverseTextItem = (TwoLineReverseTextItem) C6202b.m24689a(view, i);
                if (twoLineReverseTextItem != null) {
                    i = C28164b.left_text_single_line;
                    SingleLineTextItem singleLineTextItem = (SingleLineTextItem) C6202b.m24689a(view, i);
                    if (singleLineTextItem != null) {
                        i = C28164b.f71516o;
                        TwoLineReverseTextItem twoLineReverseTextItem2 = (TwoLineReverseTextItem) C6202b.m24689a(view, i);
                        if (twoLineReverseTextItem2 != null) {
                            i = C28164b.right_text_single_line;
                            SingleLineTextItem singleLineTextItem2 = (SingleLineTextItem) C6202b.m24689a(view, i);
                            if (singleLineTextItem2 != null) {
                                return new C29005c(layerView, layerView, imageView, layerView2, twoLineReverseTextItem, singleLineTextItem, twoLineReverseTextItem2, singleLineTextItem2);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: d */
    public static C29005c m88746d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C28165c.item_ddsto_intro, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m88745a(inflate);
    }

    /* renamed from: c */
    public LayerView mo3946b() {
        return this.f73961d;
    }
}
