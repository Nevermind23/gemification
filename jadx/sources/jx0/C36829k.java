package jx0;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import fx0.C32024d;
import fx0.C32025e;
import p086g1.C6201a;
import p086g1.C6202b;

/* renamed from: jx0.k */
public final class C36829k implements C6201a {

    /* renamed from: d */
    private final LinearLayout f88875d;

    /* renamed from: e */
    public final LinearLayout f88876e;

    /* renamed from: f */
    public final AppCompatImageView f88877f;

    /* renamed from: g */
    public final TextView f88878g;

    private C36829k(LinearLayout linearLayout, LinearLayout linearLayout2, AppCompatImageView appCompatImageView, TextView textView) {
        this.f88875d = linearLayout;
        this.f88876e = linearLayout2;
        this.f88877f = appCompatImageView;
        this.f88878g = textView;
    }

    /* renamed from: a */
    public static C36829k m109128a(View view) {
        LinearLayout linearLayout = (LinearLayout) view;
        int i = C32024d.f78860y;
        AppCompatImageView appCompatImageView = (AppCompatImageView) C6202b.m24689a(view, i);
        if (appCompatImageView != null) {
            i = C32024d.f78850n0;
            TextView textView = (TextView) C6202b.m24689a(view, i);
            if (textView != null) {
                return new C36829k(linearLayout, linearLayout, appCompatImageView, textView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: d */
    public static C36829k m109129d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C32025e.item_categories_horizontal_child, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m109128a(inflate);
    }

    /* renamed from: c */
    public LinearLayout mo3946b() {
        return this.f88875d;
    }
}
