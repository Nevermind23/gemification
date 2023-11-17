package vt0;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageView;
import p086g1.C6201a;
import p086g1.C6202b;
import p341ge.bog.designsystem.components.layersandshadows.LayerView;
import p341ge.bog.designsystem.components.list.ListItem;
import p341ge.bog.designsystem.components.list.TwoLineTextItem;
import rt0.C38341c;
import rt0.C38342d;

/* renamed from: vt0.e */
public final class C39468e implements C6201a {

    /* renamed from: d */
    private final ListItem f93895d;

    /* renamed from: e */
    public final LayerView f93896e;

    /* renamed from: f */
    public final AppCompatImageView f93897f;

    /* renamed from: g */
    public final TwoLineTextItem f93898g;

    private C39468e(ListItem listItem, LayerView layerView, AppCompatImageView appCompatImageView, TwoLineTextItem twoLineTextItem) {
        this.f93895d = listItem;
        this.f93896e = layerView;
        this.f93897f = appCompatImageView;
        this.f93898g = twoLineTextItem;
    }

    /* renamed from: a */
    public static C39468e m114728a(View view) {
        int i = C38341c.benef_icon_layer;
        LayerView layerView = (LayerView) C6202b.m24689a(view, i);
        if (layerView != null) {
            i = C38341c.preference_image;
            AppCompatImageView appCompatImageView = (AppCompatImageView) C6202b.m24689a(view, i);
            if (appCompatImageView != null) {
                i = C38341c.preference_texts;
                TwoLineTextItem twoLineTextItem = (TwoLineTextItem) C6202b.m24689a(view, i);
                if (twoLineTextItem != null) {
                    return new C39468e((ListItem) view, layerView, appCompatImageView, twoLineTextItem);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: d */
    public static C39468e m114729d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C38342d.item_benefits_list, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m114728a(inflate);
    }

    /* renamed from: c */
    public ListItem mo3946b() {
        return this.f93895d;
    }
}
