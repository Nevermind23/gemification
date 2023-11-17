package p268u1;

import android.graphics.Matrix;
import android.graphics.PointF;
import com.airbnb.lottie.C2326h0;
import com.github.mikephil.charting.utils.Utils;
import java.util.Collections;
import p061e2.C6013a;
import p061e2.C6015c;
import p061e2.C6016d;
import p268u1.C8525a;
import p307x1.C8946l;
import p331z1.C9169b;

/* renamed from: u1.p */
public class C8548p {

    /* renamed from: a */
    private final Matrix f24275a = new Matrix();

    /* renamed from: b */
    private final Matrix f24276b;

    /* renamed from: c */
    private final Matrix f24277c;

    /* renamed from: d */
    private final Matrix f24278d;

    /* renamed from: e */
    private final float[] f24279e;

    /* renamed from: f */
    private C8525a f24280f;

    /* renamed from: g */
    private C8525a f24281g;

    /* renamed from: h */
    private C8525a f24282h;

    /* renamed from: i */
    private C8525a f24283i;

    /* renamed from: j */
    private C8525a f24284j;

    /* renamed from: k */
    private C8535d f24285k;

    /* renamed from: l */
    private C8535d f24286l;

    /* renamed from: m */
    private C8525a f24287m;

    /* renamed from: n */
    private C8525a f24288n;

    public C8548p(C8946l lVar) {
        C8525a aVar;
        C8525a aVar2;
        C8525a aVar3;
        C8525a aVar4;
        C8535d dVar;
        C8535d dVar2;
        if (lVar.mo24361c() == null) {
            aVar = null;
        } else {
            aVar = lVar.mo24361c().mo24353a();
        }
        this.f24280f = aVar;
        if (lVar.mo24364f() == null) {
            aVar2 = null;
        } else {
            aVar2 = lVar.mo24364f().mo24353a();
        }
        this.f24281g = aVar2;
        if (lVar.mo24366h() == null) {
            aVar3 = null;
        } else {
            aVar3 = lVar.mo24366h().mo24353a();
        }
        this.f24282h = aVar3;
        if (lVar.mo24365g() == null) {
            aVar4 = null;
        } else {
            aVar4 = lVar.mo24365g().mo24353a();
        }
        this.f24283i = aVar4;
        if (lVar.mo24367i() == null) {
            dVar = null;
        } else {
            dVar = (C8535d) lVar.mo24367i().mo24353a();
        }
        this.f24285k = dVar;
        if (dVar != null) {
            this.f24276b = new Matrix();
            this.f24277c = new Matrix();
            this.f24278d = new Matrix();
            this.f24279e = new float[9];
        } else {
            this.f24276b = null;
            this.f24277c = null;
            this.f24278d = null;
            this.f24279e = null;
        }
        if (lVar.mo24368j() == null) {
            dVar2 = null;
        } else {
            dVar2 = (C8535d) lVar.mo24368j().mo24353a();
        }
        this.f24286l = dVar2;
        if (lVar.mo24363e() != null) {
            this.f24284j = lVar.mo24363e().mo24353a();
        }
        if (lVar.mo24369k() != null) {
            this.f24287m = lVar.mo24369k().mo24353a();
        } else {
            this.f24287m = null;
        }
        if (lVar.mo24362d() != null) {
            this.f24288n = lVar.mo24362d().mo24353a();
        } else {
            this.f24288n = null;
        }
    }

    /* renamed from: d */
    private void m32006d() {
        for (int i = 0; i < 9; i++) {
            this.f24279e[i] = 0.0f;
        }
    }

    /* renamed from: a */
    public void mo23904a(C9169b bVar) {
        bVar.mo24753i(this.f24284j);
        bVar.mo24753i(this.f24287m);
        bVar.mo24753i(this.f24288n);
        bVar.mo24753i(this.f24280f);
        bVar.mo24753i(this.f24281g);
        bVar.mo24753i(this.f24282h);
        bVar.mo24753i(this.f24283i);
        bVar.mo24753i(this.f24285k);
        bVar.mo24753i(this.f24286l);
    }

    /* renamed from: b */
    public void mo23905b(C8525a.C8527b bVar) {
        C8525a aVar = this.f24284j;
        if (aVar != null) {
            aVar.mo23850a(bVar);
        }
        C8525a aVar2 = this.f24287m;
        if (aVar2 != null) {
            aVar2.mo23850a(bVar);
        }
        C8525a aVar3 = this.f24288n;
        if (aVar3 != null) {
            aVar3.mo23850a(bVar);
        }
        C8525a aVar4 = this.f24280f;
        if (aVar4 != null) {
            aVar4.mo23850a(bVar);
        }
        C8525a aVar5 = this.f24281g;
        if (aVar5 != null) {
            aVar5.mo23850a(bVar);
        }
        C8525a aVar6 = this.f24282h;
        if (aVar6 != null) {
            aVar6.mo23850a(bVar);
        }
        C8525a aVar7 = this.f24283i;
        if (aVar7 != null) {
            aVar7.mo23850a(bVar);
        }
        C8535d dVar = this.f24285k;
        if (dVar != null) {
            dVar.mo23850a(bVar);
        }
        C8535d dVar2 = this.f24286l;
        if (dVar2 != null) {
            dVar2.mo23850a(bVar);
        }
    }

