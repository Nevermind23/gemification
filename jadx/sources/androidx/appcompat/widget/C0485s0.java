package androidx.appcompat.widget;

import android.graphics.Insets;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import androidx.core.graphics.drawable.C0836a;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: androidx.appcompat.widget.s0 */
public abstract class C0485s0 {

    /* renamed from: a */
    private static final int[] f2212a = {16842912};

    /* renamed from: b */
    private static final int[] f2213b = new int[0];

    /* renamed from: c */
    public static final Rect f2214c = new Rect();

    /* renamed from: androidx.appcompat.widget.s0$a */
    static class C0486a {

        /* renamed from: a */
        private static final boolean f2215a;

        /* renamed from: b */
        private static final Method f2216b;

        /* renamed from: c */
        private static final Field f2217c;

        /* renamed from: d */
        private static final Field f2218d;

        /* renamed from: e */
        private static final Field f2219e;

        /* renamed from: f */
        private static final Field f2220f;

        /* JADX WARNING: Removed duplicated region for block: B:43:0x004b  */
        /* JADX WARNING: Removed duplicated region for block: B:44:0x0058  */
        static {
            /*
                r0 = 1
                r1 = 0
                r2 = 0
                java.lang.String r3 = "android.graphics.Insets"
                java.lang.Class r3 = java.lang.Class.forName(r3)     // Catch:{ NoSuchMethodException -> 0x0043, ClassNotFoundException -> 0x003f, NoSuchFieldException -> 0x003b }
                java.lang.Class<android.graphics.drawable.Drawable> r4 = android.graphics.drawable.Drawable.class
                java.lang.String r5 = "getOpticalInsets"
                java.lang.Class[] r6 = new java.lang.Class[r2]     // Catch:{ NoSuchMethodException -> 0x0043, ClassNotFoundException -> 0x003f, NoSuchFieldException -> 0x003b }
                java.lang.reflect.Method r4 = r4.getMethod(r5, r6)     // Catch:{ NoSuchMethodException -> 0x0043, ClassNotFoundException -> 0x003f, NoSuchFieldException -> 0x003b }
                java.lang.String r5 = "left"
                java.lang.reflect.Field r5 = r3.getField(r5)     // Catch:{ NoSuchMethodException -> 0x0039, ClassNotFoundException -> 0x0037, NoSuchFieldException -> 0x0035 }
                java.lang.String r6 = "top"
                java.lang.reflect.Field r6 = r3.getField(r6)     // Catch:{ NoSuchMethodException -> 0x0033, ClassNotFoundException -> 0x0031, NoSuchFieldException -> 0x002f }
                java.lang.String r7 = "right"
                java.lang.reflect.Field r7 = r3.getField(r7)     // Catch:{ ClassNotFoundException | NoSuchFieldException | NoSuchMethodException -> 0x002d }
                java.lang.String r8 = "bottom"
                java.lang.reflect.Field r3 = r3.getField(r8)     // Catch:{ ClassNotFoundException | NoSuchFieldException | NoSuchMethodException -> 0x0047 }
                r8 = r0
                goto L_0x0049
            L_0x002d:
                r7 = r1
                goto L_0x0047
            L_0x002f:
                r6 = r1
                goto L_0x0046
            L_0x0031:
                r6 = r1
                goto L_0x0046
            L_0x0033:
                r6 = r1
                goto L_0x0046
            L_0x0035:
                r5 = r1
                goto L_0x003d
            L_0x0037:
                r5 = r1
                goto L_0x0041
            L_0x0039:
                r5 = r1
                goto L_0x0045
            L_0x003b:
                r4 = r1
                r5 = r4
            L_0x003d:
                r6 = r5
                goto L_0x0046
            L_0x003f:
                r4 = r1
                r5 = r4
            L_0x0041:
                r6 = r5
                goto L_0x0046
            L_0x0043:
                r4 = r1
                r5 = r4
            L_0x0045:
                r6 = r5
            L_0x0046:
                r7 = r6
            L_0x0047:
                r3 = r1
                r8 = r2
            L_0x0049:
                if (r8 == 0) goto L_0x0058
                f2216b = r4
                f2217c = r5
                f2218d = r6
                f2219e = r7
                f2220f = r3
                f2215a = r0
                goto L_0x0064
            L_0x0058:
                f2216b = r1
                f2217c = r1
                f2218d = r1
                f2219e = r1
                f2220f = r1
                f2215a = r2
            L_0x0064:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.C0485s0.C0486a.<clinit>():void");
        }

        /* renamed from: a */
        static Rect m1972a(Drawable drawable) {
            if (Build.VERSION.SDK_INT < 29 && f2215a) {
                try {
                    Object invoke = f2216b.invoke(drawable, new Object[0]);
                    if (invoke != null) {
                        return new Rect(f2217c.getInt(invoke), f2218d.getInt(invoke), f2219e.getInt(invoke), f2220f.getInt(invoke));
                    }
                } catch (IllegalAccessException | InvocationTargetException unused) {
                }
            }
            return C0485s0.f2214c;
        }
    }

    /* renamed from: androidx.appcompat.widget.s0$b */
    static class C0487b {
        /* renamed from: a */
        static Insets m1973a(Drawable drawable) {
            return drawable.getOpticalInsets();
        }
    }

    /* renamed from: a */
    public static boolean m1967a(Drawable drawable) {
        return true;
    }

    /* renamed from: b */
    static void m1968b(Drawable drawable) {
        String name = drawable.getClass().getName();
        int i = Build.VERSION.SDK_INT;
        if (i >= 29 && i < 31 && "android.graphics.drawable.ColorStateListDrawable".equals(name)) {
            m1969c(drawable);
        }
    }

    /* renamed from: c */
    private static void m1969c(Drawable drawable) {
        int[] state = drawable.getState();
        if (state == null || state.length == 0) {
            drawable.setState(f2212a);
        } else {
            drawable.setState(f2213b);
        }
        drawable.setState(state);
    }

    /* renamed from: d */
    public static Rect m1970d(Drawable drawable) {
        if (Build.VERSION.SDK_INT < 29) {
            return C0486a.m1972a(C0836a.m3155q(drawable));
        }
        Insets a = C0487b.m1973a(drawable);
        return new Rect(a.left, a.top, a.right, a.bottom);
    }

    /* renamed from: e */
    public static PorterDuff.Mode m1971e(int i, PorterDuff.Mode mode) {
        if (i == 3) {
            return PorterDuff.Mode.SRC_OVER;
        }
        if (i == 5) {
            return PorterDuff.Mode.SRC_IN;
        }
        if (i == 9) {
            return PorterDuff.Mode.SRC_ATOP;
        }
        switch (i) {
            case 14:
                return PorterDuff.Mode.MULTIPLY;
            case 15:
                return PorterDuff.Mode.SCREEN;
            case 16:
                return PorterDuff.Mode.ADD;
            default:
                return mode;
        }
    }
}
