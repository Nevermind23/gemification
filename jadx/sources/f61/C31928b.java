package f61;

import com.salesforce.marketingcloud.storage.p385db.C11769i;
import j31.C36726b;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: f61.b */
public abstract class C31928b {

    /* renamed from: f61.b$a */
    public static final class C31929a extends C31928b {

        /* renamed from: a */
        private final C36726b f78687a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C31929a(C36726b bVar) {
            super((DefaultConstructorMarker) null);
            C41536l.m120489i(bVar, C11769i.C11770a.f34149l);
            this.f78687a = bVar;
        }

        /* renamed from: a */
        public final C36726b mo72374a() {
            return this.f78687a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C31929a) && C41536l.m120484d(this.f78687a, ((C31929a) obj).f78687a);
        }

        public int hashCode() {
            return this.f78687a.hashCode();
        }

        public String toString() {
            C36726b bVar = this.f78687a;
            return "DeepLink(url=" + bVar + ")";
        }
    }

    /* renamed from: f61.b$b */
    public static final class C31930b extends C31928b {

        /* renamed from: a */
        private final String f78688a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C31930b(String str) {
            super((DefaultConstructorMarker) null);
            C41536l.m120489i(str, C11769i.C11770a.f34149l);
            this.f78688a = str;
        }

        /* renamed from: a */
        public final String mo72378a() {
            return this.f78688a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C31930b) && C41536l.m120484d(this.f78688a, ((C31930b) obj).f78688a);
        }

        public int hashCode() {
            return this.f78688a.hashCode();
        }

        public String toString() {
            String str = this.f78688a;
            return "Url(url=" + str + ")";
        }
    }

    private C31928b() {
    }

    public /* synthetic */ C31928b(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
