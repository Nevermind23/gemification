package sso.queery;

import kotlin.jvm.internal.C41536l;
import p217q2.C7846k;
import p243s2.C8122n;
import p243s2.C8135p;
import sso.queery.UpdateProfilePictureStatusQuery;

/* renamed from: sso.queery.UpdateProfilePictureStatusQuery$Data$marshaller$$inlined$invoke$1 */
public final class C42892x98631c7 implements C8122n {
    final /* synthetic */ UpdateProfilePictureStatusQuery.Data this$0;

    public C42892x98631c7(UpdateProfilePictureStatusQuery.Data data) {
        this.this$0 = data;
    }

    public void marshal(C8135p pVar) {
        C8122n nVar;
        C41536l.m120490j(pVar, "writer");
        C7846k kVar = UpdateProfilePictureStatusQuery.Data.RESPONSE_FIELDS[0];
        UpdateProfilePictureStatusQuery.CommonServices commonServices = this.this$0.getCommonServices();
        if (commonServices != null) {
            nVar = commonServices.marshaller();
        } else {
            nVar = null;
        }
        pVar.mo23321f(kVar, nVar);
    }
}
