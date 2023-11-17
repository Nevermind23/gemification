package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import androidx.appcompat.widget.C0436h1;
import androidx.core.graphics.C0825b;
import p030c.C2210a;
import p030c.C2212c;
import p030c.C2213d;
import p030c.C2214e;
import p045d.C5769a;

/* renamed from: androidx.appcompat.widget.i */
public final class C0444i {
    /* access modifiers changed from: private */

    /* renamed from: b */
    public static final PorterDuff.Mode f2112b = PorterDuff.Mode.SRC_IN;

    /* renamed from: c */
    private static C0444i f2113c;

    /* renamed from: a */
    private C0436h1 f2114a;

    /* renamed from: androidx.appcompat.widget.i$a */
    class C0445a implements C0436h1.C0442f {

        /* renamed from: a */
        private final int[] f2115a = {C2214e.f6510R, C2214e.f6508P, C2214e.f6512a};

        /* renamed from: b */
        private final int[] f2116b = {C2214e.f6526o, C2214e.f6494B, C2214e.f6531t, C2214e.f6527p, C2214e.f6528q, C2214e.f6530s, C2214e.f6529r};

        /* renamed from: c */
        private final int[] f2117c = {C2214e.f6507O, C2214e.f6509Q, C2214e.f6522k, C2214e.f6503K, C2214e.f6504L, C2214e.f6505M, C2214e.f6506N};

        /* renamed from: d */
        private final int[] f2118d = {C2214e.f6534w, C2214e.f6520i, C2214e.f6533v};

        /* renamed from: e */
        private final int[] f2119e = {C2214e.f6502J, C2214e.f6511S};

        /* renamed from: f */
        private final int[] f2120f = {C2214e.f6514c, C2214e.f6518g, C2214e.f6515d, C2214e.f6519h};

        C0445a() {
        }

        /* renamed from: f */
        private boolean m1777f(int[] iArr, int i) {
            for (int i2 : iArr) {
                if (i2 == i) {
                    return true;
                }
            }
            return false;
        }

        /* renamed from: g */
        private ColorStateList m1778g(Context context) {
            return m1779h(context, 0);
        }

        /* renamed from: h */
        private ColorStateList m1779h(Context context, int i) {
            int c = C0470n1.m1924c(context, C2210a.f6464t);
            int b = C0470n1.m1923b(context, C2210a.f6462r);
            return new ColorStateList(new int[][]{C0470n1.f2177b, C0470n1.f2180e, C0470n1.f2178c, C0470n1.f2184i}, new int[]{b, C0825b.m3097f(c, i), C0825b.m3097f(c, i), i});
        }

        /* renamed from: i */
        private ColorStateList m1780i(Context context) {
            return m1779h(context, C0470n1.m1924c(context, C2210a.f6461q));
        }

        /* renamed from: j */
        private ColorStateList m1781j(Context context) {
            return m1779h(context, C0470n1.m1924c(context, C2210a.f6462r));
        }

        /* renamed from: k */
        private ColorStateList m1782k(Context context) {
            int[][] iArr = new int[3][];
            int[] iArr2 = new int[3];
            int i = C2210a.f6467w;
            ColorStateList e = C0470n1.m1926e(context, i);
            if (e == null || !e.isStateful()) {
                iArr[0] = C0470n1.f2177b;
                iArr2[0] = C0470n1.m1923b(context, i);
                iArr[1] = C0470n1.f2181f;
                iArr2[1] = C0470n1.m1924c(context, C2210a.f6463s);
                iArr[2] = C0470n1.f2184i;
                iArr2[2] = C0470n1.m1924c(context, i);
            } else {
                int[] iArr3 = C0470n1.f2177b;
                iArr[0] = iArr3;
                iArr2[0] = e.getColorForState(iArr3, 0);
                iArr[1] = C0470n1.f2181f;
                iArr2[1] = C0470n1.m1924c(context, C2210a.f6463s);
                iArr[2] = C0470n1.f2184i;
                iArr2[2] = e.getDefaultColor();
            }
            return new ColorStateList(iArr, iArr2);
        }

