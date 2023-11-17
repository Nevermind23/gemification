package p341ge.bog.mobilebank.p975ui.views.widgets;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.content.Context;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.Interpolator;
import android.widget.LinearLayout;
import androidx.viewpager.widget.ViewPager;
import p366bk.C10314c;
import p366bk.C10320i;
import p366bk.C10330s;

/* renamed from: ge.bog.mobilebank.ui.views.widgets.CircleIndicator */
public class CircleIndicator extends LinearLayout {
    private static final int DEFAULT_INDICATOR_WIDTH = 5;
    /* access modifiers changed from: private */
    public Animator mAnimatorIn;
    /* access modifiers changed from: private */
    public Animator mAnimatorOut;
    private int mAnimatorResId = C10314c.scale_with_alpha;
    private int mAnimatorReverseResId = 0;
    private Animator mImmediateAnimatorIn;
    private Animator mImmediateAnimatorOut;
    /* access modifiers changed from: private */
    public int mIndicatorBackgroundResId;
    private int mIndicatorHeight = -1;
    private int mIndicatorMargin = -1;
    /* access modifiers changed from: private */
    public int mIndicatorUnselectedBackgroundResId;
    private int mIndicatorWidth = -1;
    private DataSetObserver mInternalDataSetObserver;
    private final ViewPager.C1902j mInternalPageChangeListener;
    /* access modifiers changed from: private */
    public int mLastPosition;
    /* access modifiers changed from: private */
    public ViewPager mViewpager;

    /* renamed from: ge.bog.mobilebank.ui.views.widgets.CircleIndicator$a */
    class C35729a implements ViewPager.C1902j {
        C35729a() {
        }

        /* renamed from: L */
        public void mo6548L(int i, float f, int i2) {
        }

        /* renamed from: Q */
        public void mo6549Q(int i) {
            if (CircleIndicator.this.mViewpager.getAdapter() != null && CircleIndicator.this.mViewpager.getAdapter().mo6557d() > 0) {
                if (CircleIndicator.this.mAnimatorIn.isRunning()) {
                    CircleIndicator.this.mAnimatorIn.end();
                    CircleIndicator.this.mAnimatorIn.cancel();
                }
                if (CircleIndicator.this.mAnimatorOut.isRunning()) {
                    CircleIndicator.this.mAnimatorOut.end();
                    CircleIndicator.this.mAnimatorOut.cancel();
                }
                if (CircleIndicator.this.mLastPosition >= 0) {
                    CircleIndicator circleIndicator = CircleIndicator.this;
                    View childAt = circleIndicator.getChildAt(circleIndicator.mLastPosition);
                    if (childAt != null) {
                        childAt.setBackgroundResource(CircleIndicator.this.mIndicatorUnselectedBackgroundResId);
                        CircleIndicator.this.mAnimatorIn.setTarget(childAt);
                        CircleIndicator.this.mAnimatorIn.start();
                    }
                }
                View childAt2 = CircleIndicator.this.getChildAt(i);
                if (childAt2 != null) {
                    childAt2.setBackgroundResource(CircleIndicator.this.mIndicatorBackgroundResId);
                    CircleIndicator.this.mAnimatorOut.setTarget(childAt2);
                    CircleIndicator.this.mAnimatorOut.start();
                }
                CircleIndicator.this.mLastPosition = i;
            }
        }

        /* renamed from: l0 */
        public void mo6550l0(int i) {
        }
    }

    /* renamed from: ge.bog.mobilebank.ui.views.widgets.CircleIndicator$b */
    class C35730b extends DataSetObserver {
        C35730b() {
        }

        public void onChanged() {
            int d;
            super.onChanged();
            if (CircleIndicator.this.mViewpager != null && (d = CircleIndicator.this.mViewpager.getAdapter().mo6557d()) != CircleIndicator.this.getChildCount()) {
                if (CircleIndicator.this.mLastPosition < d) {
                    CircleIndicator circleIndicator = CircleIndicator.this;
                    circleIndicator.mLastPosition = circleIndicator.mViewpager.getCurrentItem();
                } else {
                    CircleIndicator.this.mLastPosition = -1;
                }
                CircleIndicator.this.createIndicators();
            }
        }
    }

