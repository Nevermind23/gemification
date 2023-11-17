package p481jm;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.Guideline;
import p086g1.C6201a;
import p086g1.C6202b;
import p341ge.bog.designsystem.components.buttons.Button;
import p341ge.bog.designsystem.components.emptywidget.EmptyWidget;
import p341ge.bog.designsystem.components.layersandshadows.LayerView;
import p341ge.bog.designsystem.components.pagedescription.PageDescriptionView;
import p411em.C12488e;
import p411em.C12489f;

/* renamed from: jm.o */
public final class C16236o implements C6201a {

    /* renamed from: d */
    private final LayerView f45929d;

    /* renamed from: e */
    public final Button f45930e;

    /* renamed from: f */
    public final PageDescriptionView f45931f;

    /* renamed from: g */
    public final Guideline f45932g;

    /* renamed from: h */
    public final Guideline f45933h;

    /* renamed from: i */
    public final Button f45934i;

    /* renamed from: j */
    public final EmptyWidget f45935j;

    private C16236o(LayerView layerView, Button button, PageDescriptionView pageDescriptionView, Guideline guideline, Guideline guideline2, Button button2, EmptyWidget emptyWidget) {
        this.f45929d = layerView;
        this.f45930e = button;
        this.f45931f = pageDescriptionView;
        this.f45932g = guideline;
        this.f45933h = guideline2;
        this.f45934i = button2;
        this.f45935j = emptyWidget;
    }

    /* renamed from: a */
    public static C16236o m57878a(View view) {
        int i = C12488e.f37213n0;
        Button button = (Button) C6202b.m24689a(view, i);
        if (button != null) {
            i = C12488e.expiring_description;
            PageDescriptionView pageDescriptionView = (PageDescriptionView) C6202b.m24689a(view, i);
            if (pageDescriptionView != null) {
                i = C12488e.f37174D0;
                Guideline guideline = (Guideline) C6202b.m24689a(view, i);
                if (guideline != null) {
                    i = C12488e.f37176E0;
                    Guideline guideline2 = (Guideline) C6202b.m24689a(view, i);
                    if (guideline2 != null) {
                        i = C12488e.order_button;
                        Button button2 = (Button) C6202b.m24689a(view, i);
                        if (button2 != null) {
                            i = C12488e.page_header;
                            EmptyWidget emptyWidget = (EmptyWidget) C6202b.m24689a(view, i);
                            if (emptyWidget != null) {
                                return new C16236o((LayerView) view, button, pageDescriptionView, guideline, guideline2, button2, emptyWidget);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: d */
    public static C16236o m57879d(LayoutInflater layoutInflater) {
        return m57880e(layoutInflater, (ViewGroup) null, false);
    }

    /* renamed from: e */
    public static C16236o m57880e(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C12489f.fragment_expiring_card, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m57878a(inflate);
    }

    /* renamed from: c */
    public LayerView mo3946b() {
        return this.f45929d;
    }
}
