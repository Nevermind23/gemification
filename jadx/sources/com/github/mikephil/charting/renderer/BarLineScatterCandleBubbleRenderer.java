package com.github.mikephil.charting.renderer;

import com.github.mikephil.charting.animation.ChartAnimator;
import com.github.mikephil.charting.data.DataSet;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.interfaces.dataprovider.BarLineScatterCandleBubbleDataProvider;
import com.github.mikephil.charting.interfaces.datasets.IBarLineScatterCandleBubbleDataSet;
import com.github.mikephil.charting.interfaces.datasets.IDataSet;
import com.github.mikephil.charting.utils.Utils;
import com.github.mikephil.charting.utils.ViewPortHandler;

public abstract class BarLineScatterCandleBubbleRenderer extends DataRenderer {
    protected XBounds mXBounds = new XBounds();

    protected class XBounds {
        public int max;
        public int min;
        public int range;

        protected XBounds() {
        }

        public void set(BarLineScatterCandleBubbleDataProvider barLineScatterCandleBubbleDataProvider, IBarLineScatterCandleBubbleDataSet iBarLineScatterCandleBubbleDataSet) {
            int i;
            float max2 = Math.max(Utils.FLOAT_EPSILON, Math.min(1.0f, BarLineScatterCandleBubbleRenderer.this.mAnimator.getPhaseX()));
            float lowestVisibleX = barLineScatterCandleBubbleDataProvider.getLowestVisibleX();
            float highestVisibleX = barLineScatterCandleBubbleDataProvider.getHighestVisibleX();
            Entry entryForXValue = iBarLineScatterCandleBubbleDataSet.getEntryForXValue(lowestVisibleX, Float.NaN, DataSet.Rounding.DOWN);
            Entry entryForXValue2 = iBarLineScatterCandleBubbleDataSet.getEntryForXValue(highestVisibleX, Float.NaN, DataSet.Rounding.UP);
            int i2 = 0;
            if (entryForXValue == null) {
                i = 0;
            } else {
                i = iBarLineScatterCandleBubbleDataSet.getEntryIndex(entryForXValue);
            }
            this.min = i;
            if (entryForXValue2 != null) {
                i2 = iBarLineScatterCandleBubbleDataSet.getEntryIndex(entryForXValue2);
            }
            this.max = i2;
            this.range = (int) (((float) (i2 - this.min)) * max2);
        }
    }

    public BarLineScatterCandleBubbleRenderer(ChartAnimator chartAnimator, ViewPortHandler viewPortHandler) {
        super(chartAnimator, viewPortHandler);
    }

    /* access modifiers changed from: protected */
    public boolean isInBoundsX(Entry entry, IBarLineScatterCandleBubbleDataSet iBarLineScatterCandleBubbleDataSet) {
        if (entry != null && ((float) iBarLineScatterCandleBubbleDataSet.getEntryIndex(entry)) < ((float) iBarLineScatterCandleBubbleDataSet.getEntryCount()) * this.mAnimator.getPhaseX()) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: protected */
    public boolean shouldDrawValues(IDataSet iDataSet) {
        return iDataSet.isVisible() && (iDataSet.isDrawValuesEnabled() || iDataSet.isDrawIconsEnabled());
    }
}
