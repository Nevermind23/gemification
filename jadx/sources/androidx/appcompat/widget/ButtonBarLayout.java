package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import androidx.core.view.ViewCompat;
import p030c.C2215f;
import p030c.C2219j;

public class ButtonBarLayout extends LinearLayout {

    /* renamed from: d */
    private boolean f1843d;

    /* renamed from: e */
    private boolean f1844e;

    /* renamed from: f */
    private int f1845f = -1;

    public ButtonBarLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        int[] iArr = C2219j.f6686N0;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr);
        ViewCompat.m3615p0(this, context, iArr, attributeSet, obtainStyledAttributes, 0, 0);
        this.f1843d = obtainStyledAttributes.getBoolean(C2219j.f6691O0, true);
        obtainStyledAttributes.recycle();
        if (getOrientation() == 1) {
            setStacked(this.f1843d);
        }
    }

    /* renamed from: a */
    private int m1434a(int i) {
        int childCount = getChildCount();
        while (i < childCount) {
            if (getChildAt(i).getVisibility() == 0) {
                return i;
            }
            i++;
        }
        return -1;
    }

    /* renamed from: b */
    private boolean m1435b() {
        return this.f1844e;
    }

    private void setStacked(boolean z) {
        int i;
        int i2;
        if (this.f1844e == z) {
            return;
        }
        if (!z || this.f1843d) {
            this.f1844e = z;
            setOrientation(z ? 1 : 0);
            if (z) {
                i = 8388613;
            } else {
                i = 80;
            }
            setGravity(i);
            View findViewById = findViewById(C2215f.f6544G);
            if (findViewById != null) {
                if (z) {
                    i2 = 8;
                } else {
                    i2 = 4;
                }
                findViewById.setVisibility(i2);
            }
            for (int childCount = getChildCount() - 2; childCount >= 0; childCount--) {
                bringChildToFront(getChildAt(childCount));
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        boolean z;
        int i3;
        boolean z2;
        int size = View.MeasureSpec.getSize(i);
        int i4 = 0;
        if (this.f1843d) {
            if (size > this.f1845f && m1435b()) {
                setStacked(false);
            }
            this.f1845f = size;
        }
        if (m1435b() || View.MeasureSpec.getMode(i) != 1073741824) {
            i3 = i;
            z = false;
        } else {
            i3 = View.MeasureSpec.makeMeasureSpec(size, Integer.MIN_VALUE);
            z = true;
        }
        super.onMeasure(i3, i2);
        if (this.f1843d && !m1435b()) {
            if ((getMeasuredWidthAndState() & -16777216) == 16777216) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2) {
                setStacked(true);
                z = true;
            }
        }
        if (z) {
            super.onMeasure(i, i2);
        }
        int a = m1434a(0);
        if (a >= 0) {
            View childAt = getChildAt(a);
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) childAt.getLayoutParams();
            int paddingTop = getPaddingTop() + childAt.getMeasuredHeight() + layoutParams.topMargin + layoutParams.bottomMargin + 0;
            if (m1435b()) {
                int a2 = m1434a(a + 1);
                if (a2 >= 0) {
                    paddingTop += getChildAt(a2).getPaddingTop() + ((int) (getResources().getDisplayMetrics().density * 16.0f));
                }
                i4 = paddingTop;
            } else {
                i4 = paddingTop + getPaddingBottom();
            }
        }
        if (ViewCompat.m3543C(this) != i4) {
            setMinimumHeight(i4);
            if (i2 == 0) {
                super.onMeasure(i, i2);
            }
        }
    }

    public void setAllowStacking(boolean z) {
        if (this.f1843d != z) {
            this.f1843d = z;
            if (!z && m1435b()) {
                setStacked(false);
            }
            requestLayout();
        }
    }
}
