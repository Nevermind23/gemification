package com.google.android.material.snackbar;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.support.p013v4.media.session.C0125b;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.graphics.drawable.C0836a;
import androidx.core.view.ViewCompat;
import com.google.android.material.behavior.SwipeDismissBehavior;
import com.google.android.material.internal.C5089m;
import com.google.android.material.snackbar.C5141a;
import p009a8.C0072b;
import p009a8.C0074d;
import p009a8.C0082l;
import p080f8.C6170a;
import p184n8.C7343c;
import p223q8.C7922g;
import p223q8.C7929k;
import p249s8.C8273a;

public abstract class BaseTransientBottomBar {

    /* renamed from: a */
    static final Handler f16434a = new Handler(Looper.getMainLooper(), new C5137a());

    /* renamed from: b */
    private static final boolean f16435b = false;

    /* renamed from: c */
    private static final int[] f16436c = {C0072b.f132P};

    /* renamed from: d */
    private static final String f16437d = BaseTransientBottomBar.class.getSimpleName();

    public static class Behavior extends SwipeDismissBehavior<View> {

        /* renamed from: j */
        private final C5138b f16438j = new C5138b(this);

        /* renamed from: E */
        public boolean mo15543E(View view) {
            return this.f16438j.mo16829a(view);
        }

        /* renamed from: k */
        public boolean mo3045k(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
            this.f16438j.mo16830b(coordinatorLayout, view, motionEvent);
            return super.mo3045k(coordinatorLayout, view, motionEvent);
        }
    }

    /* renamed from: com.google.android.material.snackbar.BaseTransientBottomBar$a */
    class C5137a implements Handler.Callback {
        C5137a() {
        }

        public boolean handleMessage(Message message) {
            int i = message.what;
            if (i == 0) {
                C0125b.m366a(message.obj);
                throw null;
            } else if (i != 1) {
                return false;
            } else {
                C0125b.m366a(message.obj);
                throw null;
            }
        }
    }

    /* renamed from: com.google.android.material.snackbar.BaseTransientBottomBar$b */
    public static class C5138b {
        public C5138b(SwipeDismissBehavior swipeDismissBehavior) {
            swipeDismissBehavior.mo15545K(0.1f);
            swipeDismissBehavior.mo15544J(0.6f);
            swipeDismissBehavior.mo15546L(0);
        }

        /* renamed from: a */
        public boolean mo16829a(View view) {
            return view instanceof C5139c;
        }

