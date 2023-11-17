package zn0;

import ao0.C10124e;
import ed1.C40762x;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.C41535k;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import ue1.C43075l;
import uo0.C18272d;
import uo0.C18273e;
import vo0.C18490b;

/* renamed from: zn0.i */
public final class C19095i {

    /* renamed from: a */
    private final C19102n f53268a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final C18490b f53269b;

    /* renamed from: zn0.i$a */
    /* synthetic */ class C19096a extends C41535k implements C43075l {
        C19096a(Object obj) {
            super(1, obj, C18490b.class, "transform", "transformCategories(Ljava/util/List;)Ljava/util/List;", 0);
        }

        public final List invoke(List list) {
            return ((C18490b) this.receiver).mo46282j(list);
        }
    }

    /* renamed from: zn0.i$b */
    static final class C19097b extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C19095i f53270d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C19097b(C19095i iVar) {
            super(1);
            this.f53270d = iVar;
        }

        /* renamed from: a */
        public final C10124e invoke(List list) {
            C41536l.m120489i(list, "offerCategories");
            C19095i iVar = this.f53270d;
            ArrayList arrayList = new ArrayList(C41343r.m119925u(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(iVar.f53269b.mo46283l((C18272d) it.next()));
            }
            ArrayList arrayList2 = new ArrayList();
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                boolean unused = C41352v.m119965z(arrayList2, ((C18272d) it2.next()).mo45947g());
            }
            HashSet hashSet = new HashSet();
            ArrayList<C18273e> arrayList3 = new ArrayList<>();
            for (Object next : arrayList2) {
                if (hashSet.add(((C18273e) next).mo45952c())) {
                    arrayList3.add(next);
                }
            }
            ArrayList arrayList4 = new ArrayList(C41343r.m119925u(arrayList3, 10));
            for (C18273e c : arrayList3) {
                arrayList4.add(c.mo45952c());
            }
            return new C10124e(arrayList, arrayList4);
        }
    }

    public C19095i(C19102n nVar, C18490b bVar) {
        C41536l.m120489i(nVar, "getLifestyleOffersAndCategories");
        C41536l.m120489i(bVar, "mapper");
        this.f53268a = nVar;
        this.f53269b = bVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public static final List m64449e(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (List) lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: f */
    public static final C10124e m64450f(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (C10124e) lVar.invoke(obj);
    }

    /* renamed from: d */
    public final C40762x mo47296d() {
        C40762x A = this.f53268a.mo47303a().mo95062A(new C19093g(new C19096a(this.f53269b))).mo95062A(new C19094h(new C19097b(this)));
        C41536l.m120488h(A, "operator fun invoke(): S…es, badges)\n            }");
        return A;
    }
}
