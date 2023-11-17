package wa1;

import ba1.C10145d;
import ba1.C10146d0;
import ed1.C40734b;
import ed1.C40762x;
import hb1.C36175k;
import he1.C41238w;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import p217q2.C7843j;
import p341ge.bog.sso_client.models.C35962r;
import p341ge.bog.sso_client.models.Session;
import qa1.C27700a1;
import sso.queery.AddContactQuery;
import sso.queery.GetClientInfoQuery;
import sso.queery.RemoveContactQuery;
import sso.queery.RemoveProfilePictureQuery;
import sso.queery.RequestFinancialContactSetQuery;
import sso.queery.SetFinancialPhoneQuery;
import sso.queery.UpdateProfilePictureStatusQuery;
import sso.queery.UpdateUsernameQuery;
import sso.queery.UploadProfilePictureQuery;
import sso.type.ContactType;
import sso.type.InputUpdateUsernameRequest;
import ue1.C43075l;
import ya1.C40042a;

/* renamed from: wa1.d */
public final class C39622d implements C40042a {

    /* renamed from: a */
    private final C27700a1 f94130a;

    /* renamed from: b */
    private final C36175k f94131b;

    /* renamed from: wa1.d$a */
    static final class C39623a extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ GetClientInfoQuery.GetClientInfo f94132d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C39623a(GetClientInfoQuery.GetClientInfo getClientInfo) {
            super(1);
            this.f94132d = getClientInfo;
        }

