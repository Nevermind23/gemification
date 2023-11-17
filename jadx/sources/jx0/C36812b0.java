package jx0;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import fx0.C32024d;
import fx0.C32025e;
import p086g1.C6201a;
import p086g1.C6202b;
import p341ge.bog.designsystem.components.list.ListItem;
import p341ge.bog.designsystem.components.list.SingleLineTextItem;

/* renamed from: jx0.b0 */
public final class C36812b0 implements C6201a {

    /* renamed from: d */
    private final ListItem f88802d;

    /* renamed from: e */
    public final ImageView f88803e;

    /* renamed from: f */
    public final SingleLineTextItem f88804f;

    private C36812b0(ListItem listItem, ImageView imageView, SingleLineTextItem singleLineTextItem) {
        this.f88802d = listItem;
        this.f88803e = imageView;
        this.f88804f = singleLineTextItem;
    }

    /* renamed from: a */
    public static C36812b0 m109060a(View view) {
        int i = C32024d.icon_selected;
        ImageView imageView = (ImageView) C6202b.m24689a(view, i);
        if (imageView != null) {
            i = C32024d.f78851o0;
            SingleLineTextItem singleLineTextItem = (SingleLineTextItem) C6202b.m24689a(view, i);
            if (singleLineTextItem != null) {
                return new C36812b0((ListItem) view, imageView, singleLineTextItem);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: d */
    public static C36812b0 m109061d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C32025e.item_payment_form_element_select_option, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m109060a(inflate);
    }

    /* renamed from: c */
    public ListItem mo3946b() {
        return this.f88802d;
    }
}
