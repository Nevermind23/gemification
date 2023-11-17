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
import p341ge.bog.designsystem.components.buttons.Button;
import p341ge.bog.designsystem.components.emptywidget.EmptyWidget;
import p341ge.bog.designsystem.components.layersandshadows.LayerView;
import p341ge.bog.designsystem.components.list.TwoLineReverseTextItem;

/* renamed from: pr0.x */
public final class C37973x implements C6201a {

    /* renamed from: d */
    private final LayerView f91272d;

    /* renamed from: e */
    public final TextView f91273e;

    /* renamed from: f */
    public final TextView f91274f;

    /* renamed from: g */
    public final Button f91275g;

    /* renamed from: h */
    public final TwoLineReverseTextItem f91276h;

    /* renamed from: i */
    public final ImageView f91277i;

    /* renamed from: j */
    public final EmptyWidget f91278j;

    private C37973x(LayerView layerView, TextView textView, TextView textView2, Button button, TwoLineReverseTextItem twoLineReverseTextItem, ImageView imageView, EmptyWidget emptyWidget) {
        this.f91272d = layerView;
        this.f91273e = textView;
        this.f91274f = textView2;
        this.f91275g = button;
        this.f91276h = twoLineReverseTextItem;
        this.f91277i = imageView;
        this.f91278j = emptyWidget;
    }

    /* renamed from: a */
    public static C37973x m111637a(View view) {
        int i = C37130e.amount_hint;
        TextView textView = (TextView) C6202b.m24689a(view, i);
        if (textView != null) {
            i = C37130e.f89435m;
            TextView textView2 = (TextView) C6202b.m24689a(view, i);
            if (textView2 != null) {
                i = C37130e.f89416C;
                Button button = (Button) C6202b.m24689a(view, i);
                if (button != null) {
                    i = C37130e.f89427N;
                    TwoLineReverseTextItem twoLineReverseTextItem = (TwoLineReverseTextItem) C6202b.m24689a(view, i);
                    if (twoLineReverseTextItem != null) {
                        i = C37130e.loan_start_icon_image;
                        ImageView imageView = (ImageView) C6202b.m24689a(view, i);
                        if (imageView != null) {
                            i = C37130e.f89449v1;
                            EmptyWidget emptyWidget = (EmptyWidget) C6202b.m24689a(view, i);
                            if (emptyWidget != null) {
                                return new C37973x((LayerView) view, textView, textView2, button, twoLineReverseTextItem, imageView, emptyWidget);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: d */
    public static C37973x m111638d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C37131f.item_pln_history, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m111637a(inflate);
    }

    /* renamed from: c */
    public LayerView mo3946b() {
        return this.f91272d;
    }
}
