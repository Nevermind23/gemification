package ev0;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import bv0.C31204d;
import bv0.C31205e;
import p086g1.C6201a;
import p086g1.C6202b;
import p341ge.bog.designsystem.components.list.ListItem;
import p341ge.bog.designsystem.components.list.SingleLineTextItem;

/* renamed from: ev0.d0 */
public final class C31822d0 implements C6201a {

    /* renamed from: d */
    private final ListItem f78475d;

    /* renamed from: e */
    public final ImageView f78476e;

    /* renamed from: f */
    public final SingleLineTextItem f78477f;

    private C31822d0(ListItem listItem, ImageView imageView, SingleLineTextItem singleLineTextItem) {
        this.f78475d = listItem;
        this.f78476e = imageView;
        this.f78477f = singleLineTextItem;
    }

    /* renamed from: a */
    public static C31822d0 m94075a(View view) {
        int i = C31204d.bank_logo;
        ImageView imageView = (ImageView) C6202b.m24689a(view, i);
        if (imageView != null) {
            i = C31204d.bank_name;
            SingleLineTextItem singleLineTextItem = (SingleLineTextItem) C6202b.m24689a(view, i);
            if (singleLineTextItem != null) {
                return new C31822d0((ListItem) view, imageView, singleLineTextItem);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: d */
    public static C31822d0 m94076d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C31205e.item_select_bank, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m94075a(inflate);
    }

    /* renamed from: c */
    public ListItem mo3946b() {
        return this.f78475d;
    }
}