        /* renamed from: l */
        private LayerDrawable m1783l(C0436h1 h1Var, Context context, int i) {
            BitmapDrawable bitmapDrawable;
            BitmapDrawable bitmapDrawable2;
            BitmapDrawable bitmapDrawable3;
            int dimensionPixelSize = context.getResources().getDimensionPixelSize(i);
            Drawable j = h1Var.mo2111j(context, C2214e.f6498F);
            Drawable j2 = h1Var.mo2111j(context, C2214e.f6499G);
            if ((j instanceof BitmapDrawable) && j.getIntrinsicWidth() == dimensionPixelSize && j.getIntrinsicHeight() == dimensionPixelSize) {
                bitmapDrawable2 = (BitmapDrawable) j;
                bitmapDrawable = new BitmapDrawable(bitmapDrawable2.getBitmap());
            } else {
                Bitmap createBitmap = Bitmap.createBitmap(dimensionPixelSize, dimensionPixelSize, Bitmap.Config.ARGB_8888);
                Canvas canvas = new Canvas(createBitmap);
                j.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
                j.draw(canvas);
                bitmapDrawable2 = new BitmapDrawable(createBitmap);
                bitmapDrawable = new BitmapDrawable(createBitmap);
            }
            bitmapDrawable.setTileModeX(Shader.TileMode.REPEAT);
            if ((j2 instanceof BitmapDrawable) && j2.getIntrinsicWidth() == dimensionPixelSize && j2.getIntrinsicHeight() == dimensionPixelSize) {
                bitmapDrawable3 = (BitmapDrawable) j2;
            } else {
                Bitmap createBitmap2 = Bitmap.createBitmap(dimensionPixelSize, dimensionPixelSize, Bitmap.Config.ARGB_8888);
                Canvas canvas2 = new Canvas(createBitmap2);
                j2.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
                j2.draw(canvas2);
                bitmapDrawable3 = new BitmapDrawable(createBitmap2);
            }
            LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{bitmapDrawable2, bitmapDrawable3, bitmapDrawable});
            layerDrawable.setId(0, 16908288);
            layerDrawable.setId(1, 16908303);
            layerDrawable.setId(2, 16908301);
            return layerDrawable;
        }

        /* renamed from: m */
        private void m1784m(Drawable drawable, int i, PorterDuff.Mode mode) {
            if (C0485s0.m1967a(drawable)) {
                drawable = drawable.mutate();
            }
            if (mode == null) {
                mode = C0444i.f2112b;
            }
            drawable.setColorFilter(C0444i.m1770e(i, mode));
        }

        /* renamed from: a */
        public Drawable mo2122a(C0436h1 h1Var, Context context, int i) {
            if (i == C2214e.f6521j) {
                return new LayerDrawable(new Drawable[]{h1Var.mo2111j(context, C2214e.f6520i), h1Var.mo2111j(context, C2214e.f6522k)});
            } else if (i == C2214e.f6536y) {
                return m1783l(h1Var, context, C2213d.f6486g);
            } else {
                if (i == C2214e.f6535x) {
                    return m1783l(h1Var, context, C2213d.f6487h);
                }
                if (i == C2214e.f6537z) {
                    return m1783l(h1Var, context, C2213d.f6488i);
                }
                return null;
            }
        }

        /* renamed from: b */
        public ColorStateList mo2123b(Context context, int i) {
            if (i == C2214e.f6524m) {
                return C5769a.m23209a(context, C2212c.f6476e);
            }
            if (i == C2214e.f6501I) {
                return C5769a.m23209a(context, C2212c.f6479h);
            }
            if (i == C2214e.f6500H) {
                return m1782k(context);
            }
            if (i == C2214e.f6517f) {
                return m1781j(context);
            }
            if (i == C2214e.f6513b) {
                return m1778g(context);
            }
            if (i == C2214e.f6516e) {
                return m1780i(context);
            }
            if (i == C2214e.f6496D || i == C2214e.f6497E) {
                return C5769a.m23209a(context, C2212c.f6478g);
            }
            if (m1777f(this.f2116b, i)) {
                return C0470n1.m1926e(context, C2210a.f6465u);
            }
            if (m1777f(this.f2119e, i)) {
                return C5769a.m23209a(context, C2212c.f6475d);
            }
            if (m1777f(this.f2120f, i)) {
                return C5769a.m23209a(context, C2212c.f6474c);
            }
            if (i == C2214e.f6493A) {
                return C5769a.m23209a(context, C2212c.f6477f);
            }
            return null;
        }

