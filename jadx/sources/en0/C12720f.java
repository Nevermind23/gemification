package en0;

import an0.C10106b;
import an0.C10107c;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import p086g1.C6201a;
import p086g1.C6202b;
import p341ge.bog.designsystem.components.checkbox.CheckboxView;
import p341ge.bog.designsystem.components.list.ListItem;
import p341ge.bog.designsystem.components.list.SingleLineTextItem;

/* renamed from: en0.f */
public final class C12720f implements C6201a {

    /* renamed from: d */
    private final ListItem f37637d;

    /* renamed from: e */
    public final CheckboxView f37638e;

    /* renamed from: f */
    public final SingleLineTextItem f37639f;

    private C12720f(ListItem listItem, CheckboxView checkboxView, SingleLineTextItem singleLineTextItem) {
        this.f37637d = listItem;
        this.f37638e = checkboxView;
        this.f37639f = singleLineTextItem;
    }

    /* renamed from: a */
    public static C12720f m48273a(View view) {
        int i = C10106b.f27883l;
        CheckboxView checkboxView = (CheckboxView) C6202b.m24689a(view, i);
        if (checkboxView != null) {
            i = C10106b.f27886r;
            SingleLineTextItem singleLineTextItem = (SingleLineTextItem) C6202b.m24689a(view, i);
            if (singleLineTextItem != null) {
                return new C12720f((ListItem) view, checkboxView, singleLineTextItem);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: d */
    public static C12720f m48274d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C10107c.item_income_source, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m48273a(inflate);
    }

    /* renamed from: c */
    public ListItem mo3946b() {
        return this.f37637d;
    }
}
