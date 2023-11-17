package b31;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import p086g1.C6201a;
import p086g1.C6202b;
import p341ge.bog.designsystem.components.list.ListItem;
import p341ge.bog.designsystem.components.list.TwoLineTextItem;
import x11.C39771d;
import x11.C39772e;

/* renamed from: b31.m */
public final class C31124m implements C6201a {

    /* renamed from: d */
    private final ListItem f77353d;

    /* renamed from: e */
    public final ImageView f77354e;

    /* renamed from: f */
    public final TwoLineTextItem f77355f;

    /* renamed from: g */
    public final TextView f77356g;

    private C31124m(ListItem listItem, ImageView imageView, TwoLineTextItem twoLineTextItem, TextView textView) {
        this.f77353d = listItem;
        this.f77354e = imageView;
        this.f77355f = twoLineTextItem;
        this.f77356g = textView;
    }

    /* renamed from: a */
    public static C31124m m92615a(View view) {
        int i = C39771d.f94467a;
        ImageView imageView = (ImageView) C6202b.m24689a(view, i);
        if (imageView != null) {
            i = C39771d.f94470f;
            TwoLineTextItem twoLineTextItem = (TwoLineTextItem) C6202b.m24689a(view, i);
            if (twoLineTextItem != null) {
                i = C39771d.inizials;
                TextView textView = (TextView) C6202b.m24689a(view, i);
                if (textView != null) {
                    return new C31124m((ListItem) view, imageView, twoLineTextItem, textView);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: d */
    public static C31124m m92616d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C39772e.item_ptop_contact, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m92615a(inflate);
    }

    /* renamed from: c */
    public ListItem mo3946b() {
        return this.f77353d;
    }
}
