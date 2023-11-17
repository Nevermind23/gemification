package p341ge.bog.mobilebank.p975ui.views.widgets;

import af1.C40303i;
import kotlin.jvm.internal.C41536l;
import kotlin.properties.C41553c;
import p341ge.bog.mobilebank.p975ui.views.widgets.MainBottomNavigationViewPresenterImpl;

/* renamed from: ge.bog.mobilebank.ui.views.widgets.MainBottomNavigationViewPresenterImpl$special$$inlined$observable$2 */
public final class C35744x87cea44a extends C41553c {
    final /* synthetic */ MainBottomNavigationViewPresenterImpl this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C35744x87cea44a(Object obj, MainBottomNavigationViewPresenterImpl mainBottomNavigationViewPresenterImpl) {
        super(obj);
        this.this$0 = mainBottomNavigationViewPresenterImpl;
    }

    /* access modifiers changed from: protected */
    public void afterChange(C40303i iVar, MainBottomNavigationViewPresenterImpl.C35742a aVar, MainBottomNavigationViewPresenterImpl.C35742a aVar2) {
        C41536l.m120489i(iVar, "property");
        MainBottomNavigationViewPresenterImpl.C35742a aVar3 = aVar2;
        if (aVar != aVar3) {
            this.this$0.applyHubIconState(aVar3);
        }
    }
}
