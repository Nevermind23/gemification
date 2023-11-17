package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import androidx.collection.LongSparseArray;
import androidx.collection.LruCache;
import androidx.collection.SimpleArrayMap;
import androidx.collection.SparseArrayCompat;
import androidx.core.content.C0767a;
import androidx.core.graphics.drawable.C0836a;
import androidx.vectordrawable.graphics.drawable.AnimatedVectorDrawableCompat;
import androidx.vectordrawable.graphics.drawable.C1880f;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;
import org.xmlpull.v1.XmlPullParser;
import p058e.C5863a;
import p071f.C6129c;
import p071f.C6130d;

/* renamed from: androidx.appcompat.widget.h1 */
public final class C0436h1 {

    /* renamed from: h */
    private static final PorterDuff.Mode f2102h = PorterDuff.Mode.SRC_IN;

    /* renamed from: i */
    private static C0436h1 f2103i;

    /* renamed from: j */
    private static final C0439c f2104j = new C0439c(6);

    /* renamed from: a */
    private WeakHashMap f2105a;

    /* renamed from: b */
    private SimpleArrayMap f2106b;

    /* renamed from: c */
    private SparseArrayCompat f2107c;

    /* renamed from: d */
    private final WeakHashMap f2108d = new WeakHashMap(0);

    /* renamed from: e */
    private TypedValue f2109e;

    /* renamed from: f */
    private boolean f2110f;

    /* renamed from: g */
    private C0442f f2111g;

    /* renamed from: androidx.appcompat.widget.h1$a */
    static class C0437a implements C0441e {
        C0437a() {
        }

        /* renamed from: a */
        public Drawable mo2119a(Context context, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
            try {
                return C5863a.m23570l(context, context.getResources(), xmlPullParser, attributeSet, theme);
            } catch (Exception e) {
                Log.e("AsldcInflateDelegate", "Exception while inflating <animated-selector>", e);
                return null;
            }
        }
    }

    /* renamed from: androidx.appcompat.widget.h1$b */
    private static class C0438b implements C0441e {
        C0438b() {
        }

        /* renamed from: a */
        public Drawable mo2119a(Context context, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
            try {
                return AnimatedVectorDrawableCompat.m7300c(context, context.getResources(), xmlPullParser, attributeSet, theme);
            } catch (Exception e) {
                Log.e("AvdcInflateDelegate", "Exception while inflating <animated-vector>", e);
                return null;
            }
        }
    }

    /* renamed from: androidx.appcompat.widget.h1$c */
    private static class C0439c extends LruCache {
        public C0439c(int i) {
            super(i);
        }

