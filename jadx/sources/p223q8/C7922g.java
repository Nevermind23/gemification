package p223q8;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Looper;
import android.util.AttributeSet;
import android.util.Log;
import androidx.core.util.C1002c;
import com.github.mikephil.charting.utils.Utils;
import java.util.BitSet;
import p009a8.C0072b;
import p080f8.C6170a;
import p119i8.C6616a;
import p210p8.C7762a;
import p223q8.C7929k;
import p223q8.C7933l;
import p223q8.C7937m;

/* renamed from: q8.g */
public class C7922g extends Drawable implements C7945n {

    /* renamed from: A */
    private static final String f22873A = "g";

    /* renamed from: B */
    private static final Paint f22874B;

    /* renamed from: d */
    private C7925c f22875d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public final C7937m.C7944g[] f22876e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public final C7937m.C7944g[] f22877f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public final BitSet f22878g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public boolean f22879h;

    /* renamed from: i */
    private final Matrix f22880i;

    /* renamed from: j */
    private final Path f22881j;

    /* renamed from: k */
    private final Path f22882k;

    /* renamed from: l */
    private final RectF f22883l;

    /* renamed from: m */
    private final RectF f22884m;

    /* renamed from: n */
    private final Region f22885n;

    /* renamed from: o */
    private final Region f22886o;

    /* renamed from: p */
    private C7929k f22887p;

    /* renamed from: q */
    private final Paint f22888q;

    /* renamed from: r */
    private final Paint f22889r;

    /* renamed from: s */
    private final C7762a f22890s;

    /* renamed from: t */
    private final C7933l.C7935b f22891t;

    /* renamed from: u */
    private final C7933l f22892u;

    /* renamed from: v */
    private PorterDuffColorFilter f22893v;

    /* renamed from: w */
    private PorterDuffColorFilter f22894w;

    /* renamed from: x */
    private int f22895x;

    /* renamed from: y */
    private final RectF f22896y;

    /* renamed from: z */
    private boolean f22897z;

    /* renamed from: q8.g$a */
    class C7923a implements C7933l.C7935b {
        C7923a() {
        }

        /* renamed from: a */
        public void mo22968a(C7937m mVar, Matrix matrix, int i) {
            C7922g.this.f22878g.set(i, mVar.mo23015e());
            C7922g.this.f22876e[i] = mVar.mo23016f(matrix);
        }

        /* renamed from: b */
        public void mo22969b(C7937m mVar, Matrix matrix, int i) {
            C7922g.this.f22878g.set(i + 4, mVar.mo23015e());
            C7922g.this.f22877f[i] = mVar.mo23016f(matrix);
        }
    }

    /* renamed from: q8.g$b */
    class C7924b implements C7929k.C7932c {

        /* renamed from: a */
        final /* synthetic */ float f22899a;

        C7924b(float f) {
            this.f22899a = f;
        }

        /* renamed from: a */
        public C7918c mo22970a(C7918c cVar) {
            if (cVar instanceof C7927i) {
                return cVar;
            }
            return new C7917b(this.f22899a, cVar);
        }
    }

    static {
        Paint paint = new Paint(1);
        f22874B = paint;
        paint.setColor(-1);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
    }

    /* synthetic */ C7922g(C7925c cVar, C7923a aVar) {
        this(cVar);
    }

    /* renamed from: E */
    private float m29902E() {
        if (m29905L()) {
            return this.f22889r.getStrokeWidth() / 2.0f;
        }
        return Utils.FLOAT_EPSILON;
    }

    /* renamed from: J */
    private boolean m29903J() {
        C7925c cVar = this.f22875d;
        int i = cVar.f22917q;
        if (i == 1 || cVar.f22918r <= 0 || (i != 2 && !mo22937T())) {
            return false;
        }
        return true;
    }

    /* renamed from: K */
    private boolean m29904K() {
        Paint.Style style = this.f22875d.f22922v;
        return style == Paint.Style.FILL_AND_STROKE || style == Paint.Style.FILL;
    }

    /* renamed from: L */
    private boolean m29905L() {
        Paint.Style style = this.f22875d.f22922v;
        if ((style == Paint.Style.FILL_AND_STROKE || style == Paint.Style.STROKE) && this.f22889r.getStrokeWidth() > Utils.FLOAT_EPSILON) {
            return true;
        }
        return false;
    }

    /* renamed from: N */
    private void m29906N() {
        super.invalidateSelf();
    }

