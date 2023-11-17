package p757ft;

import ed1.C40762x;
import hd0.C24978b;
import java.util.List;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p341ge.bog.mobilebank.cleanarch.data.pfm.transactions.entity.AggregationsDtoApiEntity;
import p341ge.bog.mobilebank.cleanarch.data.pfm.transactions.entity.TransactionsApiEntity;
import p341ge.bog.mobilebank.cleanarch.data.pfm.transactions.entity.TransactionsSumApiEntity;
import p757ft.C20550a;
import p781ht.C25057a;
import p784hw.C25072a;
import p793iw.C25264c;
import p891su.C28261a;
import p891su.C28262b;
import ue1.C43075l;
import ue1.C43079p;

/* renamed from: ft.c */
public final class C20553c implements C25072a {

    /* renamed from: c */
    public static final C20554a f55580c = new C20554a((DefaultConstructorMarker) null);

    /* renamed from: a */
    private final C25057a f55581a;

    /* renamed from: b */
    private final C20550a f55582b;

    /* renamed from: ft.c$a */
    public static final class C20554a {
        private C20554a() {
        }

        public /* synthetic */ C20554a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: ft.c$b */
    static final class C20555b extends C41537m implements C43079p {

        /* renamed from: d */
        final /* synthetic */ C20553c f55583d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C20555b(C20553c cVar) {
            super(2);
            this.f55583d = cVar;
        }

        /* renamed from: a */
        public final C25264c invoke(TransactionsSumApiEntity transactionsSumApiEntity, TransactionsApiEntity transactionsApiEntity) {
            C41536l.m120489i(transactionsSumApiEntity, "sum");
            C41536l.m120489i(transactionsApiEntity, "transactions");
            return this.f55583d.mo49081c().mo49078d(transactionsSumApiEntity, transactionsApiEntity);
        }
    }

    /* renamed from: ft.c$c */
    static final class C20556c extends C41537m implements C43075l {

        /* renamed from: d */
        public static final C20556c f55584d = new C20556c();

        C20556c() {
            super(1);
        }

        /* renamed from: a */
        public final CharSequence invoke(C28262b bVar) {
            C41536l.m120489i(bVar, "it");
            return bVar.mo67869d();
        }
    }

    public C20553c(C25057a aVar, C20550a aVar2) {
        C41536l.m120489i(aVar, "service");
        C41536l.m120489i(aVar2, "mapper");
        this.f55581a = aVar;
        this.f55582b = aVar2;
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public static final C25264c m66806d(C43079p pVar, Object obj, Object obj2) {
        C41536l.m120489i(pVar, "$tmp0");
        return (C25264c) pVar.invoke(obj, obj2);
    }

    /* renamed from: a */
    public C40762x mo49080a(String str, Long l, Long l2, Integer num, Integer num2, Integer num3, String str2, List list, List list2, List list3, List list4, List list5, C28261a aVar, boolean z, boolean z2) {
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        C24978b bVar;
        Long l3;
        Long l4;
        String str9;
        C40762x xVar;
        int i;
        List c;
        Long l5 = l2;
        C41536l.m120489i(str, "clientKey");
        if (list != null) {
            str3 = C41358y.m120017g0(list, ",", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (C43075l) null, 62, (Object) null);
        } else {
            str3 = null;
        }
        if (list2 != null) {
            str4 = C41358y.m120017g0(list2, ",", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (C43075l) null, 62, (Object) null);
        } else {
            str4 = null;
        }
        if (list3 != null) {
            str5 = C41358y.m120017g0(list3, ",", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (C43075l) null, 62, (Object) null);
        } else {
            str5 = null;
        }
        if (list5 != null) {
            str6 = C41358y.m120017g0(list5, ",", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (C43075l) null, 62, (Object) null);
        } else {
            str6 = null;
        }
        if (list4 != null) {
            str7 = C41358y.m120017g0(list4, ",", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (C43075l) null, 62, (Object) null);
        } else {
            str7 = null;
        }
        if (aVar == null || (c = aVar.mo67845c()) == null) {
            str8 = null;
        } else {
            str8 = C41358y.m120017g0(c, ",", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, C20556c.f55584d, 30, (Object) null);
        }
        if (z) {
            bVar = C24978b.YES;
        } else {
            bVar = C24978b.NO;
        }
        C24978b bVar2 = bVar;
        if (l != null) {
            l3 = Long.valueOf(l.longValue() + ((long) 86399000));
        } else {
            l3 = null;
        }
        if (z2) {
            C25057a aVar2 = this.f55581a;
            C20550a.C20551a aVar3 = C20550a.f55576b;
            String a = aVar3.mo49079a(l3);
            String a2 = aVar3.mo49079a(l5);
            String e = bVar2.mo63391e();
            C41536l.m120488h(e, "lastOperationsFlagYesNo.value");
            l4 = l3;
            C40762x b = C25057a.C25058a.m80010b(aVar2, str, a, a2, num, num2, str2, str3, str4, str5, str6, str7, str8, e, 1, (String) null, (String) null, 0, (String) null, 245760, (Object) null);
            str9 = "lastOperationsFlagYesNo.value";
            xVar = b;
        } else {
            str9 = "lastOperationsFlagYesNo.value";
            l4 = l3;
            xVar = C40762x.m118162z(new TransactionsSumApiEntity((AggregationsDtoApiEntity) null, 1, (DefaultConstructorMarker) null));
            C41536l.m120488h(xVar, "{\n                Single…piEntity())\n            }");
        }
        C25057a aVar4 = this.f55581a;
        C20550a.C20551a aVar5 = C20550a.f55576b;
        String a3 = aVar5.mo49079a(l4);
        String a4 = aVar5.mo49079a(l5);
        if (num3 != null) {
            i = num3.intValue();
        } else {
            i = 50;
        }
        int i2 = i;
        String e2 = bVar2.mo63391e();
        C41536l.m120488h(e2, str9);
        C40762x T = C40762x.m118154T(xVar, C25057a.C25058a.m80009a(aVar4, str, a3, a4, i2, num, num2, str2, str3, str4, str5, str6, str7, str8, e2, (String) null, 16384, (Object) null), new C20552b(new C20555b(this)));
        C41536l.m120488h(T, "override fun getTransact…sactions)\n        }\n    }");
        return T;
    }

    /* renamed from: c */
    public final C20550a mo49081c() {
        return this.f55582b;
    }
}
