package pd1;

import ed1.C40741h;
import id1.C41300a;
import java.util.concurrent.Callable;
import ld1.C41692b;
import uh1.C43106a;
import uh1.C43107b;
import xd1.C43258c;

/* renamed from: pd1.c */
public final class C42148c extends C40741h {

    /* renamed from: e */
    final Callable f99126e;

    public C42148c(Callable callable) {
        this.f99126e = callable;
    }

    /* renamed from: F */
    public void mo94348F(C43107b bVar) {
        try {
            ((C43106a) C41692b.m120934e(this.f99126e.call(), "The publisher supplied is null")).mo26347a(bVar);
        } catch (Throwable th) {
            C41300a.m119661b(th);
            C43258c.m124213b(th, bVar);
        }
    }
}