    /* renamed from: Q */
    private void m29907Q(Canvas canvas) {
        if (m29903J()) {
            canvas.save();
            m29909S(canvas);
            if (!this.f22897z) {
                m29923n(canvas);
                canvas.restore();
                return;
            }
            int width = (int) (this.f22896y.width() - ((float) getBounds().width()));
            int height = (int) (this.f22896y.height() - ((float) getBounds().height()));
            if (width < 0 || height < 0) {
                throw new IllegalStateException("Invalid shadow bounds. Check that the treatments result in a valid path.");
            }
            Bitmap createBitmap = Bitmap.createBitmap(((int) this.f22896y.width()) + (this.f22875d.f22918r * 2) + width, ((int) this.f22896y.height()) + (this.f22875d.f22918r * 2) + height, Bitmap.Config.ARGB_8888);
            Canvas canvas2 = new Canvas(createBitmap);
            float f = (float) ((getBounds().left - this.f22875d.f22918r) - width);
            float f2 = (float) ((getBounds().top - this.f22875d.f22918r) - height);
            canvas2.translate(-f, -f2);
            m29923n(canvas2);
            canvas.drawBitmap(createBitmap, f, f2, (Paint) null);
            createBitmap.recycle();
            canvas.restore();
        }
    }

    /* renamed from: R */
    private static int m29908R(int i, int i2) {
        return (i * (i2 + (i2 >>> 7))) >>> 8;
    }

    /* renamed from: S */
    private void m29909S(Canvas canvas) {
        canvas.translate((float) mo22927B(), (float) mo22928C());
    }

    /* renamed from: f */
    private PorterDuffColorFilter m29914f(Paint paint, boolean z) {
        if (!z) {
            return null;
        }
        int color = paint.getColor();
        int l = mo22956l(color);
        this.f22895x = l;
        if (l != color) {
            return new PorterDuffColorFilter(l, PorterDuff.Mode.SRC_IN);
        }
        return null;
    }

    /* renamed from: g */
    private void m29915g(RectF rectF, Path path) {
        mo22954h(rectF, path);
        if (this.f22875d.f22910j != 1.0f) {
            this.f22880i.reset();
            Matrix matrix = this.f22880i;
            float f = this.f22875d.f22910j;
            matrix.setScale(f, f, rectF.width() / 2.0f, rectF.height() / 2.0f);
            path.transform(this.f22880i);
        }
        path.computeBounds(this.f22896y, true);
    }

    /* renamed from: h0 */
    private boolean m29916h0(int[] iArr) {
        boolean z;
        int color;
        int colorForState;
        int color2;
        int colorForState2;
        if (this.f22875d.f22904d == null || (color2 = this.f22888q.getColor()) == (colorForState2 = this.f22875d.f22904d.getColorForState(iArr, color2))) {
            z = false;
        } else {
            this.f22888q.setColor(colorForState2);
            z = true;
        }
        if (this.f22875d.f22905e == null || (color = this.f22889r.getColor()) == (colorForState = this.f22875d.f22905e.getColorForState(iArr, color))) {
            return z;
        }
        this.f22889r.setColor(colorForState);
        return true;
    }

    /* renamed from: i */
    private void m29917i() {
        C7929k y = mo22929D().mo22991y(new C7924b(-m29902E()));
        this.f22887p = y;
        this.f22892u.mo23011d(y, this.f22875d.f22911k, m29926v(), this.f22882k);
    }

    /* renamed from: i0 */
    private boolean m29918i0() {
        PorterDuffColorFilter porterDuffColorFilter = this.f22893v;
        PorterDuffColorFilter porterDuffColorFilter2 = this.f22894w;
        C7925c cVar = this.f22875d;
        this.f22893v = m29921k(cVar.f22907g, cVar.f22908h, this.f22888q, true);
        C7925c cVar2 = this.f22875d;
        this.f22894w = m29921k(cVar2.f22906f, cVar2.f22908h, this.f22889r, false);
        C7925c cVar3 = this.f22875d;
        if (cVar3.f22921u) {
            this.f22890s.mo22523d(cVar3.f22907g.getColorForState(getState(), 0));
        }
        if (!C1002c.m3509a(porterDuffColorFilter, this.f22893v) || !C1002c.m3509a(porterDuffColorFilter2, this.f22894w)) {
            return true;
        }
        return false;
    }

    /* renamed from: j */
    private PorterDuffColorFilter m29919j(ColorStateList colorStateList, PorterDuff.Mode mode, boolean z) {
        int colorForState = colorStateList.getColorForState(getState(), 0);
        if (z) {
            colorForState = mo22956l(colorForState);
        }
        this.f22895x = colorForState;
        return new PorterDuffColorFilter(colorForState, mode);
    }

