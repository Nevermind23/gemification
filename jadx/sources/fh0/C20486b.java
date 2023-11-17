package fh0;

import ah0.C19245a;
import ah0.C19246b;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import p086g1.C6201a;
import p086g1.C6202b;
import p341ge.bog.designsystem.components.buttons.Button;
import p341ge.bog.designsystem.components.layersandshadows.LayerView;
import p341ge.bog.designsystem.components.pagedescription.PageDescriptionView;

/* renamed from: fh0.b */
public final class C20486b implements C6201a {

    /* renamed from: d */
    private final ConstraintLayout f55483d;

    /* renamed from: e */
    public final LayerView f55484e;

    /* renamed from: f */
    public final AppCompatTextView f55485f;

    /* renamed from: g */
    public final Button f55486g;

    /* renamed from: h */
    public final LayerView f55487h;

    /* renamed from: i */
    public final PageDescriptionView f55488i;

    private C20486b(ConstraintLayout constraintLayout, LayerView layerView, AppCompatTextView appCompatTextView, Button button, LayerView layerView2, PageDescriptionView pageDescriptionView) {
        this.f55483d = constraintLayout;
        this.f55484e = layerView;
        this.f55485f = appCompatTextView;
        this.f55486g = button;
        this.f55487h = layerView2;
        this.f55488i = pageDescriptionView;
    }

    /* renamed from: a */
    public static C20486b m66695a(View view) {
        int i = C19245a.dialog_layer;
        LayerView layerView = (LayerView) C6202b.m24689a(view, i);
        if (layerView != null) {
            i = C19245a.dialog_login_button_text;
            AppCompatTextView appCompatTextView = (AppCompatTextView) C6202b.m24689a(view, i);
            if (appCompatTextView != null) {
                i = C19245a.go_to_finals_button;
                Button button = (Button) C6202b.m24689a(view, i);
                if (button != null) {
                    i = C19245a.login_button_layer;
                    LayerView layerView2 = (LayerView) C6202b.m24689a(view, i);
                    if (layerView2 != null) {
                        i = C19245a.prelogin_final_description;
                        PageDescriptionView pageDescriptionView = (PageDescriptionView) C6202b.m24689a(view, i);
                        if (pageDescriptionView != null) {
                            return new C20486b((ConstraintLayout) view, layerView, appCompatTextView, button, layerView2, pageDescriptionView);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: d */
    public static C20486b m66696d(LayoutInflater layoutInflater) {
        return m66697e(layoutInflater, (ViewGroup) null, false);
    }

    /* renamed from: e */
    public static C20486b m66697e(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C19246b.layout_gamification_final_dialog, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m66695a(inflate);
    }

    /* renamed from: c */
    public ConstraintLayout mo3946b() {
        return this.f55483d;
    }
}
