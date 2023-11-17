package p341ge.bog.mobilebank.p975ui.views.widgets;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import g91.C32355x0;
import p366bk.C10318g;
import p366bk.C10322k;
import p366bk.C10324m;

/* renamed from: ge.bog.mobilebank.ui.views.widgets.AmexBannerView */
public class AmexBannerView extends FrameLayout {
    private int backgroundColorId = C10318g.amex_banner_default_background_color;
    private BogButton bannerButton;
    private ImageView bannerImage;
    private BogTextView bannerTitle;
    private int textColorId = C10318g.f28616A;

    public AmexBannerView(Context context) {
        super(context);
        setUpView(context);
    }

    private void setUpView(Context context) {
        View.inflate(context, C10324m.bog_banner_view, this);
        this.bannerImage = (ImageView) findViewById(C10322k.banner_image);
        this.bannerTitle = (BogTextView) findViewById(C10322k.banner_title);
        BogButton bogButton = (BogButton) findViewById(C10322k.banner_button);
        this.bannerButton = bogButton;
        bogButton.setFlat(false);
        setTextColorId(this.textColorId);
        setBackgroundColorId(this.backgroundColorId);
    }

    public void setBackgroundColorId(int i) {
        setBackgroundColor(C32355x0.m95514e(i, getContext()));
    }

    public void setImageId(int i) {
        this.bannerImage.setImageResource(i);
    }

    public void setTextColorId(int i) {
        this.bannerTitle.setTextColor(C32355x0.m95514e(i, getContext()));
    }

    public void setTitle(String str) {
        this.bannerTitle.setText(str);
    }

    public void setUpButton(String str, View.OnClickListener onClickListener) {
        this.bannerButton.setText(str);
        this.bannerButton.setOnClickListener(onClickListener);
    }

    public AmexBannerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setUpView(context);
    }
}
