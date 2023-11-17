package p293w0;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p267u0.C8485n;
import p318y0.C8998i;

/* renamed from: w0.d */
public final class C8724d {

    /* renamed from: e */
    public static final C8727b f24535e = new C8727b((DefaultConstructorMarker) null);

    /* renamed from: a */
    public final String f24536a;

    /* renamed from: b */
    public final Map f24537b;

    /* renamed from: c */
    public final Set f24538c;

    /* renamed from: d */
    public final Set f24539d;

    /* renamed from: w0.d$a */
    public static final class C8725a {

        /* renamed from: h */
        public static final C8726a f24540h = new C8726a((DefaultConstructorMarker) null);

        /* renamed from: a */
        public final String f24541a;

        /* renamed from: b */
        public final String f24542b;

        /* renamed from: c */
        public final boolean f24543c;

        /* renamed from: d */
        public final int f24544d;

        /* renamed from: e */
        public final String f24545e;

        /* renamed from: f */
        public final int f24546f;

        /* renamed from: g */
        public final int f24547g;

        /* renamed from: w0.d$a$a */
        public static final class C8726a {
            private C8726a() {
            }

            public /* synthetic */ C8726a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            /* renamed from: a */
            private final boolean m32491a(String str) {
                boolean z;
                if (str.length() == 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    return false;
                }
                int i = 0;
                int i2 = 0;
                int i3 = 0;
                while (i < str.length()) {
                    char charAt = str.charAt(i);
                    int i4 = i3 + 1;
                    if (i3 == 0 && charAt != '(') {
                        return false;
                    }
                    if (charAt == '(') {
                        i2++;
                    } else if (charAt == ')' && i2 - 1 == 0 && i3 != str.length() - 1) {
                        return false;
                    }
                    i++;
                    i3 = i4;
                }
                if (i2 == 0) {
                    return true;
                }
                return false;
            }

            /* renamed from: b */
            public final boolean mo24105b(String str, String str2) {
                C41536l.m120489i(str, "current");
                if (C41536l.m120484d(str, str2)) {
                    return true;
                }
                if (!m32491a(str)) {
                    return false;
                }
                String substring = str.substring(1, str.length() - 1);
                C41536l.m120488h(substring, "this as java.lang.String…ing(startIndex, endIndex)");
                return C41536l.m120484d(C40440x.m117146P0(substring).toString(), str2);
            }
        }

        public C8725a(String str, String str2, boolean z, int i, String str3, int i2) {
            C41536l.m120489i(str, "name");
            C41536l.m120489i(str2, "type");
            this.f24541a = str;
            this.f24542b = str2;
            this.f24543c = z;
            this.f24544d = i;
            this.f24545e = str3;
            this.f24546f = i2;
            this.f24547g = m32490a(str2);
        }

        /* renamed from: a */
        private final int m32490a(String str) {
            if (str == null) {
                return 5;
            }
            Locale locale = Locale.US;
            C41536l.m120488h(locale, "US");
            String upperCase = str.toUpperCase(locale);
            C41536l.m120488h(upperCase, "this as java.lang.String).toUpperCase(locale)");
            if (C40440x.m117139M(upperCase, "INT", false, 2, (Object) null)) {
                return 3;
            }
            if (C40440x.m117139M(upperCase, "CHAR", false, 2, (Object) null) || C40440x.m117139M(upperCase, "CLOB", false, 2, (Object) null) || C40440x.m117139M(upperCase, "TEXT", false, 2, (Object) null)) {
                return 2;
            }
            if (C40440x.m117139M(upperCase, "BLOB", false, 2, (Object) null)) {
                return 5;
            }
            if (C40440x.m117139M(upperCase, "REAL", false, 2, (Object) null) || C40440x.m117139M(upperCase, "FLOA", false, 2, (Object) null) || C40440x.m117139M(upperCase, "DOUB", false, 2, (Object) null)) {
                return 4;
            }
            return 1;
        }

