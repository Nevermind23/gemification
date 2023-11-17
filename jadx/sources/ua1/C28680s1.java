package ua1;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageView;
import ba1.C10216u;
import ba1.C10217v;
import p086g1.C6201a;
import p086g1.C6202b;
import p341ge.bog.designsystem.components.list.ListItem;
import p341ge.bog.designsystem.components.list.SingleLineTextItem;
import p341ge.bog.designsystem.components.list.ThreeLineTextItem;
import p341ge.bog.designsystem.components.list.TwoLineReverseTextItem;
import p341ge.bog.designsystem.components.list.TwoLineTextItem;

/* renamed from: ua1.s1 */
public final class C28680s1 implements C6201a {

    /* renamed from: d */
    private final ListItem f72926d;

    /* renamed from: e */
    public final ListItem f72927e;

    /* renamed from: f */
    public final AppCompatImageView f72928f;

    /* renamed from: g */
    public final SingleLineTextItem f72929g;

    /* renamed from: h */
    public final AppCompatImageView f72930h;

    /* renamed from: i */
    public final ThreeLineTextItem f72931i;

    /* renamed from: j */
    public final TwoLineReverseTextItem f72932j;

    /* renamed from: k */
    public final TwoLineTextItem f72933k;

    private C28680s1(ListItem listItem, ListItem listItem2, AppCompatImageView appCompatImageView, SingleLineTextItem singleLineTextItem, AppCompatImageView appCompatImageView2, ThreeLineTextItem threeLineTextItem, TwoLineReverseTextItem twoLineReverseTextItem, TwoLineTextItem twoLineTextItem) {
        this.f72926d = listItem;
        this.f72927e = listItem2;
        this.f72928f = appCompatImageView;
        this.f72929g = singleLineTextItem;
        this.f72930h = appCompatImageView2;
        this.f72931i = threeLineTextItem;
        this.f72932j = twoLineReverseTextItem;
        this.f72933k = twoLineTextItem;
    }

    /* renamed from: a */
    public static C28680s1 m87835a(View view) {
        ListItem listItem = (ListItem) view;
        int i = C10216u.customer_device_image_view;
        AppCompatImageView appCompatImageView = (AppCompatImageView) C6202b.m24689a(view, i);
        if (appCompatImageView != null) {
            i = C10216u.my_devices_single_line_text_item;
            SingleLineTextItem singleLineTextItem = (SingleLineTextItem) C6202b.m24689a(view, i);
            if (singleLineTextItem != null) {
                i = C10216u.my_devices_star_icon;
                AppCompatImageView appCompatImageView2 = (AppCompatImageView) C6202b.m24689a(view, i);
                if (appCompatImageView2 != null) {
                    i = C10216u.my_devices_three_line_text_item;
                    ThreeLineTextItem threeLineTextItem = (ThreeLineTextItem) C6202b.m24689a(view, i);
                    if (threeLineTextItem != null) {
                        i = C10216u.my_devices_two_line_reverse_text_item;
                        TwoLineReverseTextItem twoLineReverseTextItem = (TwoLineReverseTextItem) C6202b.m24689a(view, i);
                        if (twoLineReverseTextItem != null) {
                            i = C10216u.my_devices_two_line_text_item;
                            TwoLineTextItem twoLineTextItem = (TwoLineTextItem) C6202b.m24689a(view, i);
                            if (twoLineTextItem != null) {
                                return new C28680s1(listItem, listItem, appCompatImageView, singleLineTextItem, appCompatImageView2, threeLineTextItem, twoLineReverseTextItem, twoLineTextItem);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: d */
    public static C28680s1 m87836d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C10217v.my_devices_swipe_item_view, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m87835a(inflate);
    }

    /* renamed from: c */
    public ListItem mo3946b() {
        return this.f72926d;
    }
}
