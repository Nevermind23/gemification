package p341ge.bog.mobilebank.p975ui.views.widgets;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import g91.C32335t0;
import g91.C32355x0;
import p366bk.C10316e;
import p366bk.C10319h;
import p366bk.C10322k;
import p366bk.C10324m;

/* renamed from: ge.bog.mobilebank.ui.views.widgets.PaymentBannerView */
public class PaymentBannerView extends FrameLayout {
    private int backgroundColorId = C10316e.app_banner_background;
    private BogButton bannerButton;
    private BogTextView bannerDescription;
    private BogImageView bannerImage;
    private BogTextView bannerTitle;

    /* renamed from: gr */
    private GradientDrawable f86396gr;
    private int textColorId = C10316e.app_banner_text_color;

    public PaymentBannerView(Context context) {
        super(context);
        setUpView(context);
    }

    private void setUpView(Context context) {
        View.inflate(context, C10324m.payment_banner_view, this);
        this.bannerImage = (BogImageView) findViewById(C10322k.banner_image);
        this.bannerTitle = (BogTextView) findViewById(C10322k.banner_title);
        this.bannerDescription = (BogTextView) findViewById(C10322k.banner_desc);
        this.bannerButton = (BogButton) findViewById(C10322k.banner_button);
        GradientDrawable gradientDrawable = new GradientDrawable();
        this.f86396gr = gradientDrawable;
        gradientDrawable.setShape(0);
        this.f86396gr.setColor(C32335t0.m95360e(getContext(), this.backgroundColorId, false));
        this.f86396gr.setCornerRadius((float) C32355x0.m95516g(C10319h.product_card_corner_radius));
        this.f86396gr.setStroke(C32355x0.m95516g(C10319h.loan_stroke_width), C32335t0.m95360e(getContext(), this.backgroundColorId, false));
        setBackground(this.f86396gr);
        this.bannerTitle.setTextColor(C32335t0.m95360e(getContext(), this.textColorId, false));
        this.bannerDescription.setTextColor(C32335t0.m95360e(getContext(), this.textColorId, false));
    }

    public void setDescriptionText(String str) {
        this.bannerDescription.setText(str);
    }

    public void setImageId(int i) {
        this.bannerImage.setImageResource(i);
        this.bannerImage.applyPrimaryTintSafe();
    }

    public void setTitle(String str) {
        this.bannerTitle.setText(str);
    }

    public void setUpButton(String str, View.OnClickListener onClickListener) {
        this.bannerButton.setText(str);
        this.bannerButton.setOnClickListener(onClickListener);
    }

    public PaymentBannerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setUpView(context);
    }
}
