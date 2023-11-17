package com.facetec.sdk;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* renamed from: com.facetec.sdk.jr */
public final class C3260jr {

    /* renamed from: b */
    private final String[] f10654b;

    C3260jr(C3261d dVar) {
        List<String> list = dVar.f10655d;
        this.f10654b = (String[]) list.toArray(new String[list.size()]);
    }

    /* renamed from: d */
    static void m13051d(String str) {
        if (str == null) {
            throw new NullPointerException("name == null");
        } else if (!str.isEmpty()) {
            int length = str.length();
            for (int i = 0; i < length; i++) {
                char charAt = str.charAt(i);
                if (charAt <= ' ' || charAt >= 127) {
                    throw new IllegalArgumentException(C3303ki.m13262d("Unexpected char %#04x at %d in header name: %s", Integer.valueOf(charAt), Integer.valueOf(i), str));
                }
            }
        } else {
            throw new IllegalArgumentException("name is empty");
        }
    }

    /* renamed from: a */
    public final String mo9488a(String str) {
        String[] strArr = this.f10654b;
        for (int length = strArr.length - 2; length >= 0; length -= 2) {
            if (str.equalsIgnoreCase(strArr[length])) {
                return strArr[length + 1];
            }
        }
        return null;
    }

    /* renamed from: b */
    public final String mo9489b(int i) {
        return this.f10654b[i << 1];
    }

    /* renamed from: c */
    public final String mo9490c(int i) {
        return this.f10654b[(i << 1) + 1];
    }

    /* renamed from: e */
    public final C3261d mo9491e() {
        C3261d dVar = new C3261d();
        Collections.addAll(dVar.f10655d, this.f10654b);
        return dVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C3260jr) || !Arrays.equals(((C3260jr) obj).f10654b, this.f10654b)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f10654b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        int a = mo9487a();
        for (int i = 0; i < a; i++) {
            sb.append(mo9489b(i));
            sb.append(": ");
            sb.append(mo9490c(i));
            sb.append("\n");
        }
        return sb.toString();
    }

    /* renamed from: com.facetec.sdk.jr$d */
    public static final class C3261d {

        /* renamed from: d */
        final List<String> f10655d = new ArrayList(20);

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public final C3261d mo9495b(String str, String str2) {
            this.f10655d.add(str);
            this.f10655d.add(str2.trim());
            return this;
        }

        /* renamed from: c */
        public final C3261d mo9497c(String str, String str2) {
            C3260jr.m13051d(str);
            C3260jr.m13052d(str2, str);
            return mo9495b(str, str2);
        }

        /* renamed from: d */
        public final C3261d mo9499d(String str, String str2) {
            C3260jr.m13051d(str);
            C3260jr.m13052d(str2, str);
            mo9496c(str);
            mo9495b(str, str2);
            return this;
        }

        /* renamed from: c */
        public final C3261d mo9496c(String str) {
            int i = 0;
            while (i < this.f10655d.size()) {
                if (str.equalsIgnoreCase(this.f10655d.get(i))) {
                    this.f10655d.remove(i);
                    this.f10655d.remove(i);
                    i -= 2;
                }
                i += 2;
            }
            return this;
        }

        /* renamed from: c */
        public final C3260jr mo9498c() {
            return new C3260jr(this);
        }
    }

    /* renamed from: a */
    public final int mo9487a() {
        return this.f10654b.length / 2;
    }

    /* renamed from: d */
    static void m13052d(String str, String str2) {
        if (str != null) {
            int length = str.length();
            int i = 0;
            while (i < length) {
                char charAt = str.charAt(i);
                if ((charAt > 31 || charAt == 9) && charAt < 127) {
                    i++;
                } else {
                    throw new IllegalArgumentException(C3303ki.m13262d("Unexpected char %#04x at %d in %s value: %s", Integer.valueOf(charAt), Integer.valueOf(i), str2, str));
                }
            }
            return;
        }
        StringBuilder sb = new StringBuilder("value for name ");
        sb.append(str2);
        sb.append(" == null");
        throw new NullPointerException(sb.toString());
    }
}
