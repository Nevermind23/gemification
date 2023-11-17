package of1;

import com.salesforce.marketingcloud.sfmcsdk.components.http.Request;
import com.salesforce.marketingcloud.storage.p385db.C11755a;
import com.salesforce.marketingcloud.storage.p385db.C11769i;
import com.salesforce.marketingcloud.storage.p385db.C11772k;
import he1.C41224m;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.C41536l;
import of1.C41928u;
import pf1.C42197d;
import uf1.C43093f;

/* renamed from: of1.b0 */
public final class C41869b0 {

    /* renamed from: a */
    private final C41931v f98265a;

    /* renamed from: b */
    private final String f98266b;

    /* renamed from: c */
    private final C41928u f98267c;

    /* renamed from: d */
    private final C41872c0 f98268d;

    /* renamed from: e */
    private final Map f98269e;

    /* renamed from: f */
    private C41877d f98270f;

    public C41869b0(C41931v vVar, String str, C41928u uVar, C41872c0 c0Var, Map map) {
        C41536l.m120489i(vVar, C11769i.C11770a.f34149l);
        C41536l.m120489i(str, "method");
        C41536l.m120489i(uVar, "headers");
        C41536l.m120489i(map, C11772k.C11773a.f34175g);
        this.f98265a = vVar;
        this.f98266b = str;
        this.f98267c = uVar;
        this.f98268d = c0Var;
        this.f98269e = map;
    }

    /* renamed from: a */
    public final C41872c0 mo96672a() {
        return this.f98268d;
    }

    /* renamed from: b */
    public final C41877d mo96673b() {
        C41877d dVar = this.f98270f;
        if (dVar != null) {
            return dVar;
        }
        C41877d b = C41877d.f98285n.mo96735b(this.f98267c);
        this.f98270f = b;
        return b;
    }

    /* renamed from: c */
    public final Map mo96674c() {
        return this.f98269e;
    }

    /* renamed from: d */
    public final String mo96675d(String str) {
        C41536l.m120489i(str, "name");
        return this.f98267c.mo96925b(str);
    }

    /* renamed from: e */
    public final C41928u mo96676e() {
        return this.f98267c;
    }

    /* renamed from: f */
    public final boolean mo96677f() {
        return this.f98265a.mo96955j();
    }

    /* renamed from: g */
    public final String mo96678g() {
        return this.f98266b;
    }

    /* renamed from: h */
    public final C41870a mo96679h() {
        return new C41870a(this);
    }

    /* renamed from: i */
    public final Object mo96680i(Class cls) {
        C41536l.m120489i(cls, "type");
        return cls.cast(this.f98269e.get(cls));
    }

