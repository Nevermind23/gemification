package mx0;

import com.google.gson.Gson;
import ed1.C40762x;
import java.util.List;
import kotlin.jvm.internal.C41536l;
import kx0.C37013a;

/* renamed from: mx0.e */
public final class C37291e {

    /* renamed from: a */
    private final C37013a f89739a;

    public C37291e(C37013a aVar) {
        C41536l.m120489i(aVar, "repository");
        this.f89739a = aVar;
    }

    /* renamed from: a */
    public final C40762x mo90401a(String str, String str2, List list) {
        C41536l.m120489i(str, "requestId");
        C41536l.m120489i(str2, "essServiceId");
        C41536l.m120489i(list, "essParameters");
        return this.f89739a.mo89392A(str, str2, new Gson().mo18181w(list));
    }
}
