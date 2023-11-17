package xb0;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageView;
import p086g1.C6201a;
import p086g1.C6202b;
import p341ge.bog.designsystem.components.layersandshadows.LayerView;
import p341ge.bog.designsystem.components.list.ListItem;
import p341ge.bog.designsystem.components.list.SingleLineTextItem;
import rb0.C27985d;
import rb0.C27986e;

/* renamed from: xb0.p */
public final class C29728p implements C6201a {

    /* renamed from: d */
    private final ListItem f75129d;

    /* renamed from: e */
    public final SingleLineTextItem f75130e;

    /* renamed from: f */
    public final AppCompatImageView f75131f;

    /* renamed from: g */
    public final LayerView f75132g;

    private C29728p(ListItem listItem, SingleLineTextItem singleLineTextItem, AppCompatImageView appCompatImageView, LayerView layerView) {
        this.f75129d = listItem;
        this.f75130e = singleLineTextItem;
        this.f75131f = appCompatImageView;
        this.f75132g = layerView;
    }

    /* renamed from: a */
    public static C29728p m90277a(View view) {
        int i = C27985d.f71278f;
        SingleLineTextItem singleLineTextItem = (SingleLineTextItem) C6202b.m24689a(view, i);
        if (singleLineTextItem != null) {
            i = C27985d.f71286l0;
            AppCompatImageView appCompatImageView = (AppCompatImageView) C6202b.m24689a(view, i);
            if (appCompatImageView != null) {
                i = C27985d.icon_container_layer;
                LayerView layerView = (LayerView) C6202b.m24689a(view, i);
                if (layerView != null) {
                    return new C29728p((ListItem) view, singleLineTextItem, appCompatImageView, layerView);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: d */
    public static C29728p m90278d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C27986e.item_deposit_break_action, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m90277a(inflate);
    }

    /* renamed from: c */
    public ListItem mo3946b() {
        return this.f75129d;
    }
}
