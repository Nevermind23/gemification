package hh1;

import fh1.C40951a;
import fh1.C40952b;
import kotlin.jvm.internal.C41536l;
import org.koin.core.error.KoinAppAlreadyStartedException;
import ue1.C43075l;

/* renamed from: hh1.a */
public final class C41266a implements C41268c {

    /* renamed from: a */
    private static C40951a f97284a;

    /* renamed from: b */
    public static final C41266a f97285b = new C41266a();

    private C41266a() {
    }

    /* renamed from: a */
    public void mo95729a(C40952b bVar) {
        C41536l.m120489i(bVar, "koinApplication");
        if (f97284a == null) {
            f97284a = bVar.mo95348c();
            return;
        }
        throw new KoinAppAlreadyStartedException("A Koin Application has already been started");
    }

    /* renamed from: b */
    public C40951a mo95730b() {
        C40951a aVar = f97284a;
        if (aVar != null) {
            return aVar;
        }
        throw new IllegalStateException("KoinApplication has not been started".toString());
    }

    /* renamed from: c */
    public final C40952b mo95731c(C41268c cVar, C43075l lVar) {
        C40952b a;
        C41536l.m120489i(cVar, "koinContext");
        C41536l.m120489i(lVar, "appDeclaration");
        synchronized (this) {
            a = C40952b.f96727b.mo95352a();
            cVar.mo95729a(a);
            lVar.invoke(a);
            a.mo95347b();
        }
        return a;
    }
}
