package com.google.android.flexbox;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;

/* renamed from: com.google.android.flexbox.d */
public class C3793d extends RecyclerView.C1746o {

    /* renamed from: c */
    private static final int[] f11956c = {16843284};

    /* renamed from: a */
    private Drawable f11957a;

    /* renamed from: b */
    private int f11958b;

    public C3793d(Context context) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(f11956c);
        this.f11957a = obtainStyledAttributes.getDrawable(0);
        obtainStyledAttributes.recycle();
        mo11573r(3);
    }

    /* renamed from: j */
    private void m14279j(Canvas canvas, RecyclerView recyclerView) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        if (m14282m()) {
            FlexboxLayoutManager flexboxLayoutManager = (FlexboxLayoutManager) recyclerView.getLayoutManager();
            int flexDirection = flexboxLayoutManager.getFlexDirection();
            int left = recyclerView.getLeft() - recyclerView.getPaddingLeft();
            int right = recyclerView.getRight() + recyclerView.getPaddingRight();
            int childCount = recyclerView.getChildCount();
            for (int i8 = 0; i8 < childCount; i8++) {
                View childAt = recyclerView.getChildAt(i8);
                RecyclerView.C1752q qVar = (RecyclerView.C1752q) childAt.getLayoutParams();
                if (flexDirection == 3) {
                    i2 = childAt.getBottom() + qVar.bottomMargin;
                    i = this.f11957a.getIntrinsicHeight() + i2;
                } else {
                    i = childAt.getTop() - qVar.topMargin;
                    i2 = i - this.f11957a.getIntrinsicHeight();
                }
                if (!flexboxLayoutManager.mo11485k()) {
                    i5 = childAt.getLeft() - qVar.leftMargin;
                    i7 = childAt.getRight();
                    i6 = qVar.rightMargin;
                } else if (flexboxLayoutManager.mo11512J2()) {
                    i3 = Math.min(childAt.getRight() + qVar.rightMargin + this.f11957a.getIntrinsicWidth(), right);
                    i4 = childAt.getLeft() - qVar.leftMargin;
                    this.f11957a.setBounds(i4, i2, i3, i);
                    this.f11957a.draw(canvas);
                } else {
                    i5 = Math.max((childAt.getLeft() - qVar.leftMargin) - this.f11957a.getIntrinsicWidth(), left);
                    i7 = childAt.getRight();
                    i6 = qVar.rightMargin;
                }
                int i9 = i5;
                i3 = i7 + i6;
                i4 = i9;
                this.f11957a.setBounds(i4, i2, i3, i);
                this.f11957a.draw(canvas);
            }
        }
    }

    /* renamed from: k */
    private void m14280k(Canvas canvas, RecyclerView recyclerView) {
        int i;
        int i2;
        int i3;
        int i4;
        int bottom;
        int i5;
        if (m14283n()) {
            FlexboxLayoutManager flexboxLayoutManager = (FlexboxLayoutManager) recyclerView.getLayoutManager();
            int top = recyclerView.getTop() - recyclerView.getPaddingTop();
            int bottom2 = recyclerView.getBottom() + recyclerView.getPaddingBottom();
            int childCount = recyclerView.getChildCount();
            int flexDirection = flexboxLayoutManager.getFlexDirection();
            for (int i6 = 0; i6 < childCount; i6++) {
                View childAt = recyclerView.getChildAt(i6);
                RecyclerView.C1752q qVar = (RecyclerView.C1752q) childAt.getLayoutParams();
                if (flexboxLayoutManager.mo11512J2()) {
                    i2 = childAt.getRight() + qVar.rightMargin;
                    i = this.f11957a.getIntrinsicWidth() + i2;
                } else {
                    i = childAt.getLeft() - qVar.leftMargin;
                    i2 = i - this.f11957a.getIntrinsicWidth();
                }
                if (flexboxLayoutManager.mo11485k()) {
                    i3 = childAt.getTop() - qVar.topMargin;
                    bottom = childAt.getBottom();
                    i5 = qVar.bottomMargin;
                } else if (flexDirection == 3) {
                    int min = Math.min(childAt.getBottom() + qVar.bottomMargin + this.f11957a.getIntrinsicHeight(), bottom2);
                    i3 = childAt.getTop() - qVar.topMargin;
                    i4 = min;
                    this.f11957a.setBounds(i2, i3, i, i4);
                    this.f11957a.draw(canvas);
                } else {
                    i3 = Math.max((childAt.getTop() - qVar.topMargin) - this.f11957a.getIntrinsicHeight(), top);
                    bottom = childAt.getBottom();
                    i5 = qVar.bottomMargin;
                }
                i4 = bottom + i5;
                this.f11957a.setBounds(i2, i3, i, i4);
                this.f11957a.draw(canvas);
            }
        }
    }

    /* renamed from: l */
    private boolean m14281l(int i, List list, FlexboxLayoutManager flexboxLayoutManager) {
        int G2 = flexboxLayoutManager.mo11511G2(i);
        if ((G2 != -1 && G2 < flexboxLayoutManager.getFlexLinesInternal().size() && ((C3788b) flexboxLayoutManager.getFlexLinesInternal().get(G2)).f11943o == i) || i == 0) {
            return true;
        }
        if (list.size() == 0) {
            return false;
        }
        if (((C3788b) list.get(list.size() - 1)).f11944p == i - 1) {
            return true;
        }
        return false;
    }

    /* renamed from: m */
    private boolean m14282m() {
        return (this.f11958b & 1) > 0;
    }

    /* renamed from: n */
    private boolean m14283n() {
        return (this.f11958b & 2) > 0;
    }

    /* renamed from: p */
    private void m14284p(Rect rect, int i, FlexboxLayoutManager flexboxLayoutManager, List list) {
        if (list.size() != 0 && flexboxLayoutManager.mo11511G2(i) != 0) {
            if (flexboxLayoutManager.mo11485k()) {
                if (!m14282m()) {
                    rect.top = 0;
                    rect.bottom = 0;
                    return;
                }
                rect.top = this.f11957a.getIntrinsicHeight();
                rect.bottom = 0;
            } else if (m14283n()) {
                if (flexboxLayoutManager.mo11512J2()) {
                    rect.right = this.f11957a.getIntrinsicWidth();
                    rect.left = 0;
                    return;
                }
                rect.left = this.f11957a.getIntrinsicWidth();
                rect.right = 0;
            }
        }
    }

    /* renamed from: q */
    private void m14285q(Rect rect, int i, FlexboxLayoutManager flexboxLayoutManager, List list, int i2) {
        if (!m14281l(i, list, flexboxLayoutManager)) {
            if (flexboxLayoutManager.mo11485k()) {
                if (!m14283n()) {
                    rect.left = 0;
                    rect.right = 0;
                } else if (flexboxLayoutManager.mo11512J2()) {
                    rect.right = this.f11957a.getIntrinsicWidth();
                    rect.left = 0;
                } else {
                    rect.left = this.f11957a.getIntrinsicWidth();
                    rect.right = 0;
                }
            } else if (!m14282m()) {
                rect.top = 0;
                rect.bottom = 0;
            } else if (i2 == 3) {
                rect.bottom = this.f11957a.getIntrinsicHeight();
                rect.top = 0;
            } else {
                rect.top = this.f11957a.getIntrinsicHeight();
                rect.bottom = 0;
            }
        }
    }

    /* renamed from: e */
    public void mo5615e(Rect rect, View view, RecyclerView recyclerView, RecyclerView.C1726b0 b0Var) {
        int k0 = recyclerView.mo5355k0(view);
        if (k0 != 0) {
            if (m14282m() || m14283n()) {
                FlexboxLayoutManager flexboxLayoutManager = (FlexboxLayoutManager) recyclerView.getLayoutManager();
                List F2 = flexboxLayoutManager.mo11510F2();
                m14285q(rect, k0, flexboxLayoutManager, F2, flexboxLayoutManager.getFlexDirection());
                m14284p(rect, k0, flexboxLayoutManager, F2);
                return;
            }
            rect.set(0, 0, 0, 0);
        }
    }

    /* renamed from: g */
    public void mo5617g(Canvas canvas, RecyclerView recyclerView, RecyclerView.C1726b0 b0Var) {
        m14279j(canvas, recyclerView);
        m14280k(canvas, recyclerView);
    }

    /* renamed from: o */
    public void mo11572o(Drawable drawable) {
        if (drawable != null) {
            this.f11957a = drawable;
            return;
        }
        throw new IllegalArgumentException("Drawable cannot be null.");
    }

    /* renamed from: r */
    public void mo11573r(int i) {
        this.f11958b = i;
    }
}
