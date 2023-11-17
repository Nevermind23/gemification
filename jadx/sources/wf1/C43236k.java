package wf1;

import dg1.C40679d;
import java.util.List;
import kotlin.jvm.internal.C41536l;

/* renamed from: wf1.k */
public interface C43236k {

    /* renamed from: a */
    public static final C43237a f100969a = C43237a.f100971a;

    /* renamed from: b */
    public static final C43236k f100970b = new C43237a.C43238a();

    /* renamed from: wf1.k$a */
    public static final class C43237a {

        /* renamed from: a */
        static final /* synthetic */ C43237a f100971a = new C43237a();

        /* renamed from: wf1.k$a$a */
        private static final class C43238a implements C43236k {
            /* renamed from: a */
            public void mo101913a(int i, C43194a aVar) {
                C41536l.m120489i(aVar, "errorCode");
            }

            /* renamed from: b */
            public boolean mo101914b(int i, List list) {
                C41536l.m120489i(list, "requestHeaders");
                return true;
            }

            /* renamed from: c */
            public boolean mo101915c(int i, List list, boolean z) {
                C41536l.m120489i(list, "responseHeaders");
                return true;
            }

            /* renamed from: d */
            public boolean mo101916d(int i, C40679d dVar, int i2, boolean z) {
                C41536l.m120489i(dVar, "source");
                dVar.skip((long) i2);
                return true;
            }
        }

        private C43237a() {
        }
    }

    /* renamed from: a */
    void mo101913a(int i, C43194a aVar);

    /* renamed from: b */
    boolean mo101914b(int i, List list);

    /* renamed from: c */
    boolean mo101915c(int i, List list, boolean z);

    /* renamed from: d */
    boolean mo101916d(int i, C40679d dVar, int i2, boolean z);
}
