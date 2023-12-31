package com.github.mikephil.charting.renderer.scatter;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import com.github.mikephil.charting.interfaces.datasets.IScatterDataSet;
import com.github.mikephil.charting.utils.Utils;
import com.github.mikephil.charting.utils.ViewPortHandler;

public class TriangleShapeRenderer implements IShapeRenderer {
    protected Path mTrianglePathBuffer = new Path();

    public void renderShape(Canvas canvas, IScatterDataSet iScatterDataSet, ViewPortHandler viewPortHandler, float f, float f2, Paint paint) {
        float scatterShapeSize = iScatterDataSet.getScatterShapeSize();
        float f3 = scatterShapeSize / 2.0f;
        float convertDpToPixel = (scatterShapeSize - (Utils.convertDpToPixel(iScatterDataSet.getScatterShapeHoleRadius()) * 2.0f)) / 2.0f;
        int scatterShapeHoleColor = iScatterDataSet.getScatterShapeHoleColor();
        paint.setStyle(Paint.Style.FILL);
        Path path = this.mTrianglePathBuffer;
        path.reset();
        float f4 = f2 - f3;
        path.moveTo(f, f4);
        float f5 = f + f3;
        float f6 = f2 + f3;
        path.lineTo(f5, f6);
        float f7 = f - f3;
        path.lineTo(f7, f6);
        int i = (((double) scatterShapeSize) > Utils.DOUBLE_EPSILON ? 1 : (((double) scatterShapeSize) == Utils.DOUBLE_EPSILON ? 0 : -1));
        if (i > 0) {
            path.lineTo(f, f4);
            float f8 = f7 + convertDpToPixel;
            float f9 = f6 - convertDpToPixel;
            path.moveTo(f8, f9);
            path.lineTo(f5 - convertDpToPixel, f9);
            path.lineTo(f, f4 + convertDpToPixel);
            path.lineTo(f8, f9);
        }
        path.close();
        canvas.drawPath(path, paint);
        path.reset();
        if (i > 0 && scatterShapeHoleColor != 1122867) {
            paint.setColor(scatterShapeHoleColor);
            path.moveTo(f, f4 + convertDpToPixel);
            float f12 = f6 - convertDpToPixel;
            path.lineTo(f5 - convertDpToPixel, f12);
            path.lineTo(f7 + convertDpToPixel, f12);
            path.close();
            canvas.drawPath(path, paint);
            path.reset();
        }
    }
}
