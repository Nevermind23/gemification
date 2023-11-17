package p341ge.bog.sso_client.models;

import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: ge.bog.sso_client.models.l */
public abstract class C35947l {

    /* renamed from: ge.bog.sso_client.models.l$a */
    public static final class C35948a extends C35947l {

        /* renamed from: a */
        public static final C35948a f86974a = new C35948a();

        private C35948a() {
            super((DefaultConstructorMarker) null);
        }
    }

    /* renamed from: ge.bog.sso_client.models.l$b */
    public static final class C35949b extends C35947l {

        /* renamed from: a */
        private final Throwable f86975a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C35949b(Throwable th) {
            super((DefaultConstructorMarker) null);
            C41536l.m120489i(th, "exception");
            this.f86975a = th;
        }

        /* renamed from: a */
        public final Throwable mo88517a() {
            return this.f86975a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C35949b) && C41536l.m120484d(this.f86975a, ((C35949b) obj).f86975a);
        }

        public int hashCode() {
            return this.f86975a.hashCode();
        }

        public String toString() {
            return "Error(exception=" + this.f86975a + ')';
        }
    }

    /* renamed from: ge.bog.sso_client.models.l$c */
    public static final class C35950c extends C35947l {

        /* renamed from: a */
        public static final C35950c f86976a = new C35950c();

        private C35950c() {
            super((DefaultConstructorMarker) null);
        }
    }

    /* renamed from: ge.bog.sso_client.models.l$d */
    public static final class C35951d extends C35947l {

        /* renamed from: a */
        private final Object f86977a;

        public C35951d(Object obj) {
            super((DefaultConstructorMarker) null);
            this.f86977a = obj;
        }

        /* renamed from: a */
        public final Object mo88520a() {
            return this.f86977a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C35951d) && C41536l.m120484d(this.f86977a, ((C35951d) obj).f86977a);
        }

        public int hashCode() {
            Object obj = this.f86977a;
            if (obj == null) {
                return 0;
            }
            return obj.hashCode();
        }

        public String toString() {
            return "Success(data=" + this.f86977a + ')';
        }
    }

    private C35947l() {
    }

    public /* synthetic */ C35947l(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public String toString() {
        if (this instanceof C35951d) {
            return "Success[data=" + ((C35951d) this).mo88520a() + ']';
        } else if (this instanceof C35949b) {
            return "Error[exception=" + ((C35949b) this).mo88517a() + ']';
        } else if (C41536l.m120484d(this, C35950c.f86976a)) {
            return "Loading";
        } else {
            if (C41536l.m120484d(this, C35948a.f86974a)) {
                return "Empty";
            }
            throw new NoWhenBranchMatchedException();
        }
    }
}
