package p90;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import p086g1.C6201a;
import p086g1.C6202b;
import p341ge.bog.designsystem.components.checkbox.CheckboxView;
import p341ge.bog.designsystem.components.list.ListItem;
import p366bk.C10322k;
import p366bk.C10324m;

/* renamed from: p90.k6 */
public final class C27350k6 implements C6201a {

    /* renamed from: d */
    private final ListItem f69173d;

    /* renamed from: e */
    public final CheckboxView f69174e;

    private C27350k6(ListItem listItem, CheckboxView checkboxView) {
        this.f69173d = listItem;
        this.f69174e = checkboxView;
    }

    /* renamed from: a */
    public static C27350k6 m84708a(View view) {
        int i = C10322k.checkBox;
        CheckboxView checkboxView = (CheckboxView) C6202b.m24689a(view, i);
        if (checkboxView != null) {
            return new C27350k6((ListItem) view, checkboxView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: d */
    public static C27350k6 m84709d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C10324m.item_security_select_all, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m84708a(inflate);
    }

    /* renamed from: c */
    public ListItem mo3946b() {
        return this.f69173d;
    }
}
