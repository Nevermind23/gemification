package xn0;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import p086g1.C6201a;
import p086g1.C6202b;
import p341ge.bog.designsystem.components.list.SingleLineTextItem;
import sn0.C17901e;
import sn0.C17902f;

/* renamed from: xn0.l */
public final class C18854l implements C6201a {

    /* renamed from: d */
    private final LinearLayout f52759d;

    /* renamed from: e */
    public final View f52760e;

    /* renamed from: f */
    public final SingleLineTextItem f52761f;

    private C18854l(LinearLayout linearLayout, View view, SingleLineTextItem singleLineTextItem) {
        this.f52759d = linearLayout;
        this.f52760e = view;
        this.f52761f = singleLineTextItem;
    }

    /* renamed from: a */
    public static C18854l m63786a(View view) {
        int i = C17901e.f50985u;
        View a = C6202b.m24689a(view, i);
        if (a != null) {
            i = C17901e.merchant;
            SingleLineTextItem singleLineTextItem = (SingleLineTextItem) C6202b.m24689a(view, i);
            if (singleLineTextItem != null) {
                return new C18854l((LinearLayout) view, a, singleLineTextItem);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: d */
    public static C18854l m63787d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C17902f.item_merchant_details, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m63786a(inflate);
    }

    /* renamed from: c */
    public LinearLayout mo3946b() {
        return this.f52759d;
    }
}
