package p652we;

import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: we.h */
public final class C18549h {

    /* renamed from: c */
    private static final int f52054c = f52054c;

    /* renamed from: d */
    private static final String f52055d = f52055d;

    /* renamed from: e */
    public static final C18549h f52056e = new C18549h(f52054c, f52055d);

    /* renamed from: f */
    public static final C18550a f52057f = new C18550a((DefaultConstructorMarker) null);

    /* renamed from: a */
    private final int f52058a;

    /* renamed from: b */
    private final String f52059b;

    /* renamed from: we.h$a */
    public static final class C18550a {
        private C18550a() {
        }

        public /* synthetic */ C18550a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public C18549h(int i, String str) {
        C41536l.m120490j(str, "reason");
        this.f52058a = i;
        this.f52059b = str;
    }

    /* renamed from: a */
    public final int mo46367a() {
        return this.f52058a;
    }

    /* renamed from: b */
    public final String mo46368b() {
        return this.f52059b;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C18549h) {
                C18549h hVar = (C18549h) obj;
                if (!(this.f52058a == hVar.f52058a) || !C41536l.m120484d(this.f52059b, hVar.f52059b)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        int i = this.f52058a * 31;
        String str = this.f52059b;
        return i + (str != null ? str.hashCode() : 0);
    }

    public String toString() {
        return "ShutdownReason(code=" + this.f52058a + ", reason=" + this.f52059b + ")";
    }
}
