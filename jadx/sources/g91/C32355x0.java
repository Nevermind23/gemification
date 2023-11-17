package g91;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Point;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.Display;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.WindowManager;
import androidx.core.content.C0767a;
import iu0.C36546y;

/* renamed from: g91.x0 */
public abstract class C32355x0 {

    /* renamed from: a */
    private static int f79789a = -1;

    /* renamed from: b */
    private static int f79790b = -1;

    /* renamed from: a */
    public static int m95510a(float f) {
        return m95511b(f, C36546y.m108285N());
    }

    /* renamed from: b */
    public static int m95511b(float f, Context context) {
        return (int) TypedValue.applyDimension(1, f, context.getResources().getDisplayMetrics());
    }

    /* renamed from: c */
    public static int m95512c(Context context, float f) {
        return Math.round(f * (context.getResources().getDisplayMetrics().xdpi / 160.0f));
    }

    /* renamed from: d */
    public static int m95513d(Context context, int i) {
        return m95512c(context, (float) i);
    }

    /* renamed from: e */
    public static int m95514e(int i, Context context) {
        return C0767a.m2893c(context, i);
    }

    /* renamed from: f */
    public static ColorStateList m95515f(int i, Context context) {
        return context.getResources().getColorStateList(i, context.getTheme());
    }

    /* renamed from: g */
    public static int m95516g(int i) {
        return m95517h(i, C36546y.m108285N());
    }

    /* renamed from: h */
    public static int m95517h(int i, Context context) {
        return context.getResources().getDimensionPixelSize(i);
    }

    /* renamed from: i */
    public static Display m95518i(Context context) {
        return ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
    }

    /* renamed from: j */
    public static int m95519j(Context context) {
        if (f79789a < 0) {
            f79789a = m95520k(m95518i(context)).y;
        }
        return f79789a;
    }

    /* renamed from: k */
    public static Point m95520k(Display display) {
        Point point = new Point();
        DisplayMetrics displayMetrics = new DisplayMetrics();
        display.getRealMetrics(displayMetrics);
        point.x = displayMetrics.widthPixels;
        point.y = displayMetrics.heightPixels;
        return point;
    }

    /* renamed from: l */
    public static int m95521l(Context context) {
        if (f79790b < 0) {
            f79790b = m95520k(m95518i(context)).x;
        }
        return f79790b;
    }

    /* renamed from: m */
    public static int m95522m(Context context) {
        int identifier = context.getResources().getIdentifier("status_bar_height", "dimen", "android");
        if (identifier > 0) {
            return context.getResources().getDimensionPixelSize(identifier);
        }
        return 0;
    }

    /* renamed from: n */
    public static void m95523n(View view, ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener) {
        if (view != null) {
            view.getViewTreeObserver().removeOnGlobalLayoutListener(onGlobalLayoutListener);
        }
    }
}
