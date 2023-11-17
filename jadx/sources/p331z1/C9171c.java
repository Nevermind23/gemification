package p331z1;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import androidx.collection.LongSparseArray;
import com.airbnb.lottie.C2311c;
import com.airbnb.lottie.C2315d0;
import com.airbnb.lottie.C2325h;
import com.airbnb.lottie.C2326h0;
import com.github.mikephil.charting.utils.Utils;
import java.util.ArrayList;
import java.util.List;
import p048d2.C5808j;
import p061e2.C6015c;
import p268u1.C8525a;
import p268u1.C8549q;
import p294w1.C8738e;
import p307x1.C8936b;

/* renamed from: z1.c */
public class C9171c extends C9169b {

    /* renamed from: D */
    private C8525a f25448D;

    /* renamed from: E */
    private final List f25449E = new ArrayList();

    /* renamed from: F */
    private final RectF f25450F = new RectF();

    /* renamed from: G */
    private final RectF f25451G = new RectF();

    /* renamed from: H */
    private final Paint f25452H = new Paint();

    /* renamed from: I */
    private boolean f25453I = true;

    /* renamed from: z1.c$a */
    static /* synthetic */ class C9172a {

        /* renamed from: a */
        static final /* synthetic */ int[] f25454a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        static {
            /*
                z1.e$b[] r0 = p331z1.C9174e.C9176b.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f25454a = r0
                z1.e$b r1 = p331z1.C9174e.C9176b.ADD     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f25454a     // Catch:{ NoSuchFieldError -> 0x001d }
                z1.e$b r1 = p331z1.C9174e.C9176b.INVERT     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p331z1.C9171c.C9172a.<clinit>():void");
        }
    }

    public C9171c(C2315d0 d0Var, C9174e eVar, List list, C2325h hVar) {
        super(d0Var, eVar);
        int i;
        C9169b bVar;
        C8936b u = eVar.mo24781u();
        if (u != null) {
            C8525a a = u.mo24353a();
            this.f25448D = a;
            mo24753i(a);
            this.f25448D.mo23850a(this);
        } else {
            this.f25448D = null;
        }
        LongSparseArray longSparseArray = new LongSparseArray(hVar.mo7552k().size());
        int size = list.size() - 1;
        C9169b bVar2 = null;
        while (true) {
            if (size < 0) {
                break;
            }
            C9174e eVar2 = (C9174e) list.get(size);
            C9169b u2 = C9169b.m33846u(this, eVar2, d0Var, hVar);
            if (u2 != null) {
                longSparseArray.put(u2.mo24758y().mo24763d(), u2);
                if (bVar2 != null) {
                    bVar2.mo24749J(u2);
                    bVar2 = null;
                } else {
                    this.f25449E.add(0, u2);
                    int i2 = C9172a.f25454a[eVar2.mo24767h().ordinal()];
                    if (i2 == 1 || i2 == 2) {
                        bVar2 = u2;
                    }
                }
            }
            size--;
        }
        for (i = 0; i < longSparseArray.size(); i++) {
            C9169b bVar3 = (C9169b) longSparseArray.get(longSparseArray.keyAt(i));
            if (!(bVar3 == null || (bVar = (C9169b) longSparseArray.get(bVar3.mo24758y().mo24769j())) == null)) {
                bVar3.mo24751L(bVar);
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: I */
    public void mo24748I(C8738e eVar, int i, List list, C8738e eVar2) {
        for (int i2 = 0; i2 < this.f25449E.size(); i2++) {
            ((C9169b) this.f25449E.get(i2)).mo23472f(eVar, i, list, eVar2);
        }
    }

    /* renamed from: K */
    public void mo24750K(boolean z) {
        super.mo24750K(z);
        for (C9169b K : this.f25449E) {
            K.mo24750K(z);
        }
    }

    /* renamed from: M */
    public void mo24752M(float f) {
        super.mo24752M(f);
        if (this.f25448D != null) {
            f = ((((Float) this.f25448D.mo23856h()).floatValue() * this.f25436q.mo24761b().mo7550i()) - this.f25436q.mo24761b().mo7557p()) / (this.f25435p.mo7461G().mo7546e() + 0.01f);
        }
        if (this.f25448D == null) {
            f -= this.f25436q.mo24777r();
        }
        if (this.f25436q.mo24782v() != Utils.FLOAT_EPSILON && !"__container".equals(this.f25436q.mo24768i())) {
            f /= this.f25436q.mo24782v();
        }
        for (int size = this.f25449E.size() - 1; size >= 0; size--) {
            ((C9169b) this.f25449E.get(size)).mo24752M(f);
        }
    }

    /* renamed from: P */
    public void mo24759P(boolean z) {
        this.f25453I = z;
    }

    /* renamed from: c */
    public void mo23470c(Object obj, C6015c cVar) {
        super.mo23470c(obj, cVar);
        if (obj != C2326h0.f7271E) {
            return;
        }
        if (cVar == null) {
            C8525a aVar = this.f25448D;
            if (aVar != null) {
                aVar.mo23862n((C6015c) null);
                return;
            }
            return;
        }
        C8549q qVar = new C8549q(cVar);
        this.f25448D = qVar;
        qVar.mo23850a(this);
        mo24753i(this.f25448D);
    }

    /* renamed from: e */
    public void mo23471e(RectF rectF, Matrix matrix, boolean z) {
        super.mo23471e(rectF, matrix, z);
        for (int size = this.f25449E.size() - 1; size >= 0; size--) {
            this.f25450F.set(Utils.FLOAT_EPSILON, Utils.FLOAT_EPSILON, Utils.FLOAT_EPSILON, Utils.FLOAT_EPSILON);
            ((C9169b) this.f25449E.get(size)).mo23471e(this.f25450F, this.f25434o, true);
            rectF.union(this.f25450F);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: t */
    public void mo24754t(Canvas canvas, Matrix matrix, int i) {
        boolean z;
        boolean z2;
        boolean z3;
        C2311c.m8884a("CompositionLayer#draw");
        this.f25451G.set(Utils.FLOAT_EPSILON, Utils.FLOAT_EPSILON, this.f25436q.mo24771l(), this.f25436q.mo24770k());
        matrix.mapRect(this.f25451G);
        if (!this.f25435p.mo7499b0() || this.f25449E.size() <= 1 || i == 255) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            this.f25452H.setAlpha(i);
            C5808j.m23385m(canvas, this.f25451G, this.f25452H);
        } else {
            canvas.save();
        }
        if (z) {
            i = 255;
        }
        for (int size = this.f25449E.size() - 1; size >= 0; size--) {
            if (this.f25453I || !"__container".equals(this.f25436q.mo24768i())) {
                z2 = false;
            } else {
                z2 = true;
            }
            if (z2 || this.f25451G.isEmpty()) {
                z3 = true;
            } else {
                z3 = canvas.clipRect(this.f25451G);
            }
            if (z3) {
                ((C9169b) this.f25449E.get(size)).mo23473h(canvas, matrix, i);
            }
        }
        canvas.restore();
        C2311c.m8885b("CompositionLayer#draw");
    }
}
