package p352ak;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatTextView;
import p086g1.C6201a;
import p086g1.C6202b;
import p341ge.bog.designsystem.components.checkbox.CheckboxView;
import p341ge.bog.designsystem.components.list.ListItem;
import p601sg.C17782g;
import p601sg.C17783h;

/* renamed from: ak.p */
public final class C9987p implements C6201a {

    /* renamed from: d */
    private final ListItem f27376d;

    /* renamed from: e */
    public final CheckboxView f27377e;

    /* renamed from: f */
    public final AppCompatTextView f27378f;

    /* renamed from: g */
    public final AppCompatTextView f27379g;

    private C9987p(ListItem listItem, CheckboxView checkboxView, AppCompatTextView appCompatTextView, AppCompatTextView appCompatTextView2) {
        this.f27376d = listItem;
        this.f27377e = checkboxView;
        this.f27378f = appCompatTextView;
        this.f27379g = appCompatTextView2;
    }

    /* renamed from: a */
    public static C9987p m36628a(View view) {
        int i = C17782g.f49790s1;
        CheckboxView checkboxView = (CheckboxView) C6202b.m24689a(view, i);
        if (checkboxView != null) {
            i = C17782g.f49761g5;
            AppCompatTextView appCompatTextView = (AppCompatTextView) C6202b.m24689a(view, i);
            if (appCompatTextView != null) {
                i = C17782g.item_text_right;
                AppCompatTextView appCompatTextView2 = (AppCompatTextView) C6202b.m24689a(view, i);
                if (appCompatTextView2 != null) {
                    return new C9987p((ListItem) view, checkboxView, appCompatTextView, appCompatTextView2);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: d */
    public static C9987p m36629d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C17783h.item_selector_element, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m36628a(inflate);
    }

    /* renamed from: c */
    public ListItem mo3946b() {
        return this.f27376d;
    }
}
