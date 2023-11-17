package g91;

import android.os.Bundle;
import g61.C32104a;
import kotlin.jvm.internal.C41536l;
import p380ck.C10463g;
import p380ck.C10464h;

/* renamed from: g91.s0 */
public final class C32333s0 {

    /* renamed from: a */
    public static final C32333s0 f79767a = new C32333s0();

    private C32333s0() {
    }

    /* renamed from: a */
    public static final void m95355a(C32104a aVar, C10463g gVar) {
        String str;
        C41536l.m120489i(aVar, "<this>");
        C41536l.m120489i(gVar, "analytics");
        String a = aVar.mo72580a();
        String c = aVar.mo72582c();
        Integer b = aVar.mo72581b();
        if (b != null) {
            b.intValue();
            str = "|" + aVar.mo72581b();
        } else {
            str = null;
        }
        if (str == null) {
            str = "";
        }
        C32343x.m95399K0(gVar, "BOG_APP_STORIES", a, c + str, (C10464h.C10465a) null, (Bundle) null, 24, (Object) null);
    }
}
