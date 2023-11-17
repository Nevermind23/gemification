package p058e;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.SparseArray;
import androidx.core.graphics.drawable.C0836a;

/* renamed from: e.b */
public abstract class C5871b extends Drawable implements Drawable.Callback {

    /* renamed from: d */
    private C5875d f18403d;

    /* renamed from: e */
    private Rect f18404e;

    /* renamed from: f */
    private Drawable f18405f;

    /* renamed from: g */
    private Drawable f18406g;

    /* renamed from: h */
    private int f18407h = C11051p3.f31759c;

    /* renamed from: i */
    private boolean f18408i;

    /* renamed from: j */
    private int f18409j = -1;

    /* renamed from: k */
    private boolean f18410k;

    /* renamed from: l */
    private Runnable f18411l;

    /* renamed from: m */
    private long f18412m;

    /* renamed from: n */
    private long f18413n;

    /* renamed from: o */
    private C5874c f18414o;

    /* renamed from: e.b$a */
    class C5872a implements Runnable {
        C5872a() {
        }

        public void run() {
            C5871b.this.mo19115a(true);
            C5871b.this.invalidateSelf();
        }
    }

    /* renamed from: e.b$b */
    private static class C5873b {
        /* renamed from: a */
        public static boolean m23613a(Drawable.ConstantState constantState) {
            return constantState.canApplyTheme();
        }

        /* renamed from: b */
        public static void m23614b(Drawable drawable, Outline outline) {
            drawable.getOutline(outline);
        }

        /* renamed from: c */
        public static Resources m23615c(Resources.Theme theme) {
            return theme.getResources();
        }
    }

    /* renamed from: e.b$c */
    static class C5874c implements Drawable.Callback {

        /* renamed from: d */
        private Drawable.Callback f18416d;

        C5874c() {
        }

        /* renamed from: a */
        public Drawable.Callback mo19151a() {
            Drawable.Callback callback = this.f18416d;
            this.f18416d = null;
            return callback;
        }

        /* renamed from: b */
        public C5874c mo19152b(Drawable.Callback callback) {
            this.f18416d = callback;
            return this;
        }

        public void invalidateDrawable(Drawable drawable) {
        }

        public void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
            Drawable.Callback callback = this.f18416d;
            if (callback != null) {
                callback.scheduleDrawable(drawable, runnable, j);
            }
        }

