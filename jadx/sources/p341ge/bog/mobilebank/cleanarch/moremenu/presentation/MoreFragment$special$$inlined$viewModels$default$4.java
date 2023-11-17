package p341ge.bog.mobilebank.cleanarch.moremenu.presentation;

import androidx.fragment.app.C1514j0;
import androidx.lifecycle.C1591i;
import androidx.lifecycle.C1638u0;
import he1.C41217g;
import kotlin.jvm.internal.C41537m;
import p163m0.C7047a;
import ue1.C43064a;

/* renamed from: ge.bog.mobilebank.cleanarch.moremenu.presentation.MoreFragment$special$$inlined$viewModels$default$4 */
public final class MoreFragment$special$$inlined$viewModels$default$4 extends C41537m implements C43064a {
    final /* synthetic */ C43064a $extrasProducer;
    final /* synthetic */ C41217g $owner$delegate;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MoreFragment$special$$inlined$viewModels$default$4(C43064a aVar, C41217g gVar) {
        super(0);
        this.$extrasProducer = aVar;
        this.$owner$delegate = gVar;
    }

    public final C7047a invoke() {
        C7047a aVar;
        C43064a aVar2 = this.$extrasProducer;
        if (aVar2 != null && (aVar = (C7047a) aVar2.invoke()) != null) {
            return aVar;
        }
        C1638u0 a = C1514j0.m5375d(this.$owner$delegate);
        C1591i iVar = a instanceof C1591i ? (C1591i) a : null;
        C7047a defaultViewModelCreationExtras = iVar != null ? iVar.getDefaultViewModelCreationExtras() : null;
        return defaultViewModelCreationExtras == null ? C7047a.C7048a.f20987b : defaultViewModelCreationExtras;
    }
}
