package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import p214q.C7806e;

public class Placeholder extends View {

    /* renamed from: d */
    private int f2575d = -1;

    /* renamed from: e */
    private View f2576e = null;

    /* renamed from: f */
    private int f2577f = 4;

    public Placeholder(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m2398a(attributeSet);
    }

    /* renamed from: a */
    private void m2398a(AttributeSet attributeSet) {
        super.setVisibility(this.f2577f);
        this.f2575d = -1;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, C0639g.f2821I2);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == C0639g.f2829J2) {
                    this.f2575d = obtainStyledAttributes.getResourceId(index, this.f2575d);
                } else if (index == C0639g.f2837K2) {
                    this.f2577f = obtainStyledAttributes.getInt(index, this.f2577f);
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    /* renamed from: b */
    public void mo2911b(ConstraintLayout constraintLayout) {
        if (this.f2576e != null) {
            ConstraintLayout.C0620b bVar = (ConstraintLayout.C0620b) getLayoutParams();
            ConstraintLayout.C0620b bVar2 = (ConstraintLayout.C0620b) this.f2576e.getLayoutParams();
            bVar2.f2559v0.mo22651f1(0);
            C7806e.C7808b y = bVar.f2559v0.mo22687y();
            C7806e.C7808b bVar3 = C7806e.C7808b.FIXED;
            if (y != bVar3) {
                bVar.f2559v0.mo22653g1(bVar2.f2559v0.mo22627U());
            }
            if (bVar.f2559v0.mo22621R() != bVar3) {
                bVar.f2559v0.mo22606I0(bVar2.f2559v0.mo22683v());
            }
            bVar2.f2559v0.mo22651f1(8);
        }
    }

    /* renamed from: c */
    public void mo2912c(ConstraintLayout constraintLayout) {
        if (this.f2575d == -1 && !isInEditMode()) {
            setVisibility(this.f2577f);
        }
        View findViewById = constraintLayout.findViewById(this.f2575d);
        this.f2576e = findViewById;
        if (findViewById != null) {
            ((ConstraintLayout.C0620b) findViewById.getLayoutParams()).f2535j0 = true;
            this.f2576e.setVisibility(0);
            setVisibility(0);
        }
    }

    public View getContent() {
        return this.f2576e;
    }

    public int getEmptyVisibility() {
        return this.f2577f;
    }

    public void onDraw(Canvas canvas) {
        if (isInEditMode()) {
            canvas.drawRGB(223, 223, 223);
            Paint paint = new Paint();
            paint.setARGB(C11051p3.f31759c, 210, 210, 210);
            paint.setTextAlign(Paint.Align.CENTER);
            paint.setTypeface(Typeface.create(Typeface.DEFAULT, 0));
            Rect rect = new Rect();
            canvas.getClipBounds(rect);
            paint.setTextSize((float) rect.height());
            int height = rect.height();
            int width = rect.width();
            paint.setTextAlign(Paint.Align.LEFT);
            paint.getTextBounds("?", 0, 1, rect);
            canvas.drawText("?", ((((float) width) / 2.0f) - (((float) rect.width()) / 2.0f)) - ((float) rect.left), ((((float) height) / 2.0f) + (((float) rect.height()) / 2.0f)) - ((float) rect.bottom), paint);
        }
    }

    public void setContentId(int i) {
        View findViewById;
        if (this.f2575d != i) {
            View view = this.f2576e;
            if (view != null) {
                view.setVisibility(0);
                ((ConstraintLayout.C0620b) this.f2576e.getLayoutParams()).f2535j0 = false;
                this.f2576e = null;
            }
            this.f2575d = i;
            if (i != -1 && (findViewById = ((View) getParent()).findViewById(i)) != null) {
                findViewById.setVisibility(8);
            }
        }
    }

    public void setEmptyVisibility(int i) {
        this.f2577f = i;
    }
}
