package p856oz;

import i20.C25104d;
import java.util.List;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: oz.a */
public abstract class C27095a {

    /* renamed from: oz.a$a */
    public static final class C27096a extends C27095a {

        /* renamed from: a */
        public static final C27096a f68060a = new C27096a();

        private C27096a() {
            super((DefaultConstructorMarker) null);
        }
    }

    /* renamed from: oz.a$b */
    public static final class C27097b extends C27095a {

        /* renamed from: a */
        public static final C27097b f68061a = new C27097b();

        private C27097b() {
            super((DefaultConstructorMarker) null);
        }
    }

    /* renamed from: oz.a$c */
    public static final class C27098c extends C27095a {

        /* renamed from: a */
        private final List f68062a;

        /* renamed from: b */
        private final C25104d f68063b;

        /* renamed from: c */
        private final C27099b f68064c;

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ C27098c(List list, C25104d dVar, C27099b bVar, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(list, dVar, (i & 4) != 0 ? null : bVar);
        }

        /* renamed from: b */
        public static /* synthetic */ C27098c m84007b(C27098c cVar, List list, C25104d dVar, C27099b bVar, int i, Object obj) {
            if ((i & 1) != 0) {
                list = cVar.f68062a;
            }
            if ((i & 2) != 0) {
                dVar = cVar.f68063b;
            }
            if ((i & 4) != 0) {
                bVar = cVar.f68064c;
            }
            return cVar.mo66389a(list, dVar, bVar);
        }

        /* renamed from: a */
        public final C27098c mo66389a(List list, C25104d dVar, C27099b bVar) {
            C41536l.m120489i(list, "remittanceProviders");
            return new C27098c(list, dVar, bVar);
        }

        /* renamed from: c */
        public final C25104d mo66390c() {
            return this.f68063b;
        }

        /* renamed from: d */
        public final List mo66391d() {
            return this.f68062a;
        }

        /* renamed from: e */
        public final C27099b mo66392e() {
            return this.f68064c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C27098c)) {
                return false;
            }
            C27098c cVar = (C27098c) obj;
            return C41536l.m120484d(this.f68062a, cVar.f68062a) && C41536l.m120484d(this.f68063b, cVar.f68063b) && C41536l.m120484d(this.f68064c, cVar.f68064c);
        }

        public int hashCode() {
            int hashCode = this.f68062a.hashCode() * 31;
            C25104d dVar = this.f68063b;
            int i = 0;
            int hashCode2 = (hashCode + (dVar == null ? 0 : dVar.hashCode())) * 31;
            C27099b bVar = this.f68064c;
            if (bVar != null) {
                i = bVar.hashCode();
            }
            return hashCode2 + i;
        }

        public String toString() {
            List list = this.f68062a;
            C25104d dVar = this.f68063b;
            C27099b bVar = this.f68064c;
            return "Success(remittanceProviders=" + list + ", banner=" + dVar + ", universalRemittanceUiState=" + bVar + ")";
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C27098c(List list, C25104d dVar, C27099b bVar) {
            super((DefaultConstructorMarker) null);
            C41536l.m120489i(list, "remittanceProviders");
            this.f68062a = list;
            this.f68063b = dVar;
            this.f68064c = bVar;
        }
    }

    private C27095a() {
    }

    public /* synthetic */ C27095a(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
