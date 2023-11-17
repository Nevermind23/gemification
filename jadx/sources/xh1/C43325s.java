package xh1;

import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* renamed from: xh1.s */
public class C43325s {

    /* renamed from: a */
    public final String f101116a;

    /* renamed from: b */
    public final List f101117b;

    /* renamed from: c */
    public final String f101118c;

    /* renamed from: d */
    public final String f101119d;

    /* renamed from: e */
    public final C43332y f101120e;

    /* renamed from: f */
    public final String f101121f;

    /* renamed from: g */
    public final List f101122g;

    /* renamed from: h */
    public final List f101123h;

    /* renamed from: xh1.s$a */
    public static class C43326a {

        /* renamed from: a */
        private final List f101124a;

        /* renamed from: b */
        private String f101125b;

        /* renamed from: c */
        private String f101126c;

        /* renamed from: d */
        private C43332y f101127d;

        /* renamed from: e */
        private String f101128e;

        /* renamed from: f */
        private List f101129f;

        /* renamed from: g */
        private List f101130g;

        /* renamed from: a */
        public C43325s mo102014a() {
            return new C43325s((String) this.f101124a.get(0), this.f101124a, this.f101125b, this.f101126c, this.f101127d, this.f101128e, this.f101129f, this.f101130g);
        }

        /* renamed from: b */
        public C43326a mo102015b(String str) {
            this.f101126c = str;
            return this;
        }

        /* renamed from: c */
        public C43326a mo102016c(String str) {
            this.f101125b = str;
            return this;
        }

        private C43326a(List list) {
            this.f101125b = "";
            this.f101126c = "";
            this.f101127d = C43332y.TLS_CERT_POLICY_SECURE;
            this.f101128e = "";
            if (list == null || list.isEmpty()) {
                throw new IllegalArgumentException("urls == null || urls.isEmpty(): " + list);
            }
            this.f101124a = list;
        }
    }

    /* renamed from: a */
    public static C43326a m124344a(String str) {
        return new C43326a(Collections.singletonList(str));
    }

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C43325s)) {
            return false;
        }
        C43325s sVar = (C43325s) obj;
        if (!this.f101116a.equals(sVar.f101116a) || !this.f101117b.equals(sVar.f101117b) || !this.f101118c.equals(sVar.f101118c) || !this.f101119d.equals(sVar.f101119d) || !this.f101120e.equals(sVar.f101120e) || !this.f101121f.equals(sVar.f101121f) || !this.f101122g.equals(sVar.f101122g) || !this.f101123h.equals(sVar.f101123h)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.f101116a, this.f101117b, this.f101118c, this.f101119d, this.f101120e, this.f101121f, this.f101122g, this.f101123h});
    }

    public String toString() {
        return this.f101117b + " [" + this.f101118c + ":" + this.f101119d + "] [" + this.f101120e + "] [" + this.f101121f + "] [" + this.f101122g + "] [" + this.f101123h + "]";
    }

    private C43325s(String str, List list, String str2, String str3, C43332y yVar, String str4, List list2, List list3) {
        if (str == null || list == null || list.isEmpty()) {
            throw new IllegalArgumentException("uri == null || urls == null || urls.isEmpty()");
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (((String) it.next()) == null) {
                throw new IllegalArgumentException("urls element is null: " + list);
            }
        }
        if (str2 == null) {
            throw new IllegalArgumentException("username == null");
        } else if (str3 == null) {
            throw new IllegalArgumentException("password == null");
        } else if (str4 != null) {
            this.f101116a = str;
            this.f101117b = list;
            this.f101118c = str2;
            this.f101119d = str3;
            this.f101120e = yVar;
            this.f101121f = str4;
            this.f101122g = list2;
            this.f101123h = list3;
        } else {
            throw new IllegalArgumentException("hostname == null");
        }
    }
}
