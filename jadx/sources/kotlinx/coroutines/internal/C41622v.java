package kotlinx.coroutines.internal;

import ef1.C40810g0;
import he1.C41238w;
import kotlin.jvm.internal.C41537m;
import me1.C41752f;
import ue1.C43075l;

/* renamed from: kotlinx.coroutines.internal.v */
public abstract class C41622v {

    /* renamed from: kotlinx.coroutines.internal.v$a */
    static final class C41623a extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C43075l f97833d;

        /* renamed from: e */
        final /* synthetic */ Object f97834e;

        /* renamed from: f */
        final /* synthetic */ C41752f f97835f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C41623a(C43075l lVar, Object obj, C41752f fVar) {
            super(1);
            this.f97833d = lVar;
            this.f97834e = obj;
            this.f97835f = fVar;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Throwable) obj);
            return C41238w.f97225a;
        }

        public final void invoke(Throwable th) {
            C41622v.m120768b(this.f97833d, this.f97834e, this.f97835f);
        }
    }

    /* renamed from: a */
    public static final C43075l m120767a(C43075l lVar, Object obj, C41752f fVar) {
        return new C41623a(lVar, obj, fVar);
    }

    /* renamed from: b */
    public static final void m120768b(C43075l lVar, Object obj, C41752f fVar) {
        UndeliveredElementException c = m120769c(lVar, obj, (UndeliveredElementException) null);
        if (c != null) {
            C40810g0.m118295a(fVar, c);
        }
    }

    /* renamed from: c */
    public static final UndeliveredElementException m120769c(C43075l lVar, Object obj, UndeliveredElementException undeliveredElementException) {
        try {
            lVar.invoke(obj);
        } catch (Throwable th) {
            if (undeliveredElementException == null || undeliveredElementException.getCause() == th) {
                return new UndeliveredElementException("Exception in undelivered element handler for " + obj, th);
            }
            C41211b.m119461a(undeliveredElementException, th);
        }
        return undeliveredElementException;
    }

    /* renamed from: d */
    public static /* synthetic */ UndeliveredElementException m120770d(C43075l lVar, Object obj, UndeliveredElementException undeliveredElementException, int i, Object obj2) {
        if ((i & 2) != 0) {
            undeliveredElementException = null;
        }
        return m120769c(lVar, obj, undeliveredElementException);
    }
}
