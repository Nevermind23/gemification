package p866pz;

import a91.C30871b;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.C1514j0;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.C1620q0;
import androidx.lifecycle.C1636t0;
import androidx.recyclerview.widget.C1832v;
import androidx.recyclerview.widget.RecyclerView;
import c91.C31302e;
import he1.C41217g;
import he1.C41238w;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.C41520a0;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import p163m0.C7047a;
import p341ge.bog.mobilebank.cleanarch.moneytransfers.presentation.MoneyTransferWizardViewModel;
import p341ge.bog.mobilebank.cleanarch.moneytransfers.presentation.model.MoneyTransferWizardData;
import p341ge.bog.mobilebank.model.account.AccountLov;
import p341ge.bog.mobilebank.p975ui.wizard.activities.C35862c;
import ue1.C43064a;

/* renamed from: pz.b */
public final class C27643b extends C31302e {

    /* renamed from: w */
    private final C41217g f70726w = C1514j0.m5374c(this, C41520a0.m120436b(MoneyTransferWizardViewModel.class), new C27644a(this), new C27645b((C43064a) null, this), new C27646c(this));

    /* renamed from: x */
    private C30871b f70727x;

    /* renamed from: pz.b$a */
    public static final class C27644a extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ Fragment f70728d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C27644a(Fragment fragment) {
            super(0);
            this.f70728d = fragment;
        }

