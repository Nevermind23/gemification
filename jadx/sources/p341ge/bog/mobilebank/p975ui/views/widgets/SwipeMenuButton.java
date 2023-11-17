package p341ge.bog.mobilebank.p975ui.views.widgets;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import g91.C32355x0;
import p366bk.C10316e;
import p366bk.C10318g;
import p366bk.C10319h;
import p366bk.C10322k;
import p366bk.C10324m;
import p642vh.C18368l;

/* renamed from: ge.bog.mobilebank.ui.views.widgets.SwipeMenuButton */
public class SwipeMenuButton extends FrameLayout {
    private int backgroundColorId;

    /* renamed from: bg */
    private GradientDrawable f86402bg;
    private int blockedImageID;
    private int borderColor = C10318g.f28649t2;
    private ImageView image;
    private View imageContainer;
    private int imageId;
    private boolean isBlocked;
    private TextView newIcon;
    private View shadowVieW;
    private boolean shouldTint;
    private int textColorId;
    private String title;
    private TextView titleView;

    public SwipeMenuButton(Context context) {
        super(context);
        setUpView(context);
    }

    private void applyPrimaryTintToImage() {
        this.image.setImageTintList(ColorStateList.valueOf(C18368l.m62755d(getContext(), C10316e.color_primary_solid_300)));
    }

    private void setUpView(Context context) {
        View.inflate(context, C10324m.swipe_menu_item_layout, this);
        this.imageContainer = findViewById(C10322k.item_button);
        this.image = (ImageView) findViewById(C10322k.item_image);
        this.titleView = (TextView) findViewById(C10322k.f28846ii);
        this.shadowVieW = findViewById(C10322k.shadow_background);
        this.newIcon = (TextView) findViewById(C10322k.newIcon);
        GradientDrawable gradientDrawable = new GradientDrawable();
        this.f86402bg = gradientDrawable;
        gradientDrawable.setShape(1);
        this.f86402bg.setStroke(C32355x0.m95516g(C10319h.payments_circular_view_border_thickness), C32355x0.m95514e(this.borderColor, getContext()));
        this.imageContainer.setBackground(this.f86402bg);
    }

    public boolean isBlocked() {
        return this.isBlocked;
    }

    public void removeShadow() {
        this.shadowVieW.setBackground((Drawable) null);
        this.shadowVieW.setPadding(0, 0, 0, 0);
    }

    public void setBackgroundColorId(int i) {
        this.backgroundColorId = i;
        this.f86402bg.setColor(C32355x0.m95514e(i, getContext()));
    }

    public void setBlocked(boolean z) {
        float f;
        int i;
        this.isBlocked = z;
        if (z) {
            f = 0.3f;
        } else {
            f = 1.0f;
        }
        setAlpha(f);
        ImageView imageView = this.image;
        if (this.isBlocked) {
            i = this.blockedImageID;
        } else {
            i = this.imageId;
        }
        imageView.setImageResource(i);
        if (!this.isBlocked && this.shouldTint) {
            applyPrimaryTintToImage();
        }
    }

    public void setBlockedImageId(int i) {
        this.blockedImageID = i;
    }

    public void setBorderColorId(int i) {
        this.borderColor = i;
        this.f86402bg.setStroke(C32355x0.m95517h(C10319h.payments_circular_view_border_thickness, getContext()), C32355x0.m95514e(this.borderColor, getContext()));
    }

    public void setImageId(int i) {
        this.imageId = i;
        if (this.isBlocked) {
            this.image.setImageResource(this.blockedImageID);
            return;
        }
        this.image.setImageResource(i);
        if (this.shouldTint) {
            applyPrimaryTintToImage();
        }
    }

    public void setImageSize(int i) {
        int g = C32355x0.m95516g(i);
        if (this.shadowVieW.getBackground() != null) {
            g += C32355x0.m95516g(C10319h.swipe_button_shadow_padding);
        }
        this.shadowVieW.setLayoutParams(new LinearLayout.LayoutParams(g, g));
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(0, -2, 1.0f);
        layoutParams.gravity = 17;
        int i2 = C10319h.swipe_button_shadow_padding;
        layoutParams.setMargins(C32355x0.m95516g(i2), 0, C32355x0.m95516g(i2), 0);
        setLayoutParams(layoutParams);
    }

    public void setMaxLines(int i) {
        this.titleView.setMaxLines(i);
        this.titleView.setMinLines(i);
    }

    public void setShouldTint(boolean z) {
        this.shouldTint = z;
    }

    public void setSize(int i) {
        int g = C32355x0.m95516g(i);
        if (this.shadowVieW.getBackground() != null) {
            g += C32355x0.m95516g(C10319h.swipe_button_shadow_padding);
        }
        this.shadowVieW.setLayoutParams(new LinearLayout.LayoutParams(g, g));
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(g, -2);
        layoutParams.gravity = 17;
        int i2 = C10319h.swipe_button_shadow_padding;
        layoutParams.setMargins(C32355x0.m95516g(i2), 0, C32355x0.m95516g(i2), 0);
        setLayoutParams(layoutParams);
    }

    public void setTextColorId(int i) {
        this.textColorId = i;
        this.titleView.setTextColor(C32355x0.m95514e(i, getContext()));
    }

    public void setTitle(String str) {
        this.title = str;
        this.titleView.setText(str);
    }

    public void setTitleTopPadding(int i) {
        this.titleView.setPadding(0, C32355x0.m95516g(i), 0, 0);
    }

    public void showNewIcon(boolean z) {
        this.newIcon.setVisibility(z ? 0 : 8);
    }

    public SwipeMenuButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setUpView(context);
    }
}
