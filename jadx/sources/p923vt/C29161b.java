package p923vt;

import ed1.C40762x;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p341ge.bog.mobilebank.cleanarch.data.common.entity.YesNoApiEntity;
import p341ge.bog.mobilebank.cleanarch.data.studentcard.StudentCardStatusApiEntity;
import p341ge.bog.mobilebank.rest.service.IRetrofitService;
import p341ge.bog.mobilebank.shared2.network.BankApiResponse;
import p707as.C19273c;
import p751ex.C20303a;
import ue1.C43075l;

/* renamed from: vt.b */
public final class C29161b implements C20303a {

    /* renamed from: b */
    public static final C29162a f74179b = new C29162a((DefaultConstructorMarker) null);

    /* renamed from: a */
    private final IRetrofitService f74180a;

    /* renamed from: vt.b$a */
    public static final class C29162a {
        private C29162a() {
        }

        public /* synthetic */ C29162a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: vt.b$b */
    static final class C29163b extends C41537m implements C43075l {

        /* renamed from: d */
        public static final C29163b f74181d = new C29163b();

        C29163b() {
            super(1);
        }

        /* renamed from: a */
        public final Boolean invoke(StudentCardStatusApiEntity studentCardStatusApiEntity) {
            C41536l.m120489i(studentCardStatusApiEntity, "it");
            return Boolean.valueOf(C41536l.m120484d(studentCardStatusApiEntity.getShowStudentCardBanner(), YesNoApiEntity.YES.getValue()));
        }
    }

    public C29161b(IRetrofitService iRetrofitService) {
        C41536l.m120489i(iRetrofitService, "service");
        this.f74180a = iRetrofitService;
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public static final Boolean m89091c(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (Boolean) lVar.invoke(obj);
    }

    /* renamed from: a */
    public C40762x mo48787a() {
        C40762x<BankApiResponse<StudentCardStatusApiEntity>> studentCardStatus = this.f74180a.getStudentCardStatus("COMMON_GET_STUDENT_CARD_BANNER_STATUS");
        C41536l.m120488h(studentCardStatus, "service.getStudentCardSt…UDENT_CARD_BANNER_STATUS)");
        C40762x A = C19273c.m64722h(studentCardStatus).mo95062A(new C29160a(C29163b.f74181d));
        C41536l.m120488h(A, "service.getStudentCardSt…esNoApiEntity.YES.value }");
        return A;
    }
}
