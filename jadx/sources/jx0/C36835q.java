package jx0;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import fx0.C32024d;
import fx0.C32025e;
import p086g1.C6201a;
import p086g1.C6202b;
import p341ge.bog.designsystem.components.list.ListItem;

/* renamed from: jx0.q */
public final class C36835q implements C6201a {

    /* renamed from: d */
    private final ListItem f88894d;

    /* renamed from: e */
    public final ListItem f88895e;

    /* renamed from: f */
    public final AppCompatImageView f88896f;

    /* renamed from: g */
    public final TextView f88897g;

    private C36835q(ListItem listItem, ListItem listItem2, AppCompatImageView appCompatImageView, TextView textView) {
        this.f88894d = listItem;
        this.f88895e = listItem2;
        this.f88896f = appCompatImageView;
        this.f88897g = textView;
    }

    /* renamed from: a */
    public static C36835q m109152a(View view) {
        ListItem listItem = (ListItem) view;
        int i = C32024d.f78860y;
        AppCompatImageView appCompatImageView = (AppCompatImageView) C6202b.m24689a(view, i);
        if (appCompatImageView != null) {
            i = C32024d.f78850n0;
            TextView textView = (TextView) C6202b.m24689a(view, i);
            if (textView != null) {
                return new C36835q(listItem, listItem, appCompatImageView, textView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: d */
    public static C36835q m109153d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C32025e.item_categories_vertical_child, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m109152a(inflate);
    }

    /* renamed from: c */
    public ListItem mo3946b() {
        return this.f88894d;
    }
}
