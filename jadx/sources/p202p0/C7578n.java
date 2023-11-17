package p202p0;

import android.net.Uri;
import android.os.Bundle;
import cf1.C40419j;
import com.salesforce.marketingcloud.UrlHandler;
import com.salesforce.marketingcloud.storage.p385db.C11755a;
import he1.C41217g;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ue1.C43064a;

/* renamed from: p0.n */
public final class C7578n {

    /* renamed from: m */
    private static final C7581b f22103m = new C7581b((DefaultConstructorMarker) null);

    /* renamed from: n */
    private static final Pattern f22104n = Pattern.compile("^[a-zA-Z]+[+\\w\\-.]*:");

    /* renamed from: a */
    private final String f22105a;

    /* renamed from: b */
    private final String f22106b;

    /* renamed from: c */
    private final String f22107c;

    /* renamed from: d */
    private final List f22108d = new ArrayList();

    /* renamed from: e */
    private final Map f22109e = new LinkedHashMap();
    /* access modifiers changed from: private */

    /* renamed from: f */
    public String f22110f;

    /* renamed from: g */
    private final C41217g f22111g = C41219i.m119470b(new C7585f(this));

    /* renamed from: h */
    private boolean f22112h;

    /* renamed from: i */
    private boolean f22113i;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public String f22114j;

    /* renamed from: k */
    private final C41217g f22115k = C41219i.m119470b(new C7584e(this));

    /* renamed from: l */
    private boolean f22116l;

    /* renamed from: p0.n$a */
    public static final class C7579a {

        /* renamed from: d */
        public static final C7580a f22117d = new C7580a((DefaultConstructorMarker) null);

        /* renamed from: a */
        private String f22118a;

        /* renamed from: b */
        private String f22119b;

        /* renamed from: c */
        private String f22120c;

        /* renamed from: p0.n$a$a */
        public static final class C7580a {
            private C7580a() {
            }

            public /* synthetic */ C7580a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        /* renamed from: a */
        public final C7578n mo22173a() {
            return new C7578n(this.f22118a, this.f22119b, this.f22120c);
        }

        /* renamed from: b */
        public final C7579a mo22174b(String str) {
            boolean z;
            C41536l.m120489i(str, UrlHandler.ACTION);
            if (str.length() > 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                this.f22119b = str;
                return this;
            }
            throw new IllegalArgumentException("The NavDeepLink cannot have an empty action.".toString());
        }

        /* renamed from: c */
        public final C7579a mo22175c(String str) {
            C41536l.m120489i(str, "mimeType");
            this.f22120c = str;
            return this;
        }

        /* renamed from: d */
        public final C7579a mo22176d(String str) {
            C41536l.m120489i(str, "uriPattern");
            this.f22118a = str;
            return this;
        }
    }

    /* renamed from: p0.n$b */
    private static final class C7581b {
        private C7581b() {
        }

        public /* synthetic */ C7581b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: p0.n$c */
    private static final class C7582c implements Comparable {

        /* renamed from: d */
        private String f22121d;

        /* renamed from: e */
        private String f22122e;

        public C7582c(String str) {
            List list;
            boolean z;
            C41536l.m120489i(str, "mimeType");
            List i = new C40419j(C11110u2.f31950c).mo94492i(str, 0);
            if (!i.isEmpty()) {
                ListIterator listIterator = i.listIterator(i.size());
                while (true) {
                    if (!listIterator.hasPrevious()) {
                        break;
                    }
                    if (((String) listIterator.previous()).length() == 0) {
                        z = true;
                        continue;
                    } else {
                        z = false;
                        continue;
                    }
                    if (!z) {
                        list = C41358y.m120032v0(i, listIterator.nextIndex() + 1);
                        break;
                    }
                }
                this.f22121d = (String) list.get(0);
                this.f22122e = (String) list.get(1);
            }
            list = C41341q.m119907j();
            this.f22121d = (String) list.get(0);
            this.f22122e = (String) list.get(1);
        }