    /* renamed from: j */
    public final C41931v mo96681j() {
        return this.f98265a;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Request{method=");
        sb.append(mo96678g());
        sb.append(", url=");
        sb.append(mo96681j());
        if (mo96676e().size() != 0) {
            sb.append(", headers=[");
            int i = 0;
            for (Object next : mo96676e()) {
                int i2 = i + 1;
                if (i < 0) {
                    C41341q.m119917t();
                }
                C41224m mVar = (C41224m) next;
                String str = (String) mVar.mo95675a();
                String str2 = (String) mVar.mo95676b();
                if (i > 0) {
                    sb.append(", ");
                }
                sb.append(str);
                sb.append(':');
                sb.append(str2);
                i = i2;
            }
            sb.append(']');
        }
        if (!mo96674c().isEmpty()) {
            sb.append(", tags=");
            sb.append(mo96674c());
        }
        sb.append('}');
        String sb2 = sb.toString();
        C41536l.m120488h(sb2, "StringBuilder().apply(builderAction).toString()");
        return sb2;
    }

    /* renamed from: of1.b0$a */
    public static class C41870a {

        /* renamed from: a */
        private C41931v f98271a;

        /* renamed from: b */
        private String f98272b;

        /* renamed from: c */
        private C41928u.C41929a f98273c;

        /* renamed from: d */
        private C41872c0 f98274d;

        /* renamed from: e */
        private Map f98275e;

        public C41870a() {
            this.f98275e = new LinkedHashMap();
            this.f98272b = "GET";
            this.f98273c = new C41928u.C41929a();
        }

        /* renamed from: a */
        public C41870a mo96683a(String str, String str2) {
            C41536l.m120489i(str, "name");
            C41536l.m120489i(str2, C11755a.C11756a.f34100b);
            mo96688f().mo96936a(str, str2);
            return this;
        }

        /* renamed from: b */
        public C41869b0 mo96684b() {
            C41931v vVar = this.f98271a;
            if (vVar != null) {
                return new C41869b0(vVar, this.f98272b, this.f98273c.mo96941f(), this.f98274d, C42197d.m122528V(this.f98275e));
            }
            throw new IllegalStateException("url == null".toString());
        }

        /* renamed from: c */
        public C41870a mo96685c(C41877d dVar) {
            boolean z;
            C41536l.m120489i(dVar, "cacheControl");
            String dVar2 = dVar.toString();
            if (dVar2.length() == 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                return mo96697o("Cache-Control");
            }
            return mo96691i("Cache-Control", dVar2);
        }

        /* renamed from: d */
        public C41870a mo96686d(C41872c0 c0Var) {
            return mo96693k("DELETE", c0Var);
        }

        /* renamed from: e */
        public C41870a mo96687e() {
            return mo96693k("GET", (C41872c0) null);
        }

        /* renamed from: f */
        public final C41928u.C41929a mo96688f() {
            return this.f98273c;
        }

        /* renamed from: g */
        public final Map mo96689g() {
            return this.f98275e;
        }

        /* renamed from: h */
        public C41870a mo96690h() {
            return mo96693k("HEAD", (C41872c0) null);
        }

        /* renamed from: i */
        public C41870a mo96691i(String str, String str2) {
            C41536l.m120489i(str, "name");
            C41536l.m120489i(str2, C11755a.C11756a.f34100b);
            mo96688f().mo96944i(str, str2);
            return this;
        }

        /* renamed from: j */
        public C41870a mo96692j(C41928u uVar) {
            C41536l.m120489i(uVar, "headers");
            mo96699q(uVar.mo96931j());
            return this;
        }

        /* renamed from: k */
        public C41870a mo96693k(String str, C41872c0 c0Var) {
            boolean z;
            C41536l.m120489i(str, "method");
            if (str.length() > 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                if (c0Var == null) {
                    if (!(true ^ C43093f.m123648d(str))) {
                        throw new IllegalArgumentException(("method " + str + " must have a request body.").toString());
                    }
                } else if (!C43093f.m123647a(str)) {
                    throw new IllegalArgumentException(("method " + str + " must not have a request body.").toString());
                }
                mo96700r(str);
                mo96698p(c0Var);
                return this;
            }
            throw new IllegalArgumentException("method.isEmpty() == true".toString());
        }

        /* renamed from: l */
        public C41870a mo96694l(C41872c0 c0Var) {
            C41536l.m120489i(c0Var, "body");
            return mo96693k("PATCH", c0Var);
        }

        /* renamed from: m */
        public C41870a mo96695m(C41872c0 c0Var) {
            C41536l.m120489i(c0Var, "body");
            return mo96693k("POST", c0Var);
        }

        /* renamed from: n */
        public C41870a mo96696n(C41872c0 c0Var) {
            C41536l.m120489i(c0Var, "body");
            return mo96693k(Request.PUT, c0Var);
        }

        /* renamed from: o */
        public C41870a mo96697o(String str) {
            C41536l.m120489i(str, "name");
            mo96688f().mo96943h(str);
            return this;
        }

        /* renamed from: p */
        public final void mo96698p(C41872c0 c0Var) {
            this.f98274d = c0Var;
        }

        /* renamed from: q */
        public final void mo96699q(C41928u.C41929a aVar) {
            C41536l.m120489i(aVar, "<set-?>");
            this.f98273c = aVar;
        }

        /* renamed from: r */
        public final void mo96700r(String str) {
            C41536l.m120489i(str, "<set-?>");
            this.f98272b = str;
        }

        /* renamed from: s */
        public final void mo96701s(Map map) {
            C41536l.m120489i(map, "<set-?>");
            this.f98275e = map;
        }

        /* renamed from: t */
        public final void mo96702t(C41931v vVar) {
            this.f98271a = vVar;
        }

        /* renamed from: u */
        public C41870a mo96703u(Class cls, Object obj) {
            C41536l.m120489i(cls, "type");
            if (obj == null) {
                mo96689g().remove(cls);
            } else {
                if (mo96689g().isEmpty()) {
                    mo96701s(new LinkedHashMap());
                }
                Map g = mo96689g();
                Object cast = cls.cast(obj);
                C41536l.m120486f(cast);
                g.put(cls, cast);
            }
            return this;
        }

        /* renamed from: v */
        public C41870a mo96704v(Object obj) {
            return mo96703u(Object.class, obj);
        }

        /* renamed from: w */
        public C41870a mo96705w(String str) {
            C41536l.m120489i(str, C11769i.C11770a.f34149l);
            if (C40439w.m117107F(str, "ws:", true)) {
                String substring = str.substring(3);
                C41536l.m120488h(substring, "this as java.lang.String).substring(startIndex)");
                str = C41536l.m120497q("http:", substring);
            } else if (C40439w.m117107F(str, "wss:", true)) {
                String substring2 = str.substring(4);
                C41536l.m120488h(substring2, "this as java.lang.String).substring(startIndex)");
                str = C41536l.m120497q("https:", substring2);
            }
            return mo96706x(C41931v.f98552k.mo97002d(str));
        }

        /* renamed from: x */
        public C41870a mo96706x(C41931v vVar) {
            C41536l.m120489i(vVar, C11769i.C11770a.f34149l);
            mo96702t(vVar);
            return this;
        }

        public C41870a(C41869b0 b0Var) {
            Map map;
            C41536l.m120489i(b0Var, "request");
            this.f98275e = new LinkedHashMap();
            this.f98271a = b0Var.mo96681j();
            this.f98272b = b0Var.mo96678g();
            this.f98274d = b0Var.mo96672a();
            if (b0Var.mo96674c().isEmpty()) {
                map = new LinkedHashMap();
            } else {
                map = C41344r0.m119943y(b0Var.mo96674c());
            }
            this.f98275e = map;
            this.f98273c = b0Var.mo96676e().mo96931j();
        }
    }
}
