package qa1;

import ed1.C40734b;
import ed1.C40749p;
import ed1.C40762x;
import java.math.BigDecimal;
import java.util.List;
import p341ge.bog.sso_client.models.C35942i;
import p341ge.bog.sso_client.models.C35952m;
import p341ge.bog.sso_client.models.UserContact;
import p341ge.bog.sso_client.network.ApiException;
import sso.type.AuthTokenType;
import sso.type.UserContactType;

/* renamed from: qa1.f */
public interface C27714f {

    /* renamed from: qa1.f$a */
    public static final class C27715a {
        /* renamed from: a */
        public static /* synthetic */ C40762x m85772a(C27714f fVar, UserContact userContact, String str, String str2, UserContactType userContactType, String str3, int i, Object obj) {
            if (obj == null) {
                return fVar.mo67287z(userContact, str, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : userContactType, (i & 16) != 0 ? null : str3);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: requestOTP");
        }

        /* renamed from: b */
        public static /* synthetic */ C40734b m85773b(C27714f fVar, String str, String str2, String str3, int i, Object obj) {
            if (obj == null) {
                if ((i & 4) != 0) {
                    str3 = null;
                }
                return fVar.mo67281t(str, str2, str3);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: verifyOTP");
        }
    }

    /* renamed from: A */
    C40734b mo67258A(String str);

    /* renamed from: B */
    C40762x mo67259B(String str, String str2);

    /* renamed from: C */
    C40734b mo67260C(String str, BigDecimal bigDecimal, boolean z, String str2, String str3, String str4, String str5);

    /* renamed from: D */
    C40734b mo67261D(String str, String str2);

    /* renamed from: a */
    C40734b mo67262a(String str, String str2, String str3, String str4, String str5, String str6, String str7);

    /* renamed from: b */
    C40762x mo67263b(String str);

    /* renamed from: c */
    C40762x mo67264c(String str);

    /* renamed from: d */
    C40749p mo67265d();

    /* renamed from: e */
    C40762x mo67266e(String str, C35942i iVar, List list);

    /* renamed from: f */
    void mo67267f(ApiException apiException);

    /* renamed from: g */
    C40762x mo67268g(String str, String str2, String str3, String str4, boolean z, String str5);

    /* renamed from: h */
    C40762x mo67269h(String str, String str2, boolean z, String str3);

    /* renamed from: i */
    C40762x mo67270i(String str, C35942i iVar);

    /* renamed from: j */
    C40734b mo67271j(C35952m mVar, C35952m mVar2);

    /* renamed from: k */
    C40762x mo67272k();

    /* renamed from: l */
    C40734b mo67273l(String str, String str2, String str3, String str4, String str5);

    /* renamed from: m */
    C40762x mo67274m(String str);

    /* renamed from: n */
    C40762x mo67275n(String str);

    /* renamed from: o */
    C40762x mo67276o(boolean z, String str, String str2, String str3, String str4, String str5);

    /* renamed from: p */
    C40762x mo67277p(String str, String str2, String str3, boolean z, String str4);

    /* renamed from: q */
    C40734b mo67278q(String str, String str2, String str3);

    /* renamed from: r */
    C40762x mo67279r(String str, C35942i iVar);

    /* renamed from: s */
    C40762x mo67280s();

    /* renamed from: t */
    C40734b mo67281t(String str, String str2, String str3);

    /* renamed from: u */
    C40734b mo67282u(String str);

    /* renamed from: v */
    C40762x mo67283v(String str, String str2);

    /* renamed from: w */
    C40762x mo67284w(String str, String str2, String str3, AuthTokenType authTokenType);

    /* renamed from: x */
    C40734b mo67285x(String str);

    /* renamed from: y */
    C40734b mo67286y(String str, String str2);

    /* renamed from: z */
    C40762x mo67287z(UserContact userContact, String str, String str2, UserContactType userContactType, String str3);
}
