package th0;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import oh0.C27010e;
import oh0.C27011f;
import p086g1.C6201a;
import p086g1.C6202b;
import p341ge.bog.designsystem.components.emptywidget.EmptyWidget;
import p341ge.bog.designsystem.components.layersandshadows.LayerView;
import p341ge.bog.designsystem.components.textgroup.TextGroupView;

/* renamed from: th0.l0 */
public final class C28411l0 implements C6201a {

    /* renamed from: d */
    private final LayerView f72131d;

    /* renamed from: e */
    public final EmptyWidget f72132e;

    /* renamed from: f */
    public final LayerView f72133f;

    /* renamed from: g */
    public final LinearLayout f72134g;

    /* renamed from: h */
    public final TextGroupView f72135h;

    /* renamed from: i */
    public final TextGroupView f72136i;

    private C28411l0(LayerView layerView, EmptyWidget emptyWidget, LayerView layerView2, LinearLayout linearLayout, TextGroupView textGroupView, TextGroupView textGroupView2) {
        this.f72131d = layerView;
        this.f72132e = emptyWidget;
        this.f72133f = layerView2;
        this.f72134g = linearLayout;
        this.f72135h = textGroupView;
        this.f72136i = textGroupView2;
    }

    /* renamed from: a */
    public static C28411l0 m87165a(View view) {
        int i = C27010e.gift_card_empty_widget;
        EmptyWidget emptyWidget = (EmptyWidget) C6202b.m24689a(view, i);
        if (emptyWidget != null) {
            LayerView layerView = (LayerView) view;
            i = C27010e.text_group_container;
            LinearLayout linearLayout = (LinearLayout) C6202b.m24689a(view, i);
            if (linearLayout != null) {
                i = C27010e.tgRemainingAmount;
                TextGroupView textGroupView = (TextGroupView) C6202b.m24689a(view, i);
                if (textGroupView != null) {
                    i = C27010e.tgSpentAmount;
                    TextGroupView textGroupView2 = (TextGroupView) C6202b.m24689a(view, i);
                    if (textGroupView2 != null) {
                        return new C28411l0(layerView, emptyWidget, layerView, linearLayout, textGroupView, textGroupView2);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: d */
    public static C28411l0 m87166d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C27011f.item_gift_card_payment_history, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m87165a(inflate);
    }

    /* renamed from: c */
    public LayerView mo3946b() {
        return this.f72131d;
    }
}
