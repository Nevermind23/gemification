package en0;

import an0.C10106b;
import an0.C10107c;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import p086g1.C6201a;
import p086g1.C6202b;
import p341ge.bog.designsystem.components.list.ListItem;
import p341ge.bog.designsystem.components.list.SingleLineTextItem;

/* renamed from: en0.k */
public final class C12725k implements C6201a {

    /* renamed from: d */
    private final ListItem f37656d;

    /* renamed from: e */
    public final ImageView f37657e;

    /* renamed from: f */
    public final SingleLineTextItem f37658f;

    private C12725k(ListItem listItem, ImageView imageView, SingleLineTextItem singleLineTextItem) {
        this.f37656d = listItem;
        this.f37657e = imageView;
        this.f37658f = singleLineTextItem;
    }

    /* renamed from: a */
    public static C12725k m48293a(View view) {
        int i = C10106b.f27884m;
        ImageView imageView = (ImageView) C6202b.m24689a(view, i);
        if (imageView != null) {
            i = C10106b.f27881P;
            SingleLineTextItem singleLineTextItem = (SingleLineTextItem) C6202b.m24689a(view, i);
            if (singleLineTextItem != null) {
                return new C12725k((ListItem) view, imageView, singleLineTextItem);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: d */
    public static C12725k m48294d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C10107c.item_single_text_choice, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m48293a(inflate);
    }

    /* renamed from: c */
    public ListItem mo3946b() {
        return this.f37656d;
    }
}
