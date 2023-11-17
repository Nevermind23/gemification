package p352ak;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import p086g1.C6201a;
import p086g1.C6202b;
import p341ge.bog.designsystem.components.layersandshadows.LayerView;
import p601sg.C17782g;
import p601sg.C17783h;

/* renamed from: ak.o */
public final class C9979o implements C6201a {

    /* renamed from: d */
    private final View f27328d;

    /* renamed from: e */
    public final AppCompatTextView f27329e;

    /* renamed from: f */
    public final AppCompatTextView f27330f;

    /* renamed from: g */
    public final AppCompatTextView f27331g;

    /* renamed from: h */
    public final AppCompatImageView f27332h;

    /* renamed from: i */
    public final LayerView f27333i;

    /* renamed from: j */
    public final ConstraintLayout f27334j;

    /* renamed from: k */
    public final LinearLayout f27335k;

    /* renamed from: l */
    public final AppCompatTextView f27336l;

    /* renamed from: m */
    public final AppCompatTextView f27337m;

    private C9979o(View view, AppCompatTextView appCompatTextView, AppCompatTextView appCompatTextView2, AppCompatTextView appCompatTextView3, AppCompatImageView appCompatImageView, LayerView layerView, ConstraintLayout constraintLayout, LinearLayout linearLayout, AppCompatTextView appCompatTextView4, AppCompatTextView appCompatTextView5) {
        this.f27328d = view;
        this.f27329e = appCompatTextView;
        this.f27330f = appCompatTextView2;
        this.f27331g = appCompatTextView3;
        this.f27332h = appCompatImageView;
        this.f27333i = layerView;
        this.f27334j = constraintLayout;
        this.f27335k = linearLayout;
        this.f27336l = appCompatTextView4;
        this.f27337m = appCompatTextView5;
    }

    /* renamed from: a */
    public static C9979o m36600a(View view) {
        int i = C17782g.amount_desc;
        AppCompatTextView appCompatTextView = (AppCompatTextView) C6202b.m24689a(view, i);
        if (appCompatTextView != null) {
            i = C17782g.f49695J;
            AppCompatTextView appCompatTextView2 = (AppCompatTextView) C6202b.m24689a(view, i);
            if (appCompatTextView2 != null) {
                i = C17782g.f49708N;
                AppCompatTextView appCompatTextView3 = (AppCompatTextView) C6202b.m24689a(view, i);
                if (appCompatTextView3 != null) {
                    i = C17782g.f49744Y3;
                    AppCompatImageView appCompatImageView = (AppCompatImageView) C6202b.m24689a(view, i);
                    if (appCompatImageView != null) {
                        i = C17782g.f49764i4;
                        LayerView layerView = (LayerView) C6202b.m24689a(view, i);
                        if (layerView != null) {
                            i = C17782g.f49690H4;
                            ConstraintLayout constraintLayout = (ConstraintLayout) C6202b.m24689a(view, i);
                            if (constraintLayout != null) {
                                i = C17782g.f49675B5;
                                LinearLayout linearLayout = (LinearLayout) C6202b.m24689a(view, i);
                                if (linearLayout != null) {
                                    i = C17782g.f49745Y8;
                                    AppCompatTextView appCompatTextView4 = (AppCompatTextView) C6202b.m24689a(view, i);
                                    if (appCompatTextView4 != null) {
                                        i = C17782g.title_description;
                                        AppCompatTextView appCompatTextView5 = (AppCompatTextView) C6202b.m24689a(view, i);
                                        if (appCompatTextView5 != null) {
                                            return new C9979o(view, appCompatTextView, appCompatTextView2, appCompatTextView3, appCompatImageView, layerView, constraintLayout, linearLayout, appCompatTextView4, appCompatTextView5);
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

    /* renamed from: c */
    public static C9979o m36601c(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (viewGroup != null) {
            layoutInflater.inflate(C17783h.item_oval_icon_toggle_list, viewGroup);
            return m36600a(viewGroup);
        }
        throw new NullPointerException("parent");
    }

    /* renamed from: b */
    public View mo3946b() {
        return this.f27328d;
    }
}
