package tg1;

import java.util.regex.Pattern;

/* renamed from: tg1.b */
public class C43020b implements C43019a {

    /* renamed from: b */
    private static final Pattern f100444b = Pattern.compile(" ");

    /* renamed from: c */
    private static final Pattern f100445c = Pattern.compile(",");

    /* renamed from: a */
    private final String f100446a;

    public C43020b(String str) {
        if (str != null) {
            this.f100446a = str;
            return;
        }
        throw new IllegalArgumentException();
    }

    /* renamed from: a */
    public boolean mo101601a(String str) {
        if ("".equals(this.f100446a)) {
            return true;
        }
        for (String equals : f100445c.split(f100444b.matcher(str).replaceAll(""))) {
            if (this.f100446a.equals(equals)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: b */
    public C43019a mo101602b() {
        return new C43020b(mo101603c());
    }

    /* renamed from: c */
    public String mo101603c() {
        return this.f100446a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return this.f100446a.equals(((C43020b) obj).f100446a);
    }

    public int hashCode() {
        return this.f100446a.hashCode();
    }

    public String toString() {
        return mo101603c();
    }
}
