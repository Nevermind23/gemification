package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import java.lang.ref.WeakReference;
import p030c.C2219j;

public final class ViewStubCompat extends View {

    /* renamed from: d */
    private int f2001d;

    /* renamed from: e */
    private int f2002e;

    /* renamed from: f */
    private WeakReference f2003f;

    /* renamed from: g */
    private LayoutInflater f2004g;

    /* renamed from: androidx.appcompat.widget.ViewStubCompat$a */
    public interface C0391a {
    }

    public ViewStubCompat(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* renamed from: a */
    public View mo1898a() {
        ViewParent parent = getParent();
        if (!(parent instanceof ViewGroup)) {
            throw new IllegalStateException("ViewStub must have a non-null ViewGroup viewParent");
        } else if (this.f2001d != 0) {
            ViewGroup viewGroup = (ViewGroup) parent;
            LayoutInflater layoutInflater = this.f2004g;
            if (layoutInflater == null) {
                layoutInflater = LayoutInflater.from(getContext());
            }
            View inflate = layoutInflater.inflate(this.f2001d, viewGroup, false);
            int i = this.f2002e;
            if (i != -1) {
                inflate.setId(i);
            }
            int indexOfChild = viewGroup.indexOfChild(this);
            viewGroup.removeViewInLayout(this);
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            if (layoutParams != null) {
                viewGroup.addView(inflate, indexOfChild, layoutParams);
            } else {
                viewGroup.addView(inflate, indexOfChild);
            }
            this.f2003f = new WeakReference(inflate);
            return inflate;
        } else {
            throw new IllegalArgumentException("ViewStub must have a valid layoutResource");
        }
    }

    /* access modifiers changed from: protected */
    public void dispatchDraw(Canvas canvas) {
    }

    public void draw(Canvas canvas) {
    }

    public int getInflatedId() {
        return this.f2002e;
    }

    public LayoutInflater getLayoutInflater() {
        return this.f2004g;
    }

    public int getLayoutResource() {
        return this.f2001d;
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        setMeasuredDimension(0, 0);
    }

    public void setInflatedId(int i) {
        this.f2002e = i;
    }

    public void setLayoutInflater(LayoutInflater layoutInflater) {
        this.f2004g = layoutInflater;
    }

    public void setLayoutResource(int i) {
        this.f2001d = i;
    }

    public void setOnInflateListener(C0391a aVar) {
    }

    public void setVisibility(int i) {
        WeakReference weakReference = this.f2003f;
        if (weakReference != null) {
            View view = (View) weakReference.get();
            if (view != null) {
                view.setVisibility(i);
                return;
            }
            throw new IllegalStateException("setVisibility called on un-referenced view");
        }
        super.setVisibility(i);
        if (i == 0 || i == 4) {
            mo1898a();
        }
    }

    public ViewStubCompat(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f2001d = 0;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C2219j.f6734W3, i, 0);
        this.f2002e = obtainStyledAttributes.getResourceId(C2219j.f6749Z3, -1);
        this.f2001d = obtainStyledAttributes.getResourceId(C2219j.f6744Y3, 0);
        setId(obtainStyledAttributes.getResourceId(C2219j.f6739X3, -1));
        obtainStyledAttributes.recycle();
        setVisibility(8);
        setWillNotDraw(true);
    }
}
