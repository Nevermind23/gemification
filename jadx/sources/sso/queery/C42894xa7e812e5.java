package sso.queery;

import kotlin.jvm.internal.C41536l;
import p243s2.C8106f;
import p243s2.C8108g;

/* renamed from: sso.queery.UpdateProfilePictureStatusQuery$variables$1$marshaller$$inlined$invoke$1 */
public final class C42894xa7e812e5 implements C8106f {
    final /* synthetic */ UpdateProfilePictureStatusQuery this$0;

    public C42894xa7e812e5(UpdateProfilePictureStatusQuery updateProfilePictureStatusQuery) {
        this.this$0 = updateProfilePictureStatusQuery;
    }

    public void marshal(C8108g gVar) {
        C41536l.m120490j(gVar, "writer");
        if (this.this$0.getStatus().f22756b) {
            gVar.mo23295e("status", (Boolean) this.this$0.getStatus().f22755a);
        }
    }
}
