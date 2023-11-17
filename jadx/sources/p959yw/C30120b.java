package p959yw;

import ed1.C40762x;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import p712ax.C19280a;
import p970zw.C30412a;
import ue1.C43075l;

/* renamed from: yw.b */
public final class C30120b {

    /* renamed from: a */
    private final C19280a f75960a;

    /* renamed from: yw.b$a */
    static final class C30121a extends C41537m implements C43075l {

        /* renamed from: d */
        public static final C30121a f75961d = new C30121a();

        C30121a() {
            super(1);
        }

        /* renamed from: a */
        public final Boolean invoke(C30412a aVar) {
            boolean z;
            C41536l.m120489i(aVar, "it");
            if (aVar.mo70769i() != null) {
                z = true;
            } else {
                z = false;
            }
            return Boolean.valueOf(z);
        }
    }

    public C30120b(C19280a aVar) {
        C41536l.m120489i(aVar, "repository");
        this.f75960a = aVar;
    }

    /* renamed from: c */
    public static /* synthetic */ C40762x m91112c(C30120b bVar, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        return bVar.mo70406b(str);
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public static final boolean m91113d(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return ((Boolean) lVar.invoke(obj)).booleanValue();
    }

    /* renamed from: b */
    public final C40762x mo70406b(String str) {
        C40762x xVar;
        if (str == null) {
            xVar = this.f75960a.mo47506r2();
        } else {
            xVar = this.f75960a.mo47505b(str);
        }
        C40762x C = xVar.mo95086q(new C30119a(C30121a.f75961d)).mo94946C();
        C41536l.m120488h(C, "if (bankLine == null) {\n…ints != null }.toSingle()");
        return C;
    }
}
