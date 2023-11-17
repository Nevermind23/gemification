package p255t1;

import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import com.airbnb.lottie.C2315d0;
import com.airbnb.lottie.C2326h0;
import com.github.mikephil.charting.utils.Utils;
import java.util.List;
import p048d2.C5807i;
import p061e2.C6015c;
import p268u1.C8525a;
import p268u1.C8535d;
import p294w1.C8738e;
import p319y1.C9022k;
import p319y1.C9033s;
import p331z1.C9169b;

/* renamed from: t1.o */
public class C8325o implements C8525a.C8527b, C8319k, C8322m {

    /* renamed from: a */
    private final Path f23659a = new Path();

    /* renamed from: b */
    private final RectF f23660b = new RectF();

    /* renamed from: c */
    private final String f23661c;

    /* renamed from: d */
    private final boolean f23662d;

    /* renamed from: e */
    private final C2315d0 f23663e;

    /* renamed from: f */
    private final C8525a f23664f;

    /* renamed from: g */
    private final C8525a f23665g;

    /* renamed from: h */
    private final C8525a f23666h;

    /* renamed from: i */
    private final C8310b f23667i = new C8310b();

    /* renamed from: j */
    private C8525a f23668j = null;

    /* renamed from: k */
    private boolean f23669k;

    public C8325o(C2315d0 d0Var, C9169b bVar, C9022k kVar) {
        this.f23661c = kVar.mo24467c();
        this.f23662d = kVar.mo24470f();
        this.f23663e = d0Var;
        C8525a a = kVar.mo24468d().mo24353a();
        this.f23664f = a;
        C8525a a2 = kVar.mo24469e().mo24353a();
        this.f23665g = a2;
        C8525a a3 = kVar.mo24466b().mo24353a();
        this.f23666h = a3;
        bVar.mo24753i(a);
        bVar.mo24753i(a2);
        bVar.mo24753i(a3);
        a.mo23850a(this);
        a2.mo23850a(this);
        a3.mo23850a(this);
    }

    /* renamed from: g */
    private void m31252g() {
        this.f23669k = false;
        this.f23663e.invalidateSelf();
    }

    /* renamed from: a */
    public void mo23468a() {
        m31252g();
    }

    /* renamed from: b */
    public void mo23469b(List list, List list2) {
        for (int i = 0; i < list.size(); i++) {
            C8311c cVar = (C8311c) list.get(i);
            if (cVar instanceof C8331u) {
                C8331u uVar = (C8331u) cVar;
                if (uVar.mo23488j() == C9033s.C9034a.SIMULTANEOUSLY) {
                    this.f23667i.mo23474a(uVar);
                    uVar.mo23484c(this);
                }
            }
            if (cVar instanceof C8327q) {
                this.f23668j = ((C8327q) cVar).mo23483g();
            }
        }
    }

    /* renamed from: c */
    public void mo23470c(Object obj, C6015c cVar) {
        if (obj == C2326h0.f7293l) {
            this.f23665g.mo23862n(cVar);
        } else if (obj == C2326h0.f7295n) {
            this.f23664f.mo23862n(cVar);
        } else if (obj == C2326h0.f7294m) {
            this.f23666h.mo23862n(cVar);
        }
    }

    /* renamed from: f */
    public void mo23472f(C8738e eVar, int i, List list, C8738e eVar2) {
        C5807i.m23372k(eVar, i, list, eVar2, this);
    }

    public String getName() {
        return this.f23661c;
    }

    /* renamed from: z */
    public Path mo23480z() {
        float f;
        C8525a aVar;
        if (this.f23669k) {
            return this.f23659a;
        }
        this.f23659a.reset();
        if (this.f23662d) {
            this.f23669k = true;
            return this.f23659a;
        }
        PointF pointF = (PointF) this.f23665g.mo23856h();
        float f2 = pointF.x / 2.0f;
        float f3 = pointF.y / 2.0f;
        C8525a aVar2 = this.f23666h;
        if (aVar2 == null) {
            f = 0.0f;
        } else {
            f = ((C8535d) aVar2).mo23879p();
        }
        if (f == Utils.FLOAT_EPSILON && (aVar = this.f23668j) != null) {
            f = Math.min(((Float) aVar.mo23856h()).floatValue(), Math.min(f2, f3));
        }
        float min = Math.min(f2, f3);
        if (f > min) {
            f = min;
        }
        PointF pointF2 = (PointF) this.f23664f.mo23856h();
        this.f23659a.moveTo(pointF2.x + f2, (pointF2.y - f3) + f);
        this.f23659a.lineTo(pointF2.x + f2, (pointF2.y + f3) - f);
        int i = (f > Utils.FLOAT_EPSILON ? 1 : (f == Utils.FLOAT_EPSILON ? 0 : -1));
        if (i > 0) {
            RectF rectF = this.f23660b;
            float f4 = pointF2.x;
            float f5 = f * 2.0f;
            float f6 = pointF2.y;
            rectF.set((f4 + f2) - f5, (f6 + f3) - f5, f4 + f2, f6 + f3);
            this.f23659a.arcTo(this.f23660b, Utils.FLOAT_EPSILON, 90.0f, false);
        }
        this.f23659a.lineTo((pointF2.x - f2) + f, pointF2.y + f3);
        if (i > 0) {
            RectF rectF2 = this.f23660b;
            float f7 = pointF2.x;
            float f8 = pointF2.y;
            float f9 = f * 2.0f;
            rectF2.set(f7 - f2, (f8 + f3) - f9, (f7 - f2) + f9, f8 + f3);
            this.f23659a.arcTo(this.f23660b, 90.0f, 90.0f, false);
        }
        this.f23659a.lineTo(pointF2.x - f2, (pointF2.y - f3) + f);
        if (i > 0) {
            RectF rectF3 = this.f23660b;
            float f12 = pointF2.x;
            float f13 = pointF2.y;
            float f14 = f * 2.0f;
            rectF3.set(f12 - f2, f13 - f3, (f12 - f2) + f14, (f13 - f3) + f14);
            this.f23659a.arcTo(this.f23660b, 180.0f, 90.0f, false);
        }
        this.f23659a.lineTo((pointF2.x + f2) - f, pointF2.y - f3);
        if (i > 0) {
            RectF rectF4 = this.f23660b;
            float f15 = pointF2.x;
            float f16 = f * 2.0f;
            float f17 = pointF2.y;
            rectF4.set((f15 + f2) - f16, f17 - f3, f15 + f2, (f17 - f3) + f16);
            this.f23659a.arcTo(this.f23660b, 270.0f, 90.0f, false);
        }
        this.f23659a.close();
        this.f23667i.mo23475b(this.f23659a);
        this.f23669k = true;
        return this.f23659a;
    }
}
