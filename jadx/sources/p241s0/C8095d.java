package p241s0;

import java.util.HashSet;
import java.util.Set;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p001a0.C0010c;

/* renamed from: s0.d */
public final class C8095d {

    /* renamed from: a */
    private final Set f23256a;

    /* renamed from: b */
    private final C8097b f23257b;

    /* renamed from: s0.d$a */
    public static final class C8096a {

        /* renamed from: a */
        private final Set f23258a;

        /* renamed from: b */
        private C8097b f23259b;

        public C8096a(Set set) {
            C41536l.m120489i(set, "topLevelDestinationIds");
            HashSet hashSet = new HashSet();
            this.f23258a = hashSet;
            hashSet.addAll(set);
        }

        /* renamed from: a */
        public final C8095d mo23271a() {
            return new C8095d(this.f23258a, (C0010c) null, this.f23259b, (DefaultConstructorMarker) null);
        }

        /* renamed from: b */
        public final C8096a mo23272b(C8097b bVar) {
            this.f23259b = bVar;
            return this;
        }

        /* renamed from: c */
        public final C8096a mo23273c(C0010c cVar) {
            return this;
        }
    }

    /* renamed from: s0.d$b */
    public interface C8097b {
    }

    public /* synthetic */ C8095d(Set set, C0010c cVar, C8097b bVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(set, cVar, bVar);
    }

    /* renamed from: a */
    public final C0010c mo23269a() {
        return null;
    }

    /* renamed from: b */
    public final Set mo23270b() {
        return this.f23256a;
    }

    private C8095d(Set set, C0010c cVar, C8097b bVar) {
        this.f23256a = set;
        this.f23257b = bVar;
    }
}
