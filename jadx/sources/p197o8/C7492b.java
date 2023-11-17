package p197o8;

import android.content.res.ColorStateList;
import android.graphics.Color;
import android.os.Build;
import android.util.Log;
import android.util.StateSet;
import androidx.core.graphics.C0825b;

/* renamed from: o8.b */
public abstract class C7492b {

    /* renamed from: a */
    public static final boolean f21801a = true;

    /* renamed from: b */
    private static final int[] f21802b = {16842919};

    /* renamed from: c */
    private static final int[] f21803c = {16843623, 16842908};

    /* renamed from: d */
    private static final int[] f21804d = {16842908};

    /* renamed from: e */
    private static final int[] f21805e = {16843623};

    /* renamed from: f */
    private static final int[] f21806f = {16842913, 16842919};

    /* renamed from: g */
    private static final int[] f21807g = {16842913, 16843623, 16842908};

    /* renamed from: h */
    private static final int[] f21808h = {16842913, 16842908};

    /* renamed from: i */
    private static final int[] f21809i = {16842913, 16843623};

    /* renamed from: j */
    private static final int[] f21810j = {16842913};

    /* renamed from: k */
    private static final int[] f21811k = {16842910, 16842919};

    /* renamed from: l */
    static final String f21812l = C7492b.class.getSimpleName();

    /* renamed from: a */
    public static ColorStateList m28454a(ColorStateList colorStateList) {
        if (f21801a) {
            int[] iArr = f21804d;
            return new ColorStateList(new int[][]{f21810j, iArr, StateSet.NOTHING}, new int[]{m28456c(colorStateList, f21806f), m28456c(colorStateList, iArr), m28456c(colorStateList, f21802b)});
        }
        int[] iArr2 = f21806f;
        int[] iArr3 = f21807g;
        int[] iArr4 = f21808h;
        int[] iArr5 = f21809i;
        int[] iArr6 = f21802b;
        int[] iArr7 = f21803c;
        int[] iArr8 = f21804d;
        int[] iArr9 = f21805e;
        return new ColorStateList(new int[][]{iArr2, iArr3, iArr4, iArr5, f21810j, iArr6, iArr7, iArr8, iArr9, StateSet.NOTHING}, new int[]{m28456c(colorStateList, iArr2), m28456c(colorStateList, iArr3), m28456c(colorStateList, iArr4), m28456c(colorStateList, iArr5), 0, m28456c(colorStateList, iArr6), m28456c(colorStateList, iArr7), m28456c(colorStateList, iArr8), m28456c(colorStateList, iArr9), 0});
    }

    /* renamed from: b */
    private static int m28455b(int i) {
        return C0825b.m3101j(i, Math.min(Color.alpha(i) * 2, C11051p3.f31759c));
    }

    /* renamed from: c */
    private static int m28456c(ColorStateList colorStateList, int[] iArr) {
        int i;
        if (colorStateList != null) {
            i = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
        } else {
            i = 0;
        }
        if (f21801a) {
            return m28455b(i);
        }
        return i;
    }

    /* renamed from: d */
    public static ColorStateList m28457d(ColorStateList colorStateList) {
        if (colorStateList == null) {
            return ColorStateList.valueOf(0);
        }
        if (Build.VERSION.SDK_INT <= 27 && Color.alpha(colorStateList.getDefaultColor()) == 0 && Color.alpha(colorStateList.getColorForState(f21811k, 0)) != 0) {
            Log.w(f21812l, "Use a non-transparent color for the default color as it will be used to finish ripple animations.");
        }
        return colorStateList;
    }

    /* renamed from: e */
    public static boolean m28458e(int[] iArr) {
        boolean z = false;
        boolean z2 = false;
        for (int i : iArr) {
            if (i == 16842910) {
                z = true;
            } else if (i == 16842908 || i == 16842919 || i == 16843623) {
                z2 = true;
            }
        }
        return z && z2;
    }
}
