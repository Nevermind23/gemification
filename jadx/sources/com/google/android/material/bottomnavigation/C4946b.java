package com.google.android.material.bottomnavigation;

import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.widget.FrameLayout;
import androidx.appcompat.view.menu.C0297g;
import androidx.core.view.ViewCompat;
import com.google.android.material.navigation.C5102a;
import com.google.android.material.navigation.C5109c;
import p009a8.C0074d;

/* renamed from: com.google.android.material.bottomnavigation.b */
public class C4946b extends C5109c {

    /* renamed from: I */
    private final int f15591I;

    /* renamed from: J */
    private final int f15592J;

    /* renamed from: K */
    private final int f15593K;

    /* renamed from: L */
    private final int f15594L;

    /* renamed from: M */
    private boolean f15595M;

    /* renamed from: N */
    private int[] f15596N = new int[5];

    public C4946b(Context context) {
        super(context);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 17;
        setLayoutParams(layoutParams);
        Resources resources = getResources();
        this.f15591I = resources.getDimensionPixelSize(C0074d.f201d);
        this.f15592J = resources.getDimensionPixelSize(C0074d.f202e);
        this.f15593K = resources.getDimensionPixelSize(C0074d.f198b);
        this.f15594L = resources.getDimensionPixelSize(C0074d.f200c);
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public C5102a mo15566g(Context context) {
        return new C4945a(context);
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int childCount = getChildCount();
        int i5 = i3 - i;
        int i6 = i4 - i2;
        int i7 = 0;
        for (int i8 = 0; i8 < childCount; i8++) {
            View childAt = getChildAt(i8);
            if (childAt.getVisibility() != 8) {
                if (ViewCompat.m3541B(this) == 1) {
                    int i9 = i5 - i7;
                    childAt.layout(i9 - childAt.getMeasuredWidth(), 0, i9, i6);
                } else {
                    childAt.layout(i7, 0, childAt.getMeasuredWidth() + i7, i6);
                }
                i7 += childAt.getMeasuredWidth();
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        int i3;
        int i4;
        int i5;
        C0297g menu = getMenu();
        int size = View.MeasureSpec.getSize(i);
        int size2 = menu.mo973G().size();
        int childCount = getChildCount();
        int size3 = View.MeasureSpec.getSize(i2);
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size3, 1073741824);
        int i6 = 1;
        if (!mo16678k(getLabelVisibilityMode(), size2) || !mo15569s()) {
            if (size2 != 0) {
                i6 = size2;
            }
            int min = Math.min(size / i6, this.f15593K);
            int i7 = size - (size2 * min);
            for (int i8 = 0; i8 < childCount; i8++) {
                if (getChildAt(i8).getVisibility() != 8) {
                    int[] iArr = this.f15596N;
                    iArr[i8] = min;
                    if (i7 > 0) {
                        iArr[i8] = min + 1;
                        i7--;
                    }
                } else {
                    this.f15596N[i8] = 0;
                }
            }
        } else {
            View childAt = getChildAt(getSelectedItemPosition());
            int i9 = this.f15594L;
            if (childAt.getVisibility() != 8) {
                childAt.measure(View.MeasureSpec.makeMeasureSpec(this.f15593K, Integer.MIN_VALUE), makeMeasureSpec);
                i9 = Math.max(i9, childAt.getMeasuredWidth());
            }
            if (childAt.getVisibility() != 8) {
                i3 = 1;
            } else {
                i3 = 0;
            }
            int i12 = size2 - i3;
            int min2 = Math.min(size - (this.f15592J * i12), Math.min(i9, this.f15593K));
            int i13 = size - min2;
            if (i12 == 0) {
                i4 = 1;
            } else {
                i4 = i12;
            }
            int min3 = Math.min(i13 / i4, this.f15591I);
            int i14 = i13 - (i12 * min3);
            for (int i15 = 0; i15 < childCount; i15++) {
                if (getChildAt(i15).getVisibility() != 8) {
                    int[] iArr2 = this.f15596N;
                    if (i15 == getSelectedItemPosition()) {
                        i5 = min2;
                    } else {
                        i5 = min3;
                    }
                    iArr2[i15] = i5;
                    if (i14 > 0) {
                        int[] iArr3 = this.f15596N;
                        iArr3[i15] = iArr3[i15] + 1;
                        i14--;
                    }
                } else {
                    this.f15596N[i15] = 0;
                }
            }
        }
        int i16 = 0;
        for (int i17 = 0; i17 < childCount; i17++) {
            View childAt2 = getChildAt(i17);
            if (childAt2.getVisibility() != 8) {
                childAt2.measure(View.MeasureSpec.makeMeasureSpec(this.f15596N[i17], 1073741824), makeMeasureSpec);
                childAt2.getLayoutParams().width = childAt2.getMeasuredWidth();
                i16 += childAt2.getMeasuredWidth();
            }
        }
        setMeasuredDimension(View.resolveSizeAndState(i16, View.MeasureSpec.makeMeasureSpec(i16, 1073741824), 0), View.resolveSizeAndState(size3, i2, 0));
    }

    /* renamed from: s */
    public boolean mo15569s() {
        return this.f15595M;
    }

    public void setItemHorizontalTranslationEnabled(boolean z) {
        this.f15595M = z;
    }
}
