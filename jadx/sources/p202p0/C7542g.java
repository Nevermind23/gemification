package p202p0;

import af1.C40296c;
import android.os.Bundle;
import he1.C41217g;
import java.lang.reflect.Method;
import java.util.Arrays;
import kotlin.jvm.internal.C41536l;
import te1.C42994a;
import ue1.C43064a;

/* renamed from: p0.g */
public final class C7542g implements C41217g {

    /* renamed from: d */
    private final C40296c f21994d;

    /* renamed from: e */
    private final C43064a f21995e;

    /* renamed from: f */
    private C7540f f21996f;

    public C7542g(C40296c cVar, C43064a aVar) {
        C41536l.m120489i(cVar, "navArgsClass");
        C41536l.m120489i(aVar, "argumentProducer");
        this.f21994d = cVar;
        this.f21995e = aVar;
    }

    /* renamed from: a */
    public boolean mo4932a() {
        return this.f21996f != null;
    }

    /* renamed from: b */
    public C7540f getValue() {
        C7540f fVar = this.f21996f;
        if (fVar != null) {
            return fVar;
        }
        Bundle bundle = (Bundle) this.f21995e.invoke();
        Method method = (Method) C7544h.m28669a().get(this.f21994d);
        if (method == null) {
            Class a = C42994a.m123348a(this.f21994d);
            Class[] b = C7544h.m28670b();
            method = a.getMethod("fromBundle", (Class[]) Arrays.copyOf(b, b.length));
            C7544h.m28669a().put(this.f21994d, method);
            C41536l.m120488h(method, "navArgsClass.java.getMet…hod\n                    }");
        }
        Object invoke = method.invoke((Object) null, new Object[]{bundle});
        if (invoke != null) {
            C7540f fVar2 = (C7540f) invoke;
            this.f21996f = fVar2;
            return fVar2;
        }
        throw new NullPointerException("null cannot be cast to non-null type Args of androidx.navigation.NavArgsLazy");
    }
}
