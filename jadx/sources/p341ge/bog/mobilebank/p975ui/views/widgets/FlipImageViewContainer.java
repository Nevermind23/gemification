package p341ge.bog.mobilebank.p975ui.views.widgets;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.github.mikephil.charting.utils.Utils;
import g91.C32289b0;
import g91.C32335t0;
import g91.C32355x0;
import p366bk.C10318g;
import p366bk.C10319h;
import p366bk.C10320i;
import p366bk.C10322k;
import p366bk.C10324m;
import p366bk.C10330s;

/* renamed from: ge.bog.mobilebank.ui.views.widgets.FlipImageViewContainer */
public class FlipImageViewContainer extends FrameLayout {
    private static final long ANIM_DURATION = 150;
    private static final float FLIPPED_DEGREE = 180.0f;
    private static final float HALF_FLIPPED_DEGREE = 90.0f;
    private static final float NORMAL_VIEW_DEGREE = 0.0f;
    private ObjectAnimator animation;

    /* renamed from: bg */
    private GradientDrawable f86364bg;
    private int color = -1;
    private View container;
    private FlipListener flipListener;
    private int flippedImageBorderColor = -1;
    private int flippedImageResourceID;
    private int frontImageBorderColor = -1;
    public int frontImagePlaceHolderResourceID;
    private String frontImageUrl;
    private int frontResourceId = -1;
    private int imageErrorPlaceHolderId;
    private int imagePlaceHolderId;
    public ImageView imageView;
    /* access modifiers changed from: private */
    public boolean isFlipped;
    private int strokeWidth;

    /* renamed from: ge.bog.mobilebank.ui.views.widgets.FlipImageViewContainer$FlipListener */
    public interface FlipListener {
        void onFlip(boolean z);
    }

    /* renamed from: ge.bog.mobilebank.ui.views.widgets.FlipImageViewContainer$a */
    class C35738a implements Animator.AnimatorListener {

        /* renamed from: d */
        final /* synthetic */ boolean f86365d;

        /* renamed from: e */
        final /* synthetic */ View f86366e;

        /* renamed from: f */
        final /* synthetic */ float f86367f;

        /* renamed from: g */
        final /* synthetic */ float f86368g;

        C35738a(boolean z, View view, float f, float f2) {
            this.f86365d = z;
            this.f86366e = view;
            this.f86367f = f;
            this.f86368g = f2;
        }

        public void onAnimationCancel(Animator animator) {
            animator.removeAllListeners();
            FlipImageViewContainer.this.setImageBorderColor();
            FlipImageViewContainer.this.setImageRotation();
            FlipImageViewContainer.this.setImage();
        }

        public void onAnimationEnd(Animator animator) {
            if (this.f86365d) {
                FlipImageViewContainer flipImageViewContainer = FlipImageViewContainer.this;
                flipImageViewContainer.isFlipped = !flipImageViewContainer.isFlipped();
                FlipImageViewContainer.this.setImageBorderColor();
                FlipImageViewContainer.this.setImage();
                FlipImageViewContainer flipImageViewContainer2 = FlipImageViewContainer.this;
                View view = this.f86366e;
                float f = this.f86367f;
                float f2 = this.f86368g;
                flipImageViewContainer2.flipImage(view, f + f2, f2, false);
            }
        }

        public void onAnimationRepeat(Animator animator) {
        }

        public void onAnimationStart(Animator animator) {
        }
    }

