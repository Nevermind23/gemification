package p331z1;

import android.graphics.BlurMaskFilter;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.os.Build;
import com.airbnb.lottie.C2311c;
import com.airbnb.lottie.C2315d0;
import com.airbnb.lottie.C2325h;
import com.github.mikephil.charting.utils.Utils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p020b2.C2129j;
import p048d2.C5804f;
import p048d2.C5808j;
import p061e2.C6015c;
import p242s1.C8100a;
import p255t1.C8313e;
import p268u1.C8525a;
import p268u1.C8535d;
import p268u1.C8539h;
import p268u1.C8548p;
import p294w1.C8738e;
import p294w1.C8739f;
import p319y1.C9009a;
import p319y1.C9016h;
import p331z1.C9174e;

/* renamed from: z1.b */
public abstract class C9169b implements C8313e, C8525a.C8527b, C8739f {

    /* renamed from: A */
    private Paint f25417A;

    /* renamed from: B */
    float f25418B;

    /* renamed from: C */
    BlurMaskFilter f25419C;

    /* renamed from: a */
    private final Path f25420a = new Path();

    /* renamed from: b */
    private final Matrix f25421b = new Matrix();

    /* renamed from: c */
    private final Matrix f25422c = new Matrix();

    /* renamed from: d */
    private final Paint f25423d = new C8100a(1);

    /* renamed from: e */
    private final Paint f25424e = new C8100a(1, PorterDuff.Mode.DST_IN);

    /* renamed from: f */
    private final Paint f25425f = new C8100a(1, PorterDuff.Mode.DST_OUT);

    /* renamed from: g */
    private final Paint f25426g;

    /* renamed from: h */
    private final Paint f25427h;

    /* renamed from: i */
    private final RectF f25428i;

    /* renamed from: j */
    private final RectF f25429j;

    /* renamed from: k */
    private final RectF f25430k;

    /* renamed from: l */
    private final RectF f25431l;

    /* renamed from: m */
    private final RectF f25432m;

    /* renamed from: n */
    private final String f25433n;

    /* renamed from: o */
    final Matrix f25434o;

    /* renamed from: p */
    final C2315d0 f25435p;

    /* renamed from: q */
    final C9174e f25436q;

    /* renamed from: r */
    private C8539h f25437r;

    /* renamed from: s */
    private C8535d f25438s;

    /* renamed from: t */
    private C9169b f25439t;

    /* renamed from: u */
    private C9169b f25440u;

    /* renamed from: v */
    private List f25441v;

    /* renamed from: w */
    private final List f25442w;

    /* renamed from: x */
    final C8548p f25443x;

    /* renamed from: y */
    private boolean f25444y;

    /* renamed from: z */
    private boolean f25445z;

