package com.facetec.sdk;

import android.animation.Animator;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.BitmapFactory;
import android.graphics.drawable.GradientDrawable;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.ViewOutlineProvider;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.core.graphics.drawable.C0850l;
import androidx.core.graphics.drawable.C0851m;
import com.github.mikephil.charting.utils.Utils;
import java.util.Random;

/* renamed from: com.facetec.sdk.cw */
class C2921cw extends FrameLayout {

    /* renamed from: a */
    private ImageView f9804a;

    /* renamed from: b */
    private ImageView f9805b;

    /* renamed from: c */
    int[] f9806c = new int[0];

    /* renamed from: d */
    int f9807d = 0;

    /* renamed from: e */
    boolean f9808e = true;

    /* renamed from: f */
    private Handler f9809f;

    /* renamed from: h */
    private boolean f9810h;

    /* renamed from: j */
    private C0850l[] f9811j = new C0850l[0];

    public C2921cw(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        int i;
        int i2 = 0;
        if (C2938dc.m12274aP().length != 0) {
            this.f9809f = new Handler(Looper.getMainLooper());
            this.f9805b = new ImageView(context);
            this.f9804a = new ImageView(context);
            this.f9805b.setAlpha(1.0f);
            this.f9804a.setAlpha(Utils.FLOAT_EPSILON);
            this.f9805b.setScaleType(ImageView.ScaleType.CENTER_CROP);
            this.f9805b.setAdjustViewBounds(true);
            this.f9804a.setScaleType(ImageView.ScaleType.CENTER_CROP);
            this.f9804a.setAdjustViewBounds(true);
            this.f9810h = true;
            addView(this.f9805b);
            addView(this.f9804a);
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setCornerRadius(C2810ax.m10988b((int) (((float) C2938dc.m12463z()) * C2938dc.m12404e())));
            if (C2938dc.m12436l() == 0) {
                i = 0;
            } else {
                i = 1;
            }
            gradientDrawable.setStroke((int) C2810ax.m10988b(Math.max(i, (int) (((float) C2938dc.m12436l()) * C2938dc.m12404e()))), C2938dc.m12452s(context));
            gradientDrawable.setColor(0);
            setBackground(gradientDrawable);
            setClipToOutline(true);
            setOutlineProvider(ViewOutlineProvider.BACKGROUND);
            if (FaceTecSDK.f8630e.f8606i.enableRetryScreenSlideshowShuffle) {
                int[] aP = C2938dc.m12274aP();
                Random random = new Random();
                for (int i3 = 0; i3 < aP.length; i3++) {
                    int nextInt = random.nextInt(aP.length);
                    int i4 = aP[nextInt];
                    aP[nextInt] = aP[i3];
                    aP[i3] = i4;
                }
                this.f9806c = aP;
            } else {
                this.f9806c = C2938dc.m12274aP();
            }
            Resources resources = getResources();
            this.f9811j = new C0850l[this.f9806c.length];
            while (true) {
                int[] iArr = this.f9806c;
                if (i2 < iArr.length) {
                    this.f9811j[i2] = C0851m.m3189a(resources, BitmapFactory.decodeResource(resources, iArr[i2]));
                    i2++;
                } else {
                    this.f9805b.setImageDrawable(this.f9811j[this.f9807d]);
                    return;
                }
            }
        }
    }

    /* renamed from: d */
    private int m12201d() {
        int i = this.f9807d;
        if (i == this.f9811j.length - 1) {
            return 0;
        }
        return i + 1;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final void m12198a() {
        Handler handler;
        if (!this.f9808e) {
            if (this.f9810h) {
                this.f9804a.animate().alpha(1.0f).setDuration(800).setListener((Animator.AnimatorListener) null).start();
                this.f9805b.animate().alpha(Utils.FLOAT_EPSILON).setDuration(800).setListener((Animator.AnimatorListener) null).start();
            } else {
                this.f9804a.animate().alpha(Utils.FLOAT_EPSILON).setDuration(800).setListener((Animator.AnimatorListener) null).start();
                this.f9805b.animate().alpha(1.0f).setDuration(800).setListener((Animator.AnimatorListener) null).start();
            }
            this.f9810h = !this.f9810h;
            Handler handler2 = this.f9809f;
            if (handler2 != null) {
                handler2.postDelayed(new C3708yh(this), 800);
            }
        }
        int i = FaceTecSDK.f8630e.f8606i.retryScreenSlideshowInterval;
        if (this.f9808e) {
            i /= 2;
            this.f9808e = false;
        }
        int max = Math.max(500, i);
        if (this.f9806c.length > 1 && (handler = this.f9809f) != null) {
            handler.postDelayed(new C3729zh(this), (long) max);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final void m12202j() {
        int d = m12201d();
        this.f9807d = d;
        C0850l lVar = this.f9811j[d];
        if (this.f9810h) {
            this.f9804a.setImageDrawable(lVar);
        } else {
            this.f9805b.setImageDrawable(lVar);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo9081b() {
        Handler handler = this.f9809f;
        if (handler != null) {
            handler.removeCallbacksAndMessages((Object) null);
            this.f9809f = null;
        }
    }
}
