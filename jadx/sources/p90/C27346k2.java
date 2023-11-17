package p90;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import p086g1.C6201a;
import p086g1.C6202b;
import p341ge.bog.mobilebank.p975ui.views.widgets.BogButton;
import p341ge.bog.mobilebank.p975ui.views.widgets.BogTextView;
import p366bk.C10322k;

/* renamed from: p90.k2 */
public final class C27346k2 implements C6201a {

    /* renamed from: d */
    private final CardView f69122d;

    /* renamed from: e */
    public final ImageView f69123e;

    /* renamed from: f */
    public final BogTextView f69124f;

    /* renamed from: g */
    public final ConstraintLayout f69125g;

    /* renamed from: h */
    public final ImageView f69126h;

    /* renamed from: i */
    public final BogTextView f69127i;

    /* renamed from: j */
    public final BogTextView f69128j;

    /* renamed from: k */
    public final CardView f69129k;

    /* renamed from: l */
    public final RelativeLayout f69130l;

    /* renamed from: m */
    public final ImageView f69131m;

    /* renamed from: n */
    public final BogButton f69132n;

    /* renamed from: o */
    public final LinearLayout f69133o;

    /* renamed from: p */
    public final BogTextView f69134p;

    /* renamed from: q */
    public final BogTextView f69135q;

    /* renamed from: r */
    public final BogTextView f69136r;

    private C27346k2(CardView cardView, ImageView imageView, BogTextView bogTextView, ConstraintLayout constraintLayout, ImageView imageView2, BogTextView bogTextView2, BogTextView bogTextView3, CardView cardView2, RelativeLayout relativeLayout, ImageView imageView3, BogButton bogButton, LinearLayout linearLayout, BogTextView bogTextView4, BogTextView bogTextView5, BogTextView bogTextView6) {
        this.f69122d = cardView;
        this.f69123e = imageView;
        this.f69124f = bogTextView;
        this.f69125g = constraintLayout;
        this.f69126h = imageView2;
        this.f69127i = bogTextView2;
        this.f69128j = bogTextView3;
        this.f69129k = cardView2;
        this.f69130l = relativeLayout;
        this.f69131m = imageView3;
        this.f69132n = bogButton;
        this.f69133o = linearLayout;
        this.f69134p = bogTextView4;
        this.f69135q = bogTextView5;
        this.f69136r = bogTextView6;
    }

    /* renamed from: a */
    public static C27346k2 m84693a(View view) {
        View view2 = view;
        int i = C10322k.bannerBackgroundImage;
        ImageView imageView = (ImageView) C6202b.m24689a(view2, i);
        if (imageView != null) {
            i = C10322k.bannerBoldTextContent;
            BogTextView bogTextView = (BogTextView) C6202b.m24689a(view2, i);
            if (bogTextView != null) {
                i = C10322k.bannerContent;
                ConstraintLayout constraintLayout = (ConstraintLayout) C6202b.m24689a(view2, i);
                if (constraintLayout != null) {
                    i = C10322k.bannerIcon;
                    ImageView imageView2 = (ImageView) C6202b.m24689a(view2, i);
                    if (imageView2 != null) {
                        i = C10322k.bannerTextContent;
                        BogTextView bogTextView2 = (BogTextView) C6202b.m24689a(view2, i);
                        if (bogTextView2 != null) {
                            i = C10322k.bannerTitle;
                            BogTextView bogTextView3 = (BogTextView) C6202b.m24689a(view2, i);
                            if (bogTextView3 != null) {
                                CardView cardView = (CardView) view2;
                                i = C10322k.buttonsContainer;
                                RelativeLayout relativeLayout = (RelativeLayout) C6202b.m24689a(view2, i);
                                if (relativeLayout != null) {
                                    i = C10322k.hideOfferBtn;
                                    ImageView imageView3 = (ImageView) C6202b.m24689a(view2, i);
                                    if (imageView3 != null) {
                                        i = C10322k.moreBtn;
                                        BogButton bogButton = (BogButton) C6202b.m24689a(view2, i);
                                        if (bogButton != null) {
                                            i = C10322k.ovalContainer;
                                            LinearLayout linearLayout = (LinearLayout) C6202b.m24689a(view2, i);
                                            if (linearLayout != null) {
                                                i = C10322k.roundedContainerRate;
                                                BogTextView bogTextView4 = (BogTextView) C6202b.m24689a(view2, i);
                                                if (bogTextView4 != null) {
                                                    i = C10322k.roundedContainerSuffix;
                                                    BogTextView bogTextView5 = (BogTextView) C6202b.m24689a(view2, i);
                                                    if (bogTextView5 != null) {
                                                        i = C10322k.roundedContainerTV;
                                                        BogTextView bogTextView6 = (BogTextView) C6202b.m24689a(view2, i);
                                                        if (bogTextView6 != null) {
                                                            return new C27346k2(cardView, imageView, bogTextView, constraintLayout, imageView2, bogTextView2, bogTextView3, cardView, relativeLayout, imageView3, bogButton, linearLayout, bogTextView4, bogTextView5, bogTextView6);
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
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: c */
    public CardView mo3946b() {
        return this.f69122d;
    }
}
