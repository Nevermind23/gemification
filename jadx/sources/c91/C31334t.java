package c91;

import a91.C30903m;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p341ge.bog.mobilebank.p975ui.wizard.model.WizardTitleDescriptionObject;

/* renamed from: c91.t */
public class C31334t extends C31302e {
    /* renamed from: C1 */
    public List mo71621C1() {
        if (!(mo71707D1() == null || mo71707D1().getCustomSelectorValues() == null)) {
            ArrayList arrayList = new ArrayList();
            Iterator it = mo71707D1().getCustomSelectorValues().iterator();
            while (it.hasNext()) {
                arrayList.add(((WizardTitleDescriptionObject) it.next()).mo88124b());
            }
        }
        return super.mo71621C1();
    }

    /* access modifiers changed from: protected */
    /* renamed from: f2 */
    public RecyclerView.C1736h mo67193f2() {
        return new C30903m(mo71707D1().getCustomSelectorValues(), Integer.parseInt(mo71707D1().getValue()), this);
    }
}
