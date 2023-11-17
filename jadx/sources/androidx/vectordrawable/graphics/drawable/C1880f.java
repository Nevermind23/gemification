package androidx.vectordrawable.graphics.drawable;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.VectorDrawable;
import android.os.Build;
import android.util.AttributeSet;
import androidx.collection.ArrayMap;
import androidx.core.content.res.C0798d;
import androidx.core.content.res.C0820l;
import androidx.core.graphics.C0856f;
import androidx.core.graphics.drawable.C0836a;
import com.github.mikephil.charting.utils.Utils;
import com.salesforce.marketingcloud.C11398b;
import java.util.ArrayDeque;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* renamed from: androidx.vectordrawable.graphics.drawable.f */
public class C1880f extends C1879e {

    /* renamed from: n */
    static final PorterDuff.Mode f5662n = PorterDuff.Mode.SRC_IN;

    /* renamed from: e */
    private C1888h f5663e;

    /* renamed from: f */
    private PorterDuffColorFilter f5664f;

    /* renamed from: g */
    private ColorFilter f5665g;

    /* renamed from: h */
    private boolean f5666h;

    /* renamed from: i */
    private boolean f5667i;

    /* renamed from: j */
    private Drawable.ConstantState f5668j;

    /* renamed from: k */
    private final float[] f5669k;

    /* renamed from: l */
    private final Matrix f5670l;

    /* renamed from: m */
    private final Rect f5671m;

    /* renamed from: androidx.vectordrawable.graphics.drawable.f$b */
    private static class C1882b extends C1886f {
        C1882b() {
        }

        /* renamed from: f */
        private void m7341f(TypedArray typedArray, XmlPullParser xmlPullParser) {
            String string = typedArray.getString(0);
            if (string != null) {
                this.f5698b = string;
            }
            String string2 = typedArray.getString(1);
            if (string2 != null) {
                this.f5697a = C0856f.m3198d(string2);
            }
            this.f5699c = C0820l.m3068k(typedArray, xmlPullParser, "fillType", 2, 0);
        }

        /* renamed from: c */
        public boolean mo6356c() {
            return true;
        }

        /* renamed from: e */
        public void mo6357e(Resources resources, AttributeSet attributeSet, Resources.Theme theme, XmlPullParser xmlPullParser) {
            if (C0820l.m3075r(xmlPullParser, "pathData")) {
                TypedArray s = C0820l.m3076s(resources, theme, attributeSet, C1874a.f5650d);
                m7341f(s, xmlPullParser);
                s.recycle();
            }
        }

        C1882b(C1882b bVar) {
            super(bVar);
        }
    }

    /* renamed from: androidx.vectordrawable.graphics.drawable.f$e */
    private static abstract class C1885e {
        private C1885e() {
        }

        /* renamed from: a */
        public boolean mo6358a() {
            return false;
        }

        /* renamed from: b */
        public boolean mo6359b(int[] iArr) {
            return false;
        }
    }

    /* renamed from: androidx.vectordrawable.graphics.drawable.f$h */
    private static class C1888h extends Drawable.ConstantState {

        /* renamed from: a */
        int f5718a;

        /* renamed from: b */
        C1887g f5719b;

        /* renamed from: c */
        ColorStateList f5720c;

        /* renamed from: d */
        PorterDuff.Mode f5721d;

        /* renamed from: e */
        boolean f5722e;

        /* renamed from: f */
        Bitmap f5723f;

        /* renamed from: g */
        ColorStateList f5724g;

        /* renamed from: h */
        PorterDuff.Mode f5725h;

        /* renamed from: i */
        int f5726i;

        /* renamed from: j */
        boolean f5727j;

        /* renamed from: k */
        boolean f5728k;

        /* renamed from: l */
        Paint f5729l;

        public C1888h(C1888h hVar) {
            this.f5720c = null;
            this.f5721d = C1880f.f5662n;
            if (hVar != null) {
                this.f5718a = hVar.f5718a;
                C1887g gVar = new C1887g(hVar.f5719b);
                this.f5719b = gVar;
                if (hVar.f5719b.f5706e != null) {
                    gVar.f5706e = new Paint(hVar.f5719b.f5706e);
                }
                if (hVar.f5719b.f5705d != null) {
                    this.f5719b.f5705d = new Paint(hVar.f5719b.f5705d);
                }
                this.f5720c = hVar.f5720c;
                this.f5721d = hVar.f5721d;
                this.f5722e = hVar.f5722e;
            }
        }

        /* renamed from: a */
        public boolean mo6405a(int i, int i2) {
            if (i == this.f5723f.getWidth() && i2 == this.f5723f.getHeight()) {
                return true;
            }
            return false;
        }

        /* renamed from: b */
        public boolean mo6406b() {
            if (!this.f5728k && this.f5724g == this.f5720c && this.f5725h == this.f5721d && this.f5727j == this.f5722e && this.f5726i == this.f5719b.getRootAlpha()) {
                return true;
            }
            return false;
        }

        /* renamed from: c */
        public void mo6407c(int i, int i2) {
            if (this.f5723f == null || !mo6405a(i, i2)) {
                this.f5723f = Bitmap.createBitmap(i, i2, Bitmap.Config.ARGB_8888);
                this.f5728k = true;
            }
        }

        /* renamed from: d */
        public void mo6408d(Canvas canvas, ColorFilter colorFilter, Rect rect) {
            canvas.drawBitmap(this.f5723f, (Rect) null, rect, mo6409e(colorFilter));
        }

        /* renamed from: e */
        public Paint mo6409e(ColorFilter colorFilter) {
            if (!mo6410f() && colorFilter == null) {
                return null;
            }
            if (this.f5729l == null) {
                Paint paint = new Paint();
                this.f5729l = paint;
                paint.setFilterBitmap(true);
            }
            this.f5729l.setAlpha(this.f5719b.getRootAlpha());
            this.f5729l.setColorFilter(colorFilter);
            return this.f5729l;
        }

        /* renamed from: f */
        public boolean mo6410f() {
            return this.f5719b.getRootAlpha() < 255;
        }

        /* renamed from: g */
        public boolean mo6411g() {
            return this.f5719b.mo6399f();
        }

        public int getChangingConfigurations() {
            return this.f5718a;
        }

        /* renamed from: h */
        public boolean mo6413h(int[] iArr) {
            boolean g = this.f5719b.mo6400g(iArr);
            this.f5728k |= g;
            return g;
        }

        /* renamed from: i */
        public void mo6414i() {
            this.f5724g = this.f5720c;
            this.f5725h = this.f5721d;
            this.f5726i = this.f5719b.getRootAlpha();
            this.f5727j = this.f5722e;
            this.f5728k = false;
        }

