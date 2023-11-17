package p413eo;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import p086g1.C6201a;
import p086g1.C6202b;
import p341ge.bog.designsystem.components.emptywidget.EmptyWidget;
import p356ao.C10114f;
import p356ao.C10115g;

/* renamed from: eo.d0 */
public final class C12736d0 implements C6201a {

    /* renamed from: d */
    private final LinearLayout f37694d;

    /* renamed from: e */
    public final EmptyWidget f37695e;

    private C12736d0(LinearLayout linearLayout, EmptyWidget emptyWidget) {
        this.f37694d = linearLayout;
        this.f37695e = emptyWidget;
    }

    /* renamed from: a */
    public static C12736d0 m48337a(View view) {
        int i = C10114f.f27960k0;
        EmptyWidget emptyWidget = (EmptyWidget) C6202b.m24689a(view, i);
        if (emptyWidget != null) {
            return new C12736d0((LinearLayout) view, emptyWidget);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: d */
    public static C12736d0 m48338d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C10115g.item_application_second_stage_section_header, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m48337a(inflate);
    }

    /* renamed from: c */
    public LinearLayout mo3946b() {
        return this.f37694d;
    }
}
