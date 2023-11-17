package t51;

import kotlin.jvm.internal.C41536l;

/* renamed from: t51.h */
public final class C38667h implements C38670k {

    /* renamed from: a */
    private final String f92541a;

    public C38667h(String str) {
        this.f92541a = str;
    }

    /* renamed from: a */
    public final String mo92309a() {
        return this.f92541a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C38667h) && C41536l.m120484d(this.f92541a, ((C38667h) obj).f92541a);
    }

    public int hashCode() {
        String str = this.f92541a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public String toString() {
        String str = this.f92541a;
        return "HeaderItem(text=" + str + ")";
    }
}