        /* renamed from: a */
        public final void mo93285a(Session session) {
            C41536l.m120489i(session, "$this$edit");
            session.setAvatarUrl(this.f94132d.getImageURL());
            session.setUsername$sso_client_release(this.f94132d.getUsername());
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo93285a((Session) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: wa1.d$b */
    static final class C39624b extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ String f94133d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C39624b(String str) {
            super(1);
            this.f94133d = str;
        }

        /* renamed from: a */
        public final void mo93286a(Session session) {
            C41536l.m120489i(session, "$this$edit");
            session.setUsername$sso_client_release(this.f94133d);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo93286a((Session) obj);
            return C41238w.f97225a;
        }
    }

    public C39622d(C27700a1 a1Var, C36175k kVar) {
        C41536l.m120489i(a1Var, "storage");
        C41536l.m120489i(kVar, "apolloFactory");
        this.f94130a = a1Var;
        this.f94131b = kVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: m */
    public static final GetClientInfoQuery.GetClientInfo m115106m(C7843j jVar) {
        C41536l.m120489i(jVar, "it");
        Object b = jVar.mo22784b();
        C41536l.m120486f(b);
        GetClientInfoQuery.CommonServices commonServices = ((GetClientInfoQuery.Data) b).getCommonServices();
        C41536l.m120486f(commonServices);
        GetClientInfoQuery.GetClientInfo getClientInfo = commonServices.getGetClientInfo();
        C41536l.m120486f(getClientInfo);
        return getClientInfo;
    }

    /* access modifiers changed from: private */
    /* renamed from: n */
    public static final void m115107n(GetClientInfoQuery.GetClientInfo getClientInfo) {
        C35962r.m107005c(C10146d0.C10159c.m37143b(), new C39623a(getClientInfo));
    }

    /* access modifiers changed from: private */
    /* renamed from: o */
    public static final void m115108o(C39622d dVar, String str) {
        C41536l.m120489i(dVar, "this$0");
        C41536l.m120489i(str, "$username");
        if (C41536l.m120484d(C10146d0.C10159c.m37143b().getUsername(), dVar.f94130a.mo67245f())) {
            dVar.f94130a.mo67253m(str);
        }
        C35962r.m107005c(C10146d0.C10159c.m37143b(), new C39624b(str));
    }

    /* renamed from: a */
    public C40734b mo93276a(String str, String str2, String str3) {
        C41536l.m120489i(str, "contactId");
        C41536l.m120489i(str2, "contactType");
        C41536l.m120489i(str3, "tmxSessionId");
        return C36175k.m107582f(this.f94131b, new RequestFinancialContactSetQuery(C10145d.m37088b(str), str2, str3), false, (C43075l) null, 6, (Object) null);
    }

    /* renamed from: b */
    public C40734b mo93277b(String str, String str2, String str3, String str4) {
        C41536l.m120489i(str, "contactId");
        C41536l.m120489i(str2, "otp");
        C41536l.m120489i(str3, "operationReference");
        C41536l.m120489i(str4, "operationId");
        return C36175k.m107582f(this.f94131b, new RemoveContactQuery(str, C10145d.m37088b(str4), C10145d.m37088b(str3), C10145d.m37088b(str2)), false, (C43075l) null, 6, (Object) null);
    }

    /* renamed from: c */
    public C40762x mo93278c() {
        C36175k kVar = this.f94131b;
        String processReference$sso_client_release = C10146d0.C10159c.m37143b().getProcessReference$sso_client_release();
        C41536l.m120486f(processReference$sso_client_release);
        C40762x m = C36175k.m107584j(kVar, new GetClientInfoQuery(processReference$sso_client_release), false, (C43075l) null, 6, (Object) null).mo95062A(new C39620b()).mo95084m(new C39621c());
        C41536l.m120488h(m, "apolloFactory.createSing…          }\n            }");
        return m;
    }

    /* renamed from: d */
    public C40734b mo93279d(boolean z) {
        return C36175k.m107582f(this.f94131b, new UpdateProfilePictureStatusQuery(C10145d.m37088b(Boolean.valueOf(z))), false, (C43075l) null, 6, (Object) null);
    }

    /* renamed from: e */
    public C40734b mo93280e(String str) {
        C41536l.m120489i(str, "profilePictureBase64");
        return C36175k.m107582f(this.f94131b, new UploadProfilePictureQuery(str), false, (C43075l) null, 6, (Object) null);
    }

    /* renamed from: f */
    public C40734b mo93281f() {
        return C36175k.m107582f(this.f94131b, new RemoveProfilePictureQuery(), false, (C43075l) null, 6, (Object) null);
    }

    /* renamed from: g */
    public C40734b mo93282g(String str, ContactType contactType, String str2, String str3, String str4) {
        C41536l.m120489i(str, "contact");
        C41536l.m120489i(contactType, "contactType");
        C41536l.m120489i(str2, "operationReference");
        C41536l.m120489i(str3, "otp");
        C41536l.m120489i(str4, "operationId");
        return C36175k.m107582f(this.f94131b, new AddContactQuery(str, contactType, C10145d.m37088b(str4), C10145d.m37088b(str2), C10145d.m37088b(str3)), false, (C43075l) null, 6, (Object) null);
    }

    /* renamed from: h */
    public C40734b mo93283h(String str, String str2, String str3) {
        C41536l.m120489i(str, "contactId");
        C41536l.m120489i(str2, "otp");
        C41536l.m120489i(str3, "tmxSessionId");
        return C36175k.m107582f(this.f94131b, new SetFinancialPhoneQuery(str, C10145d.m37088b(str2), str3), false, (C43075l) null, 6, (Object) null);
    }

    /* renamed from: i */
    public C40734b mo93284i(String str) {
        C41536l.m120489i(str, "username");
        C40734b o = C36175k.m107582f(this.f94131b, new UpdateUsernameQuery(C10145d.m37088b(new InputUpdateUsernameRequest(C10145d.m37088b(C10146d0.C10159c.m37143b().getProcessReference$sso_client_release()), C10145d.m37088b(C10146d0.C10177h.m37232a()), C10145d.m37088b(str)))), false, (C43075l) null, 6, (Object) null).mo94902o(new C39619a(this, str));
        C41536l.m120488h(o, "apolloFactory.createComp…e\n            }\n        }");
        return o;
    }
}
