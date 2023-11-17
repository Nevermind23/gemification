package ph1;

import ih1.C41368a;
import java.util.HashSet;
import java.util.Iterator;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import nh1.C41806a;
import nh1.C41807b;
import nh1.C41808c;
import org.koin.core.error.DefinitionOverrideException;

/* renamed from: ph1.b */
public final class C42205b {
    /* access modifiers changed from: private */

    /* renamed from: d */
    public static final C41808c f99309d = C41807b.m121202a("-Root-");

    /* renamed from: e */
    public static final C42206a f99310e = new C42206a((DefaultConstructorMarker) null);

    /* renamed from: a */
    private final HashSet f99311a;

    /* renamed from: b */
    private final C41806a f99312b;

    /* renamed from: c */
    private final boolean f99313c;

    /* renamed from: ph1.b$a */
    public static final class C42206a {
        private C42206a() {
        }

        public /* synthetic */ C42206a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final C41808c mo97689a() {
            return C42205b.f99309d;
        }

        /* renamed from: b */
        public final C42205b mo97690b() {
            return new C42205b(mo97689a(), true);
        }
    }

    public C42205b(C41806a aVar, boolean z) {
        C41536l.m120489i(aVar, "qualifier");
        this.f99312b = aVar;
        this.f99313c = z;
        this.f99311a = new HashSet();
    }

    /* renamed from: e */
    public static /* synthetic */ void m122576e(C42205b bVar, C41368a aVar, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        bVar.mo97684d(aVar, z);
    }

    /* renamed from: b */
    public final HashSet mo97682b() {
        return this.f99311a;
    }

    /* renamed from: c */
    public final boolean mo97683c() {
        return this.f99313c;
    }

    /* renamed from: d */
    public final void mo97684d(C41368a aVar, boolean z) {
        Object obj;
        C41536l.m120489i(aVar, "beanDefinition");
        if (this.f99311a.contains(aVar)) {
            if (aVar.mo95999c().mo96013a() || z) {
                this.f99311a.remove(aVar);
            } else {
                Iterator it = this.f99311a.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj = null;
                        break;
                    }
                    obj = it.next();
                    if (C41536l.m120484d((C41368a) obj, aVar)) {
                        break;
                    }
                }
                throw new DefinitionOverrideException("Definition '" + aVar + "' try to override existing definition. Please use override option or check for definition '" + ((C41368a) obj) + '\'');
            }
        }
        this.f99311a.add(aVar);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C42205b)) {
            return false;
        }
        C42205b bVar = (C42205b) obj;
        return C41536l.m120484d(this.f99312b, bVar.f99312b) && this.f99313c == bVar.f99313c;
    }

    /* renamed from: f */
    public final int mo97686f() {
        return this.f99311a.size();
    }

    public int hashCode() {
        C41806a aVar = this.f99312b;
        int hashCode = (aVar != null ? aVar.hashCode() : 0) * 31;
        boolean z = this.f99313c;
        if (z) {
            z = true;
        }
        return hashCode + (z ? 1 : 0);
    }

    public String toString() {
        return "ScopeDefinition(qualifier=" + this.f99312b + ", isRoot=" + this.f99313c + ")";
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C42205b(C41806a aVar, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(aVar, (i & 2) != 0 ? false : z);
    }
}
