package p441go;

import ed1.C40762x;
import kotlin.jvm.internal.C41536l;
import p483jo.C16301a;

/* renamed from: go.l */
public final class C15389l {

    /* renamed from: a */
    private final C16301a f43791a;

    public C15389l(C16301a aVar) {
        C41536l.m120489i(aVar, "repository");
        this.f43791a = aVar;
    }

    /* renamed from: b */
    public static /* synthetic */ C40762x m55858b(C15389l lVar, String str, String str2, boolean z, int i, Object obj) {
        if ((i & 4) != 0) {
            z = false;
        }
        return lVar.mo42489a(str, str2, z);
    }

    /* renamed from: a */
    public final C40762x mo42489a(String str, String str2, boolean z) {
        C41536l.m120489i(str, "existingPackageName");
        C41536l.m120489i(str2, "newPackageName");
        return this.f43791a.mo32957F3(str, str2, z);
    }
}
