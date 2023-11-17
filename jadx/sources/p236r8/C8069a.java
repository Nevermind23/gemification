package p236r8;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatTextView;
import p009a8.C0072b;
import p009a8.C0082l;
import p184n8.C7342b;
import p184n8.C7343c;
import p249s8.C8273a;

/* renamed from: r8.a */
public class C8069a extends AppCompatTextView {
    public C8069a(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 16842884);
    }

    /* renamed from: f */
    private void m30578f(Resources.Theme theme, int i) {
        TypedArray obtainStyledAttributes = theme.obtainStyledAttributes(i, C0082l.f514N4);
        int j = m30582j(getContext(), obtainStyledAttributes, C0082l.f534P4, C0082l.f544Q4);
        obtainStyledAttributes.recycle();
        if (j >= 0) {
            setLineHeight(j);
        }
    }

    /* renamed from: g */
    private static boolean m30579g(Context context) {
        return C7342b.m27998b(context, C0072b.f139Y, true);
    }

    /* renamed from: h */
    private static int m30580h(Resources.Theme theme, AttributeSet attributeSet, int i, int i2) {
        TypedArray obtainStyledAttributes = theme.obtainStyledAttributes(attributeSet, C0082l.f554R4, i, i2);
        int resourceId = obtainStyledAttributes.getResourceId(C0082l.f564S4, -1);
        obtainStyledAttributes.recycle();
        return resourceId;
    }

    /* renamed from: i */
    private void m30581i(AttributeSet attributeSet, int i, int i2) {
        int h;
        Context context = getContext();
        if (m30579g(context)) {
            Resources.Theme theme = context.getTheme();
            if (!m30583k(context, theme, attributeSet, i, i2) && (h = m30580h(theme, attributeSet, i, i2)) != -1) {
                m30578f(theme, h);
            }
        }
    }

    /* renamed from: j */
    private static int m30582j(Context context, TypedArray typedArray, int... iArr) {
        int i = -1;
        for (int i2 = 0; i2 < iArr.length && i < 0; i2++) {
            i = C7343c.m28006d(context, typedArray, iArr[i2], -1);
        }
        return i;
    }

    /* renamed from: k */
    private static boolean m30583k(Context context, Resources.Theme theme, AttributeSet attributeSet, int i, int i2) {
        TypedArray obtainStyledAttributes = theme.obtainStyledAttributes(attributeSet, C0082l.f554R4, i, i2);
        int j = m30582j(context, obtainStyledAttributes, C0082l.f574T4, C0082l.f583U4);
        obtainStyledAttributes.recycle();
        if (j != -1) {
            return true;
        }
        return false;
    }

    public void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        if (m30579g(context)) {
            m30578f(context.getTheme(), i);
        }
    }

    public C8069a(Context context, AttributeSet attributeSet, int i) {
        super(C8273a.m31120c(context, attributeSet, i, 0), attributeSet, i);
        m30581i(attributeSet, i, 0);
    }
}
