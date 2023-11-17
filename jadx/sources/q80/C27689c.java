package q80;

import ed1.C40735b0;
import ed1.C40762x;
import java.util.List;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import r80.C27949c;
import s80.C28162a;
import ue1.C43075l;

/* renamed from: q80.c */
public final class C27689c {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final C28162a f70803a;

    /* renamed from: b */
    private final C27691d f70804b;

    /* renamed from: q80.c$a */
    static final class C27690a extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C27689c f70805d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C27690a(C27689c cVar) {
            super(1);
            this.f70805d = cVar;
        }

        /* renamed from: a */
        public final C40735b0 invoke(List list) {
            C41536l.m120489i(list, "loanTypes");
            C27949c cVar = (C27949c) C41358y.m120007W(list);
            return this.f70805d.f70803a.mo47415e(cVar.mo67535b(), cVar.mo67534a());
        }
    }

    public C27689c(C28162a aVar, C27691d dVar) {
        C41536l.m120489i(aVar, "loanDetailsRepository");
        C41536l.m120489i(dVar, "getLoanTypesUseCase");
        this.f70803a = aVar;
        this.f70804b = dVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public static final C40735b0 m85702d(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (C40735b0) lVar.invoke(obj);
    }

    /* renamed from: c */
    public final C40762x mo67228c() {
        C40762x r = this.f70804b.mo67230a().mo95087r(new C27688b(new C27690a(this)));
        C41536l.m120488h(r, "operator fun invoke(): S…bProduct)\n        }\n    }");
        return r;
    }
}
