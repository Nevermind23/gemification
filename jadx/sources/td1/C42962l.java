package td1;

import ed1.C40762x;
import ed1.C40764z;
import id1.C41300a;
import java.util.concurrent.Callable;
import kd1.C41499d;
import ld1.C41692b;

/* renamed from: td1.l */
public final class C42962l extends C40762x {

    /* renamed from: d */
    final Callable f100275d;

    public C42962l(Callable callable) {
        this.f100275d = callable;
    }

    /* access modifiers changed from: protected */
    /* renamed from: J */
    public void mo95071J(C40764z zVar) {
        try {
            th = (Throwable) C41692b.m120934e(this.f100275d.call(), "Callable returned null throwable. Null values are generally not allowed in 2.x operators and sources.");
        } catch (Throwable th) {
            th = th;
            C41300a.m119661b(th);
        }
        C41499d.m120385o(th, zVar);
    }
}
