package vy0;

import ed1.C40762x;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import p843nw.C26633o;
import p863pw.C27635m;
import p863pw.C27637o;
import ue1.C43075l;

/* renamed from: vy0.b */
public final class C39495b {

    /* renamed from: a */
    private final C26633o f93937a;

    /* renamed from: vy0.b$a */
    static final class C39496a extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ long f93938d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C39496a(long j) {
            super(1);
            this.f93938d = j;
        }

        /* renamed from: a */
        public final C27635m invoke(C27637o oVar) {
            Object obj;
            boolean z;
            C41536l.m120489i(oVar, "it");
            List w = C41343r.m119927w(oVar.mo67167a().values());
            long j = this.f93938d;
            Iterator it = w.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (((C27635m) obj).mo67126j() == j) {
                    z = true;
                    continue;
                } else {
                    z = false;
                    continue;
                }
                if (z) {
                    break;
                }
            }
            C27635m mVar = (C27635m) obj;
            mVar.getClass();
            return mVar;
        }
    }

    public C39495b(C26633o oVar) {
        C41536l.m120489i(oVar, "getCardDetailsUseCase");
        this.f93937a = oVar;
    }

    /* renamed from: c */
    public static /* synthetic */ C40762x m114813c(C39495b bVar, long j, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return bVar.mo93139b(j, z);
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public static final C27635m m114814d(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (C27635m) lVar.invoke(obj);
    }

    /* renamed from: b */
    public final C40762x mo93139b(long j, boolean z) {
        C40762x A = this.f93937a.mo65886c(z).mo94996P().mo95062A(new C39494a(new C39496a(j)));
        C41536l.m120488h(A, "cardId: Long, refresh: B…nterException()\n        }");
        return A;
    }
}
