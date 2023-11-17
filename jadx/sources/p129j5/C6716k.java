package p129j5;

import android.content.Context;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.Interpolator;
import android.widget.ImageView;
import android.widget.OverScroller;
import com.github.mikephil.charting.utils.Utils;
import p341ge.bog.mobilebank.p975ui.views.widgets.cropview.subscaleview.SubsamplingScaleImageView;

/* renamed from: j5.k */
public class C6716k implements View.OnTouchListener, View.OnLayoutChangeListener {

    /* renamed from: B */
    private static float f20254B = 3.0f;

    /* renamed from: C */
    private static float f20255C = 1.75f;

    /* renamed from: D */
    private static float f20256D = 1.0f;

    /* renamed from: E */
    private static int f20257E = 200;
    /* access modifiers changed from: private */

    /* renamed from: A */
    public C6708c f20258A = new C6717a();
    /* access modifiers changed from: private */

    /* renamed from: d */
    public Interpolator f20259d = new AccelerateDecelerateInterpolator();
    /* access modifiers changed from: private */

    /* renamed from: e */
    public int f20260e = f20257E;

    /* renamed from: f */
    private float f20261f = f20256D;

    /* renamed from: g */
    private float f20262g = f20255C;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public float f20263h = f20254B;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public boolean f20264i = true;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public boolean f20265j = false;
    /* access modifiers changed from: private */

    /* renamed from: k */
    public ImageView f20266k;

    /* renamed from: l */
    private GestureDetector f20267l;
    /* access modifiers changed from: private */

    /* renamed from: m */
    public C6706b f20268m;

    /* renamed from: n */
    private final Matrix f20269n = new Matrix();

    /* renamed from: o */
    private final Matrix f20270o = new Matrix();
    /* access modifiers changed from: private */

    /* renamed from: p */
    public final Matrix f20271p = new Matrix();

    /* renamed from: q */
    private final RectF f20272q = new RectF();

    /* renamed from: r */
    private final float[] f20273r = new float[9];
    /* access modifiers changed from: private */

    /* renamed from: s */
    public View.OnClickListener f20274s;
    /* access modifiers changed from: private */

    /* renamed from: t */
    public View.OnLongClickListener f20275t;
    /* access modifiers changed from: private */

    /* renamed from: u */
    public C6722f f20276u;
    /* access modifiers changed from: private */

    /* renamed from: v */
    public int f20277v = 2;
    /* access modifiers changed from: private */

    /* renamed from: w */
    public int f20278w = 2;

    /* renamed from: x */
    private float f20279x;

    /* renamed from: y */
    private boolean f20280y = true;

    /* renamed from: z */
    private ImageView.ScaleType f20281z = ImageView.ScaleType.FIT_CENTER;

    /* renamed from: j5.k$a */
    class C6717a implements C6708c {
        C6717a() {
        }

        /* renamed from: a */
        public void mo20695a(float f, float f2) {
            if (!C6716k.this.f20268m.mo20690e()) {
                C6714i unused = C6716k.this.getClass();
                C6716k.this.f20271p.postTranslate(f, f2);
                C6716k.this.m26203z();
                ViewParent parent = C6716k.this.f20266k.getParent();
                if (!C6716k.this.f20264i || C6716k.this.f20268m.mo20690e() || C6716k.this.f20265j) {
                    if (parent != null) {
                        parent.requestDisallowInterceptTouchEvent(true);
                    }
                } else if ((C6716k.this.f20277v == 2 || ((C6716k.this.f20277v == 0 && f >= 1.0f) || ((C6716k.this.f20277v == 1 && f <= -1.0f) || ((C6716k.this.f20278w == 0 && f2 >= 1.0f) || (C6716k.this.f20278w == 1 && f2 <= -1.0f))))) && parent != null) {
                    parent.requestDisallowInterceptTouchEvent(false);
                }
            }
        }

        /* renamed from: b */
        public void mo20696b(float f, float f2, float f3) {
            if (C6716k.this.mo20703K() < C6716k.this.f20263h || f < 1.0f) {
                C6712g unused = C6716k.this.getClass();
                C6716k.this.f20271p.postScale(f, f, f2, f3);
                C6716k.this.m26203z();
            }
        }

