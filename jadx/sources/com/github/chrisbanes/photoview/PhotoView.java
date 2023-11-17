package com.github.chrisbanes.photoview;

import android.content.Context;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.View;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatImageView;
import p129j5.C6709d;
import p129j5.C6710e;
import p129j5.C6711f;
import p129j5.C6712g;
import p129j5.C6713h;
import p129j5.C6714i;
import p129j5.C6715j;
import p129j5.C6716k;

public class PhotoView extends AppCompatImageView {

    /* renamed from: d */
    private C6716k f11793d;

    /* renamed from: e */
    private ImageView.ScaleType f11794e;

    public PhotoView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* renamed from: c */
    private void m13957c() {
        this.f11793d = new C6716k(this);
        super.setScaleType(ImageView.ScaleType.MATRIX);
        ImageView.ScaleType scaleType = this.f11794e;
        if (scaleType != null) {
            setScaleType(scaleType);
            this.f11794e = null;
        }
    }

    /* renamed from: d */
    public void mo10188d(float f, boolean z) {
        this.f11793d.mo20723h0(f, z);
    }

    public C6716k getAttacher() {
        return this.f11793d;
    }

    public RectF getDisplayRect() {
        return this.f11793d.mo20698B();
    }

    public Matrix getImageMatrix() {
        return this.f11793d.mo20699E();
    }

    public float getMaximumScale() {
        return this.f11793d.mo20700H();
    }

    public float getMediumScale() {
        return this.f11793d.mo20701I();
    }

    public float getMinimumScale() {
        return this.f11793d.mo20702J();
    }

    public float getScale() {
        return this.f11793d.mo20703K();
    }

    public ImageView.ScaleType getScaleType() {
        return this.f11793d.mo20704L();
    }

    public void setAllowParentInterceptOnEdge(boolean z) {
        this.f11793d.mo20705O(z);
    }

    /* access modifiers changed from: protected */
    public boolean setFrame(int i, int i2, int i3, int i4) {
        boolean frame = super.setFrame(i, i2, i3, i4);
        if (frame) {
            this.f11793d.mo20727l0();
        }
        return frame;
    }

    public void setImageDrawable(Drawable drawable) {
        super.setImageDrawable(drawable);
        C6716k kVar = this.f11793d;
        if (kVar != null) {
            kVar.mo20727l0();
        }
    }

    public void setImageResource(int i) {
        super.setImageResource(i);
        C6716k kVar = this.f11793d;
        if (kVar != null) {
            kVar.mo20727l0();
        }
    }

    public void setImageURI(Uri uri) {
        super.setImageURI(uri);
        C6716k kVar = this.f11793d;
        if (kVar != null) {
            kVar.mo20727l0();
        }
    }

    public void setMaximumScale(float f) {
        this.f11793d.mo20706Q(f);
    }

    public void setMediumScale(float f) {
        this.f11793d.mo20707R(f);
    }

    public void setMinimumScale(float f) {
        this.f11793d.mo20708S(f);
    }

    public void setOnClickListener(View.OnClickListener onClickListener) {
        this.f11793d.mo20709T(onClickListener);
    }

    public void setOnDoubleTapListener(GestureDetector.OnDoubleTapListener onDoubleTapListener) {
        this.f11793d.mo20710U(onDoubleTapListener);
    }

    public void setOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        this.f11793d.mo20711V(onLongClickListener);
    }

    public void setOnMatrixChangeListener(C6709d dVar) {
        this.f11793d.mo20712W(dVar);
    }

    public void setOnOutsidePhotoTapListener(C6710e eVar) {
        this.f11793d.mo20713X(eVar);
    }

    public void setOnPhotoTapListener(C6711f fVar) {
        this.f11793d.mo20714Y(fVar);
    }

    public void setOnScaleChangeListener(C6712g gVar) {
        this.f11793d.mo20715Z(gVar);
    }

    public void setOnSingleFlingListener(C6713h hVar) {
        this.f11793d.mo20716a0(hVar);
    }

    public void setOnViewDragListener(C6714i iVar) {
        this.f11793d.mo20717b0(iVar);
    }

    public void setOnViewTapListener(C6715j jVar) {
        this.f11793d.mo20718c0(jVar);
    }

    public void setRotationBy(float f) {
        this.f11793d.mo20719d0(f);
    }

    public void setRotationTo(float f) {
        this.f11793d.mo20720e0(f);
    }

    public void setScale(float f) {
        this.f11793d.mo20721f0(f);
    }

    public void setScaleType(ImageView.ScaleType scaleType) {
        C6716k kVar = this.f11793d;
        if (kVar == null) {
            this.f11794e = scaleType;
        } else {
            kVar.mo20724i0(scaleType);
        }
    }

    public void setZoomTransitionDuration(int i) {
        this.f11793d.mo20725j0(i);
    }

    public void setZoomable(boolean z) {
        this.f11793d.mo20726k0(z);
    }

    public PhotoView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m13957c();
    }
}
