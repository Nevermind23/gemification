package dl0;

import java.util.List;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: dl0.b */
public abstract class C20039b {

    /* renamed from: dl0.b$a */
    public static final class C20040a extends C20039b {

        /* renamed from: a */
        private final boolean f54657a;

        /* renamed from: b */
        private final List f54658b;

        /* renamed from: c */
        private final List f54659c;

        /* renamed from: d */
        private final List f54660d;

        /* renamed from: e */
        private final List f54661e;

        /* renamed from: f */
        private final List f54662f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C20040a(boolean z, List list, List list2, List list3, List list4, List list5) {
            super((DefaultConstructorMarker) null);
            C41536l.m120489i(list, "bankingProductHubs");
            C41536l.m120489i(list2, "nonBankingHubs");
            C41536l.m120489i(list3, "transactionsHubs");
            C41536l.m120489i(list4, "otherBankingHubs");
            C41536l.m120489i(list5, "ourAppsHubs");
            this.f54657a = z;
            this.f54658b = list;
            this.f54659c = list2;
            this.f54660d = list3;
            this.f54661e = list4;
            this.f54662f = list5;
        }

        /* renamed from: a */
        public final List mo48443a() {
            return this.f54658b;
        }

        /* renamed from: b */
        public final List mo48444b() {
            return this.f54659c;
        }

        /* renamed from: c */
        public final List mo48445c() {
            return this.f54661e;
        }

        /* renamed from: d */
        public final List mo48446d() {
            return this.f54662f;
        }

        /* renamed from: e */
        public final List mo48447e() {
            return this.f54660d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C20040a)) {
                return false;
            }
            C20040a aVar = (C20040a) obj;
            return this.f54657a == aVar.f54657a && C41536l.m120484d(this.f54658b, aVar.f54658b) && C41536l.m120484d(this.f54659c, aVar.f54659c) && C41536l.m120484d(this.f54660d, aVar.f54660d) && C41536l.m120484d(this.f54661e, aVar.f54661e) && C41536l.m120484d(this.f54662f, aVar.f54662f);
        }

        /* renamed from: f */
        public final boolean mo48449f() {
            return this.f54657a;
        }

        public int hashCode() {
            boolean z = this.f54657a;
            if (z) {
                z = true;
            }
            return ((((((((((z ? 1 : 0) * true) + this.f54658b.hashCode()) * 31) + this.f54659c.hashCode()) * 31) + this.f54660d.hashCode()) * 31) + this.f54661e.hashCode()) * 31) + this.f54662f.hashCode();
        }

        public String toString() {
            boolean z = this.f54657a;
            List list = this.f54658b;
            List list2 = this.f54659c;
            List list3 = this.f54660d;
            List list4 = this.f54661e;
            List list5 = this.f54662f;
            return "GroupingHubs(isBankingHidden=" + z + ", bankingProductHubs=" + list + ", nonBankingHubs=" + list2 + ", transactionsHubs=" + list3 + ", otherBankingHubs=" + list4 + ", ourAppsHubs=" + list5 + ")";
        }
    }

    /* renamed from: dl0.b$b */
    public static final class C20041b extends C20039b {

        /* renamed from: a */
        private final List f54663a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C20041b(List list) {
            super((DefaultConstructorMarker) null);
            C41536l.m120489i(list, "searchItems");
            this.f54663a = list;
        }

        /* renamed from: a */
        public final List mo48452a() {
            return this.f54663a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C20041b) && C41536l.m120484d(this.f54663a, ((C20041b) obj).f54663a);
        }

        public int hashCode() {
            return this.f54663a.hashCode();
        }

        public String toString() {
            List list = this.f54663a;
            return "SearchItems(searchItems=" + list + ")";
        }
    }

    private C20039b() {
    }

    public /* synthetic */ C20039b(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
