package s10;

import g91.C32299e;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.C41536l;
import p366bk.C10320i;
import p891su.C28261a;
import p891su.C28262b;
import t10.C28296a;
import t10.C28297b;
import t10.C28298c;
import w10.C29190a;

/* renamed from: s10.a */
public final class C28122a {
    /* renamed from: a */
    public final C28296a mo67654a(C28262b bVar) {
        boolean z;
        int i;
        C41536l.m120489i(bVar, "contactAccount");
        long f = bVar.mo67872f();
        Integer valueOf = Integer.valueOf(C32299e.m95163a(bVar.mo67870e()));
        if (valueOf.intValue() != -1) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            valueOf = null;
        }
        if (valueOf != null) {
            i = valueOf.intValue();
        } else {
            i = C10320i.default_small;
        }
        return new C28296a(f, i, bVar.mo67869d(), bVar.mo67873g(), bVar.mo67868c());
    }

    /* renamed from: b */
    public final List mo67655b(C28261a aVar) {
        C41536l.m120489i(aVar, "contact");
        List<C28262b> c = aVar.mo67845c();
        ArrayList arrayList = new ArrayList(C41343r.m119925u(c, 10));
        for (C28262b a : c) {
            arrayList.add(mo67654a(a));
        }
        return arrayList;
    }

    /* renamed from: c */
    public final C28297b mo67656c(C28261a aVar) {
        C41536l.m120489i(aVar, "contact");
        return new C28297b(aVar.mo67853i(), aVar.mo67858n(), aVar.mo67862r(), aVar.mo67859o());
    }

    /* renamed from: d */
    public final C28298c mo67657d(C28261a aVar) {
        C41536l.m120489i(aVar, "contact");
        return new C28298c(C29190a.m89130b(aVar), C29190a.m89129a(aVar), aVar.mo67861q(), aVar.mo67856l());
    }
}
