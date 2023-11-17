package p341ge.bog.mobilebank.openbanking.presentation.details;

import b41.C31128a;
import b41.C31132b;
import he1.C41224m;
import he1.C41238w;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import o31.C37614q;
import p341ge.bog.mobilebank.openbanking.domain.OperationsPermissionDeniedException;
import p341ge.bog.mobilebank.openbanking.presentation.details.C33425d;
import ue1.C43075l;

/* renamed from: ge.bog.mobilebank.openbanking.presentation.details.f */
public abstract class C33436f {

    /* renamed from: ge.bog.mobilebank.openbanking.presentation.details.f$a */
    static final class C33437a extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ List f81622d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C33437a(List list) {
            super(1);
            this.f81622d = list;
        }

        /* renamed from: a */
        public final void mo79250a(C33411a aVar) {
            C41536l.m120489i(aVar, "data");
            if (aVar.mo79228b()) {
                this.f81622d.add(C33425d.C33428c.f81612a);
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo79250a((C33411a) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.openbanking.presentation.details.f$b */
    static final class C33438b extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ List f81623d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C33438b(List list) {
            super(1);
            this.f81623d = list;
        }

        /* renamed from: a */
        public final void mo79251a(C33411a aVar) {
            List list = this.f81623d;
            ArrayList arrayList = new ArrayList(3);
            for (int i = 0; i < 3; i++) {
                arrayList.add(C33425d.C33430e.f81616a);
            }
            list.addAll(arrayList);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo79251a((C33411a) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.openbanking.presentation.details.f$c */
    static final class C33439c extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ List f81624d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C33439c(List list) {
            super(1);
            this.f81624d = list;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Throwable) obj);
            return C41238w.f97225a;
        }

        public final void invoke(Throwable th) {
            C41536l.m120489i(th, "exception");
            if (th instanceof OperationsPermissionDeniedException) {
                this.f81624d.add(C33425d.C33433h.f81619a);
            } else {
                this.f81624d.add(C33425d.C33432g.f81618a);
            }
        }
    }

    /* renamed from: ge.bog.mobilebank.openbanking.presentation.details.f$d */
    static final class C33440d extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ List f81625d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C33440d(List list) {
            super(1);
            this.f81625d = list;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Throwable) obj);
            return C41238w.f97225a;
        }

        public final void invoke(Throwable th) {
            C41536l.m120489i(th, "it");
            this.f81625d.add(C33425d.C33431f.f81617a);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static final List m98186b(C33441g gVar) {
        C31128a aVar;
        ArrayList arrayList = new ArrayList();
        C37614q.m110615a(arrayList, gVar.mo79259f());
        C37614q.m110615a(arrayList, gVar.mo79255c());
        arrayList.add(C33425d.C33427b.f81611a);
        arrayList.addAll(gVar.mo79257e());
        C41224m d = gVar.mo79256d();
        if (!(d == null || (aVar = (C31128a) d.mo95680f()) == null)) {
            C31132b.m92647i(aVar, new int[]{1, 6}, new C33437a(arrayList));
            C31132b.m92646h(aVar, (int[]) null, new C33438b(arrayList), 1, (Object) null);
            C31132b.m92641c(aVar, new int[]{1, 6}, new C33439c(arrayList));
            C31132b.m92641c(aVar, new int[]{3}, new C33440d(arrayList));
        }
        return arrayList;
    }
}
