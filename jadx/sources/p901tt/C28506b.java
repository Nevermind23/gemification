package p901tt;

import c60.C19511i;
import ed1.C40734b;
import ed1.C40762x;
import java.util.HashMap;
import java.util.List;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p341ge.bog.mobilebank.cleanarch.data.smstopush.entitiy.SmsNotificationEntity;
import p341ge.bog.mobilebank.cleanarch.domain.smstopush.model.SmsNotification;
import p341ge.bog.mobilebank.rest.BankApi;
import p341ge.bog.mobilebank.rest.service.IRetrofitService;
import p341ge.bog.mobilebank.shared2.network.BankApiResponse;
import p707as.C19273c;
import p722bx.C19414a;
import p912ut.C28934a;
import pc0.C27494a;
import ue1.C43075l;

/* renamed from: tt.b */
public final class C28506b implements C19414a {

    /* renamed from: d */
    public static final C28507a f72316d = new C28507a((DefaultConstructorMarker) null);

    /* renamed from: a */
    private final IRetrofitService f72317a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final C28934a f72318b;

    /* renamed from: c */
    private final C27494a f72319c;

    /* renamed from: tt.b$a */
    public static final class C28507a {
        private C28507a() {
        }

        public /* synthetic */ C28507a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: tt.b$b */
    static final class C28508b extends C41537m implements C43075l {

        /* renamed from: d */
        public static final C28508b f72320d = new C28508b();

        C28508b() {
            super(1);
        }

        /* renamed from: a */
        public final CharSequence invoke(SmsNotification smsNotification) {
            C41536l.m120489i(smsNotification, "it");
            return String.valueOf(smsNotification.mo52111d());
        }
    }

    /* renamed from: tt.b$c */
    static final class C28509c extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C28506b f72321d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C28509c(C28506b bVar) {
            super(1);
            this.f72321d = bVar;
        }

        public final List invoke(List list) {
            C41536l.m120489i(list, "it");
            return this.f72321d.f72318b.mo68688a(list);
        }
    }

    public C28506b(IRetrofitService iRetrofitService, C28934a aVar, C27494a aVar2) {
        C41536l.m120489i(iRetrofitService, "service");
        C41536l.m120489i(aVar, "smsNotificationsMapper");
        C41536l.m120489i(aVar2, "otpParamsMapBuilder");
        this.f72317a = iRetrofitService;
        this.f72318b = aVar;
        this.f72319c = aVar2;
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public static final List m87337e(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (List) lVar.invoke(obj);
    }

    /* renamed from: a */
    public C40734b mo47646a(List list, String str, String str2, String str3, String str4) {
        List list2;
        C41536l.m120489i(list, "smsNotifications");
        C41536l.m120489i(str, "deviceId");
        C41536l.m120489i(str2, "operationId");
        C41536l.m120489i(str3, "operationReference");
        C41536l.m120489i(str4, "scaAuthCode");
        if (!list.isEmpty()) {
            list2 = list;
        } else {
            list2 = null;
        }
        if (list2 != null) {
            String unused = C41358y.m120017g0(list2, ",", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, C28508b.f72320d, 30, (Object) null);
        }
        C40762x<BankApiResponse<HashMap<String, String>>> useOtpForActionSingle = this.f72317a.useOtpForActionSingle(this.f72319c.mo66809a(C19511i.m65102a(C19511i.m65103b(list), str, str2, str3, str4)));
        C41536l.m120488h(useOtpForActionSingle, "service.useOtpForActionS…\n            ))\n        )");
        return C19273c.m64720f(useOtpForActionSingle);
    }

    /* renamed from: b */
    public C40762x mo47647b() {
        C40762x<BankApiResponse<List<SmsNotificationEntity>>> smsNotifications = this.f72317a.getSmsNotifications(BankApi.SMSNOTIFS_GET_NOTIFICATION_SETS, "ALL");
        C41536l.m120488h(smsNotifications, "service.getSmsNotificati…N_SETS, MESSAGE_MODE_ALL)");
        C40762x A = C19273c.m64722h(smsNotifications).mo95062A(new C28505a(new C28509c(this)));
        C41536l.m120488h(A, "override fun getSmsNotif…per.transform(it) }\n    }");
        return A;
    }
}