    /* renamed from: j0 */
    private void m29920j0() {
        float I = mo22933I();
        this.f22875d.f22918r = (int) Math.ceil((double) (0.75f * I));
        this.f22875d.f22919s = (int) Math.ceil((double) (I * 0.25f));
        m29918i0();
        m29906N();
    }

    /* renamed from: k */
    private PorterDuffColorFilter m29921k(ColorStateList colorStateList, PorterDuff.Mode mode, Paint paint, boolean z) {
        if (colorStateList == null || mode == null) {
            return m29914f(paint, z);
        }
        return m29919j(colorStateList, mode, z);
    }

    /* renamed from: m */
    public static C7922g m29922m(Context context, float f) {
        int c = C6170a.m24582c(context, C0072b.f159r, C7922g.class.getSimpleName());
        C7922g gVar = new C7922g();
        gVar.mo22934M(context);
        gVar.mo22941X(ColorStateList.valueOf(c));
        gVar.mo22940W(f);
        return gVar;
    }

    /* renamed from: n */
    private void m29923n(Canvas canvas) {
        if (this.f22878g.cardinality() > 0) {
            Log.w(f22873A, "Compatibility shadow requested but can't be drawn for all operations in this shape.");
        }
        if (this.f22875d.f22919s != 0) {
            canvas.drawPath(this.f22881j, this.f22890s.mo22522c());
        }
        for (int i = 0; i < 4; i++) {
            this.f22876e[i].mo23027b(this.f22890s, this.f22875d.f22918r, canvas);
            this.f22877f[i].mo23027b(this.f22890s, this.f22875d.f22918r, canvas);
        }
        if (this.f22897z) {
            int B = mo22927B();
            int C = mo22928C();
            canvas.translate((float) (-B), (float) (-C));
            canvas.drawPath(this.f22881j, f22874B);
            canvas.translate((float) B, (float) C);
        }
    }

    /* renamed from: o */
    private void m29924o(Canvas canvas) {
        m29925q(canvas, this.f22888q, this.f22881j, this.f22875d.f22901a, mo22963u());
    }

    /* renamed from: q */
    private void m29925q(Canvas canvas, Paint paint, Path path, C7929k kVar, RectF rectF) {
        if (kVar.mo22987u(rectF)) {
            float a = kVar.mo22986t().mo22917a(rectF) * this.f22875d.f22911k;
            canvas.drawRoundRect(rectF, a, a, paint);
            return;
        }
        canvas.drawPath(path, paint);
    }

    /* renamed from: v */
    private RectF m29926v() {
        this.f22884m.set(mo22963u());
        float E = m29902E();
        this.f22884m.inset(E, E);
        return this.f22884m;
    }

    /* renamed from: A */
    public int mo22926A() {
        return this.f22895x;
    }

    /* renamed from: B */
    public int mo22927B() {
        C7925c cVar = this.f22875d;
        return (int) (((double) cVar.f22919s) * Math.sin(Math.toRadians((double) cVar.f22920t)));
    }

    /* renamed from: C */
    public int mo22928C() {
        C7925c cVar = this.f22875d;
        return (int) (((double) cVar.f22919s) * Math.cos(Math.toRadians((double) cVar.f22920t)));
    }

    /* renamed from: D */
    public C7929k mo22929D() {
        return this.f22875d.f22901a;
    }

    /* renamed from: F */
    public float mo22930F() {
        return this.f22875d.f22901a.mo22984r().mo22917a(mo22963u());
    }

    /* renamed from: G */
    public float mo22931G() {
        return this.f22875d.f22901a.mo22986t().mo22917a(mo22963u());
    }

    /* renamed from: H */
    public float mo22932H() {
        return this.f22875d.f22916p;
    }

    /* renamed from: I */
    public float mo22933I() {
        return mo22964w() + mo22932H();
    }

    /* renamed from: M */
    public void mo22934M(Context context) {
        this.f22875d.f22902b = new C6616a(context);
        m29920j0();
    }

    /* renamed from: O */
    public boolean mo22935O() {
        C6616a aVar = this.f22875d.f22902b;
        if (aVar == null || !aVar.mo20639e()) {
            return false;
        }
        return true;
    }

    /* renamed from: P */
    public boolean mo22936P() {
        return this.f22875d.f22901a.mo22987u(mo22963u());
    }

