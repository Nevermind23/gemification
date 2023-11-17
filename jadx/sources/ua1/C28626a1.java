package ua1;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import ba1.C10216u;
import ba1.C10217v;
import p086g1.C6201a;
import p086g1.C6202b;
import p341ge.bog.designsystem.components.layersandshadows.LayerView;
import p341ge.bog.designsystem.components.list.ListItem;
import p341ge.bog.designsystem.components.list.TwoLineTextItem;
import p341ge.bog.designsystem.components.radiobutton.RadioButtonView;

/* renamed from: ua1.a1 */
public final class C28626a1 implements C6201a {

    /* renamed from: d */
    private final ListItem f72648d;

    /* renamed from: e */
    public final ImageView f72649e;

    /* renamed from: f */
    public final LayerView f72650f;

    /* renamed from: g */
    public final TwoLineTextItem f72651g;

    /* renamed from: h */
    public final RadioButtonView f72652h;

    /* renamed from: i */
    public final ListItem f72653i;

    private C28626a1(ListItem listItem, ImageView imageView, LayerView layerView, TwoLineTextItem twoLineTextItem, RadioButtonView radioButtonView, ListItem listItem2) {
        this.f72648d = listItem;
        this.f72649e = imageView;
        this.f72650f = layerView;
        this.f72651g = twoLineTextItem;
        this.f72652h = radioButtonView;
        this.f72653i = listItem2;
    }

    /* renamed from: a */
    public static C28626a1 m87599a(View view) {
        int i = C10216u.f28318b0;
        ImageView imageView = (ImageView) C6202b.m24689a(view, i);
        if (imageView != null) {
            i = C10216u.contact_icon_layer_view;
            LayerView layerView = (LayerView) C6202b.m24689a(view, i);
            if (layerView != null) {
                i = C10216u.contact_lines;
                TwoLineTextItem twoLineTextItem = (TwoLineTextItem) C6202b.m24689a(view, i);
                if (twoLineTextItem != null) {
                    i = C10216u.contacts_radio;
                    RadioButtonView radioButtonView = (RadioButtonView) C6202b.m24689a(view, i);
                    if (radioButtonView != null) {
                        ListItem listItem = (ListItem) view;
                        return new C28626a1(listItem, imageView, layerView, twoLineTextItem, radioButtonView, listItem);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: d */
    public static C28626a1 m87600d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C10217v.item_contact, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m87599a(inflate);
    }

    /* renamed from: c */
    public ListItem mo3946b() {
        return this.f72648d;
    }
}
