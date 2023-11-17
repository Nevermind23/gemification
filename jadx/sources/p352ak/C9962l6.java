package p352ak;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import com.airbnb.lottie.LottieAnimationView;
import p086g1.C6201a;
import p086g1.C6202b;
import p341ge.bog.designsystem.components.buttons.Button;
import p341ge.bog.designsystem.components.layersandshadows.LayerView;
import p341ge.bog.designsystem.components.statusbadge.StatusBadgeView;
import p601sg.C17782g;
import p601sg.C17783h;

/* renamed from: ak.l6 */
public final class C9962l6 implements C6201a {

    /* renamed from: d */
    private final LayerView f27251d;

    /* renamed from: e */
    public final Button f27252e;

    /* renamed from: f */
    public final AppCompatImageView f27253f;

    /* renamed from: g */
    public final AppCompatTextView f27254g;

    /* renamed from: h */
    public final AppCompatTextView f27255h;

    /* renamed from: i */
    public final StatusBadgeView f27256i;

    /* renamed from: j */
    public final LottieAnimationView f27257j;

    private C9962l6(LayerView layerView, Button button, AppCompatImageView appCompatImageView, AppCompatTextView appCompatTextView, AppCompatTextView appCompatTextView2, StatusBadgeView statusBadgeView, LottieAnimationView lottieAnimationView) {
        this.f27251d = layerView;
        this.f27252e = button;
        this.f27253f = appCompatImageView;
        this.f27254g = appCompatTextView;
        this.f27255h = appCompatTextView2;
        this.f27256i = statusBadgeView;
        this.f27257j = lottieAnimationView;
    }

    /* renamed from: a */
    public static C9962l6 m36537a(View view) {
        int i = C17782g.apply_button;
        Button button = (Button) C6202b.m24689a(view, i);
        if (button != null) {
            i = C17782g.f49714O1;
            AppCompatImageView appCompatImageView = (AppCompatImageView) C6202b.m24689a(view, i);
            if (appCompatImageView != null) {
                i = C17782g.f49677C2;
                AppCompatTextView appCompatTextView = (AppCompatTextView) C6202b.m24689a(view, i);
                if (appCompatTextView != null) {
                    i = C17782g.iban_number;
                    AppCompatTextView appCompatTextView2 = (AppCompatTextView) C6202b.m24689a(view, i);
                    if (appCompatTextView2 != null) {
                        i = C17782g.status_badge;
                        StatusBadgeView statusBadgeView = (StatusBadgeView) C6202b.m24689a(view, i);
                        if (statusBadgeView != null) {
                            i = C17782g.toast_illustration;
                            LottieAnimationView lottieAnimationView = (LottieAnimationView) C6202b.m24689a(view, i);
                            if (lottieAnimationView != null) {
                                return new C9962l6((LayerView) view, button, appCompatImageView, appCompatTextView, appCompatTextView2, statusBadgeView, lottieAnimationView);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: d */
    public static C9962l6 m36538d(LayoutInflater layoutInflater) {
        return m36539e(layoutInflater, (ViewGroup) null, false);
    }

    /* renamed from: e */
    public static C9962l6 m36539e(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C17783h.view_toast_notification, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m36537a(inflate);
    }

    /* renamed from: c */
    public LayerView mo3946b() {
        return this.f27251d;
    }
}
