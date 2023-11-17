package br0;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import p086g1.C6201a;
import p086g1.C6202b;
import p341ge.bog.designsystem.components.checkbox.CheckboxView;
import p341ge.bog.designsystem.components.list.ListItem;
import p341ge.bog.designsystem.components.list.TwoLineReverseTextItem;
import xq0.C39835a;
import xq0.C39836b;

/* renamed from: br0.f */
public final class C31180f implements C6201a {

    /* renamed from: d */
    private final ListItem f77475d;

    /* renamed from: e */
    public final CheckboxView f77476e;

    /* renamed from: f */
    public final TwoLineReverseTextItem f77477f;

    private C31180f(ListItem listItem, CheckboxView checkboxView, TwoLineReverseTextItem twoLineReverseTextItem) {
        this.f77475d = listItem;
        this.f77476e = checkboxView;
        this.f77477f = twoLineReverseTextItem;
    }

    /* renamed from: a */
    public static C31180f m92726a(View view) {
        int i = C39835a.property_check_box;
        CheckboxView checkboxView = (CheckboxView) C6202b.m24689a(view, i);
        if (checkboxView != null) {
            i = C39835a.property_not_chosen_text_item;
            TwoLineReverseTextItem twoLineReverseTextItem = (TwoLineReverseTextItem) C6202b.m24689a(view, i);
            if (twoLineReverseTextItem != null) {
                return new C31180f((ListItem) view, checkboxView, twoLineReverseTextItem);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: d */
    public static C31180f m92727d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C39836b.item_property_not_chosen_yet, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m92726a(inflate);
    }

    /* renamed from: c */
    public ListItem mo3946b() {
        return this.f77475d;
    }
}