        /* renamed from: a */
        public int compareTo(C7582c cVar) {
            int i;
            C41536l.m120489i(cVar, "other");
            if (C41536l.m120484d(this.f22121d, cVar.f22121d)) {
                i = 2;
            } else {
                i = 0;
            }
            if (C41536l.m120484d(this.f22122e, cVar.f22122e)) {
                return i + 1;
            }
            return i;
        }

        /* renamed from: b */
        public final String mo22178b() {
            return this.f22122e;
        }

        /* renamed from: c */
        public final String mo22179c() {
            return this.f22121d;
        }
    }

    /* renamed from: p0.n$d */
    private static final class C7583d {

        /* renamed from: a */
        private String f22123a;

        /* renamed from: b */
        private final List f22124b = new ArrayList();

        /* renamed from: a */
        public final void mo22181a(String str) {
            C41536l.m120489i(str, "name");
            this.f22124b.add(str);
        }

        /* renamed from: b */
        public final String mo22182b(int i) {
            return (String) this.f22124b.get(i);
        }

        /* renamed from: c */
        public final List mo22183c() {
            return this.f22124b;
        }

        /* renamed from: d */
        public final String mo22184d() {
            return this.f22123a;
        }

        /* renamed from: e */
        public final void mo22185e(String str) {
            this.f22123a = str;
        }

        /* renamed from: f */
        public final int mo22186f() {
            return this.f22124b.size();
        }
    }

    /* renamed from: p0.n$e */
    static final class C7584e extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C7578n f22125d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C7584e(C7578n nVar) {
            super(0);
            this.f22125d = nVar;
        }

        /* renamed from: b */
        public final Pattern invoke() {
            String a = this.f22125d.f22114j;
            if (a != null) {
                return Pattern.compile(a);
            }
            return null;
        }
    }

    /* renamed from: p0.n$f */
    static final class C7585f extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C7578n f22126d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C7585f(C7578n nVar) {
            super(0);
            this.f22126d = nVar;
        }

        /* renamed from: b */
        public final Pattern invoke() {
            String b = this.f22126d.f22110f;
            if (b != null) {
                return Pattern.compile(b, 2);
            }
            return null;
        }
    }

    public C7578n(String str, String str2, String str3) {
        boolean z;
        String str4 = str;
        this.f22105a = str4;
        this.f22106b = str2;
        this.f22107c = str3;
        if (str4 != null) {
            Uri parse = Uri.parse(str);
            if (parse.getQuery() != null) {
                z = true;
            } else {
                z = false;
            }
            this.f22112h = z;
            StringBuilder sb = new StringBuilder("^");
            if (!f22104n.matcher(str4).find()) {
                sb.append("http[s]?://");
            }
            Pattern compile = Pattern.compile("\\{(.+?)\\}");
            if (this.f22112h) {
                Matcher matcher = Pattern.compile("(\\?)").matcher(str4);
                if (matcher.find()) {
                    String substring = str4.substring(0, matcher.start());
                    C41536l.m120488h(substring, "this as java.lang.String…ing(startIndex, endIndex)");
                    C41536l.m120488h(compile, "fillInPattern");
                    this.f22116l = m28801c(substring, sb, compile);
                }
                for (String next : parse.getQueryParameterNames()) {
                    StringBuilder sb2 = new StringBuilder();
                    String queryParameter = parse.getQueryParameter(next);
                    if (queryParameter == null) {
                        this.f22113i = true;
                        queryParameter = next;
                    }
                    Matcher matcher2 = compile.matcher(queryParameter);
                    C7583d dVar = new C7583d();
                    int i = 0;
                    while (matcher2.find()) {
                        String group = matcher2.group(1);
                        if (group != null) {
                            dVar.mo22181a(group);
                            C41536l.m120488h(queryParameter, "queryParam");
                            String substring2 = queryParameter.substring(i, matcher2.start());
                            C41536l.m120488h(substring2, "this as java.lang.String…ing(startIndex, endIndex)");
                            sb2.append(Pattern.quote(substring2));
                            sb2.append("(.+?)?");
                            i = matcher2.end();
                        } else {
                            throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
                        }
                    }
                    if (i < queryParameter.length()) {
                        C41536l.m120488h(queryParameter, "queryParam");
                        String substring3 = queryParameter.substring(i);
                        C41536l.m120488h(substring3, "this as java.lang.String).substring(startIndex)");
                        sb2.append(Pattern.quote(substring3));
                    }
                    String sb3 = sb2.toString();
                    C41536l.m120488h(sb3, "argRegex.toString()");
                    dVar.mo22185e(C40439w.m117103B(sb3, ".*", "\\E.*\\Q", false, 4, (Object) null));
                    Map map = this.f22109e;
                    C41536l.m120488h(next, "paramName");
                    map.put(next, dVar);
                }
            } else {
                C41536l.m120488h(compile, "fillInPattern");
                this.f22116l = m28801c(str4, sb, compile);
            }
            String sb4 = sb.toString();
            C41536l.m120488h(sb4, "uriRegex.toString()");
            this.f22110f = C40439w.m117103B(sb4, ".*", "\\E.*\\Q", false, 4, (Object) null);
        }
        if (this.f22107c == null) {
            return;
        }
        if (Pattern.compile("^[\\s\\S]+/[\\s\\S]+$").matcher(this.f22107c).matches()) {
            C7582c cVar = new C7582c(this.f22107c);
            this.f22114j = C40439w.m117103B("^(" + cVar.mo22179c() + "|[*]+)/(" + cVar.mo22178b() + "|[*]+)$", "*|[*]", "[\\s\\S]", false, 4, (Object) null);
            return;
        }
        throw new IllegalArgumentException(("The given mimeType " + this.f22107c + " does not match to required \"type/subtype\" format").toString());
    }

