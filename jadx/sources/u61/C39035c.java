package u61;

import java.util.List;
import kotlin.jvm.internal.C41536l;

/* renamed from: u61.c */
public final class C39035c {

    /* renamed from: a */
    private final List f93169a;

    public C39035c(List list) {
        C41536l.m120489i(list, "templates");
        this.f93169a = list;
    }

    /* renamed from: a */
    public final List mo92714a() {
        return this.f93169a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C39035c) && C41536l.m120484d(this.f93169a, ((C39035c) obj).f93169a);
    }

    public int hashCode() {
        return this.f93169a.hashCode();
    }

    public String toString() {
        List list = this.f93169a;
        return "TemplatesAndConfig(templates=" + list + ")";
    }
}
