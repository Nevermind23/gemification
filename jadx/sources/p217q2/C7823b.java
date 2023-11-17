package p217q2;

import androidx.work.C1958d;
import com.salesforce.marketingcloud.storage.p385db.C11755a;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: q2.b */
public abstract class C7823b {

    /* renamed from: b */
    public static final C7824a f22745b = new C7824a((DefaultConstructorMarker) null);

    /* renamed from: a */
    public final Object f22746a;

    /* renamed from: q2.b$a */
    public static final class C7824a {
        private C7824a() {
        }

        public /* synthetic */ C7824a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final C7823b mo22744a(Object obj) {
            C41536l.m120490j(obj, C11755a.C11756a.f34100b);
            if (obj instanceof Map) {
                return new C7827d((Map) obj);
            }
            if (obj instanceof List) {
                return new C7826c((List) obj);
            }
            if (obj instanceof Boolean) {
                return new C7825b(((Boolean) obj).booleanValue());
            }
            if (obj instanceof Number) {
                return new C7828e((Number) obj);
            }
            return new C7829f(obj.toString());
        }
    }

    /* renamed from: q2.b$b */
    public static final class C7825b extends C7823b {
        public C7825b(boolean z) {
            super(Boolean.valueOf(z), (DefaultConstructorMarker) null);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if ((obj instanceof C7825b) && ((Boolean) this.f22746a).booleanValue() == ((Boolean) ((C7825b) obj).f22746a).booleanValue()) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return C1958d.m7693a(((Boolean) this.f22746a).booleanValue());
        }
    }

    /* renamed from: q2.b$c */
    public static final class C7826c extends C7823b {
        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C7826c(List list) {
            super(list, (DefaultConstructorMarker) null);
            C41536l.m120490j(list, C11755a.C11756a.f34100b);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if ((obj instanceof C7826c) && !(!C41536l.m120484d((List) this.f22746a, (List) ((C7826c) obj).f22746a))) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return this.f22746a.hashCode();
        }
    }

    /* renamed from: q2.b$d */
    public static final class C7827d extends C7823b {
        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C7827d(Map map) {
            super(map, (DefaultConstructorMarker) null);
            C41536l.m120490j(map, C11755a.C11756a.f34100b);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if ((obj instanceof C7827d) && !(!C41536l.m120484d((Map) this.f22746a, (Map) ((C7827d) obj).f22746a))) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return this.f22746a.hashCode();
        }
    }

    /* renamed from: q2.b$e */
    public static final class C7828e extends C7823b {
        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C7828e(Number number) {
            super(number, (DefaultConstructorMarker) null);
            C41536l.m120490j(number, C11755a.C11756a.f34100b);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if ((obj instanceof C7828e) && !(!C41536l.m120484d((Number) this.f22746a, (Number) ((C7828e) obj).f22746a))) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return ((Number) this.f22746a).hashCode();
        }
    }

    /* renamed from: q2.b$f */
    public static final class C7829f extends C7823b {
        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C7829f(String str) {
            super(str, (DefaultConstructorMarker) null);
            C41536l.m120490j(str, C11755a.C11756a.f34100b);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if ((obj instanceof C7829f) && !(!C41536l.m120484d((String) this.f22746a, (String) ((C7829f) obj).f22746a))) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return ((String) this.f22746a).hashCode();
        }
    }

    private C7823b(Object obj) {
        this.f22746a = obj;
    }

    public /* synthetic */ C7823b(Object obj, DefaultConstructorMarker defaultConstructorMarker) {
        this(obj);
    }
}
