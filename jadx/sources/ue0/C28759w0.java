package ue0;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import ie0.C25187g;
import ie0.C25188h;
import p086g1.C6201a;
import p086g1.C6202b;
import p341ge.bog.designsystem.components.list.ListItem;
import p341ge.bog.designsystem.components.list.SingleLineTextItem;
import p341ge.bog.designsystem.components.radiobutton.RadioButtonView;

/* renamed from: ue0.w0 */
public final class C28759w0 implements C6201a {

    /* renamed from: d */
    private final ListItem f73499d;

    /* renamed from: e */
    public final RadioButtonView f73500e;

    /* renamed from: f */
    public final SingleLineTextItem f73501f;

    /* renamed from: g */
    public final ListItem f73502g;

    private C28759w0(ListItem listItem, RadioButtonView radioButtonView, SingleLineTextItem singleLineTextItem, ListItem listItem2) {
        this.f73499d = listItem;
        this.f73500e = radioButtonView;
        this.f73501f = singleLineTextItem;
        this.f73502g = listItem2;
    }

    /* renamed from: a */
    public static C28759w0 m88168a(View view) {
        int i = C25187g.item_checkbox;
        RadioButtonView radioButtonView = (RadioButtonView) C6202b.m24689a(view, i);
        if (radioButtonView != null) {
            i = C25187g.f64692b2;
            SingleLineTextItem singleLineTextItem = (SingleLineTextItem) C6202b.m24689a(view, i);
            if (singleLineTextItem != null) {
                ListItem listItem = (ListItem) view;
                return new C28759w0(listItem, radioButtonView, singleLineTextItem, listItem);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: d */
    public static C28759w0 m88169d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C25188h.item_selectable_subtype, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m88168a(inflate);
    }

    /* renamed from: c */
    public ListItem mo3946b() {
        return this.f73499d;
    }
}
