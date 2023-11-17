package com.facetec.sdk;

import com.facetec.sdk.C3260jr;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: com.facetec.sdk.kb */
public final class C3293kb {

    /* renamed from: a */
    final C3274jx f10785a;

    /* renamed from: b */
    final Map<Class<?>, Object> f10786b;

    /* renamed from: c */
    final C3260jr f10787c;

    /* renamed from: d */
    final String f10788d;

    /* renamed from: e */
    final C3297kd f10789e;

    /* renamed from: h */
    private volatile C3240jf f10790h;

    /* renamed from: com.facetec.sdk.kb$e */
    public static class C3294e {

        /* renamed from: a */
        C3274jx f10791a;

        /* renamed from: b */
        Map<Class<?>, Object> f10792b;

        /* renamed from: c */
        String f10793c;

        /* renamed from: d */
        public C3260jr.C3261d f10794d;

        /* renamed from: e */
        C3297kd f10795e;

        public C3294e() {
            this.f10792b = Collections.emptyMap();
            this.f10793c = "GET";
            this.f10794d = new C3260jr.C3261d();
        }

        /* renamed from: a */
        public final C3294e mo9597a(String str) {
            if (str != null) {
                if (str.regionMatches(true, 0, "ws:", 0, 3)) {
                    StringBuilder sb = new StringBuilder("http:");
                    sb.append(str.substring(3));
                    str = sb.toString();
                } else if (str.regionMatches(true, 0, "wss:", 0, 4)) {
                    StringBuilder sb2 = new StringBuilder("https:");
                    sb2.append(str.substring(4));
                    str = sb2.toString();
                }
                return mo9603e(C3274jx.m13111b(str));
            }
            throw new NullPointerException("url == null");
        }

        /* renamed from: b */
        public final C3293kb mo9599b() {
            if (this.f10791a != null) {
                return new C3293kb(this);
            }
            throw new IllegalStateException("url == null");
        }

        /* renamed from: c */
        public final C3294e mo9600c(String str) {
            this.f10794d.mo9496c(str);
            return this;
        }

        /* renamed from: d */
        public final C3294e mo9602d(String str, String str2) {
            this.f10794d.mo9497c(str, str2);
            return this;
        }

        /* renamed from: e */
        public final C3294e mo9603e(C3274jx jxVar) {
            if (jxVar != null) {
                this.f10791a = jxVar;
                return this;
            }
            throw new NullPointerException("url == null");
        }

        /* renamed from: c */
        public final C3294e mo9601c(String str, C3297kd kdVar) {
            if (str == null) {
                throw new NullPointerException("method == null");
            } else if (str.length() == 0) {
                throw new IllegalArgumentException("method.length() == 0");
            } else if (kdVar != null && !C3329kz.m13343d(str)) {
                StringBuilder sb = new StringBuilder("method ");
                sb.append(str);
                sb.append(" must not have a request body.");
                throw new IllegalArgumentException(sb.toString());
            } else if (kdVar != null || !C3329kz.m13341b(str)) {
                this.f10793c = str;
                this.f10795e = kdVar;
                return this;
            } else {
                StringBuilder sb2 = new StringBuilder("method ");
                sb2.append(str);
                sb2.append(" must have a request body.");
                throw new IllegalArgumentException(sb2.toString());
            }
        }

        /* renamed from: e */
        public final C3294e mo9604e(C3297kd kdVar) {
            return mo9601c("POST", kdVar);
        }

        C3294e(C3293kb kbVar) {
            Map<Class<?>, Object> map;
            this.f10792b = Collections.emptyMap();
            this.f10791a = kbVar.f10785a;
            this.f10793c = kbVar.f10788d;
            this.f10795e = kbVar.f10789e;
            if (kbVar.f10786b.isEmpty()) {
                map = Collections.emptyMap();
            } else {
                map = new LinkedHashMap<>(kbVar.f10786b);
            }
            this.f10792b = map;
            this.f10794d = kbVar.f10787c.mo9491e();
        }

        /* renamed from: a */
        public final C3294e mo9598a(String str, String str2) {
            this.f10794d.mo9499d(str, str2);
            return this;
        }
    }

    C3293kb(C3294e eVar) {
        this.f10785a = eVar.f10791a;
        this.f10788d = eVar.f10793c;
        this.f10787c = eVar.f10794d.mo9498c();
        this.f10789e = eVar.f10795e;
        this.f10786b = C3303ki.m13259c(eVar.f10792b);
    }

    /* renamed from: a */
    public final C3274jx mo9588a() {
        return this.f10785a;
    }

    /* renamed from: b */
    public final String mo9589b() {
        return this.f10788d;
    }

    /* renamed from: c */
    public final C3260jr mo9590c() {
        return this.f10787c;
    }

    /* renamed from: d */
    public final C3297kd mo9592d() {
        return this.f10789e;
    }

    /* renamed from: e */
    public final C3294e mo9593e() {
        return new C3294e(this);
    }

    /* renamed from: h */
    public final C3240jf mo9594h() {
        C3240jf jfVar = this.f10790h;
        if (jfVar != null) {
            return jfVar;
        }
        C3240jf e = C3240jf.m13002e(this.f10787c);
        this.f10790h = e;
        return e;
    }

    /* renamed from: j */
    public final boolean mo9595j() {
        return this.f10785a.mo9544c();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Request{method=");
        sb.append(this.f10788d);
        sb.append(", url=");
        sb.append(this.f10785a);
        sb.append(", tags=");
        sb.append(this.f10786b);
        sb.append('}');
        return sb.toString();
    }

    /* renamed from: c */
    public final String mo9591c(String str) {
        return this.f10787c.mo9488a(str);
    }
}
