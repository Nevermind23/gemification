package a21;

import d41.C31537a;
import ed1.C40749p;
import hd1.C41204a;
import hd1.C41205b;
import kotlin.jvm.internal.C41536l;

/* renamed from: a21.a */
public interface C30479a {

    /* renamed from: a21.a$a */
    public static abstract class C30480a implements C41205b {

        /* renamed from: d */
        private final C41204a f76471d;

        private C30480a(C41204a aVar) {
            this.f76471d = aVar;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public final C41205b mo70813a(C41205b bVar) {
            C41536l.m120489i(bVar, "<this>");
            if (!C41536l.m120484d(bVar, this)) {
                this.f76471d.mo95660b(C31537a.f78102a.mo71938a(bVar));
                return bVar;
            }
            throw new IllegalStateException("Can not bind to self".toString());
        }

        /* renamed from: b */
        public void mo70814b(C40749p pVar, C40749p pVar2) {
            C41536l.m120489i(pVar, "onInit");
            C41536l.m120489i(pVar2, "onRefresh");
        }

        public void dispose() {
            this.f76471d.dispose();
        }

        public boolean isDisposed() {
            return this.f76471d.isDisposed();
        }

        public C30480a() {
            this(new C41204a());
            C31537a.f78102a.mo71940c(this);
        }
    }
}
