package ua1;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatTextView;
import ba1.C10216u;
import ba1.C10217v;
import p086g1.C6201a;
import p086g1.C6202b;
import p341ge.bog.designsystem.components.buttons.Button;
import p341ge.bog.designsystem.components.input.Input;
import p341ge.bog.designsystem.components.layersandshadows.LayerView;
import p341ge.bog.designsystem.components.pagedescription.PageDescriptionView;

/* renamed from: ua1.m1 */
public final class C28662m1 implements C6201a {

    /* renamed from: d */
    private final LinearLayout f72833d;

    /* renamed from: e */
    public final Button f72834e;

    /* renamed from: f */
    public final PageDescriptionView f72835f;

    /* renamed from: g */
    public final AppCompatTextView f72836g;

    /* renamed from: h */
    public final Input f72837h;

    /* renamed from: i */
    public final LayerView f72838i;

    private C28662m1(LinearLayout linearLayout, Button button, PageDescriptionView pageDescriptionView, AppCompatTextView appCompatTextView, Input input, LayerView layerView) {
        this.f72833d = linearLayout;
        this.f72834e = button;
        this.f72835f = pageDescriptionView;
        this.f72836g = appCompatTextView;
        this.f72837h = input;
        this.f72838i = layerView;
    }

    /* renamed from: a */
    public static C28662m1 m87759a(View view) {
        int i = C10216u.f28315a;
        Button button = (Button) C6202b.m24689a(view, i);
        if (button != null) {
            i = C10216u.confirm_number_description;
            PageDescriptionView pageDescriptionView = (PageDescriptionView) C6202b.m24689a(view, i);
            if (pageDescriptionView != null) {
                i = C10216u.contact_text_view;
                AppCompatTextView appCompatTextView = (AppCompatTextView) C6202b.m24689a(view, i);
                if (appCompatTextView != null) {
                    i = C10216u.f28299P1;
                    Input input = (Input) C6202b.m24689a(view, i);
                    if (input != null) {
                        i = C10216u.text_layer_view;
                        LayerView layerView = (LayerView) C6202b.m24689a(view, i);
                        if (layerView != null) {
                            return new C28662m1((LinearLayout) view, button, pageDescriptionView, appCompatTextView, input, layerView);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: d */
    public static C28662m1 m87760d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C10217v.layout_confirm_number_first, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m87759a(inflate);
    }

    /* renamed from: c */
    public LinearLayout mo3946b() {
        return this.f72833d;
    }
}
