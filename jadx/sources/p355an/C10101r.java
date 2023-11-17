package p355an;

import kotlin.jvm.internal.C41536l;
import p341ge.bog.mobilebank.cardapplications.presentation.model.DebitCardTextContainerUiModel;
import p341ge.bog.mobilebank.cardapplications.presentation.model.DebitCardTextsUiModel;
import p537nm.C17070a0;
import p537nm.C17073b0;

/* renamed from: an.r */
public final class C10101r {

    /* renamed from: a */
    private final C10102s f27869a;

    public C10101r(C10102s sVar) {
        C41536l.m120489i(sVar, "debitCardTextsMapper");
        this.f27869a = sVar;
    }

    /* renamed from: a */
    public final DebitCardTextContainerUiModel mo26578a(C17070a0 a0Var) {
        DebitCardTextsUiModel debitCardTextsUiModel;
        C41536l.m120489i(a0Var, "debitCardTextContainer");
        C17073b0 b = a0Var.mo44264b();
        DebitCardTextsUiModel debitCardTextsUiModel2 = null;
        if (b != null) {
            debitCardTextsUiModel = this.f27869a.mo26579a(b);
        } else {
            debitCardTextsUiModel = null;
        }
        C17073b0 a = a0Var.mo44263a();
        if (a != null) {
            debitCardTextsUiModel2 = this.f27869a.mo26579a(a);
        }
        return new DebitCardTextContainerUiModel(debitCardTextsUiModel, debitCardTextsUiModel2);
    }
}
