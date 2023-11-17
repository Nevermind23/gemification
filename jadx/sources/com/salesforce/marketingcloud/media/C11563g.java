package com.salesforce.marketingcloud.media;

import android.annotation.SuppressLint;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.ImageView;
import java.lang.ref.WeakReference;

@SuppressLint({"UnknownNullness"})
/* renamed from: com.salesforce.marketingcloud.media.g */
public class C11563g implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {

    /* renamed from: a */
    final WeakReference<ImageView> f33557a;

    /* renamed from: b */
    private final C11590t f33558b;

    /* renamed from: c */
    C11562f f33559c;

    public C11563g(C11590t tVar, ImageView imageView, C11562f fVar) {
        this.f33558b = tVar;
        this.f33557a = new WeakReference<>(imageView);
        this.f33559c = fVar;
        imageView.addOnAttachStateChangeListener(this);
        if (imageView.getWindowToken() != null) {
            imageView.getViewTreeObserver().addOnPreDrawListener(this);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo30186a() {
        this.f33559c = null;
        ImageView imageView = this.f33557a.get();
        if (imageView != null) {
            this.f33557a.clear();
            imageView.removeOnAttachStateChangeListener(this);
            ViewTreeObserver viewTreeObserver = imageView.getViewTreeObserver();
            if (viewTreeObserver.isAlive()) {
                viewTreeObserver.removeOnPreDrawListener(this);
            }
        }
    }

    public boolean onPreDraw() {
        ImageView imageView = this.f33557a.get();
        if (imageView == null) {
            return true;
        }
        ViewTreeObserver viewTreeObserver = imageView.getViewTreeObserver();
        if (!viewTreeObserver.isAlive()) {
            return true;
        }
        int width = imageView.getWidth();
        int height = imageView.getHeight();
        if (width > 0 && height > 0) {
            imageView.removeOnAttachStateChangeListener(this);
            viewTreeObserver.removeOnPreDrawListener(this);
            this.f33557a.clear();
            this.f33558b.mo30260a(width, height).mo30264a(imageView, this.f33559c);
        }
        return true;
    }

    public void onViewAttachedToWindow(View view) {
        view.getViewTreeObserver().addOnPreDrawListener(this);
    }

    public void onViewDetachedFromWindow(View view) {
        view.getViewTreeObserver().removeOnPreDrawListener(this);
    }
}