    /* renamed from: c */
    public boolean mo23906c(Object obj, C6015c cVar) {
        if (obj == C2326h0.f7287f) {
            C8525a aVar = this.f24280f;
            if (aVar == null) {
                this.f24280f = new C8549q(cVar, new PointF());
                return true;
            }
            aVar.mo23862n(cVar);
            return true;
        } else if (obj == C2326h0.f7288g) {
            C8525a aVar2 = this.f24281g;
            if (aVar2 == null) {
                this.f24281g = new C8549q(cVar, new PointF());
                return true;
            }
            aVar2.mo23862n(cVar);
            return true;
        } else {
            if (obj == C2326h0.f7289h) {
                C8525a aVar3 = this.f24281g;
                if (aVar3 instanceof C8545n) {
                    ((C8545n) aVar3).mo23899r(cVar);
                    return true;
                }
            }
            if (obj == C2326h0.f7290i) {
                C8525a aVar4 = this.f24281g;
                if (aVar4 instanceof C8545n) {
                    ((C8545n) aVar4).mo23900s(cVar);
                    return true;
                }
            }
            if (obj == C2326h0.f7296o) {
                C8525a aVar5 = this.f24282h;
                if (aVar5 == null) {
                    this.f24282h = new C8549q(cVar, new C6016d());
                    return true;
                }
                aVar5.mo23862n(cVar);
                return true;
            } else if (obj == C2326h0.f7297p) {
                C8525a aVar6 = this.f24283i;
                if (aVar6 == null) {
                    this.f24283i = new C8549q(cVar, Float.valueOf(Utils.FLOAT_EPSILON));
                    return true;
                }
                aVar6.mo23862n(cVar);
                return true;
            } else if (obj == C2326h0.f7284c) {
                C8525a aVar7 = this.f24284j;
                if (aVar7 == null) {
                    this.f24284j = new C8549q(cVar, 100);
                    return true;
                }
                aVar7.mo23862n(cVar);
                return true;
            } else if (obj == C2326h0.f7269C) {
                C8525a aVar8 = this.f24287m;
                if (aVar8 == null) {
                    this.f24287m = new C8549q(cVar, Float.valueOf(100.0f));
                    return true;
                }
                aVar8.mo23862n(cVar);
                return true;
            } else if (obj == C2326h0.f7270D) {
                C8525a aVar9 = this.f24288n;
                if (aVar9 == null) {
                    this.f24288n = new C8549q(cVar, Float.valueOf(100.0f));
                    return true;
                }
                aVar9.mo23862n(cVar);
                return true;
            } else if (obj == C2326h0.f7298q) {
                if (this.f24285k == null) {
                    this.f24285k = new C8535d(Collections.singletonList(new C6013a(Float.valueOf(Utils.FLOAT_EPSILON))));
                }
                this.f24285k.mo23862n(cVar);
                return true;
            } else if (obj != C2326h0.f7299r) {
                return false;
            } else {
                if (this.f24286l == null) {
                    this.f24286l = new C8535d(Collections.singletonList(new C6013a(Float.valueOf(Utils.FLOAT_EPSILON))));
                }
                this.f24286l.mo23862n(cVar);
                return true;
            }
        }
    }

    /* renamed from: e */
    public C8525a mo23907e() {
        return this.f24288n;
    }

