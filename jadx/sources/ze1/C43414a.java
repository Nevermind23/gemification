package ze1;

import com.salesforce.marketingcloud.storage.p385db.C11755a;
import kotlin.jvm.internal.C41536l;

/* renamed from: ze1.a */
public interface C43414a {

    /* renamed from: ze1.a$a */
    public static final class C43415a {
        /* renamed from: a */
        public static boolean m124538a(C43414a aVar, Comparable comparable) {
            C41536l.m120489i(comparable, C11755a.C11756a.f34100b);
            if (comparable.compareTo(aVar.mo102098b()) < 0 || comparable.compareTo(aVar.mo102100i()) > 0) {
                return false;
            }
            return true;
        }

        /* renamed from: b */
        public static boolean m124539b(C43414a aVar) {
            return aVar.mo102098b().compareTo(aVar.mo102100i()) > 0;
        }
    }

    /* renamed from: b */
    Comparable mo102098b();

    /* renamed from: c */
    boolean mo102099c(Comparable comparable);

    /* renamed from: i */
    Comparable mo102100i();
}
