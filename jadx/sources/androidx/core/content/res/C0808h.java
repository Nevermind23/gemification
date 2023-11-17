package androidx.core.content.res;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.util.SparseArray;
import android.util.TypedValue;
import androidx.core.util.C1002c;
import androidx.core.util.C1008h;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.WeakHashMap;

/* renamed from: androidx.core.content.res.h */
public abstract class C0808h {

    /* renamed from: a */
    private static final ThreadLocal f3437a = new ThreadLocal();

    /* renamed from: b */
    private static final WeakHashMap f3438b = new WeakHashMap(0);

    /* renamed from: c */
    private static final Object f3439c = new Object();

    /* renamed from: androidx.core.content.res.h$a */
    static class C0809a {
        /* renamed from: a */
        static Drawable m3041a(Resources resources, int i, Resources.Theme theme) {
            return resources.getDrawable(i, theme);
        }

        /* renamed from: b */
        static Drawable m3042b(Resources resources, int i, int i2, Resources.Theme theme) {
            return resources.getDrawableForDensity(i, i2, theme);
        }
    }

    /* renamed from: androidx.core.content.res.h$b */
    static class C0810b {
        /* renamed from: a */
        static int m3043a(Resources resources, int i, Resources.Theme theme) {
            return resources.getColor(i, theme);
        }

        /* renamed from: b */
        static ColorStateList m3044b(Resources resources, int i, Resources.Theme theme) {
            return resources.getColorStateList(i, theme);
        }
    }

    /* renamed from: androidx.core.content.res.h$c */
    private static class C0811c {

        /* renamed from: a */
        final ColorStateList f3440a;

        /* renamed from: b */
        final Configuration f3441b;

        /* renamed from: c */
        final int f3442c;

        C0811c(ColorStateList colorStateList, Configuration configuration, Resources.Theme theme) {
            int i;
            this.f3440a = colorStateList;
            this.f3441b = configuration;
            if (theme == null) {
                i = 0;
            } else {
                i = theme.hashCode();
            }
            this.f3442c = i;
        }
    }

    /* renamed from: androidx.core.content.res.h$d */
    private static final class C0812d {

        /* renamed from: a */
        final Resources f3443a;

        /* renamed from: b */
        final Resources.Theme f3444b;

        C0812d(Resources resources, Resources.Theme theme) {
            this.f3443a = resources;
            this.f3444b = theme;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || C0812d.class != obj.getClass()) {
                return false;
            }
            C0812d dVar = (C0812d) obj;
            if (!this.f3443a.equals(dVar.f3443a) || !C1002c.m3509a(this.f3444b, dVar.f3444b)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return C1002c.m3510b(this.f3443a, this.f3444b);
        }
    }

    /* renamed from: androidx.core.content.res.h$e */
    public static abstract class C0813e {
        /* renamed from: e */
        public static Handler m3047e(Handler handler) {
            return handler == null ? new Handler(Looper.getMainLooper()) : handler;
        }

        /* renamed from: c */
        public final void mo3282c(int i, Handler handler) {
            m3047e(handler).post(new C0818j(this, i));
        }

        /* renamed from: d */
        public final void mo3283d(Typeface typeface, Handler handler) {
            m3047e(handler).post(new C0817i(this, typeface));
        }

        /* renamed from: h */
        public abstract void m3048f(int i);

        /* renamed from: i */
        public abstract void m3049g(Typeface typeface);
    }

    /* renamed from: androidx.core.content.res.h$f */
    public static final class C0814f {

        /* renamed from: androidx.core.content.res.h$f$a */
        static class C0815a {

            /* renamed from: a */
            private static final Object f3445a = new Object();

            /* renamed from: b */
            private static Method f3446b;

            /* renamed from: c */
            private static boolean f3447c;

            /* renamed from: a */
            static void m3055a(Resources.Theme theme) {
                synchronized (f3445a) {
                    if (!f3447c) {
                        try {
                            Method declaredMethod = Resources.Theme.class.getDeclaredMethod("rebase", new Class[0]);
                            f3446b = declaredMethod;
                            declaredMethod.setAccessible(true);
                        } catch (NoSuchMethodException e) {
                            Log.i("ResourcesCompat", "Failed to retrieve rebase() method", e);
                        }
                        f3447c = true;
                    }
                    Method method = f3446b;
                    if (method != null) {
                        try {
                            method.invoke(theme, new Object[0]);
                        } catch (IllegalAccessException | InvocationTargetException e2) {
                            Log.i("ResourcesCompat", "Failed to invoke rebase() method via reflection", e2);
                            f3446b = null;
                        }
                    }
                }
            }
        }