    /* renamed from: T */
    public boolean mo22937T() {
        int i = Build.VERSION.SDK_INT;
        if (mo22936P() || this.f22881j.isConvex() || i >= 29) {
            return false;
        }
        return true;
    }

    /* renamed from: U */
    public void mo22938U(float f) {
        setShapeAppearanceModel(this.f22875d.f22901a.mo22989w(f));
    }

    /* renamed from: V */
    public void mo22939V(C7918c cVar) {
        setShapeAppearanceModel(this.f22875d.f22901a.mo22990x(cVar));
    }

    /* renamed from: W */
    public void mo22940W(float f) {
        C7925c cVar = this.f22875d;
        if (cVar.f22915o != f) {
            cVar.f22915o = f;
            m29920j0();
        }
    }

    /* renamed from: X */
    public void mo22941X(ColorStateList colorStateList) {
        C7925c cVar = this.f22875d;
        if (cVar.f22904d != colorStateList) {
            cVar.f22904d = colorStateList;
            onStateChange(getState());
        }
    }

    /* renamed from: Y */
    public void mo22942Y(float f) {
        C7925c cVar = this.f22875d;
        if (cVar.f22911k != f) {
            cVar.f22911k = f;
            this.f22879h = true;
            invalidateSelf();
        }
    }

    /* renamed from: Z */
    public void mo22943Z(int i, int i2, int i3, int i4) {
        C7925c cVar = this.f22875d;
        if (cVar.f22909i == null) {
            cVar.f22909i = new Rect();
        }
        this.f22875d.f22909i.set(i, i2, i3, i4);
        invalidateSelf();
    }

    /* renamed from: a0 */
    public void mo22944a0(float f) {
        C7925c cVar = this.f22875d;
        if (cVar.f22914n != f) {
            cVar.f22914n = f;
            m29920j0();
        }
    }

    /* renamed from: b0 */
    public void mo22945b0(boolean z) {
        this.f22897z = z;
    }

    /* renamed from: c0 */
    public void mo22946c0(int i) {
        this.f22890s.mo22523d(i);
        this.f22875d.f22921u = false;
        m29906N();
    }

    /* renamed from: d0 */
    public void mo22947d0(float f, int i) {
        mo22950g0(f);
        mo22949f0(ColorStateList.valueOf(i));
    }

    public void draw(Canvas canvas) {
        this.f22888q.setColorFilter(this.f22893v);
        int alpha = this.f22888q.getAlpha();
        this.f22888q.setAlpha(m29908R(alpha, this.f22875d.f22913m));
        this.f22889r.setColorFilter(this.f22894w);
        this.f22889r.setStrokeWidth(this.f22875d.f22912l);
        int alpha2 = this.f22889r.getAlpha();
        this.f22889r.setAlpha(m29908R(alpha2, this.f22875d.f22913m));
        if (this.f22879h) {
            m29917i();
            m29915g(mo22963u(), this.f22881j);
            this.f22879h = false;
        }
        m29907Q(canvas);
        if (m29904K()) {
            m29924o(canvas);
        }
        if (m29905L()) {
            mo17229r(canvas);
        }
        this.f22888q.setAlpha(alpha);
        this.f22889r.setAlpha(alpha2);
    }

    /* renamed from: e0 */
    public void mo22948e0(float f, ColorStateList colorStateList) {
        mo22950g0(f);
        mo22949f0(colorStateList);
    }

    /* renamed from: f0 */
    public void mo22949f0(ColorStateList colorStateList) {
        C7925c cVar = this.f22875d;
        if (cVar.f22905e != colorStateList) {
            cVar.f22905e = colorStateList;
            onStateChange(getState());
        }
    }

    /* renamed from: g0 */
    public void mo22950g0(float f) {
        this.f22875d.f22912l = f;
        invalidateSelf();
    }

    public int getAlpha() {
        return this.f22875d.f22913m;
    }

    public Drawable.ConstantState getConstantState() {
        return this.f22875d;
    }

    public int getOpacity() {
        return -3;
    }

    public void getOutline(Outline outline) {
        if (this.f22875d.f22917q != 2) {
            if (mo22936P()) {
                outline.setRoundRect(getBounds(), mo22930F() * this.f22875d.f22911k);
                return;
            }
            m29915g(mo22963u(), this.f22881j);
            if (this.f22881j.isConvex() || Build.VERSION.SDK_INT >= 29) {
                try {
                    outline.setConvexPath(this.f22881j);
                } catch (IllegalArgumentException unused) {
                }
            }
        }
    }

