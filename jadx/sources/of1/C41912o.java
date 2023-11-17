package of1;

import dg1.C40681e;
import java.nio.charset.Charset;
import kotlin.jvm.internal.C41536l;

/* renamed from: of1.o */
public final class C41912o {

    /* renamed from: a */
    public static final C41912o f98522a = new C41912o();

    private C41912o() {
    }

    /* renamed from: a */
    public static final String m121535a(String str, String str2, Charset charset) {
        C41536l.m120489i(str, "username");
        C41536l.m120489i(str2, "password");
        C41536l.m120489i(charset, "charset");
        return C41536l.m120497q("Basic ", C40681e.f96327g.mo94821b(str + ':' + str2, charset).mo94799a());
    }
}
