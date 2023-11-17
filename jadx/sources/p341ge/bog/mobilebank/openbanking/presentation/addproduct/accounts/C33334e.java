package p341ge.bog.mobilebank.openbanking.presentation.addproduct.accounts;

import b41.C31128a;
import b41.C31132b;
import he1.C41238w;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import p341ge.bog.mobilebank.openbanking.presentation.addproduct.accounts.C33326b;
import p341ge.bog.mobilebank.openbanking.presentation.addproduct.accounts.C33330c;
import ue1.C43075l;

/* renamed from: ge.bog.mobilebank.openbanking.presentation.addproduct.accounts.e */
public abstract class C33334e {

    /* renamed from: ge.bog.mobilebank.openbanking.presentation.addproduct.accounts.e$a */
    static final class C33335a extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ List f81459d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C33335a(List list) {
            super(1);
            this.f81459d = list;
        }

        /* renamed from: a */
        public final void mo79146a(List list) {
            this.f81459d.add(C33326b.C33328b.f81453a);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo79146a((List) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.openbanking.presentation.addproduct.accounts.e$b */
    static final class C33336b extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ List f81460d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C33336b(List list) {
            super(1);
            this.f81460d = list;
        }

        /* renamed from: a */
        public final void mo79147a(List list) {
            C41536l.m120489i(list, "it");
            this.f81460d.addAll(list);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo79147a((List) obj);
            return C41238w.f97225a;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static final C33330c m98010b(C33337f fVar) {
        if (fVar.mo79149c() instanceof C31128a.C31129a) {
            return C33330c.C33331a.f81456a;
        }
        ArrayList arrayList = new ArrayList();
        C33326b.C33329c d = fVar.mo79150d();
        if (d != null) {
            arrayList.add(d);
        }
        C31128a c = fVar.mo79149c();
        if (c != null) {
            C31132b.m92646h(c, (int[]) null, new C33335a(arrayList), 1, (Object) null);
        }
        C31128a c2 = fVar.mo79149c();
        if (c2 != null) {
            C31132b.m92648j(c2, (int[]) null, new C33336b(arrayList), 1, (Object) null);
        }
        return new C33330c.C33332b(arrayList);
    }
}
