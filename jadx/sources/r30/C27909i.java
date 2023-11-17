package r30;

import java.util.List;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import r30.C27906g;

/* renamed from: r30.i */
public abstract class C27909i implements C27906g {

    /* renamed from: a */
    private final C27906g.C27907a f71097a;

    /* renamed from: r30.i$a */
    public static final class C27910a extends C27909i {

        /* renamed from: b */
        public static final C27910a f71098b = new C27910a();

        private C27910a() {
            super((DefaultConstructorMarker) null);
        }
    }

    /* renamed from: r30.i$b */
    public static final class C27911b extends C27909i {

        /* renamed from: b */
        public static final C27911b f71099b = new C27911b();

        private C27911b() {
            super((DefaultConstructorMarker) null);
        }
    }

    /* renamed from: r30.i$c */
    public static final class C27912c extends C27909i {

        /* renamed from: b */
        public static final C27912c f71100b = new C27912c();

        private C27912c() {
            super((DefaultConstructorMarker) null);
        }
    }

    /* renamed from: r30.i$d */
    public static final class C27913d extends C27909i {

        /* renamed from: b */
        private final List f71101b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C27913d(List list) {
            super((DefaultConstructorMarker) null);
            C41536l.m120489i(list, "payments");
            this.f71101b = list;
        }

        /* renamed from: b */
        public final List mo67486b() {
            return this.f71101b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C27913d) && C41536l.m120484d(this.f71101b, ((C27913d) obj).f71101b);
        }

        public int hashCode() {
            return this.f71101b.hashCode();
        }

        public String toString() {
            List list = this.f71101b;
            return "PaymentsAndTemplates(payments=" + list + ")";
        }
    }

    public /* synthetic */ C27909i(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* renamed from: a */
    public C27906g.C27907a mo67429a() {
        return this.f71097a;
    }

    private C27909i() {
        this.f71097a = C27906g.C27907a.PAYMENTS_GROUP;
    }
}
