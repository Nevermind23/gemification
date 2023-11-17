package androidx.core.p016os;

import android.os.LocaleList;
import java.util.Locale;

/* renamed from: androidx.core.os.w */
final class C0933w implements C0926p {

    /* renamed from: a */
    private final LocaleList f3549a;

    C0933w(Object obj) {
        this.f3549a = C0930t.m3376a(obj);
    }

    /* renamed from: a */
    public String mo3371a() {
        return this.f3549a.toLanguageTags();
    }

    /* renamed from: b */
    public Object mo3372b() {
        return this.f3549a;
    }

    public boolean equals(Object obj) {
        return this.f3549a.equals(((C0926p) obj).mo3372b());
    }

    public Locale get(int i) {
        return this.f3549a.get(i);
    }

    public int hashCode() {
        return this.f3549a.hashCode();
    }

    public boolean isEmpty() {
        return this.f3549a.isEmpty();
    }

    public int size() {
        return this.f3549a.size();
    }

    public String toString() {
        return this.f3549a.toString();
    }
}