        /* renamed from: j */
        public void mo6415j(int i, int i2) {
            this.f5723f.eraseColor(0);
            this.f5719b.mo6398b(new Canvas(this.f5723f), i, i2, (ColorFilter) null);
        }

        public Drawable newDrawable() {
            return new C1880f(this);
        }

        public Drawable newDrawable(Resources resources) {
            return new C1880f(this);
        }

        public C1888h() {
            this.f5720c = null;
            this.f5721d = C1880f.f5662n;
            this.f5719b = new C1887g();
        }
    }

    C1880f() {
        this.f5667i = true;
        this.f5669k = new float[9];
        this.f5670l = new Matrix();
        this.f5671m = new Rect();
        this.f5663e = new C1888h();
    }

    /* renamed from: a */
    static int m7331a(int i, float f) {
        return (i & 16777215) | (((int) (((float) Color.alpha(i)) * f)) << 24);
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0038 A[Catch:{ XmlPullParserException -> 0x004a, IOException -> 0x0045 }] */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x003d A[Catch:{ XmlPullParserException -> 0x004a, IOException -> 0x0045 }] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static androidx.vectordrawable.graphics.drawable.C1880f m7332b(android.content.res.Resources r6, int r7, android.content.res.Resources.Theme r8) {
        /*
            java.lang.String r0 = "parser error"
            java.lang.String r1 = "VectorDrawableCompat"
            int r2 = android.os.Build.VERSION.SDK_INT
            r3 = 24
            if (r2 < r3) goto L_0x0023
            androidx.vectordrawable.graphics.drawable.f r0 = new androidx.vectordrawable.graphics.drawable.f
            r0.<init>()
            android.graphics.drawable.Drawable r6 = androidx.core.content.res.C0808h.m3031f(r6, r7, r8)
            r0.f5661d = r6
            androidx.vectordrawable.graphics.drawable.f$i r6 = new androidx.vectordrawable.graphics.drawable.f$i
            android.graphics.drawable.Drawable r7 = r0.f5661d
            android.graphics.drawable.Drawable$ConstantState r7 = r7.getConstantState()
            r6.<init>(r7)
            r0.f5668j = r6
            return r0
        L_0x0023:
            android.content.res.XmlResourceParser r7 = r6.getXml(r7)     // Catch:{ XmlPullParserException -> 0x004a, IOException -> 0x0045 }
            android.util.AttributeSet r2 = android.util.Xml.asAttributeSet(r7)     // Catch:{ XmlPullParserException -> 0x004a, IOException -> 0x0045 }
        L_0x002b:
            int r3 = r7.next()     // Catch:{ XmlPullParserException -> 0x004a, IOException -> 0x0045 }
            r4 = 2
            if (r3 == r4) goto L_0x0036
            r5 = 1
            if (r3 == r5) goto L_0x0036
            goto L_0x002b
        L_0x0036:
            if (r3 != r4) goto L_0x003d
            androidx.vectordrawable.graphics.drawable.f r6 = m7333c(r6, r7, r2, r8)     // Catch:{ XmlPullParserException -> 0x004a, IOException -> 0x0045 }
            return r6
        L_0x003d:
            org.xmlpull.v1.XmlPullParserException r6 = new org.xmlpull.v1.XmlPullParserException     // Catch:{ XmlPullParserException -> 0x004a, IOException -> 0x0045 }
            java.lang.String r7 = "No start tag found"
            r6.<init>(r7)     // Catch:{ XmlPullParserException -> 0x004a, IOException -> 0x0045 }
            throw r6     // Catch:{ XmlPullParserException -> 0x004a, IOException -> 0x0045 }
        L_0x0045:
            r6 = move-exception
            android.util.Log.e(r1, r0, r6)
            goto L_0x004e
        L_0x004a:
            r6 = move-exception
            android.util.Log.e(r1, r0, r6)
        L_0x004e:
            r6 = 0
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.vectordrawable.graphics.drawable.C1880f.m7332b(android.content.res.Resources, int, android.content.res.Resources$Theme):androidx.vectordrawable.graphics.drawable.f");
    }

    /* renamed from: c */
    public static C1880f m7333c(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        C1880f fVar = new C1880f();
        fVar.inflate(resources, xmlPullParser, attributeSet, theme);
        return fVar;
    }

    /* renamed from: e */
    private void m7334e(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        C1888h hVar = this.f5663e;
        C1887g gVar = hVar.f5719b;
        ArrayDeque arrayDeque = new ArrayDeque();
        arrayDeque.push(gVar.f5709h);
        int eventType = xmlPullParser.getEventType();
        int depth = xmlPullParser.getDepth() + 1;
        boolean z = true;
        while (eventType != 1 && (xmlPullParser.getDepth() >= depth || eventType != 3)) {
            if (eventType == 2) {
                String name = xmlPullParser.getName();
                C1884d dVar = (C1884d) arrayDeque.peek();
                if ("path".equals(name)) {
                    C1883c cVar = new C1883c();
                    cVar.mo6360g(resources, attributeSet, theme, xmlPullParser);
                    dVar.f5685b.add(cVar);
                    if (cVar.getPathName() != null) {
                        gVar.f5717p.put(cVar.getPathName(), cVar);
                    }
                    hVar.f5718a = cVar.f5700d | hVar.f5718a;
                    z = false;
                } else if ("clip-path".equals(name)) {
                    C1882b bVar = new C1882b();
                    bVar.mo6357e(resources, attributeSet, theme, xmlPullParser);
                    dVar.f5685b.add(bVar);
                    if (bVar.getPathName() != null) {
                        gVar.f5717p.put(bVar.getPathName(), bVar);
                    }
                    hVar.f5718a = bVar.f5700d | hVar.f5718a;
                } else if ("group".equals(name)) {
                    C1884d dVar2 = new C1884d();
                    dVar2.mo6377c(resources, attributeSet, theme, xmlPullParser);
                    dVar.f5685b.add(dVar2);
                    arrayDeque.push(dVar2);
                    if (dVar2.getGroupName() != null) {
                        gVar.f5717p.put(dVar2.getGroupName(), dVar2);
                    }
                    hVar.f5718a = dVar2.f5694k | hVar.f5718a;
                }
            } else if (eventType == 3 && "group".equals(xmlPullParser.getName())) {
                arrayDeque.pop();
            }
            eventType = xmlPullParser.next();
        }
        if (z) {
            throw new XmlPullParserException("no path defined");
        }
    }

    /* renamed from: f */
    private boolean m7335f() {
        if (!isAutoMirrored() || C0836a.m3144f(this) != 1) {
            return false;
        }
        return true;
    }

    /* renamed from: g */
    private static PorterDuff.Mode m7336g(int i, PorterDuff.Mode mode) {
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

    /* renamed from: i */
    private void m7337i(TypedArray typedArray, XmlPullParser xmlPullParser, Resources.Theme theme) {
        C1888h hVar = this.f5663e;
        C1887g gVar = hVar.f5719b;
        hVar.f5721d = m7336g(C0820l.m3068k(typedArray, xmlPullParser, "tintMode", 6, -1), PorterDuff.Mode.SRC_IN);
        ColorStateList g = C0820l.m3064g(typedArray, xmlPullParser, theme, "tint", 1);
        if (g != null) {
            hVar.f5720c = g;
        }
        hVar.f5722e = C0820l.m3062e(typedArray, xmlPullParser, "autoMirrored", 5, hVar.f5722e);
        gVar.f5712k = C0820l.m3067j(typedArray, xmlPullParser, "viewportWidth", 7, gVar.f5712k);
        float j = C0820l.m3067j(typedArray, xmlPullParser, "viewportHeight", 8, gVar.f5713l);
        gVar.f5713l = j;
        if (gVar.f5712k <= Utils.FLOAT_EPSILON) {
            throw new XmlPullParserException(typedArray.getPositionDescription() + "<vector> tag requires viewportWidth > 0");
        } else if (j > Utils.FLOAT_EPSILON) {
            gVar.f5710i = typedArray.getDimension(3, gVar.f5710i);
            float dimension = typedArray.getDimension(2, gVar.f5711j);
            gVar.f5711j = dimension;
            if (gVar.f5710i <= Utils.FLOAT_EPSILON) {
                throw new XmlPullParserException(typedArray.getPositionDescription() + "<vector> tag requires width > 0");
            } else if (dimension > Utils.FLOAT_EPSILON) {
                gVar.setAlpha(C0820l.m3067j(typedArray, xmlPullParser, "alpha", 4, gVar.getAlpha()));
                String string = typedArray.getString(0);
                if (string != null) {
                    gVar.f5715n = string;
                    gVar.f5717p.put(string, gVar);
                }
            } else {
                throw new XmlPullParserException(typedArray.getPositionDescription() + "<vector> tag requires height > 0");
            }
        } else {
            throw new XmlPullParserException(typedArray.getPositionDescription() + "<vector> tag requires viewportHeight > 0");
        }
    }

    public /* bridge */ /* synthetic */ void applyTheme(Resources.Theme theme) {
        super.applyTheme(theme);
    }

    public boolean canApplyTheme() {
        Drawable drawable = this.f5661d;
        if (drawable == null) {
            return false;
        }
        C0836a.m3140b(drawable);
        return false;
    }

    public /* bridge */ /* synthetic */ void clearColorFilter() {
        super.clearColorFilter();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public Object mo6328d(String str) {
        return this.f5663e.f5719b.f5717p.get(str);
    }

    public void draw(Canvas canvas) {
        Drawable drawable = this.f5661d;
        if (drawable != null) {
            drawable.draw(canvas);
            return;
        }
        copyBounds(this.f5671m);
        if (this.f5671m.width() > 0 && this.f5671m.height() > 0) {
            ColorFilter colorFilter = this.f5665g;
            if (colorFilter == null) {
                colorFilter = this.f5664f;
            }
            canvas.getMatrix(this.f5670l);
            this.f5670l.getValues(this.f5669k);
            float abs = Math.abs(this.f5669k[0]);
            float abs2 = Math.abs(this.f5669k[4]);
            float abs3 = Math.abs(this.f5669k[1]);
            float abs4 = Math.abs(this.f5669k[3]);
            if (!(abs3 == Utils.FLOAT_EPSILON && abs4 == Utils.FLOAT_EPSILON)) {
                abs = 1.0f;
                abs2 = 1.0f;
            }
            int min = Math.min(C11398b.f33142u, (int) (((float) this.f5671m.width()) * abs));
            int min2 = Math.min(C11398b.f33142u, (int) (((float) this.f5671m.height()) * abs2));
            if (min > 0 && min2 > 0) {
                int save = canvas.save();
                Rect rect = this.f5671m;
                canvas.translate((float) rect.left, (float) rect.top);
                if (m7335f()) {
                    canvas.translate((float) this.f5671m.width(), Utils.FLOAT_EPSILON);
                    canvas.scale(-1.0f, 1.0f);
                }
                this.f5671m.offsetTo(0, 0);
                this.f5663e.mo6407c(min, min2);
                if (!this.f5667i) {
                    this.f5663e.mo6415j(min, min2);
                } else if (!this.f5663e.mo6406b()) {
                    this.f5663e.mo6415j(min, min2);
                    this.f5663e.mo6414i();
                }
                this.f5663e.mo6408d(canvas, colorFilter, this.f5671m);
                canvas.restoreToCount(save);
            }
        }
    }

    public int getAlpha() {
        Drawable drawable = this.f5661d;
        if (drawable != null) {
            return C0836a.m3142d(drawable);
        }
        return this.f5663e.f5719b.getRootAlpha();
    }

    public int getChangingConfigurations() {
        Drawable drawable = this.f5661d;
        if (drawable != null) {
            return drawable.getChangingConfigurations();
        }
        return super.getChangingConfigurations() | this.f5663e.getChangingConfigurations();
    }

    public ColorFilter getColorFilter() {
        Drawable drawable = this.f5661d;
        if (drawable != null) {
            return C0836a.m3143e(drawable);
        }
        return this.f5665g;
    }

    public Drawable.ConstantState getConstantState() {
        if (this.f5661d != null && Build.VERSION.SDK_INT >= 24) {
            return new C1889i(this.f5661d.getConstantState());
        }
        this.f5663e.f5718a = getChangingConfigurations();
        return this.f5663e;
    }

    public /* bridge */ /* synthetic */ Drawable getCurrent() {
        return super.getCurrent();
    }

    public int getIntrinsicHeight() {
        Drawable drawable = this.f5661d;
        if (drawable != null) {
            return drawable.getIntrinsicHeight();
        }
        return (int) this.f5663e.f5719b.f5711j;
    }

    public int getIntrinsicWidth() {
        Drawable drawable = this.f5661d;
        if (drawable != null) {
            return drawable.getIntrinsicWidth();
        }
        return (int) this.f5663e.f5719b.f5710i;
    }

    public /* bridge */ /* synthetic */ int getMinimumHeight() {
        return super.getMinimumHeight();
    }

    public /* bridge */ /* synthetic */ int getMinimumWidth() {
        return super.getMinimumWidth();
    }

    public int getOpacity() {
        Drawable drawable = this.f5661d;
        if (drawable != null) {
            return drawable.getOpacity();
        }
        return -3;
    }

    public /* bridge */ /* synthetic */ boolean getPadding(Rect rect) {
        return super.getPadding(rect);
    }

    public /* bridge */ /* synthetic */ int[] getState() {
        return super.getState();
    }

    public /* bridge */ /* synthetic */ Region getTransparentRegion() {
        return super.getTransparentRegion();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public void mo6337h(boolean z) {
        this.f5667i = z;
    }

    public void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) {
        Drawable drawable = this.f5661d;
        if (drawable != null) {
            drawable.inflate(resources, xmlPullParser, attributeSet);
        } else {
            inflate(resources, xmlPullParser, attributeSet, (Resources.Theme) null);
        }
    }

    public void invalidateSelf() {
        Drawable drawable = this.f5661d;
        if (drawable != null) {
            drawable.invalidateSelf();
        } else {
            super.invalidateSelf();
        }
    }

    public boolean isAutoMirrored() {
        Drawable drawable = this.f5661d;
        if (drawable != null) {
            return C0836a.m3146h(drawable);
        }
        return this.f5663e.f5722e;
    }

    public boolean isStateful() {
        C1888h hVar;
        ColorStateList colorStateList;
        Drawable drawable = this.f5661d;
        if (drawable != null) {
            return drawable.isStateful();
        }
        if (super.isStateful() || ((hVar = this.f5663e) != null && (hVar.mo6411g() || ((colorStateList = this.f5663e.f5720c) != null && colorStateList.isStateful())))) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public PorterDuffColorFilter mo6343j(PorterDuffColorFilter porterDuffColorFilter, ColorStateList colorStateList, PorterDuff.Mode mode) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
    }

    public /* bridge */ /* synthetic */ void jumpToCurrentState() {
        super.jumpToCurrentState();
    }

    public Drawable mutate() {
        Drawable drawable = this.f5661d;
        if (drawable != null) {
            drawable.mutate();
            return this;
        }
        if (!this.f5666h && super.mutate() == this) {
            this.f5663e = new C1888h(this.f5663e);
            this.f5666h = true;
        }
        return this;
    }

    /* access modifiers changed from: protected */
    public void onBoundsChange(Rect rect) {
        Drawable drawable = this.f5661d;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
    }

    /* access modifiers changed from: protected */
    public boolean onStateChange(int[] iArr) {
        boolean z;
        PorterDuff.Mode mode;
        Drawable drawable = this.f5661d;
        if (drawable != null) {
            return drawable.setState(iArr);
        }
        C1888h hVar = this.f5663e;
        ColorStateList colorStateList = hVar.f5720c;
        if (colorStateList == null || (mode = hVar.f5721d) == null) {
            z = false;
        } else {
            this.f5664f = mo6343j(this.f5664f, colorStateList, mode);
            invalidateSelf();
            z = true;
        }
        if (!hVar.mo6411g() || !hVar.mo6413h(iArr)) {
            return z;
        }
        invalidateSelf();
        return true;
    }

    public void scheduleSelf(Runnable runnable, long j) {
        Drawable drawable = this.f5661d;
        if (drawable != null) {
            drawable.scheduleSelf(runnable, j);
        } else {
            super.scheduleSelf(runnable, j);
        }
    }

    public void setAlpha(int i) {
        Drawable drawable = this.f5661d;
        if (drawable != null) {
            drawable.setAlpha(i);
        } else if (this.f5663e.f5719b.getRootAlpha() != i) {
            this.f5663e.f5719b.setRootAlpha(i);
            invalidateSelf();
        }
    }

    public void setAutoMirrored(boolean z) {
        Drawable drawable = this.f5661d;
        if (drawable != null) {
            C0836a.m3148j(drawable, z);
        } else {
            this.f5663e.f5722e = z;
        }
    }

    public /* bridge */ /* synthetic */ void setChangingConfigurations(int i) {
        super.setChangingConfigurations(i);
    }

    public /* bridge */ /* synthetic */ void setColorFilter(int i, PorterDuff.Mode mode) {
        super.setColorFilter(i, mode);
    }

    public /* bridge */ /* synthetic */ void setFilterBitmap(boolean z) {
        super.setFilterBitmap(z);
    }

    public /* bridge */ /* synthetic */ void setHotspot(float f, float f2) {
        super.setHotspot(f, f2);
    }

    public /* bridge */ /* synthetic */ void setHotspotBounds(int i, int i2, int i3, int i4) {
        super.setHotspotBounds(i, i2, i3, i4);
    }

    public /* bridge */ /* synthetic */ boolean setState(int[] iArr) {
        return super.setState(iArr);
    }

    public void setTint(int i) {
        Drawable drawable = this.f5661d;
        if (drawable != null) {
            C0836a.m3152n(drawable, i);
        } else {
            setTintList(ColorStateList.valueOf(i));
        }
    }

    public void setTintList(ColorStateList colorStateList) {
        Drawable drawable = this.f5661d;
        if (drawable != null) {
            C0836a.m3153o(drawable, colorStateList);
            return;
        }
        C1888h hVar = this.f5663e;
        if (hVar.f5720c != colorStateList) {
            hVar.f5720c = colorStateList;
            this.f5664f = mo6343j(this.f5664f, colorStateList, hVar.f5721d);
            invalidateSelf();
        }
    }

    public void setTintMode(PorterDuff.Mode mode) {
        Drawable drawable = this.f5661d;
        if (drawable != null) {
            C0836a.m3154p(drawable, mode);
            return;
        }
        C1888h hVar = this.f5663e;
        if (hVar.f5721d != mode) {
            hVar.f5721d = mode;
            this.f5664f = mo6343j(this.f5664f, hVar.f5720c, mode);
            invalidateSelf();
        }
    }

    public boolean setVisible(boolean z, boolean z2) {
        Drawable drawable = this.f5661d;
        if (drawable != null) {
            return drawable.setVisible(z, z2);
        }
        return super.setVisible(z, z2);
    }

    public void unscheduleSelf(Runnable runnable) {
        Drawable drawable = this.f5661d;
        if (drawable != null) {
            drawable.unscheduleSelf(runnable);
        } else {
            super.unscheduleSelf(runnable);
        }
    }

    /* renamed from: androidx.vectordrawable.graphics.drawable.f$i */
    private static class C1889i extends Drawable.ConstantState {

        /* renamed from: a */
        private final Drawable.ConstantState f5730a;

        public C1889i(Drawable.ConstantState constantState) {
            this.f5730a = constantState;
        }

        public boolean canApplyTheme() {
            return this.f5730a.canApplyTheme();
        }

        public int getChangingConfigurations() {
            return this.f5730a.getChangingConfigurations();
        }

        public Drawable newDrawable() {
            C1880f fVar = new C1880f();
            fVar.f5661d = (VectorDrawable) this.f5730a.newDrawable();
            return fVar;
        }

        public Drawable newDrawable(Resources resources) {
            C1880f fVar = new C1880f();
            fVar.f5661d = (VectorDrawable) this.f5730a.newDrawable(resources);
            return fVar;
        }

        public Drawable newDrawable(Resources resources, Resources.Theme theme) {
            C1880f fVar = new C1880f();
            fVar.f5661d = (VectorDrawable) this.f5730a.newDrawable(resources, theme);
            return fVar;
        }
    }

    public void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.f5661d;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
            return;
        }
        this.f5665g = colorFilter;
        invalidateSelf();
    }

    /* renamed from: androidx.vectordrawable.graphics.drawable.f$f */
    private static abstract class C1886f extends C1885e {

        /* renamed from: a */
        protected C0856f.C0858b[] f5697a = null;

        /* renamed from: b */
        String f5698b;

        /* renamed from: c */
        int f5699c = 0;

        /* renamed from: d */
        int f5700d;

        public C1886f() {
            super();
        }

        /* renamed from: c */
        public boolean mo6356c() {
            return false;
        }

        /* renamed from: d */
        public void mo6394d(Path path) {
            path.reset();
            C0856f.C0858b[] bVarArr = this.f5697a;
            if (bVarArr != null) {
                C0856f.C0858b.m3208e(bVarArr, path);
            }
        }

        public C0856f.C0858b[] getPathData() {
            return this.f5697a;
        }

        public String getPathName() {
            return this.f5698b;
        }

        public void setPathData(C0856f.C0858b[] bVarArr) {
            if (!C0856f.m3196b(this.f5697a, bVarArr)) {
                this.f5697a = C0856f.m3200f(bVarArr);
            } else {
                C0856f.m3204j(this.f5697a, bVarArr);
            }
        }

        public C1886f(C1886f fVar) {
            super();
            this.f5698b = fVar.f5698b;
            this.f5700d = fVar.f5700d;
            this.f5697a = C0856f.m3200f(fVar.f5697a);
        }
    }

    public void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        Drawable drawable = this.f5661d;
        if (drawable != null) {
            C0836a.m3145g(drawable, resources, xmlPullParser, attributeSet, theme);
            return;
        }
        C1888h hVar = this.f5663e;
        hVar.f5719b = new C1887g();
        TypedArray s = C0820l.m3076s(resources, theme, attributeSet, C1874a.f5647a);
        m7337i(s, xmlPullParser, theme);
        s.recycle();
        hVar.f5718a = getChangingConfigurations();
        hVar.f5728k = true;
        m7334e(resources, xmlPullParser, attributeSet, theme);
        this.f5664f = mo6343j(this.f5664f, hVar.f5720c, hVar.f5721d);
    }

    C1880f(C1888h hVar) {
        this.f5667i = true;
        this.f5669k = new float[9];
        this.f5670l = new Matrix();
        this.f5671m = new Rect();
        this.f5663e = hVar;
        this.f5664f = mo6343j(this.f5664f, hVar.f5720c, hVar.f5721d);
    }

    /* renamed from: androidx.vectordrawable.graphics.drawable.f$c */
    private static class C1883c extends C1886f {

        /* renamed from: e */
        private int[] f5672e;

        /* renamed from: f */
        C0798d f5673f;

        /* renamed from: g */
        float f5674g = Utils.FLOAT_EPSILON;

        /* renamed from: h */
        C0798d f5675h;

        /* renamed from: i */
        float f5676i = 1.0f;

        /* renamed from: j */
        float f5677j = 1.0f;

        /* renamed from: k */
        float f5678k = Utils.FLOAT_EPSILON;

        /* renamed from: l */
        float f5679l = 1.0f;

        /* renamed from: m */
        float f5680m = Utils.FLOAT_EPSILON;

        /* renamed from: n */
        Paint.Cap f5681n = Paint.Cap.BUTT;

        /* renamed from: o */
        Paint.Join f5682o = Paint.Join.MITER;

        /* renamed from: p */
        float f5683p = 4.0f;

        C1883c() {
        }

        /* renamed from: e */
        private Paint.Cap m7344e(int i, Paint.Cap cap) {
            if (i == 0) {
                return Paint.Cap.BUTT;
            }
            if (i == 1) {
                return Paint.Cap.ROUND;
            }
            if (i != 2) {
                return cap;
            }
            return Paint.Cap.SQUARE;
        }

        /* renamed from: f */
        private Paint.Join m7345f(int i, Paint.Join join) {
            if (i == 0) {
                return Paint.Join.MITER;
            }
            if (i == 1) {
                return Paint.Join.ROUND;
            }
            if (i != 2) {
                return join;
            }
            return Paint.Join.BEVEL;
        }

        /* renamed from: h */
        private void m7346h(TypedArray typedArray, XmlPullParser xmlPullParser, Resources.Theme theme) {
            this.f5672e = null;
            if (C0820l.m3075r(xmlPullParser, "pathData")) {
                String string = typedArray.getString(0);
                if (string != null) {
                    this.f5698b = string;
                }
                String string2 = typedArray.getString(2);
                if (string2 != null) {
                    this.f5697a = C0856f.m3198d(string2);
                }
                Resources.Theme theme2 = theme;
                this.f5675h = C0820l.m3066i(typedArray, xmlPullParser, theme2, "fillColor", 1, 0);
                this.f5677j = C0820l.m3067j(typedArray, xmlPullParser, "fillAlpha", 12, this.f5677j);
                this.f5681n = m7344e(C0820l.m3068k(typedArray, xmlPullParser, "strokeLineCap", 8, -1), this.f5681n);
                this.f5682o = m7345f(C0820l.m3068k(typedArray, xmlPullParser, "strokeLineJoin", 9, -1), this.f5682o);
                this.f5683p = C0820l.m3067j(typedArray, xmlPullParser, "strokeMiterLimit", 10, this.f5683p);
                this.f5673f = C0820l.m3066i(typedArray, xmlPullParser, theme2, "strokeColor", 3, 0);
                this.f5676i = C0820l.m3067j(typedArray, xmlPullParser, "strokeAlpha", 11, this.f5676i);
                this.f5674g = C0820l.m3067j(typedArray, xmlPullParser, "strokeWidth", 4, this.f5674g);
                this.f5679l = C0820l.m3067j(typedArray, xmlPullParser, "trimPathEnd", 6, this.f5679l);
                this.f5680m = C0820l.m3067j(typedArray, xmlPullParser, "trimPathOffset", 7, this.f5680m);
                this.f5678k = C0820l.m3067j(typedArray, xmlPullParser, "trimPathStart", 5, this.f5678k);
                this.f5699c = C0820l.m3068k(typedArray, xmlPullParser, "fillType", 13, this.f5699c);
            }
        }

        /* renamed from: a */
        public boolean mo6358a() {
            return this.f5675h.mo3265i() || this.f5673f.mo3265i();
        }

        /* renamed from: b */
        public boolean mo6359b(int[] iArr) {
            return this.f5673f.mo3266j(iArr) | this.f5675h.mo3266j(iArr);
        }

        /* renamed from: g */
        public void mo6360g(Resources resources, AttributeSet attributeSet, Resources.Theme theme, XmlPullParser xmlPullParser) {
            TypedArray s = C0820l.m3076s(resources, theme, attributeSet, C1874a.f5649c);
            m7346h(s, xmlPullParser, theme);
            s.recycle();
        }

        /* access modifiers changed from: package-private */
        public float getFillAlpha() {
            return this.f5677j;
        }

        /* access modifiers changed from: package-private */
        public int getFillColor() {
            return this.f5675h.mo3262e();
        }

        /* access modifiers changed from: package-private */
        public float getStrokeAlpha() {
            return this.f5676i;
        }

        /* access modifiers changed from: package-private */
        public int getStrokeColor() {
            return this.f5673f.mo3262e();
        }

        /* access modifiers changed from: package-private */
        public float getStrokeWidth() {
            return this.f5674g;
        }

        /* access modifiers changed from: package-private */
        public float getTrimPathEnd() {
            return this.f5679l;
        }

        /* access modifiers changed from: package-private */
        public float getTrimPathOffset() {
            return this.f5680m;
        }

        /* access modifiers changed from: package-private */
        public float getTrimPathStart() {
            return this.f5678k;
        }

        /* access modifiers changed from: package-private */
        public void setFillAlpha(float f) {
            this.f5677j = f;
        }

        /* access modifiers changed from: package-private */
        public void setFillColor(int i) {
            this.f5675h.mo3267k(i);
        }

        /* access modifiers changed from: package-private */
        public void setStrokeAlpha(float f) {
            this.f5676i = f;
        }

        /* access modifiers changed from: package-private */
        public void setStrokeColor(int i) {
            this.f5673f.mo3267k(i);
        }

        /* access modifiers changed from: package-private */
        public void setStrokeWidth(float f) {
            this.f5674g = f;
        }

        /* access modifiers changed from: package-private */
        public void setTrimPathEnd(float f) {
            this.f5679l = f;
        }

        /* access modifiers changed from: package-private */
        public void setTrimPathOffset(float f) {
            this.f5680m = f;
        }

        /* access modifiers changed from: package-private */
        public void setTrimPathStart(float f) {
            this.f5678k = f;
        }

        C1883c(C1883c cVar) {
            super(cVar);
            this.f5672e = cVar.f5672e;
            this.f5673f = cVar.f5673f;
            this.f5674g = cVar.f5674g;
            this.f5676i = cVar.f5676i;
            this.f5675h = cVar.f5675h;
            this.f5699c = cVar.f5699c;
            this.f5677j = cVar.f5677j;
            this.f5678k = cVar.f5678k;
            this.f5679l = cVar.f5679l;
            this.f5680m = cVar.f5680m;
            this.f5681n = cVar.f5681n;
            this.f5682o = cVar.f5682o;
            this.f5683p = cVar.f5683p;
        }
    }

    /* renamed from: androidx.vectordrawable.graphics.drawable.f$g */
    private static class C1887g {

        /* renamed from: q */
        private static final Matrix f5701q = new Matrix();

        /* renamed from: a */
        private final Path f5702a;

        /* renamed from: b */
        private final Path f5703b;

        /* renamed from: c */
        private final Matrix f5704c;

        /* renamed from: d */
        Paint f5705d;

        /* renamed from: e */
        Paint f5706e;

        /* renamed from: f */
        private PathMeasure f5707f;

        /* renamed from: g */
        private int f5708g;

        /* renamed from: h */
        final C1884d f5709h;

        /* renamed from: i */
        float f5710i;

        /* renamed from: j */
        float f5711j;

        /* renamed from: k */
        float f5712k;

        /* renamed from: l */
        float f5713l;

        /* renamed from: m */
        int f5714m;

        /* renamed from: n */
        String f5715n;

        /* renamed from: o */
        Boolean f5716o;

        /* renamed from: p */
        final ArrayMap f5717p;

        public C1887g() {
            this.f5704c = new Matrix();
            this.f5710i = Utils.FLOAT_EPSILON;
            this.f5711j = Utils.FLOAT_EPSILON;
            this.f5712k = Utils.FLOAT_EPSILON;
            this.f5713l = Utils.FLOAT_EPSILON;
            this.f5714m = C11051p3.f31759c;
            this.f5715n = null;
            this.f5716o = null;
            this.f5717p = new ArrayMap();
            this.f5709h = new C1884d();
            this.f5702a = new Path();
            this.f5703b = new Path();
        }

        /* renamed from: a */
        private static float m7359a(float f, float f2, float f3, float f4) {
            return (f * f4) - (f2 * f3);
        }

        /* renamed from: c */
        private void m7360c(C1884d dVar, Matrix matrix, Canvas canvas, int i, int i2, ColorFilter colorFilter) {
            dVar.f5684a.set(matrix);
            dVar.f5684a.preConcat(dVar.f5693j);
            canvas.save();
            for (int i3 = 0; i3 < dVar.f5685b.size(); i3++) {
                C1885e eVar = (C1885e) dVar.f5685b.get(i3);
                if (eVar instanceof C1884d) {
                    m7360c((C1884d) eVar, dVar.f5684a, canvas, i, i2, colorFilter);
                } else if (eVar instanceof C1886f) {
                    m7361d(dVar, (C1886f) eVar, canvas, i, i2, colorFilter);
                }
            }
            canvas.restore();
        }

        /* renamed from: d */
        private void m7361d(C1884d dVar, C1886f fVar, Canvas canvas, int i, int i2, ColorFilter colorFilter) {
            Path.FillType fillType;
            Path.FillType fillType2;
            float f = ((float) i) / this.f5712k;
            float f2 = ((float) i2) / this.f5713l;
            float min = Math.min(f, f2);
            Matrix matrix = dVar.f5684a;
            this.f5704c.set(matrix);
            this.f5704c.postScale(f, f2);
            float e = m7362e(matrix);
            if (e != Utils.FLOAT_EPSILON) {
                fVar.mo6394d(this.f5702a);
                Path path = this.f5702a;
                this.f5703b.reset();
                if (fVar.mo6356c()) {
                    Path path2 = this.f5703b;
                    if (fVar.f5699c == 0) {
                        fillType2 = Path.FillType.WINDING;
                    } else {
                        fillType2 = Path.FillType.EVEN_ODD;
                    }
                    path2.setFillType(fillType2);
                    this.f5703b.addPath(path, this.f5704c);
                    canvas.clipPath(this.f5703b);
                    return;
                }
                C1883c cVar = (C1883c) fVar;
                float f3 = cVar.f5678k;
                if (!(f3 == Utils.FLOAT_EPSILON && cVar.f5679l == 1.0f)) {
                    float f4 = cVar.f5680m;
                    float f5 = (f3 + f4) % 1.0f;
                    float f6 = (cVar.f5679l + f4) % 1.0f;
                    if (this.f5707f == null) {
                        this.f5707f = new PathMeasure();
                    }
                    this.f5707f.setPath(this.f5702a, false);
                    float length = this.f5707f.getLength();
                    float f7 = f5 * length;
                    float f8 = f6 * length;
                    path.reset();
                    if (f7 > f8) {
                        this.f5707f.getSegment(f7, length, path, true);
                        this.f5707f.getSegment(Utils.FLOAT_EPSILON, f8, path, true);
                    } else {
                        this.f5707f.getSegment(f7, f8, path, true);
                    }
                    path.rLineTo(Utils.FLOAT_EPSILON, Utils.FLOAT_EPSILON);
                }
                this.f5703b.addPath(path, this.f5704c);
                if (cVar.f5675h.mo3268l()) {
                    C0798d dVar2 = cVar.f5675h;
                    if (this.f5706e == null) {
                        Paint paint = new Paint(1);
                        this.f5706e = paint;
                        paint.setStyle(Paint.Style.FILL);
                    }
                    Paint paint2 = this.f5706e;
                    if (dVar2.mo3264h()) {
                        Shader f9 = dVar2.mo3263f();
                        f9.setLocalMatrix(this.f5704c);
                        paint2.setShader(f9);
                        paint2.setAlpha(Math.round(cVar.f5677j * 255.0f));
                    } else {
                        paint2.setShader((Shader) null);
                        paint2.setAlpha(C11051p3.f31759c);
                        paint2.setColor(C1880f.m7331a(dVar2.mo3262e(), cVar.f5677j));
                    }
                    paint2.setColorFilter(colorFilter);
                    Path path3 = this.f5703b;
                    if (cVar.f5699c == 0) {
                        fillType = Path.FillType.WINDING;
                    } else {
                        fillType = Path.FillType.EVEN_ODD;
                    }
                    path3.setFillType(fillType);
                    canvas.drawPath(this.f5703b, paint2);
                }
                if (cVar.f5673f.mo3268l()) {
                    C0798d dVar3 = cVar.f5673f;
                    if (this.f5705d == null) {
                        Paint paint3 = new Paint(1);
                        this.f5705d = paint3;
                        paint3.setStyle(Paint.Style.STROKE);
                    }
                    Paint paint4 = this.f5705d;
                    Paint.Join join = cVar.f5682o;
                    if (join != null) {
                        paint4.setStrokeJoin(join);
                    }
                    Paint.Cap cap = cVar.f5681n;
                    if (cap != null) {
                        paint4.setStrokeCap(cap);
                    }
                    paint4.setStrokeMiter(cVar.f5683p);
                    if (dVar3.mo3264h()) {
                        Shader f12 = dVar3.mo3263f();
                        f12.setLocalMatrix(this.f5704c);
                        paint4.setShader(f12);
                        paint4.setAlpha(Math.round(cVar.f5676i * 255.0f));
                    } else {
                        paint4.setShader((Shader) null);
                        paint4.setAlpha(C11051p3.f31759c);
                        paint4.setColor(C1880f.m7331a(dVar3.mo3262e(), cVar.f5676i));
                    }
                    paint4.setColorFilter(colorFilter);
                    paint4.setStrokeWidth(cVar.f5674g * min * e);
                    canvas.drawPath(this.f5703b, paint4);
                }
            }
        }

        /* renamed from: e */
        private float m7362e(Matrix matrix) {
            float[] fArr = {Utils.FLOAT_EPSILON, 1.0f, 1.0f, Utils.FLOAT_EPSILON};
            matrix.mapVectors(fArr);
            float a = m7359a(fArr[0], fArr[1], fArr[2], fArr[3]);
            float max = Math.max((float) Math.hypot((double) fArr[0], (double) fArr[1]), (float) Math.hypot((double) fArr[2], (double) fArr[3]));
            if (max > Utils.FLOAT_EPSILON) {
                return Math.abs(a) / max;
            }
            return Utils.FLOAT_EPSILON;
        }

        /* renamed from: b */
        public void mo6398b(Canvas canvas, int i, int i2, ColorFilter colorFilter) {
            m7360c(this.f5709h, f5701q, canvas, i, i2, colorFilter);
        }

        /* renamed from: f */
        public boolean mo6399f() {
            if (this.f5716o == null) {
                this.f5716o = Boolean.valueOf(this.f5709h.mo6358a());
            }
            return this.f5716o.booleanValue();
        }

        /* renamed from: g */
        public boolean mo6400g(int[] iArr) {
            return this.f5709h.mo6359b(iArr);
        }

        public float getAlpha() {
            return ((float) getRootAlpha()) / 255.0f;
        }

        public int getRootAlpha() {
            return this.f5714m;
        }

        public void setAlpha(float f) {
            setRootAlpha((int) (f * 255.0f));
        }

        public void setRootAlpha(int i) {
            this.f5714m = i;
        }

        public C1887g(C1887g gVar) {
            this.f5704c = new Matrix();
            this.f5710i = Utils.FLOAT_EPSILON;
            this.f5711j = Utils.FLOAT_EPSILON;
            this.f5712k = Utils.FLOAT_EPSILON;
            this.f5713l = Utils.FLOAT_EPSILON;
            this.f5714m = C11051p3.f31759c;
            this.f5715n = null;
            this.f5716o = null;
            ArrayMap arrayMap = new ArrayMap();
            this.f5717p = arrayMap;
            this.f5709h = new C1884d(gVar.f5709h, arrayMap);
            this.f5702a = new Path(gVar.f5702a);
            this.f5703b = new Path(gVar.f5703b);
            this.f5710i = gVar.f5710i;
            this.f5711j = gVar.f5711j;
            this.f5712k = gVar.f5712k;
            this.f5713l = gVar.f5713l;
            this.f5708g = gVar.f5708g;
            this.f5714m = gVar.f5714m;
            this.f5715n = gVar.f5715n;
            String str = gVar.f5715n;
            if (str != null) {
                arrayMap.put(str, this);
            }
            this.f5716o = gVar.f5716o;
        }
    }

    /* renamed from: androidx.vectordrawable.graphics.drawable.f$d */
    private static class C1884d extends C1885e {

        /* renamed from: a */
        final Matrix f5684a;

        /* renamed from: b */
        final ArrayList f5685b;

        /* renamed from: c */
        float f5686c;

        /* renamed from: d */
        private float f5687d;

        /* renamed from: e */
        private float f5688e;

        /* renamed from: f */
        private float f5689f;

        /* renamed from: g */
        private float f5690g;

        /* renamed from: h */
        private float f5691h;

        /* renamed from: i */
        private float f5692i;

        /* renamed from: j */
        final Matrix f5693j;

        /* renamed from: k */
        int f5694k;

        /* renamed from: l */
        private int[] f5695l;

        /* renamed from: m */
        private String f5696m;

        public C1884d(C1884d dVar, ArrayMap arrayMap) {
            super();
            C1886f fVar;
            this.f5684a = new Matrix();
            this.f5685b = new ArrayList();
            this.f5686c = Utils.FLOAT_EPSILON;
            this.f5687d = Utils.FLOAT_EPSILON;
            this.f5688e = Utils.FLOAT_EPSILON;
            this.f5689f = 1.0f;
            this.f5690g = 1.0f;
            this.f5691h = Utils.FLOAT_EPSILON;
            this.f5692i = Utils.FLOAT_EPSILON;
            Matrix matrix = new Matrix();
            this.f5693j = matrix;
            this.f5696m = null;
            this.f5686c = dVar.f5686c;
            this.f5687d = dVar.f5687d;
            this.f5688e = dVar.f5688e;
            this.f5689f = dVar.f5689f;
            this.f5690g = dVar.f5690g;
            this.f5691h = dVar.f5691h;
            this.f5692i = dVar.f5692i;
            this.f5695l = dVar.f5695l;
            String str = dVar.f5696m;
            this.f5696m = str;
            this.f5694k = dVar.f5694k;
            if (str != null) {
                arrayMap.put(str, this);
            }
            matrix.set(dVar.f5693j);
            ArrayList arrayList = dVar.f5685b;
            for (int i = 0; i < arrayList.size(); i++) {
                Object obj = arrayList.get(i);
                if (obj instanceof C1884d) {
                    this.f5685b.add(new C1884d((C1884d) obj, arrayMap));
                } else {
                    if (obj instanceof C1883c) {
                        fVar = new C1883c((C1883c) obj);
                    } else if (obj instanceof C1882b) {
                        fVar = new C1882b((C1882b) obj);
                    } else {
                        throw new IllegalStateException("Unknown object in the tree!");
                    }
                    this.f5685b.add(fVar);
                    String str2 = fVar.f5698b;
                    if (str2 != null) {
                        arrayMap.put(str2, fVar);
                    }
                }
            }
        }

        /* renamed from: d */
        private void m7350d() {
            this.f5693j.reset();
            this.f5693j.postTranslate(-this.f5687d, -this.f5688e);
            this.f5693j.postScale(this.f5689f, this.f5690g);
            this.f5693j.postRotate(this.f5686c, Utils.FLOAT_EPSILON, Utils.FLOAT_EPSILON);
            this.f5693j.postTranslate(this.f5691h + this.f5687d, this.f5692i + this.f5688e);
        }

        /* renamed from: e */
        private void m7351e(TypedArray typedArray, XmlPullParser xmlPullParser) {
            this.f5695l = null;
            this.f5686c = C0820l.m3067j(typedArray, xmlPullParser, "rotation", 5, this.f5686c);
            this.f5687d = typedArray.getFloat(1, this.f5687d);
            this.f5688e = typedArray.getFloat(2, this.f5688e);
            this.f5689f = C0820l.m3067j(typedArray, xmlPullParser, "scaleX", 3, this.f5689f);
            this.f5690g = C0820l.m3067j(typedArray, xmlPullParser, "scaleY", 4, this.f5690g);
            this.f5691h = C0820l.m3067j(typedArray, xmlPullParser, "translateX", 6, this.f5691h);
            this.f5692i = C0820l.m3067j(typedArray, xmlPullParser, "translateY", 7, this.f5692i);
            String string = typedArray.getString(0);
            if (string != null) {
                this.f5696m = string;
            }
            m7350d();
        }

        /* renamed from: a */
        public boolean mo6358a() {
            for (int i = 0; i < this.f5685b.size(); i++) {
                if (((C1885e) this.f5685b.get(i)).mo6358a()) {
                    return true;
                }
            }
            return false;
        }

        /* renamed from: b */
        public boolean mo6359b(int[] iArr) {
            boolean z = false;
            for (int i = 0; i < this.f5685b.size(); i++) {
                z |= ((C1885e) this.f5685b.get(i)).mo6359b(iArr);
            }
            return z;
        }

        /* renamed from: c */
        public void mo6377c(Resources resources, AttributeSet attributeSet, Resources.Theme theme, XmlPullParser xmlPullParser) {
            TypedArray s = C0820l.m3076s(resources, theme, attributeSet, C1874a.f5648b);
            m7351e(s, xmlPullParser);
            s.recycle();
        }

        public String getGroupName() {
            return this.f5696m;
        }

        public Matrix getLocalMatrix() {
            return this.f5693j;
        }

        public float getPivotX() {
            return this.f5687d;
        }

        public float getPivotY() {
            return this.f5688e;
        }

        public float getRotation() {
            return this.f5686c;
        }

        public float getScaleX() {
            return this.f5689f;
        }

        public float getScaleY() {
            return this.f5690g;
        }

        public float getTranslateX() {
            return this.f5691h;
        }

        public float getTranslateY() {
            return this.f5692i;
        }

        public void setPivotX(float f) {
            if (f != this.f5687d) {
                this.f5687d = f;
                m7350d();
            }
        }

        public void setPivotY(float f) {
            if (f != this.f5688e) {
                this.f5688e = f;
                m7350d();
            }
        }

        public void setRotation(float f) {
            if (f != this.f5686c) {
                this.f5686c = f;
                m7350d();
            }
        }

        public void setScaleX(float f) {
            if (f != this.f5689f) {
                this.f5689f = f;
                m7350d();
            }
        }

        public void setScaleY(float f) {
            if (f != this.f5690g) {
                this.f5690g = f;
                m7350d();
            }
        }

        public void setTranslateX(float f) {
            if (f != this.f5691h) {
                this.f5691h = f;
                m7350d();
            }
        }

        public void setTranslateY(float f) {
            if (f != this.f5692i) {
                this.f5692i = f;
                m7350d();
            }
        }

        public C1884d() {
            super();
            this.f5684a = new Matrix();
            this.f5685b = new ArrayList();
            this.f5686c = Utils.FLOAT_EPSILON;
            this.f5687d = Utils.FLOAT_EPSILON;
            this.f5688e = Utils.FLOAT_EPSILON;
            this.f5689f = 1.0f;
            this.f5690g = 1.0f;
            this.f5691h = Utils.FLOAT_EPSILON;
            this.f5692i = Utils.FLOAT_EPSILON;
            this.f5693j = new Matrix();
            this.f5696m = null;
        }
    }
}
