package j11;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import f11.C31910d;
import f11.C31911e;
import p086g1.C6201a;
import p086g1.C6202b;
import p341ge.bog.designsystem.components.layersandshadows.LayerView;
import p341ge.bog.designsystem.components.loading.LoadingView;

/* renamed from: j11.d */
public final class C36696d implements C6201a {

    /* renamed from: d */
    private final ConstraintLayout f88566d;

    /* renamed from: e */
    public final AppCompatImageView f88567e;

    /* renamed from: f */
    public final LinearLayout f88568f;

    /* renamed from: g */
    public final LoadingView f88569g;

    /* renamed from: h */
    public final AppCompatImageView f88570h;

    /* renamed from: i */
    public final LayerView f88571i;

    /* renamed from: j */
    public final AppCompatImageView f88572j;

    /* renamed from: k */
    public final LayerView f88573k;

    /* renamed from: l */
    public final AppCompatTextView f88574l;

    /* renamed from: m */
    public final AppCompatTextView f88575m;

    private C36696d(ConstraintLayout constraintLayout, AppCompatImageView appCompatImageView, LinearLayout linearLayout, LoadingView loadingView, AppCompatImageView appCompatImageView2, LayerView layerView, AppCompatImageView appCompatImageView3, LayerView layerView2, AppCompatTextView appCompatTextView, AppCompatTextView appCompatTextView2) {
        this.f88566d = constraintLayout;
        this.f88567e = appCompatImageView;
        this.f88568f = linearLayout;
        this.f88569g = loadingView;
        this.f88570h = appCompatImageView2;
        this.f88571i = layerView;
        this.f88572j = appCompatImageView3;
        this.f88573k = layerView2;
        this.f88574l = appCompatTextView;
        this.f88575m = appCompatTextView2;
    }

    /* renamed from: a */
    public static C36696d m108830a(View view) {
        int i = C31910d.f78663a;
        AppCompatImageView appCompatImageView = (AppCompatImageView) C6202b.m24689a(view, i);
        if (appCompatImageView != null) {
            i = C31910d.f78665f;
            LinearLayout linearLayout = (LinearLayout) C6202b.m24689a(view, i);
            if (linearLayout != null) {
                i = C31910d.f78659D;
                LoadingView loadingView = (LoadingView) C6202b.m24689a(view, i);
                if (loadingView != null) {
                    i = C31910d.settings_item_edit_image;
                    AppCompatImageView appCompatImageView2 = (AppCompatImageView) C6202b.m24689a(view, i);
                    if (appCompatImageView2 != null) {
                        i = C31910d.settings_item_edit_image_layer;
                        LayerView layerView = (LayerView) C6202b.m24689a(view, i);
                        if (layerView != null) {
                            i = C31910d.settings_item_image;
                            AppCompatImageView appCompatImageView3 = (AppCompatImageView) C6202b.m24689a(view, i);
                            if (appCompatImageView3 != null) {
                                i = C31910d.settings_item_image_layer;
                                LayerView layerView2 = (LayerView) C6202b.m24689a(view, i);
                                if (layerView2 != null) {
                                    i = C31910d.f78660T;
                                    AppCompatTextView appCompatTextView = (AppCompatTextView) C6202b.m24689a(view, i);
                                    if (appCompatTextView != null) {
                                        i = C31910d.f78661X;
                                        AppCompatTextView appCompatTextView2 = (AppCompatTextView) C6202b.m24689a(view, i);
                                        if (appCompatTextView2 != null) {
                                            return new C36696d((ConstraintLayout) view, appCompatImageView, linearLayout, loadingView, appCompatImageView2, layerView, appCompatImageView3, layerView2, appCompatTextView, appCompatTextView2);
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
    public static C36696d m108831d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C31911e.item_settings, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m108830a(inflate);
    }

    /* renamed from: c */
    public ConstraintLayout mo3946b() {
        return this.f88566d;
    }
}
