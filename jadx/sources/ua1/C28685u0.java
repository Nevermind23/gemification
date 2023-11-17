package ua1;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import ba1.C10216u;
import ba1.C10217v;
import p086g1.C6201a;
import p086g1.C6202b;
import p341ge.bog.designsystem.components.buttons.Button;
import p341ge.bog.designsystem.components.layersandshadows.LayerView;
import p341ge.bog.designsystem.components.pagedescription.PageDescriptionView;

/* renamed from: ua1.u0 */
public final class C28685u0 implements C6201a {

    /* renamed from: d */
    private final ConstraintLayout f72996d;

    /* renamed from: e */
    public final AppCompatImageView f72997e;

    /* renamed from: f */
    public final LayerView f72998f;

    /* renamed from: g */
    public final PageDescriptionView f72999g;

    /* renamed from: h */
    public final AppCompatImageView f73000h;

    /* renamed from: i */
    public final LayerView f73001i;

    /* renamed from: j */
    public final Button f73002j;

    /* renamed from: k */
    public final AppCompatImageView f73003k;

    /* renamed from: l */
    public final LayerView f73004l;

    private C28685u0(ConstraintLayout constraintLayout, AppCompatImageView appCompatImageView, LayerView layerView, PageDescriptionView pageDescriptionView, AppCompatImageView appCompatImageView2, LayerView layerView2, Button button, AppCompatImageView appCompatImageView3, LayerView layerView3) {
        this.f72996d = constraintLayout;
        this.f72997e = appCompatImageView;
        this.f72998f = layerView;
        this.f72999g = pageDescriptionView;
        this.f73000h = appCompatImageView2;
        this.f73001i = layerView2;
        this.f73002j = button;
        this.f73003k = appCompatImageView3;
        this.f73004l = layerView3;
    }

    /* renamed from: a */
    public static C28685u0 m87856a(View view) {
        int i = C10216u.biometric_check_image_view;
        AppCompatImageView appCompatImageView = (AppCompatImageView) C6202b.m24689a(view, i);
        if (appCompatImageView != null) {
            i = C10216u.biometric_layer_view;
            LayerView layerView = (LayerView) C6202b.m24689a(view, i);
            if (layerView != null) {
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
                                        return new C28685u0((ConstraintLayout) view, appCompatImageView, layerView, pageDescriptionView, appCompatImageView2, layerView2, button, appCompatImageView3, layerView3);
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
    public static C28685u0 m87857d(LayoutInflater layoutInflater) {
        return m87858e(layoutInflater, (ViewGroup) null, false);
    }

    /* renamed from: e */
    public static C28685u0 m87858e(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C10217v.fragment_setup_parameters_success, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m87856a(inflate);
    }

    /* renamed from: c */
    public ConstraintLayout mo3946b() {
        return this.f72996d;
    }
}
