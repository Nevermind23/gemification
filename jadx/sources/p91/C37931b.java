package p91;

import android.view.View;
import androidx.constraintlayout.widget.Guideline;
import l91.C37116c;
import p086g1.C6201a;
import p086g1.C6202b;
import p341ge.bog.designsystem.components.layersandshadows.LayerView;
import p341ge.bog.designsystem.components.pagedescription.PageDescriptionView;

/* renamed from: p91.b */
public final class C37931b implements C6201a {

    /* renamed from: d */
    private final LayerView f91053d;

    /* renamed from: e */
    public final Guideline f91054e;

    /* renamed from: f */
    public final Guideline f91055f;

    /* renamed from: g */
    public final Guideline f91056g;

    /* renamed from: h */
    public final Guideline f91057h;

    /* renamed from: i */
    public final PageDescriptionView f91058i;

    private C37931b(LayerView layerView, Guideline guideline, Guideline guideline2, Guideline guideline3, Guideline guideline4, PageDescriptionView pageDescriptionView) {
        this.f91053d = layerView;
        this.f91054e = guideline;
        this.f91055f = guideline2;
        this.f91056g = guideline3;
        this.f91057h = guideline4;
        this.f91058i = pageDescriptionView;
    }

    /* renamed from: a */
    public static C37931b m111480a(View view) {
        int i = C37116c.gd_bot;
        Guideline guideline = (Guideline) C6202b.m24689a(view, i);
        if (guideline != null) {
            i = C37116c.f89313i;
            Guideline guideline2 = (Guideline) C6202b.m24689a(view, i);
            if (guideline2 != null) {
                i = C37116c.f89314j;
                Guideline guideline3 = (Guideline) C6202b.m24689a(view, i);
                if (guideline3 != null) {
                    i = C37116c.gd_top;
                    Guideline guideline4 = (Guideline) C6202b.m24689a(view, i);
                    if (guideline4 != null) {
                        i = C37116c.wish_description_text;
                        PageDescriptionView pageDescriptionView = (PageDescriptionView) C6202b.m24689a(view, i);
                        if (pageDescriptionView != null) {
                            return new C37931b((LayerView) view, guideline, guideline2, guideline3, guideline4, pageDescriptionView);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: c */
    public LayerView mo3946b() {
        return this.f91053d;
    }
}
