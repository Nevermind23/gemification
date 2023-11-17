package p168m5;

import java.util.Set;
import p142k5.C6811b;
import p142k5.C6814e;
import p142k5.C6815f;
import p142k5.C6816g;

/* renamed from: m5.q */
final class C7131q implements C6816g {

    /* renamed from: a */
    private final Set f21128a;

    /* renamed from: b */
    private final C7129p f21129b;

    /* renamed from: c */
    private final C7134t f21130c;

    C7131q(Set set, C7129p pVar, C7134t tVar) {
        this.f21128a = set;
        this.f21129b = pVar;
        this.f21130c = tVar;
    }

    /* renamed from: a */
    public C6815f mo20889a(String str, Class cls, C6811b bVar, C6814e eVar) {
        if (this.f21128a.contains(bVar)) {
            return new C7133s(this.f21129b, str, bVar, eVar, this.f21130c);
        }
        throw new IllegalArgumentException(String.format("%s is not supported byt this factory. Supported encodings are: %s.", new Object[]{bVar, this.f21128a}));
    }
}
