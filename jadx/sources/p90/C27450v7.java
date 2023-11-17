package p90;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import p086g1.C6201a;
import p086g1.C6202b;
import p341ge.bog.mobilebank.p975ui.views.widgets.BogButton;
import p341ge.bog.mobilebank.p975ui.views.widgets.BogTextView;
import p341ge.bog.mobilebank.p975ui.views.widgets.OtpButton;
import p366bk.C10322k;

/* renamed from: p90.v7 */
public final class C27450v7 implements C6201a {

    /* renamed from: d */
    private final LinearLayout f70102d;

    /* renamed from: e */
    public final LinearLayout f70103e;

    /* renamed from: f */
    public final LinearLayout f70104f;

    /* renamed from: g */
    public final ImageView f70105g;

    /* renamed from: h */
    public final BogTextView f70106h;

    /* renamed from: i */
    public final BogTextView f70107i;

    /* renamed from: j */
    public final OtpButton f70108j;

    /* renamed from: k */
    public final BogButton f70109k;

    private C27450v7(LinearLayout linearLayout, LinearLayout linearLayout2, LinearLayout linearLayout3, ImageView imageView, BogTextView bogTextView, BogTextView bogTextView2, OtpButton otpButton, BogButton bogButton) {
        this.f70102d = linearLayout;
        this.f70103e = linearLayout2;
        this.f70104f = linearLayout3;
        this.f70105g = imageView;
        this.f70106h = bogTextView;
        this.f70107i = bogTextView2;
        this.f70108j = otpButton;
        this.f70109k = bogButton;
    }

    /* renamed from: a */
    public static C27450v7 m85107a(View view) {
        int i = C10322k.agree_wrapper;
        LinearLayout linearLayout = (LinearLayout) C6202b.m24689a(view, i);
        if (linearLayout != null) {
            i = C10322k.card_input_agree_layout;
            LinearLayout linearLayout2 = (LinearLayout) C6202b.m24689a(view, i);
            if (linearLayout2 != null) {
                i = C10322k.card_input_agree_selector;
                ImageView imageView = (ImageView) C6202b.m24689a(view, i);
                if (imageView != null) {
                    i = C10322k.card_input_agree_tv;
                    BogTextView bogTextView = (BogTextView) C6202b.m24689a(view, i);
                    if (bogTextView != null) {
                        i = C10322k.card_input_conditions_button;
                        BogTextView bogTextView2 = (BogTextView) C6202b.m24689a(view, i);
                        if (bogTextView2 != null) {
                            i = C10322k.otp_button;
                            OtpButton otpButton = (OtpButton) C6202b.m24689a(view, i);
                            if (otpButton != null) {
                                i = C10322k.otp_wizard_save_button;
                                BogButton bogButton = (BogButton) C6202b.m24689a(view, i);
                                if (bogButton != null) {
                                    return new C27450v7((LinearLayout) view, linearLayout, linearLayout2, imageView, bogTextView, bogTextView2, otpButton, bogButton);
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
    public LinearLayout mo3946b() {
        return this.f70102d;
    }
}
