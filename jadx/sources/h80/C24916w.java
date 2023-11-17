package h80;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import p086g1.C6201a;
import p086g1.C6202b;
import p341ge.bog.designsystem.components.emptywidget.EmptyWidget;
import u70.C28606b;
import u70.C28607c;

/* renamed from: h80.w */
public final class C24916w implements C6201a {

    /* renamed from: d */
    private final LinearLayout f64068d;

    /* renamed from: e */
    public final EmptyWidget f64069e;

    /* renamed from: f */
    public final ImageView f64070f;

    /* renamed from: g */
    public final LinearLayout f64071g;

    /* renamed from: h */
    public final RecyclerView f64072h;

    private C24916w(LinearLayout linearLayout, EmptyWidget emptyWidget, ImageView imageView, LinearLayout linearLayout2, RecyclerView recyclerView) {
        this.f64068d = linearLayout;
        this.f64069e = emptyWidget;
        this.f64070f = imageView;
        this.f64071g = linearLayout2;
        this.f64072h = recyclerView;
    }

    /* renamed from: a */
    public static C24916w m79649a(View view) {
        int i = C28606b.f72577J;
        EmptyWidget emptyWidget = (EmptyWidget) C6202b.m24689a(view, i);
        if (emptyWidget != null) {
            i = C28606b.f72586Q;
            ImageView imageView = (ImageView) C6202b.m24689a(view, i);
            if (imageView != null) {
                LinearLayout linearLayout = (LinearLayout) view;
                i = C28606b.f72613x0;
                RecyclerView recyclerView = (RecyclerView) C6202b.m24689a(view, i);
                if (recyclerView != null) {
                    return new C24916w(linearLayout, emptyWidget, imageView, linearLayout, recyclerView);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: d */
    public static C24916w m79650d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C28607c.item_result_offers_list, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m79649a(inflate);
    }

    /* renamed from: c */
    public LinearLayout mo3946b() {
        return this.f64068d;
    }
}
