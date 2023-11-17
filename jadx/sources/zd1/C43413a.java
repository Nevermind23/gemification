package zd1;

import ae1.C40293a;
import de1.C40640a;
import ed1.C40749p;
import ed1.C40757w;
import hd1.C41205b;
import java.util.concurrent.TimeUnit;
import jd1.C41399f;
import ld1.C41669a;
import ld1.C41692b;
import sd1.C42405b;
import sd1.C42490p0;
import sd1.C42495q0;
import sd1.C42501s0;
import yd1.C43361f;

/* renamed from: zd1.a */
public abstract class C43413a extends C40749p {
    /* renamed from: k1 */
    private C43413a m124526k1() {
        if (this instanceof C42495q0) {
            return C40293a.m116719p(new C42490p0(((C42495q0) this).mo97923b()));
        }
        return this;
    }

    /* renamed from: f1 */
    public C40749p mo102091f1() {
        return mo102092g1(1);
    }

    /* renamed from: g1 */
    public C40749p mo102092g1(int i) {
        return mo102093h1(i, C41669a.m120908d());
    }

    /* renamed from: h1 */
    public C40749p mo102093h1(int i, C41399f fVar) {
        if (i > 0) {
            return C40293a.m116717n(new C42405b(this, i, fVar));
        }
        mo97924j1(fVar);
        return C40293a.m116719p(this);
    }

    /* renamed from: i1 */
    public final C41205b mo102094i1() {
        C43361f fVar = new C43361f();
        mo97924j1(fVar);
        return fVar.f101201d;
    }

    /* renamed from: j1 */
    public abstract void mo97924j1(C41399f fVar);

    /* renamed from: l1 */
    public C40749p mo102095l1() {
        return C40293a.m116717n(new C42501s0(m124526k1()));
    }

    /* renamed from: m1 */
    public final C40749p mo102096m1(int i) {
        return mo102097n1(i, 0, TimeUnit.NANOSECONDS, C40640a.m117459c());
    }

    /* renamed from: n1 */
    public final C40749p mo102097n1(int i, long j, TimeUnit timeUnit, C40757w wVar) {
        C41692b.m120935f(i, "subscriberCount");
        C41692b.m120934e(timeUnit, "unit is null");
        C41692b.m120934e(wVar, "scheduler is null");
        return C40293a.m116717n(new C42501s0(m124526k1(), i, j, timeUnit, wVar));
    }
}