    /* renamed from: c */
    private final boolean m28801c(String str, StringBuilder sb, Pattern pattern) {
        Matcher matcher = pattern.matcher(str);
        boolean z = !C40440x.m117139M(str, ".*", false, 2, (Object) null);
        int i = 0;
        while (matcher.find()) {
            String group = matcher.group(1);
            if (group != null) {
                this.f22108d.add(group);
                String substring = str.substring(i, matcher.start());
                C41536l.m120488h(substring, "this as java.lang.String…ing(startIndex, endIndex)");
                sb.append(Pattern.quote(substring));
                sb.append("([^/]+?)");
                i = matcher.end();
                z = false;
            } else {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
            }
        }
        if (i < str.length()) {
            String substring2 = str.substring(i);
            C41536l.m120488h(substring2, "this as java.lang.String).substring(startIndex)");
            sb.append(Pattern.quote(substring2));
        }
        sb.append("($|(\\?(.)*)|(\\#(.)*))");
        return z;
    }

    /* renamed from: i */
    private final Pattern m28802i() {
        return (Pattern) this.f22115k.getValue();
    }

    /* renamed from: j */
    private final Pattern m28803j() {
        return (Pattern) this.f22111g.getValue();
    }

    /* renamed from: m */
    private final boolean m28804m(Bundle bundle, String str, String str2, C7546i iVar) {
        if (iVar != null) {
            iVar.mo22083a().mo22273d(bundle, str, str2);
            return false;
        }
        bundle.putString(str, str2);
        return false;
    }

    /* renamed from: d */
    public final String mo22164d() {
        return this.f22106b;
    }

