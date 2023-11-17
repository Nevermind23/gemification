package p652we;

import hd1.C41205b;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p190o1.C7397t;

/* renamed from: we.i */
public abstract class C18551i {

    /* renamed from: we.i$a */
    public static final class C18552a extends C18551i {

        /* renamed from: a */
        private final C18548g f52060a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C18552a(C18548g gVar) {
            super((DefaultConstructorMarker) null);
            C41536l.m120490j(gVar, "session");
            this.f52060a = gVar;
        }

        /* renamed from: a */
        public final C18548g mo46372a() {
            return this.f52060a;
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                return (obj instanceof C18552a) && C41536l.m120484d(this.f52060a, ((C18552a) obj).f52060a);
            }
            return true;
        }

        public int hashCode() {
            C18548g gVar = this.f52060a;
            if (gVar != null) {
                return gVar.hashCode();
            }
            return 0;
        }

        public String toString() {
            return "Connected(session=" + this.f52060a + ")";
        }
    }

    /* renamed from: we.i$b */
    public static final class C18553b extends C18551i {

        /* renamed from: a */
        private final C18548g f52061a;

        /* renamed from: b */
        private final int f52062b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C18553b(C18548g gVar, int i) {
            super((DefaultConstructorMarker) null);
            C41536l.m120490j(gVar, "session");
            this.f52061a = gVar;
            this.f52062b = i;
        }

        /* renamed from: a */
        public final int mo46376a() {
            return this.f52062b;
        }

        /* renamed from: b */
        public final C18548g mo46377b() {
            return this.f52061a;
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof C18553b) {
                    C18553b bVar = (C18553b) obj;
                    if (C41536l.m120484d(this.f52061a, bVar.f52061a)) {
                        if (this.f52062b == bVar.f52062b) {
                            return true;
                        }
                    }
                }
                return false;
            }
            return true;
        }

        public int hashCode() {
            C18548g gVar = this.f52061a;
            return ((gVar != null ? gVar.hashCode() : 0) * 31) + this.f52062b;
        }

        public String toString() {
            return "Connecting(session=" + this.f52061a + ", retryCount=" + this.f52062b + ")";
        }
    }

    /* renamed from: we.i$c */
    public static final class C18554c extends C18551i {

        /* renamed from: a */
        public static final C18554c f52063a = new C18554c();

        private C18554c() {
            super((DefaultConstructorMarker) null);
        }
    }

    /* renamed from: we.i$d */
    public static final class C18555d extends C18551i {

        /* renamed from: a */
        public static final C18555d f52064a = new C18555d();

        private C18555d() {
            super((DefaultConstructorMarker) null);
        }
    }

    /* renamed from: we.i$e */
    public static final class C18556e extends C18551i {

        /* renamed from: a */
        public static final C18556e f52065a = new C18556e();

        private C18556e() {
            super((DefaultConstructorMarker) null);
        }
    }

    /* renamed from: we.i$f */
    public static final class C18557f extends C18551i {

        /* renamed from: a */
        private final C41205b f52066a;

        /* renamed from: b */
        private final int f52067b;

        /* renamed from: c */
        private final long f52068c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C18557f(C41205b bVar, int i, long j) {
            super((DefaultConstructorMarker) null);
            C41536l.m120490j(bVar, "timerDisposable");
            this.f52066a = bVar;
            this.f52067b = i;
            this.f52068c = j;
        }

        /* renamed from: a */
        public final int mo46381a() {
            return this.f52067b;
        }

        /* renamed from: b */
        public final C41205b mo46382b() {
            return this.f52066a;
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof C18557f) {
                    C18557f fVar = (C18557f) obj;
                    if (C41536l.m120484d(this.f52066a, fVar.f52066a)) {
                        if (this.f52067b == fVar.f52067b) {
                            if (this.f52068c == fVar.f52068c) {
                                return true;
                            }
                        }
                    }
                }
                return false;
            }
            return true;
        }

        public int hashCode() {
            C41205b bVar = this.f52066a;
            return ((((bVar != null ? bVar.hashCode() : 0) * 31) + this.f52067b) * 31) + C7397t.m28148a(this.f52068c);
        }

        public String toString() {
            return "WaitingToRetry(timerDisposable=" + this.f52066a + ", retryCount=" + this.f52067b + ", retryInMillis=" + this.f52068c + ")";
        }
    }

    private C18551i() {
    }

    public /* synthetic */ C18551i(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
