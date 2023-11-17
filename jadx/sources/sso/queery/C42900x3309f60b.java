package sso.queery;

import kotlin.jvm.internal.C41536l;
import p243s2.C8106f;
import p243s2.C8108g;

/* renamed from: sso.queery.UploadProfilePictureQuery$variables$1$marshaller$$inlined$invoke$1 */
public final class C42900x3309f60b implements C8106f {
    final /* synthetic */ UploadProfilePictureQuery this$0;

    public C42900x3309f60b(UploadProfilePictureQuery uploadProfilePictureQuery) {
        this.this$0 = uploadProfilePictureQuery;
    }

    public void marshal(C8108g gVar) {
        C41536l.m120490j(gVar, "writer");
        gVar.mo23291a("profilePictureBase64", this.this$0.getProfilePictureBase64());
    }
}
