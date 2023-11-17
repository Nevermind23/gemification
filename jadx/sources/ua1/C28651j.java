package ua1;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import ba1.C10216u;
import ba1.C10217v;
import p086g1.C6201a;
import p086g1.C6202b;
import p341ge.bog.designsystem.components.checkbox.CheckboxView;
import p341ge.bog.designsystem.components.list.SingleLineTextItem;

/* renamed from: ua1.j */
public final class C28651j implements C6201a {

    /* renamed from: d */
    private final LinearLayout f72771d;

    /* renamed from: e */
    public final CheckboxView f72772e;

    /* renamed from: f */
    public final SingleLineTextItem f72773f;

    private C28651j(LinearLayout linearLayout, CheckboxView checkboxView, SingleLineTextItem singleLineTextItem) {
        this.f72771d = linearLayout;
        this.f72772e = checkboxView;
        this.f72773f = singleLineTextItem;
    }

    /* renamed from: a */
    public static C28651j m87709a(View view) {
        int i = C10216u.f28305T;
        CheckboxView checkboxView = (CheckboxView) C6202b.m24689a(view, i);
        if (checkboxView != null) {
            i = C10216u.my_devices_single_line_text_item;
            SingleLineTextItem singleLineTextItem = (SingleLineTextItem) C6202b.m24689a(view, i);
            if (singleLineTextItem != null) {
                return new C28651j((LinearLayout) view, checkboxView, singleLineTextItem);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: d */
    public static C28651j m87710d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C10217v.edit_my_devices_list_item, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m87709a(inflate);
    }

    /* renamed from: c */
    public LinearLayout mo3946b() {
        return this.f72771d;
    }
}
