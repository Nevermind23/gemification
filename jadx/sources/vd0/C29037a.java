package vd0;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.airbnb.lottie.LottieAnimationView;
import p086g1.C6201a;
import p086g1.C6202b;
import p341ge.bog.designsystem.components.buttons.Button;
import p341ge.bog.designsystem.components.layersandshadows.LayerView;
import p341ge.bog.designsystem.components.pagedescription.PageDescriptionView;
import rd0.C28000a;
import rd0.C28001b;

/* renamed from: vd0.a */
public final class C29037a implements C6201a {

    /* renamed from: d */
    private final LayerView f74021d;

    /* renamed from: e */
    public final LottieAnimationView f74022e;

    /* renamed from: f */
    public final Button f74023f;

    /* renamed from: g */
    public final PageDescriptionView f74024g;

    /* renamed from: h */
    public final Button f74025h;

    private C29037a(LayerView layerView, LottieAnimationView lottieAnimationView, Button button, PageDescriptionView pageDescriptionView, Button button2) {
        this.f74021d = layerView;
        this.f74022e = lottieAnimationView;
        this.f74023f = button;
        this.f74024g = pageDescriptionView;
        this.f74025h = button2;
    }

    /* renamed from: a */
    public static C29037a m88860a(View view) {
        int i = C28000a.f71362a;
        LottieAnimationView lottieAnimationView = (LottieAnimationView) C6202b.m24689a(view, i);
        if (lottieAnimationView != null) {
            i = C28000a.f71363b;
            Button button = (Button) C6202b.m24689a(view, i);
            if (button != null) {
                i = C28000a.prize_description;
                PageDescriptionView pageDescriptionView = (PageDescriptionView) C6202b.m24689a(view, i);
                if (pageDescriptionView != null) {
                    i = C28000a.see_more_button;
                    Button button2 = (Button) C6202b.m24689a(view, i);
                    if (button2 != null) {
                        return new C29037a((LayerView) view, lottieAnimationView, button, pageDescriptionView, button2);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: d */
    public static C29037a m88861d(LayoutInflater layoutInflater) {
        return m88862e(layoutInflater, (ViewGroup) null, false);
    }

    /* renamed from: e */
    public static C29037a m88862e(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C28001b.fragment_end_year_dialog, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m88860a(inflate);
    }

    /* renamed from: c */
    public LayerView mo3946b() {
        return this.f74021d;
    }
}