        public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
            Drawable.Callback callback = this.f18416d;
            if (callback != null) {
                callback.unscheduleDrawable(drawable, runnable);
            }
        }
    }

    /* renamed from: e.b$d */
    static abstract class C5875d extends Drawable.ConstantState {

        /* renamed from: A */
        int f18417A = 0;

        /* renamed from: B */
        int f18418B = 0;

        /* renamed from: C */
        boolean f18419C;

        /* renamed from: D */
        ColorFilter f18420D;

        /* renamed from: E */
        boolean f18421E;

        /* renamed from: F */
        ColorStateList f18422F;

        /* renamed from: G */
        PorterDuff.Mode f18423G;

        /* renamed from: H */
        boolean f18424H;

        /* renamed from: I */
        boolean f18425I;

        /* renamed from: a */
        final C5871b f18426a;

        /* renamed from: b */
        Resources f18427b;

        /* renamed from: c */
        int f18428c;

        /* renamed from: d */
        int f18429d;

        /* renamed from: e */
        int f18430e;

        /* renamed from: f */
        SparseArray f18431f;

        /* renamed from: g */
        Drawable[] f18432g;

        /* renamed from: h */
        int f18433h;

        /* renamed from: i */
        boolean f18434i = false;

        /* renamed from: j */
        boolean f18435j;

        /* renamed from: k */
        Rect f18436k;

        /* renamed from: l */
        boolean f18437l = false;

        /* renamed from: m */
        boolean f18438m;

        /* renamed from: n */
        int f18439n;

        /* renamed from: o */
        int f18440o;

        /* renamed from: p */
        int f18441p;

        /* renamed from: q */
        int f18442q;

        /* renamed from: r */
        boolean f18443r;

        /* renamed from: s */
        int f18444s;

        /* renamed from: t */
        boolean f18445t;

        /* renamed from: u */
        boolean f18446u;

        /* renamed from: v */
        boolean f18447v;

        /* renamed from: w */
        boolean f18448w;

        /* renamed from: x */
        boolean f18449x = true;

        /* renamed from: y */
        boolean f18450y;

        /* renamed from: z */
        int f18451z;

        C5875d(C5875d dVar, C5871b bVar, Resources resources) {
            Resources resources2;
            int i;
            this.f18426a = bVar;
            Rect rect = null;
            if (resources != null) {
                resources2 = resources;
            } else if (dVar != null) {
                resources2 = dVar.f18427b;
            } else {
                resources2 = null;
            }
            this.f18427b = resources2;
            if (dVar != null) {
                i = dVar.f18428c;
            } else {
                i = 0;
            }
            int f = C5871b.m23606f(resources, i);
            this.f18428c = f;
            if (dVar != null) {
                this.f18429d = dVar.f18429d;
                this.f18430e = dVar.f18430e;
                this.f18447v = true;
                this.f18448w = true;
                this.f18434i = dVar.f18434i;
                this.f18437l = dVar.f18437l;
                this.f18449x = dVar.f18449x;
                this.f18450y = dVar.f18450y;
                this.f18451z = dVar.f18451z;
                this.f18417A = dVar.f18417A;
                this.f18418B = dVar.f18418B;
                this.f18419C = dVar.f18419C;
                this.f18420D = dVar.f18420D;
                this.f18421E = dVar.f18421E;
                this.f18422F = dVar.f18422F;
                this.f18423G = dVar.f18423G;
                this.f18424H = dVar.f18424H;
                this.f18425I = dVar.f18425I;
                if (dVar.f18428c == f) {
                    if (dVar.f18435j) {
                        this.f18436k = dVar.f18436k != null ? new Rect(dVar.f18436k) : rect;
                        this.f18435j = true;
                    }
                    if (dVar.f18438m) {
                        this.f18439n = dVar.f18439n;
                        this.f18440o = dVar.f18440o;
                        this.f18441p = dVar.f18441p;
                        this.f18442q = dVar.f18442q;
                        this.f18438m = true;
                    }
                }
                if (dVar.f18443r) {
                    this.f18444s = dVar.f18444s;
                    this.f18443r = true;
                }
                if (dVar.f18445t) {
                    this.f18446u = dVar.f18446u;
                    this.f18445t = true;
                }
                Drawable[] drawableArr = dVar.f18432g;
                this.f18432g = new Drawable[drawableArr.length];
                this.f18433h = dVar.f18433h;
                SparseArray sparseArray = dVar.f18431f;
                if (sparseArray != null) {
                    this.f18431f = sparseArray.clone();
                } else {
                    this.f18431f = new SparseArray(this.f18433h);
                }
                int i2 = this.f18433h;
                for (int i3 = 0; i3 < i2; i3++) {
                    Drawable drawable = drawableArr[i3];
                    if (drawable != null) {
                        Drawable.ConstantState constantState = drawable.getConstantState();
                        if (constantState != null) {
                            this.f18431f.put(i3, constantState);
                        } else {
                            this.f18432g[i3] = drawableArr[i3];
                        }
                    }
                }
                return;
            }
            this.f18432g = new Drawable[10];
            this.f18433h = 0;
        }

        /* renamed from: e */
        private void m23618e() {
            SparseArray sparseArray = this.f18431f;
            if (sparseArray != null) {
                int size = sparseArray.size();
                for (int i = 0; i < size; i++) {
                    this.f18432g[this.f18431f.keyAt(i)] = m23619s(((Drawable.ConstantState) this.f18431f.valueAt(i)).newDrawable(this.f18427b));
                }
                this.f18431f = null;
            }
        }

        /* renamed from: s */
        private Drawable m23619s(Drawable drawable) {
            C0836a.m3151m(drawable, this.f18451z);
            Drawable mutate = drawable.mutate();
            mutate.setCallback(this.f18426a);
            return mutate;
        }

        /* renamed from: a */
        public final int mo19156a(Drawable drawable) {
            int i = this.f18433h;
            if (i >= this.f18432g.length) {
                mo19171o(i, i + 10);
            }
            drawable.mutate();
            drawable.setVisible(false, true);
            drawable.setCallback(this.f18426a);
            this.f18432g[i] = drawable;
            this.f18433h++;
            this.f18430e = drawable.getChangingConfigurations() | this.f18430e;
            mo19172p();
            this.f18436k = null;
            this.f18435j = false;
            this.f18438m = false;
            this.f18447v = false;
            return i;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public final void mo19157b(Resources.Theme theme) {
            if (theme != null) {
                m23618e();
                int i = this.f18433h;
                Drawable[] drawableArr = this.f18432g;
                for (int i2 = 0; i2 < i; i2++) {
                    Drawable drawable = drawableArr[i2];
                    if (drawable != null && C0836a.m3140b(drawable)) {
                        C0836a.m3139a(drawableArr[i2], theme);
                        this.f18430e |= drawableArr[i2].getChangingConfigurations();
                    }
                }
                mo19179y(C5873b.m23615c(theme));
            }
        }

        /* renamed from: c */
        public boolean mo19158c() {
            if (this.f18447v) {
                return this.f18448w;
            }
            m23618e();
            this.f18447v = true;
            int i = this.f18433h;
            Drawable[] drawableArr = this.f18432g;
            for (int i2 = 0; i2 < i; i2++) {
                if (drawableArr[i2].getConstantState() == null) {
                    this.f18448w = false;
                    return false;
                }
            }
            this.f18448w = true;
            return true;
        }

        public boolean canApplyTheme() {
            int i = this.f18433h;
            Drawable[] drawableArr = this.f18432g;
            for (int i2 = 0; i2 < i; i2++) {
                Drawable drawable = drawableArr[i2];
                if (drawable == null) {
                    Drawable.ConstantState constantState = (Drawable.ConstantState) this.f18431f.get(i2);
                    if (constantState != null && C5873b.m23613a(constantState)) {
                        return true;
                    }
                } else if (C0836a.m3140b(drawable)) {
                    return true;
                }
            }
            return false;
        }

        /* access modifiers changed from: protected */
        /* renamed from: d */
        public void mo19160d() {
            this.f18438m = true;
            m23618e();
            int i = this.f18433h;
            Drawable[] drawableArr = this.f18432g;
            this.f18440o = -1;
            this.f18439n = -1;
            this.f18442q = 0;
            this.f18441p = 0;
            for (int i2 = 0; i2 < i; i2++) {
                Drawable drawable = drawableArr[i2];
                int intrinsicWidth = drawable.getIntrinsicWidth();
                if (intrinsicWidth > this.f18439n) {
                    this.f18439n = intrinsicWidth;
                }
                int intrinsicHeight = drawable.getIntrinsicHeight();
                if (intrinsicHeight > this.f18440o) {
                    this.f18440o = intrinsicHeight;
                }
                int minimumWidth = drawable.getMinimumWidth();
                if (minimumWidth > this.f18441p) {
                    this.f18441p = minimumWidth;
                }
                int minimumHeight = drawable.getMinimumHeight();
                if (minimumHeight > this.f18442q) {
                    this.f18442q = minimumHeight;
                }
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: f */
        public final int mo19161f() {
            return this.f18432g.length;
        }

        /* renamed from: g */
        public final Drawable mo19162g(int i) {
            int indexOfKey;
            Drawable drawable = this.f18432g[i];
            if (drawable != null) {
                return drawable;
            }
            SparseArray sparseArray = this.f18431f;
            if (sparseArray == null || (indexOfKey = sparseArray.indexOfKey(i)) < 0) {
                return null;
            }
            Drawable s = m23619s(((Drawable.ConstantState) this.f18431f.valueAt(indexOfKey)).newDrawable(this.f18427b));
            this.f18432g[i] = s;
            this.f18431f.removeAt(indexOfKey);
            if (this.f18431f.size() == 0) {
                this.f18431f = null;
            }
            return s;
        }

        public int getChangingConfigurations() {
            return this.f18429d | this.f18430e;
        }

        /* renamed from: h */
        public final int mo19164h() {
            return this.f18433h;
        }

        /* renamed from: i */
        public final int mo19165i() {
            if (!this.f18438m) {
                mo19160d();
            }
            return this.f18440o;
        }

        /* renamed from: j */
        public final int mo19166j() {
            if (!this.f18438m) {
                mo19160d();
            }
            return this.f18442q;
        }

        /* renamed from: k */
        public final int mo19167k() {
            if (!this.f18438m) {
                mo19160d();
            }
            return this.f18441p;
        }

        /* renamed from: l */
        public final Rect mo19168l() {
            Rect rect = null;
            if (this.f18434i) {
                return null;
            }
            Rect rect2 = this.f18436k;
            if (rect2 != null || this.f18435j) {
                return rect2;
            }
            m23618e();
            Rect rect3 = new Rect();
            int i = this.f18433h;
            Drawable[] drawableArr = this.f18432g;
            for (int i2 = 0; i2 < i; i2++) {
                if (drawableArr[i2].getPadding(rect3)) {
                    if (rect == null) {
                        rect = new Rect(0, 0, 0, 0);
                    }
                    int i3 = rect3.left;
                    if (i3 > rect.left) {
                        rect.left = i3;
                    }
                    int i4 = rect3.top;
                    if (i4 > rect.top) {
                        rect.top = i4;
                    }
                    int i5 = rect3.right;
                    if (i5 > rect.right) {
                        rect.right = i5;
                    }
                    int i6 = rect3.bottom;
                    if (i6 > rect.bottom) {
                        rect.bottom = i6;
                    }
                }
            }
            this.f18435j = true;
            this.f18436k = rect;
            return rect;
        }

        /* renamed from: m */
        public final int mo19169m() {
            if (!this.f18438m) {
                mo19160d();
            }
            return this.f18439n;
        }

        /* renamed from: n */
        public final int mo19170n() {
            int i;
            if (this.f18443r) {
                return this.f18444s;
            }
            m23618e();
            int i2 = this.f18433h;
            Drawable[] drawableArr = this.f18432g;
            if (i2 > 0) {
                i = drawableArr[0].getOpacity();
            } else {
                i = -2;
            }
            for (int i3 = 1; i3 < i2; i3++) {
                i = Drawable.resolveOpacity(i, drawableArr[i3].getOpacity());
            }
            this.f18444s = i;
            this.f18443r = true;
            return i;
        }

        /* renamed from: o */
        public void mo19171o(int i, int i2) {
            Drawable[] drawableArr = new Drawable[i2];
            Drawable[] drawableArr2 = this.f18432g;
            if (drawableArr2 != null) {
                System.arraycopy(drawableArr2, 0, drawableArr, 0, i);
            }
            this.f18432g = drawableArr;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: p */
        public void mo19172p() {
            this.f18443r = false;
            this.f18445t = false;
        }

        /* renamed from: q */
        public final boolean mo19173q() {
            return this.f18437l;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: r */
        public abstract void mo19109r();

        /* renamed from: t */
        public final void mo19174t(boolean z) {
            this.f18437l = z;
        }

        /* renamed from: u */
        public final void mo19175u(int i) {
            this.f18417A = i;
        }

        /* renamed from: v */
        public final void mo19176v(int i) {
            this.f18418B = i;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: w */
        public final boolean mo19177w(int i, int i2) {
            int i3 = this.f18433h;
            Drawable[] drawableArr = this.f18432g;
            boolean z = false;
            for (int i4 = 0; i4 < i3; i4++) {
                Drawable drawable = drawableArr[i4];
                if (drawable != null) {
                    boolean m = C0836a.m3151m(drawable, i);
                    if (i4 == i2) {
                        z = m;
                    }
                }
            }
            this.f18451z = i;
            return z;
        }

        /* renamed from: x */
        public final void mo19178x(boolean z) {
            this.f18434i = z;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: y */
        public final void mo19179y(Resources resources) {
            if (resources != null) {
                this.f18427b = resources;
                int f = C5871b.m23606f(resources, this.f18428c);
                int i = this.f18428c;
                this.f18428c = f;
                if (i != f) {
                    this.f18438m = false;
                    this.f18435j = false;
                }
            }
        }
    }

    /* renamed from: d */
    private void m23604d(Drawable drawable) {
        if (this.f18414o == null) {
            this.f18414o = new C5874c();
        }
        drawable.setCallback(this.f18414o.mo19152b(drawable.getCallback()));
        try {
            if (this.f18403d.f18417A <= 0 && this.f18408i) {
                drawable.setAlpha(this.f18407h);
            }
            C5875d dVar = this.f18403d;
            if (dVar.f18421E) {
                drawable.setColorFilter(dVar.f18420D);
            } else {
                if (dVar.f18424H) {
                    C0836a.m3153o(drawable, dVar.f18422F);
                }
                C5875d dVar2 = this.f18403d;
                if (dVar2.f18425I) {
                    C0836a.m3154p(drawable, dVar2.f18423G);
                }
            }
            drawable.setVisible(isVisible(), true);
            drawable.setDither(this.f18403d.f18449x);
            drawable.setState(getState());
            drawable.setLevel(getLevel());
            drawable.setBounds(getBounds());
            C0836a.m3151m(drawable, C0836a.m3144f(this));
            C0836a.m3148j(drawable, this.f18403d.f18419C);
            Rect rect = this.f18404e;
            if (rect != null) {
                C0836a.m3150l(drawable, rect.left, rect.top, rect.right, rect.bottom);
            }
        } finally {
            drawable.setCallback(this.f18414o.mo19151a());
        }
    }

    /* renamed from: e */
    private boolean m23605e() {
        if (!isAutoMirrored() || C0836a.m3144f(this) != 1) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    static int m23606f(Resources resources, int i) {
        if (resources != null) {
            i = resources.getDisplayMetrics().densityDpi;
        }
        if (i == 0) {
            return 160;
        }
        return i;
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x003d  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0061  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0066 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:24:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo19115a(boolean r14) {
        /*
            r13 = this;
            r0 = 1
            r13.f18408i = r0
            long r1 = android.os.SystemClock.uptimeMillis()
            android.graphics.drawable.Drawable r3 = r13.f18405f
            r4 = 255(0xff, double:1.26E-321)
            r6 = 0
            r8 = 0
            if (r3 == 0) goto L_0x0036
            long r9 = r13.f18412m
            int r11 = (r9 > r6 ? 1 : (r9 == r6 ? 0 : -1))
            if (r11 == 0) goto L_0x0038
            int r11 = (r9 > r1 ? 1 : (r9 == r1 ? 0 : -1))
            if (r11 > 0) goto L_0x0022
            int r9 = r13.f18407h
            r3.setAlpha(r9)
            r13.f18412m = r6
            goto L_0x0038
        L_0x0022:
            long r9 = r9 - r1
            long r9 = r9 * r4
            int r9 = (int) r9
            e.b$d r10 = r13.f18403d
            int r10 = r10.f18417A
            int r9 = r9 / r10
            int r9 = 255 - r9
            int r10 = r13.f18407h
            int r9 = r9 * r10
            int r9 = r9 / 255
            r3.setAlpha(r9)
            r3 = r0
            goto L_0x0039
        L_0x0036:
            r13.f18412m = r6
        L_0x0038:
            r3 = r8
        L_0x0039:
            android.graphics.drawable.Drawable r9 = r13.f18406g
            if (r9 == 0) goto L_0x0061
            long r10 = r13.f18413n
            int r12 = (r10 > r6 ? 1 : (r10 == r6 ? 0 : -1))
            if (r12 == 0) goto L_0x0063
            int r12 = (r10 > r1 ? 1 : (r10 == r1 ? 0 : -1))
            if (r12 > 0) goto L_0x0050
            r9.setVisible(r8, r8)
            r0 = 0
            r13.f18406g = r0
            r13.f18413n = r6
            goto L_0x0063
        L_0x0050:
            long r10 = r10 - r1
            long r10 = r10 * r4
            int r3 = (int) r10
            e.b$d r4 = r13.f18403d
            int r4 = r4.f18418B
            int r3 = r3 / r4
            int r4 = r13.f18407h
            int r3 = r3 * r4
            int r3 = r3 / 255
            r9.setAlpha(r3)
            goto L_0x0064
        L_0x0061:
            r13.f18413n = r6
        L_0x0063:
            r0 = r3
        L_0x0064:
            if (r14 == 0) goto L_0x0070
            if (r0 == 0) goto L_0x0070
            java.lang.Runnable r14 = r13.f18411l
            r3 = 16
            long r1 = r1 + r3
            r13.scheduleSelf(r14, r1)
        L_0x0070:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p058e.C5871b.mo19115a(boolean):void");
    }

    public void applyTheme(Resources.Theme theme) {
        this.f18403d.mo19157b(theme);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public abstract C5875d mo19089b();

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public int mo19117c() {
        return this.f18409j;
    }

    public boolean canApplyTheme() {
        return this.f18403d.canApplyTheme();
    }

    public void draw(Canvas canvas) {
        Drawable drawable = this.f18405f;
        if (drawable != null) {
            drawable.draw(canvas);
        }
        Drawable drawable2 = this.f18406g;
        if (drawable2 != null) {
            drawable2.draw(canvas);
        }
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x006b  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0073  */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo19120g(int r10) {
        /*
            r9 = this;
            int r0 = r9.f18409j
            r1 = 0
            if (r10 != r0) goto L_0x0006
            return r1
        L_0x0006:
            long r2 = android.os.SystemClock.uptimeMillis()
            e.b$d r0 = r9.f18403d
            int r0 = r0.f18418B
            r4 = 0
            r5 = 0
            if (r0 <= 0) goto L_0x002e
            android.graphics.drawable.Drawable r0 = r9.f18406g
            if (r0 == 0) goto L_0x001a
            r0.setVisible(r1, r1)
        L_0x001a:
            android.graphics.drawable.Drawable r0 = r9.f18405f
            if (r0 == 0) goto L_0x0029
            r9.f18406g = r0
            e.b$d r0 = r9.f18403d
            int r0 = r0.f18418B
            long r0 = (long) r0
            long r0 = r0 + r2
            r9.f18413n = r0
            goto L_0x0035
        L_0x0029:
            r9.f18406g = r4
            r9.f18413n = r5
            goto L_0x0035
        L_0x002e:
            android.graphics.drawable.Drawable r0 = r9.f18405f
            if (r0 == 0) goto L_0x0035
            r0.setVisible(r1, r1)
        L_0x0035:
            if (r10 < 0) goto L_0x0055
            e.b$d r0 = r9.f18403d
            int r1 = r0.f18433h
            if (r10 >= r1) goto L_0x0055
            android.graphics.drawable.Drawable r0 = r0.mo19162g(r10)
            r9.f18405f = r0
            r9.f18409j = r10
            if (r0 == 0) goto L_0x005a
            e.b$d r10 = r9.f18403d
            int r10 = r10.f18417A
            if (r10 <= 0) goto L_0x0051
            long r7 = (long) r10
            long r2 = r2 + r7
            r9.f18412m = r2
        L_0x0051:
            r9.m23604d(r0)
            goto L_0x005a
        L_0x0055:
            r9.f18405f = r4
            r10 = -1
            r9.f18409j = r10
        L_0x005a:
            long r0 = r9.f18412m
            int r10 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            r0 = 1
            if (r10 != 0) goto L_0x0067
            long r1 = r9.f18413n
            int r10 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r10 == 0) goto L_0x0079
        L_0x0067:
            java.lang.Runnable r10 = r9.f18411l
            if (r10 != 0) goto L_0x0073
            e.b$a r10 = new e.b$a
            r10.<init>()
            r9.f18411l = r10
            goto L_0x0076
        L_0x0073:
            r9.unscheduleSelf(r10)
        L_0x0076:
            r9.mo19115a(r0)
        L_0x0079:
            r9.invalidateSelf()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p058e.C5871b.mo19120g(int):boolean");
    }

    public int getAlpha() {
        return this.f18407h;
    }

    public int getChangingConfigurations() {
        return super.getChangingConfigurations() | this.f18403d.getChangingConfigurations();
    }

    public final Drawable.ConstantState getConstantState() {
        if (!this.f18403d.mo19158c()) {
            return null;
        }
        this.f18403d.f18429d = getChangingConfigurations();
        return this.f18403d;
    }

    public Drawable getCurrent() {
        return this.f18405f;
    }

    public void getHotspotBounds(Rect rect) {
        Rect rect2 = this.f18404e;
        if (rect2 != null) {
            rect.set(rect2);
        } else {
            super.getHotspotBounds(rect);
        }
    }

    public int getIntrinsicHeight() {
        if (this.f18403d.mo19173q()) {
            return this.f18403d.mo19165i();
        }
        Drawable drawable = this.f18405f;
        if (drawable != null) {
            return drawable.getIntrinsicHeight();
        }
        return -1;
    }

    public int getIntrinsicWidth() {
        if (this.f18403d.mo19173q()) {
            return this.f18403d.mo19169m();
        }
        Drawable drawable = this.f18405f;
        if (drawable != null) {
            return drawable.getIntrinsicWidth();
        }
        return -1;
    }

    public int getMinimumHeight() {
        if (this.f18403d.mo19173q()) {
            return this.f18403d.mo19166j();
        }
        Drawable drawable = this.f18405f;
        if (drawable != null) {
            return drawable.getMinimumHeight();
        }
        return 0;
    }

    public int getMinimumWidth() {
        if (this.f18403d.mo19173q()) {
            return this.f18403d.mo19167k();
        }
        Drawable drawable = this.f18405f;
        if (drawable != null) {
            return drawable.getMinimumWidth();
        }
        return 0;
    }

    public int getOpacity() {
        Drawable drawable = this.f18405f;
        if (drawable == null || !drawable.isVisible()) {
            return -2;
        }
        return this.f18403d.mo19170n();
    }

    public void getOutline(Outline outline) {
        Drawable drawable = this.f18405f;
        if (drawable != null) {
            C5873b.m23614b(drawable, outline);
        }
    }

    public boolean getPadding(Rect rect) {
        boolean z;
        Rect l = this.f18403d.mo19168l();
        if (l != null) {
            rect.set(l);
            if ((l.right | l.left | l.top | l.bottom) != 0) {
                z = true;
            } else {
                z = false;
            }
        } else {
            Drawable drawable = this.f18405f;
            if (drawable != null) {
                z = drawable.getPadding(rect);
            } else {
                z = super.getPadding(rect);
            }
        }
        if (m23605e()) {
            int i = rect.left;
            rect.left = rect.right;
            rect.right = i;
        }
        return z;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public void mo19090h(C5875d dVar) {
        this.f18403d = dVar;
        int i = this.f18409j;
        if (i >= 0) {
            Drawable g = dVar.mo19162g(i);
            this.f18405f = g;
            if (g != null) {
                m23604d(g);
            }
        }
        this.f18406g = null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public final void mo19133i(Resources resources) {
        this.f18403d.mo19179y(resources);
    }

    public void invalidateDrawable(Drawable drawable) {
        C5875d dVar = this.f18403d;
        if (dVar != null) {
            dVar.mo19172p();
        }
        if (drawable == this.f18405f && getCallback() != null) {
            getCallback().invalidateDrawable(this);
        }
    }

    public boolean isAutoMirrored() {
        return this.f18403d.f18419C;
    }

    public void jumpToCurrentState() {
        boolean z;
        Drawable drawable = this.f18406g;
        boolean z2 = true;
        if (drawable != null) {
            drawable.jumpToCurrentState();
            this.f18406g = null;
            z = true;
        } else {
            z = false;
        }
        Drawable drawable2 = this.f18405f;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
            if (this.f18408i) {
                this.f18405f.setAlpha(this.f18407h);
            }
        }
        if (this.f18413n != 0) {
            this.f18413n = 0;
            z = true;
        }
        if (this.f18412m != 0) {
            this.f18412m = 0;
        } else {
            z2 = z;
        }
        if (z2) {
            invalidateSelf();
        }
    }

    public Drawable mutate() {
        if (!this.f18410k && super.mutate() == this) {
            C5875d b = mo19089b();
            b.mo19109r();
            mo19090h(b);
            this.f18410k = true;
        }
        return this;
    }

    /* access modifiers changed from: protected */
    public void onBoundsChange(Rect rect) {
        Drawable drawable = this.f18406g;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
        Drawable drawable2 = this.f18405f;
        if (drawable2 != null) {
            drawable2.setBounds(rect);
        }
    }

    public boolean onLayoutDirectionChanged(int i) {
        return this.f18403d.mo19177w(i, mo19117c());
    }

    /* access modifiers changed from: protected */
    public boolean onLevelChange(int i) {
        Drawable drawable = this.f18406g;
        if (drawable != null) {
            return drawable.setLevel(i);
        }
        Drawable drawable2 = this.f18405f;
        if (drawable2 != null) {
            return drawable2.setLevel(i);
        }
        return false;
    }

    public void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        if (drawable == this.f18405f && getCallback() != null) {
            getCallback().scheduleDrawable(this, runnable, j);
        }
    }

    public void setAlpha(int i) {
        if (!this.f18408i || this.f18407h != i) {
            this.f18408i = true;
            this.f18407h = i;
            Drawable drawable = this.f18405f;
            if (drawable == null) {
                return;
            }
            if (this.f18412m == 0) {
                drawable.setAlpha(i);
            } else {
                mo19115a(false);
            }
        }
    }

    public void setAutoMirrored(boolean z) {
        C5875d dVar = this.f18403d;
        if (dVar.f18419C != z) {
            dVar.f18419C = z;
            Drawable drawable = this.f18405f;
            if (drawable != null) {
                C0836a.m3148j(drawable, z);
            }
        }
    }

    public void setColorFilter(ColorFilter colorFilter) {
        C5875d dVar = this.f18403d;
        dVar.f18421E = true;
        if (dVar.f18420D != colorFilter) {
            dVar.f18420D = colorFilter;
            Drawable drawable = this.f18405f;
            if (drawable != null) {
                drawable.setColorFilter(colorFilter);
            }
        }
    }

    public void setDither(boolean z) {
        C5875d dVar = this.f18403d;
        if (dVar.f18449x != z) {
            dVar.f18449x = z;
            Drawable drawable = this.f18405f;
            if (drawable != null) {
                drawable.setDither(z);
            }
        }
    }

    public void setHotspot(float f, float f2) {
        Drawable drawable = this.f18405f;
        if (drawable != null) {
            C0836a.m3149k(drawable, f, f2);
        }
    }

    public void setHotspotBounds(int i, int i2, int i3, int i4) {
        Rect rect = this.f18404e;
        if (rect == null) {
            this.f18404e = new Rect(i, i2, i3, i4);
        } else {
            rect.set(i, i2, i3, i4);
        }
        Drawable drawable = this.f18405f;
        if (drawable != null) {
            C0836a.m3150l(drawable, i, i2, i3, i4);
        }
    }

    public void setTint(int i) {
        setTintList(ColorStateList.valueOf(i));
    }

    public void setTintList(ColorStateList colorStateList) {
        C5875d dVar = this.f18403d;
        dVar.f18424H = true;
        if (dVar.f18422F != colorStateList) {
            dVar.f18422F = colorStateList;
            C0836a.m3153o(this.f18405f, colorStateList);
        }
    }

    public void setTintMode(PorterDuff.Mode mode) {
        C5875d dVar = this.f18403d;
        dVar.f18425I = true;
        if (dVar.f18423G != mode) {
            dVar.f18423G = mode;
            C0836a.m3154p(this.f18405f, mode);
        }
    }

    public boolean setVisible(boolean z, boolean z2) {
        boolean visible = super.setVisible(z, z2);
        Drawable drawable = this.f18406g;
        if (drawable != null) {
            drawable.setVisible(z, z2);
        }
        Drawable drawable2 = this.f18405f;
        if (drawable2 != null) {
            drawable2.setVisible(z, z2);
        }
        return visible;
    }

    public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        if (drawable == this.f18405f && getCallback() != null) {
            getCallback().unscheduleDrawable(this, runnable);
        }
    }
}