    /* renamed from: f */
    public Matrix mo23908f() {
        PointF pointF;
        float f;
        float f2;
        float f3;
        PointF pointF2;
        this.f24275a.reset();
        C8525a aVar = this.f24281g;
        if (!(aVar == null || (pointF2 = (PointF) aVar.mo23856h()) == null)) {
            float f4 = pointF2.x;
            if (!(f4 == Utils.FLOAT_EPSILON && pointF2.y == Utils.FLOAT_EPSILON)) {
                this.f24275a.preTranslate(f4, pointF2.y);
            }
        }
        C8525a aVar2 = this.f24283i;
        if (aVar2 != null) {
            if (aVar2 instanceof C8549q) {
                f3 = ((Float) aVar2.mo23856h()).floatValue();
            } else {
                f3 = ((C8535d) aVar2).mo23879p();
            }
            if (f3 != Utils.FLOAT_EPSILON) {
                this.f24275a.preRotate(f3);
            }
        }
        C8535d dVar = this.f24285k;
        if (dVar != null) {
            C8535d dVar2 = this.f24286l;
            if (dVar2 == null) {
                f = 0.0f;
            } else {
                f = (float) Math.cos(Math.toRadians((double) ((-dVar2.mo23879p()) + 90.0f)));
            }
            C8535d dVar3 = this.f24286l;
            if (dVar3 == null) {
                f2 = 1.0f;
            } else {
                f2 = (float) Math.sin(Math.toRadians((double) ((-dVar3.mo23879p()) + 90.0f)));
            }
            float tan = (float) Math.tan(Math.toRadians((double) dVar.mo23879p()));
            m32006d();
            float[] fArr = this.f24279e;
            fArr[0] = f;
            fArr[1] = f2;
            float f5 = -f2;
            fArr[3] = f5;
            fArr[4] = f;
            fArr[8] = 1.0f;
            this.f24276b.setValues(fArr);
            m32006d();
            float[] fArr2 = this.f24279e;
            fArr2[0] = 1.0f;
            fArr2[3] = tan;
            fArr2[4] = 1.0f;
            fArr2[8] = 1.0f;
            this.f24277c.setValues(fArr2);
            m32006d();
            float[] fArr3 = this.f24279e;
            fArr3[0] = f;
            fArr3[1] = f5;
            fArr3[3] = f2;
            fArr3[4] = f;
            fArr3[8] = 1.0f;
            this.f24278d.setValues(fArr3);
            this.f24277c.preConcat(this.f24276b);
            this.f24278d.preConcat(this.f24277c);
            this.f24275a.preConcat(this.f24278d);
        }
        C8525a aVar3 = this.f24282h;
        if (aVar3 != null) {
            C6016d dVar4 = (C6016d) aVar3.mo23856h();
            if (!(dVar4.mo19507b() == 1.0f && dVar4.mo19508c() == 1.0f)) {
                this.f24275a.preScale(dVar4.mo19507b(), dVar4.mo19508c());
            }
        }
        C8525a aVar4 = this.f24280f;
        if (!(aVar4 == null || (((pointF = (PointF) aVar4.mo23856h()) == null || pointF.x == Utils.FLOAT_EPSILON) && pointF.y == Utils.FLOAT_EPSILON))) {
            this.f24275a.preTranslate(-pointF.x, -pointF.y);
        }
        return this.f24275a;
    }

    /* renamed from: g */
    public Matrix mo23909g(float f) {
        PointF pointF;
        C6016d dVar;
        float f2;
        C8525a aVar = this.f24281g;
        PointF pointF2 = null;
        if (aVar == null) {
            pointF = null;
        } else {
            pointF = (PointF) aVar.mo23856h();
        }
        C8525a aVar2 = this.f24282h;
        if (aVar2 == null) {
            dVar = null;
        } else {
            dVar = (C6016d) aVar2.mo23856h();
        }
        this.f24275a.reset();
        if (pointF != null) {
            this.f24275a.preTranslate(pointF.x * f, pointF.y * f);
        }
        if (dVar != null) {
            double d = (double) f;
            this.f24275a.preScale((float) Math.pow((double) dVar.mo19507b(), d), (float) Math.pow((double) dVar.mo19508c(), d));
        }
        C8525a aVar3 = this.f24283i;
        if (aVar3 != null) {
            float floatValue = ((Float) aVar3.mo23856h()).floatValue();
            C8525a aVar4 = this.f24280f;
            if (aVar4 != null) {
                pointF2 = (PointF) aVar4.mo23856h();
            }
            Matrix matrix = this.f24275a;
            float f3 = floatValue * f;
            float f4 = Utils.FLOAT_EPSILON;
            if (pointF2 == null) {
                f2 = 0.0f;
            } else {
                f2 = pointF2.x;
            }
            if (pointF2 != null) {
                f4 = pointF2.y;
            }
            matrix.preRotate(f3, f2, f4);
        }
        return this.f24275a;
    }

    /* renamed from: h */
    public C8525a mo23910h() {
        return this.f24284j;
    }

    /* renamed from: i */
    public C8525a mo23911i() {
        return this.f24287m;
    }

    /* renamed from: j */
    public void mo23912j(float f) {
        C8525a aVar = this.f24284j;
        if (aVar != null) {
            aVar.mo23861m(f);
        }
        C8525a aVar2 = this.f24287m;
        if (aVar2 != null) {
            aVar2.mo23861m(f);
        }
        C8525a aVar3 = this.f24288n;
        if (aVar3 != null) {
            aVar3.mo23861m(f);
        }
        C8525a aVar4 = this.f24280f;
        if (aVar4 != null) {
            aVar4.mo23861m(f);
        }
        C8525a aVar5 = this.f24281g;
        if (aVar5 != null) {
            aVar5.mo23861m(f);
        }
        C8525a aVar6 = this.f24282h;
        if (aVar6 != null) {
            aVar6.mo23861m(f);
        }
        C8525a aVar7 = this.f24283i;
        if (aVar7 != null) {
            aVar7.mo23861m(f);
        }
        C8535d dVar = this.f24285k;
        if (dVar != null) {
            dVar.mo23861m(f);
        }
        C8535d dVar2 = this.f24286l;
        if (dVar2 != null) {
            dVar2.mo23861m(f);
        }
    }
}
