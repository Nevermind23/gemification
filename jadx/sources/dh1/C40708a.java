package dh1;

import af1.C40296c;
import androidx.lifecycle.C1580f0;
import java.util.List;
import kotlin.jvm.internal.C41520a0;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import mh1.C41769a;

/* renamed from: dh1.a */
public final class C40708a extends C41769a {

    /* renamed from: d */
    public static final C40709a f96386d = new C40709a((DefaultConstructorMarker) null);

    /* renamed from: c */
    private final C1580f0 f96387c;

    /* renamed from: dh1.a$a */
    public static final class C40709a {
        private C40709a() {
        }

        public /* synthetic */ C40709a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final C40708a mo94870a(C1580f0 f0Var, C41769a aVar) {
            C41536l.m120489i(f0Var, "state");
            C41536l.m120489i(aVar, "params");
            return new C40708a(f0Var, aVar.mo96592c());
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C40708a(C1580f0 f0Var, List list) {
        super(list);
        C41536l.m120489i(f0Var, "state");
        C41536l.m120489i(list, "values");
        this.f96387c = f0Var;
    }

    /* renamed from: b */
    public Object mo94869b(C40296c cVar) {
        C41536l.m120489i(cVar, "clazz");
        if (C41536l.m120484d(cVar, C41520a0.m120436b(C1580f0.class))) {
            return this.f96387c;
        }
        return super.mo94869b(cVar);
    }
}
