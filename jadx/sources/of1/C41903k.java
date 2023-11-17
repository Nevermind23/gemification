package of1;

import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.C41536l;
import sf1.C42562e;
import tf1.C43012g;

/* renamed from: of1.k */
public final class C41903k {

    /* renamed from: a */
    private final C43012g f98489a;

    public C41903k(C43012g gVar) {
        C41536l.m120489i(gVar, "delegate");
        this.f98489a = gVar;
    }

    /* renamed from: a */
    public final C43012g mo96833a() {
        return this.f98489a;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public C41903k(int i, long j, TimeUnit timeUnit) {
        this(new C43012g(C42562e.f100169i, i, j, timeUnit));
        C41536l.m120489i(timeUnit, "timeUnit");
    }

    public C41903k() {
        this(5, 5, TimeUnit.MINUTES);
    }
}
