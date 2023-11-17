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

/* renamed from: ua1.i1 */
public final class C28650i1 implements C6201a {

    /* renamed from: d */
    private final LinearLayout f72769d;

    /* renamed from: e */
    public final CheckboxView f72770e;

    private C28650i1(LinearLayout linearLayout, CheckboxView checkboxView) {
        this.f72769d = linearLayout;
        this.f72770e = checkboxView;
    }

    /* renamed from: a */
    public static C28650i1 m87705a(View view) {
        int i = C10216u.f28305T;
        CheckboxView checkboxView = (CheckboxView) C6202b.m24689a(view, i);
        if (checkboxView != null) {
            return new C28650i1((LinearLayout) view, checkboxView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: d */
    public static C28650i1 m87706d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C10217v.item_select_contact, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m87705a(inflate);
    }

    /* renamed from: c */
    public LinearLayout mo3946b() {
        return this.f72769d;
    }
}