        public boolean equals(Object obj) {
            String str;
            boolean z;
            String str2;
            String str3;
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C8725a) || this.f24544d != ((C8725a) obj).f24544d) {
                return false;
            }
            C8725a aVar = (C8725a) obj;
            if (!C41536l.m120484d(this.f24541a, aVar.f24541a) || this.f24543c != aVar.f24543c) {
                return false;
            }
            if (this.f24546f == 1 && aVar.f24546f == 2 && (str3 = this.f24545e) != null && !f24540h.mo24105b(str3, aVar.f24545e)) {
                return false;
            }
            if (this.f24546f == 2 && aVar.f24546f == 1 && (str2 = aVar.f24545e) != null && !f24540h.mo24105b(str2, this.f24545e)) {
                return false;
            }
            int i = this.f24546f;
            if (i != 0 && i == aVar.f24546f) {
                if ((str = this.f24545e) == null ? aVar.f24545e == null : f24540h.mo24105b(str, aVar.f24545e)) {
                    z = false;
                } else {
                    z = true;
                }
                if (z) {
                    return false;
                }
            }
            if (this.f24547g == aVar.f24547g) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            int i;
            int hashCode = ((this.f24541a.hashCode() * 31) + this.f24547g) * 31;
            if (this.f24543c) {
                i = 1231;
            } else {
                i = 1237;
            }
            return ((hashCode + i) * 31) + this.f24544d;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("Column{name='");
            sb.append(this.f24541a);
            sb.append("', type='");
            sb.append(this.f24542b);
            sb.append("', affinity='");
            sb.append(this.f24547g);
            sb.append("', notNull=");
            sb.append(this.f24543c);
            sb.append(", primaryKeyPosition=");
            sb.append(this.f24544d);
            sb.append(", defaultValue='");
            String str = this.f24545e;
            if (str == null) {
                str = "undefined";
            }
            sb.append(str);
            sb.append("'}");
            return sb.toString();
        }
    }

    /* renamed from: w0.d$b */
    public static final class C8727b {
        private C8727b() {
        }

        public /* synthetic */ C8727b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final C8724d mo24106a(C8998i iVar, String str) {
            C41536l.m120489i(iVar, "database");
            C41536l.m120489i(str, "tableName");
            return C8732e.m32503f(iVar, str);
        }
    }

    /* renamed from: w0.d$c */
    public static final class C8728c {

        /* renamed from: a */
        public final String f24548a;

        /* renamed from: b */
        public final String f24549b;

        /* renamed from: c */
        public final String f24550c;

        /* renamed from: d */
        public final List f24551d;

        /* renamed from: e */
        public final List f24552e;

        public C8728c(String str, String str2, String str3, List list, List list2) {
            C41536l.m120489i(str, "referenceTable");
            C41536l.m120489i(str2, "onDelete");
            C41536l.m120489i(str3, "onUpdate");
            C41536l.m120489i(list, "columnNames");
            C41536l.m120489i(list2, "referenceColumnNames");
            this.f24548a = str;
            this.f24549b = str2;
            this.f24550c = str3;
            this.f24551d = list;
            this.f24552e = list2;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C8728c)) {
                return false;
            }
            C8728c cVar = (C8728c) obj;
            if (C41536l.m120484d(this.f24548a, cVar.f24548a) && C41536l.m120484d(this.f24549b, cVar.f24549b) && C41536l.m120484d(this.f24550c, cVar.f24550c) && C41536l.m120484d(this.f24551d, cVar.f24551d)) {
                return C41536l.m120484d(this.f24552e, cVar.f24552e);
            }
            return false;
        }

        public int hashCode() {
            return (((((((this.f24548a.hashCode() * 31) + this.f24549b.hashCode()) * 31) + this.f24550c.hashCode()) * 31) + this.f24551d.hashCode()) * 31) + this.f24552e.hashCode();
        }

        public String toString() {
            return "ForeignKey{referenceTable='" + this.f24548a + "', onDelete='" + this.f24549b + " +', onUpdate='" + this.f24550c + "', columnNames=" + this.f24551d + ", referenceColumnNames=" + this.f24552e + '}';
        }
    }

    /* renamed from: w0.d$d */
    public static final class C8729d implements Comparable {

        /* renamed from: d */
        private final int f24553d;

        /* renamed from: e */
        private final int f24554e;

        /* renamed from: f */
        private final String f24555f;

        /* renamed from: g */
        private final String f24556g;

        public C8729d(int i, int i2, String str, String str2) {
            C41536l.m120489i(str, "from");
            C41536l.m120489i(str2, "to");
            this.f24553d = i;
            this.f24554e = i2;
            this.f24555f = str;
            this.f24556g = str2;
        }

        /* renamed from: a */
        public int compareTo(C8729d dVar) {
            C41536l.m120489i(dVar, "other");
            int i = this.f24553d - dVar.f24553d;
            if (i == 0) {
                return this.f24554e - dVar.f24554e;
            }
            return i;
        }

        /* renamed from: b */
        public final String mo24111b() {
            return this.f24555f;
        }

        /* renamed from: c */
        public final int mo24112c() {
            return this.f24553d;
        }

        /* renamed from: e */
        public final String mo24114e() {
            return this.f24556g;
        }
    }

    /* renamed from: w0.d$e */
    public static final class C8730e {

        /* renamed from: e */
        public static final C8731a f24557e = new C8731a((DefaultConstructorMarker) null);

        /* renamed from: a */
        public final String f24558a;

        /* renamed from: b */
        public final boolean f24559b;

        /* renamed from: c */
        public final List f24560c;

        /* renamed from: d */
        public List f24561d;

        /* renamed from: w0.d$e$a */
        public static final class C8731a {
            private C8731a() {
            }

            public /* synthetic */ C8731a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        public C8730e(String str, boolean z, List list, List list2) {
            C41536l.m120489i(str, "name");
            C41536l.m120489i(list, "columns");
            C41536l.m120489i(list2, "orders");
            this.f24558a = str;
            this.f24559b = z;
            this.f24560c = list;
            this.f24561d = list2;
            boolean isEmpty = list2.isEmpty();
            ArrayList arrayList = list2;
            if (isEmpty) {
                int size = list.size();
                ArrayList arrayList2 = new ArrayList(size);
                for (int i = 0; i < size; i++) {
                    arrayList2.add(C8485n.ASC.name());
                }
                arrayList = arrayList2;
            }
            this.f24561d = arrayList;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C8730e)) {
                return false;
            }
            C8730e eVar = (C8730e) obj;
            if (this.f24559b != eVar.f24559b || !C41536l.m120484d(this.f24560c, eVar.f24560c) || !C41536l.m120484d(this.f24561d, eVar.f24561d)) {
                return false;
            }
            if (C40439w.m117109H(this.f24558a, "index_", false, 2, (Object) null)) {
                return C40439w.m117109H(eVar.f24558a, "index_", false, 2, (Object) null);
            }
            return C41536l.m120484d(this.f24558a, eVar.f24558a);
        }

        public int hashCode() {
            int i;
            if (C40439w.m117109H(this.f24558a, "index_", false, 2, (Object) null)) {
                i = -1184239155;
            } else {
                i = this.f24558a.hashCode();
            }
            return (((((i * 31) + (this.f24559b ? 1 : 0)) * 31) + this.f24560c.hashCode()) * 31) + this.f24561d.hashCode();
        }

        public String toString() {
            return "Index{name='" + this.f24558a + "', unique=" + this.f24559b + ", columns=" + this.f24560c + ", orders=" + this.f24561d + "'}";
        }
    }

    public C8724d(String str, Map map, Set set, Set set2) {
        C41536l.m120489i(str, "name");
        C41536l.m120489i(map, "columns");
        C41536l.m120489i(set, "foreignKeys");
        this.f24536a = str;
        this.f24537b = map;
        this.f24538c = set;
        this.f24539d = set2;
    }

    /* renamed from: a */
    public static final C8724d m32489a(C8998i iVar, String str) {
        return f24535e.mo24106a(iVar, str);
    }

    public boolean equals(Object obj) {
        Set set;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C8724d)) {
            return false;
        }
        C8724d dVar = (C8724d) obj;
        if (!C41536l.m120484d(this.f24536a, dVar.f24536a) || !C41536l.m120484d(this.f24537b, dVar.f24537b) || !C41536l.m120484d(this.f24538c, dVar.f24538c)) {
            return false;
        }
        Set set2 = this.f24539d;
        if (set2 == null || (set = dVar.f24539d) == null) {
            return true;
        }
        return C41536l.m120484d(set2, set);
    }

    public int hashCode() {
        return (((this.f24536a.hashCode() * 31) + this.f24537b.hashCode()) * 31) + this.f24538c.hashCode();
    }

    public String toString() {
        return "TableInfo{name='" + this.f24536a + "', columns=" + this.f24537b + ", foreignKeys=" + this.f24538c + ", indices=" + this.f24539d + '}';
    }
}