        /* renamed from: a */
        private static int m1757a(int i, PorterDuff.Mode mode) {
            return ((i + 31) * 31) + mode.hashCode();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public PorterDuffColorFilter mo2120b(int i, PorterDuff.Mode mode) {
            return (PorterDuffColorFilter) get(Integer.valueOf(m1757a(i, mode)));
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public PorterDuffColorFilter mo2121c(int i, PorterDuff.Mode mode, PorterDuffColorFilter porterDuffColorFilter) {
            return (PorterDuffColorFilter) put(Integer.valueOf(m1757a(i, mode)), porterDuffColorFilter);
        }
    }

    /* renamed from: androidx.appcompat.widget.h1$d */
    static class C0440d implements C0441e {
        C0440d() {
        }

        /* renamed from: a */
        public Drawable mo2119a(Context context, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
            String classAttribute = attributeSet.getClassAttribute();
            if (classAttribute != null) {
                try {
                    Drawable drawable = (Drawable) C0440d.class.getClassLoader().loadClass(classAttribute).asSubclass(Drawable.class).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
                    C6129c.m24507c(drawable, context.getResources(), xmlPullParser, attributeSet, theme);
                    return drawable;
                } catch (Exception e) {
                    Log.e("DrawableDelegate", "Exception while inflating <drawable>", e);
                }
            }
            return null;
        }
    }

    /* renamed from: androidx.appcompat.widget.h1$e */
    private interface C0441e {
        /* renamed from: a */
        Drawable mo2119a(Context context, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme);
    }

    /* renamed from: androidx.appcompat.widget.h1$f */
    public interface C0442f {
        /* renamed from: a */
        Drawable mo2122a(C0436h1 h1Var, Context context, int i);

        /* renamed from: b */
        ColorStateList mo2123b(Context context, int i);

        /* renamed from: c */
        boolean mo2124c(Context context, int i, Drawable drawable);

        /* renamed from: d */
        PorterDuff.Mode mo2125d(int i);

        /* renamed from: e */
        boolean mo2126e(Context context, int i, Drawable drawable);
    }

    /* renamed from: androidx.appcompat.widget.h1$g */
    private static class C0443g implements C0441e {
        C0443g() {
        }

        /* renamed from: a */
        public Drawable mo2119a(Context context, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
            try {
                return C1880f.m7333c(context.getResources(), xmlPullParser, attributeSet, theme);
            } catch (Exception e) {
                Log.e("VdcInflateDelegate", "Exception while inflating <vector>", e);
                return null;
            }
        }
    }

    /* renamed from: a */
    private void m1731a(String str, C0441e eVar) {
        if (this.f2106b == null) {
            this.f2106b = new SimpleArrayMap();
        }
        this.f2106b.put(str, eVar);
    }

    /* renamed from: b */
    private synchronized boolean m1732b(Context context, long j, Drawable drawable) {
        Drawable.ConstantState constantState = drawable.getConstantState();
        if (constantState == null) {
            return false;
        }
        LongSparseArray longSparseArray = (LongSparseArray) this.f2108d.get(context);
        if (longSparseArray == null) {
            longSparseArray = new LongSparseArray();
            this.f2108d.put(context, longSparseArray);
        }
        longSparseArray.put(j, new WeakReference(constantState));
        return true;
    }

    /* renamed from: c */
    private void m1733c(Context context, int i, ColorStateList colorStateList) {
        if (this.f2105a == null) {
            this.f2105a = new WeakHashMap();
        }
        SparseArrayCompat sparseArrayCompat = (SparseArrayCompat) this.f2105a.get(context);
        if (sparseArrayCompat == null) {
            sparseArrayCompat = new SparseArrayCompat();
            this.f2105a.put(context, sparseArrayCompat);
        }
        sparseArrayCompat.append(i, colorStateList);
    }

    /* renamed from: d */
    private void m1734d(Context context) {
        if (!this.f2110f) {
            this.f2110f = true;
            Drawable j = mo2111j(context, C6130d.f19067a);
            if (j == null || !m1743q(j)) {
                this.f2110f = false;
                throw new IllegalStateException("This app has been built with an incorrect configuration. Please configure your build for VectorDrawableCompat.");
            }
        }
    }

    /* renamed from: e */
    private static long m1735e(TypedValue typedValue) {
        return (((long) typedValue.assetCookie) << 32) | ((long) typedValue.data);
    }

    /* renamed from: f */
    private Drawable m1736f(Context context, int i) {
        Drawable drawable;
        if (this.f2109e == null) {
            this.f2109e = new TypedValue();
        }
        TypedValue typedValue = this.f2109e;
        context.getResources().getValue(i, typedValue, true);
        long e = m1735e(typedValue);
        Drawable i2 = m1739i(context, e);
        if (i2 != null) {
            return i2;
        }
        C0442f fVar = this.f2111g;
        if (fVar == null) {
            drawable = null;
        } else {
            drawable = fVar.mo2122a(this, context, i);
        }
        if (drawable != null) {
            drawable.setChangingConfigurations(typedValue.changingConfigurations);
            m1732b(context, e, drawable);
        }
        return drawable;
    }

    /* renamed from: g */
    private static PorterDuffColorFilter m1737g(ColorStateList colorStateList, PorterDuff.Mode mode, int[] iArr) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return m1740l(colorStateList.getColorForState(iArr, 0), mode);
    }

