package p255t1;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;
import com.airbnb.lottie.C2315d0;
import com.airbnb.lottie.C2326h0;
import java.util.List;
import p048d2.C5807i;
import p061e2.C6015c;
import p268u1.C8525a;
import p268u1.C8548p;
import p294w1.C8738e;
import p319y1.C9023l;
import p331z1.C9169b;

/* renamed from: t1.p */
public class C8326p implements C8313e, C8322m, C8318j, C8525a.C8527b, C8319k {

    /* renamed from: a */
    private final Matrix f23670a = new Matrix();

    /* renamed from: b */
    private final Path f23671b = new Path();

    /* renamed from: c */
    private final C2315d0 f23672c;

    /* renamed from: d */
    private final C9169b f23673d;

    /* renamed from: e */
    private final String f23674e;

    /* renamed from: f */
    private final boolean f23675f;

    /* renamed from: g */
    private final C8525a f23676g;

    /* renamed from: h */
    private final C8525a f23677h;

    /* renamed from: i */
    private final C8548p f23678i;

    /* renamed from: j */
    private C8312d f23679j;

    public C8326p(C2315d0 d0Var, C9169b bVar, C9023l lVar) {
        this.f23672c = d0Var;
        this.f23673d = bVar;
        this.f23674e = lVar.mo24473c();
        this.f23675f = lVar.mo24476f();
        C8525a a = lVar.mo24472b().mo24353a();
        this.f23676g = a;
        bVar.mo24753i(a);
        a.mo23850a(this);
        C8525a a2 = lVar.mo24474d().mo24353a();
        this.f23677h = a2;
        bVar.mo24753i(a2);
        a2.mo23850a(this);
        C8548p b = lVar.mo24475e().mo24360b();
        this.f23678i = b;
        b.mo23904a(bVar);
        b.mo23905b(this);
    }

    /* renamed from: a */
    public void mo23468a() {
        this.f23672c.invalidateSelf();
    }

    /* renamed from: b */
    public void mo23469b(List list, List list2) {
        this.f23679j.mo23469b(list, list2);
    }

    /* renamed from: c */
    public void mo23470c(Object obj, C6015c cVar) {
        if (!this.f23678i.mo23906c(obj, cVar)) {
            if (obj == C2326h0.f7302u) {
                this.f23676g.mo23862n(cVar);
            } else if (obj == C2326h0.f7303v) {
                this.f23677h.mo23862n(cVar);
            }
        }
    }

    /* renamed from: e */
    public void mo23471e(RectF rectF, Matrix matrix, boolean z) {
        this.f23679j.mo23471e(rectF, matrix, z);
    }

    /* renamed from: f */
    public void mo23472f(C8738e eVar, int i, List list, C8738e eVar2) {
        C5807i.m23372k(eVar, i, list, eVar2, this);
        for (int i2 = 0; i2 < this.f23679j.mo23477j().size(); i2++) {
            C8311c cVar = (C8311c) this.f23679j.mo23477j().get(i2);
            if (cVar instanceof C8319k) {
                C5807i.m23372k(eVar, i, list, eVar2, (C8319k) cVar);
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:3:0x0005 A[LOOP:0: B:3:0x0005->B:6:0x000f, LOOP_START] */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo23481g(java.util.ListIterator r9) {
        /*
            r8 = this;
            t1.d r0 = r8.f23679j
            if (r0 == 0) goto L_0x0005
            return
        L_0x0005:
            boolean r0 = r9.hasPrevious()
            if (r0 == 0) goto L_0x0012
            java.lang.Object r0 = r9.previous()
            if (r0 == r8) goto L_0x0012
            goto L_0x0005
        L_0x0012:
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
        L_0x0017:
            boolean r0 = r9.hasPrevious()
            if (r0 == 0) goto L_0x002a
            java.lang.Object r0 = r9.previous()
            t1.c r0 = (p255t1.C8311c) r0
            r6.add(r0)
            r9.remove()
            goto L_0x0017
        L_0x002a:
            java.util.Collections.reverse(r6)
            t1.d r9 = new t1.d
            com.airbnb.lottie.d0 r2 = r8.f23672c
            z1.b r3 = r8.f23673d
            java.lang.String r4 = "Repeater"
            boolean r5 = r8.f23675f
            r7 = 0
            r1 = r9
            r1.<init>(r2, r3, r4, r5, r6, r7)
            r8.f23679j = r9
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p255t1.C8326p.mo23481g(java.util.ListIterator):void");
    }

    public String getName() {
        return this.f23674e;
    }

    /* renamed from: h */
    public void mo23473h(Canvas canvas, Matrix matrix, int i) {
        float floatValue = ((Float) this.f23676g.mo23856h()).floatValue();
        float floatValue2 = ((Float) this.f23677h.mo23856h()).floatValue();
        float floatValue3 = ((Float) this.f23678i.mo23911i().mo23856h()).floatValue() / 100.0f;
        float floatValue4 = ((Float) this.f23678i.mo23907e().mo23856h()).floatValue() / 100.0f;
        for (int i2 = ((int) floatValue) - 1; i2 >= 0; i2--) {
            this.f23670a.set(matrix);
            float f = (float) i2;
            this.f23670a.preConcat(this.f23678i.mo23909g(f + floatValue2));
            this.f23679j.mo23473h(canvas, this.f23670a, (int) (((float) i) * C5807i.m23370i(floatValue3, floatValue4, f / floatValue)));
        }
    }

    /* renamed from: z */
    public Path mo23480z() {
        Path z = this.f23679j.mo23480z();
        this.f23671b.reset();
        float floatValue = ((Float) this.f23676g.mo23856h()).floatValue();
        float floatValue2 = ((Float) this.f23677h.mo23856h()).floatValue();
        for (int i = ((int) floatValue) - 1; i >= 0; i--) {
            this.f23670a.set(this.f23678i.mo23909g(((float) i) + floatValue2));
            this.f23671b.addPath(z, this.f23670a);
        }
        return this.f23671b;
    }
}
