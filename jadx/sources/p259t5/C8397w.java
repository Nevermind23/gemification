package p259t5;

import ge1.C41084a;
import java.util.concurrent.Executor;
import p194o5.C7458b;
import p272u5.C8587d;
import p285v5.C8702a;

/* renamed from: t5.w */
public final class C8397w implements C7458b {

    /* renamed from: a */
    private final C41084a f23846a;

    /* renamed from: b */
    private final C41084a f23847b;

    /* renamed from: c */
    private final C41084a f23848c;

    /* renamed from: d */
    private final C41084a f23849d;

    public C8397w(C41084a aVar, C41084a aVar2, C41084a aVar3, C41084a aVar4) {
        this.f23846a = aVar;
        this.f23847b = aVar2;
        this.f23848c = aVar3;
        this.f23849d = aVar4;
    }

    /* renamed from: a */
    public static C8397w m31518a(C41084a aVar, C41084a aVar2, C41084a aVar3, C41084a aVar4) {
        return new C8397w(aVar, aVar2, aVar3, aVar4);
    }

    /* renamed from: c */
    public static C8396v m31519c(Executor executor, C8587d dVar, C8398x xVar, C8702a aVar) {
        return new C8396v(executor, dVar, xVar, aVar);
    }

    /* renamed from: b */
    public C8396v get() {
        return m31519c((Executor) this.f23846a.get(), (C8587d) this.f23847b.get(), (C8398x) this.f23848c.get(), (C8702a) this.f23849d.get());
    }
}
