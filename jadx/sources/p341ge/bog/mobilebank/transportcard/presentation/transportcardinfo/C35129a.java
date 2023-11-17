package p341ge.bog.mobilebank.transportcard.presentation.transportcardinfo;

import java.util.List;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: ge.bog.mobilebank.transportcard.presentation.transportcardinfo.a */
public abstract class C35129a {

    /* renamed from: ge.bog.mobilebank.transportcard.presentation.transportcardinfo.a$a */
    public static final class C35130a extends C35129a {

        /* renamed from: a */
        public static final C35130a f84682a = new C35130a();

        private C35130a() {
            super((DefaultConstructorMarker) null);
        }
    }

    /* renamed from: ge.bog.mobilebank.transportcard.presentation.transportcardinfo.a$b */
    public static final class C35131b extends C35129a {

        /* renamed from: a */
        private final int f84683a;

        public C35131b(int i) {
            super((DefaultConstructorMarker) null);
            this.f84683a = i;
        }

        /* renamed from: a */
        public final int mo86013a() {
            return this.f84683a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C35131b) && this.f84683a == ((C35131b) obj).f84683a;
        }

        public int hashCode() {
            return this.f84683a;
        }

        public String toString() {
            int i = this.f84683a;
            return "Loading(requestCode=" + i + ")";
        }
    }

    /* renamed from: ge.bog.mobilebank.transportcard.presentation.transportcardinfo.a$c */
    public static final class C35132c extends C35129a {

        /* renamed from: a */
        private final List f84684a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C35132c(List list) {
            super((DefaultConstructorMarker) null);
            C41536l.m120489i(list, "activePasses");
            this.f84684a = list;
        }

        /* renamed from: a */
        public final List mo86017a() {
            return this.f84684a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C35132c) && C41536l.m120484d(this.f84684a, ((C35132c) obj).f84684a);
        }

        public int hashCode() {
            return this.f84684a.hashCode();
        }

        public String toString() {
            List list = this.f84684a;
            return "Success(activePasses=" + list + ")";
        }
    }

    private C35129a() {
    }

    public /* synthetic */ C35129a(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
