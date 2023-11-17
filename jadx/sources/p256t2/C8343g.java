package p256t2;

import he1.C41238w;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.C41536l;
import p256t2.C8336c;

/* renamed from: t2.g */
public class C8343g {

    /* renamed from: a */
    private final C8336c f23748a;

    /* renamed from: t2.g$a */
    public interface C8344a {
        /* renamed from: a */
        Object mo20303a(C8343g gVar);
    }

    /* renamed from: t2.g$b */
    public interface C8345b {
        /* renamed from: a */
        Object mo20301a(C8343g gVar);
    }

    /* renamed from: t2.g$c */
    public static final class C8346c implements C8344a {

        /* renamed from: a */
        final /* synthetic */ C8343g f23749a;

        C8346c(C8343g gVar) {
            this.f23749a = gVar;
        }

        /* renamed from: a */
        public Object mo20303a(C8343g gVar) {
            C41536l.m120490j(gVar, "reader");
            if (this.f23749a.mo23537d()) {
                return this.f23749a.mo23545n();
            }
            if (this.f23749a.mo23538g()) {
                return this.f23749a.mo23546o();
            }
            return gVar.mo23543l(true);
        }
    }

    /* renamed from: t2.g$d */
    public static final class C8347d implements C8345b {
        C8347d() {
        }

        /* renamed from: b */
        public Map mo20301a(C8343g gVar) {
            C41536l.m120490j(gVar, "reader");
            return gVar.mo23548q();
        }
    }

    public C8343g(C8336c cVar) {
        C41536l.m120490j(cVar, "jsonReader");
        this.f23748a = cVar;
    }

    /* renamed from: a */
    private final void m31384a(boolean z) {
        if (!z && this.f23748a.mo23490D() == C8336c.C8337a.NULL) {
            throw new NullPointerException("corrupted response reader, expected non null value");
        }
    }

    /* renamed from: c */
    private final boolean m31385c() {
        return this.f23748a.mo23490D() == C8336c.C8337a.BOOLEAN;
    }

    /* renamed from: e */
    private final boolean m31386e() {
        return this.f23748a.mo23490D() == C8336c.C8337a.NULL;
    }

    /* renamed from: f */
    private final boolean m31387f() {
        return this.f23748a.mo23490D() == C8336c.C8337a.NUMBER;
    }

    /* renamed from: b */
    public final boolean mo23536b() {
        return this.f23748a.hasNext();
    }

    /* renamed from: d */
    public final boolean mo23537d() {
        return this.f23748a.mo23490D() == C8336c.C8337a.BEGIN_ARRAY;
    }

    /* renamed from: g */
    public final boolean mo23538g() {
        return this.f23748a.mo23490D() == C8336c.C8337a.BEGIN_OBJECT;
    }

    /* renamed from: h */
    public final Boolean mo23539h(boolean z) {
        m31384a(z);
        if (this.f23748a.mo23490D() == C8336c.C8337a.NULL) {
            return (Boolean) this.f23748a.mo23497d1();
        }
        return Boolean.valueOf(this.f23748a.mo23491E0());
    }

    /* renamed from: i */
    public final List mo23540i(boolean z, C8344a aVar) {
        C41536l.m120490j(aVar, "listReader");
        m31384a(z);
        if (this.f23748a.mo23490D() == C8336c.C8337a.NULL) {
            return (List) this.f23748a.mo23497d1();
        }
        this.f23748a.mo23504z0();
        ArrayList arrayList = new ArrayList();
        while (this.f23748a.hasNext()) {
            arrayList.add(aVar.mo20303a(this));
        }
        this.f23748a.mo23502y0();
        return arrayList;
    }

    /* renamed from: j */
    public final String mo23541j() {
        return this.f23748a.mo23494b0();
    }

    /* renamed from: k */
    public final Object mo23542k(boolean z, C8345b bVar) {
        C41536l.m120490j(bVar, "objectReader");
        m31384a(z);
        if (this.f23748a.mo23490D() == C8336c.C8337a.NULL) {
            return this.f23748a.mo23497d1();
        }
        this.f23748a.mo23501v0();
        Object a = bVar.mo20301a(this);
        this.f23748a.mo23495c1();
        return a;
    }

    /* renamed from: l */
    public Object mo23543l(boolean z) {
        m31384a(z);
        if (m31386e()) {
            mo23547p();
            C41238w wVar = C41238w.f97225a;
            return null;
        } else if (m31385c()) {
            return mo23539h(false);
        } else {
            if (!m31387f()) {
                return mo23544m(false);
            }
            String m = mo23544m(false);
            if (m == null) {
                C41536l.m120500t();
            }
            return new BigDecimal(m);
        }
    }

    /* renamed from: m */
    public final String mo23544m(boolean z) {
        m31384a(z);
        if (this.f23748a.mo23490D() == C8336c.C8337a.NULL) {
            return (String) this.f23748a.mo23497d1();
        }
        return this.f23748a.mo23492I0();
    }

    /* renamed from: n */
    public final List mo23545n() {
        return mo23540i(false, new C8346c(this));
    }

    /* renamed from: o */
    public final Map mo23546o() {
        return (Map) mo23542k(false, new C8347d());
    }

    /* renamed from: p */
    public final void mo23547p() {
        this.f23748a.mo23493N();
    }

    /* renamed from: q */
    public final Map mo23548q() {
        if (mo23538g()) {
            return mo23546o();
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        while (mo23536b()) {
            String j = mo23541j();
            if (m31386e()) {
                mo23547p();
                C41238w wVar = C41238w.f97225a;
                linkedHashMap.put(j, (Object) null);
            } else if (mo23538g()) {
                linkedHashMap.put(j, mo23546o());
            } else if (mo23537d()) {
                linkedHashMap.put(j, mo23545n());
            } else {
                linkedHashMap.put(j, mo23543l(true));
            }
        }
        return linkedHashMap;
    }
}
