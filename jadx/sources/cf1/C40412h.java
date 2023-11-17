package cf1;

import java.util.List;
import kotlin.jvm.internal.C41536l;
import ze1.C43420e;

/* renamed from: cf1.h */
public interface C40412h {

    /* renamed from: cf1.h$a */
    public static final class C40413a {
        /* renamed from: a */
        public static C40414b m116991a(C40412h hVar) {
            return new C40414b(hVar);
        }
    }

    /* renamed from: cf1.h$b */
    public static final class C40414b {

        /* renamed from: a */
        private final C40412h f96009a;

        public C40414b(C40412h hVar) {
            C41536l.m120489i(hVar, "match");
            this.f96009a = hVar;
        }

        /* renamed from: a */
        public final C40412h mo94471a() {
            return this.f96009a;
        }
    }

    /* renamed from: a */
    C40414b mo94466a();

    /* renamed from: b */
    List mo94467b();

    /* renamed from: c */
    C43420e mo94468c();

    String getValue();

    C40412h next();
}
