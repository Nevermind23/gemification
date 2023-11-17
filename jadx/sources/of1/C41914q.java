package of1;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.List;
import kotlin.jvm.internal.C41536l;

/* renamed from: of1.q */
public interface C41914q {

    /* renamed from: a */
    public static final C41915a f98530a = C41915a.f98532a;

    /* renamed from: b */
    public static final C41914q f98531b = new C41915a.C41916a();

    /* renamed from: of1.q$a */
    public static final class C41915a {

        /* renamed from: a */
        static final /* synthetic */ C41915a f98532a = new C41915a();

        /* renamed from: of1.q$a$a */
        private static final class C41916a implements C41914q {
            /* renamed from: a */
            public List mo96882a(String str) {
                C41536l.m120489i(str, "hostname");
                try {
                    InetAddress[] allByName = InetAddress.getAllByName(str);
                    C41536l.m120488h(allByName, "getAllByName(hostname)");
                    return C41333m.m119788O(allByName);
                } catch (NullPointerException e) {
                    UnknownHostException unknownHostException = new UnknownHostException(C41536l.m120497q("Broken system behaviour for dns lookup of ", str));
                    unknownHostException.initCause(e);
                    throw unknownHostException;
                }
            }
        }

        private C41915a() {
        }
    }

    /* renamed from: a */
    List mo96882a(String str);
}