        /* JADX WARNING: Removed duplicated region for block: B:19:0x0051  */
        /* JADX WARNING: Removed duplicated region for block: B:26:0x006c A[RETURN] */
        /* renamed from: c */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean mo2124c(android.content.Context r8, int r9, android.graphics.drawable.Drawable r10) {
            /*
                r7 = this;
                android.graphics.PorterDuff$Mode r0 = androidx.appcompat.widget.C0444i.f2112b
                int[] r1 = r7.f2115a
                boolean r1 = r7.m1777f(r1, r9)
                r2 = 1
                r3 = 0
                r4 = -1
                if (r1 == 0) goto L_0x0015
                int r9 = p030c.C2210a.f6465u
            L_0x0011:
                r1 = r0
                r5 = r2
            L_0x0013:
                r0 = r4
                goto L_0x004f
            L_0x0015:
                int[] r1 = r7.f2117c
                boolean r1 = r7.m1777f(r1, r9)
                if (r1 == 0) goto L_0x0020
                int r9 = p030c.C2210a.f6463s
                goto L_0x0011
            L_0x0020:
                int[] r1 = r7.f2118d
                boolean r1 = r7.m1777f(r1, r9)
                r5 = 16842801(0x1010031, float:2.3693695E-38)
                if (r1 == 0) goto L_0x0032
                android.graphics.PorterDuff$Mode r0 = android.graphics.PorterDuff.Mode.MULTIPLY
            L_0x002d:
                r1 = r0
                r0 = r4
                r9 = r5
                r5 = r2
                goto L_0x004f
            L_0x0032:
                int r1 = p030c.C2214e.f6532u
                if (r9 != r1) goto L_0x0046
                r9 = 1109603123(0x42233333, float:40.8)
                int r9 = java.lang.Math.round(r9)
                r1 = 16842800(0x1010030, float:2.3693693E-38)
                r5 = r2
                r6 = r0
                r0 = r9
                r9 = r1
                r1 = r6
                goto L_0x004f
            L_0x0046:
                int r1 = p030c.C2214e.f6523l
                if (r9 != r1) goto L_0x004b
                goto L_0x002d
            L_0x004b:
                r1 = r0
                r9 = r3
                r5 = r9
                goto L_0x0013
            L_0x004f:
                if (r5 == 0) goto L_0x006c
                boolean r3 = androidx.appcompat.widget.C0485s0.m1967a(r10)
                if (r3 == 0) goto L_0x005b
                android.graphics.drawable.Drawable r10 = r10.mutate()
            L_0x005b:
                int r8 = androidx.appcompat.widget.C0470n1.m1924c(r8, r9)
                android.graphics.PorterDuffColorFilter r8 = androidx.appcompat.widget.C0444i.m1770e(r8, r1)
                r10.setColorFilter(r8)
                if (r0 == r4) goto L_0x006b
                r10.setAlpha(r0)
            L_0x006b:
                return r2
            L_0x006c:
                return r3
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.C0444i.C0445a.mo2124c(android.content.Context, int, android.graphics.drawable.Drawable):boolean");
        }

        /* renamed from: d */
        public PorterDuff.Mode mo2125d(int i) {
            if (i == C2214e.f6500H) {
                return PorterDuff.Mode.MULTIPLY;
            }
            return null;
        }

        /* renamed from: e */
        public boolean mo2126e(Context context, int i, Drawable drawable) {
            if (i == C2214e.f6495C) {
                LayerDrawable layerDrawable = (LayerDrawable) drawable;
                Drawable findDrawableByLayerId = layerDrawable.findDrawableByLayerId(16908288);
                int i2 = C2210a.f6465u;
                m1784m(findDrawableByLayerId, C0470n1.m1924c(context, i2), C0444i.f2112b);
                m1784m(layerDrawable.findDrawableByLayerId(16908303), C0470n1.m1924c(context, i2), C0444i.f2112b);
                m1784m(layerDrawable.findDrawableByLayerId(16908301), C0470n1.m1924c(context, C2210a.f6463s), C0444i.f2112b);
                return true;
            } else if (i != C2214e.f6536y && i != C2214e.f6535x && i != C2214e.f6537z) {
                return false;
            } else {
                LayerDrawable layerDrawable2 = (LayerDrawable) drawable;
                m1784m(layerDrawable2.findDrawableByLayerId(16908288), C0470n1.m1923b(context, C2210a.f6465u), C0444i.f2112b);
                Drawable findDrawableByLayerId2 = layerDrawable2.findDrawableByLayerId(16908303);
                int i3 = C2210a.f6463s;
                m1784m(findDrawableByLayerId2, C0470n1.m1924c(context, i3), C0444i.f2112b);
                m1784m(layerDrawable2.findDrawableByLayerId(16908301), C0470n1.m1924c(context, i3), C0444i.f2112b);
                return true;
            }
        }
    }

    /* renamed from: b */
    public static synchronized C0444i m1769b() {
        C0444i iVar;
        synchronized (C0444i.class) {
            if (f2113c == null) {
                m1771h();
            }
            iVar = f2113c;
        }
        return iVar;
    }

    /* renamed from: e */
    public static synchronized PorterDuffColorFilter m1770e(int i, PorterDuff.Mode mode) {
        PorterDuffColorFilter l;
        synchronized (C0444i.class) {
            l = C0436h1.m1740l(i, mode);
        }
        return l;
    }

    /* renamed from: h */
    public static synchronized void m1771h() {
        synchronized (C0444i.class) {
            if (f2113c == null) {
                C0444i iVar = new C0444i();
                f2113c = iVar;
                iVar.f2114a = C0436h1.m1738h();
                f2113c.f2114a.mo2117u(new C0445a());
            }
        }
    }

    /* renamed from: i */
    static void m1772i(Drawable drawable, C0476p1 p1Var, int[] iArr) {
        C0436h1.m1746w(drawable, p1Var, iArr);
    }

    /* renamed from: c */
    public synchronized Drawable mo2127c(Context context, int i) {
        return this.f2114a.mo2111j(context, i);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public synchronized Drawable mo2128d(Context context, int i, boolean z) {
        return this.f2114a.mo2112k(context, i, z);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public synchronized ColorStateList mo2129f(Context context, int i) {
        return this.f2114a.mo2113m(context, i);
    }

    /* renamed from: g */
    public synchronized void mo2130g(Context context) {
        this.f2114a.mo2115s(context);
    }
}