    /* renamed from: z1.b$a */
    static /* synthetic */ class C9170a {

        /* renamed from: a */
        static final /* synthetic */ int[] f25446a;

        /* renamed from: b */
        static final /* synthetic */ int[] f25447b;

        /* JADX WARNING: Can't wrap try/catch for region: R(23:0|(2:1|2)|3|(2:5|6)|7|9|10|11|(2:13|14)|15|17|18|19|20|21|22|23|24|25|26|27|28|(3:29|30|32)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(27:0|1|2|3|(2:5|6)|7|9|10|11|13|14|15|17|18|19|20|21|22|23|24|25|26|27|28|29|30|32) */
        /* JADX WARNING: Can't wrap try/catch for region: R(28:0|1|2|3|5|6|7|9|10|11|13|14|15|17|18|19|20|21|22|23|24|25|26|27|28|29|30|32) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x0044 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x004e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x0058 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:25:0x0062 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:27:0x006d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:29:0x0078 */
        static {
            /*
                y1.h$a[] r0 = p319y1.C9016h.C9017a.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f25447b = r0
                r1 = 1
                y1.h$a r2 = p319y1.C9016h.C9017a.MASK_MODE_NONE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                r0 = 2
                int[] r2 = f25447b     // Catch:{ NoSuchFieldError -> 0x001d }
                y1.h$a r3 = p319y1.C9016h.C9017a.MASK_MODE_SUBTRACT     // Catch:{ NoSuchFieldError -> 0x001d }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2[r3] = r0     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                r2 = 3
                int[] r3 = f25447b     // Catch:{ NoSuchFieldError -> 0x0028 }
                y1.h$a r4 = p319y1.C9016h.C9017a.MASK_MODE_INTERSECT     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r3[r4] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                r3 = 4
                int[] r4 = f25447b     // Catch:{ NoSuchFieldError -> 0x0033 }
                y1.h$a r5 = p319y1.C9016h.C9017a.MASK_MODE_ADD     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r4[r5] = r3     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                z1.e$a[] r4 = p331z1.C9174e.C9175a.values()
                int r4 = r4.length
                int[] r4 = new int[r4]
                f25446a = r4
                z1.e$a r5 = p331z1.C9174e.C9175a.SHAPE     // Catch:{ NoSuchFieldError -> 0x0044 }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x0044 }
                r4[r5] = r1     // Catch:{ NoSuchFieldError -> 0x0044 }
            L_0x0044:
                int[] r1 = f25446a     // Catch:{ NoSuchFieldError -> 0x004e }
                z1.e$a r4 = p331z1.C9174e.C9175a.PRE_COMP     // Catch:{ NoSuchFieldError -> 0x004e }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x004e }
                r1[r4] = r0     // Catch:{ NoSuchFieldError -> 0x004e }
            L_0x004e:
                int[] r0 = f25446a     // Catch:{ NoSuchFieldError -> 0x0058 }
                z1.e$a r1 = p331z1.C9174e.C9175a.SOLID     // Catch:{ NoSuchFieldError -> 0x0058 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0058 }
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0058 }
            L_0x0058:
                int[] r0 = f25446a     // Catch:{ NoSuchFieldError -> 0x0062 }
                z1.e$a r1 = p331z1.C9174e.C9175a.IMAGE     // Catch:{ NoSuchFieldError -> 0x0062 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0062 }
                r0[r1] = r3     // Catch:{ NoSuchFieldError -> 0x0062 }
            L_0x0062:
                int[] r0 = f25446a     // Catch:{ NoSuchFieldError -> 0x006d }
                z1.e$a r1 = p331z1.C9174e.C9175a.NULL     // Catch:{ NoSuchFieldError -> 0x006d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x006d }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x006d }
            L_0x006d:
                int[] r0 = f25446a     // Catch:{ NoSuchFieldError -> 0x0078 }
                z1.e$a r1 = p331z1.C9174e.C9175a.TEXT     // Catch:{ NoSuchFieldError -> 0x0078 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0078 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0078 }
            L_0x0078:
                int[] r0 = f25446a     // Catch:{ NoSuchFieldError -> 0x0083 }
                z1.e$a r1 = p331z1.C9174e.C9175a.UNKNOWN     // Catch:{ NoSuchFieldError -> 0x0083 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0083 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0083 }
            L_0x0083:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p331z1.C9169b.C9170a.<clinit>():void");
        }
    }

    C9169b(C2315d0 d0Var, C9174e eVar) {
        C8100a aVar = new C8100a(1);
        this.f25426g = aVar;
        this.f25427h = new C8100a(PorterDuff.Mode.CLEAR);
        this.f25428i = new RectF();
        this.f25429j = new RectF();
        this.f25430k = new RectF();
        this.f25431l = new RectF();
        this.f25432m = new RectF();
        this.f25434o = new Matrix();
        this.f25442w = new ArrayList();
        this.f25444y = true;
        this.f25418B = Utils.FLOAT_EPSILON;
        this.f25435p = d0Var;
        this.f25436q = eVar;
        this.f25433n = eVar.mo24768i() + "#draw";
        if (eVar.mo24767h() == C9174e.C9176b.INVERT) {
            aVar.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        } else {
            aVar.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_IN));
        }
        C8548p b = eVar.mo24783w().mo24360b();
        this.f25443x = b;
        b.mo23905b(this);
        if (eVar.mo24766g() != null && !eVar.mo24766g().isEmpty()) {
            C8539h hVar = new C8539h(eVar.mo24766g());
            this.f25437r = hVar;
            for (C8525a a : hVar.mo23886a()) {
                a.mo23850a(this);
            }
            for (C8525a aVar2 : this.f25437r.mo23888c()) {
                mo24753i(aVar2);
                aVar2.mo23850a(this);
            }
        }
        m33834O();
    }

    /* renamed from: C */
    private void m33828C(RectF rectF, Matrix matrix) {
        this.f25430k.set(Utils.FLOAT_EPSILON, Utils.FLOAT_EPSILON, Utils.FLOAT_EPSILON, Utils.FLOAT_EPSILON);
        if (mo24745A()) {
            int size = this.f25437r.mo23887b().size();
            for (int i = 0; i < size; i++) {
                C9016h hVar = (C9016h) this.f25437r.mo23887b().get(i);
                Path path = (Path) ((C8525a) this.f25437r.mo23886a().get(i)).mo23856h();
                if (path != null) {
                    this.f25420a.set(path);
                    this.f25420a.transform(matrix);
                    int i2 = C9170a.f25447b[hVar.mo24447a().ordinal()];
                    if (i2 != 1 && i2 != 2) {
                        if ((i2 != 3 && i2 != 4) || !hVar.mo24450d()) {
                            this.f25420a.computeBounds(this.f25432m, false);
                            if (i == 0) {
                                this.f25430k.set(this.f25432m);
                            } else {
                                RectF rectF2 = this.f25430k;
                                rectF2.set(Math.min(rectF2.left, this.f25432m.left), Math.min(this.f25430k.top, this.f25432m.top), Math.max(this.f25430k.right, this.f25432m.right), Math.max(this.f25430k.bottom, this.f25432m.bottom));
                            }
                        } else {
                            return;
                        }
                    } else {
                        return;
                    }
                }
            }
            if (!rectF.intersect(this.f25430k)) {
                rectF.set(Utils.FLOAT_EPSILON, Utils.FLOAT_EPSILON, Utils.FLOAT_EPSILON, Utils.FLOAT_EPSILON);
            }
        }
    }

    /* renamed from: D */
    private void m33829D(RectF rectF, Matrix matrix) {
        if (mo24746B() && this.f25436q.mo24767h() != C9174e.C9176b.INVERT) {
            this.f25431l.set(Utils.FLOAT_EPSILON, Utils.FLOAT_EPSILON, Utils.FLOAT_EPSILON, Utils.FLOAT_EPSILON);
            this.f25439t.mo23471e(this.f25431l, matrix, true);
            if (!rectF.intersect(this.f25431l)) {
                rectF.set(Utils.FLOAT_EPSILON, Utils.FLOAT_EPSILON, Utils.FLOAT_EPSILON, Utils.FLOAT_EPSILON);
            }
        }
    }

    /* renamed from: E */
    private void m33830E() {
        this.f25435p.invalidateSelf();
    }

    /* access modifiers changed from: private */
    /* renamed from: F */
    public /* synthetic */ void m33831F() {
        m33833N(this.f25438s.mo23879p() == 1.0f);
    }

    /* renamed from: G */
    private void m33832G(float f) {
        this.f25435p.mo7461G().mo7555n().mo7578a(this.f25436q.mo24768i(), f);
    }

    /* renamed from: N */
    private void m33833N(boolean z) {
        if (z != this.f25444y) {
            this.f25444y = z;
            m33830E();
        }
    }

    /* renamed from: O */
    private void m33834O() {
        boolean z = true;
        if (!this.f25436q.mo24764e().isEmpty()) {
            C8535d dVar = new C8535d(this.f25436q.mo24764e());
            this.f25438s = dVar;
            dVar.mo23860l();
            this.f25438s.mo23850a(new C9168a(this));
            if (((Float) this.f25438s.mo23856h()).floatValue() != 1.0f) {
                z = false;
            }
            m33833N(z);
            mo24753i(this.f25438s);
            return;
        }
        m33833N(true);
    }

    /* renamed from: j */
    private void m33836j(Canvas canvas, Matrix matrix, C8525a aVar, C8525a aVar2) {
        this.f25420a.set((Path) aVar.mo23856h());
        this.f25420a.transform(matrix);
        this.f25423d.setAlpha((int) (((float) ((Integer) aVar2.mo23856h()).intValue()) * 2.55f));
        canvas.drawPath(this.f25420a, this.f25423d);
    }

    /* renamed from: k */
    private void m33837k(Canvas canvas, Matrix matrix, C8525a aVar, C8525a aVar2) {
        C5808j.m23385m(canvas, this.f25428i, this.f25424e);
        this.f25420a.set((Path) aVar.mo23856h());
        this.f25420a.transform(matrix);
        this.f25423d.setAlpha((int) (((float) ((Integer) aVar2.mo23856h()).intValue()) * 2.55f));
        canvas.drawPath(this.f25420a, this.f25423d);
        canvas.restore();
    }

    /* renamed from: l */
    private void m33838l(Canvas canvas, Matrix matrix, C8525a aVar, C8525a aVar2) {
        C5808j.m23385m(canvas, this.f25428i, this.f25423d);
        canvas.drawRect(this.f25428i, this.f25423d);
        this.f25420a.set((Path) aVar.mo23856h());
        this.f25420a.transform(matrix);
        this.f25423d.setAlpha((int) (((float) ((Integer) aVar2.mo23856h()).intValue()) * 2.55f));
        canvas.drawPath(this.f25420a, this.f25425f);
        canvas.restore();
    }

    /* renamed from: m */
    private void m33839m(Canvas canvas, Matrix matrix, C8525a aVar, C8525a aVar2) {
        C5808j.m23385m(canvas, this.f25428i, this.f25424e);
        canvas.drawRect(this.f25428i, this.f25423d);
        this.f25425f.setAlpha((int) (((float) ((Integer) aVar2.mo23856h()).intValue()) * 2.55f));
        this.f25420a.set((Path) aVar.mo23856h());
        this.f25420a.transform(matrix);
        canvas.drawPath(this.f25420a, this.f25425f);
        canvas.restore();
    }

    /* renamed from: n */
    private void m33840n(Canvas canvas, Matrix matrix, C8525a aVar, C8525a aVar2) {
        C5808j.m23385m(canvas, this.f25428i, this.f25425f);
        canvas.drawRect(this.f25428i, this.f25423d);
        this.f25425f.setAlpha((int) (((float) ((Integer) aVar2.mo23856h()).intValue()) * 2.55f));
        this.f25420a.set((Path) aVar.mo23856h());
        this.f25420a.transform(matrix);
        canvas.drawPath(this.f25420a, this.f25425f);
        canvas.restore();
    }

    /* renamed from: o */
    private void m33841o(Canvas canvas, Matrix matrix) {
        C2311c.m8884a("Layer#saveLayer");
        C5808j.m23386n(canvas, this.f25428i, this.f25424e, 19);
        if (Build.VERSION.SDK_INT < 28) {
            m33845s(canvas);
        }
        C2311c.m8885b("Layer#saveLayer");
        for (int i = 0; i < this.f25437r.mo23887b().size(); i++) {
            C9016h hVar = (C9016h) this.f25437r.mo23887b().get(i);
            C8525a aVar = (C8525a) this.f25437r.mo23886a().get(i);
            C8525a aVar2 = (C8525a) this.f25437r.mo23888c().get(i);
            int i2 = C9170a.f25447b[hVar.mo24447a().ordinal()];
            if (i2 != 1) {
                if (i2 == 2) {
                    if (i == 0) {
                        this.f25423d.setColor(-16777216);
                        this.f25423d.setAlpha(C11051p3.f31759c);
                        canvas.drawRect(this.f25428i, this.f25423d);
                    }
                    if (hVar.mo24450d()) {
                        m33840n(canvas, matrix, aVar, aVar2);
                    } else {
                        m33842p(canvas, matrix, aVar);
                    }
                } else if (i2 != 3) {
                    if (i2 == 4) {
                        if (hVar.mo24450d()) {
                            m33838l(canvas, matrix, aVar, aVar2);
                        } else {
                            m33836j(canvas, matrix, aVar, aVar2);
                        }
                    }
                } else if (hVar.mo24450d()) {
                    m33839m(canvas, matrix, aVar, aVar2);
                } else {
                    m33837k(canvas, matrix, aVar, aVar2);
                }
            } else if (m33843q()) {
                this.f25423d.setAlpha(C11051p3.f31759c);
                canvas.drawRect(this.f25428i, this.f25423d);
            }
        }
        C2311c.m8884a("Layer#restoreLayer");
        canvas.restore();
        C2311c.m8885b("Layer#restoreLayer");
    }

    /* renamed from: p */
    private void m33842p(Canvas canvas, Matrix matrix, C8525a aVar) {
        this.f25420a.set((Path) aVar.mo23856h());
        this.f25420a.transform(matrix);
        canvas.drawPath(this.f25420a, this.f25425f);
    }

    /* renamed from: q */
    private boolean m33843q() {
        if (this.f25437r.mo23886a().isEmpty()) {
            return false;
        }
        for (int i = 0; i < this.f25437r.mo23887b().size(); i++) {
            if (((C9016h) this.f25437r.mo23887b().get(i)).mo24447a() != C9016h.C9017a.MASK_MODE_NONE) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: r */
    private void m33844r() {
        if (this.f25441v == null) {
            if (this.f25440u == null) {
                this.f25441v = Collections.emptyList();
                return;
            }
            this.f25441v = new ArrayList();
            for (C9169b bVar = this.f25440u; bVar != null; bVar = bVar.f25440u) {
                this.f25441v.add(bVar);
            }
        }
    }

    /* renamed from: s */
    private void m33845s(Canvas canvas) {
        C2311c.m8884a("Layer#clearLayer");
        RectF rectF = this.f25428i;
        canvas.drawRect(rectF.left - 1.0f, rectF.top - 1.0f, rectF.right + 1.0f, rectF.bottom + 1.0f, this.f25427h);
        C2311c.m8885b("Layer#clearLayer");
    }

    /* renamed from: u */
    static C9169b m33846u(C9171c cVar, C9174e eVar, C2315d0 d0Var, C2325h hVar) {
        switch (C9170a.f25446a[eVar.mo24765f().ordinal()]) {
            case 1:
                return new C9178g(d0Var, eVar, cVar, hVar);
            case 2:
                return new C9171c(d0Var, eVar, hVar.mo7556o(eVar.mo24772m()), hVar);
            case 3:
                return new C9179h(d0Var, eVar);
            case 4:
                return new C9173d(d0Var, eVar);
            case 5:
                return new C9177f(d0Var, eVar);
            case 6:
                return new C9180i(d0Var, eVar);
            default:
                C5804f.m23334c("Unknown layer type " + eVar.mo24765f());
                return null;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: A */
    public boolean mo24745A() {
        C8539h hVar = this.f25437r;
        return hVar != null && !hVar.mo23886a().isEmpty();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: B */
    public boolean mo24746B() {
        return this.f25439t != null;
    }

    /* renamed from: H */
    public void mo24747H(C8525a aVar) {
        this.f25442w.remove(aVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: I */
    public void mo24748I(C8738e eVar, int i, List list, C8738e eVar2) {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: J */
    public void mo24749J(C9169b bVar) {
        this.f25439t = bVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: K */
    public void mo24750K(boolean z) {
        if (z && this.f25417A == null) {
            this.f25417A = new C8100a();
        }
        this.f25445z = z;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: L */
    public void mo24751L(C9169b bVar) {
        this.f25440u = bVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: M */
    public void mo24752M(float f) {
        this.f25443x.mo23912j(f);
        if (this.f25437r != null) {
            for (int i = 0; i < this.f25437r.mo23886a().size(); i++) {
                ((C8525a) this.f25437r.mo23886a().get(i)).mo23861m(f);
            }
        }
        C8535d dVar = this.f25438s;
        if (dVar != null) {
            dVar.mo23861m(f);
        }
        C9169b bVar = this.f25439t;
        if (bVar != null) {
            bVar.mo24752M(f);
        }
        for (int i2 = 0; i2 < this.f25442w.size(); i2++) {
            ((C8525a) this.f25442w.get(i2)).mo23861m(f);
        }
    }

    /* renamed from: a */
    public void mo23468a() {
        m33830E();
    }

    /* renamed from: b */
    public void mo23469b(List list, List list2) {
    }

    /* renamed from: c */
    public void mo23470c(Object obj, C6015c cVar) {
        this.f25443x.mo23906c(obj, cVar);
    }

    /* renamed from: e */
    public void mo23471e(RectF rectF, Matrix matrix, boolean z) {
        this.f25428i.set(Utils.FLOAT_EPSILON, Utils.FLOAT_EPSILON, Utils.FLOAT_EPSILON, Utils.FLOAT_EPSILON);
        m33844r();
        this.f25434o.set(matrix);
        if (z) {
            List list = this.f25441v;
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    this.f25434o.preConcat(((C9169b) this.f25441v.get(size)).f25443x.mo23908f());
                }
            } else {
                C9169b bVar = this.f25440u;
                if (bVar != null) {
                    this.f25434o.preConcat(bVar.f25443x.mo23908f());
                }
            }
        }
        this.f25434o.preConcat(this.f25443x.mo23908f());
    }

    /* renamed from: f */
    public void mo23472f(C8738e eVar, int i, List list, C8738e eVar2) {
        C9169b bVar = this.f25439t;
        if (bVar != null) {
            C8738e a = eVar2.mo24135a(bVar.getName());
            if (eVar.mo24136c(this.f25439t.getName(), i)) {
                list.add(a.mo24143i(this.f25439t));
            }
            if (eVar.mo24141h(getName(), i)) {
                this.f25439t.mo24748I(eVar, eVar.mo24138e(this.f25439t.getName(), i) + i, list, a);
            }
        }
        if (eVar.mo24140g(getName(), i)) {
            if (!"__container".equals(getName())) {
                eVar2 = eVar2.mo24135a(getName());
                if (eVar.mo24136c(getName(), i)) {
                    list.add(eVar2.mo24143i(this));
                }
            }
            if (eVar.mo24141h(getName(), i)) {
                mo24748I(eVar, i + eVar.mo24138e(getName(), i), list, eVar2);
            }
        }
    }

    public String getName() {
        return this.f25436q.mo24768i();
    }

    /* renamed from: h */
    public void mo23473h(Canvas canvas, Matrix matrix, int i) {
        int i2;
        Paint paint;
        Integer num;
        C2311c.m8884a(this.f25433n);
        if (!this.f25444y || this.f25436q.mo24784x()) {
            C2311c.m8885b(this.f25433n);
            return;
        }
        m33844r();
        C2311c.m8884a("Layer#parentMatrix");
        this.f25421b.reset();
        this.f25421b.set(matrix);
        for (int size = this.f25441v.size() - 1; size >= 0; size--) {
            this.f25421b.preConcat(((C9169b) this.f25441v.get(size)).f25443x.mo23908f());
        }
        C2311c.m8885b("Layer#parentMatrix");
        C8525a h = this.f25443x.mo23910h();
        if (h == null || (num = (Integer) h.mo23856h()) == null) {
            i2 = 100;
        } else {
            i2 = num.intValue();
        }
        int i3 = (int) ((((((float) i) / 255.0f) * ((float) i2)) / 100.0f) * 255.0f);
        if (mo24746B() || mo24745A()) {
            C2311c.m8884a("Layer#computeBounds");
            mo23471e(this.f25428i, this.f25421b, false);
            m33829D(this.f25428i, matrix);
            this.f25421b.preConcat(this.f25443x.mo23908f());
            m33828C(this.f25428i, this.f25421b);
            this.f25429j.set(Utils.FLOAT_EPSILON, Utils.FLOAT_EPSILON, (float) canvas.getWidth(), (float) canvas.getHeight());
            canvas.getMatrix(this.f25422c);
            if (!this.f25422c.isIdentity()) {
                Matrix matrix2 = this.f25422c;
                matrix2.invert(matrix2);
                this.f25422c.mapRect(this.f25429j);
            }
            if (!this.f25428i.intersect(this.f25429j)) {
                this.f25428i.set(Utils.FLOAT_EPSILON, Utils.FLOAT_EPSILON, Utils.FLOAT_EPSILON, Utils.FLOAT_EPSILON);
            }
            C2311c.m8885b("Layer#computeBounds");
            if (this.f25428i.width() >= 1.0f && this.f25428i.height() >= 1.0f) {
                C2311c.m8884a("Layer#saveLayer");
                this.f25423d.setAlpha(C11051p3.f31759c);
                C5808j.m23385m(canvas, this.f25428i, this.f25423d);
                C2311c.m8885b("Layer#saveLayer");
                m33845s(canvas);
                C2311c.m8884a("Layer#drawLayer");
                mo24754t(canvas, this.f25421b, i3);
                C2311c.m8885b("Layer#drawLayer");
                if (mo24745A()) {
                    m33841o(canvas, this.f25421b);
                }
                if (mo24746B()) {
                    C2311c.m8884a("Layer#drawMatte");
                    C2311c.m8884a("Layer#saveLayer");
                    C5808j.m23386n(canvas, this.f25428i, this.f25426g, 19);
                    C2311c.m8885b("Layer#saveLayer");
                    m33845s(canvas);
                    this.f25439t.mo23473h(canvas, matrix, i3);
                    C2311c.m8884a("Layer#restoreLayer");
                    canvas.restore();
                    C2311c.m8885b("Layer#restoreLayer");
                    C2311c.m8885b("Layer#drawMatte");
                }
                C2311c.m8884a("Layer#restoreLayer");
                canvas.restore();
                C2311c.m8885b("Layer#restoreLayer");
            }
            if (this.f25445z && (paint = this.f25417A) != null) {
                paint.setStyle(Paint.Style.STROKE);
                this.f25417A.setColor(-251901);
                this.f25417A.setStrokeWidth(4.0f);
                canvas.drawRect(this.f25428i, this.f25417A);
                this.f25417A.setStyle(Paint.Style.FILL);
                this.f25417A.setColor(1357638635);
                canvas.drawRect(this.f25428i, this.f25417A);
            }
            m33832G(C2311c.m8885b(this.f25433n));
            return;
        }
        this.f25421b.preConcat(this.f25443x.mo23908f());
        C2311c.m8884a("Layer#drawLayer");
        mo24754t(canvas, this.f25421b, i3);
        C2311c.m8885b("Layer#drawLayer");
        m33832G(C2311c.m8885b(this.f25433n));
    }

    /* renamed from: i */
    public void mo24753i(C8525a aVar) {
        if (aVar != null) {
            this.f25442w.add(aVar);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: t */
    public abstract void mo24754t(Canvas canvas, Matrix matrix, int i);

    /* renamed from: v */
    public C9009a mo24755v() {
        return this.f25436q.mo24760a();
    }

    /* renamed from: w */
    public BlurMaskFilter mo24756w(float f) {
        if (this.f25418B == f) {
            return this.f25419C;
        }
        BlurMaskFilter blurMaskFilter = new BlurMaskFilter(f / 2.0f, BlurMaskFilter.Blur.NORMAL);
        this.f25419C = blurMaskFilter;
        this.f25418B = f;
        return blurMaskFilter;
    }

    /* renamed from: x */
    public C2129j mo24757x() {
        return this.f25436q.mo24762c();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: y */
    public C9174e mo24758y() {
        return this.f25436q;
    }
}
