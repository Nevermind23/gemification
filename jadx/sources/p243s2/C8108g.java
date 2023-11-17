package p243s2;

import kotlin.jvm.internal.C41536l;
import p217q2.C7850l;
import ue1.C43075l;

/* renamed from: s2.g */
public interface C8108g {

    /* renamed from: s2.g$a */
    public static final class C8109a {

        /* renamed from: s2.g$a$a */
        public static final class C8110a implements C8112c {

            /* renamed from: b */
            final /* synthetic */ C43075l f23264b;

            C8110a(C43075l lVar) {
                this.f23264b = lVar;
            }

            public void write(C8111b bVar) {
                C41536l.m120490j(bVar, "listItemWriter");
                this.f23264b.invoke(bVar);
            }
        }

        /* renamed from: a */
        public static /* synthetic */ void m30664a(C8108g gVar, String str, C43075l lVar) {
            C41536l.m120490j(str, "fieldName");
            C41536l.m120490j(lVar, "block");
            gVar.mo23296f(str, new C8110a(lVar));
        }
    }

    /* renamed from: s2.g$b */
    public interface C8111b {
        /* renamed from: a */
        void mo23298a(String str);

        /* renamed from: b */
        void mo23299b(C8106f fVar);
    }

    /* renamed from: s2.g$c */
    public interface C8112c {

        /* renamed from: a */
        public static final C8113a f23265a = C8113a.f23266a;

        /* renamed from: s2.g$c$a */
        public static final class C8113a {

            /* renamed from: a */
            static final /* synthetic */ C8113a f23266a = new C8113a();

            private C8113a() {
            }
        }

        void write(C8111b bVar);
    }

    /* renamed from: a */
    void mo23291a(String str, String str2);

    /* renamed from: b */
    void mo23292b(String str, C7850l lVar, Object obj);

    /* renamed from: c */
    void mo23293c(String str, C8106f fVar);

    /* renamed from: d */
    /* synthetic */ void mo23294d(String str, C43075l lVar);

    /* renamed from: e */
    void mo23295e(String str, Boolean bool);

    /* renamed from: f */
    void mo23296f(String str, C8112c cVar);
}
