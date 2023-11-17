package p331z1;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import android.graphics.Typeface;
import androidx.collection.LongSparseArray;
import com.airbnb.lottie.C2315d0;
import com.airbnb.lottie.C2325h;
import com.airbnb.lottie.C2326h0;
import com.github.mikephil.charting.utils.Utils;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import p048d2.C5808j;
import p061e2.C6015c;
import p255t1.C8312d;
import p268u1.C8525a;
import p268u1.C8546o;
import p268u1.C8549q;
import p294w1.C8734b;
import p294w1.C8736c;
import p294w1.C8737d;
import p307x1.C8935a;
import p307x1.C8936b;
import p307x1.C8945k;
import p319y1.C9027p;

/* renamed from: z1.i */
public class C9180i extends C9169b {

    /* renamed from: D */
    private final StringBuilder f25508D = new StringBuilder(2);

    /* renamed from: E */
    private final RectF f25509E = new RectF();

    /* renamed from: F */
    private final Matrix f25510F = new Matrix();

    /* renamed from: G */
    private final Paint f25511G = new C9181a(1);

    /* renamed from: H */
    private final Paint f25512H = new C9182b(1);

    /* renamed from: I */
    private final Map f25513I = new HashMap();

    /* renamed from: J */
    private final LongSparseArray f25514J = new LongSparseArray();

    /* renamed from: K */
    private final List f25515K = new ArrayList();

    /* renamed from: L */
    private final C8546o f25516L;

    /* renamed from: M */
    private final C2315d0 f25517M;

    /* renamed from: N */
    private final C2325h f25518N;

    /* renamed from: O */
    private C8525a f25519O;

    /* renamed from: P */
    private C8525a f25520P;

    /* renamed from: Q */
    private C8525a f25521Q;

    /* renamed from: R */
    private C8525a f25522R;

    /* renamed from: S */
    private C8525a f25523S;

    /* renamed from: T */
    private C8525a f25524T;

    /* renamed from: U */
    private C8525a f25525U;

    /* renamed from: V */
    private C8525a f25526V;

    /* renamed from: W */
    private C8525a f25527W;

    /* renamed from: X */
    private C8525a f25528X;

    /* renamed from: z1.i$a */
    class C9181a extends Paint {
        C9181a(int i) {
            super(i);
            setStyle(Paint.Style.FILL);
        }
    }

    /* renamed from: z1.i$b */
    class C9182b extends Paint {
        C9182b(int i) {
            super(i);
            setStyle(Paint.Style.STROKE);
        }
    }

