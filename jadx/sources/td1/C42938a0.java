package td1;

import ed1.C40735b0;
import ed1.C40762x;
import ed1.C40764z;
import id1.C41300a;
import java.util.Arrays;
import java.util.NoSuchElementException;
import jd1.C41405l;
import kd1.C41499d;
import ld1.C41692b;
import td1.C42975s;
import td1.C42990z;

/* renamed from: td1.a0 */
public final class C42938a0 extends C40762x {

    /* renamed from: d */
    final Iterable f100222d;

    /* renamed from: e */
    final C41405l f100223e;

    /* renamed from: td1.a0$a */
    final class C42939a implements C41405l {
        C42939a() {
        }

        public Object apply(Object obj) {
            return C41692b.m120934e(C42938a0.this.f100223e.apply(new Object[]{obj}), "The zipper returned a null value");
        }
    }

    public C42938a0(Iterable iterable, C41405l lVar) {
        this.f100222d = iterable;
        this.f100223e = lVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: J */
    public void mo95071J(C40764z zVar) {
        C40735b0[] b0VarArr = new C40735b0[8];
        try {
            int i = 0;
            for (C40735b0 b0Var : this.f100222d) {
                if (b0Var == null) {
                    C41499d.m120385o(new NullPointerException("One of the sources is null"), zVar);
                    return;
                }
                if (i == b0VarArr.length) {
                    b0VarArr = (C40735b0[]) Arrays.copyOf(b0VarArr, (i >> 2) + i);
                }
                int i2 = i + 1;
                b0VarArr[i] = b0Var;
                i = i2;
            }
            if (i == 0) {
                C41499d.m120385o(new NoSuchElementException(), zVar);
            } else if (i == 1) {
                b0VarArr[0].mo94907c(new C42975s.C42976a(zVar, new C42939a()));
            } else {
                C42990z.C42992b bVar = new C42990z.C42992b(zVar, i, this.f100223e);
                zVar.onSubscribe(bVar);
                for (int i3 = 0; i3 < i && !bVar.isDisposed(); i3++) {
                    b0VarArr[i3].mo94907c(bVar.f100340f[i3]);
                }
            }
        } catch (Throwable th) {
            C41300a.m119661b(th);
            C41499d.m120385o(th, zVar);
        }
    }
}
