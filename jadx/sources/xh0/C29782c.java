package xh0;

import java.util.List;
import kotlin.jvm.internal.C41536l;

/* renamed from: xh0.c */
public final class C29782c {

    /* renamed from: a */
    private final List f75333a;

    /* renamed from: b */
    private final C29783d f75334b;

    public C29782c(List list, C29783d dVar) {
        C41536l.m120489i(list, "details");
        this.f75333a = list;
        this.f75334b = dVar;
    }

    /* renamed from: a */
    public final List mo69956a() {
        return this.f75333a;
    }

    /* renamed from: b */
    public final C29783d mo69957b() {
        return this.f75334b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C29782c)) {
            return false;
        }
        C29782c cVar = (C29782c) obj;
        return C41536l.m120484d(this.f75333a, cVar.f75333a) && C41536l.m120484d(this.f75334b, cVar.f75334b);
    }

    public int hashCode() {
        int hashCode = this.f75333a.hashCode() * 31;
        C29783d dVar = this.f75334b;
        return hashCode + (dVar == null ? 0 : dVar.hashCode());
    }

    public String toString() {
        List list = this.f75333a;
        C29783d dVar = this.f75334b;
        return "BffExternalFileExtension(details=" + list + ", type=" + dVar + ")";
    }
}