    public boolean getPadding(Rect rect) {
        Rect rect2 = this.f22875d.f22909i;
        if (rect2 == null) {
            return super.getPadding(rect);
        }
        rect.set(rect2);
        return true;
    }

    public Region getTransparentRegion() {
        this.f22885n.set(getBounds());
        m29915g(mo22963u(), this.f22881j);
        this.f22886o.setPath(this.f22881j, this.f22885n);
        this.f22885n.op(this.f22886o, Region.Op.DIFFERENCE);
        return this.f22885n;
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public final void mo22954h(RectF rectF, Path path) {
        C7933l lVar = this.f22892u;
        C7925c cVar = this.f22875d;
        C7929k kVar = cVar.f22901a;
        float f = cVar.f22911k;
        lVar.mo23012e(kVar, f, rectF, this.f22891t, path);
    }

    public void invalidateSelf() {
        this.f22879h = true;
        super.invalidateSelf();
    }

    public boolean isStateful() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        ColorStateList colorStateList3;
        ColorStateList colorStateList4;
        if (super.isStateful() || (((colorStateList = this.f22875d.f22907g) != null && colorStateList.isStateful()) || (((colorStateList2 = this.f22875d.f22906f) != null && colorStateList2.isStateful()) || (((colorStateList3 = this.f22875d.f22905e) != null && colorStateList3.isStateful()) || ((colorStateList4 = this.f22875d.f22904d) != null && colorStateList4.isStateful()))))) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: l */
    public int mo22956l(int i) {
        float I = mo22933I() + mo22967z();
        C6616a aVar = this.f22875d.f22902b;
        if (aVar != null) {
            return aVar.mo20637c(i, I);
        }
        return i;
    }

    public Drawable mutate() {
        this.f22875d = new C7925c(this.f22875d);
        return this;
    }

    /* access modifiers changed from: protected */
    public void onBoundsChange(Rect rect) {
        this.f22879h = true;
        super.onBoundsChange(rect);
    }

    /* access modifiers changed from: protected */
    public boolean onStateChange(int[] iArr) {
        boolean z;
        boolean h0 = m29916h0(iArr);
        boolean i0 = m29918i0();
        if (h0 || i0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            invalidateSelf();
        }
        return z;
    }

    /* access modifiers changed from: protected */
    /* renamed from: p */
    public void mo22959p(Canvas canvas, Paint paint, Path path, RectF rectF) {
        m29925q(canvas, paint, path, this.f22875d.f22901a, rectF);
    }

    /* access modifiers changed from: protected */
    /* renamed from: r */
    public void mo17229r(Canvas canvas) {
        m29925q(canvas, this.f22889r, this.f22882k, this.f22887p, m29926v());
    }

    /* renamed from: s */
    public float mo22960s() {
        return this.f22875d.f22901a.mo22977j().mo22917a(mo22963u());
    }

    public void setAlpha(int i) {
        C7925c cVar = this.f22875d;
        if (cVar.f22913m != i) {
            cVar.f22913m = i;
            m29906N();
        }
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.f22875d.f22903c = colorFilter;
        m29906N();
    }

    public void setShapeAppearanceModel(C7929k kVar) {
        this.f22875d.f22901a = kVar;
        invalidateSelf();
    }

    public void setTint(int i) {
        setTintList(ColorStateList.valueOf(i));
    }

    public void setTintList(ColorStateList colorStateList) {
        this.f22875d.f22907g = colorStateList;
        m29918i0();
        m29906N();
    }

    public void setTintMode(PorterDuff.Mode mode) {
        C7925c cVar = this.f22875d;
        if (cVar.f22908h != mode) {
            cVar.f22908h = mode;
            m29918i0();
            m29906N();
        }
    }

    /* renamed from: t */
    public float mo22962t() {
        return this.f22875d.f22901a.mo22979l().mo22917a(mo22963u());
    }

    /* access modifiers changed from: protected */
    /* renamed from: u */
    public RectF mo22963u() {
        this.f22883l.set(getBounds());
        return this.f22883l;
    }

    /* renamed from: w */
    public float mo22964w() {
        return this.f22875d.f22915o;
    }

    /* renamed from: x */
    public ColorStateList mo22965x() {
        return this.f22875d.f22904d;
    }

    /* renamed from: y */
    public float mo22966y() {
        return this.f22875d.f22911k;
    }

    /* renamed from: z */
    public float mo22967z() {
        return this.f22875d.f22914n;
    }

    public C7922g() {
        this(new C7929k());
    }

    public C7922g(Context context, AttributeSet attributeSet, int i, int i2) {
        this(C7929k.m29978e(context, attributeSet, i, i2).mo22998m());
    }

    public C7922g(C7929k kVar) {
        this(new C7925c(kVar, (C6616a) null));
    }

    private C7922g(C7925c cVar) {
        C7933l lVar;
        this.f22876e = new C7937m.C7944g[4];
        this.f22877f = new C7937m.C7944g[4];
        this.f22878g = new BitSet(8);
        this.f22880i = new Matrix();
        this.f22881j = new Path();
        this.f22882k = new Path();
        this.f22883l = new RectF();
        this.f22884m = new RectF();
        this.f22885n = new Region();
        this.f22886o = new Region();
        Paint paint = new Paint(1);
        this.f22888q = paint;
        Paint paint2 = new Paint(1);
        this.f22889r = paint2;
        this.f22890s = new C7762a();
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            lVar = C7933l.m30040k();
        } else {
            lVar = new C7933l();
        }
        this.f22892u = lVar;
        this.f22896y = new RectF();
        this.f22897z = true;
        this.f22875d = cVar;
        paint2.setStyle(Paint.Style.STROKE);
        paint.setStyle(Paint.Style.FILL);
        m29918i0();
        m29916h0(getState());
        this.f22891t = new C7923a();
    }

