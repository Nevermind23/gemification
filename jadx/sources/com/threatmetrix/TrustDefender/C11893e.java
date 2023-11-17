package com.threatmetrix.TrustDefender;

import java.io.InputStream;
import java.util.Map;

/* renamed from: com.threatmetrix.TrustDefender.e */
public interface C11893e {

    /* renamed from: com.threatmetrix.TrustDefender.e$a */
    public enum C11894a {
        GET,
        POST
    }

    /* renamed from: com.threatmetrix.TrustDefender.e$b */
    public interface C11895b {
        /* renamed from: a */
        boolean mo31945a(C11896c cVar, InputStream inputStream);
    }

    /* renamed from: com.threatmetrix.TrustDefender.e$c */
    public static class C11896c {

        /* renamed from: a */
        private int f34822a;

        public C11896c(int i) {
            this.f34822a = i;
        }

        /* renamed from: a */
        public int mo31946a() {
            return this.f34822a;
        }

        /* renamed from: b */
        public void mo31947b(int i) {
            this.f34822a = i;
        }

        /* renamed from: c */
        public boolean mo31948c() {
            int i = this.f34822a;
            return i == 200 || i == 204;
        }

        public String toString() {
            return String.valueOf(this.f34822a);
        }
    }

    /* renamed from: a */
    void mo31942a(C11894a aVar, String str, Map map, byte[] bArr, C11895b bVar);

    /* renamed from: b */
    void mo31943b();

    /* renamed from: d */
    void mo31944d(String str);
}
