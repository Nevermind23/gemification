package f01;

import ed1.C40734b;
import ed1.C40762x;
import g01.C32039a;
import h01.C36139a;
import h01.C36141b;
import java.util.HashMap;
import java.util.List;
import k01.C36860a;
import kotlin.jvm.internal.C41535k;
import kotlin.jvm.internal.C41536l;
import m01.C37194h;
import p341ge.bog.mobilebank.qrwithdrawal.data.model.QrCashOutApiModel;
import ue1.C43075l;

/* renamed from: f01.c */
public final class C31904c implements C36860a {

    /* renamed from: a */
    private final C32039a f78647a;

    /* renamed from: b */
    private final C36139a f78648b;

    /* renamed from: c */
    private final C36141b f78649c;

    /* renamed from: f01.c$a */
    /* synthetic */ class C31905a extends C41535k implements C43075l {
        C31905a(Object obj) {
            super(1, obj, C36139a.class, "convert", "convert(Lge/bog/mobilebank/qrwithdrawal/data/model/QrCashOutApiModel;)Lge/bog/mobilebank/qrwithdrawal/domain/model/QrCashOutData;", 0);
        }

        /* renamed from: b */
        public final C37194h invoke(QrCashOutApiModel qrCashOutApiModel) {
            C41536l.m120489i(qrCashOutApiModel, "p0");
            return ((C36139a) this.receiver).mo88893d(qrCashOutApiModel);
        }
    }

    /* renamed from: f01.c$b */
    /* synthetic */ class C31906b extends C41535k implements C43075l {
        C31906b(Object obj) {
            super(1, obj, C36141b.class, "convert", "convert(Ljava/util/List;)Ljava/util/List;", 0);
        }

        public final List invoke(List list) {
            C41536l.m120489i(list, "p0");
            return ((C36141b) this.receiver).mo88894a(list);
        }
    }

    public C31904c(C32039a aVar, C36139a aVar2, C36141b bVar) {
        C41536l.m120489i(aVar, "qrServiceApi");
        C41536l.m120489i(aVar2, "qrCashOutMapper");
        C41536l.m120489i(bVar, "qrDailyLimitMapper");
        this.f78647a = aVar;
        this.f78648b = aVar2;
        this.f78649c = bVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: f */
    public static final C37194h m94243f(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (C37194h) lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: g */
    public static final List m94244g(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (List) lVar.invoke(obj);
    }

    /* renamed from: a */
    public C40734b mo72344a(HashMap hashMap) {
        C41536l.m120489i(hashMap, "params");
        return this.f78647a.mo72530a(hashMap);
    }

    /* renamed from: b */
    public C40762x mo72345b(String str) {
        C40762x A = this.f78647a.mo72531b(str).mo95062A(new C31903b(new C31906b(this.f78649c)));
        C41536l.m120488h(A, "qrServiceApi.getDailyLim…ailyLimitMapper::convert)");
        return A;
    }

    /* renamed from: c */
    public C40762x mo72346c(String str, String str2) {
        C40762x A = this.f78647a.mo72532c(str, str2).mo95062A(new C31902a(new C31905a(this.f78648b)));
        C41536l.m120488h(A, "qrServiceApi.getBills(at…qrCashOutMapper::convert)");
        return A;
    }
}
