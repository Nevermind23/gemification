package p255t1;

import android.graphics.Path;
import android.graphics.PointF;
import com.airbnb.lottie.C2315d0;
import com.airbnb.lottie.C2326h0;
import com.github.mikephil.charting.utils.Utils;
import java.util.List;
import p048d2.C5807i;
import p061e2.C6015c;
import p268u1.C8525a;
import p294w1.C8738e;
import p319y1.C9010b;
import p319y1.C9033s;
import p331z1.C9169b;

/* renamed from: t1.f */
public class C8314f implements C8322m, C8525a.C8527b, C8319k {

    /* renamed from: a */
    private final Path f23583a = new Path();

    /* renamed from: b */
    private final String f23584b;

    /* renamed from: c */
    private final C2315d0 f23585c;

    /* renamed from: d */
    private final C8525a f23586d;

    /* renamed from: e */
    private final C8525a f23587e;

    /* renamed from: f */
    private final C9010b f23588f;

    /* renamed from: g */
    private final C8310b f23589g = new C8310b();

    /* renamed from: h */
    private boolean f23590h;

    public C8314f(C2315d0 d0Var, C9169b bVar, C9010b bVar2) {
        this.f23584b = bVar2.mo24416b();
        this.f23585c = d0Var;
        C8525a a = bVar2.mo24418d().mo24353a();
        this.f23586d = a;
        C8525a a2 = bVar2.mo24417c().mo24353a();
        this.f23587e = a2;
        this.f23588f = bVar2;
        bVar.mo24753i(a);
        bVar.mo24753i(a2);
        a.mo23850a(this);
        a2.mo23850a(this);
    }

    /* renamed from: g */
    private void m31209g() {
        this.f23590h = false;
        this.f23585c.invalidateSelf();
    }

    /* renamed from: a */
    public void mo23468a() {
        m31209g();
    }

    /* renamed from: b */
    public void mo23469b(List list, List list2) {
        for (int i = 0; i < list.size(); i++) {
            C8311c cVar = (C8311c) list.get(i);
            if (cVar instanceof C8331u) {
                C8331u uVar = (C8331u) cVar;
                if (uVar.mo23488j() == C9033s.C9034a.SIMULTANEOUSLY) {
                    this.f23589g.mo23474a(uVar);
                    uVar.mo23484c(this);
                }
            }
        }
    }

    /* renamed from: c */
    public void mo23470c(Object obj, C6015c cVar) {
        if (obj == C2326h0.f7292k) {
            this.f23586d.mo23862n(cVar);
        } else if (obj == C2326h0.f7295n) {
            this.f23587e.mo23862n(cVar);
        }
    }

    /* renamed from: f */
    public void mo23472f(C8738e eVar, int i, List list, C8738e eVar2) {
        C5807i.m23372k(eVar, i, list, eVar2, this);
    }

    public String getName() {
        return this.f23584b;
    }

    /* renamed from: z */
    public Path mo23480z() {
        if (this.f23590h) {
            return this.f23583a;
        }
        this.f23583a.reset();
        if (this.f23588f.mo24419e()) {
            this.f23590h = true;
            return this.f23583a;
        }
        PointF pointF = (PointF) this.f23586d.mo23856h();
        float f = pointF.x / 2.0f;
        float f2 = pointF.y / 2.0f;
        float f3 = f * 0.55228f;
        float f4 = 0.55228f * f2;
        this.f23583a.reset();
        if (this.f23588f.mo24420f()) {
            float f5 = -f2;
            this.f23583a.moveTo(Utils.FLOAT_EPSILON, f5);
            Path path = this.f23583a;
            float f6 = Utils.FLOAT_EPSILON - f3;
            float f7 = -f;
            float f8 = Utils.FLOAT_EPSILON - f4;
            path.cubicTo(f6, f5, f7, f8, f7, Utils.FLOAT_EPSILON);
            Path path2 = this.f23583a;
            float f9 = f4 + Utils.FLOAT_EPSILON;
            float f12 = f5;
            path2.cubicTo(f7, f9, f6, f2, Utils.FLOAT_EPSILON, f2);
            Path path3 = this.f23583a;
            float f13 = f3 + Utils.FLOAT_EPSILON;
            path3.cubicTo(f13, f2, f, f9, f, Utils.FLOAT_EPSILON);
            this.f23583a.cubicTo(f, f8, f13, f12, Utils.FLOAT_EPSILON, f12);
        } else {
            float f14 = -f2;
            this.f23583a.moveTo(Utils.FLOAT_EPSILON, f14);
            Path path4 = this.f23583a;
            float f15 = f3 + Utils.FLOAT_EPSILON;
            float f16 = Utils.FLOAT_EPSILON - f4;
            path4.cubicTo(f15, f14, f, f16, f, Utils.FLOAT_EPSILON);
            Path path5 = this.f23583a;
            float f17 = f4 + Utils.FLOAT_EPSILON;
            path5.cubicTo(f, f17, f15, f2, Utils.FLOAT_EPSILON, f2);
            Path path6 = this.f23583a;
            float f18 = Utils.FLOAT_EPSILON - f3;
            float f19 = -f;
            path6.cubicTo(f18, f2, f19, f17, f19, Utils.FLOAT_EPSILON);
            float f22 = f14;
            this.f23583a.cubicTo(f19, f16, f18, f22, Utils.FLOAT_EPSILON, f22);
        }
        PointF pointF2 = (PointF) this.f23587e.mo23856h();
        this.f23583a.offset(pointF2.x, pointF2.y);
        this.f23583a.close();
        this.f23589g.mo23475b(this.f23583a);
        this.f23590h = true;
        return this.f23583a;
    }
}
