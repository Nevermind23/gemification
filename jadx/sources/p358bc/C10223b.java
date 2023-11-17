package p358bc;

import com.google.zxing.C5751a;
import com.google.zxing.C5753c;
import com.google.zxing.C5763l;
import com.google.zxing.C5764m;
import com.google.zxing.C5765n;
import com.google.zxing.C5766o;
import com.google.zxing.NotFoundException;
import java.util.ArrayList;
import java.util.Map;
import p200ob.C7511e;
import p372cc.C10393j;
import p401ec.C12421a;
import p401ec.C12422b;

/* renamed from: bc.b */
public final class C10223b implements C5763l {

    /* renamed from: a */
    private static final C5764m[] f28414a = new C5764m[0];

    /* renamed from: d */
    private static C5764m[] m37298d(C5753c cVar, Map map, boolean z) {
        ArrayList arrayList = new ArrayList();
        C12422b b = C12421a.m47433b(cVar, map, z);
        for (C5766o[] oVarArr : b.mo33030b()) {
            C7511e i = C10393j.m37782i(b.mo33029a(), oVarArr[4], oVarArr[5], oVarArr[6], oVarArr[7], m37301g(oVarArr), m37299e(oVarArr));
            C5764m mVar = new C5764m(i.mo22001h(), i.mo21998e(), oVarArr, C5751a.PDF_417);
            mVar.mo18899h(C5765n.ERROR_CORRECTION_LEVEL, i.mo21995b());
            C10224c cVar2 = (C10224c) i.mo21997d();
            if (cVar2 != null) {
                mVar.mo18899h(C5765n.PDF417_EXTRA_METADATA, cVar2);
            }
            arrayList.add(mVar);
        }
        return (C5764m[]) arrayList.toArray(f28414a);
    }

    /* renamed from: e */
    private static int m37299e(C5766o[] oVarArr) {
        return Math.max(Math.max(m37300f(oVarArr[0], oVarArr[4]), (m37300f(oVarArr[6], oVarArr[2]) * 17) / 18), Math.max(m37300f(oVarArr[1], oVarArr[5]), (m37300f(oVarArr[7], oVarArr[3]) * 17) / 18));
    }

    /* renamed from: f */
    private static int m37300f(C5766o oVar, C5766o oVar2) {
        if (oVar == null || oVar2 == null) {
            return 0;
        }
        return (int) Math.abs(oVar.mo18901c() - oVar2.mo18901c());
    }

    /* renamed from: g */
    private static int m37301g(C5766o[] oVarArr) {
        return Math.min(Math.min(m37302h(oVarArr[0], oVarArr[4]), (m37302h(oVarArr[6], oVarArr[2]) * 17) / 18), Math.min(m37302h(oVarArr[1], oVarArr[5]), (m37302h(oVarArr[7], oVarArr[3]) * 17) / 18));
    }

    /* renamed from: h */
    private static int m37302h(C5766o oVar, C5766o oVar2) {
        if (oVar == null || oVar2 == null) {
            return Integer.MAX_VALUE;
        }
        return (int) Math.abs(oVar.mo18901c() - oVar2.mo18901c());
    }

    /* renamed from: a */
    public void mo18886a() {
    }

    /* renamed from: b */
    public C5764m mo18887b(C5753c cVar, Map map) {
        C5764m mVar;
        C5764m[] d = m37298d(cVar, map, false);
        if (d.length != 0 && (mVar = d[0]) != null) {
            return mVar;
        }
        throw NotFoundException.m23155a();
    }

    /* renamed from: c */
    public C5764m mo18888c(C5753c cVar) {
        return mo18887b(cVar, (Map) null);
    }
}
