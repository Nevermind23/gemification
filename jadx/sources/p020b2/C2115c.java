package p020b2;

import android.graphics.PointF;
import android.view.animation.Interpolator;
import com.airbnb.lottie.C2325h;
import com.github.mikephil.charting.utils.Utils;
import p033c2.C2224c;
import p061e2.C6013a;
import p061e2.C6016d;
import p307x1.C8936b;
import p307x1.C8938d;
import p307x1.C8939e;
import p307x1.C8941g;
import p307x1.C8943i;
import p307x1.C8946l;
import p307x1.C8947m;

/* renamed from: b2.c */
public abstract class C2115c {

    /* renamed from: a */
    private static final C2224c.C2225a f6268a = C2224c.C2225a.m8482a("a", "p", "s", "rz", "r", "o", "so", "eo", "sk", "sa");

    /* renamed from: b */
    private static final C2224c.C2225a f6269b = C2224c.C2225a.m8482a("k");

    /* renamed from: a */
    private static boolean m8171a(C8939e eVar) {
        return eVar == null || (eVar.mo24355c() && ((PointF) ((C6013a) eVar.mo24354b().get(0)).f18759b).equals(Utils.FLOAT_EPSILON, Utils.FLOAT_EPSILON));
    }

    /* renamed from: b */
    private static boolean m8172b(C8947m mVar) {
        if (mVar == null || (!(mVar instanceof C8943i) && mVar.mo24355c() && ((PointF) ((C6013a) mVar.mo24354b().get(0)).f18759b).equals(Utils.FLOAT_EPSILON, Utils.FLOAT_EPSILON))) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    private static boolean m8173c(C8936b bVar) {
        return bVar == null || (bVar.mo24355c() && ((Float) ((C6013a) bVar.mo24354b().get(0)).f18759b).floatValue() == Utils.FLOAT_EPSILON);
    }

    /* renamed from: d */
    private static boolean m8174d(C8941g gVar) {
        return gVar == null || (gVar.mo24355c() && ((C6016d) ((C6013a) gVar.mo24354b().get(0)).f18759b).mo19506a(1.0f, 1.0f));
    }

    /* renamed from: e */
    private static boolean m8175e(C8936b bVar) {
        return bVar == null || (bVar.mo24355c() && ((Float) ((C6013a) bVar.mo24354b().get(0)).f18759b).floatValue() == Utils.FLOAT_EPSILON);
    }

    /* renamed from: f */
    private static boolean m8176f(C8936b bVar) {
        return bVar == null || (bVar.mo24355c() && ((Float) ((C6013a) bVar.mo24354b().get(0)).f18759b).floatValue() == Utils.FLOAT_EPSILON);
    }

    /* renamed from: g */
    public static C8946l m8177g(C2224c cVar, C2325h hVar) {
        boolean z;
        C8939e eVar;
        C8947m mVar;
        C8936b bVar;
        C8936b bVar2;
        C8936b bVar3;
        boolean z2;
        C2224c cVar2 = cVar;
        C2325h hVar2 = hVar;
        boolean z3 = false;
        if (cVar.mo7158v() == C2224c.C2226b.BEGIN_OBJECT) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            cVar.mo7153n();
        }
        C8936b bVar4 = null;
        C8939e eVar2 = null;
        C8947m mVar2 = null;
        C8941g gVar = null;
        C8936b bVar5 = null;
        C8936b bVar6 = null;
        C8938d dVar = null;
        C8936b bVar7 = null;
        C8936b bVar8 = null;
        while (cVar.hasNext()) {
            switch (cVar2.mo7160x(f6268a)) {
                case 0:
                    boolean z4 = z3;
                    cVar.mo7153n();
                    while (cVar.hasNext()) {
                        if (cVar2.mo7160x(f6269b) != 0) {
                            cVar.mo7161y();
                            cVar.mo7148N();
                        } else {
                            eVar2 = C2111a.m8163a(cVar, hVar);
                        }
                    }
                    cVar.mo7155q();
                    z3 = z4;
                    continue;
                case 1:
                    boolean z5 = z3;
                    mVar2 = C2111a.m8164b(cVar, hVar);
                    continue;
                case 2:
                    boolean z6 = z3;
                    gVar = C2117d.m8188j(cVar, hVar);
                    continue;
                case 3:
                    hVar2.mo7542a("Lottie doesn't support 3D layers.");
                    break;
                case 4:
                    break;
                case 5:
                    dVar = C2117d.m8186h(cVar, hVar);
                    continue;
                case 6:
                    bVar7 = C2117d.m8184f(cVar2, hVar2, z3);
                    continue;
                case 7:
                    bVar8 = C2117d.m8184f(cVar2, hVar2, z3);
                    continue;
                case 8:
                    bVar5 = C2117d.m8184f(cVar2, hVar2, z3);
                    continue;
                case 9:
                    bVar6 = C2117d.m8184f(cVar2, hVar2, z3);
                    continue;
                default:
                    boolean z7 = z3;
                    cVar.mo7161y();
                    cVar.mo7148N();
                    continue;
            }
            C8936b f = C2117d.m8184f(cVar2, hVar2, z3);
            if (f.mo24354b().isEmpty()) {
                C6013a aVar = r1;
                C6013a aVar2 = new C6013a(hVar, Float.valueOf(Utils.FLOAT_EPSILON), Float.valueOf(Utils.FLOAT_EPSILON), (Interpolator) null, Utils.FLOAT_EPSILON, Float.valueOf(hVar.mo7547f()));
                f.mo24354b().add(aVar);
            } else if (((C6013a) f.mo24354b().get(0)).f18759b == null) {
                z2 = false;
                f.mo24354b().set(0, new C6013a(hVar, Float.valueOf(Utils.FLOAT_EPSILON), Float.valueOf(Utils.FLOAT_EPSILON), (Interpolator) null, Utils.FLOAT_EPSILON, Float.valueOf(hVar.mo7547f())));
                z3 = z2;
                bVar4 = f;
            }
            z2 = false;
            z3 = z2;
            bVar4 = f;
        }
        if (z) {
            cVar.mo7155q();
        }
        if (m8171a(eVar2)) {
            eVar = null;
        } else {
            eVar = eVar2;
        }
        if (m8172b(mVar2)) {
            mVar = null;
        } else {
            mVar = mVar2;
        }
        if (m8173c(bVar4)) {
            bVar = null;
        } else {
            bVar = bVar4;
        }
        if (m8174d(gVar)) {
            gVar = null;
        }
        if (m8176f(bVar5)) {
            bVar2 = null;
        } else {
            bVar2 = bVar5;
        }
        if (m8175e(bVar6)) {
            bVar3 = null;
        } else {
            bVar3 = bVar6;
        }
        return new C8946l(eVar, mVar, gVar, bVar, dVar, bVar7, bVar8, bVar2, bVar3);
    }
}
