package jh1;

import fh1.C40951a;
import he1.C41238w;
import ih1.C41368a;
import kotlin.jvm.internal.C41536l;

/* renamed from: jh1.d */
public final class C41462d extends C41460c {

    /* renamed from: d */
    private Object f97597d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C41462d(C40951a aVar, C41368a aVar2) {
        super(aVar, aVar2);
        C41536l.m120489i(aVar, "koin");
        C41536l.m120489i(aVar2, "beanDefinition");
    }

    /* renamed from: a */
    public Object mo96215a(C41459b bVar) {
        C41536l.m120489i(bVar, "context");
        Object obj = this.f97597d;
        if (obj == null) {
            return super.mo96215a(bVar);
        }
        if (obj != null) {
            return obj;
        }
        throw new IllegalStateException("Single instance created couldn't return value".toString());
    }

    /* renamed from: b */
    public Object mo96212b(C41459b bVar) {
        C41536l.m120489i(bVar, "context");
        synchronized (this) {
            if (!mo96217d()) {
                this.f97597d = mo96215a(bVar);
            }
            C41238w wVar = C41238w.f97225a;
        }
        Object obj = this.f97597d;
        if (obj != null) {
            return obj;
        }
        throw new IllegalStateException("Single instance created couldn't return value".toString());
    }

    /* renamed from: d */
    public boolean mo96217d() {
        return this.f97597d != null;
    }
}
