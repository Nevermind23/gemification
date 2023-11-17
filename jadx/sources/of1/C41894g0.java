package of1;

import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: of1.g0 */
public enum C41894g0 {
    TLS_1_3("TLSv1.3"),
    TLS_1_2("TLSv1.2"),
    TLS_1_1("TLSv1.1"),
    TLS_1_0("TLSv1"),
    SSL_3_0("SSLv3");
    

    /* renamed from: e */
    public static final C41895a f98356e = null;

    /* renamed from: d */
    private final String f98363d;

    /* renamed from: of1.g0$a */
    public static final class C41895a {
        private C41895a() {
        }

        public /* synthetic */ C41895a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final C41894g0 mo96819a(String str) {
            C41536l.m120489i(str, "javaName");
            int hashCode = str.hashCode();
            if (hashCode != 79201641) {
                if (hashCode != 79923350) {
                    switch (hashCode) {
                        case -503070503:
                            if (str.equals("TLSv1.1")) {
                                return C41894g0.TLS_1_1;
                            }
                            break;
                        case -503070502:
                            if (str.equals("TLSv1.2")) {
                                return C41894g0.TLS_1_2;
                            }
                            break;
                        case -503070501:
                            if (str.equals("TLSv1.3")) {
                                return C41894g0.TLS_1_3;
                            }
                            break;
                    }
                } else if (str.equals("TLSv1")) {
                    return C41894g0.TLS_1_0;
                }
            } else if (str.equals("SSLv3")) {
                return C41894g0.SSL_3_0;
            }
            throw new IllegalArgumentException(C41536l.m120497q("Unexpected TLS version: ", str));
        }
    }

    static {
        f98356e = new C41895a((DefaultConstructorMarker) null);
    }

    private C41894g0(String str) {
        this.f98363d = str;
    }

    /* renamed from: b */
    public final String mo96818b() {
        return this.f98363d;
    }
}