    /* renamed from: q8.g$c */
    static final class C7925c extends Drawable.ConstantState {

        /* renamed from: a */
        public C7929k f22901a;

        /* renamed from: b */
        public C6616a f22902b;

        /* renamed from: c */
        public ColorFilter f22903c;

        /* renamed from: d */
        public ColorStateList f22904d = null;

        /* renamed from: e */
        public ColorStateList f22905e = null;

        /* renamed from: f */
        public ColorStateList f22906f = null;

        /* renamed from: g */
        public ColorStateList f22907g = null;

        /* renamed from: h */
        public PorterDuff.Mode f22908h = PorterDuff.Mode.SRC_IN;

        /* renamed from: i */
        public Rect f22909i = null;

        /* renamed from: j */
        public float f22910j = 1.0f;

        /* renamed from: k */
        public float f22911k = 1.0f;

        /* renamed from: l */
        public float f22912l;

        /* renamed from: m */
        public int f22913m = C11051p3.f31759c;

        /* renamed from: n */
        public float f22914n = Utils.FLOAT_EPSILON;

        /* renamed from: o */
        public float f22915o = Utils.FLOAT_EPSILON;

        /* renamed from: p */
        public float f22916p = Utils.FLOAT_EPSILON;

        /* renamed from: q */
        public int f22917q = 0;

        /* renamed from: r */
        public int f22918r = 0;

        /* renamed from: s */
        public int f22919s = 0;

        /* renamed from: t */
        public int f22920t = 0;

        /* renamed from: u */
        public boolean f22921u = false;

        /* renamed from: v */
        public Paint.Style f22922v = Paint.Style.FILL_AND_STROKE;

        public C7925c(C7929k kVar, C6616a aVar) {
            this.f22901a = kVar;
            this.f22902b = aVar;
        }

        public int getChangingConfigurations() {
            return 0;
        }

        public Drawable newDrawable() {
            C7922g gVar = new C7922g(this, (C7923a) null);
            boolean unused = gVar.f22879h = true;
            return gVar;
        }

        public C7925c(C7925c cVar) {
            this.f22901a = cVar.f22901a;
            this.f22902b = cVar.f22902b;
            this.f22912l = cVar.f22912l;
            this.f22903c = cVar.f22903c;
            this.f22904d = cVar.f22904d;
            this.f22905e = cVar.f22905e;
            this.f22908h = cVar.f22908h;
            this.f22907g = cVar.f22907g;
            this.f22913m = cVar.f22913m;
            this.f22910j = cVar.f22910j;
            this.f22919s = cVar.f22919s;
            this.f22917q = cVar.f22917q;
            this.f22921u = cVar.f22921u;
            this.f22911k = cVar.f22911k;
            this.f22914n = cVar.f22914n;
            this.f22915o = cVar.f22915o;
            this.f22916p = cVar.f22916p;
            this.f22918r = cVar.f22918r;
            this.f22920t = cVar.f22920t;
            this.f22906f = cVar.f22906f;
            this.f22922v = cVar.f22922v;
            if (cVar.f22909i != null) {
                this.f22909i = new Rect(cVar.f22909i);
            }
        }
    }
}
