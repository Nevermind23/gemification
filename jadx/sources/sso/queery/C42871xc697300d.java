package sso.queery;

import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import p243s2.C8124o;
import sso.queery.SetupSecurityParametersQuery;
import ue1.C43075l;

/* renamed from: sso.queery.SetupSecurityParametersQuery$LoginServices$Companion$invoke$1$setupSecurityParameters$1 */
final class C42871xc697300d extends C41537m implements C43075l {
    public static final C42871xc697300d INSTANCE = new C42871xc697300d();

    C42871xc697300d() {
        super(1);
    }

    public final SetupSecurityParametersQuery.SetupSecurityParameters invoke(C8124o oVar) {
        C41536l.m120489i(oVar, "reader");
        return SetupSecurityParametersQuery.SetupSecurityParameters.Companion.invoke(oVar);
    }
}