        /* renamed from: c */
        public void mo20697c(float f, float f2, float f3, float f4) {
            C6716k kVar = C6716k.this;
            C6722f unused = kVar.f20276u = new C6722f(kVar.f20266k.getContext());
            C6722f w = C6716k.this.f20276u;
            C6716k kVar2 = C6716k.this;
            int c = kVar2.m26173G(kVar2.f20266k);
            C6716k kVar3 = C6716k.this;
            w.mo20737b(c, kVar3.m26172F(kVar3.f20266k), (int) f3, (int) f4);
            C6716k.this.f20266k.post(C6716k.this.f20276u);
        }
    }

    /* renamed from: j5.k$b */
    class C6718b extends GestureDetector.SimpleOnGestureListener {
        C6718b() {
        }

        public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
            C6713h unused = C6716k.this.getClass();
            return false;
        }

        public void onLongPress(MotionEvent motionEvent) {
            if (C6716k.this.f20275t != null) {
                C6716k.this.f20275t.onLongClick(C6716k.this.f20266k);
            }
        }
    }

    /* renamed from: j5.k$c */
    class C6719c implements GestureDetector.OnDoubleTapListener {
        C6719c() {
        }

        public boolean onDoubleTap(MotionEvent motionEvent) {
            try {
                float K = C6716k.this.mo20703K();
                float x = motionEvent.getX();
                float y = motionEvent.getY();
                if (K < C6716k.this.mo20701I()) {
                    C6716k kVar = C6716k.this;
                    kVar.mo20722g0(kVar.mo20701I(), x, y, true);
                } else if (K < C6716k.this.mo20701I() || K >= C6716k.this.mo20700H()) {
                    C6716k kVar2 = C6716k.this;
                    kVar2.mo20722g0(kVar2.mo20702J(), x, y, true);
                } else {
                    C6716k kVar3 = C6716k.this;
                    kVar3.mo20722g0(kVar3.mo20700H(), x, y, true);
                }
            } catch (ArrayIndexOutOfBoundsException unused) {
            }
            return true;
        }

        public boolean onDoubleTapEvent(MotionEvent motionEvent) {
            return false;
        }

        public boolean onSingleTapConfirmed(MotionEvent motionEvent) {
            if (C6716k.this.f20274s != null) {
                C6716k.this.f20274s.onClick(C6716k.this.f20266k);
            }
            RectF B = C6716k.this.mo20698B();
            float x = motionEvent.getX();
            float y = motionEvent.getY();
            C6715j unused = C6716k.this.getClass();
            if (B == null) {
                return false;
            }
            if (B.contains(x, y)) {
                B.width();
                B.height();
                C6711f unused2 = C6716k.this.getClass();
                return true;
            }
            C6710e unused3 = C6716k.this.getClass();
            return false;
        }
    }

    /* renamed from: j5.k$d */
    static /* synthetic */ class C6720d {

        /* renamed from: a */
        static final /* synthetic */ int[] f20285a;

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|(3:7|8|10)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        static {
            /*
                android.widget.ImageView$ScaleType[] r0 = android.widget.ImageView.ScaleType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f20285a = r0
                android.widget.ImageView$ScaleType r1 = android.widget.ImageView.ScaleType.FIT_CENTER     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f20285a     // Catch:{ NoSuchFieldError -> 0x001d }
                android.widget.ImageView$ScaleType r1 = android.widget.ImageView.ScaleType.FIT_START     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f20285a     // Catch:{ NoSuchFieldError -> 0x0028 }
                android.widget.ImageView$ScaleType r1 = android.widget.ImageView.ScaleType.FIT_END     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f20285a     // Catch:{ NoSuchFieldError -> 0x0033 }
                android.widget.ImageView$ScaleType r1 = android.widget.ImageView.ScaleType.FIT_XY     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p129j5.C6716k.C6720d.<clinit>():void");
        }
    }

    /* renamed from: j5.k$e */
    private class C6721e implements Runnable {

        /* renamed from: d */
        private final float f20286d;

        /* renamed from: e */
        private final float f20287e;

        /* renamed from: f */
        private final long f20288f = System.currentTimeMillis();

        /* renamed from: g */
        private final float f20289g;

        /* renamed from: h */
        private final float f20290h;

        public C6721e(float f, float f2, float f3, float f4) {
            this.f20286d = f3;
            this.f20287e = f4;
            this.f20289g = f;
            this.f20290h = f2;
        }

        /* renamed from: a */
        private float m26237a() {
            return C6716k.this.f20259d.getInterpolation(Math.min(1.0f, (((float) (System.currentTimeMillis() - this.f20288f)) * 1.0f) / ((float) C6716k.this.f20260e)));
        }

        public void run() {
            float a = m26237a();
            float f = this.f20289g;
            C6716k.this.f20258A.mo20696b((f + ((this.f20290h - f) * a)) / C6716k.this.mo20703K(), this.f20286d, this.f20287e);
            if (a < 1.0f) {
                C6705a.m26157a(C6716k.this.f20266k, this);
            }
        }
    }

    /* renamed from: j5.k$f */
    private class C6722f implements Runnable {

        /* renamed from: d */
        private final OverScroller f20292d;

        /* renamed from: e */
        private int f20293e;

        /* renamed from: f */
        private int f20294f;

        public C6722f(Context context) {
            this.f20292d = new OverScroller(context);
        }

        /* renamed from: a */
        public void mo20736a() {
            this.f20292d.forceFinished(true);
        }

        /* renamed from: b */
        public void mo20737b(int i, int i2, int i3, int i4) {
            int i5;
            int i6;
            int i7;
            int i8;
            RectF B = C6716k.this.mo20698B();
            if (B != null) {
                int round = Math.round(-B.left);
                float f = (float) i;
                if (f < B.width()) {
                    i5 = Math.round(B.width() - f);
                    i6 = 0;
                } else {
                    i6 = round;
                    i5 = i6;
                }
                int round2 = Math.round(-B.top);
                float f2 = (float) i2;
                if (f2 < B.height()) {
                    i7 = Math.round(B.height() - f2);
                    i8 = 0;
                } else {
                    i8 = round2;
                    i7 = i8;
                }
                this.f20293e = round;
                this.f20294f = round2;
                if (round != i5 || round2 != i7) {
                    this.f20292d.fling(round, round2, i3, i4, i6, i5, i8, i7, 0, 0);
                }
            }
        }

        public void run() {
            if (!this.f20292d.isFinished() && this.f20292d.computeScrollOffset()) {
                int currX = this.f20292d.getCurrX();
                int currY = this.f20292d.getCurrY();
                C6716k.this.f20271p.postTranslate((float) (this.f20293e - currX), (float) (this.f20294f - currY));
                C6716k.this.m26203z();
                this.f20293e = currX;
                this.f20294f = currY;
                C6705a.m26157a(C6716k.this.f20266k, this);
            }
        }
    }

    public C6716k(ImageView imageView) {
        this.f20266k = imageView;
        imageView.setOnTouchListener(this);
        imageView.addOnLayoutChangeListener(this);
        if (!imageView.isInEditMode()) {
            this.f20279x = Utils.FLOAT_EPSILON;
            this.f20268m = new C6706b(imageView.getContext(), this.f20258A);
            GestureDetector gestureDetector = new GestureDetector(imageView.getContext(), new C6718b());
            this.f20267l = gestureDetector;
            gestureDetector.setOnDoubleTapListener(new C6719c());
        }
    }

    /* renamed from: A */
    private boolean m26169A() {
        float f;
        float f2;
        float f3;
        float f4;
        float f5;
        RectF C = m26170C(m26171D());
        if (C == null) {
            return false;
        }
        float height = C.height();
        float width = C.width();
        float F = (float) m26172F(this.f20266k);
        int i = (height > F ? 1 : (height == F ? 0 : -1));
        float f6 = Utils.FLOAT_EPSILON;
        if (i <= 0) {
            int i2 = C6720d.f20285a[this.f20281z.ordinal()];
            if (i2 != 2) {
                if (i2 != 3) {
                    f4 = (F - height) / 2.0f;
                    f5 = C.top;
                } else {
                    f4 = F - height;
                    f5 = C.top;
                }
                f = f4 - f5;
            } else {
                f = -C.top;
            }
            this.f20278w = 2;
        } else {
            float f7 = C.top;
            if (f7 > Utils.FLOAT_EPSILON) {
                this.f20278w = 0;
                f = -f7;
            } else {
                float f8 = C.bottom;
                if (f8 < F) {
                    this.f20278w = 1;
                    f = F - f8;
                } else {
                    this.f20278w = -1;
                    f = 0.0f;
                }
            }
        }
        float G = (float) m26173G(this.f20266k);
        if (width <= G) {
            int i3 = C6720d.f20285a[this.f20281z.ordinal()];
            if (i3 != 2) {
                if (i3 != 3) {
                    f2 = (G - width) / 2.0f;
                    f3 = C.left;
                } else {
                    f2 = G - width;
                    f3 = C.left;
                }
                f6 = f2 - f3;
            } else {
                f6 = -C.left;
            }
            this.f20277v = 2;
        } else {
            float f9 = C.left;
            if (f9 > Utils.FLOAT_EPSILON) {
                this.f20277v = 0;
                f6 = -f9;
            } else {
                float f12 = C.right;
                if (f12 < G) {
                    f6 = G - f12;
                    this.f20277v = 1;
                } else {
                    this.f20277v = -1;
                }
            }
        }
        this.f20271p.postTranslate(f6, f);
        return true;
    }

    /* renamed from: C */
    private RectF m26170C(Matrix matrix) {
        Drawable drawable = this.f20266k.getDrawable();
        if (drawable == null) {
            return null;
        }
        this.f20272q.set(Utils.FLOAT_EPSILON, Utils.FLOAT_EPSILON, (float) drawable.getIntrinsicWidth(), (float) drawable.getIntrinsicHeight());
        matrix.mapRect(this.f20272q);
        return this.f20272q;
    }

    /* renamed from: D */
    private Matrix m26171D() {
        this.f20270o.set(this.f20269n);
        this.f20270o.postConcat(this.f20271p);
        return this.f20270o;
    }

    /* access modifiers changed from: private */
    /* renamed from: F */
    public int m26172F(ImageView imageView) {
        return (imageView.getHeight() - imageView.getPaddingTop()) - imageView.getPaddingBottom();
    }

    /* access modifiers changed from: private */
    /* renamed from: G */
    public int m26173G(ImageView imageView) {
        return (imageView.getWidth() - imageView.getPaddingLeft()) - imageView.getPaddingRight();
    }

    /* renamed from: M */
    private float m26174M(Matrix matrix, int i) {
        matrix.getValues(this.f20273r);
        return this.f20273r[i];
    }

    /* renamed from: N */
    private void m26175N() {
        this.f20271p.reset();
        mo20719d0(this.f20279x);
        m26176P(m26171D());
        m26169A();
    }

    /* renamed from: P */
    private void m26176P(Matrix matrix) {
        this.f20266k.setImageMatrix(matrix);
    }

    /* renamed from: m0 */
    private void m26190m0(Drawable drawable) {
        if (drawable != null) {
            float G = (float) m26173G(this.f20266k);
            float F = (float) m26172F(this.f20266k);
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = drawable.getIntrinsicHeight();
            this.f20269n.reset();
            float f = (float) intrinsicWidth;
            float f2 = G / f;
            float f3 = (float) intrinsicHeight;
            float f4 = F / f3;
            ImageView.ScaleType scaleType = this.f20281z;
            if (scaleType == ImageView.ScaleType.CENTER) {
                this.f20269n.postTranslate((G - f) / 2.0f, (F - f3) / 2.0f);
            } else if (scaleType == ImageView.ScaleType.CENTER_CROP) {
                float max = Math.max(f2, f4);
                this.f20269n.postScale(max, max);
                this.f20269n.postTranslate((G - (f * max)) / 2.0f, (F - (f3 * max)) / 2.0f);
            } else if (scaleType == ImageView.ScaleType.CENTER_INSIDE) {
                float min = Math.min(1.0f, Math.min(f2, f4));
                this.f20269n.postScale(min, min);
                this.f20269n.postTranslate((G - (f * min)) / 2.0f, (F - (f3 * min)) / 2.0f);
            } else {
                RectF rectF = new RectF(Utils.FLOAT_EPSILON, Utils.FLOAT_EPSILON, f, f3);
                RectF rectF2 = new RectF(Utils.FLOAT_EPSILON, Utils.FLOAT_EPSILON, G, F);
                if (((int) this.f20279x) % SubsamplingScaleImageView.ORIENTATION_180 != 0) {
                    rectF = new RectF(Utils.FLOAT_EPSILON, Utils.FLOAT_EPSILON, f3, f);
                }
                int i = C6720d.f20285a[this.f20281z.ordinal()];
                if (i == 1) {
                    this.f20269n.setRectToRect(rectF, rectF2, Matrix.ScaleToFit.CENTER);
                } else if (i == 2) {
                    this.f20269n.setRectToRect(rectF, rectF2, Matrix.ScaleToFit.START);
                } else if (i == 3) {
                    this.f20269n.setRectToRect(rectF, rectF2, Matrix.ScaleToFit.END);
                } else if (i == 4) {
                    this.f20269n.setRectToRect(rectF, rectF2, Matrix.ScaleToFit.FILL);
                }
            }
            m26175N();
        }
    }

    /* renamed from: y */
    private void m26202y() {
        C6722f fVar = this.f20276u;
        if (fVar != null) {
            fVar.mo20736a();
            this.f20276u = null;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: z */
    public void m26203z() {
        if (m26169A()) {
            m26176P(m26171D());
        }
    }

    /* renamed from: B */
    public RectF mo20698B() {
        m26169A();
        return m26170C(m26171D());
    }

    /* renamed from: E */
    public Matrix mo20699E() {
        return this.f20270o;
    }

    /* renamed from: H */
    public float mo20700H() {
        return this.f20263h;
    }

    /* renamed from: I */
    public float mo20701I() {
        return this.f20262g;
    }

    /* renamed from: J */
    public float mo20702J() {
        return this.f20261f;
    }

    /* renamed from: K */
    public float mo20703K() {
        return (float) Math.sqrt((double) (((float) Math.pow((double) m26174M(this.f20271p, 0), 2.0d)) + ((float) Math.pow((double) m26174M(this.f20271p, 3), 2.0d))));
    }

    /* renamed from: L */
    public ImageView.ScaleType mo20704L() {
        return this.f20281z;
    }

    /* renamed from: O */
    public void mo20705O(boolean z) {
        this.f20264i = z;
    }

    /* renamed from: Q */
    public void mo20706Q(float f) {
        C6723l.m26240a(this.f20261f, this.f20262g, f);
        this.f20263h = f;
    }

    /* renamed from: R */
    public void mo20707R(float f) {
        C6723l.m26240a(this.f20261f, f, this.f20263h);
        this.f20262g = f;
    }

    /* renamed from: S */
    public void mo20708S(float f) {
        C6723l.m26240a(f, this.f20262g, this.f20263h);
        this.f20261f = f;
    }

    /* renamed from: T */
    public void mo20709T(View.OnClickListener onClickListener) {
        this.f20274s = onClickListener;
    }

    /* renamed from: U */
    public void mo20710U(GestureDetector.OnDoubleTapListener onDoubleTapListener) {
        this.f20267l.setOnDoubleTapListener(onDoubleTapListener);
    }

    /* renamed from: V */
    public void mo20711V(View.OnLongClickListener onLongClickListener) {
        this.f20275t = onLongClickListener;
    }

    /* renamed from: W */
    public void mo20712W(C6709d dVar) {
    }

    /* renamed from: X */
    public void mo20713X(C6710e eVar) {
    }

    /* renamed from: Y */
    public void mo20714Y(C6711f fVar) {
    }

    /* renamed from: Z */
    public void mo20715Z(C6712g gVar) {
    }

    /* renamed from: a0 */
    public void mo20716a0(C6713h hVar) {
    }

    /* renamed from: b0 */
    public void mo20717b0(C6714i iVar) {
    }

    /* renamed from: c0 */
    public void mo20718c0(C6715j jVar) {
    }

    /* renamed from: d0 */
    public void mo20719d0(float f) {
        this.f20271p.postRotate(f % 360.0f);
        m26203z();
    }

    /* renamed from: e0 */
    public void mo20720e0(float f) {
        this.f20271p.setRotate(f % 360.0f);
        m26203z();
    }

    /* renamed from: f0 */
    public void mo20721f0(float f) {
        mo20723h0(f, false);
    }

    /* renamed from: g0 */
    public void mo20722g0(float f, float f2, float f3, boolean z) {
        if (f < this.f20261f || f > this.f20263h) {
            throw new IllegalArgumentException("Scale must be within the range of minScale and maxScale");
        } else if (z) {
            this.f20266k.post(new C6721e(mo20703K(), f, f2, f3));
        } else {
            this.f20271p.setScale(f, f, f2, f3);
            m26203z();
        }
    }

    /* renamed from: h0 */
    public void mo20723h0(float f, boolean z) {
        mo20722g0(f, (float) (this.f20266k.getRight() / 2), (float) (this.f20266k.getBottom() / 2), z);
    }

    /* renamed from: i0 */
    public void mo20724i0(ImageView.ScaleType scaleType) {
        if (C6723l.m26243d(scaleType) && scaleType != this.f20281z) {
            this.f20281z = scaleType;
            mo20727l0();
        }
    }

    /* renamed from: j0 */
    public void mo20725j0(int i) {
        this.f20260e = i;
    }

    /* renamed from: k0 */
    public void mo20726k0(boolean z) {
        this.f20280y = z;
        mo20727l0();
    }

    /* renamed from: l0 */
    public void mo20727l0() {
        if (this.f20280y) {
            m26190m0(this.f20266k.getDrawable());
        } else {
            m26175N();
        }
    }

    public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        if (i != i5 || i2 != i6 || i3 != i7 || i4 != i8) {
            m26190m0(this.f20266k.getDrawable());
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:27:0x007f  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00b2  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x00bd  */
    /* JADX WARNING: Removed duplicated region for block: B:52:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onTouch(android.view.View r11, android.view.MotionEvent r12) {
        /*
            r10 = this;
            boolean r0 = r10.f20280y
            r1 = 0
            if (r0 == 0) goto L_0x00be
            r0 = r11
            android.widget.ImageView r0 = (android.widget.ImageView) r0
            boolean r0 = p129j5.C6723l.m26242c(r0)
            if (r0 == 0) goto L_0x00be
            int r0 = r12.getAction()
            r2 = 1
            if (r0 == 0) goto L_0x006e
            if (r0 == r2) goto L_0x001b
            r3 = 3
            if (r0 == r3) goto L_0x001b
            goto L_0x007a
        L_0x001b:
            float r0 = r10.mo20703K()
            float r3 = r10.f20261f
            int r0 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r0 >= 0) goto L_0x0044
            android.graphics.RectF r0 = r10.mo20698B()
            if (r0 == 0) goto L_0x007a
            j5.k$e r9 = new j5.k$e
            float r5 = r10.mo20703K()
            float r6 = r10.f20261f
            float r7 = r0.centerX()
            float r8 = r0.centerY()
            r3 = r9
            r4 = r10
            r3.<init>(r5, r6, r7, r8)
            r11.post(r9)
            goto L_0x006c
        L_0x0044:
            float r0 = r10.mo20703K()
            float r3 = r10.f20263h
            int r0 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r0 <= 0) goto L_0x007a
            android.graphics.RectF r0 = r10.mo20698B()
            if (r0 == 0) goto L_0x007a
            j5.k$e r9 = new j5.k$e
            float r5 = r10.mo20703K()
            float r6 = r10.f20263h
            float r7 = r0.centerX()
            float r8 = r0.centerY()
            r3 = r9
            r4 = r10
            r3.<init>(r5, r6, r7, r8)
            r11.post(r9)
        L_0x006c:
            r11 = r2
            goto L_0x007b
        L_0x006e:
            android.view.ViewParent r11 = r11.getParent()
            if (r11 == 0) goto L_0x0077
            r11.requestDisallowInterceptTouchEvent(r2)
        L_0x0077:
            r10.m26202y()
        L_0x007a:
            r11 = r1
        L_0x007b:
            j5.b r0 = r10.f20268m
            if (r0 == 0) goto L_0x00b2
            boolean r11 = r0.mo20690e()
            j5.b r0 = r10.f20268m
            boolean r0 = r0.mo20689d()
            j5.b r3 = r10.f20268m
            boolean r3 = r3.mo20691f(r12)
            if (r11 != 0) goto L_0x009b
            j5.b r11 = r10.f20268m
            boolean r11 = r11.mo20690e()
            if (r11 != 0) goto L_0x009b
            r11 = r2
            goto L_0x009c
        L_0x009b:
            r11 = r1
        L_0x009c:
            if (r0 != 0) goto L_0x00a8
            j5.b r0 = r10.f20268m
            boolean r0 = r0.mo20689d()
            if (r0 != 0) goto L_0x00a8
            r0 = r2
            goto L_0x00a9
        L_0x00a8:
            r0 = r1
        L_0x00a9:
            if (r11 == 0) goto L_0x00ae
            if (r0 == 0) goto L_0x00ae
            r1 = r2
        L_0x00ae:
            r10.f20265j = r1
            r1 = r3
            goto L_0x00b3
        L_0x00b2:
            r1 = r11
        L_0x00b3:
            android.view.GestureDetector r11 = r10.f20267l
            if (r11 == 0) goto L_0x00be
            boolean r11 = r11.onTouchEvent(r12)
            if (r11 == 0) goto L_0x00be
            r1 = r2
        L_0x00be:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p129j5.C6716k.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }
}
