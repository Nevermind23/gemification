package p238ra;

import java.util.Iterator;
import java.util.Set;
import p326y8.C9104c;
import p326y8.C9110e;
import p326y8.C9131r;

/* renamed from: ra.c */
public class C8080c implements C8087i {

    /* renamed from: a */
    private final String f23241a;

    /* renamed from: b */
    private final C8081d f23242b;

    C8080c(Set set, C8081d dVar) {
        this.f23241a = m30606e(set);
        this.f23242b = dVar;
    }

    /* renamed from: c */
    public static C9104c m30604c() {
        return C9104c.m33561c(C8087i.class).mo24662b(C9131r.m33674m(C8083f.class)).mo24666f(new C8079b()).mo24664d();
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public static /* synthetic */ C8087i m30605d(C9110e eVar) {
        return new C8080c(eVar.mo24671d(C8083f.class), C8081d.m30608a());
    }

    /* renamed from: e */
    private static String m30606e(Set set) {
        StringBuilder sb = new StringBuilder();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            C8083f fVar = (C8083f) it.next();
            sb.append(fVar.mo23260b());
            sb.append('/');
            sb.append(fVar.mo23261c());
            if (it.hasNext()) {
                sb.append(' ');
            }
        }
        return sb.toString();
    }

    /* renamed from: a */
    public String mo23265a() {
        if (this.f23242b.mo23266b().isEmpty()) {
            return this.f23241a;
        }
        return this.f23241a + ' ' + m30606e(this.f23242b.mo23266b());
    }
}
