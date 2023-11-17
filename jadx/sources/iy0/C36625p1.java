package iy0;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatTextView;
import hy0.C36271e;
import hy0.C36272f;
import p086g1.C6201a;
import p086g1.C6202b;
import p341ge.bog.designsystem.components.list.ListItem;

/* renamed from: iy0.p1 */
public final class C36625p1 implements C6201a {

    /* renamed from: d */
    private final ListItem f88375d;

    /* renamed from: e */
    public final AppCompatTextView f88376e;

    /* renamed from: f */
    public final AppCompatTextView f88377f;

    private C36625p1(ListItem listItem, AppCompatTextView appCompatTextView, AppCompatTextView appCompatTextView2) {
        this.f88375d = listItem;
        this.f88376e = appCompatTextView;
        this.f88377f = appCompatTextView2;
    }

    /* renamed from: a */
    public static C36625p1 m108635a(View view) {
        int i = C36271e.insurance_limit_description;
        AppCompatTextView appCompatTextView = (AppCompatTextView) C6202b.m24689a(view, i);
        if (appCompatTextView != null) {
            i = C36271e.insurance_limit_value;
            AppCompatTextView appCompatTextView2 = (AppCompatTextView) C6202b.m24689a(view, i);
            if (appCompatTextView2 != null) {
                return new C36625p1((ListItem) view, appCompatTextView, appCompatTextView2);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: d */
    public static C36625p1 m108636d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C36272f.item_insurance_limit, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m108635a(inflate);
    }

    /* renamed from: c */
    public ListItem mo3946b() {
        return this.f88375d;
    }
}
