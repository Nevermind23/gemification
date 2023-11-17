package p523mm;

import ed1.C40762x;
import kotlin.jvm.internal.C41536l;
import p509lm.C16586a;

/* renamed from: mm.q */
public final class C16767q {

    /* renamed from: a */
    private final C16586a f47011a;

    public C16767q(C16586a aVar) {
        C41536l.m120489i(aVar, "repository");
        this.f47011a = aVar;
    }

    /* renamed from: b */
    public static /* synthetic */ C40762x m59198b(C16767q qVar, String str, String str2, boolean z, int i, Object obj) {
        if ((i & 4) != 0) {
            z = false;
        }
        return qVar.mo43885a(str, str2, z);
    }

    /* renamed from: a */
    public final C40762x mo43885a(String str, String str2, boolean z) {
        C41536l.m120489i(str, "plcType");
        C41536l.m120489i(str2, "plcClass");
        return this.f47011a.mo42402O3(str, str2, z);
    }
}
