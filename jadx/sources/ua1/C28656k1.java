package ua1;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatTextView;
import ba1.C10216u;
import ba1.C10217v;
import p086g1.C6201a;
import p086g1.C6202b;
import p341ge.bog.designsystem.components.list.ListItem;

/* renamed from: ua1.k1 */
public final class C28656k1 implements C6201a {

    /* renamed from: d */
    private final ListItem f72796d;

    /* renamed from: e */
    public final AppCompatTextView f72797e;

    private C28656k1(ListItem listItem, AppCompatTextView appCompatTextView) {
        this.f72796d = listItem;
        this.f72797e = appCompatTextView;
    }

    /* renamed from: a */
    public static C28656k1 m87732a(View view) {
        int i = C10216u.f28322d1;
        AppCompatTextView appCompatTextView = (AppCompatTextView) C6202b.m24689a(view, i);
        if (appCompatTextView != null) {
            return new C28656k1((ListItem) view, appCompatTextView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: d */
    public static C28656k1 m87733d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C10217v.item_selector_string, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m87732a(inflate);
    }

    /* renamed from: c */
    public ListItem mo3946b() {
        return this.f72796d;
    }
}
