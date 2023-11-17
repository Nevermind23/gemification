package com.medallia.digital.mobilesdk;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Movie;
import android.graphics.Paint;
import android.net.Uri;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.view.View;
import com.github.mikephil.charting.utils.Utils;

public class MDGifView extends View {
    private static final long DEFAULT_MOVIE_VIEW_DURATION = 1000;
    private int currentAnimationTime = 0;
    boolean isPaused = false;
    private boolean isVisible = true;
    private Movie movie = null;
    private float movieLeft = Utils.FLOAT_EPSILON;
    private int movieMeasuredMovieHeight = 0;
    private int movieMeasuredMovieWidth = 0;
    private float movieScale = Utils.FLOAT_EPSILON;
    private long movieStart = 0;
    private float movieTop = Utils.FLOAT_EPSILON;

    public MDGifView(Context context) {
        super(context);
    }

    private void drawMovieFrame(Canvas canvas) {
        this.movie.setTime(this.currentAnimationTime);
        canvas.save();
        float f = this.movieScale;
        canvas.scale(f, f);
        Movie movie2 = this.movie;
        float f2 = this.movieLeft;
        float f3 = this.movieScale;
        movie2.draw(canvas, f2 / f3, this.movieTop / f3);
        canvas.restore();
    }

    private void invalidateView() {
        if (this.isVisible) {
            postInvalidateOnAnimation();
        }
    }

    private void setViewAttributes(Context context, AttributeSet attributeSet, int i) {
        setLayerType(1, (Paint) null);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C10706R.styleable.MDGifImageView, i, C10706R.style.Widget_MDGifView);
        int resourceId = obtainStyledAttributes.getResourceId(C10706R.styleable.MDGifImageView_gif, -1);
        this.isPaused = obtainStyledAttributes.getBoolean(C10706R.styleable.MDGifImageView_paused, false);
        obtainStyledAttributes.recycle();
        if (resourceId != -1) {
            this.movie = Movie.decodeStream(getResources().openRawResource(resourceId));
        }
    }

    private void updateAnimationTime() {
        long uptimeMillis = SystemClock.uptimeMillis();
        if (this.movieStart == 0) {
            this.movieStart = uptimeMillis;
        }
        long duration = (long) this.movie.duration();
        if (duration == 0) {
            duration = 1000;
        }
        this.currentAnimationTime = (int) ((uptimeMillis - this.movieStart) % duration);
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        if (this.movie == null) {
            return;
        }
        if (!this.isPaused) {
            updateAnimationTime();
            drawMovieFrame(canvas);
            invalidateView();
            return;
        }
        drawMovieFrame(canvas);
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        this.movieLeft = ((float) (getWidth() - this.movieMeasuredMovieWidth)) / 2.0f;
        this.movieTop = ((float) (getHeight() - this.movieMeasuredMovieHeight)) / 2.0f;
        this.isVisible = getVisibility() == 0;
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0016, code lost:
        r6 = android.view.View.MeasureSpec.getSize(r6);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onMeasure(int r6, int r7) {
        /*
            r5 = this;
            android.graphics.Movie r0 = r5.movie
            if (r0 == 0) goto L_0x0048
            int r0 = r0.width()
            android.graphics.Movie r1 = r5.movie
            int r1 = r1.height()
            int r2 = android.view.View.MeasureSpec.getMode(r6)
            r3 = 1065353216(0x3f800000, float:1.0)
            if (r2 == 0) goto L_0x0020
            int r6 = android.view.View.MeasureSpec.getSize(r6)
            if (r0 <= r6) goto L_0x0020
            float r2 = (float) r0
            float r6 = (float) r6
            float r2 = r2 / r6
            goto L_0x0021
        L_0x0020:
            r2 = r3
        L_0x0021:
            int r6 = android.view.View.MeasureSpec.getMode(r7)
            float r6 = (float) r6
            r4 = 0
            int r6 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r6 == 0) goto L_0x0035
            int r6 = android.view.View.MeasureSpec.getSize(r7)
            if (r1 <= r6) goto L_0x0035
            float r7 = (float) r1
            float r6 = (float) r6
            float r7 = r7 / r6
            goto L_0x0036
        L_0x0035:
            r7 = r3
        L_0x0036:
            float r6 = java.lang.Math.max(r2, r7)
            float r3 = r3 / r6
            r5.movieScale = r3
            float r6 = (float) r0
            float r6 = r6 * r3
            int r6 = (int) r6
            r5.movieMeasuredMovieWidth = r6
            float r7 = (float) r1
            float r7 = r7 * r3
            int r7 = (int) r7
            r5.movieMeasuredMovieHeight = r7
            goto L_0x0050
        L_0x0048:
            int r6 = r5.getSuggestedMinimumWidth()
            int r7 = r5.getSuggestedMinimumHeight()
        L_0x0050:
            r5.setMeasuredDimension(r6, r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.medallia.digital.mobilesdk.MDGifView.onMeasure(int, int):void");
    }

    public void onScreenStateChanged(int i) {
        super.onScreenStateChanged(i);
        boolean z = true;
        if (i != 1) {
            z = false;
        }
        this.isVisible = z;
        invalidateView();
    }

    /* access modifiers changed from: protected */
    public void onVisibilityChanged(View view, int i) {
        super.onVisibilityChanged(view, i);
        this.isVisible = i == 0;
        invalidateView();
    }

    /* access modifiers changed from: protected */
    public void onWindowVisibilityChanged(int i) {
        super.onWindowVisibilityChanged(i);
        this.isVisible = i == 0;
        invalidateView();
    }

    /* access modifiers changed from: package-private */
    public void play() {
        if (this.isPaused) {
            this.isPaused = false;
            this.movieStart = SystemClock.uptimeMillis() - ((long) this.currentAnimationTime);
            invalidate();
        }
    }

    public void setGifImageUri(Uri uri) {
        try {
            this.movie = Movie.decodeStream(getContext().getContentResolver().openInputStream(uri));
            requestLayout();
        } catch (Exception e) {
            C10735b4.m39111c(e.getMessage());
        }
    }

    public MDGifView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setViewAttributes(context, attributeSet, -1);
    }

    public MDGifView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        setViewAttributes(context, attributeSet, i);
    }
}