        /* renamed from: b */
        public void mo16830b(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked != 0) {
                if (actionMasked == 1 || actionMasked == 3) {
                    C5141a.m20134b().mo16855f((C5141a.C5143b) null);
                }
            } else if (coordinatorLayout.mo3022v(view, (int) motionEvent.getX(), (int) motionEvent.getY())) {
                C5141a.m20134b().mo16854e((C5141a.C5143b) null);
            }
        }
    }

    /* renamed from: com.google.android.material.snackbar.BaseTransientBottomBar$c */
    protected static class C5139c extends FrameLayout {

        /* renamed from: n */
        private static final View.OnTouchListener f16439n = new C5140a();

        /* renamed from: d */
        C7929k f16440d;

        /* renamed from: e */
        private int f16441e;

        /* renamed from: f */
        private final float f16442f;

        /* renamed from: g */
        private final float f16443g;

        /* renamed from: h */
        private final int f16444h;

        /* renamed from: i */
        private final int f16445i;

        /* renamed from: j */
        private ColorStateList f16446j;

        /* renamed from: k */
        private PorterDuff.Mode f16447k;

        /* renamed from: l */
        private Rect f16448l;

        /* renamed from: m */
        private boolean f16449m;

        /* renamed from: com.google.android.material.snackbar.BaseTransientBottomBar$c$a */
        class C5140a implements View.OnTouchListener {
            C5140a() {
            }

            public boolean onTouch(View view, MotionEvent motionEvent) {
                return true;
            }
        }

        protected C5139c(Context context, AttributeSet attributeSet) {
            super(C8273a.m31120c(context, attributeSet, 0, 0), attributeSet);
            Context context2 = getContext();
            TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, C0082l.f689f6);
            int i = C0082l.f759m6;
            if (obtainStyledAttributes.hasValue(i)) {
                ViewCompat.m3635z0(this, (float) obtainStyledAttributes.getDimensionPixelSize(i, 0));
            }
            this.f16441e = obtainStyledAttributes.getInt(C0082l.f719i6, 0);
            if (obtainStyledAttributes.hasValue(C0082l.f779o6) || obtainStyledAttributes.hasValue(C0082l.f789p6)) {
                this.f16440d = C7929k.m29978e(context2, attributeSet, 0, 0).mo22998m();
            }
            this.f16442f = obtainStyledAttributes.getFloat(C0082l.f729j6, 1.0f);
            setBackgroundTintList(C7343c.m28003a(context2, obtainStyledAttributes, C0082l.f739k6));
            setBackgroundTintMode(C5089m.m19906g(obtainStyledAttributes.getInt(C0082l.f749l6, -1), PorterDuff.Mode.SRC_IN));
            this.f16443g = obtainStyledAttributes.getFloat(C0082l.f709h6, 1.0f);
            this.f16444h = obtainStyledAttributes.getDimensionPixelSize(C0082l.f699g6, -1);
            this.f16445i = obtainStyledAttributes.getDimensionPixelSize(C0082l.f769n6, -1);
            obtainStyledAttributes.recycle();
            setOnTouchListener(f16439n);
            setFocusable(true);
            if (getBackground() == null) {
                ViewCompat.m3627v0(this, m20129a());
            }
        }

        /* renamed from: a */
        private Drawable m20129a() {
            Drawable drawable;
            int i = C6170a.m24588i(this, C0072b.f159r, C0072b.f156o, getBackgroundOverlayColorAlpha());
            C7929k kVar = this.f16440d;
            if (kVar != null) {
                drawable = BaseTransientBottomBar.m20124d(i, kVar);
            } else {
                drawable = BaseTransientBottomBar.m20123c(i, getResources());
            }
            if (this.f16446j == null) {
                return C0836a.m3156r(drawable);
            }
            Drawable r = C0836a.m3156r(drawable);
            C0836a.m3153o(r, this.f16446j);
            return r;
        }

        /* renamed from: b */
        private void m20130b(ViewGroup.MarginLayoutParams marginLayoutParams) {
            this.f16448l = new Rect(marginLayoutParams.leftMargin, marginLayoutParams.topMargin, marginLayoutParams.rightMargin, marginLayoutParams.bottomMargin);
        }

        private void setBaseTransientBottomBar(BaseTransientBottomBar baseTransientBottomBar) {
        }

        /* access modifiers changed from: package-private */
        public float getActionTextColorAlpha() {
            return this.f16443g;
        }

        /* access modifiers changed from: package-private */
        public int getAnimationMode() {
            return this.f16441e;
        }

        /* access modifiers changed from: package-private */
        public float getBackgroundOverlayColorAlpha() {
            return this.f16442f;
        }

        /* access modifiers changed from: package-private */
        public int getMaxInlineActionWidth() {
            return this.f16445i;
        }

        /* access modifiers changed from: package-private */
        public int getMaxWidth() {
            return this.f16444h;
        }

        /* access modifiers changed from: protected */
        public void onAttachedToWindow() {
            super.onAttachedToWindow();
            ViewCompat.m3613o0(this);
        }

        /* access modifiers changed from: protected */
        public void onDetachedFromWindow() {
            super.onDetachedFromWindow();
        }

        /* access modifiers changed from: protected */
        public void onLayout(boolean z, int i, int i2, int i3, int i4) {
            super.onLayout(z, i, i2, i3, i4);
        }

        /* access modifiers changed from: protected */
        public void onMeasure(int i, int i2) {
            int i3;
            super.onMeasure(i, i2);
            if (this.f16444h > 0 && getMeasuredWidth() > (i3 = this.f16444h)) {
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(i3, 1073741824), i2);
            }
        }

        /* access modifiers changed from: package-private */
        public void setAnimationMode(int i) {
            this.f16441e = i;
        }

        public void setBackground(Drawable drawable) {
            setBackgroundDrawable(drawable);
        }

        public void setBackgroundDrawable(Drawable drawable) {
            if (!(drawable == null || this.f16446j == null)) {
                drawable = C0836a.m3156r(drawable.mutate());
                C0836a.m3153o(drawable, this.f16446j);
                C0836a.m3154p(drawable, this.f16447k);
            }
            super.setBackgroundDrawable(drawable);
        }

        public void setBackgroundTintList(ColorStateList colorStateList) {
            this.f16446j = colorStateList;
            if (getBackground() != null) {
                Drawable r = C0836a.m3156r(getBackground().mutate());
                C0836a.m3153o(r, colorStateList);
                C0836a.m3154p(r, this.f16447k);
                if (r != getBackground()) {
                    super.setBackgroundDrawable(r);
                }
            }
        }

        public void setBackgroundTintMode(PorterDuff.Mode mode) {
            this.f16447k = mode;
            if (getBackground() != null) {
                Drawable r = C0836a.m3156r(getBackground().mutate());
                C0836a.m3154p(r, mode);
                if (r != getBackground()) {
                    super.setBackgroundDrawable(r);
                }
            }
        }

        public void setLayoutParams(ViewGroup.LayoutParams layoutParams) {
            super.setLayoutParams(layoutParams);
            if (!this.f16449m && (layoutParams instanceof ViewGroup.MarginLayoutParams)) {
                m20130b((ViewGroup.MarginLayoutParams) layoutParams);
            }
        }

        public void setOnClickListener(View.OnClickListener onClickListener) {
            View.OnTouchListener onTouchListener;
            if (onClickListener != null) {
                onTouchListener = null;
            } else {
                onTouchListener = f16439n;
            }
            setOnTouchListener(onTouchListener);
            super.setOnClickListener(onClickListener);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public static GradientDrawable m20123c(int i, Resources resources) {
        float dimension = resources.getDimension(C0074d.f211i0);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setCornerRadius(dimension);
        gradientDrawable.setColor(i);
        return gradientDrawable;
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public static C7922g m20124d(int i, C7929k kVar) {
        C7922g gVar = new C7922g(kVar);
        gVar.mo22941X(ColorStateList.valueOf(i));
        return gVar;
    }
}
