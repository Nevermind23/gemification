package com.salesforce.marketingcloud.messages.iam;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewParent;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.view.ViewCompat;
import com.github.mikephil.charting.utils.Utils;
import com.salesforce.marketingcloud.C11302R;
import com.salesforce.marketingcloud.MCKeep;
import p001a0.C0011d;
import p292w.C8720a;

@SuppressLint({"UnknownNullness"})
@MCKeep
public class SwipeDismissConstraintLayout extends ConstraintLayout {
    private static final float DRAG_SENSITIVITY = 1.0f;
    C0011d dragHelper;
    int draggingState;
    SwipeDismissListener listener;
    float minScaledFlingVelocity;
    View swipeTarget;
    private int swipeTargetId;

    @MCKeep
    public interface SwipeDismissListener {
        void onDismissed();

        void onSwipeStarted();

        void onViewSettled();
    }

    /* renamed from: com.salesforce.marketingcloud.messages.iam.SwipeDismissConstraintLayout$a */
    public class C11632a extends C0011d.C0014c {

        /* renamed from: a */
        private int f33737a;

        public C11632a() {
        }

        /* renamed from: a */
        private boolean m42437a(View view, float f) {
            if (Math.abs(f) <= SwipeDismissConstraintLayout.this.minScaledFlingVelocity) {
                return false;
            }
            int left = view.getLeft();
            int i = this.f33737a;
            return (left < i && f < Utils.FLOAT_EPSILON) || (left > i && f > Utils.FLOAT_EPSILON);
        }

        public int clampViewPositionHorizontal(View view, int i, int i2) {
            return C8720a.m32478b(this.f33737a - view.getWidth(), i, this.f33737a + view.getWidth());
        }

        public int clampViewPositionVertical(View view, int i, int i2) {
            return view.getTop();
        }

        public int getViewHorizontalDragRange(View view) {
            return view.getWidth();
        }

        public void onViewCaptured(View view, int i) {
            this.f33737a = (int) (((float) (SwipeDismissConstraintLayout.this.getWidth() - view.getWidth())) * 0.5f);
            ViewParent parent = view.getParent();
            if (parent != null) {
                parent.requestDisallowInterceptTouchEvent(true);
            }
            SwipeDismissListener swipeDismissListener = SwipeDismissConstraintLayout.this.listener;
            if (swipeDismissListener != null) {
                swipeDismissListener.onSwipeStarted();
            }
        }

        public void onViewDragStateChanged(int i) {
            SwipeDismissConstraintLayout.this.draggingState = i;
        }

        public void onViewReleased(View view, float f, float f2) {
            boolean z;
            int i;
            int width = view.getWidth();
            if (m42437a(view, f)) {
                int x = (int) (((float) this.f33737a) - SwipeDismissConstraintLayout.this.getX());
                int left = view.getLeft();
                int i2 = this.f33737a;
                i = left < i2 ? (i2 - width) - x : i2 + width + x;
                z = true;
            } else {
                i = this.f33737a;
                z = false;
            }
            if (SwipeDismissConstraintLayout.this.dragHelper.mo40G(i, view.getTop())) {
                ViewCompat.m3603j0(view, new C11633b(view, z));
            } else {
                SwipeDismissListener swipeDismissListener = SwipeDismissConstraintLayout.this.listener;
                if (swipeDismissListener != null) {
                    if (z) {
                        swipeDismissListener.onDismissed();
                    } else {
                        swipeDismissListener.onViewSettled();
                    }
                }
            }
            SwipeDismissConstraintLayout.this.invalidate();
        }

        public boolean tryCaptureView(View view, int i) {
            return view == SwipeDismissConstraintLayout.this.swipeTarget;
        }
    }

    /* renamed from: com.salesforce.marketingcloud.messages.iam.SwipeDismissConstraintLayout$b */
    private class C11633b implements Runnable {

        /* renamed from: a */
        private final View f33739a;

        /* renamed from: b */
        private final boolean f33740b;

        C11633b(View view, boolean z) {
            this.f33739a = view;
            this.f33740b = z;
        }

        public void run() {
            C0011d dVar = SwipeDismissConstraintLayout.this.dragHelper;
            if (dVar == null || !dVar.mo46k(true)) {
                SwipeDismissListener swipeDismissListener = SwipeDismissConstraintLayout.this.listener;
                if (swipeDismissListener == null) {
                    return;
                }
                if (this.f33740b) {
                    swipeDismissListener.onDismissed();
                } else {
                    swipeDismissListener.onViewSettled();
                }
            } else {
                ViewCompat.m3603j0(this.f33739a, this);
            }
        }
    }

    public SwipeDismissConstraintLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        init(context, attributeSet);
    }

    /* JADX INFO: finally extract failed */
    private void init(Context context, AttributeSet attributeSet) {
        if (!isInEditMode()) {
            TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, C11302R.styleable.SwipeDismissConstraintLayout, 0, 0);
            try {
                this.swipeTargetId = obtainStyledAttributes.getResourceId(C11302R.styleable.SwipeDismissConstraintLayout_swipeTargetId, 0);
                obtainStyledAttributes.recycle();
                this.dragHelper = C0011d.m80l(this, 1.0f, new C11632a());
                this.minScaledFlingVelocity = (float) ViewConfiguration.get(context).getScaledMinimumFlingVelocity();
            } catch (Throwable th) {
                obtainStyledAttributes.recycle();
                throw th;
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0023, code lost:
        r2 = r2[1];
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean isTarget(android.view.MotionEvent r6) {
        /*
            r5 = this;
            android.view.View r0 = r5.swipeTarget
            r1 = 0
            if (r0 != 0) goto L_0x0006
            return r1
        L_0x0006:
            r2 = 2
            int[] r2 = new int[r2]
            r0.getLocationOnScreen(r2)
            float r0 = r6.getRawX()
            int r0 = (int) r0
            float r6 = r6.getRawY()
            int r6 = (int) r6
            r3 = r2[r1]
            if (r0 <= r3) goto L_0x0032
            android.view.View r4 = r5.swipeTarget
            int r4 = r4.getMeasuredWidth()
            int r3 = r3 + r4
            if (r0 >= r3) goto L_0x0032
            r0 = 1
            r2 = r2[r0]
            if (r6 <= r2) goto L_0x0032
            android.view.View r3 = r5.swipeTarget
            int r3 = r3.getMeasuredWidth()
            int r2 = r2 + r3
            if (r6 >= r2) goto L_0x0032
            r1 = r0
        L_0x0032:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.salesforce.marketingcloud.messages.iam.SwipeDismissConstraintLayout.isTarget(android.view.MotionEvent):boolean");
    }

    /* access modifiers changed from: package-private */
    public boolean isMoving() {
        int i = this.draggingState;
        return i == 1 || i == 2;
    }

    /* access modifiers changed from: protected */
    public void onFinishInflate() {
        this.swipeTarget = findViewById(this.swipeTargetId);
        super.onFinishInflate();
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return isTarget(motionEvent) && this.dragHelper.mo41H(motionEvent);
    }

    @SuppressLint({"ClickableViewAccessibility"})
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (!isTarget(motionEvent) && !isMoving()) {
            return super.onTouchEvent(motionEvent);
        }
        this.dragHelper.mo38A(motionEvent);
        return true;
    }

    public void setListener(SwipeDismissListener swipeDismissListener) {
        this.listener = swipeDismissListener;
    }

    public SwipeDismissConstraintLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        init(context, attributeSet);
    }
}
