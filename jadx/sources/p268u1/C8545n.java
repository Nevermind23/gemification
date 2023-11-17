package p268u1;

import android.graphics.PointF;
import com.github.mikephil.charting.utils.Utils;
import java.util.Collections;
import p061e2.C6013a;
import p061e2.C6015c;
import p268u1.C8525a;

/* renamed from: u1.n */
public class C8545n extends C8525a {

    /* renamed from: i */
    private final PointF f24265i = new PointF();

    /* renamed from: j */
    private final PointF f24266j = new PointF();

    /* renamed from: k */
    private final C8525a f24267k;

    /* renamed from: l */
    private final C8525a f24268l;

    /* renamed from: m */
    protected C6015c f24269m;

    /* renamed from: n */
    protected C6015c f24270n;

    public C8545n(C8525a aVar, C8525a aVar2) {
        super(Collections.emptyList());
        this.f24267k = aVar;
        this.f24268l = aVar2;
        mo23861m(mo23855f());
    }

    /* renamed from: m */
    public void mo23861m(float f) {
        this.f24267k.mo23861m(f);
        this.f24268l.mo23861m(f);
        this.f24265i.set(((Float) this.f24267k.mo23856h()).floatValue(), ((Float) this.f24268l.mo23856h()).floatValue());
        for (int i = 0; i < this.f24227a.size(); i++) {
            ((C8525a.C8527b) this.f24227a.get(i)).mo23468a();
        }
    }

    /* renamed from: p */
    public PointF mo23856h() {
        return mo23857i((C6013a) null, Utils.FLOAT_EPSILON);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v4, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v9, resolved type: java.lang.Float} */
    /* access modifiers changed from: package-private */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: q */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.graphics.PointF mo23857i(p061e2.C6013a r11, float r12) {
        /*
            r10 = this;
            e2.c r11 = r10.f24269m
            r0 = 0
            if (r11 == 0) goto L_0x0035
            u1.a r11 = r10.f24267k
            e2.a r11 = r11.mo23851b()
            if (r11 == 0) goto L_0x0035
            u1.a r1 = r10.f24267k
            float r9 = r1.mo23853d()
            java.lang.Float r1 = r11.f18765h
            e2.c r2 = r10.f24269m
            float r3 = r11.f18764g
            if (r1 != 0) goto L_0x001d
            r4 = r3
            goto L_0x0022
        L_0x001d:
            float r1 = r1.floatValue()
            r4 = r1
        L_0x0022:
            java.lang.Object r1 = r11.f18759b
            r5 = r1
            java.lang.Float r5 = (java.lang.Float) r5
            java.lang.Object r11 = r11.f18760c
            r6 = r11
            java.lang.Float r6 = (java.lang.Float) r6
            r7 = r12
            r8 = r12
            java.lang.Object r11 = r2.mo19504b(r3, r4, r5, r6, r7, r8, r9)
            java.lang.Float r11 = (java.lang.Float) r11
            goto L_0x0036
        L_0x0035:
            r11 = r0
        L_0x0036:
            e2.c r1 = r10.f24270n
            if (r1 == 0) goto L_0x006a
            u1.a r1 = r10.f24268l
            e2.a r1 = r1.mo23851b()
            if (r1 == 0) goto L_0x006a
            u1.a r0 = r10.f24268l
            float r9 = r0.mo23853d()
            java.lang.Float r0 = r1.f18765h
            e2.c r2 = r10.f24270n
            float r3 = r1.f18764g
            if (r0 != 0) goto L_0x0052
            r4 = r3
            goto L_0x0057
        L_0x0052:
            float r0 = r0.floatValue()
            r4 = r0
        L_0x0057:
            java.lang.Object r0 = r1.f18759b
            r5 = r0
            java.lang.Float r5 = (java.lang.Float) r5
            java.lang.Object r0 = r1.f18760c
            r6 = r0
            java.lang.Float r6 = (java.lang.Float) r6
            r7 = r12
            r8 = r12
            java.lang.Object r12 = r2.mo19504b(r3, r4, r5, r6, r7, r8, r9)
            r0 = r12
            java.lang.Float r0 = (java.lang.Float) r0
        L_0x006a:
            r12 = 0
            if (r11 != 0) goto L_0x0077
            android.graphics.PointF r11 = r10.f24266j
            android.graphics.PointF r1 = r10.f24265i
            float r1 = r1.x
            r11.set(r1, r12)
            goto L_0x0080
        L_0x0077:
            android.graphics.PointF r1 = r10.f24266j
            float r11 = r11.floatValue()
            r1.set(r11, r12)
        L_0x0080:
            if (r0 != 0) goto L_0x008e
            android.graphics.PointF r11 = r10.f24266j
            float r12 = r11.x
            android.graphics.PointF r0 = r10.f24265i
            float r0 = r0.y
            r11.set(r12, r0)
            goto L_0x0099
        L_0x008e:
            android.graphics.PointF r11 = r10.f24266j
            float r12 = r11.x
            float r0 = r0.floatValue()
            r11.set(r12, r0)
        L_0x0099:
            android.graphics.PointF r11 = r10.f24266j
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: p268u1.C8545n.mo23857i(e2.a, float):android.graphics.PointF");
    }

    /* renamed from: r */
    public void mo23899r(C6015c cVar) {
        C6015c cVar2 = this.f24269m;
        if (cVar2 != null) {
            cVar2.mo19505c((C8525a) null);
        }
        this.f24269m = cVar;
        if (cVar != null) {
            cVar.mo19505c(this);
        }
    }

    /* renamed from: s */
    public void mo23900s(C6015c cVar) {
        C6015c cVar2 = this.f24270n;
        if (cVar2 != null) {
            cVar2.mo19505c((C8525a) null);
        }
        this.f24270n = cVar;
        if (cVar != null) {
            cVar.mo19505c(this);
        }
    }
}