    /* renamed from: e */
    public final List mo22165e() {
        List list = this.f22108d;
        Collection<C7583d> values = this.f22109e.values();
        ArrayList arrayList = new ArrayList();
        for (C7583d c : values) {
            boolean unused = C41352v.m119965z(arrayList, c.mo22183c());
        }
        return C41358y.m120023m0(list, arrayList);
    }

    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof C7578n)) {
            return false;
        }
        C7578n nVar = (C7578n) obj;
        if (!C41536l.m120484d(this.f22105a, nVar.f22105a) || !C41536l.m120484d(this.f22106b, nVar.f22106b) || !C41536l.m120484d(this.f22107c, nVar.f22107c)) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public final Bundle mo22167f(Uri uri, Map map) {
        Matcher matcher;
        boolean z;
        Matcher matcher2;
        String str;
        Uri uri2 = uri;
        Map map2 = map;
        C41536l.m120489i(uri2, "deepLink");
        C41536l.m120489i(map2, "arguments");
        Pattern j = m28803j();
        if (j != null) {
            matcher = j.matcher(uri.toString());
        } else {
            matcher = null;
        }
        if (matcher == null || !matcher.matches()) {
            return null;
        }
        Bundle bundle = new Bundle();
        int size = this.f22108d.size();
        int i = 0;
        while (i < size) {
            String str2 = (String) this.f22108d.get(i);
            i++;
            String decode = Uri.decode(matcher.group(i));
            C7546i iVar = (C7546i) map2.get(str2);
            try {
                C41536l.m120488h(decode, C11755a.C11756a.f34100b);
                if (m28804m(bundle, str2, decode, iVar)) {
                    return null;
                }
            } catch (IllegalArgumentException unused) {
            }
        }
        if (this.f22112h) {
            for (String str3 : this.f22109e.keySet()) {
                C7583d dVar = (C7583d) this.f22109e.get(str3);
                String queryParameter = uri2.getQueryParameter(str3);
                if (this.f22113i) {
                    String uri3 = uri.toString();
                    C41536l.m120488h(uri3, "deepLink.toString()");
                    String H0 = C40440x.m117130H0(uri3, '?', (String) null, 2, (Object) null);
                    if (!C41536l.m120484d(H0, uri3)) {
                        queryParameter = H0;
                    }
                }
                if (queryParameter != null) {
                    C41536l.m120486f(dVar);
                    matcher2 = Pattern.compile(dVar.mo22184d(), 32).matcher(queryParameter);
                    if (!matcher2.matches()) {
                        return null;
                    }
                } else {
                    matcher2 = null;
                }
                Bundle bundle2 = new Bundle();
                try {
                    C41536l.m120486f(dVar);
                    int f = dVar.mo22186f();
                    for (int i2 = 0; i2 < f; i2++) {
                        if (matcher2 != null) {
                            str = matcher2.group(i2 + 1);
                            if (str == null) {
                                str = "";
                            }
                        } else {
                            str = null;
                        }
                        String b = dVar.mo22182b(i2);
                        C7546i iVar2 = (C7546i) map2.get(b);
                        if (str != null) {
                            if (!C41536l.m120484d(str, '{' + b + '}') && m28804m(bundle2, b, str, iVar2)) {
                                return null;
                            }
                        }
                    }
                    bundle.putAll(bundle2);
                } catch (IllegalArgumentException unused2) {
                }
            }
        }
        for (Map.Entry entry : map.entrySet()) {
            String str4 = (String) entry.getKey();
            C7546i iVar3 = (C7546i) entry.getValue();
            if (iVar3 == null || iVar3.mo22085c() || iVar3.mo22084b()) {
                z = false;
            } else {
                z = true;
            }
            if (z && !bundle.containsKey(str4)) {
                return null;
            }
        }
        return bundle;
    }

    /* renamed from: g */
    public final String mo22168g() {
        return this.f22107c;
    }

    /* renamed from: h */
    public final int mo22169h(String str) {
        C41536l.m120489i(str, "mimeType");
        if (this.f22107c != null) {
            Pattern i = m28802i();
            C41536l.m120486f(i);
            if (i.matcher(str).matches()) {
                return new C7582c(this.f22107c).compareTo(new C7582c(str));
            }
        }
        return -1;
    }

    public int hashCode() {
        int i;
        int i2;
        String str = this.f22105a;
        int i3 = 0;
        if (str != null) {
            i = str.hashCode();
        } else {
            i = 0;
        }
        int i4 = (i + 0) * 31;
        String str2 = this.f22106b;
        if (str2 != null) {
            i2 = str2.hashCode();
        } else {
            i2 = 0;
        }
        int i5 = (i4 + i2) * 31;
        String str3 = this.f22107c;
        if (str3 != null) {
            i3 = str3.hashCode();
        }
        return i5 + i3;
    }

    /* renamed from: k */
    public final String mo22171k() {
        return this.f22105a;
    }

    /* renamed from: l */
    public final boolean mo22172l() {
        return this.f22116l;
    }
}
