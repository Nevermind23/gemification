package sso.queery;

import kotlin.jvm.internal.C41536l;
import p243s2.C8122n;
import p243s2.C8135p;
import sso.queery.UploadProfilePictureQuery;

/* renamed from: sso.queery.UploadProfilePictureQuery$CommonServices$marshaller$$inlined$invoke$1 */
public final class C42898xd49dec82 implements C8122n {
    final /* synthetic */ UploadProfilePictureQuery.CommonServices this$0;

    public C42898xd49dec82(UploadProfilePictureQuery.CommonServices commonServices) {
        this.this$0 = commonServices;
    }

    public void marshal(C8135p pVar) {
        C41536l.m120490j(pVar, "writer");
        pVar.mo23319d(UploadProfilePictureQuery.CommonServices.RESPONSE_FIELDS[0], this.this$0.get__typename());
        pVar.mo23319d(UploadProfilePictureQuery.CommonServices.RESPONSE_FIELDS[1], this.this$0.getUploadProfilePicture());
    }
}
