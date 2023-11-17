package p246s5;

import ge1.C41084a;
import java.util.concurrent.Executor;
import p181n5.C7233e;
import p194o5.C7458b;
import p259t5.C8398x;
import p272u5.C8587d;
import p285v5.C8702a;

/* renamed from: s5.d */
public final class C8235d implements C7458b {

    /* renamed from: a */
    private final C41084a f23436a;

    /* renamed from: b */
    private final C41084a f23437b;

    /* renamed from: c */
    private final C41084a f23438c;

    /* renamed from: d */
    private final C41084a f23439d;

    /* renamed from: e */
    private final C41084a f23440e;

    public C8235d(C41084a aVar, C41084a aVar2, C41084a aVar3, C41084a aVar4, C41084a aVar5) {
        this.f23436a = aVar;
        this.f23437b = aVar2;
        this.f23438c = aVar3;
        this.f23439d = aVar4;
        this.f23440e = aVar5;
    }

    /* renamed from: a */
    public static C8235d m31031a(C41084a aVar, C41084a aVar2, C41084a aVar3, C41084a aVar4, C41084a aVar5) {
        return new C8235d(aVar, aVar2, aVar3, aVar4, aVar5);
    }

    /* renamed from: c */
    public static C8234c m31032c(Executor executor, C7233e eVar, C8398x xVar, C8587d dVar, C8702a aVar) {
        return new C8234c(executor, eVar, xVar, dVar, aVar);
    }

    /* renamed from: b */
    public C8234c get() {
        return m31032c((Executor) this.f23436a.get(), (C7233e) this.f23437b.get(), (C8398x) this.f23438c.get(), (C8587d) this.f23439d.get(), (C8702a) this.f23440e.get());
    }
}
