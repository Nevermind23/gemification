package com.github.mikephil.charting.buffer;

import com.github.mikephil.charting.data.BarEntry;
import com.github.mikephil.charting.interfaces.datasets.IBarDataSet;
import com.github.mikephil.charting.utils.Utils;

public class BarBuffer extends AbstractBuffer<IBarDataSet> {
    protected float mBarWidth = 1.0f;
    protected boolean mContainsStacks;
    protected int mDataSetCount;
    protected int mDataSetIndex = 0;
    protected boolean mInverted = false;

    public BarBuffer(int i, int i2, boolean z) {
        super(i);
        this.mDataSetCount = i2;
        this.mContainsStacks = z;
    }

    /* access modifiers changed from: protected */
    public void addBar(float f, float f2, float f3, float f4) {
        float[] fArr = this.buffer;
        int i = this.index;
        int i2 = i + 1;
        fArr[i] = f;
        int i3 = i2 + 1;
        fArr[i2] = f2;
        int i4 = i3 + 1;
        fArr[i3] = f3;
        this.index = i4 + 1;
        fArr[i4] = f4;
    }

    public void setBarWidth(float f) {
        this.mBarWidth = f;
    }

    public void setDataSet(int i) {
        this.mDataSetIndex = i;
    }

    public void setInverted(boolean z) {
        this.mInverted = z;
    }

    public void feed(IBarDataSet iBarDataSet) {
        float f;
        float f2;
        float f3;
        float f4;
        float entryCount = ((float) iBarDataSet.getEntryCount()) * this.phaseX;
        float f5 = this.mBarWidth / 2.0f;
        for (int i = 0; ((float) i) < entryCount; i++) {
            BarEntry barEntry = (BarEntry) iBarDataSet.getEntryForIndex(i);
            if (barEntry != null) {
                float x = barEntry.getX();
                float y = barEntry.getY();
                float[] yVals = barEntry.getYVals();
                if (!this.mContainsStacks || yVals == null) {
                    float f6 = x - f5;
                    float f7 = x + f5;
                    if (this.mInverted) {
                        f = y >= Utils.FLOAT_EPSILON ? y : 0.0f;
                        if (y > Utils.FLOAT_EPSILON) {
                            y = 0.0f;
                        }
                    } else {
                        float f8 = y >= Utils.FLOAT_EPSILON ? y : 0.0f;
                        if (y > Utils.FLOAT_EPSILON) {
                            y = 0.0f;
                        }
                        float f9 = y;
                        y = f8;
                        f = f9;
                    }
                    if (y > Utils.FLOAT_EPSILON) {
                        y *= this.phaseY;
                    } else {
                        f *= this.phaseY;
                    }
                    addBar(f6, y, f7, f);
                } else {
                    float f12 = -barEntry.getNegativeSum();
                    float f13 = 0.0f;
                    int i2 = 0;
                    while (i2 < yVals.length) {
                        float f14 = yVals[i2];
                        int i3 = (f14 > Utils.FLOAT_EPSILON ? 1 : (f14 == Utils.FLOAT_EPSILON ? 0 : -1));
                        if (i3 == 0 && (f13 == Utils.FLOAT_EPSILON || f12 == Utils.FLOAT_EPSILON)) {
                            f2 = f14;
                            f3 = f12;
                            f12 = f2;
                        } else if (i3 >= 0) {
                            f2 = f14 + f13;
                            f3 = f12;
                            f12 = f13;
                            f13 = f2;
                        } else {
                            f2 = Math.abs(f14) + f12;
                            f3 = Math.abs(f14) + f12;
                        }
                        float f15 = x - f5;
                        float f16 = x + f5;
                        if (this.mInverted) {
                            f4 = f12 >= f2 ? f12 : f2;
                            if (f12 > f2) {
                                f12 = f2;
                            }
                        } else {
                            float f17 = f12 >= f2 ? f12 : f2;
                            if (f12 > f2) {
                                f12 = f2;
                            }
                            float f18 = f12;
                            f12 = f17;
                            f4 = f18;
                        }
                        float f19 = this.phaseY;
                        addBar(f15, f12 * f19, f16, f4 * f19);
                        i2++;
                        f12 = f3;
                    }
                }
            }
        }
        reset();
    }
}
