package p413eo;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import p086g1.C6201a;
import p086g1.C6202b;
import p341ge.bog.designsystem.components.list.ListItem;
import p341ge.bog.designsystem.components.list.TwoLineReverseTextItem;
import p341ge.bog.designsystem.components.radiobutton.RadioButtonView;
import p356ao.C10114f;
import p356ao.C10115g;

/* renamed from: eo.q0 */
public final class C12765q0 implements C6201a {

    /* renamed from: d */
    private final ListItem f37832d;

    /* renamed from: e */
    public final View f37833e;

    /* renamed from: f */
    public final TwoLineReverseTextItem f37834f;

    /* renamed from: g */
    public final RadioButtonView f37835g;

    private C12765q0(ListItem listItem, View view, TwoLineReverseTextItem twoLineReverseTextItem, RadioButtonView radioButtonView) {
        this.f37832d = listItem;
        this.f37833e = view;
        this.f37834f = twoLineReverseTextItem;
        this.f37835g = radioButtonView;
    }

    /* renamed from: a */
    public static C12765q0 m48457a(View view) {
        int i = C10114f.f27944Y;
        View a = C6202b.m24689a(view, i);
        if (a != null) {
            i = C10114f.payment_type_info;
            TwoLineReverseTextItem twoLineReverseTextItem = (TwoLineReverseTextItem) C6202b.m24689a(view, i);
            if (twoLineReverseTextItem != null) {
                i = C10114f.f27946Z0;
                RadioButtonView radioButtonView = (RadioButtonView) C6202b.m24689a(view, i);
                if (radioButtonView != null) {
                    return new C12765q0((ListItem) view, a, twoLineReverseTextItem, radioButtonView);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: d */
    public static C12765q0 m48458d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C10115g.item_payment_type_radio_button, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m48457a(inflate);
    }

    /* renamed from: c */
    public ListItem mo3946b() {
        return this.f37832d;
    }
}
