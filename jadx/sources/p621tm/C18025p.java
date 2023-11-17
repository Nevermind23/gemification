package p621tm;

import androidx.recyclerview.widget.C1796h;
import kotlin.jvm.internal.C41536l;
import p341ge.bog.mobilebank.cardapplications.presentation.model.ScoolCardOwnerUiModel;

/* renamed from: tm.p */
final class C18025p extends C1796h.C1802f {

    /* renamed from: a */
    public static final C18025p f51247a = new C18025p();

    private C18025p() {
    }

    /* renamed from: d */
    public boolean mo5976a(ScoolCardOwnerUiModel scoolCardOwnerUiModel, ScoolCardOwnerUiModel scoolCardOwnerUiModel2) {
        C41536l.m120489i(scoolCardOwnerUiModel, "oldItem");
        C41536l.m120489i(scoolCardOwnerUiModel2, "newItem");
        return C41536l.m120484d(scoolCardOwnerUiModel.mo39860e(), scoolCardOwnerUiModel2.mo39860e());
    }

    /* renamed from: e */
    public boolean mo5977b(ScoolCardOwnerUiModel scoolCardOwnerUiModel, ScoolCardOwnerUiModel scoolCardOwnerUiModel2) {
        C41536l.m120489i(scoolCardOwnerUiModel, "oldItem");
        C41536l.m120489i(scoolCardOwnerUiModel2, "newItem");
        if (scoolCardOwnerUiModel.mo39856a() == scoolCardOwnerUiModel2.mo39856a()) {
            return true;
        }
        return false;
    }
}
