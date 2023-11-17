package p217q2;

import dg1.C40681e;
import java.util.Map;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p243s2.C8106f;
import p243s2.C8108g;
import p243s2.C8120m;

/* renamed from: q2.g */
public interface C7836g {

    /* renamed from: a */
    public static final C7839c f22757a = new C7839c();

    /* renamed from: b */
    public static final C7837a f22758b = new C7837a((DefaultConstructorMarker) null);

    /* renamed from: q2.g$a */
    public static final class C7837a {
        private C7837a() {
        }

        public /* synthetic */ C7837a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: q2.g$b */
    public interface C7838b {
    }

    /* renamed from: q2.g$c */
    public static class C7839c {

        /* renamed from: q2.g$c$a */
        public static final class C7840a implements C8106f {
            C7840a() {
            }

            public void marshal(C8108g gVar) {
                C41536l.m120490j(gVar, "writer");
            }
        }

        public final String marshal() {
            return marshal(C7851m.f22792c);
        }

        public C8106f marshaller() {
            return new C7840a();
        }

        public Map valueMap() {
            return C41344r0.m119928j();
        }

        /* JADX WARNING: Code restructure failed: missing block: B:10:0x0033, code lost:
            r5 = move-exception;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:11:0x0034, code lost:
            if (r1 != null) goto L_0x0036;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:13:?, code lost:
            r1.close();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:14:0x0039, code lost:
            throw r5;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.String marshal(p217q2.C7851m r5) {
            /*
                r4 = this;
                java.lang.String r0 = "scalarTypeAdapters"
                kotlin.jvm.internal.C41536l.m120490j(r5, r0)
                dg1.b r0 = new dg1.b
                r0.<init>()
                t2.f$a r1 = p256t2.C8341f.f23740k
                t2.f r1 = r1.mo23535a(r0)
                r2 = 1
                r1.mo23525h0(r2)     // Catch:{ all -> 0x0031 }
                r1.mo23513k()     // Catch:{ all -> 0x0031 }
                s2.f r2 = r4.marshaller()     // Catch:{ all -> 0x0031 }
                t2.b r3 = new t2.b     // Catch:{ all -> 0x0031 }
                r3.<init>(r1, r5)     // Catch:{ all -> 0x0031 }
                r2.marshal(r3)     // Catch:{ all -> 0x0031 }
                r1.mo23516o()     // Catch:{ all -> 0x0031 }
                if (r1 != 0) goto L_0x0029
                goto L_0x002c
            L_0x0029:
                r1.close()
            L_0x002c:
                java.lang.String r5 = r0.mo94746o1()
                return r5
            L_0x0031:
                r5 = move-exception
                throw r5     // Catch:{ all -> 0x0033 }
            L_0x0033:
                r5 = move-exception
                if (r1 == 0) goto L_0x0039
                r1.close()     // Catch:{ all -> 0x0039 }
            L_0x0039:
                throw r5
            */
            throw new UnsupportedOperationException("Method not decompiled: p217q2.C7836g.C7839c.marshal(q2.m):java.lang.String");
        }
    }

    C40681e composeRequestBody(C7851m mVar);

    C7841h name();

    String operationId();

    String queryDocument();

    C8120m responseFieldMapper();

    C7839c variables();

    Object wrapData(C7838b bVar);
}
