package n80;

import java.util.List;
import kotlin.jvm.internal.C41536l;

/* renamed from: n80.b */
public final class C26378b {

    /* renamed from: a */
    private final C26379c f66835a;

    /* renamed from: b */
    private final List f66836b;

    public C26378b(C26379c cVar, List list) {
        C41536l.m120489i(cVar, "attachmentType");
        C41536l.m120489i(list, "attachmentExtensions");
        this.f66835a = cVar;
        this.f66836b = list;
    }

    /* renamed from: a */
    public final List mo65590a() {
        return this.f66836b;
    }

    /* renamed from: b */
    public final C26379c mo65591b() {
        return this.f66835a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C26378b)) {
            return false;
        }
        C26378b bVar = (C26378b) obj;
        return C41536l.m120484d(this.f66835a, bVar.f66835a) && C41536l.m120484d(this.f66836b, bVar.f66836b);
    }

    public int hashCode() {
        return (this.f66835a.hashCode() * 31) + this.f66836b.hashCode();
    }

    public String toString() {
        C26379c cVar = this.f66835a;
        List list = this.f66836b;
        return "AttachmentInfo(attachmentType=" + cVar + ", attachmentExtensions=" + list + ")";
    }
}
