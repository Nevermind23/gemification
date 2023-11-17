package ua1;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import ba1.C10216u;
import ba1.C10217v;
import p086g1.C6201a;
import p086g1.C6202b;
import p341ge.bog.designsystem.components.layersandshadows.LayerView;
import p341ge.bog.designsystem.components.list.ListItem;

/* renamed from: ua1.d1 */
public final class C28635d1 implements C6201a {

    /* renamed from: d */
    private final ListItem f72704d;

    /* renamed from: e */
    public final ImageView f72705e;

    /* renamed from: f */
    public final LayerView f72706f;

    /* renamed from: g */
    public final AppCompatTextView f72707g;

    /* renamed from: h */
    public final AppCompatImageView f72708h;

    /* renamed from: i */
    public final ListItem f72709i;

    private C28635d1(ListItem listItem, ImageView imageView, LayerView layerView, AppCompatTextView appCompatTextView, AppCompatImageView appCompatImageView, ListItem listItem2) {
        this.f72704d = listItem;
        this.f72705e = imageView;
        this.f72706f = layerView;
        this.f72707g = appCompatTextView;
        this.f72708h = appCompatImageView;
        this.f72709i = listItem2;
    }

    /* renamed from: a */
    public static C28635d1 m87638a(View view) {
        int i = C10216u.f28318b0;
        ImageView imageView = (ImageView) C6202b.m24689a(view, i);
        if (imageView != null) {
            i = C10216u.contact_icon_layer_view;
            LayerView layerView = (LayerView) C6202b.m24689a(view, i);
            if (layerView != null) {
                i = C10216u.contact_value;
                AppCompatTextView appCompatTextView = (AppCompatTextView) C6202b.m24689a(view, i);
                if (appCompatTextView != null) {
                    i = C10216u.contacts_tick;
                    AppCompatImageView appCompatImageView = (AppCompatImageView) C6202b.m24689a(view, i);
                    if (appCompatImageView != null) {
                        ListItem listItem = (ListItem) view;
                        return new C28635d1(listItem, imageView, layerView, appCompatTextView, appCompatImageView, listItem);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: d */
    public static C28635d1 m87639d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C10217v.item_contact_onboarding, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m87638a(inflate);
    }

    /* renamed from: c */
    public ListItem mo3946b() {
        return this.f72704d;
    }
}
