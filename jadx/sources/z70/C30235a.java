package z70;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.C41536l;
import n80.C26377a;
import n80.C26378b;
import n80.C26379c;
import p341ge.bog.mobilebank.consumerloanapplication.data.documents.entity.AttachmentExtensionApiModel;
import p341ge.bog.mobilebank.consumerloanapplication.data.documents.entity.AttachmentInfoApiModel;
import p341ge.bog.mobilebank.consumerloanapplication.data.documents.entity.AttachmentTypeApiModel;

/* renamed from: z70.a */
public final class C30235a {
    /* renamed from: a */
    private final C26377a m91338a(AttachmentExtensionApiModel attachmentExtensionApiModel) {
        return new C26377a(attachmentExtensionApiModel.getId(), attachmentExtensionApiModel.getFileAttachmentTypeId(), attachmentExtensionApiModel.getFileExtension());
    }

    /* renamed from: c */
    private final C26379c m91339c(AttachmentTypeApiModel attachmentTypeApiModel) {
        return new C26379c(attachmentTypeApiModel.getId(), attachmentTypeApiModel.getDictionaryKeyId(), attachmentTypeApiModel.getStatus(), attachmentTypeApiModel.getMinSize(), attachmentTypeApiModel.getMaxSize(), attachmentTypeApiModel.getAttachmentType());
    }

    /* renamed from: b */
    public final C26378b mo70570b(AttachmentInfoApiModel attachmentInfoApiModel) {
        C41536l.m120489i(attachmentInfoApiModel, "attachmentInfoEntity");
        C26379c c = m91339c(attachmentInfoApiModel.getAttachmentType());
        List<AttachmentExtensionApiModel> attachmentExtensions = attachmentInfoApiModel.getAttachmentExtensions();
        ArrayList arrayList = new ArrayList(C41343r.m119925u(attachmentExtensions, 10));
        for (AttachmentExtensionApiModel a : attachmentExtensions) {
            arrayList.add(m91338a(a));
        }
        return new C26378b(c, arrayList);
    }
}
