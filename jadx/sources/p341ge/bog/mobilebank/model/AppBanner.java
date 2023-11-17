package p341ge.bog.mobilebank.model;

import android.view.View;

/* renamed from: ge.bog.mobilebank.model.AppBanner */
public class AppBanner {
    private View.OnClickListener clickListener;
    private String mButtonText;
    private String mCondition;
    private int mImageResourceId;
    private String mTitle;

    public View.OnClickListener getButtonClickListener() {
        return this.clickListener;
    }

    public String getButtonText() {
        return this.mButtonText;
    }

    public String getCondition() {
        return this.mCondition;
    }

    public int getImageResourceId() {
        return this.mImageResourceId;
    }

    public String getTitle() {
        return this.mTitle;
    }

    public void setButtonClickListener(View.OnClickListener onClickListener) {
        this.clickListener = onClickListener;
    }

    public void setButtonText(String str) {
        this.mButtonText = str;
    }

    public void setCondition(String str) {
        this.mCondition = str;
    }

    public void setImageResourceId(int i) {
        this.mImageResourceId = i;
    }

    public void setTitle(String str) {
        this.mTitle = str;
    }
}
