package p891su;

import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: su.f */
public abstract class C28271f {

    /* renamed from: a */
    private final C28261a f71762a;

    /* renamed from: su.f$a */
    public static final class C28272a extends C28271f {

        /* renamed from: b */
        private final C28261a f71763b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C28272a(C28261a aVar) {
            super(aVar, (DefaultConstructorMarker) null);
            C41536l.m120489i(aVar, "contact");
            this.f71763b = aVar;
        }

        /* renamed from: a */
        public C28261a mo67884a() {
            return this.f71763b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C28272a) && C41536l.m120484d(this.f71763b, ((C28272a) obj).f71763b);
        }

        public int hashCode() {
            return this.f71763b.hashCode();
        }

        public String toString() {
            C28261a aVar = this.f71763b;
            return "Deleted(contact=" + aVar + ")";
        }
    }

    /* renamed from: su.f$b */
    public static final class C28273b extends C28271f {

        /* renamed from: b */
        private final C28261a f71764b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C28273b(C28261a aVar) {
            super(aVar, (DefaultConstructorMarker) null);
            C41536l.m120489i(aVar, "contact");
            this.f71764b = aVar;
        }

        /* renamed from: a */
        public C28261a mo67884a() {
            return this.f71764b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C28273b) && C41536l.m120484d(this.f71764b, ((C28273b) obj).f71764b);
        }

        public int hashCode() {
            return this.f71764b.hashCode();
        }

        public String toString() {
            C28261a aVar = this.f71764b;
            return "NameChanged(contact=" + aVar + ")";
        }
    }

    /* renamed from: su.f$c */
    public static final class C28274c extends C28271f {

        /* renamed from: b */
        private final C28261a f71765b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C28274c(C28261a aVar) {
            super(aVar, (DefaultConstructorMarker) null);
            C41536l.m120489i(aVar, "contact");
            this.f71765b = aVar;
        }

        /* renamed from: a */
        public C28261a mo67884a() {
            return this.f71765b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C28274c) && C41536l.m120484d(this.f71765b, ((C28274c) obj).f71765b);
        }

        public int hashCode() {
            return this.f71765b.hashCode();
        }

        public String toString() {
            C28261a aVar = this.f71765b;
            return "ProfilePictureChanged(contact=" + aVar + ")";
        }
    }

    /* renamed from: su.f$d */
    public static final class C28275d extends C28271f {

        /* renamed from: b */
        private final C28261a f71766b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C28275d(C28261a aVar) {
            super(aVar, (DefaultConstructorMarker) null);
            C41536l.m120489i(aVar, "contact");
            this.f71766b = aVar;
        }

        /* renamed from: a */
        public C28261a mo67884a() {
            return this.f71766b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C28275d) && C41536l.m120484d(this.f71766b, ((C28275d) obj).f71766b);
        }

        public int hashCode() {
            return this.f71766b.hashCode();
        }

        public String toString() {
            C28261a aVar = this.f71766b;
            return "Updated(contact=" + aVar + ")";
        }
    }

    public /* synthetic */ C28271f(C28261a aVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(aVar);
    }

    /* renamed from: a */
    public abstract C28261a mo67884a();

    private C28271f(C28261a aVar) {
        this.f71762a = aVar;
    }
}
