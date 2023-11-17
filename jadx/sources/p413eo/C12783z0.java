package p413eo;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import p086g1.C6201a;
import p086g1.C6202b;
import p341ge.bog.designsystem.components.emptywidget.EmptyWidget;
import p356ao.C10114f;
import p356ao.C10115g;

/* renamed from: eo.z0 */
public final class C12783z0 implements C6201a {

    /* renamed from: d */
    private final LinearLayout f37899d;

    /* renamed from: e */
    public final EmptyWidget f37900e;

    /* renamed from: f */
    public final RecyclerView f37901f;

    private C12783z0(LinearLayout linearLayout, EmptyWidget emptyWidget, RecyclerView recyclerView) {
        this.f37899d = linearLayout;
        this.f37900e = emptyWidget;
        this.f37901f = recyclerView;
    }

    /* renamed from: a */
    public static C12783z0 m48531a(View view) {
        int i = C10114f.f27962l0;
        EmptyWidget emptyWidget = (EmptyWidget) C6202b.m24689a(view, i);
        if (emptyWidget != null) {
            i = C10114f.f27950c1;
            RecyclerView recyclerView = (RecyclerView) C6202b.m24689a(view, i);
            if (recyclerView != null) {
                return new C12783z0((LinearLayout) view, emptyWidget, recyclerView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: d */
    public static C12783z0 m48532d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C10115g.list_item_card_banner_slider, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m48531a(inflate);
    }

    /* renamed from: c */
    public LinearLayout mo3946b() {
        return this.f37899d;
    }
}
