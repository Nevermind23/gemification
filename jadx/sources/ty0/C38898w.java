package ty0;

import ed1.C40762x;
import java.util.Iterator;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import m70.C26148a;
import m70.C26156i;
import md0.C26186e;
import p341ge.bog.mobilebank.products.domain.AccountIsNullException;
import sy0.C38606b;
import ue1.C43075l;

/* renamed from: ty0.w */
public final class C38898w {

    /* renamed from: a */
    private final C38606b f92976a;

    /* renamed from: ty0.w$a */
    static final class C38899a extends C41537m implements C43075l {

        /* renamed from: d */
        public static final C38899a f92977d = new C38899a();

        C38899a() {
            super(1);
        }

        /* renamed from: a */
        public final C26148a invoke(C26156i iVar) {
            Object obj;
            C41536l.m120489i(iVar, "it");
            Iterator it = iVar.mo65188a().mo65182a().iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (((C26148a) obj).mo65084F()) {
                    break;
                }
            }
            C26148a aVar = (C26148a) obj;
            if (aVar != null) {
                return aVar;
            }
            throw new AccountIsNullException();
        }
    }

    public C38898w(C38606b bVar) {
        C41536l.m120489i(bVar, "repository");
        this.f92976a = bVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public static final C26148a m113719c(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (C26148a) lVar.invoke(obj);
    }

    /* renamed from: b */
    public final C40762x mo92594b() {
        C40762x A = C26186e.m81990h(this.f92976a.getAccountsAndDetails(false)).mo95062A(new C38896v(C38899a.f92977d));
        C41536l.m120488h(A, "repository.getAccountsAn…NullException()\n        }");
        return A;
    }
}
