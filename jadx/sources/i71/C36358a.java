package i71;

import ed1.C40762x;
import k71.C36888a;
import kotlin.jvm.internal.C41536l;

/* renamed from: i71.a */
public final class C36358a {

    /* renamed from: a */
    private final C36888a f87730a;

    /* renamed from: i71.a$a */
    public static final class C36359a {

        /* renamed from: a */
        private final String f87731a;

        /* renamed from: b */
        private final String f87732b;

        /* renamed from: c */
        private final String f87733c;

        /* renamed from: d */
        private final String f87734d;

        public C36359a(String str, String str2, String str3, String str4) {
            C41536l.m120489i(str, "oldDeviceId");
            C41536l.m120489i(str2, "oldDeviceType");
            C41536l.m120489i(str3, "newDeviceId");
            C41536l.m120489i(str4, "newDeviceType");
            this.f87731a = str;
            this.f87732b = str2;
            this.f87733c = str3;
            this.f87734d = str4;
        }

        /* renamed from: a */
        public final String mo89082a() {
            return this.f87733c;
        }

        /* renamed from: b */
        public final String mo89083b() {
            return this.f87734d;
        }

        /* renamed from: c */
        public final String mo89084c() {
            return this.f87731a;
        }

        /* renamed from: d */
        public final String mo89085d() {
            return this.f87732b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C36359a)) {
                return false;
            }
            C36359a aVar = (C36359a) obj;
            return C41536l.m120484d(this.f87731a, aVar.f87731a) && C41536l.m120484d(this.f87732b, aVar.f87732b) && C41536l.m120484d(this.f87733c, aVar.f87733c) && C41536l.m120484d(this.f87734d, aVar.f87734d);
        }

        public int hashCode() {
            return (((((this.f87731a.hashCode() * 31) + this.f87732b.hashCode()) * 31) + this.f87733c.hashCode()) * 31) + this.f87734d.hashCode();
        }

        public String toString() {
            String str = this.f87731a;
            String str2 = this.f87732b;
            String str3 = this.f87733c;
            String str4 = this.f87734d;
            return "Params(oldDeviceId=" + str + ", oldDeviceType=" + str2 + ", newDeviceId=" + str3 + ", newDeviceType=" + str4 + ")";
        }
    }

    public C36358a(C36888a aVar) {
        C41536l.m120489i(aVar, "transportCardRepository");
        this.f87730a = aVar;
    }

    /* renamed from: a */
    public final C40762x mo89081a(C36359a aVar) {
        C41536l.m120489i(aVar, "params");
        return this.f87730a.mo72427f0(aVar.mo89084c(), aVar.mo89085d(), aVar.mo89082a(), aVar.mo89083b());
    }
}
