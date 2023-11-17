package androidx.recyclerview.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: androidx.recyclerview.widget.i */
public class C1806i extends RecyclerView.C1746o {

    /* renamed from: d */
    private static final int[] f5406d = {16843284};

    /* renamed from: a */
    private Drawable f5407a;

    /* renamed from: b */
    private int f5408b;

    /* renamed from: c */
    private final Rect f5409c = new Rect();

    public C1806i(Context context, int i) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(f5406d);
        Drawable drawable = obtainStyledAttributes.getDrawable(0);
        this.f5407a = drawable;
        if (drawable == null) {
            Log.w("DividerItem", "@android:attr/listDivider was not set in the theme used for this DividerItemDecoration. Please set that attribute all call setDrawable()");
        }
        obtainStyledAttributes.recycle();
        mo5986m(i);
    }

    /* renamed from: j */
    private void m6959j(Canvas canvas, RecyclerView recyclerView) {
        int i;
        int i2;
        canvas.save();
        if (recyclerView.getClipToPadding()) {
            i2 = recyclerView.getPaddingTop();
            i = recyclerView.getHeight() - recyclerView.getPaddingBottom();
            canvas.clipRect(recyclerView.getPaddingLeft(), i2, recyclerView.getWidth() - recyclerView.getPaddingRight(), i);
        } else {
            i = recyclerView.getHeight();
            i2 = 0;
        }
        int childCount = recyclerView.getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = recyclerView.getChildAt(i3);
            recyclerView.getLayoutManager().mo5669b0(childAt, this.f5409c);
            int round = this.f5409c.right + Math.round(childAt.getTranslationX());
            this.f5407a.setBounds(round - this.f5407a.getIntrinsicWidth(), i2, round, i);
            this.f5407a.draw(canvas);
        }
        canvas.restore();
    }

    /* renamed from: k */
    private void m6960k(Canvas canvas, RecyclerView recyclerView) {
        int i;
        int i2;
        canvas.save();
        if (recyclerView.getClipToPadding()) {
            i2 = recyclerView.getPaddingLeft();
            i = recyclerView.getWidth() - recyclerView.getPaddingRight();
            canvas.clipRect(i2, recyclerView.getPaddingTop(), i, recyclerView.getHeight() - recyclerView.getPaddingBottom());
        } else {
            i = recyclerView.getWidth();
            i2 = 0;
        }
        int childCount = recyclerView.getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = recyclerView.getChildAt(i3);
            recyclerView.mo5380p0(childAt, this.f5409c);
            int round = this.f5409c.bottom + Math.round(childAt.getTranslationY());
            this.f5407a.setBounds(i2, round - this.f5407a.getIntrinsicHeight(), i, round);
            this.f5407a.draw(canvas);
        }
        canvas.restore();
    }

    /* renamed from: e */
    public void mo5615e(Rect rect, View view, RecyclerView recyclerView, RecyclerView.C1726b0 b0Var) {
        Drawable drawable = this.f5407a;
        if (drawable == null) {
            rect.set(0, 0, 0, 0);
        } else if (this.f5408b == 1) {
            rect.set(0, 0, 0, drawable.getIntrinsicHeight());
        } else {
            rect.set(0, 0, drawable.getIntrinsicWidth(), 0);
        }
    }

    /* renamed from: g */
    public void mo5617g(Canvas canvas, RecyclerView recyclerView, RecyclerView.C1726b0 b0Var) {
        if (recyclerView.getLayoutManager() != null && this.f5407a != null) {
            if (this.f5408b == 1) {
                m6960k(canvas, recyclerView);
            } else {
                m6959j(canvas, recyclerView);
            }
        }
    }

    /* renamed from: l */
    public void mo5985l(Drawable drawable) {
        if (drawable != null) {
            this.f5407a = drawable;
            return;
        }
        throw new IllegalArgumentException("Drawable cannot be null.");
    }

    /* renamed from: m */
    public void mo5986m(int i) {
        if (i == 0 || i == 1) {
            this.f5408b = i;
            return;
        }
        throw new IllegalArgumentException("Invalid orientation. It should be either HORIZONTAL or VERTICAL");
    }
}
