package p341ge.bog.mobilebank.hubmenu.presentation.view;

import android.content.Context;
import androidx.recyclerview.widget.GridLayoutManager;
import kotlin.jvm.internal.C41537m;
import ue1.C43064a;

/* renamed from: ge.bog.mobilebank.hubmenu.presentation.view.BankingGroupView$actionHubGridManager$2 */
final class BankingGroupView$actionHubGridManager$2 extends C41537m implements C43064a {

    /* renamed from: d */
    final /* synthetic */ Context f63050d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    BankingGroupView$actionHubGridManager$2(Context context) {
        super(0);
        this.f63050d = context;
    }

    /* renamed from: b */
    public final C244411 invoke() {
        return new GridLayoutManager(this.f63050d) {
            /* renamed from: w */
            public boolean mo5227w() {
                return false;
            }
        };
    }
}
