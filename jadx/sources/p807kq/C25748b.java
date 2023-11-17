package p807kq;

import ed1.C40762x;
import j51.C36732d;
import j51.C36734f;
import java.util.Iterator;
import java.util.List;
import k51.C36873a;
import k51.C36874b;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import p817lq.C26056a;
import p959yw.C30120b;
import p970zw.C30412a;
import ue1.C43079p;

/* renamed from: kq.b */
public final class C25748b {

    /* renamed from: a */
    private final C25750c f65535a;

    /* renamed from: b */
    private final C30120b f65536b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final C36732d f65537c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final C36734f f65538d;

    /* renamed from: kq.b$a */
    static final class C25749a extends C41537m implements C43079p {

        /* renamed from: d */
        final /* synthetic */ C25748b f65539d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C25749a(C25748b bVar) {
            super(2);
            this.f65539d = bVar;
        }

        /* renamed from: a */
        public final C26056a invoke(List list, C30412a aVar) {
            String str;
            Object obj;
            String str2;
            Object obj2;
            C41536l.m120489i(list, "lookupData");
            C41536l.m120489i(aVar, "serviceCenter");
            Iterator it = this.f65539d.f65538d.mo89561a().iterator();
            while (true) {
                str = null;
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (((C36874b) obj).mo89807b()) {
                    break;
                }
            }
            C36874b bVar = (C36874b) obj;
            if (bVar != null) {
                str2 = bVar.mo89806a();
            } else {
                str2 = null;
            }
            String str3 = "";
            if (str2 == null) {
                str2 = str3;
            }
            Iterator it2 = this.f65539d.f65537c.mo89559a().iterator();
            while (true) {
                if (!it2.hasNext()) {
                    obj2 = null;
                    break;
                }
                obj2 = it2.next();
                if (((C36873a) obj2).mo89801c()) {
                    break;
                }
            }
            C36873a aVar2 = (C36873a) obj2;
            if (aVar2 != null) {
                str = aVar2.mo89800b();
            }
            if (str != null) {
                str3 = str;
            }
            return new C26056a(list, aVar, str2, str3);
        }
    }

    public C25748b(C25750c cVar, C30120b bVar, C36732d dVar, C36734f fVar) {
        C41536l.m120489i(cVar, "getDropdownValues");
        C41536l.m120489i(bVar, "getServiceCenters");
        C41536l.m120489i(dVar, "getClientMails");
        C41536l.m120489i(fVar, "getClientPhones");
        this.f65535a = cVar;
        this.f65536b = bVar;
        this.f65537c = dVar;
        this.f65538d = fVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public static final C26056a m81001e(C43079p pVar, Object obj, Object obj2) {
        C41536l.m120489i(pVar, "$tmp0");
        return (C26056a) pVar.invoke(obj, obj2);
    }

    /* renamed from: d */
    public final C40762x mo64334d() {
        C40762x T = C40762x.m118154T(this.f65535a.mo64336a(), this.f65536b.mo70406b("SOLO"), new C25747a(new C25749a(this)));
        C41536l.m120488h(T, "operator fun invoke() =\n…)\n            )\n        }");
        return T;
    }
}
