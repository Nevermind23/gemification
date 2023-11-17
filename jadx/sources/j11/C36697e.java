package j11;

import android.view.View;
import android.widget.RadioButton;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import f11.C31910d;
import p086g1.C6201a;
import p086g1.C6202b;
import p341ge.bog.designsystem.components.layersandshadows.LayerView;

/* renamed from: j11.e */
public final class C36697e implements C6201a {

    /* renamed from: d */
    private final ConstraintLayout f88576d;

    /* renamed from: e */
    public final AppCompatImageView f88577e;

    /* renamed from: f */
    public final LayerView f88578f;

    /* renamed from: g */
    public final AppCompatTextView f88579g;

    /* renamed from: h */
    public final RadioButton f88580h;

    private C36697e(ConstraintLayout constraintLayout, AppCompatImageView appCompatImageView, LayerView layerView, AppCompatTextView appCompatTextView, RadioButton radioButton) {
        this.f88576d = constraintLayout;
        this.f88577e = appCompatImageView;
        this.f88578f = layerView;
        this.f88579g = appCompatTextView;
        this.f88580h = radioButton;
    }

    /* renamed from: a */
    public static C36697e m108834a(View view) {
        int i = C31910d.dark_mode_card_image;
        AppCompatImageView appCompatImageView = (AppCompatImageView) C6202b.m24689a(view, i);
        if (appCompatImageView != null) {
            i = C31910d.f78671y;
            LayerView layerView = (LayerView) C6202b.m24689a(view, i);
            if (layerView != null) {
                i = C31910d.mode_title;
                AppCompatTextView appCompatTextView = (AppCompatTextView) C6202b.m24689a(view, i);
                if (appCompatTextView != null) {
                    i = C31910d.mode_title_radio;
                    RadioButton radioButton = (RadioButton) C6202b.m24689a(view, i);
                    if (radioButton != null) {
                        return new C36697e((ConstraintLayout) view, appCompatImageView, layerView, appCompatTextView, radioButton);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: c */
    public ConstraintLayout mo3946b() {
        return this.f88576d;
    }
}
