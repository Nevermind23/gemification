package xb0;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import p086g1.C6201a;
import p086g1.C6202b;
import p341ge.bog.designsystem.components.layersandshadows.LayerView;
import p341ge.bog.designsystem.components.list.ListItem;
import p341ge.bog.designsystem.components.list.SingleLineTextItem;
import rb0.C27985d;
import rb0.C27986e;

/* renamed from: xb0.n */
public final class C29726n implements C6201a {

    /* renamed from: d */
    private final ListItem f75122d;

    /* renamed from: e */
    public final AppCompatImageView f75123e;

    /* renamed from: f */
    public final LayerView f75124f;

    /* renamed from: g */
    public final AppCompatTextView f75125g;

    /* renamed from: h */
    public final SingleLineTextItem f75126h;

    private C29726n(ListItem listItem, AppCompatImageView appCompatImageView, LayerView layerView, AppCompatTextView appCompatTextView, SingleLineTextItem singleLineTextItem) {
        this.f75122d = listItem;
        this.f75123e = appCompatImageView;
        this.f75124f = layerView;
        this.f75125g = appCompatTextView;
        this.f75126h = singleLineTextItem;
    }

    /* renamed from: a */
    public static C29726n m90269a(View view) {
        int i = C27985d.f71286l0;
        AppCompatImageView appCompatImageView = (AppCompatImageView) C6202b.m24689a(view, i);
        if (appCompatImageView != null) {
            i = C27985d.icon_container_layer;
            LayerView layerView = (LayerView) C6202b.m24689a(view, i);
            if (layerView != null) {
                i = C27985d.f71268R0;
                AppCompatTextView appCompatTextView = (AppCompatTextView) C6202b.m24689a(view, i);
                if (appCompatTextView != null) {
                    i = C27985d.single_text;
                    SingleLineTextItem singleLineTextItem = (SingleLineTextItem) C6202b.m24689a(view, i);
                    if (singleLineTextItem != null) {
                        return new C29726n((ListItem) view, appCompatImageView, layerView, appCompatTextView, singleLineTextItem);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: d */
    public static C29726n m90270d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C27986e.item_deposit_additional_function_section, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m90269a(inflate);
    }

    /* renamed from: c */
    public ListItem mo3946b() {
        return this.f75122d;
    }
}