        /* renamed from: androidx.core.content.res.h$f$b */
        static class C0816b {
            /* renamed from: a */
            static void m3056a(Resources.Theme theme) {
                theme.rebase();
            }
        }

        /* renamed from: a */
        public static void m3054a(Resources.Theme theme) {
            if (Build.VERSION.SDK_INT >= 29) {
                C0816b.m3056a(theme);
            } else {
                C0815a.m3055a(theme);
            }
        }
    }

    /* renamed from: a */
    private static void m3026a(C0812d dVar, int i, ColorStateList colorStateList, Resources.Theme theme) {
        synchronized (f3439c) {
            WeakHashMap weakHashMap = f3438b;
            SparseArray sparseArray = (SparseArray) weakHashMap.get(dVar);
            if (sparseArray == null) {
                sparseArray = new SparseArray();
                weakHashMap.put(dVar, sparseArray);
            }
            sparseArray.append(i, new C0811c(colorStateList, dVar.f3443a.getConfiguration(), theme));
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0043, code lost:
        return null;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static android.content.res.ColorStateList m3027b(androidx.core.content.res.C0808h.C0812d r5, int r6) {
        /*
            java.lang.Object r0 = f3439c
            monitor-enter(r0)
            java.util.WeakHashMap r1 = f3438b     // Catch:{ all -> 0x0045 }
            java.lang.Object r1 = r1.get(r5)     // Catch:{ all -> 0x0045 }
            android.util.SparseArray r1 = (android.util.SparseArray) r1     // Catch:{ all -> 0x0045 }
            if (r1 == 0) goto L_0x0042
            int r2 = r1.size()     // Catch:{ all -> 0x0045 }
            if (r2 <= 0) goto L_0x0042
            java.lang.Object r2 = r1.get(r6)     // Catch:{ all -> 0x0045 }
            androidx.core.content.res.h$c r2 = (androidx.core.content.res.C0808h.C0811c) r2     // Catch:{ all -> 0x0045 }
            if (r2 == 0) goto L_0x0042
            android.content.res.Configuration r3 = r2.f3441b     // Catch:{ all -> 0x0045 }
            android.content.res.Resources r4 = r5.f3443a     // Catch:{ all -> 0x0045 }
            android.content.res.Configuration r4 = r4.getConfiguration()     // Catch:{ all -> 0x0045 }
            boolean r3 = r3.equals(r4)     // Catch:{ all -> 0x0045 }
            if (r3 == 0) goto L_0x003f
            android.content.res.Resources$Theme r5 = r5.f3444b     // Catch:{ all -> 0x0045 }
            if (r5 != 0) goto L_0x0031
            int r3 = r2.f3442c     // Catch:{ all -> 0x0045 }
            if (r3 == 0) goto L_0x003b
        L_0x0031:
            if (r5 == 0) goto L_0x003f
            int r3 = r2.f3442c     // Catch:{ all -> 0x0045 }
            int r5 = r5.hashCode()     // Catch:{ all -> 0x0045 }
            if (r3 != r5) goto L_0x003f
        L_0x003b:
            android.content.res.ColorStateList r5 = r2.f3440a     // Catch:{ all -> 0x0045 }
            monitor-exit(r0)     // Catch:{ all -> 0x0045 }
            return r5
        L_0x003f:
            r1.remove(r6)     // Catch:{ all -> 0x0045 }
        L_0x0042:
            monitor-exit(r0)     // Catch:{ all -> 0x0045 }
            r5 = 0
            return r5
        L_0x0045:
            r5 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0045 }
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.content.res.C0808h.m3027b(androidx.core.content.res.h$d, int):android.content.res.ColorStateList");
    }

    /* renamed from: c */
    public static Typeface m3028c(Context context, int i) {
        if (context.isRestricted()) {
            return null;
        }
        return m3039n(context, i, new TypedValue(), 0, (C0813e) null, (Handler) null, false, true);
    }

    /* renamed from: d */
    public static int m3029d(Resources resources, int i, Resources.Theme theme) {
        return C0810b.m3043a(resources, i, theme);
    }

    /* renamed from: e */
    public static ColorStateList m3030e(Resources resources, int i, Resources.Theme theme) {
        C0812d dVar = new C0812d(resources, theme);
        ColorStateList b = m3027b(dVar, i);
        if (b != null) {
            return b;
        }
        ColorStateList l = m3037l(resources, i, theme);
        if (l == null) {
            return C0810b.m3044b(resources, i, theme);
        }
        m3026a(dVar, i, l, theme);
        return l;
    }

    /* renamed from: f */
    public static Drawable m3031f(Resources resources, int i, Resources.Theme theme) {
        return C0809a.m3041a(resources, i, theme);
    }

    /* renamed from: g */
    public static Drawable m3032g(Resources resources, int i, int i2, Resources.Theme theme) {
        return C0809a.m3042b(resources, i, i2, theme);
    }

    /* renamed from: h */
    public static Typeface m3033h(Context context, int i) {
        if (context.isRestricted()) {
            return null;
        }
        return m3039n(context, i, new TypedValue(), 0, (C0813e) null, (Handler) null, false, false);
    }

    /* renamed from: i */
    public static Typeface m3034i(Context context, int i, TypedValue typedValue, int i2, C0813e eVar) {
        if (context.isRestricted()) {
            return null;
        }
        return m3039n(context, i, typedValue, i2, eVar, (Handler) null, true, false);
    }

    /* renamed from: j */
    public static void m3035j(Context context, int i, C0813e eVar, Handler handler) {
        C1008h.m3530g(eVar);
        if (context.isRestricted()) {
            eVar.mo3282c(-4, handler);
            return;
        }
        m3039n(context, i, new TypedValue(), 0, eVar, handler, false, false);
    }

    /* renamed from: k */
    private static TypedValue m3036k() {
        ThreadLocal threadLocal = f3437a;
        TypedValue typedValue = (TypedValue) threadLocal.get();
        if (typedValue != null) {
            return typedValue;
        }
        TypedValue typedValue2 = new TypedValue();
        threadLocal.set(typedValue2);
        return typedValue2;
    }

    /* renamed from: l */
    private static ColorStateList m3037l(Resources resources, int i, Resources.Theme theme) {
        if (m3038m(resources, i)) {
            return null;
        }
        try {
            return C0797c.m2979a(resources, resources.getXml(i), theme);
        } catch (Exception e) {
            Log.w("ResourcesCompat", "Failed to inflate ColorStateList, leaving it to the framework", e);
            return null;
        }
    }

    /* renamed from: m */
    private static boolean m3038m(Resources resources, int i) {
        TypedValue k = m3036k();
        resources.getValue(i, k, true);
        int i2 = k.type;
        if (i2 < 28 || i2 > 31) {
            return false;
        }
        return true;
    }

    /* renamed from: n */
    private static Typeface m3039n(Context context, int i, TypedValue typedValue, int i2, C0813e eVar, Handler handler, boolean z, boolean z2) {
        Resources resources = context.getResources();
        int i3 = i;
        resources.getValue(i, typedValue, true);
        Typeface o = m3040o(context, resources, typedValue, i, i2, eVar, handler, z, z2);
        if (o != null || eVar != null || z2) {
            return o;
        }
        throw new Resources.NotFoundException("Font resource ID #0x" + Integer.toHexString(i) + " could not be retrieved.");
    }

    /* JADX WARNING: Removed duplicated region for block: B:36:0x00b7  */
    /* renamed from: o */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static android.graphics.Typeface m3040o(android.content.Context r17, android.content.res.Resources r18, android.util.TypedValue r19, int r20, int r21, androidx.core.content.res.C0808h.C0813e r22, android.os.Handler r23, boolean r24, boolean r25) {
        /*
            r0 = r18
            r1 = r19
            r4 = r20
            r11 = r22
            r12 = r23
            java.lang.String r13 = "ResourcesCompat"
            java.lang.CharSequence r2 = r1.string
            if (r2 == 0) goto L_0x00bb
            java.lang.String r14 = r2.toString()
            java.lang.String r2 = "res/"
            boolean r2 = r14.startsWith(r2)
            r15 = -3
            r16 = 0
            if (r2 != 0) goto L_0x0025
            if (r11 == 0) goto L_0x0024
            r11.mo3282c(r15, r12)
        L_0x0024:
            return r16
        L_0x0025:
            int r2 = r1.assetCookie
            r7 = r21
            android.graphics.Typeface r2 = androidx.core.graphics.C0860g.m3216f(r0, r4, r14, r2, r7)
            if (r2 == 0) goto L_0x0035
            if (r11 == 0) goto L_0x0034
            r11.mo3283d(r2, r12)
        L_0x0034:
            return r2
        L_0x0035:
            if (r25 == 0) goto L_0x0038
            return r16
        L_0x0038:
            java.lang.String r2 = r14.toLowerCase()     // Catch:{ XmlPullParserException -> 0x00a0, IOException -> 0x008a }
            java.lang.String r3 = ".xml"
            boolean r2 = r2.endsWith(r3)     // Catch:{ XmlPullParserException -> 0x00a0, IOException -> 0x008a }
            if (r2 == 0) goto L_0x006f
            android.content.res.XmlResourceParser r2 = r0.getXml(r4)     // Catch:{ XmlPullParserException -> 0x00a0, IOException -> 0x008a }
            androidx.core.content.res.e$b r2 = androidx.core.content.res.C0799e.m3000b(r2, r0)     // Catch:{ XmlPullParserException -> 0x00a0, IOException -> 0x008a }
            if (r2 != 0) goto L_0x0059
            java.lang.String r0 = "Failed to find font-family tag"
            android.util.Log.e(r13, r0)     // Catch:{ XmlPullParserException -> 0x00a0, IOException -> 0x008a }
            if (r11 == 0) goto L_0x0058
            r11.mo3282c(r15, r12)     // Catch:{ XmlPullParserException -> 0x00a0, IOException -> 0x008a }
        L_0x0058:
            return r16
        L_0x0059:
            int r6 = r1.assetCookie     // Catch:{ XmlPullParserException -> 0x00a0, IOException -> 0x008a }
            r1 = r17
            r3 = r18
            r4 = r20
            r5 = r14
            r7 = r21
            r8 = r22
            r9 = r23
            r10 = r24
            android.graphics.Typeface r0 = androidx.core.graphics.C0860g.m3213c(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)     // Catch:{ XmlPullParserException -> 0x00a0, IOException -> 0x008a }
            return r0
        L_0x006f:
            int r5 = r1.assetCookie     // Catch:{ XmlPullParserException -> 0x00a0, IOException -> 0x008a }
            r1 = r17
            r2 = r18
            r3 = r20
            r4 = r14
            r6 = r21
            android.graphics.Typeface r0 = androidx.core.graphics.C0860g.m3214d(r1, r2, r3, r4, r5, r6)     // Catch:{ XmlPullParserException -> 0x00a0, IOException -> 0x008a }
            if (r11 == 0) goto L_0x0089
            if (r0 == 0) goto L_0x0086
            r11.mo3283d(r0, r12)     // Catch:{ XmlPullParserException -> 0x00a0, IOException -> 0x008a }
            goto L_0x0089
        L_0x0086:
            r11.mo3282c(r15, r12)     // Catch:{ XmlPullParserException -> 0x00a0, IOException -> 0x008a }
        L_0x0089:
            return r0
        L_0x008a:
            r0 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Failed to read xml resource "
            r1.append(r2)
            r1.append(r14)
            java.lang.String r1 = r1.toString()
            android.util.Log.e(r13, r1, r0)
            goto L_0x00b5
        L_0x00a0:
            r0 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Failed to parse xml resource "
            r1.append(r2)
            r1.append(r14)
            java.lang.String r1 = r1.toString()
            android.util.Log.e(r13, r1, r0)
        L_0x00b5:
            if (r11 == 0) goto L_0x00ba
            r11.mo3282c(r15, r12)
        L_0x00ba:
            return r16
        L_0x00bb:
            android.content.res.Resources$NotFoundException r2 = new android.content.res.Resources$NotFoundException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r5 = "Resource \""
            r3.append(r5)
            java.lang.String r0 = r0.getResourceName(r4)
            r3.append(r0)
            java.lang.String r0 = "\" ("
            r3.append(r0)
            java.lang.String r0 = java.lang.Integer.toHexString(r20)
            r3.append(r0)
            java.lang.String r0 = ") is not a Font: "
            r3.append(r0)
            r3.append(r1)
            java.lang.String r0 = r3.toString()
            r2.<init>(r0)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.content.res.C0808h.m3040o(android.content.Context, android.content.res.Resources, android.util.TypedValue, int, int, androidx.core.content.res.h$e, android.os.Handler, boolean, boolean):android.graphics.Typeface");
    }
}
