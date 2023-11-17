package com.github.mikephil.charting.data;

import com.github.mikephil.charting.interfaces.datasets.IBubbleDataSet;
import java.util.List;

public class BubbleData extends BarLineScatterCandleBubbleData<IBubbleDataSet> {
    public BubbleData() {
    }

    public void setHighlightCircleWidth(float f) {
        for (T highlightCircleWidth : this.mDataSets) {
            highlightCircleWidth.setHighlightCircleWidth(f);
        }
    }

    public BubbleData(IBubbleDataSet... iBubbleDataSetArr) {
        super((T[]) iBubbleDataSetArr);
    }

    public BubbleData(List<IBubbleDataSet> list) {
        super(list);
    }
}