    /* renamed from: h */
    public static synchronized C0436h1 m1738h() {
        C0436h1 h1Var;
        synchronized (C0436h1.class) {
            if (f2103i == null) {
                C0436h1 h1Var2 = new C0436h1();
                f2103i = h1Var2;
                m1742p(h1Var2);
            }
            h1Var = f2103i;
        }
        return h1Var;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x002c, code lost:
        return null;
     */
    /* renamed from: i */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private synchronized android.graphics.drawable.Drawable m1739i(android.content.Context r4, long r5) {
        /*
            r3 = this;
            monitor-enter(r3)
            java.util.WeakHashMap r0 = r3.f2108d     // Catch:{ all -> 0x002d }
            java.lang.Object r0 = r0.get(r4)     // Catch:{ all -> 0x002d }
            androidx.collection.LongSparseArray r0 = (androidx.collection.LongSparseArray) r0     // Catch:{ all -> 0x002d }
            r1 = 0
            if (r0 != 0) goto L_0x000e
            monitor-exit(r3)
            return r1
        L_0x000e:
            java.lang.Object r2 = r0.get(r5)     // Catch:{ all -> 0x002d }
            java.lang.ref.WeakReference r2 = (java.lang.ref.WeakReference) r2     // Catch:{ all -> 0x002d }
            if (r2 == 0) goto L_0x002b
            java.lang.Object r2 = r2.get()     // Catch:{ all -> 0x002d }
            android.graphics.drawable.Drawable$ConstantState r2 = (android.graphics.drawable.Drawable.ConstantState) r2     // Catch:{ all -> 0x002d }
            if (r2 == 0) goto L_0x0028
            android.content.res.Resources r4 = r4.getResources()     // Catch:{ all -> 0x002d }
            android.graphics.drawable.Drawable r4 = r2.newDrawable(r4)     // Catch:{ all -> 0x002d }
            monitor-exit(r3)
            return r4
        L_0x0028:
            r0.remove(r5)     // Catch:{ all -> 0x002d }
        L_0x002b:
            monitor-exit(r3)
            return r1
        L_0x002d:
            r4 = move-exception
            monitor-exit(r3)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.C0436h1.m1739i(android.content.Context, long):android.graphics.drawable.Drawable");
    }

    /* renamed from: l */
    public static synchronized PorterDuffColorFilter m1740l(int i, PorterDuff.Mode mode) {
        PorterDuffColorFilter b;
        synchronized (C0436h1.class) {
            C0439c cVar = f2104j;
            b = cVar.mo2120b(i, mode);
            if (b == null) {
                b = new PorterDuffColorFilter(i, mode);
                cVar.mo2121c(i, mode, b);
            }
        }
        return b;
    }

    /* renamed from: n */
    private ColorStateList m1741n(Context context, int i) {
        SparseArrayCompat sparseArrayCompat;
        WeakHashMap weakHashMap = this.f2105a;
        if (weakHashMap == null || (sparseArrayCompat = (SparseArrayCompat) weakHashMap.get(context)) == null) {
            return null;
        }
        return (ColorStateList) sparseArrayCompat.get(i);
    }

    /* renamed from: p */
    private static void m1742p(C0436h1 h1Var) {
        if (Build.VERSION.SDK_INT < 24) {
            h1Var.m1731a("vector", new C0443g());
            h1Var.m1731a("animated-vector", new C0438b());
            h1Var.m1731a("animated-selector", new C0437a());
            h1Var.m1731a("drawable", new C0440d());
        }
    }

    /* renamed from: q */
    private static boolean m1743q(Drawable drawable) {
        if ((drawable instanceof C1880f) || "android.graphics.drawable.VectorDrawable".equals(drawable.getClass().getName())) {
            return true;
        }
        return false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:30:0x0073 A[Catch:{ Exception -> 0x00a2 }] */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x009a A[Catch:{ Exception -> 0x00a2 }] */
    /* renamed from: r */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private android.graphics.drawable.Drawable m1744r(android.content.Context r11, int r12) {
        /*
            r10 = this;
            androidx.collection.SimpleArrayMap r0 = r10.f2106b
            r1 = 0
            if (r0 == 0) goto L_0x00b2
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x00b2
            androidx.collection.SparseArrayCompat r0 = r10.f2107c
            java.lang.String r2 = "appcompat_skip_skip"
            if (r0 == 0) goto L_0x0028
            java.lang.Object r0 = r0.get(r12)
            java.lang.String r0 = (java.lang.String) r0
            boolean r3 = r2.equals(r0)
            if (r3 != 0) goto L_0x0027
            if (r0 == 0) goto L_0x002f
            androidx.collection.SimpleArrayMap r3 = r10.f2106b
            java.lang.Object r0 = r3.get(r0)
            if (r0 != 0) goto L_0x002f
        L_0x0027:
            return r1
        L_0x0028:
            androidx.collection.SparseArrayCompat r0 = new androidx.collection.SparseArrayCompat
            r0.<init>()
            r10.f2107c = r0
        L_0x002f:
            android.util.TypedValue r0 = r10.f2109e
            if (r0 != 0) goto L_0x003a
            android.util.TypedValue r0 = new android.util.TypedValue
            r0.<init>()
            r10.f2109e = r0
        L_0x003a:
            android.util.TypedValue r0 = r10.f2109e
            android.content.res.Resources r1 = r11.getResources()
            r3 = 1
            r1.getValue(r12, r0, r3)
            long r4 = m1735e(r0)
            android.graphics.drawable.Drawable r6 = r10.m1739i(r11, r4)
            if (r6 == 0) goto L_0x004f
            return r6
        L_0x004f:
            java.lang.CharSequence r7 = r0.string
            if (r7 == 0) goto L_0x00aa
            java.lang.String r7 = r7.toString()
            java.lang.String r8 = ".xml"
            boolean r7 = r7.endsWith(r8)
            if (r7 == 0) goto L_0x00aa
            android.content.res.XmlResourceParser r1 = r1.getXml(r12)     // Catch:{ Exception -> 0x00a2 }
            android.util.AttributeSet r7 = android.util.Xml.asAttributeSet(r1)     // Catch:{ Exception -> 0x00a2 }
        L_0x0067:
            int r8 = r1.next()     // Catch:{ Exception -> 0x00a2 }
            r9 = 2
            if (r8 == r9) goto L_0x0071
            if (r8 == r3) goto L_0x0071
            goto L_0x0067
        L_0x0071:
            if (r8 != r9) goto L_0x009a
            java.lang.String r3 = r1.getName()     // Catch:{ Exception -> 0x00a2 }
            androidx.collection.SparseArrayCompat r8 = r10.f2107c     // Catch:{ Exception -> 0x00a2 }
            r8.append(r12, r3)     // Catch:{ Exception -> 0x00a2 }
            androidx.collection.SimpleArrayMap r8 = r10.f2106b     // Catch:{ Exception -> 0x00a2 }
            java.lang.Object r3 = r8.get(r3)     // Catch:{ Exception -> 0x00a2 }
            androidx.appcompat.widget.h1$e r3 = (androidx.appcompat.widget.C0436h1.C0441e) r3     // Catch:{ Exception -> 0x00a2 }
            if (r3 == 0) goto L_0x008f
            android.content.res.Resources$Theme r8 = r11.getTheme()     // Catch:{ Exception -> 0x00a2 }
            android.graphics.drawable.Drawable r1 = r3.mo2119a(r11, r1, r7, r8)     // Catch:{ Exception -> 0x00a2 }
            r6 = r1
        L_0x008f:
            if (r6 == 0) goto L_0x00aa
            int r0 = r0.changingConfigurations     // Catch:{ Exception -> 0x00a2 }
            r6.setChangingConfigurations(r0)     // Catch:{ Exception -> 0x00a2 }
            r10.m1732b(r11, r4, r6)     // Catch:{ Exception -> 0x00a2 }
            goto L_0x00aa
        L_0x009a:
            org.xmlpull.v1.XmlPullParserException r11 = new org.xmlpull.v1.XmlPullParserException     // Catch:{ Exception -> 0x00a2 }
            java.lang.String r0 = "No start tag found"
            r11.<init>(r0)     // Catch:{ Exception -> 0x00a2 }
            throw r11     // Catch:{ Exception -> 0x00a2 }
        L_0x00a2:
            r11 = move-exception
            java.lang.String r0 = "ResourceManagerInternal"
            java.lang.String r1 = "Exception while inflating drawable"
            android.util.Log.e(r0, r1, r11)
        L_0x00aa:
            if (r6 != 0) goto L_0x00b1
            androidx.collection.SparseArrayCompat r11 = r10.f2107c
            r11.append(r12, r2)
        L_0x00b1:
            return r6
        L_0x00b2:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.C0436h1.m1744r(android.content.Context, int):android.graphics.drawable.Drawable");
    }

    /* renamed from: v */
    private Drawable m1745v(Context context, int i, boolean z, Drawable drawable) {
        ColorStateList m = mo2113m(context, i);
        if (m != null) {
            if (C0485s0.m1967a(drawable)) {
                drawable = drawable.mutate();
            }
            Drawable r = C0836a.m3156r(drawable);
            C0836a.m3153o(r, m);
            PorterDuff.Mode o = mo2114o(i);
            if (o == null) {
                return r;
            }
            C0836a.m3154p(r, o);
            return r;
        }
        C0442f fVar = this.f2111g;
        if ((fVar == null || !fVar.mo2126e(context, i, drawable)) && !mo2118x(context, i, drawable) && z) {
            return null;
        }
        return drawable;
    }

    /* renamed from: w */
    static void m1746w(Drawable drawable, C0476p1 p1Var, int[] iArr) {
        ColorStateList colorStateList;
        PorterDuff.Mode mode;
        boolean z;
        int[] state = drawable.getState();
        if (C0485s0.m1967a(drawable)) {
            if (drawable.mutate() == drawable) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                Log.d("ResourceManagerInternal", "Mutated drawable is not the same instance as the input.");
                return;
            }
        }
        if ((drawable instanceof LayerDrawable) && drawable.isStateful()) {
            drawable.setState(new int[0]);
            drawable.setState(state);
        }
        boolean z2 = p1Var.f2199d;
        if (z2 || p1Var.f2198c) {
            if (z2) {
                colorStateList = p1Var.f2196a;
            } else {
                colorStateList = null;
            }
            if (p1Var.f2198c) {
                mode = p1Var.f2197b;
            } else {
                mode = f2102h;
            }
            drawable.setColorFilter(m1737g(colorStateList, mode, iArr));
        } else {
            drawable.clearColorFilter();
        }
        if (Build.VERSION.SDK_INT <= 23) {
            drawable.invalidateSelf();
        }
    }

    /* renamed from: j */
    public synchronized Drawable mo2111j(Context context, int i) {
        return mo2112k(context, i, false);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public synchronized Drawable mo2112k(Context context, int i, boolean z) {
        Drawable r;
        m1734d(context);
        r = m1744r(context, i);
        if (r == null) {
            r = m1736f(context, i);
        }
        if (r == null) {
            r = C0767a.m2895e(context, i);
        }
        if (r != null) {
            r = m1745v(context, i, z, r);
        }
        if (r != null) {
            C0485s0.m1968b(r);
        }
        return r;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m */
    public synchronized ColorStateList mo2113m(Context context, int i) {
        ColorStateList n;
        n = m1741n(context, i);
        if (n == null) {
            C0442f fVar = this.f2111g;
            if (fVar == null) {
                n = null;
            } else {
                n = fVar.mo2123b(context, i);
            }
            if (n != null) {
                m1733c(context, i, n);
            }
        }
        return n;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: o */
    public PorterDuff.Mode mo2114o(int i) {
        C0442f fVar = this.f2111g;
        if (fVar == null) {
            return null;
        }
        return fVar.mo2125d(i);
    }

    /* renamed from: s */
    public synchronized void mo2115s(Context context) {
        LongSparseArray longSparseArray = (LongSparseArray) this.f2108d.get(context);
        if (longSparseArray != null) {
            longSparseArray.clear();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: t */
    public synchronized Drawable mo2116t(Context context, C0413c2 c2Var, int i) {
        Drawable r = m1744r(context, i);
        if (r == null) {
            r = c2Var.mo2147a(i);
        }
        if (r == null) {
            return null;
        }
        return m1745v(context, i, false, r);
    }

    /* renamed from: u */
    public synchronized void mo2117u(C0442f fVar) {
        this.f2111g = fVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: x */
    public boolean mo2118x(Context context, int i, Drawable drawable) {
        C0442f fVar = this.f2111g;
        return fVar != null && fVar.mo2124c(context, i, drawable);
    }
}
