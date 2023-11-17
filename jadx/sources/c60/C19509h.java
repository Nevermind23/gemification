package c60;

import ed1.C40734b;
import ed1.C40762x;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import p341ge.bog.mobilebank.cleanarch.domain.smstopush.model.SmsNotification;
import p341ge.bog.mobilebank.rest.manager.PreferencesApiManager;
import p731cx.C19806a;
import p731cx.C19807b;
import ue1.C43075l;

/* renamed from: c60.h */
public final class C19509h {

    /* renamed from: a */
    private final C19807b f53805a;

    /* renamed from: b */
    private final C19806a f53806b;

    /* renamed from: c */
    private final PreferencesApiManager f53807c;

    /* renamed from: c60.h$a */
    static final class C19510a extends C41537m implements C43075l {

        /* renamed from: d */
        public static final C19510a f53808d = new C19510a();

        C19510a() {
            super(1);
        }

        /* renamed from: a */
        public final C19513j invoke(List list) {
            C41536l.m120489i(list, "notifications");
            ArrayList arrayList = new ArrayList();
            for (Object next : list) {
                if (((SmsNotification) next).mo52113e()) {
                    arrayList.add(next);
                }
            }
            return C19513j.f53810c.mo47753a(arrayList);
        }
    }

    public C19509h(C19807b bVar, C19806a aVar, PreferencesApiManager preferencesApiManager) {
        C41536l.m120489i(bVar, "smsNotificationsUseCase");
        C41536l.m120489i(aVar, "convertSmsToPushUseCase");
        C41536l.m120489i(preferencesApiManager, "preferencesApiManager");
        this.f53805a = bVar;
        this.f53806b = aVar;
        this.f53807c = preferencesApiManager;
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public static final C19513j m65098d(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (C19513j) lVar.invoke(obj);
    }

    /* renamed from: b */
    public final C40734b mo47747b(List list, String str, String str2, String str3) {
        C41536l.m120489i(list, "smsNotifications");
        C41536l.m120489i(str, "operationId");
        C41536l.m120489i(str2, "operationReference");
        C41536l.m120489i(str3, "scaAuthCode");
        C19806a aVar = this.f53806b;
        String extCustomer = this.f53807c.getExtCustomer();
        C41536l.m120488h(extCustomer, "preferencesApiManager.extCustomer");
        return aVar.mo48102a(list, extCustomer, str, str2, str3);
    }

    /* renamed from: c */
    public final C40762x mo47748c() {
        C40762x A = this.f53805a.mo48103a().mo95062A(new C19508g(C19510a.f53808d));
        C41536l.m120488h(A, "smsNotificationsUseCase.…ifications)\n            }");
        return A;
    }
}
