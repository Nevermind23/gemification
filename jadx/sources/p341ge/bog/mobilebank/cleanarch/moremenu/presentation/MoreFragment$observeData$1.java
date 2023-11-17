package p341ge.bog.mobilebank.cleanarch.moremenu.presentation;

import he1.C41238w;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import p341ge.bog.designsystem.components.buttonlist.ButtonListLargeView;
import ue1.C43075l;

/* renamed from: ge.bog.mobilebank.cleanarch.moremenu.presentation.MoreFragment$observeData$1 */
final class MoreFragment$observeData$1 extends C41537m implements C43075l {
    final /* synthetic */ MoreFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    MoreFragment$observeData$1(MoreFragment moreFragment) {
        super(1);
        this.this$0 = moreFragment;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((Boolean) obj);
        return C41238w.f97225a;
    }

    public final void invoke(Boolean bool) {
        ButtonListLargeView buttonListLargeView = this.this$0.getBinding().f70221u;
        C41536l.m120488h(bool, "status");
        buttonListLargeView.setBadgeOnButtonVisible(bool.booleanValue());
    }
}
