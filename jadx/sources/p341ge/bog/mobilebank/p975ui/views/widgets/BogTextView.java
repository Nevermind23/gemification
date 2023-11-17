package p341ge.bog.mobilebank.p975ui.views.widgets;

import android.content.Context;
import android.content.res.TypedArray;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import com.github.mikephil.charting.utils.Utils;
import p366bk.C10330s;

@Deprecated
/* renamed from: ge.bog.mobilebank.ui.views.widgets.BogTextView */
public class BogTextView extends AppCompatTextView {
    public static final int MIN_TEXT_SIZE = 20;
    private static final String mEllipsis = "...";
    private boolean isTight;
    private boolean mAddEllipsis;
    private boolean mIsResizable;
    private float mMaxTextSize;
    private float mMinTextSize;
    private boolean mNeedsResize;
    private float mSpacingAdd;
    private float mSpacingMult;
    private OnTextResizeListener mTextResizeListener;
    private float mTextSize;

    /* renamed from: ge.bog.mobilebank.ui.views.widgets.BogTextView$OnTextResizeListener */
    public interface OnTextResizeListener {
        void onTextResize(TextView textView, float f, float f2);
    }

    public BogTextView(Context context) {
        this(context, (AttributeSet) null);
    }

    private int getTextHeight(CharSequence charSequence, TextPaint textPaint, int i, float f) {
        TextPaint textPaint2 = new TextPaint(textPaint);
        textPaint2.setTextSize(f);
        return new StaticLayout(charSequence, textPaint2, i, Layout.Alignment.ALIGN_NORMAL, this.mSpacingMult, this.mSpacingAdd, true).getHeight();
    }