    /* renamed from: z1.i$c */
    static /* synthetic */ class C9183c {

        /* renamed from: a */
        static final /* synthetic */ int[] f25531a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|(3:5|6|8)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        static {
            /*
                w1.b$a[] r0 = p294w1.C8734b.C8735a.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f25531a = r0
                w1.b$a r1 = p294w1.C8734b.C8735a.LEFT_ALIGN     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f25531a     // Catch:{ NoSuchFieldError -> 0x001d }
                w1.b$a r1 = p294w1.C8734b.C8735a.RIGHT_ALIGN     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f25531a     // Catch:{ NoSuchFieldError -> 0x0028 }
                w1.b$a r1 = p294w1.C8734b.C8735a.CENTER     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p331z1.C9180i.C9183c.<clinit>():void");
        }
    }

    C9180i(C2315d0 d0Var, C9174e eVar) {
        super(d0Var, eVar);
        C8936b bVar;
        C8936b bVar2;
        C8935a aVar;
        C8935a aVar2;
        this.f25517M = d0Var;
        this.f25518N = eVar.mo24761b();
        C8546o d = eVar.mo24778s().mo24353a();
        this.f25516L = d;
        d.mo23850a(this);
        mo24753i(d);
        C8945k t = eVar.mo24779t();
        if (!(t == null || (aVar2 = t.f24940a) == null)) {
            C8525a a = aVar2.mo24353a();
            this.f25519O = a;
            a.mo23850a(this);
            mo24753i(this.f25519O);
        }
        if (!(t == null || (aVar = t.f24941b) == null)) {
            C8525a a2 = aVar.mo24353a();
            this.f25521Q = a2;
            a2.mo23850a(this);
            mo24753i(this.f25521Q);
        }
        if (!(t == null || (bVar2 = t.f24942c) == null)) {
            C8525a a3 = bVar2.mo24353a();
            this.f25523S = a3;
            a3.mo23850a(this);
            mo24753i(this.f25523S);
        }
        if (t != null && (bVar = t.f24943d) != null) {
            C8525a a4 = bVar.mo24353a();
            this.f25525U = a4;
            a4.mo23850a(this);
            mo24753i(this.f25525U);
        }
    }

    /* renamed from: P */
    private String m33915P(String str, int i) {
        int codePointAt = str.codePointAt(i);
        int charCount = Character.charCount(codePointAt) + i;
        while (charCount < str.length()) {
            int codePointAt2 = str.codePointAt(charCount);
            if (!m33929d0(codePointAt2)) {
                break;
            }
            charCount += Character.charCount(codePointAt2);
            codePointAt = (codePointAt * 31) + codePointAt2;
        }
        long j = (long) codePointAt;
        if (this.f25514J.containsKey(j)) {
            return (String) this.f25514J.get(j);
        }
        this.f25508D.setLength(0);
        while (i < charCount) {
            int codePointAt3 = str.codePointAt(i);
            this.f25508D.appendCodePoint(codePointAt3);
            i += Character.charCount(codePointAt3);
        }
        String sb = this.f25508D.toString();
        this.f25514J.put(j, sb);
        return sb;
    }

    /* renamed from: Q */
    private void m33916Q(C8734b bVar, Matrix matrix) {
        int i;
        C8525a aVar = this.f25520P;
        if (aVar != null) {
            this.f25511G.setColor(((Integer) aVar.mo23856h()).intValue());
        } else {
            C8525a aVar2 = this.f25519O;
            if (aVar2 != null) {
                this.f25511G.setColor(((Integer) aVar2.mo23856h()).intValue());
            } else {
                this.f25511G.setColor(bVar.f24572h);
            }
        }
        C8525a aVar3 = this.f25522R;
        if (aVar3 != null) {
            this.f25512H.setColor(((Integer) aVar3.mo23856h()).intValue());
        } else {
            C8525a aVar4 = this.f25521Q;
            if (aVar4 != null) {
                this.f25512H.setColor(((Integer) aVar4.mo23856h()).intValue());
            } else {
                this.f25512H.setColor(bVar.f24573i);
            }
        }
        if (this.f25443x.mo23910h() == null) {
            i = 100;
        } else {
            i = ((Integer) this.f25443x.mo23910h().mo23856h()).intValue();
        }
        int i2 = (i * C11051p3.f31759c) / 100;
        this.f25511G.setAlpha(i2);
        this.f25512H.setAlpha(i2);
        C8525a aVar5 = this.f25524T;
        if (aVar5 != null) {
            this.f25512H.setStrokeWidth(((Float) aVar5.mo23856h()).floatValue());
            return;
        }
        C8525a aVar6 = this.f25523S;
        if (aVar6 != null) {
            this.f25512H.setStrokeWidth(((Float) aVar6.mo23856h()).floatValue());
        } else {
            this.f25512H.setStrokeWidth(bVar.f24574j * C5808j.m23377e());
        }
    }

    /* renamed from: R */
    private void m33917R(String str, Paint paint, Canvas canvas) {
        if (paint.getColor() != 0) {
            if (paint.getStyle() != Paint.Style.STROKE || paint.getStrokeWidth() != Utils.FLOAT_EPSILON) {
                canvas.drawText(str, 0, str.length(), Utils.FLOAT_EPSILON, Utils.FLOAT_EPSILON, paint);
            }
        }
    }

    /* renamed from: S */
    private void m33918S(C8737d dVar, float f, C8734b bVar, Canvas canvas) {
        List a0 = m33926a0(dVar);
        for (int i = 0; i < a0.size(); i++) {
            Path z = ((C8312d) a0.get(i)).mo23480z();
            z.computeBounds(this.f25509E, false);
            this.f25510F.reset();
            this.f25510F.preTranslate(Utils.FLOAT_EPSILON, (-bVar.f24571g) * C5808j.m23377e());
            this.f25510F.preScale(f, f);
            z.transform(this.f25510F);
            if (bVar.f24575k) {
                m33921V(z, this.f25511G, canvas);
                m33921V(z, this.f25512H, canvas);
            } else {
                m33921V(z, this.f25512H, canvas);
                m33921V(z, this.f25511G, canvas);
            }
        }
    }

    /* renamed from: T */
    private void m33919T(String str, C8734b bVar, Canvas canvas) {
        if (bVar.f24575k) {
            m33917R(str, this.f25511G, canvas);
            m33917R(str, this.f25512H, canvas);
            return;
        }
        m33917R(str, this.f25512H, canvas);
        m33917R(str, this.f25511G, canvas);
    }

    /* renamed from: U */
    private void m33920U(String str, C8734b bVar, Canvas canvas, float f) {
        int i = 0;
        while (i < str.length()) {
            String P = m33915P(str, i);
            i += P.length();
            m33919T(P, bVar, canvas);
            canvas.translate(this.f25511G.measureText(P) + f, Utils.FLOAT_EPSILON);
        }
    }

    /* renamed from: V */
    private void m33921V(Path path, Paint paint, Canvas canvas) {
        if (paint.getColor() != 0) {
            if (paint.getStyle() != Paint.Style.STROKE || paint.getStrokeWidth() != Utils.FLOAT_EPSILON) {
                canvas.drawPath(path, paint);
            }
        }
    }

    /* renamed from: W */
    private void m33922W(String str, C8734b bVar, C8736c cVar, Canvas canvas, float f, float f2, float f3) {
        for (int i = 0; i < str.length(); i++) {
            C8737d dVar = (C8737d) this.f25518N.mo7544c().get(C8737d.m32517c(str.charAt(i), cVar.mo24127a(), cVar.mo24129c()));
            if (dVar != null) {
                m33918S(dVar, f2, bVar, canvas);
                canvas.translate((((float) dVar.mo24133b()) * f2 * C5808j.m23377e()) + f3, Utils.FLOAT_EPSILON);
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0089  */
    /* renamed from: X */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m33923X(p294w1.C8734b r19, p294w1.C8736c r20, android.graphics.Canvas r21) {
        /*
            r18 = this;
            r7 = r18
            r8 = r19
            r9 = r20
            r10 = r21
            android.graphics.Typeface r0 = r7.m33928c0(r9)
            if (r0 != 0) goto L_0x000f
            return
        L_0x000f:
            java.lang.String r1 = r8.f24565a
            com.airbnb.lottie.d0 r2 = r7.f25517M
            r2.mo7490W()
            android.graphics.Paint r2 = r7.f25511G
            r2.setTypeface(r0)
            u1.a r0 = r7.f25527W
            if (r0 == 0) goto L_0x002a
            java.lang.Object r0 = r0.mo23856h()
            java.lang.Float r0 = (java.lang.Float) r0
            float r0 = r0.floatValue()
            goto L_0x002c
        L_0x002a:
            float r0 = r8.f24567c
        L_0x002c:
            android.graphics.Paint r2 = r7.f25511G
            float r3 = p048d2.C5808j.m23377e()
            float r3 = r3 * r0
            r2.setTextSize(r3)
            android.graphics.Paint r2 = r7.f25512H
            android.graphics.Paint r3 = r7.f25511G
            android.graphics.Typeface r3 = r3.getTypeface()
            r2.setTypeface(r3)
            android.graphics.Paint r2 = r7.f25512H
            android.graphics.Paint r3 = r7.f25511G
            float r3 = r3.getTextSize()
            r2.setTextSize(r3)
            int r2 = r8.f24569e
            float r2 = (float) r2
            r3 = 1092616192(0x41200000, float:10.0)
            float r2 = r2 / r3
            u1.a r3 = r7.f25526V
            if (r3 == 0) goto L_0x0062
            java.lang.Object r3 = r3.mo23856h()
            java.lang.Float r3 = (java.lang.Float) r3
            float r3 = r3.floatValue()
        L_0x0060:
            float r2 = r2 + r3
            goto L_0x0071
        L_0x0062:
            u1.a r3 = r7.f25525U
            if (r3 == 0) goto L_0x0071
            java.lang.Object r3 = r3.mo23856h()
            java.lang.Float r3 = (java.lang.Float) r3
            float r3 = r3.floatValue()
            goto L_0x0060
        L_0x0071:
            float r3 = p048d2.C5808j.m23377e()
            float r2 = r2 * r3
            float r2 = r2 * r0
            r0 = 1120403456(0x42c80000, float:100.0)
            float r11 = r2 / r0
            java.util.List r12 = r7.m33927b0(r1)
            int r13 = r12.size()
            r14 = 0
            r0 = -1
            r15 = r0
            r6 = r14
        L_0x0087:
            if (r6 >= r13) goto L_0x00d2
            java.lang.Object r0 = r12.get(r6)
            r1 = r0
            java.lang.String r1 = (java.lang.String) r1
            android.graphics.PointF r0 = r8.f24577m
            if (r0 != 0) goto L_0x0096
            r0 = 0
            goto L_0x0098
        L_0x0096:
            float r0 = r0.x
        L_0x0098:
            r2 = r0
            r4 = 0
            r16 = 0
            r0 = r18
            r3 = r20
            r5 = r11
            r17 = r6
            r6 = r16
            java.util.List r0 = r0.m33931f0(r1, r2, r3, r4, r5, r6)
            r1 = r14
        L_0x00aa:
            int r2 = r0.size()
            if (r1 >= r2) goto L_0x00cf
            java.lang.Object r2 = r0.get(r1)
            z1.i$d r2 = (p331z1.C9180i.C9184d) r2
            int r15 = r15 + 1
            r21.save()
            float r3 = r2.f25533b
            r7.m33930e0(r10, r8, r15, r3)
            java.lang.String r2 = r2.f25532a
            r7.m33920U(r2, r8, r10, r11)
            r21.restore()
            int r1 = r1 + 1
            goto L_0x00aa
        L_0x00cf:
            int r6 = r17 + 1
            goto L_0x0087
        L_0x00d2:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p331z1.C9180i.m33923X(w1.b, w1.c, android.graphics.Canvas):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0053  */
    /* renamed from: Y */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m33924Y(p294w1.C8734b r21, android.graphics.Matrix r22, p294w1.C8736c r23, android.graphics.Canvas r24) {
        /*
            r20 = this;
            r8 = r20
            r9 = r21
            u1.a r0 = r8.f25527W
            if (r0 == 0) goto L_0x0013
            java.lang.Object r0 = r0.mo23856h()
            java.lang.Float r0 = (java.lang.Float) r0
            float r0 = r0.floatValue()
            goto L_0x0015
        L_0x0013:
            float r0 = r9.f24567c
        L_0x0015:
            r1 = 1120403456(0x42c80000, float:100.0)
            float r10 = r0 / r1
            float r11 = p048d2.C5808j.m23379g(r22)
            java.lang.String r0 = r9.f24565a
            java.util.List r12 = r8.m33927b0(r0)
            int r13 = r12.size()
            int r0 = r9.f24569e
            float r0 = (float) r0
            r1 = 1092616192(0x41200000, float:10.0)
            float r0 = r0 / r1
            u1.a r1 = r8.f25526V
            if (r1 == 0) goto L_0x003d
            java.lang.Object r1 = r1.mo23856h()
            java.lang.Float r1 = (java.lang.Float) r1
            float r1 = r1.floatValue()
        L_0x003b:
            float r0 = r0 + r1
            goto L_0x004c
        L_0x003d:
            u1.a r1 = r8.f25525U
            if (r1 == 0) goto L_0x004c
            java.lang.Object r1 = r1.mo23856h()
            java.lang.Float r1 = (java.lang.Float) r1
            float r1 = r1.floatValue()
            goto L_0x003b
        L_0x004c:
            r14 = r0
            r15 = 0
            r0 = -1
            r7 = r0
            r6 = r15
        L_0x0051:
            if (r6 >= r13) goto L_0x00b1
            java.lang.Object r0 = r12.get(r6)
            r1 = r0
            java.lang.String r1 = (java.lang.String) r1
            android.graphics.PointF r0 = r9.f24577m
            if (r0 != 0) goto L_0x0060
            r0 = 0
            goto L_0x0062
        L_0x0060:
            float r0 = r0.x
        L_0x0062:
            r2 = r0
            r16 = 1
            r0 = r20
            r3 = r23
            r4 = r10
            r5 = r14
            r17 = r6
            r6 = r16
            java.util.List r6 = r0.m33931f0(r1, r2, r3, r4, r5, r6)
            r5 = r15
        L_0x0074:
            int r0 = r6.size()
            if (r5 >= r0) goto L_0x00ae
            java.lang.Object r0 = r6.get(r5)
            z1.i$d r0 = (p331z1.C9180i.C9184d) r0
            int r7 = r7 + 1
            r24.save()
            float r1 = r0.f25533b
            r4 = r24
            r8.m33930e0(r4, r9, r7, r1)
            java.lang.String r1 = r0.f25532a
            r0 = r20
            r2 = r21
            r3 = r23
            r16 = r5
            r5 = r11
            r18 = r6
            r6 = r10
            r19 = r7
            r7 = r14
            r0.m33922W(r1, r2, r3, r4, r5, r6, r7)
            r24.restore()
            int r5 = r16 + 1
            r6 = r18
            r7 = r19
            goto L_0x0074
        L_0x00ae:
            int r6 = r17 + 1
            goto L_0x0051
        L_0x00b1:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p331z1.C9180i.m33924Y(w1.b, android.graphics.Matrix, w1.c, android.graphics.Canvas):void");
    }

    /* renamed from: Z */
    private C9184d m33925Z(int i) {
        for (int size = this.f25515K.size(); size < i; size++) {
            this.f25515K.add(new C9184d((C9181a) null));
        }
        return (C9184d) this.f25515K.get(i - 1);
    }

    /* renamed from: a0 */
    private List m33926a0(C8737d dVar) {
        if (this.f25513I.containsKey(dVar)) {
            return (List) this.f25513I.get(dVar);
        }
        List a = dVar.mo24132a();
        int size = a.size();
        ArrayList arrayList = new ArrayList(size);
        for (int i = 0; i < size; i++) {
            arrayList.add(new C8312d(this.f25517M, this, (C9027p) a.get(i), this.f25518N));
        }
        this.f25513I.put(dVar, arrayList);
        return arrayList;
    }

    /* renamed from: b0 */
    private List m33927b0(String str) {
        return Arrays.asList(str.replaceAll("\r\n", "\r").replaceAll("\u0003", "\r").replaceAll("\n", "\r").split("\r"));
    }

    /* renamed from: c0 */
    private Typeface m33928c0(C8736c cVar) {
        Typeface typeface;
        C8525a aVar = this.f25528X;
        if (aVar != null && (typeface = (Typeface) aVar.mo23856h()) != null) {
            return typeface;
        }
        Typeface X = this.f25517M.mo7492X(cVar);
        if (X != null) {
            return X;
        }
        return cVar.mo24130d();
    }

    /* renamed from: d0 */
    private boolean m33929d0(int i) {
        if (Character.getType(i) == 16 || Character.getType(i) == 27 || Character.getType(i) == 6 || Character.getType(i) == 28 || Character.getType(i) == 8 || Character.getType(i) == 19) {
            return true;
        }
        return false;
    }

    /* renamed from: e0 */
    private void m33930e0(Canvas canvas, C8734b bVar, int i, float f) {
        float f2;
        float f3;
        PointF pointF = bVar.f24576l;
        PointF pointF2 = bVar.f24577m;
        float e = C5808j.m23377e();
        float f4 = Utils.FLOAT_EPSILON;
        if (pointF == null) {
            f2 = 0.0f;
        } else {
            f2 = (bVar.f24570f * e) + pointF.y;
        }
        float f5 = (((float) i) * bVar.f24570f * e) + f2;
        if (pointF == null) {
            f3 = 0.0f;
        } else {
            f3 = pointF.x;
        }
        if (pointF2 != null) {
            f4 = pointF2.x;
        }
        int i2 = C9183c.f25531a[bVar.f24568d.ordinal()];
        if (i2 == 1) {
            canvas.translate(f3, f5);
        } else if (i2 == 2) {
            canvas.translate((f3 + f4) - f, f5);
        } else if (i2 == 3) {
            canvas.translate((f3 + (f4 / 2.0f)) - (f / 2.0f), f5);
        }
    }

    /* renamed from: f0 */
    private List m33931f0(String str, float f, C8736c cVar, float f2, float f3, boolean z) {
        float f4;
        String str2 = str;
        int i = 0;
        int i2 = 0;
        boolean z2 = false;
        int i3 = 0;
        float f5 = 0.0f;
        float f6 = 0.0f;
        float f7 = 0.0f;
        for (int i4 = 0; i4 < str.length(); i4++) {
            char charAt = str2.charAt(i4);
            if (z) {
                C8737d dVar = (C8737d) this.f25518N.mo7544c().get(C8737d.m32517c(charAt, cVar.mo24127a(), cVar.mo24129c()));
                if (dVar == null) {
                } else {
                    f4 = ((float) dVar.mo24133b()) * f2 * C5808j.m23377e();
                }
            } else {
                f4 = this.f25511G.measureText(str2.substring(i4, i4 + 1));
            }
            float f8 = f4 + f3;
            if (charAt == ' ') {
                z2 = true;
                f7 = f8;
            } else if (z2) {
                z2 = false;
                i3 = i4;
                f6 = f8;
            } else {
                f6 += f8;
            }
            f5 += f8;
            if (f > Utils.FLOAT_EPSILON && f5 >= f && charAt != ' ') {
                i++;
                C9184d Z = m33925Z(i);
                if (i3 == i2) {
                    String substring = str2.substring(i2, i4);
                    String trim = substring.trim();
                    Z.mo24786c(trim, (f5 - f8) - (((float) (trim.length() - substring.length())) * f7));
                    i2 = i4;
                    i3 = i2;
                    f5 = f8;
                    f6 = f5;
                } else {
                    String substring2 = str2.substring(i2, i3 - 1);
                    String trim2 = substring2.trim();
                    Z.mo24786c(trim2, ((f5 - f6) - (((float) (substring2.length() - trim2.length())) * f7)) - f7);
                    f5 = f6;
                    i2 = i3;
                }
            }
        }
        if (f5 > Utils.FLOAT_EPSILON) {
            i++;
            m33925Z(i).mo24786c(str2.substring(i2), f5);
        }
        return this.f25515K.subList(0, i);
    }

    /* renamed from: c */
    public void mo23470c(Object obj, C6015c cVar) {
        super.mo23470c(obj, cVar);
        if (obj == C2326h0.f7282a) {
            C8525a aVar = this.f25520P;
            if (aVar != null) {
                mo24747H(aVar);
            }
            if (cVar == null) {
                this.f25520P = null;
                return;
            }
            C8549q qVar = new C8549q(cVar);
            this.f25520P = qVar;
            qVar.mo23850a(this);
            mo24753i(this.f25520P);
        } else if (obj == C2326h0.f7283b) {
            C8525a aVar2 = this.f25522R;
            if (aVar2 != null) {
                mo24747H(aVar2);
            }
            if (cVar == null) {
                this.f25522R = null;
                return;
            }
            C8549q qVar2 = new C8549q(cVar);
            this.f25522R = qVar2;
            qVar2.mo23850a(this);
            mo24753i(this.f25522R);
        } else if (obj == C2326h0.f7300s) {
            C8525a aVar3 = this.f25524T;
            if (aVar3 != null) {
                mo24747H(aVar3);
            }
            if (cVar == null) {
                this.f25524T = null;
                return;
            }
            C8549q qVar3 = new C8549q(cVar);
            this.f25524T = qVar3;
            qVar3.mo23850a(this);
            mo24753i(this.f25524T);
        } else if (obj == C2326h0.f7301t) {
            C8525a aVar4 = this.f25526V;
            if (aVar4 != null) {
                mo24747H(aVar4);
            }
            if (cVar == null) {
                this.f25526V = null;
                return;
            }
            C8549q qVar4 = new C8549q(cVar);
            this.f25526V = qVar4;
            qVar4.mo23850a(this);
            mo24753i(this.f25526V);
        } else if (obj == C2326h0.f7272F) {
            C8525a aVar5 = this.f25527W;
            if (aVar5 != null) {
                mo24747H(aVar5);
            }
            if (cVar == null) {
                this.f25527W = null;
                return;
            }
            C8549q qVar5 = new C8549q(cVar);
            this.f25527W = qVar5;
            qVar5.mo23850a(this);
            mo24753i(this.f25527W);
        } else if (obj == C2326h0.f7279M) {
            C8525a aVar6 = this.f25528X;
            if (aVar6 != null) {
                mo24747H(aVar6);
            }
            if (cVar == null) {
                this.f25528X = null;
                return;
            }
            C8549q qVar6 = new C8549q(cVar);
            this.f25528X = qVar6;
            qVar6.mo23850a(this);
            mo24753i(this.f25528X);
        } else if (obj == C2326h0.f7281O) {
            this.f25516L.mo23902q(cVar);
        }
    }

    /* renamed from: e */
    public void mo23471e(RectF rectF, Matrix matrix, boolean z) {
        super.mo23471e(rectF, matrix, z);
        rectF.set(Utils.FLOAT_EPSILON, Utils.FLOAT_EPSILON, (float) this.f25518N.mo7543b().width(), (float) this.f25518N.mo7543b().height());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: t */
    public void mo24754t(Canvas canvas, Matrix matrix, int i) {
        C8734b bVar = (C8734b) this.f25516L.mo23856h();
        C8736c cVar = (C8736c) this.f25518N.mo7548g().get(bVar.f24566b);
        if (cVar != null) {
            canvas.save();
            canvas.concat(matrix);
            m33916Q(bVar, matrix);
            if (this.f25517M.mo7500b1()) {
                m33924Y(bVar, matrix, cVar, canvas);
            } else {
                m33923X(bVar, cVar, canvas);
            }
            canvas.restore();
        }
    }

    /* renamed from: z1.i$d */
    private static class C9184d {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public String f25532a;
        /* access modifiers changed from: private */

        /* renamed from: b */
        public float f25533b;

        private C9184d() {
            this.f25532a = "";
            this.f25533b = Utils.FLOAT_EPSILON;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public void mo24786c(String str, float f) {
            this.f25532a = str;
            this.f25533b = f;
        }

        /* synthetic */ C9184d(C9181a aVar) {
            this();
        }
    }
}
