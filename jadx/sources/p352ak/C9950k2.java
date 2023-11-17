package p352ak;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import p086g1.C6201a;
import p086g1.C6202b;
import p341ge.bog.designsystem.components.checkbox.CheckboxView;
import p341ge.bog.designsystem.components.layersandshadows.LayerView;
import p601sg.C17782g;
import p601sg.C17783h;

/* renamed from: ak.k2 */
public final class C9950k2 implements C6201a {

    /* renamed from: d */
    private final LayerView f27190d;

    /* renamed from: e */
    public final LayerView f27191e;

    /* renamed from: f */
    public final AppCompatTextView f27192f;

    /* renamed from: g */
    public final AppCompatImageView f27193g;

    /* renamed from: h */
    public final CheckboxView f27194h;

    /* renamed from: i */
    public final LinearLayout f27195i;

    private C9950k2(LayerView layerView, LayerView layerView2, AppCompatTextView appCompatTextView, AppCompatImageView appCompatImageView, CheckboxView checkboxView, LinearLayout linearLayout) {
        this.f27190d = layerView;
        this.f27191e = layerView2;
        this.f27192f = appCompatTextView;
        this.f27193g = appCompatImageView;
        this.f27194h = checkboxView;
        this.f27195i = linearLayout;
    }

    /* renamed from: a */
    public static C9950k2 m36493a(View view) {
        LayerView layerView = (LayerView) view;
        int i = C17782g.chip_title_text;
        AppCompatTextView appCompatTextView = (AppCompatTextView) C6202b.m24689a(view, i);
        if (appCompatTextView != null) {
            i = C17782g.icon_close;
            AppCompatImageView appCompatImageView = (AppCompatImageView) C6202b.m24689a(view, i);
            if (appCompatImageView != null) {
                i = C17782g.select_chip_checkbox;
                CheckboxView checkboxView = (CheckboxView) C6202b.m24689a(view, i);
                if (checkboxView != null) {
                    i = C17782g.select_chip_container;
                    LinearLayout linearLayout = (LinearLayout) C6202b.m24689a(view, i);
                    if (linearLayout != null) {
                        return new C9950k2(layerView, layerView, appCompatTextView, appCompatImageView, checkboxView, linearLayout);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: d */
    public static C9950k2 m36494d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C17783h.view_chip_item, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m36493a(inflate);
    }

    /* renamed from: c */
    public LayerView mo3946b() {
        return this.f27190d;
    }
}
