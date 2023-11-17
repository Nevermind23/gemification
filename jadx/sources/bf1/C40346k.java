package bf1;

import java.util.Iterator;
import kotlin.jvm.internal.C41536l;
import ue1.C43079p;

/* renamed from: bf1.k */
abstract class C40346k {

    /* renamed from: bf1.k$a */
    public static final class C40347a implements C40342g {

        /* renamed from: a */
        final /* synthetic */ C43079p f95844a;

        public C40347a(C43079p pVar) {
            this.f95844a = pVar;
        }

        public Iterator iterator() {
            return C40346k.m116840a(this.f95844a);
        }
    }

    /* renamed from: a */
    public static Iterator m116840a(C43079p pVar) {
        C41536l.m120489i(pVar, "block");
        C40343h hVar = new C40343h();
        hVar.mo94386o(C41790c.m121153a(pVar, hVar, hVar));
        return hVar;
    }

    /* renamed from: b */
    public static C40342g m116841b(C43079p pVar) {
        C41536l.m120489i(pVar, "block");
        return new C40347a(pVar);
    }
}
