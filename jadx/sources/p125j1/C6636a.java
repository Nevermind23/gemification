package p125j1;

import android.os.Build;
import ig1.C41367a;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* renamed from: j1.a */
public abstract class C6636a implements C6680y {

    /* renamed from: c */
    private static final Set f20144c = new HashSet();

    /* renamed from: a */
    private final String f20145a;

    /* renamed from: b */
    private final String f20146b;

    /* renamed from: j1.a$a */
    private static class C6637a {

        /* renamed from: a */
        static final Set f20147a = new HashSet(Arrays.asList(C6654d0.m26075d().mo20669a()));
    }

    /* renamed from: j1.a$b */
    public static class C6638b extends C6636a {
        C6638b(String str, String str2) {
            super(str, str2);
        }

        /* renamed from: c */
        public final boolean mo20665c() {
            return true;
        }
    }

    /* renamed from: j1.a$c */
    public static class C6639c extends C6636a {
        C6639c(String str, String str2) {
            super(str, str2);
        }

        /* renamed from: c */
        public final boolean mo20665c() {
            return Build.VERSION.SDK_INT >= 24;
        }
    }

    /* renamed from: j1.a$d */
    public static class C6640d extends C6636a {
        C6640d(String str, String str2) {
            super(str, str2);
        }

        /* renamed from: c */
        public final boolean mo20665c() {
            return false;
        }
    }

    /* renamed from: j1.a$e */
    public static class C6641e extends C6636a {
        C6641e(String str, String str2) {
            super(str, str2);
        }

        /* renamed from: c */
        public final boolean mo20665c() {
            return Build.VERSION.SDK_INT >= 26;
        }
    }

    /* renamed from: j1.a$f */
    public static class C6642f extends C6636a {
        C6642f(String str, String str2) {
            super(str, str2);
        }

        /* renamed from: c */
        public final boolean mo20665c() {
            return Build.VERSION.SDK_INT >= 27;
        }
    }

    /* renamed from: j1.a$g */
    public static class C6643g extends C6636a {
        C6643g(String str, String str2) {
            super(str, str2);
        }

        /* renamed from: c */
        public final boolean mo20665c() {
            return Build.VERSION.SDK_INT >= 28;
        }
    }

    /* renamed from: j1.a$h */
    public static class C6644h extends C6636a {
        C6644h(String str, String str2) {
            super(str, str2);
        }

        /* renamed from: c */
        public final boolean mo20665c() {
            return Build.VERSION.SDK_INT >= 29;
        }
    }

    /* renamed from: j1.a$i */
    public static class C6645i extends C6636a {
        C6645i(String str, String str2) {
            super(str, str2);
        }

        /* renamed from: c */
        public final boolean mo20665c() {
            return Build.VERSION.SDK_INT >= 33;
        }
    }

    C6636a(String str, String str2) {
        this.f20145a = str;
        this.f20146b = str2;
        f20144c.add(this);
    }

    /* renamed from: e */
    public static Set m26050e() {
        return Collections.unmodifiableSet(f20144c);
    }

    /* renamed from: a */
    public boolean mo20663a() {
        return mo20665c() || mo20666d();
    }

    /* renamed from: b */
    public String mo20664b() {
        return this.f20145a;
    }

    /* renamed from: c */
    public abstract boolean mo20665c();

    /* renamed from: d */
    public boolean mo20666d() {
        return C41367a.m120056b(C6637a.f20147a, this.f20146b);
    }
}
