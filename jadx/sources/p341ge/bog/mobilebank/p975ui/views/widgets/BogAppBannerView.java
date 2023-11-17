package p341ge.bog.mobilebank.p975ui.views.widgets;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import g91.C32355x0;
import p341ge.bog.mobilebank.model.AppBanner;
import p366bk.C10318g;
import p366bk.C10322k;
import p366bk.C10324m;

/* renamed from: ge.bog.mobilebank.ui.views.widgets.BogAppBannerView */
public class BogAppBannerView extends LinearLayout {
    private int backgroundColorId = C10318g.banner_background_black;
    private BogButton bannerButton;
    private BogTextView bannerDescription;
    private ImageView bannerImage;
    private BogTextView bannerTitle;
    private int textColorId = C10318g.f28616A;

    public BogAppBannerView(Context context) {
        super(context);
        setUpView(context);
    }

    private void setUpView(Context context) {
        View.inflate(context, C10324m.banner_apss_item, this);
        this.bannerImage = (ImageView) findViewById(C10322k.banner_apps_image);
        this.bannerTitle = (BogTextView) findViewById(C10322k.banner_apps_title);
        this.bannerDescription = (BogTextView) findViewById(C10322k.banner_apps_condition);
        BogButton bogButton = (BogButton) findViewById(C10322k.banner_app_button);
        this.bannerButton = bogButton;
        bogButton.setFlat(false);
        setBackgroundColorId(this.backgroundColorId);
        setTextColorId(this.textColorId);
    }

    public void setBackgroundColorId(int i) {
        setBackgroundColor(C32355x0.m95514e(i, getContext()));
    }

    public void setBanner(AppBanner appBanner) {
        setBannerTexts(appBanner.getTitle(), appBanner.getCondition());
        setUpButton(appBanner.getButtonText(), appBanner.getButtonClickListener());
        setImageId(appBanner.getImageResourceId());
    }

    public void setBannerTexts(String str, String str2) {
        this.bannerTitle.setText(str);
        this.bannerDescription.setText(str2);
    }

    public void setImageId(int i) {
        this.bannerImage.setImageResource(i);
    }

    public void setTextColorId(int i) {
        this.bannerTitle.setTextColor(C32355x0.m95514e(i, getContext()));
        this.bannerDescription.setTextColor(C32355x0.m95514e(i, getContext()));
    }

    public void setUpButton(String str, View.OnClickListener onClickListener) {
        this.bannerButton.setText(str);
        this.bannerButton.setOnClickListener(onClickListener);
    }

    public BogAppBannerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setUpView(context);
    }
}
