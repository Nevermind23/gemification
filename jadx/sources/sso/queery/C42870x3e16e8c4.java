package sso.queery;

import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import p243s2.C8124o;
import sso.queery.SetupSecurityParametersQuery;
import ue1.C43075l;

/* renamed from: sso.queery.SetupSecurityParametersQuery$Data$Companion$invoke$1$loginServices$1 */
final class C42870x3e16e8c4 extends C41537m implements C43075l {
    public static final C42870x3e16e8c4 INSTANCE = new C42870x3e16e8c4();

    C42870x3e16e8c4() {
        super(1);
    }

    public final SetupSecurityParametersQuery.LoginServices invoke(C8124o oVar) {
        C41536l.m120489i(oVar, "reader");
        return SetupSecurityParametersQuery.LoginServices.Companion.invoke(oVar);
    }
}
