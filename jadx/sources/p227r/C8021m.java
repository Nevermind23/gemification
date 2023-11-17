package p227r;

import com.github.mikephil.charting.utils.Utils;
import java.util.ArrayList;
import p214q.C7809f;

/* renamed from: r.m */
class C8021m {

    /* renamed from: h */
    public static int f23125h;

    /* renamed from: a */
    public int f23126a = 0;

    /* renamed from: b */
    public boolean f23127b = false;

    /* renamed from: c */
    C8026p f23128c = null;

    /* renamed from: d */
    C8026p f23129d = null;

    /* renamed from: e */
    ArrayList f23130e = new ArrayList();

    /* renamed from: f */
    int f23131f;

    /* renamed from: g */
    int f23132g;

    public C8021m(C8026p pVar, int i) {
        int i2 = f23125h;
        this.f23131f = i2;
        f23125h = i2 + 1;
        this.f23128c = pVar;
        this.f23129d = pVar;
        this.f23132g = i;
    }

    /* renamed from: c */
    private long m30471c(C8012f fVar, long j) {
        C8026p pVar = fVar.f23101d;
        if (pVar instanceof C8018k) {
            return j;
        }
        int size = fVar.f23108k.size();
        long j2 = j;
        for (int i = 0; i < size; i++) {
            C8010d dVar = (C8010d) fVar.f23108k.get(i);
            if (dVar instanceof C8012f) {
                C8012f fVar2 = (C8012f) dVar;
                if (fVar2.f23101d != pVar) {
                    j2 = Math.min(j2, m30471c(fVar2, ((long) fVar2.f23103f) + j));
                }
            }
        }
        if (fVar != pVar.f23159i) {
            return j2;
        }
        long j3 = j - pVar.mo23163j();
        return Math.min(Math.min(j2, m30471c(pVar.f23158h, j3)), j3 - ((long) pVar.f23158h.f23103f));
    }

    /* renamed from: d */
    private long m30472d(C8012f fVar, long j) {
        C8026p pVar = fVar.f23101d;
        if (pVar instanceof C8018k) {
            return j;
        }
        int size = fVar.f23108k.size();
        long j2 = j;
        for (int i = 0; i < size; i++) {
            C8010d dVar = (C8010d) fVar.f23108k.get(i);
            if (dVar instanceof C8012f) {
                C8012f fVar2 = (C8012f) dVar;
                if (fVar2.f23101d != pVar) {
                    j2 = Math.max(j2, m30472d(fVar2, ((long) fVar2.f23103f) + j));
                }
            }
        }
        if (fVar != pVar.f23158h) {
            return j2;
        }
        long j3 = j + pVar.mo23163j();
        return Math.max(Math.max(j2, m30472d(pVar.f23159i, j3)), j3 - ((long) pVar.f23159i.f23103f));
    }

    /* renamed from: a */
    public void mo23181a(C8026p pVar) {
        this.f23130e.add(pVar);
        this.f23129d = pVar;
    }

    /* renamed from: b */
    public long mo23182b(C7809f fVar, int i) {
        C8026p pVar;
        C8026p pVar2;
        int i2;
        long j;
        C8026p pVar3 = this.f23128c;
        long j2 = 0;
        if (pVar3 instanceof C8009c) {
            if (((C8009c) pVar3).f23156f != i) {
                return 0;
            }
        } else if (i == 0) {
            if (!(pVar3 instanceof C8019l)) {
                return 0;
            }
        } else if (!(pVar3 instanceof C8022n)) {
            return 0;
        }
        if (i == 0) {
            pVar = fVar.f22620e;
        } else {
            pVar = fVar.f22622f;
        }
        C8012f fVar2 = pVar.f23158h;
        if (i == 0) {
            pVar2 = fVar.f22620e;
        } else {
            pVar2 = fVar.f22622f;
        }
        C8012f fVar3 = pVar2.f23159i;
        boolean contains = pVar3.f23158h.f23109l.contains(fVar2);
        boolean contains2 = this.f23128c.f23159i.f23109l.contains(fVar3);
        long j3 = this.f23128c.mo23163j();
        if (contains && contains2) {
            long d = m30472d(this.f23128c.f23158h, 0);
            long c = m30471c(this.f23128c.f23159i, 0);
            long j4 = d - j3;
            C8026p pVar4 = this.f23128c;
            int i3 = pVar4.f23159i.f23103f;
            if (j4 >= ((long) (-i3))) {
                j4 += (long) i3;
            }
            int i4 = pVar4.f23158h.f23103f;
            long j5 = ((-c) - j3) - ((long) i4);
            if (j5 >= ((long) i4)) {
                j5 -= (long) i4;
            }
            float o = pVar4.f23152b.mo22670o(i);
            if (o > Utils.FLOAT_EPSILON) {
                j2 = (long) ((((float) j5) / o) + (((float) j4) / (1.0f - o)));
            }
            float f = (float) j2;
            long j6 = ((long) ((f * o) + 0.5f)) + j3 + ((long) ((f * (1.0f - o)) + 0.5f));
            C8026p pVar5 = this.f23128c;
            j = ((long) pVar5.f23158h.f23103f) + j6;
            i2 = pVar5.f23159i.f23103f;
        } else if (contains) {
            C8012f fVar4 = this.f23128c.f23158h;
            return Math.max(m30472d(fVar4, (long) fVar4.f23103f), ((long) this.f23128c.f23158h.f23103f) + j3);
        } else if (contains2) {
            C8012f fVar5 = this.f23128c.f23159i;
            return Math.max(-m30471c(fVar5, (long) fVar5.f23103f), ((long) (-this.f23128c.f23159i.f23103f)) + j3);
        } else {
            C8026p pVar6 = this.f23128c;
            j = ((long) pVar6.f23158h.f23103f) + pVar6.mo23163j();
            i2 = this.f23128c.f23159i.f23103f;
        }
        return j - ((long) i2);
    }
}
