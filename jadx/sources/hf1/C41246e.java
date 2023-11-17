package hf1;

import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.C41527d0;
import kotlinx.coroutines.flow.C41557b;
import kotlinx.coroutines.internal.C41592e0;
import me1.C41752f;
import oe1.C41857h;
import ue1.C43079p;

/* renamed from: hf1.e */
public abstract class C41246e {
    /* JADX INFO: finally extract failed */
    /* renamed from: b */
    public static final Object m119526b(C41752f fVar, Object obj, Object obj2, C43079p pVar, Continuation continuation) {
        Object c = C41592e0.m120649c(fVar, obj2);
        try {
            Object invoke = ((C43079p) C41527d0.m120459f(pVar, 2)).invoke(obj, new C41260m(continuation, fVar));
            C41592e0.m120647a(fVar, c);
            if (invoke == C41793d.m121157c()) {
                C41857h.m121275c(continuation);
            }
            return invoke;
        } catch (Throwable th) {
            C41592e0.m120647a(fVar, c);
            throw th;
        }
    }

    /* renamed from: c */
    public static /* synthetic */ Object m119527c(C41752f fVar, Object obj, Object obj2, C43079p pVar, Continuation continuation, int i, Object obj3) {
        if ((i & 4) != 0) {
            obj2 = C41592e0.m120648b(fVar);
        }
        return m119526b(fVar, obj, obj2, pVar, continuation);
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public static final C41557b m119528d(C41557b bVar, C41752f fVar) {
        boolean z;
        if (bVar instanceof C41259l) {
            z = true;
        } else {
            z = bVar instanceof C41257j;
        }
        if (z) {
            return bVar;
        }
        return new C41261n(bVar, fVar);
    }
}
