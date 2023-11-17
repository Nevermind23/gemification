package b31;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.airbnb.lottie.LottieAnimationView;
import p086g1.C6201a;
import p086g1.C6202b;
import p341ge.bog.designsystem.components.buttons.Button;
import p341ge.bog.designsystem.components.layersandshadows.LayerView;
import p341ge.bog.designsystem.components.pagedescription.PageDescriptionView;
import x11.C39771d;
import x11.C39772e;

/* renamed from: b31.f */
public final class C31117f implements C6201a {

    /* renamed from: d */
    private final LayerView f77332d;

    /* renamed from: e */
    public final PageDescriptionView f77333e;

    /* renamed from: f */
    public final LottieAnimationView f77334f;

    /* renamed from: g */
    public final Button f77335g;

    private C31117f(LayerView layerView, PageDescriptionView pageDescriptionView, LottieAnimationView lottieAnimationView, Button button) {
        this.f77332d = layerView;
        this.f77333e = pageDescriptionView;
        this.f77334f = lottieAnimationView;
        this.f77335g = button;
    }

    /* renamed from: a */
    public static C31117f m92586a(View view) {
        int i = C39771d.happy_birthday_description;
        PageDescriptionView pageDescriptionView = (PageDescriptionView) C6202b.m24689a(view, i);
        if (pageDescriptionView != null) {
            i = C39771d.f94474n;
            LottieAnimationView lottieAnimationView = (LottieAnimationView) C6202b.m24689a(view, i);
            if (lottieAnimationView != null) {
                i = C39771d.thanks_button;
                Button button = (Button) C6202b.m24689a(view, i);
                if (button != null) {
                    return new C31117f((LayerView) view, pageDescriptionView, lottieAnimationView, button);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: d */
    public static C31117f m92587d(LayoutInflater layoutInflater) {
        return m92588e(layoutInflater, (ViewGroup) null, false);
    }

    /* renamed from: e */
    public static C31117f m92588e(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C39772e.fragment_birthday_popup, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m92586a(inflate);
    }

    /* renamed from: c */
    public LayerView mo3946b() {
        return this.f77332d;
    }
}
