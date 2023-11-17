package p866pz;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import androidx.fragment.app.C1514j0;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.C1620q0;
import androidx.lifecycle.C1636t0;
import androidx.lifecycle.C1645y;
import androidx.recyclerview.widget.C1832v;
import androidx.recyclerview.widget.RecyclerView;
import c91.C31355y;
import g91.C32290b1;
import g91.C32303f;
import g91.C32343x;
import he1.C41212c;
import he1.C41217g;
import he1.C41238w;
import kotlin.jvm.internal.C41520a0;
import kotlin.jvm.internal.C41532h;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p163m0.C7047a;
import p341ge.bog.mobilebank.cleanarch.moneytransfers.presentation.MoneyTransferWizardViewModel;
import p341ge.bog.mobilebank.cleanarch.moneytransfers.presentation.model.MoneyTransferCurrenciesUiModel;
import p341ge.bog.mobilebank.cleanarch.moneytransfers.presentation.model.MoneyTransferWizardData;
import p341ge.bog.mobilebank.cleanarch.moneytransfers.presentation.model.TransferCurrencyUiItem;
import p366bk.C10322k;
import p366bk.C10324m;
import p876qz.C27876b;
import ue1.C43064a;
import ue1.C43075l;

/* renamed from: pz.c */
public final class C27647c extends C31355y {

    /* renamed from: A */
    public static final C27648a f70732A = new C27648a((DefaultConstructorMarker) null);

    /* renamed from: v */
    private final C41217g f70733v = C1514j0.m5374c(this, C41520a0.m120436b(MoneyTransferWizardViewModel.class), new C27652d(this), new C27653e((C43064a) null, this), new C27654f(this));
    /* access modifiers changed from: private */

    /* renamed from: w */
    public TextView f70734w;
    /* access modifiers changed from: private */

    /* renamed from: x */
    public TextView f70735x;
    /* access modifiers changed from: private */

    /* renamed from: y */
    public RecyclerView f70736y;
    /* access modifiers changed from: private */

    /* renamed from: z */
    public C27655d f70737z;

    /* renamed from: pz.c$a */
    public static final class C27648a {
        private C27648a() {
        }

        public /* synthetic */ C27648a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: pz.c$b */
    static final class C27649b extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C27647c f70738d;

        /* renamed from: pz.c$b$a */
        public static final class C27650a implements C27655d {

            /* renamed from: d */
            final /* synthetic */ C27647c f70739d;

            C27650a(C27647c cVar) {
                this.f70739d = cVar;
            }

