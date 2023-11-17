package g71;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import c71.C31284d;
import c71.C31285e;
import p086g1.C6201a;
import p086g1.C6202b;
import p341ge.bog.designsystem.components.layersandshadows.LayerView;
import p341ge.bog.designsystem.components.list.ListItem;
import p341ge.bog.mobilebank.p975ui.views.widgets.BogImageView;

/* renamed from: g71.n */
public final class C32121n implements C6201a {

    /* renamed from: d */
    private final ListItem f79060d;

    /* renamed from: e */
    public final LayerView f79061e;

    /* renamed from: f */
    public final ImageView f79062f;

    /* renamed from: g */
    public final BogImageView f79063g;

    /* renamed from: h */
    public final TextView f79064h;

    /* renamed from: i */
    public final TextView f79065i;

    private C32121n(ListItem listItem, LayerView layerView, ImageView imageView, BogImageView bogImageView, TextView textView, TextView textView2) {
        this.f79060d = listItem;
        this.f79061e = layerView;
        this.f79062f = imageView;
        this.f79063g = bogImageView;
        this.f79064h = textView;
        this.f79065i = textView2;
    }

    /* renamed from: a */
    public static C32121n m94618a(View view) {
        int i = C31284d.f77696B;
        LayerView layerView = (LayerView) C6202b.m24689a(view, i);
        if (layerView != null) {
            i = C31284d.tc_pass_device_icon;
            ImageView imageView = (ImageView) C6202b.m24689a(view, i);
            if (imageView != null) {
                i = C31284d.tc_pass_device_is_selected_icon;
                BogImageView bogImageView = (BogImageView) C6202b.m24689a(view, i);
                if (bogImageView != null) {
                    i = C31284d.tc_pass_device_name;
                    TextView textView = (TextView) C6202b.m24689a(view, i);
                    if (textView != null) {
                        i = C31284d.tc_pass_device_title;
                        TextView textView2 = (TextView) C6202b.m24689a(view, i);
                        if (textView2 != null) {
                            return new C32121n((ListItem) view, layerView, imageView, bogImageView, textView, textView2);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: d */
    public static C32121n m94619d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C31285e.transport_card_pass_device_recycler_item, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m94618a(inflate);
    }

    /* renamed from: c */
    public ListItem mo3946b() {
        return this.f79060d;
    }
}