        public final C1636t0 invoke() {
            C1636t0 viewModelStore = this.f70728d.requireActivity().getViewModelStore();
            C41536l.m120488h(viewModelStore, "requireActivity().viewModelStore");
            return viewModelStore;
        }
    }

    /* renamed from: pz.b$b */
    public static final class C27645b extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C43064a f70729d;

        /* renamed from: e */
        final /* synthetic */ Fragment f70730e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C27645b(C43064a aVar, Fragment fragment) {
            super(0);
            this.f70729d = aVar;
            this.f70730e = fragment;
        }

        public final C7047a invoke() {
            C7047a aVar;
            C43064a aVar2 = this.f70729d;
            if (aVar2 != null && (aVar = (C7047a) aVar2.invoke()) != null) {
                return aVar;
            }
            C7047a defaultViewModelCreationExtras = this.f70730e.requireActivity().getDefaultViewModelCreationExtras();
            C41536l.m120488h(defaultViewModelCreationExtras, "requireActivity().defaultViewModelCreationExtras");
            return defaultViewModelCreationExtras;
        }
    }

    /* renamed from: pz.b$c */
    public static final class C27646c extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ Fragment f70731d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C27646c(Fragment fragment) {
            super(0);
            this.f70731d = fragment;
        }

        public final C1620q0.C1624b invoke() {
            C1620q0.C1624b defaultViewModelProviderFactory = this.f70731d.requireActivity().getDefaultViewModelProviderFactory();
            C41536l.m120488h(defaultViewModelProviderFactory, "requireActivity().defaultViewModelProviderFactory");
            return defaultViewModelProviderFactory;
        }
    }

    /* renamed from: j2 */
    private final MoneyTransferWizardViewModel m85634j2() {
        return (MoneyTransferWizardViewModel) this.f70726w.getValue();
    }

    /* access modifiers changed from: private */
    /* renamed from: k2 */
    public static final void m85635k2(C27643b bVar, ArrayList arrayList, int i, int i2, boolean z) {
        C41536l.m120489i(bVar, "this$0");
        C41536l.m120489i(arrayList, "$accounts");
        if (z) {
            bVar.f77883f.mo87965p3(true);
            MoneyTransferWizardData Jw = bVar.m85634j2().mo53079Jw();
            if (Jw != null) {
                Jw.mo53158B((AccountLov) arrayList.get(i));
            }
            bVar.mo71717U1(String.valueOf(i));
            return;
        }
        bVar.f77883f.mo87965p3(false);
    }

    /* access modifiers changed from: protected */
    /* renamed from: f2 */
    public RecyclerView.C1736h mo67193f2() {
        Object obj;
        boolean z;
        AccountLov k;
        T t;
        C41238w wVar;
        boolean z2;
        String str;
        ArrayList arrayList = new ArrayList();
        MoneyTransferWizardData Jw = m85634j2().mo53079Jw();
        if (Jw != null) {
            List a = Jw.mo53161a();
            ArrayList arrayList2 = new ArrayList();
            for (Object next : a) {
                AccountLov accountLov = (AccountLov) next;
                ArrayList<AccountLov> subAccounts = accountLov.getSubAccounts();
                C41536l.m120488h(subAccounts, "aacLov.subAccounts");
                Iterator<T> it = subAccounts.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        t = null;
                        break;
                    }
                    t = it.next();
                    String ccy = ((AccountLov) t).getCcy();
                    MoneyTransferWizardData Jw2 = m85634j2().mo53079Jw();
                    if (Jw2 != null) {
                        str = Jw2.mo53163d();
                    } else {
                        str = null;
                    }
                    if (C41536l.m120484d(ccy, str)) {
                        break;
                    }
                }
                AccountLov accountLov2 = (AccountLov) t;
                if (accountLov2 != null) {
                    accountLov.setAcctNo(accountLov2.getAcctNo());
                    accountLov.setCcy(accountLov2.getCcy());
                    accountLov.setAvailableAmount(accountLov2.getAvailableAmount());
                    wVar = C41238w.f97225a;
                } else {
                    wVar = null;
                }
                if (wVar != null) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (z2) {
                    arrayList2.add(next);
                }
            }
            arrayList.addAll(arrayList2);
        }
        C30871b bVar = new C30871b(this.f77889l, this.mClient);
        this.f70727x = bVar;
        bVar.mo71058z(arrayList);
        C30871b bVar2 = this.f70727x;
        if (bVar2 == null) {
            C41536l.m120506z("productsRecyclerAdapter");
            bVar2 = null;
        }
        Iterator it2 = arrayList.iterator();
        while (true) {
            if (!it2.hasNext()) {
                obj = null;
                break;
            }
            obj = it2.next();
            AccountLov accountLov3 = (AccountLov) obj;
            MoneyTransferWizardData Jw3 = m85634j2().mo53079Jw();
            if (Jw3 == null || (k = Jw3.mo53173k()) == null || accountLov3.getMainAcctKey() != k.getMainAcctKey()) {
                z = false;
                continue;
            } else {
                z = true;
                continue;
            }
            if (z) {
                break;
            }
        }
        bVar2.mo71054C(C41358y.m120012b0(arrayList, obj));
        C30871b bVar3 = this.f70727x;
        if (bVar3 == null) {
            C41536l.m120506z("productsRecyclerAdapter");
            bVar3 = null;
        }
        bVar3.mo71053B(new C27642a(this, arrayList));
        C30871b bVar4 = this.f70727x;
        if (bVar4 != null) {
            return bVar4;
        }
        C41536l.m120506z("productsRecyclerAdapter");
        return null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: j1 */
    public void mo67194j1() {
    }

    public void onActivityCreated(Bundle bundle) {
        C35862c cVar;
        AccountLov k;
        String acctNo;
        boolean z;
        super.onActivityCreated(bundle);
        MoneyTransferWizardData Jw = m85634j2().mo53079Jw();
        boolean z2 = false;
        if (!(Jw == null || (k = Jw.mo53173k()) == null || (acctNo = k.getAcctNo()) == null)) {
            if (acctNo.length() > 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                z2 = true;
            }
        }
        if (z2 && (cVar = this.f77883f) != null) {
            cVar.mo87965p3(true);
        }
    }

    public void onViewCreated(View view, Bundle bundle) {
        C41536l.m120489i(view, "view");
        super.onViewCreated(view, bundle);
        this.f77890m.setVisibility(8);
        this.f77885h.setBackgroundColor(0);
        this.f77892o.setPadding(0, 0, 0, 0);
        RecyclerView.C1742m itemAnimator = this.f77889l.getItemAnimator();
        C41536l.m120487g(itemAnimator, "null cannot be cast to non-null type androidx.recyclerview.widget.SimpleItemAnimator");
        ((C1832v) itemAnimator).mo6072Q(false);
    }
}
