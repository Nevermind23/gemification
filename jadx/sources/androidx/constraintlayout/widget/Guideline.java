package androidx.constraintlayout.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;

public class Guideline extends View {

    /* renamed from: d */
    private boolean f2574d = true;

    public Guideline(Context context) {
        super(context);
        super.setVisibility(8);
    }

    public void draw(Canvas canvas) {
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        setMeasuredDimension(0, 0);
    }

    public void setFilterRedundantCalls(boolean z) {
        this.f2574d = z;
    }

    public void setGuidelineBegin(int i) {
        ConstraintLayout.C0620b bVar = (ConstraintLayout.C0620b) getLayoutParams();
        if (!this.f2574d || bVar.f2516a != i) {
            bVar.f2516a = i;
            setLayoutParams(bVar);
        }
    }

    public void setGuidelineEnd(int i) {
        ConstraintLayout.C0620b bVar = (ConstraintLayout.C0620b) getLayoutParams();
        if (!this.f2574d || bVar.f2518b != i) {
            bVar.f2518b = i;
            setLayoutParams(bVar);
        }
    }

    public void setGuidelinePercent(float f) {
        ConstraintLayout.C0620b bVar = (ConstraintLayout.C0620b) getLayoutParams();
        if (!this.f2574d || bVar.f2520c != f) {
            bVar.f2520c = f;
            setLayoutParams(bVar);
        }
    }

    public void setVisibility(int i) {
    }

    public Guideline(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        super.setVisibility(8);
    }
}
