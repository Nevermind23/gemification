package oj0;

import hj0.C25034b;
import java.util.List;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import rj0.C28046a;

/* renamed from: oj0.a */
public final class C27020a {

    /* renamed from: b */
    public static final C27021a f67840b = new C27021a((DefaultConstructorMarker) null);

    /* renamed from: a */
    private final List f67841a;

    /* renamed from: oj0.a$a */
    public static final class C27021a {
        private C27021a() {
        }

        public /* synthetic */ C27021a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public C27020a(C25034b bVar) {
        C41536l.m120489i(bVar, "provideDictValue");
        this.f67841a = C41341q.m119910m(new C28046a(bVar.mo63467a("giftcard.terms.of.use.story.slide.1")), new C28046a(bVar.mo63467a("giftcard.terms.of.use.story.slide.2")), new C28046a(bVar.mo63467a("giftcard.terms.of.use.story.slide.3")));
    }

    /* renamed from: a */
    public final boolean mo66252a(int i) {
        return i == this.f67841a.size() - 1;
    }

    /* renamed from: b */
    public final List mo66253b() {
        return this.f67841a;
    }
}
