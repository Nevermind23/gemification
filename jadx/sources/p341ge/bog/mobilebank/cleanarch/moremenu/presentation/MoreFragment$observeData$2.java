package p341ge.bog.mobilebank.cleanarch.moremenu.presentation;

import he1.C41238w;
import kotlin.jvm.internal.C41537m;
import p341ge.bog.mobilebank.cleanarch.moremenu.presentation.model.OptionalActionsData;
import ue1.C43075l;

/* renamed from: ge.bog.mobilebank.cleanarch.moremenu.presentation.MoreFragment$observeData$2 */
final class MoreFragment$observeData$2 extends C41537m implements C43075l {
    final /* synthetic */ MoreFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    MoreFragment$observeData$2(MoreFragment moreFragment) {
        super(1);
        this.this$0 = moreFragment;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((OptionalActionsData) obj);
        return C41238w.f97225a;
    }

    public final void invoke(OptionalActionsData optionalActionsData) {
        this.this$0.setUserInfo();
        this.this$0.fillSection2(optionalActionsData.getShowInstantCard());
        this.this$0.fillSection3();
    }
}
