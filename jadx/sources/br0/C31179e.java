package br0;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import p086g1.C6201a;
import p086g1.C6202b;
import p341ge.bog.designsystem.components.checkbox.CheckboxView;
import p341ge.bog.designsystem.components.list.ListItem;
import p341ge.bog.designsystem.components.list.ThreeLineTextItem;
import xq0.C39835a;
import xq0.C39836b;

/* renamed from: br0.e */
public final class C31179e implements C6201a {

    /* renamed from: d */
    private final ListItem f77472d;

    /* renamed from: e */
    public final CheckboxView f77473e;

    /* renamed from: f */
    public final ThreeLineTextItem f77474f;

    private C31179e(ListItem listItem, CheckboxView checkboxView, ThreeLineTextItem threeLineTextItem) {
        this.f77472d = listItem;
        this.f77473e = checkboxView;
        this.f77474f = threeLineTextItem;
    }

    /* renamed from: a */
    public static C31179e m92722a(View view) {
        int i = C39835a.property_check_box;
        CheckboxView checkboxView = (CheckboxView) C6202b.m24689a(view, i);
        if (checkboxView != null) {
            i = C39835a.property_text_item;
            ThreeLineTextItem threeLineTextItem = (ThreeLineTextItem) C6202b.m24689a(view, i);
            if (threeLineTextItem != null) {
                return new C31179e((ListItem) view, checkboxView, threeLineTextItem);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: d */
    public static C31179e m92723d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C39836b.item_property, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m92722a(inflate);
    }

    /* renamed from: c */
    public ListItem mo3946b() {
        return this.f77472d;
    }
}
