package of1;

import java.io.IOException;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: of1.a0 */
public enum C41864a0 {
    HTTP_1_0("http/1.0"),
    HTTP_1_1("http/1.1"),
    SPDY_3("spdy/3.1"),
    HTTP_2("h2"),
    H2_PRIOR_KNOWLEDGE("h2_prior_knowledge"),
    QUIC("quic");
    

    /* renamed from: e */
    public static final C41865a f98252e = null;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final String f98260d;

    /* renamed from: of1.a0$a */
    public static final class C41865a {
        private C41865a() {
        }

        public /* synthetic */ C41865a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final C41864a0 mo96671a(String str) {
            C41536l.m120489i(str, "protocol");
            C41864a0 a0Var = C41864a0.HTTP_1_0;
            if (!C41536l.m120484d(str, a0Var.f98260d)) {
                a0Var = C41864a0.HTTP_1_1;
                if (!C41536l.m120484d(str, a0Var.f98260d)) {
                    a0Var = C41864a0.H2_PRIOR_KNOWLEDGE;
                    if (!C41536l.m120484d(str, a0Var.f98260d)) {
                        a0Var = C41864a0.HTTP_2;
                        if (!C41536l.m120484d(str, a0Var.f98260d)) {
                            a0Var = C41864a0.SPDY_3;
                            if (!C41536l.m120484d(str, a0Var.f98260d)) {
                                a0Var = C41864a0.QUIC;
                                if (!C41536l.m120484d(str, a0Var.f98260d)) {
                                    throw new IOException(C41536l.m120497q("Unexpected protocol: ", str));
                                }
                            }
                        }
                    }
                }
            }
            return a0Var;
        }
    }

    static {
        f98252e = new C41865a((DefaultConstructorMarker) null);
    }

    private C41864a0(String str) {
        this.f98260d = str;
    }

    public String toString() {
        return this.f98260d;
    }
}