    public FlipImageViewContainer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        View.inflate(getContext(), C10324m.flip_image_layout, this);
        setUpViews(attributeSet);
    }

    /* access modifiers changed from: private */
    public void setImageBorderColor() {
        GradientDrawable gradientDrawable = new GradientDrawable();
        this.f86364bg = gradientDrawable;
        gradientDrawable.setShape(1);
        if (isFlipped()) {
            this.f86364bg.setStroke(this.strokeWidth, this.flippedImageBorderColor);
        } else {
            this.f86364bg.setStroke(this.strokeWidth, this.frontImageBorderColor);
        }
        this.container.setBackground(this.f86364bg);
    }

    /* access modifiers changed from: private */
    public void setImageRotation() {
        if (isFlipped()) {
            if (this.container.getRotationY() != FLIPPED_DEGREE) {
                this.container.setRotationY(FLIPPED_DEGREE);
            }
        } else if (this.container.getRotationY() != Utils.FLOAT_EPSILON) {
            this.container.setRotationY(Utils.FLOAT_EPSILON);
        }
    }

    private void setUpViews(AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes;
        if (!isInEditMode()) {
            if (!(attributeSet == null || (obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, C10330s.f29436t3)) == null)) {
                this.frontImagePlaceHolderResourceID = obtainStyledAttributes.getResourceId(C10330s.f29476x3, C10320i.ic_fingerprint);
                this.frontImageBorderColor = obtainStyledAttributes.getColor(C10330s.f29466w3, C32355x0.m95514e(C10318g.bog_circular_image_container_grey_color, getContext()));
                this.flippedImageResourceID = obtainStyledAttributes.getResourceId(C10330s.f29456v3, C10320i.ic_template_basket_selected);
                this.flippedImageBorderColor = obtainStyledAttributes.getColor(C10330s.f29446u3, C32335t0.m95366k(getContext()));
                obtainStyledAttributes.recycle();
            }
            this.container = findViewById(C10322k.flipper_rounded_container);
            this.imageView = (ImageView) findViewById(C10322k.rounded_image);
            this.strokeWidth = C32355x0.m95517h(C10319h.payments_circular_view_border_thickness, getContext());
            GradientDrawable gradientDrawable = new GradientDrawable();
            this.f86364bg = gradientDrawable;
            gradientDrawable.setStroke(this.strokeWidth, this.frontImageBorderColor);
            this.f86364bg.setShape(1);
            this.container.setBackground(this.f86364bg);
            this.imagePlaceHolderId = C10320i.ic_payment_template_default;
            refreshView();
        }
    }

    public void flipImage() {
        if (isFlipped()) {
            flipImage(this.container, FLIPPED_DEGREE, -90.0f, true);
        } else {
            flipImage(this.container, Utils.FLOAT_EPSILON, HALF_FLIPPED_DEGREE, true);
        }
    }

    public String getFrontImageUrl() {
        return this.frontImageUrl;
    }

    public boolean isFlipped() {
        return this.isFlipped;
    }

    public void refreshView() {
        ObjectAnimator objectAnimator = this.animation;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
        setImageBorderColor();
        setImageRotation();
        setImage();
    }

    public void setFlipListener(FlipListener flipListener2) {
        this.flipListener = flipListener2;
    }

    public void setFlipped(boolean z) {
        this.isFlipped = z;
        refreshView();
    }

    public void setFrontImageColouredResource(int i, int i2) {
        this.frontResourceId = i;
        this.color = i2;
        setImage();
    }

    public void setFrontImageUrl(String str) {
        int i = C10320i.f28688dc;
        setFrontImageUrl(str, i, i);
    }

    public void setImage() {
        if (isFlipped()) {
            ImageView imageView2 = this.imageView;
            Integer valueOf = Integer.valueOf(this.flippedImageResourceID);
            int i = C10320i.f28688dc;
            C32289b0.m95109u(imageView2, valueOf, Integer.valueOf(i), Integer.valueOf(i), true, true);
            this.imageView.setColorFilter(C32335t0.m95357b());
        } else if (this.frontImageUrl == null) {
            ImageView imageView3 = this.imageView;
            Integer valueOf2 = Integer.valueOf(this.frontResourceId);
            int i2 = C10320i.f28688dc;
            C32289b0.m95109u(imageView3, valueOf2, Integer.valueOf(i2), Integer.valueOf(i2), true, true);
            this.imageView.setColorFilter(this.color);
        } else {
            this.imageView.clearColorFilter();
            C32289b0.m95107s(this.imageView, this.frontImageUrl, Integer.valueOf(this.imagePlaceHolderId), Integer.valueOf(this.imageErrorPlaceHolderId), true, false);
        }
        FlipListener flipListener2 = this.flipListener;
        if (flipListener2 != null) {
            flipListener2.onFlip(isFlipped());
        }
    }

    public void setFrontImageUrl(String str, int i, int i2) {
        this.frontImageUrl = str;
        this.imagePlaceHolderId = i;
        this.imageErrorPlaceHolderId = i2;
        setImage();
    }

    /* access modifiers changed from: private */
    public void flipImage(View view, float f, float f2, boolean z) {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, "rotationY", new float[]{f, f + f2});
        this.animation = ofFloat;
        ofFloat.setDuration(ANIM_DURATION);
        this.animation.setInterpolator(new AccelerateDecelerateInterpolator());
        this.animation.addListener(new C35738a(z, view, f, f2));
        this.animation.start();
    }
}