    /* renamed from: ge.bog.mobilebank.ui.views.widgets.CircleIndicator$c */
    private class C35731c implements Interpolator {
        public float getInterpolation(float f) {
            return Math.abs(1.0f - f);
        }

        private C35731c() {
        }
    }

    public CircleIndicator(Context context) {
        super(context);
        int i = C10320i.white_radius;
        this.mIndicatorBackgroundResId = i;
        this.mIndicatorUnselectedBackgroundResId = i;
        this.mLastPosition = -1;
        this.mInternalPageChangeListener = new C35729a();
        this.mInternalDataSetObserver = new C35730b();
        init(context, (AttributeSet) null);
    }

    private void addIndicator(int i, int i2, Animator animator) {
        if (animator.isRunning()) {
            animator.end();
            animator.cancel();
        }
        View view = new View(getContext());
        view.setBackgroundResource(i2);
        addView(view, this.mIndicatorWidth, this.mIndicatorHeight);
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) view.getLayoutParams();
        if (i == 0) {
            int i3 = this.mIndicatorMargin;
            layoutParams.leftMargin = i3;
            layoutParams.rightMargin = i3;
        } else {
            int i4 = this.mIndicatorMargin;
            layoutParams.topMargin = i4;
            layoutParams.bottomMargin = i4;
        }
        view.setLayoutParams(layoutParams);
        animator.setTarget(view);
        animator.start();
    }

    private void checkIndicatorConfig(Context context) {
        int i = this.mIndicatorWidth;
        if (i < 0) {
            i = dip2px(5.0f);
        }
        this.mIndicatorWidth = i;
        int i2 = this.mIndicatorHeight;
        if (i2 < 0) {
            i2 = dip2px(5.0f);
        }
        this.mIndicatorHeight = i2;
        int i3 = this.mIndicatorMargin;
        if (i3 < 0) {
            i3 = dip2px(5.0f);
        }
        this.mIndicatorMargin = i3;
        int i4 = this.mAnimatorResId;
        if (i4 == 0) {
            i4 = C10314c.scale_with_alpha;
        }
        this.mAnimatorResId = i4;
        this.mAnimatorOut = createAnimatorOut(context);
        Animator createAnimatorOut = createAnimatorOut(context);
        this.mImmediateAnimatorOut = createAnimatorOut;
        createAnimatorOut.setDuration(0);
        this.mAnimatorIn = createAnimatorIn(context);
        Animator createAnimatorIn = createAnimatorIn(context);
        this.mImmediateAnimatorIn = createAnimatorIn;
        createAnimatorIn.setDuration(0);
        int i5 = this.mIndicatorBackgroundResId;
        if (i5 == 0) {
            i5 = C10320i.white_radius;
        }
        this.mIndicatorBackgroundResId = i5;
        int i6 = this.mIndicatorUnselectedBackgroundResId;
        if (i6 != 0) {
            i5 = i6;
        }
        this.mIndicatorUnselectedBackgroundResId = i5;
    }

    private Animator createAnimatorIn(Context context) {
        int i = this.mAnimatorReverseResId;
        if (i != 0) {
            return AnimatorInflater.loadAnimator(context, i);
        }
        Animator loadAnimator = AnimatorInflater.loadAnimator(context, this.mAnimatorResId);
        loadAnimator.setInterpolator(new C35731c());
        return loadAnimator;
    }

    private Animator createAnimatorOut(Context context) {
        return AnimatorInflater.loadAnimator(context, this.mAnimatorResId);
    }

    /* access modifiers changed from: private */
    public void createIndicators() {
        removeAllViews();
        int d = this.mViewpager.getAdapter().mo6557d();
        if (d > 0) {
            int currentItem = this.mViewpager.getCurrentItem();
            int orientation = getOrientation();
            for (int i = 0; i < d; i++) {
                if (currentItem == i) {
                    addIndicator(orientation, this.mIndicatorBackgroundResId, this.mImmediateAnimatorOut);
                } else {
                    addIndicator(orientation, this.mIndicatorUnselectedBackgroundResId, this.mImmediateAnimatorIn);
                }
            }
        }
    }

    private void handleTypedArray(Context context, AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C10330s.f29080K1);
            this.mIndicatorWidth = obtainStyledAttributes.getDimensionPixelSize(C10330s.f29170T1, -1);
            this.mIndicatorHeight = obtainStyledAttributes.getDimensionPixelSize(C10330s.f29140Q1, -1);
            this.mIndicatorMargin = obtainStyledAttributes.getDimensionPixelSize(C10330s.f29150R1, -1);
            this.mAnimatorResId = obtainStyledAttributes.getResourceId(C10330s.f29090L1, C10314c.scale_with_alpha);
            int i = 0;
            this.mAnimatorReverseResId = obtainStyledAttributes.getResourceId(C10330s.f29100M1, 0);
            int resourceId = obtainStyledAttributes.getResourceId(C10330s.f29110N1, C10320i.white_radius);
            this.mIndicatorBackgroundResId = resourceId;
            this.mIndicatorUnselectedBackgroundResId = obtainStyledAttributes.getResourceId(C10330s.f29120O1, resourceId);
            if (obtainStyledAttributes.getInt(C10330s.f29160S1, -1) == 1) {
                i = 1;
            }
            setOrientation(i);
            int i2 = obtainStyledAttributes.getInt(C10330s.f29130P1, -1);
            if (i2 < 0) {
                i2 = 17;
            }
            setGravity(i2);
            obtainStyledAttributes.recycle();
        }
    }

    private void init(Context context, AttributeSet attributeSet) {
        handleTypedArray(context, attributeSet);
        checkIndicatorConfig(context);
    }

    public void configureIndicator(int i, int i2, int i3) {
        int i4 = C10314c.scale_with_alpha;
        int i5 = C10320i.white_radius;
        configureIndicator(i, i2, i3, i4, 0, i5, i5);
    }

    public int dip2px(float f) {
        return (int) ((f * getResources().getDisplayMetrics().density) + 0.5f);
    }

    public DataSetObserver getDataSetObserver() {
        return this.mInternalDataSetObserver;
    }

    @Deprecated
    public void setOnPageChangeListener(ViewPager.C1902j jVar) {
        ViewPager viewPager = this.mViewpager;
        if (viewPager != null) {
            viewPager.removeOnPageChangeListener(jVar);
            this.mViewpager.addOnPageChangeListener(jVar);
            return;
        }
        throw new NullPointerException("can not find Viewpager , setViewPager first");
    }

    public void setViewPager(ViewPager viewPager) {
        this.mViewpager = viewPager;
        if (viewPager != null && viewPager.getAdapter() != null) {
            this.mLastPosition = -1;
            createIndicators();
            this.mViewpager.removeOnPageChangeListener(this.mInternalPageChangeListener);
            this.mViewpager.addOnPageChangeListener(this.mInternalPageChangeListener);
            this.mInternalPageChangeListener.mo6549Q(this.mViewpager.getCurrentItem());
        }
    }

    public void configureIndicator(int i, int i2, int i3, int i4, int i5, int i6, int i7) {
        this.mIndicatorWidth = i;
        this.mIndicatorHeight = i2;
        this.mIndicatorMargin = i3;
        this.mAnimatorResId = i4;
        this.mAnimatorReverseResId = i5;
        this.mIndicatorBackgroundResId = i6;
        this.mIndicatorUnselectedBackgroundResId = i7;
        checkIndicatorConfig(getContext());
    }

    public CircleIndicator(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        int i = C10320i.white_radius;
        this.mIndicatorBackgroundResId = i;
        this.mIndicatorUnselectedBackgroundResId = i;
        this.mLastPosition = -1;
        this.mInternalPageChangeListener = new C35729a();
        this.mInternalDataSetObserver = new C35730b();
        init(context, attributeSet);
    }

    public CircleIndicator(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        int i2 = C10320i.white_radius;
        this.mIndicatorBackgroundResId = i2;
        this.mIndicatorUnselectedBackgroundResId = i2;
        this.mLastPosition = -1;
        this.mInternalPageChangeListener = new C35729a();
        this.mInternalDataSetObserver = new C35730b();
        init(context, attributeSet);
    }

    public CircleIndicator(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        int i3 = C10320i.white_radius;
        this.mIndicatorBackgroundResId = i3;
        this.mIndicatorUnselectedBackgroundResId = i3;
        this.mLastPosition = -1;
        this.mInternalPageChangeListener = new C35729a();
        this.mInternalDataSetObserver = new C35730b();
        init(context, attributeSet);
    }
}
