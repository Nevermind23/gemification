package sd1;

import ed1.C40749p;
import ed1.C40756v;
import java.util.concurrent.atomic.AtomicInteger;
import jd1.C41399f;
import zd1.C43413a;

/* renamed from: sd1.b */
public final class C42405b extends C40749p {

    /* renamed from: d */
    final C43413a f99705d;

    /* renamed from: e */
    final int f99706e;

    /* renamed from: f */
    final C41399f f99707f;

    /* renamed from: g */
    final AtomicInteger f99708g = new AtomicInteger();

    public C42405b(C43413a aVar, int i, C41399f fVar) {
        this.f99705d = aVar;
        this.f99706e = i;
        this.f99707f = fVar;
    }

    /* renamed from: I0 */
    public void mo94344I0(C40756v vVar) {
        this.f99705d.mo95016c(vVar);
        if (this.f99708g.incrementAndGet() == this.f99706e) {
            this.f99705d.mo97924j1(this.f99707f);
        }
    }
}
