package jx0;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageView;
import fx0.C32024d;
import fx0.C32025e;
import p086g1.C6201a;
import p086g1.C6202b;
import p341ge.bog.designsystem.components.list.ListItem;
import p341ge.bog.designsystem.components.list.SingleLineTextItem;

/* renamed from: jx0.m */
public final class C36831m implements C6201a {

    /* renamed from: d */
    private final ListItem f88882d;

    /* renamed from: e */
    public final ListItem f88883e;

    /* renamed from: f */
    public final AppCompatImageView f88884f;

    /* renamed from: g */
    public final SingleLineTextItem f88885g;

    private C36831m(ListItem listItem, ListItem listItem2, AppCompatImageView appCompatImageView, SingleLineTextItem singleLineTextItem) {
        this.f88882d = listItem;
        this.f88883e = listItem2;
        this.f88884f = appCompatImageView;
        this.f88885g = singleLineTextItem;
    }

    /* renamed from: a */
    public static C36831m m109136a(View view) {
        ListItem listItem = (ListItem) view;
        int i = C32024d.f78860y;
        AppCompatImageView appCompatImageView = (AppCompatImageView) C6202b.m24689a(view, i);
        if (appCompatImageView != null) {
            i = C32024d.f78850n0;
            SingleLineTextItem singleLineTextItem = (SingleLineTextItem) C6202b.m24689a(view, i);
            if (singleLineTextItem != null) {
                return new C36831m(listItem, listItem, appCompatImageView, singleLineTextItem);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: d */
    public static C36831m m109137d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C32025e.item_categories_other_child, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m109136a(inflate);
    }

    /* renamed from: c */
    public ListItem mo3946b() {
        return this.f88882d;
    }
}
