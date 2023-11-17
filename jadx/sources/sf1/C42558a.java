package sf1;

import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: sf1.a */
public abstract class C42558a {

    /* renamed from: a */
    private final String f100155a;

    /* renamed from: b */
    private final boolean f100156b;

    /* renamed from: c */
    private C42561d f100157c;

    /* renamed from: d */
    private long f100158d;

    public C42558a(String str, boolean z) {
        C41536l.m120489i(str, "name");
        this.f100155a = str;
        this.f100156b = z;
        this.f100158d = -1;
    }

    /* renamed from: a */
    public final boolean mo97988a() {
        return this.f100156b;
    }

    /* renamed from: b */
    public final String mo97989b() {
        return this.f100155a;
    }

    /* renamed from: c */
    public final long mo97990c() {
        return this.f100158d;
    }

    /* renamed from: d */
    public final C42561d mo97991d() {
        return this.f100157c;
    }

    /* renamed from: e */
    public final void mo97992e(C42561d dVar) {
        boolean z;
        C41536l.m120489i(dVar, "queue");
        C42561d dVar2 = this.f100157c;
        if (dVar2 != dVar) {
            if (dVar2 == null) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                this.f100157c = dVar;
                return;
            }
            throw new IllegalStateException("task is in multiple queues".toString());
        }
    }

    /* renamed from: f */
    public abstract long mo94430f();

    /* renamed from: g */
    public final void mo97993g(long j) {
        this.f100158d = j;
    }

    public String toString() {
        return this.f100155a;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C42558a(String str, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? true : z);
    }
}
