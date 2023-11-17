package th0;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageView;
import oh0.C27010e;
import oh0.C27011f;
import p086g1.C6201a;
import p086g1.C6202b;
import p341ge.bog.designsystem.components.layersandshadows.LayerView;
import p341ge.bog.designsystem.components.list.ListItem;
import p341ge.bog.designsystem.components.list.TwoLineTextItem;

/* renamed from: th0.t0 */
public final class C28427t0 implements C6201a {

    /* renamed from: d */
    private final ListItem f72210d;

    /* renamed from: e */
    public final TwoLineTextItem f72211e;

    /* renamed from: f */
    public final LayerView f72212f;

    /* renamed from: g */
    public final AppCompatImageView f72213g;

    /* renamed from: h */
    public final ListItem f72214h;

    private C28427t0(ListItem listItem, TwoLineTextItem twoLineTextItem, LayerView layerView, AppCompatImageView appCompatImageView, ListItem listItem2) {
        this.f72210d = listItem;
        this.f72211e = twoLineTextItem;
        this.f72212f = layerView;
        this.f72213g = appCompatImageView;
        this.f72214h = listItem2;
    }

    /* renamed from: a */
    public static C28427t0 m87229a(View view) {
        int i = C27010e.f67803K;
        TwoLineTextItem twoLineTextItem = (TwoLineTextItem) C6202b.m24689a(view, i);
        if (twoLineTextItem != null) {
            i = C27010e.contacts_image_view_layer_container;
            LayerView layerView = (LayerView) C6202b.m24689a(view, i);
            if (layerView != null) {
                i = C27010e.phone_contact_image_view;
                AppCompatImageView appCompatImageView = (AppCompatImageView) C6202b.m24689a(view, i);
                if (appCompatImageView != null) {
                    ListItem listItem = (ListItem) view;
                    return new C28427t0(listItem, twoLineTextItem, layerView, appCompatImageView, listItem);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: d */
    public static C28427t0 m87230d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C27011f.item_phone_contacts, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m87229a(inflate);
    }

    /* renamed from: c */
    public ListItem mo3946b() {
        return this.f72210d;
    }
}
