package en0;

import an0.C10106b;
import an0.C10107c;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import p086g1.C6201a;
import p086g1.C6202b;
import p341ge.bog.designsystem.components.list.ListItem;
import p341ge.bog.designsystem.components.list.SingleLineTextItem;
import p341ge.bog.designsystem.components.radiobutton.RadioButtonView;

/* renamed from: en0.h */
public final class C12722h implements C6201a {

    /* renamed from: d */
    private final ListItem f37645d;

    /* renamed from: e */
    public final RadioButtonView f37646e;

    /* renamed from: f */
    public final SingleLineTextItem f37647f;

    private C12722h(ListItem listItem, RadioButtonView radioButtonView, SingleLineTextItem singleLineTextItem) {
        this.f37645d = listItem;
        this.f37646e = radioButtonView;
        this.f37647f = singleLineTextItem;
    }

    /* renamed from: a */
    public static C12722h m48281a(View view) {
        int i = C10106b.f27876J;
        RadioButtonView radioButtonView = (RadioButtonView) C6202b.m24689a(view, i);
        if (radioButtonView != null) {
            i = C10106b.f27882Q;
            SingleLineTextItem singleLineTextItem = (SingleLineTextItem) C6202b.m24689a(view, i);
            if (singleLineTextItem != null) {
                return new C12722h((ListItem) view, radioButtonView, singleLineTextItem);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: d */
    public static C12722h m48282d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C10107c.item_occupation, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m48281a(inflate);
    }

    /* renamed from: c */
    public ListItem mo3946b() {
        return this.f37645d;
    }
}