            /* renamed from: Y */
            public void mo53120Y(TransferCurrencyUiItem transferCurrencyUiItem) {
                C41536l.m120489i(transferCurrencyUiItem, "currencyItem");
                MoneyTransferWizardData Jw = this.f70739d.m85644l2().mo53079Jw();
                if (Jw != null) {
                    Jw.mo53186y(transferCurrencyUiItem.mo53201a());
                }
                C27655d j2 = this.f70739d.f70737z;
                if (j2 != null) {
                    j2.mo53120Y(transferCurrencyUiItem);
                }
                this.f70739d.f77883f.mo87965p3(true);
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C27649b(C27647c cVar) {
            super(1);
            this.f70738d = cVar;
        }

        /* renamed from: a */
        public final void mo67197a(MoneyTransferWizardData moneyTransferWizardData) {
            Integer num;
            MoneyTransferCurrenciesUiModel h;
            String str;
            String str2;
            String d;
            boolean z;
            TextView g2 = this.f70738d.f70734w;
            RecyclerView recyclerView = null;
            if (g2 == null) {
                C41536l.m120506z("amountTextView");
                g2 = null;
            }
            Double b = moneyTransferWizardData.mo53162b();
            if (b != null) {
                num = Integer.valueOf((int) b.doubleValue());
            } else {
                num = null;
            }
            boolean z2 = false;
            g2.setText(num + " " + C32303f.m95198i(moneyTransferWizardData.mo53171i(), false));
            MoneyTransferWizardData Jw = this.f70738d.m85644l2().mo53079Jw();
            if (Jw != null && (h = Jw.mo53169h()) != null) {
                C27647c cVar = this.f70738d;
                TextView h2 = cVar.f70735x;
                if (h2 == null) {
                    C41536l.m120506z("campaignLabelTextView");
                    h2 = null;
                }
                h2.setText(C32343x.m95388F(h.mo53131a(), new Object[0]));
                MoneyTransferWizardData moneyTransferWizardData2 = (MoneyTransferWizardData) cVar.m85644l2().mo53074Ew().mo4814f();
                if (moneyTransferWizardData2 == null || (str = moneyTransferWizardData2.mo53171i()) == null) {
                    str = "GEL";
                }
                MoneyTransferWizardData moneyTransferWizardData3 = (MoneyTransferWizardData) cVar.m85644l2().mo53074Ew().mo4814f();
                if (moneyTransferWizardData3 != null) {
                    str2 = moneyTransferWizardData3.mo53163d();
                } else {
                    str2 = null;
                }
                C27876b bVar = new C27876b(h, str, str2);
                bVar.mo67409n(new C27650a(cVar));
                MoneyTransferWizardData moneyTransferWizardData4 = (MoneyTransferWizardData) cVar.m85644l2().mo53074Ew().mo4814f();
                if (!(moneyTransferWizardData4 == null || (d = moneyTransferWizardData4.mo53163d()) == null)) {
                    if (d.length() > 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (z) {
                        z2 = true;
                    }
                }
                if (z2) {
                    cVar.f77883f.mo87965p3(true);
                }
                RecyclerView i2 = cVar.f70736y;
                if (i2 == null) {
                    C41536l.m120506z("currenciesRecyclerView");
                } else {
                    recyclerView = i2;
                }
                recyclerView.setAdapter(bVar);
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo67197a((MoneyTransferWizardData) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: pz.c$c */
    static final class C27651c implements C1645y, C41532h {

        /* renamed from: a */
        private final /* synthetic */ C43075l f70740a;

        C27651c(C43075l lVar) {
            C41536l.m120489i(lVar, "function");
            this.f70740a = lVar;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof C1645y) || !(obj instanceof C41532h)) {
                return false;
            }
            return C41536l.m120484d(getFunctionDelegate(), ((C41532h) obj).getFunctionDelegate());
        }

        public final C41212c getFunctionDelegate() {
            return this.f70740a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        public final /* synthetic */ void onChanged(Object obj) {
            this.f70740a.invoke(obj);
        }
    }

    /* renamed from: pz.c$d */
    public static final class C27652d extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ Fragment f70741d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C27652d(Fragment fragment) {
            super(0);
            this.f70741d = fragment;
        }

        public final C1636t0 invoke() {
            C1636t0 viewModelStore = this.f70741d.requireActivity().getViewModelStore();
            C41536l.m120488h(viewModelStore, "requireActivity().viewModelStore");
            return viewModelStore;
        }
    }

    /* renamed from: pz.c$e */
    public static final class C27653e extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C43064a f70742d;

        /* renamed from: e */
        final /* synthetic */ Fragment f70743e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C27653e(C43064a aVar, Fragment fragment) {
            super(0);
            this.f70742d = aVar;
            this.f70743e = fragment;
        }

        public final C7047a invoke() {
            C7047a aVar;
            C43064a aVar2 = this.f70742d;
            if (aVar2 != null && (aVar = (C7047a) aVar2.invoke()) != null) {
                return aVar;
            }
            C7047a defaultViewModelCreationExtras = this.f70743e.requireActivity().getDefaultViewModelCreationExtras();
            C41536l.m120488h(defaultViewModelCreationExtras, "requireActivity().defaultViewModelCreationExtras");
            return defaultViewModelCreationExtras;
        }
    }

    /* renamed from: pz.c$f */
    public static final class C27654f extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ Fragment f70744d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C27654f(Fragment fragment) {
            super(0);
            this.f70744d = fragment;
        }

        public final C1620q0.C1624b invoke() {
            C1620q0.C1624b defaultViewModelProviderFactory = this.f70744d.requireActivity().getDefaultViewModelProviderFactory();
            C41536l.m120488h(defaultViewModelProviderFactory, "requireActivity().defaultViewModelProviderFactory");
            return defaultViewModelProviderFactory;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: l2 */
    public final MoneyTransferWizardViewModel m85644l2() {
        return (MoneyTransferWizardViewModel) this.f70733v.getValue();
    }

    private final void observeData() {
        m85644l2().mo53074Ew().mo4819k(getViewLifecycleOwner(), new C27651c(new C27649b(this)));
    }

    /* renamed from: H1 */
    public boolean mo67195H1() {
        return false;
    }

    /* renamed from: J1 */
    public boolean mo67196J1() {
        return false;
    }

    /* access modifiers changed from: protected */
    public int layoutId() {
        return C10324m.fragment_money_transfer_conversion_wizard;
    }

    public void onAttach(Context context) {
        C27655d dVar;
        C41536l.m120489i(context, "context");
        super.onAttach(context);
        if (context instanceof C27655d) {
            this.f70737z = (C27655d) context;
        } else if (getParentFragment() instanceof C27655d) {
            Fragment parentFragment = getParentFragment();
            if (parentFragment instanceof C27655d) {
                dVar = (C27655d) parentFragment;
            } else {
                dVar = null;
            }
            this.f70737z = dVar;
        }
    }

    public void onViewCreated(View view, Bundle bundle) {
        C41536l.m120489i(view, "view");
        super.onViewCreated(view, bundle);
        View findViewById = view.findViewById(C10322k.f28871n1);
        C41536l.m120488h(findViewById, "view.findViewById(R.id.amount_text)");
        this.f70734w = (TextView) findViewById;
        View findViewById2 = view.findViewById(C10322k.campaign_label);
        C41536l.m120488h(findViewById2, "view.findViewById(R.id.campaign_label)");
        this.f70735x = (TextView) findViewById2;
        View findViewById3 = view.findViewById(C10322k.f28783Q9);
        C41536l.m120488h(findViewById3, "view.findViewById(R.id.currencies_recycler)");
        RecyclerView recyclerView = (RecyclerView) findViewById3;
        this.f70736y = recyclerView;
        if (recyclerView == null) {
            C41536l.m120506z("currenciesRecyclerView");
            recyclerView = null;
        }
        RecyclerView.C1742m itemAnimator = recyclerView.getItemAnimator();
        C41536l.m120487g(itemAnimator, "null cannot be cast to non-null type androidx.recyclerview.widget.SimpleItemAnimator");
        ((C1832v) itemAnimator).mo6072Q(false);
        C32290b1.m95112b(view);
        observeData();
    }
}
