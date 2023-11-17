package androidx.core.content.res;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import org.xmlpull.v1.XmlPullParser;

/* renamed from: androidx.core.content.res.l */
public abstract class C0820l {
    /* renamed from: a */
    public static int m3058a(Context context, int i, int i2) {
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(i, typedValue, true);
        if (typedValue.resourceId != 0) {
            return i;
        }
        return i2;
    }

    /* renamed from: b */
    public static boolean m3059b(TypedArray typedArray, int i, int i2, boolean z) {
        return typedArray.getBoolean(i, typedArray.getBoolean(i2, z));
    }

    /* renamed from: c */
    public static Drawable m3060c(TypedArray typedArray, int i, int i2) {
        Drawable drawable = typedArray.getDrawable(i);
        if (drawable == null) {
            return typedArray.getDrawable(i2);
        }
        return drawable;
    }

    /* renamed from: d */
    public static int m3061d(TypedArray typedArray, int i, int i2, int i3) {
        return typedArray.getInt(i, typedArray.getInt(i2, i3));
    }

    /* renamed from: e */
    public static boolean m3062e(TypedArray typedArray, XmlPullParser xmlPullParser, String str, int i, boolean z) {
        if (!m3075r(xmlPullParser, str)) {
            return z;
        }
        return typedArray.getBoolean(i, z);
    }

    /* renamed from: f */
    public static int m3063f(TypedArray typedArray, XmlPullParser xmlPullParser, String str, int i, int i2) {
        if (!m3075r(xmlPullParser, str)) {
            return i2;
        }
        return typedArray.getColor(i, i2);
    }

    /* renamed from: g */
    public static ColorStateList m3064g(TypedArray typedArray, XmlPullParser xmlPullParser, Resources.Theme theme, String str, int i) {
        if (!m3075r(xmlPullParser, str)) {
            return null;
        }
        TypedValue typedValue = new TypedValue();
        typedArray.getValue(i, typedValue);
        int i2 = typedValue.type;
        if (i2 == 2) {
            throw new UnsupportedOperationException("Failed to resolve attribute at index " + i + ": " + typedValue);
        } else if (i2 < 28 || i2 > 31) {
            return C0797c.m2982d(typedArray.getResources(), typedArray.getResourceId(i, 0), theme);
        } else {
            return m3065h(typedValue);
        }
    }

    /* renamed from: h */
    private static ColorStateList m3065h(TypedValue typedValue) {
        return ColorStateList.valueOf(typedValue.data);
    }

    /* renamed from: i */
    public static C0798d m3066i(TypedArray typedArray, XmlPullParser xmlPullParser, Resources.Theme theme, String str, int i, int i2) {
        if (m3075r(xmlPullParser, str)) {
            TypedValue typedValue = new TypedValue();
            typedArray.getValue(i, typedValue);
            int i3 = typedValue.type;
            if (i3 >= 28 && i3 <= 31) {
                return C0798d.m2988b(typedValue.data);
            }
            C0798d g = C0798d.m2991g(typedArray.getResources(), typedArray.getResourceId(i, 0), theme);
            if (g != null) {
                return g;
            }
        }
        return C0798d.m2988b(i2);
    }

    /* renamed from: j */
    public static float m3067j(TypedArray typedArray, XmlPullParser xmlPullParser, String str, int i, float f) {
        if (!m3075r(xmlPullParser, str)) {
            return f;
        }
        return typedArray.getFloat(i, f);
    }

    /* renamed from: k */
    public static int m3068k(TypedArray typedArray, XmlPullParser xmlPullParser, String str, int i, int i2) {
        if (!m3075r(xmlPullParser, str)) {
            return i2;
        }
        return typedArray.getInt(i, i2);
    }

    /* renamed from: l */
    public static int m3069l(TypedArray typedArray, XmlPullParser xmlPullParser, String str, int i, int i2) {
        if (!m3075r(xmlPullParser, str)) {
            return i2;
        }
        return typedArray.getResourceId(i, i2);
    }

    /* renamed from: m */
    public static String m3070m(TypedArray typedArray, XmlPullParser xmlPullParser, String str, int i) {
        if (!m3075r(xmlPullParser, str)) {
            return null;
        }
        return typedArray.getString(i);
    }

    /* renamed from: n */
    public static int m3071n(TypedArray typedArray, int i, int i2, int i3) {
        return typedArray.getResourceId(i, typedArray.getResourceId(i2, i3));
    }

    /* renamed from: o */
    public static String m3072o(TypedArray typedArray, int i, int i2) {
        String string = typedArray.getString(i);
        if (string == null) {
            return typedArray.getString(i2);
        }
        return string;
    }

    /* renamed from: p */
    public static CharSequence m3073p(TypedArray typedArray, int i, int i2) {
        CharSequence text = typedArray.getText(i);
        if (text == null) {
            return typedArray.getText(i2);
        }
        return text;
    }

    /* renamed from: q */
    public static CharSequence[] m3074q(TypedArray typedArray, int i, int i2) {
        CharSequence[] textArray = typedArray.getTextArray(i);
        if (textArray == null) {
            return typedArray.getTextArray(i2);
        }
        return textArray;
    }

    /* renamed from: r */
    public static boolean m3075r(XmlPullParser xmlPullParser, String str) {
        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", str) != null) {
            return true;
        }
        return false;
    }

    /* renamed from: s */
    public static TypedArray m3076s(Resources resources, Resources.Theme theme, AttributeSet attributeSet, int[] iArr) {
        if (theme == null) {
            return resources.obtainAttributes(attributeSet, iArr);
        }
        return theme.obtainStyledAttributes(attributeSet, iArr, 0, 0);
    }

    /* renamed from: t */
    public static TypedValue m3077t(TypedArray typedArray, XmlPullParser xmlPullParser, String str, int i) {
        if (!m3075r(xmlPullParser, str)) {
            return null;
        }
        return typedArray.peekValue(i);
    }
}
