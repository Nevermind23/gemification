package yt0;

import kotlin.jvm.internal.C41536l;

/* renamed from: yt0.f */
public final class C40065f {

    /* renamed from: a */
    private final String f95235a;

    /* renamed from: b */
    private final int f95236b;

    public C40065f(String str, int i) {
        C41536l.m120489i(str, "newsTextKey");
        this.f95235a = str;
        this.f95236b = i;
    }

    /* renamed from: a */
    public final String mo93998a() {
        return this.f95235a;
    }

    /* renamed from: b */
    public final int mo93999b() {
        return this.f95236b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C40065f)) {
            return false;
        }
        C40065f fVar = (C40065f) obj;
        return C41536l.m120484d(this.f95235a, fVar.f95235a) && this.f95236b == fVar.f95236b;
    }

    public int hashCode() {
        return (this.f95235a.hashCode() * 31) + this.f95236b;
    }

    public String toString() {
        String str = this.f95235a;
        int i = this.f95236b;
        return "WelcomeNewsItem(newsTextKey=" + str + ", orderId=" + i + ")";
    }
}
