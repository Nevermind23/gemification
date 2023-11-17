package ev0;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import bv0.C31204d;
import bv0.C31205e;
import p086g1.C6201a;
import p086g1.C6202b;
import p341ge.bog.designsystem.components.layersandshadows.LayerView;
import p341ge.bog.designsystem.components.list.ListItem;

/* renamed from: ev0.b0 */
public final class C31818b0 implements C6201a {

    /* renamed from: d */
    private final ListItem f78456d;

    /* renamed from: e */
    public final ListItem f78457e;

    /* renamed from: f */
    public final ImageView f78458f;

    /* renamed from: g */
    public final LayerView f78459g;

    /* renamed from: h */
    public final TextView f78460h;

    private C31818b0(ListItem listItem, ListItem listItem2, ImageView imageView, LayerView layerView, TextView textView) {
        this.f78456d = listItem;
        this.f78457e = listItem2;
        this.f78458f = imageView;
        this.f78459g = layerView;
        this.f78460h = textView;
    }

    /* renamed from: a */
    public static C31818b0 m94057a(View view) {
        ListItem listItem = (ListItem) view;
        int i = C31204d.setting_item_image;
        ImageView imageView = (ImageView) C6202b.m24689a(view, i);
        if (imageView != null) {
            i = C31204d.setting_item_image_bg;
            LayerView layerView = (LayerView) C6202b.m24689a(view, i);
            if (layerView != null) {
                i = C31204d.setting_item_title;
                TextView textView = (TextView) C6202b.m24689a(view, i);
                if (textView != null) {
                    return new C31818b0(listItem, listItem, imageView, layerView, textView);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: d */
    public static C31818b0 m94058d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C31205e.item_product_setting, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m94057a(inflate);
    }

    /* renamed from: c */
    public ListItem mo3946b() {
        return this.f78456d;
    }
}
