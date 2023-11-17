package p90;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import p086g1.C6201a;
import p086g1.C6202b;
import p341ge.bog.mobilebank.p975ui.views.widgets.BogButton;
import p341ge.bog.mobilebank.p975ui.views.widgets.BogTextView;
import p366bk.C10322k;

/* renamed from: p90.y7 */
public final class C27477y7 implements C6201a {

    /* renamed from: d */
    private final LinearLayout f70280d;

    /* renamed from: e */
    public final LinearLayout f70281e;

    /* renamed from: f */
    public final LinearLayout f70282f;

    /* renamed from: g */
    public final ImageView f70283g;

    /* renamed from: h */
    public final BogTextView f70284h;

    /* renamed from: i */
    public final BogTextView f70285i;

    /* renamed from: j */
    public final ImageView f70286j;

    /* renamed from: k */
    public final BogTextView f70287k;

    /* renamed from: l */
    public final BogButton f70288l;

    /* renamed from: m */
    public final LinearLayout f70289m;

    /* renamed from: n */
    public final ImageView f70290n;

    /* renamed from: o */
    public final LinearLayout f70291o;

    /* renamed from: p */
    public final BogTextView f70292p;

    /* renamed from: q */
    public final LinearLayout f70293q;

    private C27477y7(LinearLayout linearLayout, LinearLayout linearLayout2, LinearLayout linearLayout3, ImageView imageView, BogTextView bogTextView, BogTextView bogTextView2, ImageView imageView2, BogTextView bogTextView3, BogButton bogButton, LinearLayout linearLayout4, ImageView imageView3, LinearLayout linearLayout5, BogTextView bogTextView4, LinearLayout linearLayout6) {
        this.f70280d = linearLayout;
        this.f70281e = linearLayout2;
        this.f70282f = linearLayout3;
        this.f70283g = imageView;
        this.f70284h = bogTextView;
        this.f70285i = bogTextView2;
        this.f70286j = imageView2;
        this.f70287k = bogTextView3;
        this.f70288l = bogButton;
        this.f70289m = linearLayout4;
        this.f70290n = imageView3;
        this.f70291o = linearLayout5;
        this.f70292p = bogTextView4;
        this.f70293q = linearLayout6;
    }

    /* renamed from: a */
    public static C27477y7 m85215a(View view) {
        View view2 = view;
        int i = C10322k.agree_selector_container;
        LinearLayout linearLayout = (LinearLayout) C6202b.m24689a(view2, i);
        if (linearLayout != null) {
            i = C10322k.card_input_agree_layout;
            LinearLayout linearLayout2 = (LinearLayout) C6202b.m24689a(view2, i);
            if (linearLayout2 != null) {
                i = C10322k.card_input_agree_selector;
                ImageView imageView = (ImageView) C6202b.m24689a(view2, i);
                if (imageView != null) {
                    i = C10322k.card_input_agree_tv;
                    BogTextView bogTextView = (BogTextView) C6202b.m24689a(view2, i);
                    if (bogTextView != null) {
                        i = C10322k.card_input_conditions_button;
                        BogTextView bogTextView2 = (BogTextView) C6202b.m24689a(view2, i);
                        if (bogTextView2 != null) {
                            i = C10322k.card_input_verify_contact_selector;
                            ImageView imageView2 = (ImageView) C6202b.m24689a(view2, i);
                            if (imageView2 != null) {
                                i = C10322k.commission_tv;
                                BogTextView bogTextView3 = (BogTextView) C6202b.m24689a(view2, i);
                                if (bogTextView3 != null) {
                                    i = C10322k.payment_btn;
                                    BogButton bogButton = (BogButton) C6202b.m24689a(view2, i);
                                    if (bogButton != null) {
                                        LinearLayout linearLayout3 = (LinearLayout) view2;
                                        i = C10322k.trusted_contact_info_img;
                                        ImageView imageView3 = (ImageView) C6202b.m24689a(view2, i);
                                        if (imageView3 != null) {
                                            i = C10322k.verify_contact_agree_layout;
                                            LinearLayout linearLayout4 = (LinearLayout) C6202b.m24689a(view2, i);
                                            if (linearLayout4 != null) {
                                                i = C10322k.verify_contact_agree_tv;
                                                BogTextView bogTextView4 = (BogTextView) C6202b.m24689a(view2, i);
                                                if (bogTextView4 != null) {
                                                    i = C10322k.verify_contact_container;
                                                    LinearLayout linearLayout5 = (LinearLayout) C6202b.m24689a(view2, i);
                                                    if (linearLayout5 != null) {
                                                        return new C27477y7(linearLayout3, linearLayout, linearLayout2, imageView, bogTextView, bogTextView2, imageView2, bogTextView3, bogButton, linearLayout3, imageView3, linearLayout4, bogTextView4, linearLayout5);
                                                    }
                                                }
                                            }
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
    public LinearLayout mo3946b() {
        return this.f70280d;
    }
}
