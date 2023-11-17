package o51;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import n51.C37356b;
import n51.C37357c;
import p086g1.C6201a;
import p086g1.C6202b;
import p341ge.bog.designsystem.components.checkbox.CheckboxView;
import p341ge.bog.designsystem.components.list.ListItem;
import p341ge.bog.designsystem.components.list.TwoLineReverseTextItem;

/* renamed from: o51.n */
public final class C37657n implements C6201a {

    /* renamed from: d */
    private final ListItem f90507d;

    /* renamed from: e */
    public final TwoLineReverseTextItem f90508e;

    /* renamed from: f */
    public final TextView f90509f;

    /* renamed from: g */
    public final CheckboxView f90510g;

    private C37657n(ListItem listItem, TwoLineReverseTextItem twoLineReverseTextItem, TextView textView, CheckboxView checkboxView) {
        this.f90507d = listItem;
        this.f90508e = twoLineReverseTextItem;
        this.f90509f = textView;
        this.f90510g = checkboxView;
    }

    /* renamed from: a */
    public static C37657n m110719a(View view) {
        int i = C37356b.acc_texts;
        TwoLineReverseTextItem twoLineReverseTextItem = (TwoLineReverseTextItem) C6202b.m24689a(view, i);
        if (twoLineReverseTextItem != null) {
            i = C37356b.account_amount;
            TextView textView = (TextView) C6202b.m24689a(view, i);
            if (textView != null) {
                i = C37356b.select_check_box;
                CheckboxView checkboxView = (CheckboxView) C6202b.m24689a(view, i);
                if (checkboxView != null) {
                    return new C37657n((ListItem) view, twoLineReverseTextItem, textView, checkboxView);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: d */
    public static C37657n m110720d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C37357c.item_statements_select_account, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m110719a(inflate);
    }

    /* renamed from: c */
    public ListItem mo3946b() {
        return this.f90507d;
    }
}