    private void setUpAttrs(AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, C10330s.f29039G0);
        if (obtainStyledAttributes != null) {
            this.mMinTextSize = TypedValue.applyDimension(2, 5.0f, getResources().getDisplayMetrics());
            this.mIsResizable = obtainStyledAttributes.getBoolean(C10330s.f29049H0, false);
            this.isTight = obtainStyledAttributes.getBoolean(C10330s.f29059I0, false);
            obtainStyledAttributes.recycle();
        }
    }

    public boolean getAddEllipsis() {
        return this.mAddEllipsis;
    }

    public float getMaxTextSize() {
        return this.mMaxTextSize;
    }

    public float getMinTextSize() {
        return this.mMinTextSize;
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        if (this.mIsResizable && (z || this.mNeedsResize)) {
            resizeText(((i3 - i) - getCompoundPaddingLeft()) - getCompoundPaddingRight(), ((i4 - i2) - getCompoundPaddingBottom()) - getCompoundPaddingTop());
        }
        super.onLayout(z, i, i2, i3, i4);
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:4:0x000f, code lost:
        r5 = getLayout();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onMeasure(int r5, int r6) {
        /*
            r4 = this;
            super.onMeasure(r5, r6)
            boolean r0 = r4.isTight
            if (r0 == 0) goto L_0x003c
            int r5 = android.view.View.MeasureSpec.getMode(r5)
            r0 = 1073741824(0x40000000, float:2.0)
            if (r5 == r0) goto L_0x003c
            android.text.Layout r5 = r4.getLayout()
            int r0 = r5.getLineCount()
            r1 = 1
            if (r0 <= r1) goto L_0x003c
            r1 = 0
            r2 = 0
        L_0x001c:
            if (r2 >= r0) goto L_0x0029
            float r3 = r5.getLineWidth(r2)
            float r1 = java.lang.Math.max(r1, r3)
            int r2 = r2 + 1
            goto L_0x001c
        L_0x0029:
            int r5 = java.lang.Math.round(r1)
            int r0 = r4.getMeasuredWidth()
            if (r5 >= r0) goto L_0x003c
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            int r5 = android.view.View.MeasureSpec.makeMeasureSpec(r5, r0)
            super.onMeasure(r5, r6)
        L_0x003c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p341ge.bog.mobilebank.p975ui.views.widgets.BogTextView.onMeasure(int, int):void");
    }

    /* access modifiers changed from: protected */
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        if (i != i3 || i2 != i4) {
            this.mNeedsResize = true;
        }
    }

    /* access modifiers changed from: protected */
    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        this.mNeedsResize = true;
        resetTextSize();
    }

    public void resetTextSize() {
        float f = this.mTextSize;
        if (f > Utils.FLOAT_EPSILON) {
            super.setTextSize(0, f);
            this.mMaxTextSize = this.mTextSize;
        }
    }

    public void resizeText() {
        resizeText((getWidth() - getPaddingLeft()) - getPaddingRight(), (getHeight() - getPaddingBottom()) - getPaddingTop());
    }

    public void setAddEllipsis(boolean z) {
        this.mAddEllipsis = z;
    }

    public void setLineSpacing(float f, float f2) {
        super.setLineSpacing(f, f2);
        this.mSpacingMult = f2;
        this.mSpacingAdd = f;
    }

    public void setMaxTextSize(float f) {
        this.mMaxTextSize = f;
        requestLayout();
        invalidate();
    }

    public void setMinTextSize(float f) {
        this.mMinTextSize = f;
        requestLayout();
        invalidate();
    }

    public void setOnResizeListener(OnTextResizeListener onTextResizeListener) {
        this.mTextResizeListener = onTextResizeListener;
    }

    public void setTextSize(float f) {
        super.setTextSize(f);
        this.mTextSize = getTextSize();
    }

    public BogTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.mNeedsResize = false;
        this.mMaxTextSize = Utils.FLOAT_EPSILON;
        this.mMinTextSize = 20.0f;
        this.mSpacingMult = 1.0f;
        this.mSpacingAdd = Utils.FLOAT_EPSILON;
        this.mAddEllipsis = true;
        this.mIsResizable = false;
        if (attributeSet != null) {
            setUpAttrs(attributeSet);
        }
        this.mTextSize = getTextSize();
    }

    public void setTextSize(int i, float f) {
        super.setTextSize(i, f);
        this.mTextSize = getTextSize();
    }

    public void resizeText(int i, int i2) {
        int i3 = i;
        int i4 = i2;
        CharSequence text = getText();
        if (text != null && text.length() != 0 && i4 > 0 && i3 > 0 && this.mTextSize != Utils.FLOAT_EPSILON) {
            if (getTransformationMethod() != null) {
                text = getTransformationMethod().getTransformation(text, this);
            }
            CharSequence charSequence = text;
            TextPaint paint = getPaint();
            float textSize = paint.getTextSize();
            float f = this.mMaxTextSize;
            float min = f > Utils.FLOAT_EPSILON ? Math.min(this.mTextSize, f) : this.mTextSize;
            int textHeight = getTextHeight(charSequence, paint, i3, min);
            float f2 = min;
            while (textHeight > i4) {
                float f3 = this.mMinTextSize;
                if (f2 <= f3) {
                    break;
                }
                f2 = Math.max(f2 - 2.0f, f3);
                textHeight = getTextHeight(charSequence, paint, i3, f2);
            }
            if (this.mAddEllipsis && f2 == this.mMinTextSize && textHeight > i4) {
                StaticLayout staticLayout = r1;
                StaticLayout staticLayout2 = new StaticLayout(charSequence, new TextPaint(paint), i, Layout.Alignment.ALIGN_NORMAL, this.mSpacingMult, this.mSpacingAdd, false);
                if (staticLayout.getLineCount() > 0) {
                    StaticLayout staticLayout3 = staticLayout;
                    int lineForVertical = staticLayout3.getLineForVertical(i4) - 1;
                    if (lineForVertical < 0) {
                        setText("");
                    } else {
                        int lineStart = staticLayout3.getLineStart(lineForVertical);
                        int lineEnd = staticLayout3.getLineEnd(lineForVertical);
                        float lineWidth = staticLayout3.getLineWidth(lineForVertical);
                        float measureText = paint.measureText(mEllipsis);
                        while (((float) i3) < lineWidth + measureText) {
                            lineEnd--;
                            lineWidth = paint.measureText(charSequence.subSequence(lineStart, lineEnd + 1).toString());
                        }
                        setText(charSequence.subSequence(0, lineEnd) + mEllipsis);
                    }
                }
            }
            setTextSize(0, f2);
            setLineSpacing(this.mSpacingAdd, this.mSpacingMult);
            OnTextResizeListener onTextResizeListener = this.mTextResizeListener;
            if (onTextResizeListener != null) {
                onTextResizeListener.onTextResize(this, textSize, f2);
            }
            this.mNeedsResize = false;
        }
    }
}
