package q41;

import java.io.IOException;
import kotlin.jvm.internal.C41536l;
import o41.C37635g;
import of1.C41880d0;
import of1.C41935w;
import p341ge.bog.mobilebank.shared2.network.NetworkException;

/* renamed from: q41.a */
public final class C38128a implements C41935w {

    /* renamed from: a */
    private final C37635g f91533a;

    public C38128a(C37635g gVar) {
        C41536l.m120489i(gVar, "connectionChecker");
        this.f91533a = gVar;
    }

    /* renamed from: a */
    public C41880d0 mo21294a(C41935w.C41936a aVar) {
        C41536l.m120489i(aVar, "chain");
        try {
            return aVar.mo97008a(aVar.mo97011w());
        } catch (NetworkException e) {
            throw e;
        } catch (IOException e2) {
            if (!this.f91533a.mo90814d()) {
                throw NetworkException.NotConnectedToNetwork.f83827d;
            } else if (!C37635g.m110655c(this.f91533a, (String[]) null, 1, (Object) null)) {
                throw NetworkException.NoInternetException.f83826d;
            } else {
                throw e2;
            }
        }
    }
}
