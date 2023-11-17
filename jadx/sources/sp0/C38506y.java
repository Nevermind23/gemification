package sp0;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import np0.C37440f;
import p086g1.C6201a;
import p341ge.bog.designsystem.components.emptywidget.EmptyWidget;

/* renamed from: sp0.y */
public final class C38506y implements C6201a {

    /* renamed from: d */
    private final EmptyWidget f92303d;

    /* renamed from: e */
    public final EmptyWidget f92304e;

    private C38506y(EmptyWidget emptyWidget, EmptyWidget emptyWidget2) {
        this.f92303d = emptyWidget;
        this.f92304e = emptyWidget2;
    }

    /* renamed from: a */
    public static C38506y m113038a(View view) {
        if (view != null) {
            EmptyWidget emptyWidget = (EmptyWidget) view;
            return new C38506y(emptyWidget, emptyWidget);
        }
        throw new NullPointerException("rootView");
    }

    /* renamed from: d */
    public static C38506y m113039d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C37440f.item_refinance_header, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m113038a(inflate);
    }

    /* renamed from: c */
    public EmptyWidget mo3946b() {
        return this.f92303d;
    }
}
