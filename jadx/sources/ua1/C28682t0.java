package ua1;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import ba1.C10216u;
import ba1.C10217v;
import p086g1.C6201a;
import p086g1.C6202b;
import p341ge.bog.designsystem.components.buttons.Button;
import p341ge.bog.designsystem.components.layersandshadows.LayerView;
import p341ge.bog.designsystem.components.pagedescription.PageDescriptionView;

/* renamed from: ua1.t0 */
public final class C28682t0 implements C6201a {

    /* renamed from: d */
    private final ConstraintLayout f72940d;

    /* renamed from: e */
    public final AppCompatImageView f72941e;

    /* renamed from: f */
    public final LayerView f72942f;

    /* renamed from: g */
    public final LinearLayout f72943g;

    /* renamed from: h */
    public final PageDescriptionView f72944h;

    /* renamed from: i */
    public final AppCompatImageView f72945i;

    /* renamed from: j */
    public final LayerView f72946j;

    /* renamed from: k */
    public final Button f72947k;

    /* renamed from: l */
    public final AppCompatImageView f72948l;

    /* renamed from: m */
    public final LayerView f72949m;

    private C28682t0(ConstraintLayout constraintLayout, AppCompatImageView appCompatImageView, LayerView layerView, LinearLayout linearLayout, PageDescriptionView pageDescriptionView, AppCompatImageView appCompatImageView2, LayerView layerView2, Button button, AppCompatImageView appCompatImageView3, LayerView layerView3) {
        this.f72940d = constraintLayout;
        this.f72941e = appCompatImageView;
        this.f72942f = layerView;
        this.f72943g = linearLayout;
        this.f72944h = pageDescriptionView;
        this.f72945i = appCompatImageView2;
        this.f72946j = layerView2;
        this.f72947k = button;
        this.f72948l = appCompatImageView3;
        this.f72949m = layerView3;
    }

    /* renamed from: a */
    public static C28682t0 m87843a(View view) {
        int i = C10216u.biometric_check_image_view;
        AppCompatImageView appCompatImageView = (AppCompatImageView) C6202b.m24689a(view, i);
        if (appCompatImageView != null) {
            i = C10216u.biometric_layer_view;
            LayerView layerView = (LayerView) C6202b.m24689a(view, i);
            if (layerView != null) {
                i = C10216u.f28335m1;
                LinearLayout linearLayout = (LinearLayout) C6202b.m24689a(view, i);
                if (linearLayout != null) {
                    i = C10216u.f28293C1;
                    PageDescriptionView pageDescriptionView = (PageDescriptionView) C6202b.m24689a(view, i);
                    if (pageDescriptionView != null) {
                        i = C10216u.passcode_check_image_view;
                        AppCompatImageView appCompatImageView2 = (AppCompatImageView) C6202b.m24689a(view, i);
                        if (appCompatImageView2 != null) {
                            i = C10216u.passcode_layer_view;
                            LayerView layerView2 = (LayerView) C6202b.m24689a(view, i);
                            if (layerView2 != null) {
                                i = C10216u.f28341u2;
                                Button button = (Button) C6202b.m24689a(view, i);
                                if (button != null) {
                                    i = C10216u.trusted_device_check_image_view;
                                    AppCompatImageView appCompatImageView3 = (AppCompatImageView) C6202b.m24689a(view, i);
                                    if (appCompatImageView3 != null) {
                                        i = C10216u.trusted_device_layer_view;
                                        LayerView layerView3 = (LayerView) C6202b.m24689a(view, i);
                                        if (layerView3 != null) {
                                            return new C28682t0((ConstraintLayout) view, appCompatImageView, layerView, linearLayout, pageDescriptionView, appCompatImageView2, layerView2, button, appCompatImageView3, layerView3);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: d */
    public static C28682t0 m87844d(LayoutInflater layoutInflater) {
        return m87845e(layoutInflater, (ViewGroup) null, false);
    }

    /* renamed from: e */
    public static C28682t0 m87845e(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C10217v.fragment_setup_parameters, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m87843a(inflate);
    }

    /* renamed from: c */
    public ConstraintLayout mo3946b() {
        return this.f72940d;
    }
}
