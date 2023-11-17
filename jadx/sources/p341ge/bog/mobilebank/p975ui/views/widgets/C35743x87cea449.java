package p341ge.bog.mobilebank.p975ui.views.widgets;

import af1.C40303i;
import kotlin.jvm.internal.C41536l;
import kotlin.properties.C41553c;

/* renamed from: ge.bog.mobilebank.ui.views.widgets.MainBottomNavigationViewPresenterImpl$special$$inlined$observable$1 */
public final class C35743x87cea449 extends C41553c {
    final /* synthetic */ MainBottomNavigationViewPresenterImpl this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C35743x87cea449(Object obj, MainBottomNavigationViewPresenterImpl mainBottomNavigationViewPresenterImpl) {
        super(obj);
        this.this$0 = mainBottomNavigationViewPresenterImpl;
    }

    /* access modifiers changed from: protected */
    public void afterChange(C40303i iVar, Boolean bool, Boolean bool2) {
        C41536l.m120489i(iVar, "property");
        if (bool.booleanValue() != bool2.booleanValue()) {
            MainBottomNavigationViewPresenterImpl.adjustHubGamification$default(this.this$0, (Boolean) null, 1, (Object) null);
        }
    }
}
