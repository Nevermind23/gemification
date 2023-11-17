package p341ge.bog.mobilebank.transportcard.presentation.selecttransportcarddetails;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.p016os.C0908e;
import androidx.fragment.app.C1505h;
import androidx.fragment.app.C1514j0;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.C1591i;
import androidx.lifecycle.C1619q;
import androidx.lifecycle.C1620q0;
import androidx.lifecycle.C1636t0;
import androidx.lifecycle.C1638u0;
import androidx.lifecycle.C1645y;
import androidx.lifecycle.LiveData;
import b41.C31128a;
import b41.C31132b;
import c71.C31284d;
import c71.C31287g;
import g71.C32114g;
import g91.C32343x;
import hc1.C41143c;
import hc1.C41185v;
import he1.C41212c;
import he1.C41217g;
import he1.C41222k;
import he1.C41224m;
import he1.C41233s;
import he1.C41238w;
import j71.C36754g;
import j71.C36755h;
import kotlin.jvm.internal.C41520a0;
import kotlin.jvm.internal.C41532h;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import m41.C37224b;
import p163m0.C7047a;
import p202p0.C7556l;
import p228r0.C8034d;
import p341ge.bog.designsystem.components.creditcardsmallpicker.CreditCardSmallPickerView;
import p341ge.bog.designsystem.components.input.Input;
import p341ge.bog.mobilebank.cleanarch.presentation.common.StateView;
import p341ge.bog.mobilebank.transportcard.presentation.selecttransportcarddetails.C35069b;
import p420fh.C12902d;
import p420fh.C12910e;
import q71.C38135a;
import q71.C38136b;
import q71.C38137c;
import q71.C38138d;
import q71.C38139e;
import q71.C38140f;
import ue1.C43064a;
import ue1.C43075l;
import ue1.C43079p;

/* renamed from: ge.bog.mobilebank.transportcard.presentation.selecttransportcarddetails.SelectTransportCardDetailsFragment */
public final class SelectTransportCardDetailsFragment extends C35068a implements C41185v.C41186a {

    /* renamed from: i */
    public static final C35035a f84533i = new C35035a((DefaultConstructorMarker) null);

    /* renamed from: g */
    private C32114g f84534g;

    /* renamed from: h */
    private final C41217g f84535h;

    /* renamed from: ge.bog.mobilebank.transportcard.presentation.selecttransportcarddetails.SelectTransportCardDetailsFragment$a */
    public static final class C35035a {
        private C35035a() {
        }

        public /* synthetic */ C35035a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: ge.bog.mobilebank.transportcard.presentation.selecttransportcarddetails.SelectTransportCardDetailsFragment$b */
    static final class C35036b extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ SelectTransportCardDetailsFragment f84536d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C35036b(SelectTransportCardDetailsFragment selectTransportCardDetailsFragment) {
            super(1);
            this.f84536d = selectTransportCardDetailsFragment;
        }

        /* renamed from: a */
        public final void mo85878a(C35069b bVar) {
            if (bVar instanceof C35069b.C35071b) {
                this.f84536d.m102978q1().mo3946b().mo53597e();
            } else if (bVar instanceof C35069b.C35070a) {
                this.f84536d.m102978q1().mo3946b().mo53596d();
            } else if (bVar instanceof C35069b.C35072c) {
                this.f84536d.m102978q1().mo3946b().mo53595c();
                SelectTransportCardDetailsFragment selectTransportCardDetailsFragment = this.f84536d;
                C41536l.m120488h(bVar, "uiState");
                selectTransportCardDetailsFragment.m102969B1((C35069b.C35072c) bVar);
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo85878a((C35069b) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.transportcard.presentation.selecttransportcarddetails.SelectTransportCardDetailsFragment$c */
    static final class C35037c extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ SelectTransportCardDetailsFragment f84537d;

        /* renamed from: ge.bog.mobilebank.transportcard.presentation.selecttransportcarddetails.SelectTransportCardDetailsFragment$c$a */
        static final class C35038a extends C41537m implements C43075l {

            /* renamed from: d */
            final /* synthetic */ SelectTransportCardDetailsFragment f84538d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C35038a(SelectTransportCardDetailsFragment selectTransportCardDetailsFragment) {
                super(1);
                this.f84538d = selectTransportCardDetailsFragment;
            }

            /* renamed from: a */
            public final void mo85880a(C36754g gVar) {
                C41536l.m120489i(gVar, "it");
                C8034d.m30522a(this.f84538d).mo22117L(C31284d.action_selectTransportCardDetailsFragment_to_successTransportCardFragment);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                mo85880a((C36754g) obj);
                return C41238w.f97225a;
            }
        }

        /* renamed from: ge.bog.mobilebank.transportcard.presentation.selecttransportcarddetails.SelectTransportCardDetailsFragment$c$b */
        static final class C35039b extends C41537m implements C43075l {

            /* renamed from: d */
            final /* synthetic */ SelectTransportCardDetailsFragment f84539d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C35039b(SelectTransportCardDetailsFragment selectTransportCardDetailsFragment) {
                super(1);
                this.f84539d = selectTransportCardDetailsFragment;
            }

            /* renamed from: a */
            public final void mo85881a(C36754g gVar) {
                this.f84539d.m102978q1().mo3946b().mo53597e();
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                mo85881a((C36754g) obj);
                return C41238w.f97225a;
            }
        }

        /* renamed from: ge.bog.mobilebank.transportcard.presentation.selecttransportcarddetails.SelectTransportCardDetailsFragment$c$c */
        static final class C35040c extends C41537m implements C43079p {

            /* renamed from: d */
            final /* synthetic */ SelectTransportCardDetailsFragment f84540d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C35040c(SelectTransportCardDetailsFragment selectTransportCardDetailsFragment) {
                super(2);
                this.f84540d = selectTransportCardDetailsFragment;
            }

            /* renamed from: a */
            public final void mo85882a(Throwable th, C36754g gVar) {
                C41536l.m120489i(th, "error");
                this.f84540d.m102978q1().mo3946b().mo53595c();
                C1505h requireActivity = this.f84540d.requireActivity();
                C41536l.m120488h(requireActivity, "requireActivity()");
                C12910e.m48790h(requireActivity, String.valueOf(C32343x.m95431a0(th, (String) null, 1, (Object) null)), (C12902d.C12905b) null, false, 6, (Object) null);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                mo85882a((Throwable) obj, (C36754g) obj2);
                return C41238w.f97225a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C35037c(SelectTransportCardDetailsFragment selectTransportCardDetailsFragment) {
            super(1);
            this.f84537d = selectTransportCardDetailsFragment;
        }

        /* renamed from: a */
        public final void mo85879a(C31128a aVar) {
            C41536l.m120488h(aVar, "it");
            C31132b.m92648j(aVar, (int[]) null, new C35038a(this.f84537d), 1, (Object) null);
            C31132b.m92646h(aVar, (int[]) null, new C35039b(this.f84537d), 1, (Object) null);
            C31132b.m92644f(aVar, (int[]) null, new C35040c(this.f84537d), 1, (Object) null);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo85879a((C31128a) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.transportcard.presentation.selecttransportcarddetails.SelectTransportCardDetailsFragment$d */
    static final class C35041d extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ SelectTransportCardDetailsFragment f84541d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C35041d(SelectTransportCardDetailsFragment selectTransportCardDetailsFragment) {
            super(1);
            this.f84541d = selectTransportCardDetailsFragment;
        }

        /* renamed from: a */
        public final void mo85883a(C41238w wVar) {
            C41536l.m120489i(wVar, "it");
            try {
                C8034d.m30522a(this.f84541d).mo22117L(C31284d.action_SelectTransportCardDetailsFragment_to_SelectTransportCardPassTypeDialogFragment);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo85883a((C41238w) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.transportcard.presentation.selecttransportcarddetails.SelectTransportCardDetailsFragment$e */
    static final class C35042e extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ SelectTransportCardDetailsFragment f84542d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C35042e(SelectTransportCardDetailsFragment selectTransportCardDetailsFragment) {
            super(1);
            this.f84542d = selectTransportCardDetailsFragment;
        }

        /* renamed from: a */
        public final void mo85884a(boolean z) {
            try {
                C7556l a = C8034d.m30522a(this.f84542d);
                int i = C31284d.action_selectTransportCardDetailsFragment_to_chooseCardDialogFragment;
                boolean z2 = true;
                C41224m[] mVarArr = new C41224m[1];
                if (z) {
                    z2 = false;
                }
                mVarArr[0] = C41233s.m119492a("IS_PAYMENT_CARDS", Boolean.valueOf(z2));
                a.mo22118M(i, C0908e.m3336b(mVarArr));
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo85884a(((Boolean) obj).booleanValue());
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.transportcard.presentation.selecttransportcarddetails.SelectTransportCardDetailsFragment$f */
    static final class C35043f extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ SelectTransportCardDetailsFragment f84543d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C35043f(SelectTransportCardDetailsFragment selectTransportCardDetailsFragment) {
            super(1);
            this.f84543d = selectTransportCardDetailsFragment;
        }

        /* renamed from: a */
        public final void mo85885a(C41238w wVar) {
            C41536l.m120489i(wVar, "it");
            C8034d.m30522a(this.f84543d).mo22117L(C31284d.action_selectTransportCardDetailsFragment_to_selectTransportCardPassDevicesDialogFragment);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo85885a((C41238w) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.transportcard.presentation.selecttransportcarddetails.SelectTransportCardDetailsFragment$g */
    static final class C35044g extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ SelectTransportCardDetailsFragment f84544d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C35044g(SelectTransportCardDetailsFragment selectTransportCardDetailsFragment) {
            super(1);
            this.f84544d = selectTransportCardDetailsFragment;
        }

        /* renamed from: a */
        public final void mo85886a(C36755h hVar) {
            C41536l.m120489i(hVar, "params");
            C41185v e = C41185v.C41187b.m119423e(C41185v.f97155C, hVar.mo89635b(), hVar.mo89634a(), (C41143c) null, 4, (Object) null);
            FragmentManager childFragmentManager = this.f84544d.getChildFragmentManager();
            C41536l.m120488h(childFragmentManager, "childFragmentManager");
            e.mo4576A1(childFragmentManager, "SCA_TAG");
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo85886a((C36755h) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.transportcard.presentation.selecttransportcarddetails.SelectTransportCardDetailsFragment$h */
    static final class C35045h extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ SelectTransportCardDetailsFragment f84545d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C35045h(SelectTransportCardDetailsFragment selectTransportCardDetailsFragment) {
            super(1);
            this.f84545d = selectTransportCardDetailsFragment;
        }

        /* renamed from: a */
        public final void mo85887a(C41238w wVar) {
            C41536l.m120489i(wVar, "it");
            this.f84545d.m102978q1().f78996j.setErrorState(C32343x.m95388F("tcc.permit.details.page.choose.card.validation.message", new Object[0]));
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo85887a((C41238w) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.transportcard.presentation.selecttransportcarddetails.SelectTransportCardDetailsFragment$i */
    static final class C35046i extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ SelectTransportCardDetailsFragment f84546d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C35046i(SelectTransportCardDetailsFragment selectTransportCardDetailsFragment) {
            super(1);
            this.f84546d = selectTransportCardDetailsFragment;
        }

        /* renamed from: a */
        public final void mo85888a(C41238w wVar) {
            C41536l.m120489i(wVar, "it");
            Input input = this.f84546d.m102978q1().f79003q;
            input.mo35920c();
            input.setInfoText(C32343x.m95388F("tcc.permit.details.page.usage.method.validation", new Object[0]));
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo85888a((C41238w) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.transportcard.presentation.selecttransportcarddetails.SelectTransportCardDetailsFragment$j */
    static final class C35047j extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ SelectTransportCardDetailsFragment f84547d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C35047j(SelectTransportCardDetailsFragment selectTransportCardDetailsFragment) {
            super(1);
            this.f84547d = selectTransportCardDetailsFragment;
        }

        /* renamed from: a */
        public final void mo85889a(C41238w wVar) {
            C41536l.m120489i(wVar, "it");
            C1505h activity = this.f84547d.getActivity();
            if (activity != null) {
                C12910e.m48790h(activity, C32343x.m95388F("tcc.permit.error.no.cards.found", new Object[0]), (C12902d.C12905b) null, false, 6, (Object) null);
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo85889a((C41238w) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.transportcard.presentation.selecttransportcarddetails.SelectTransportCardDetailsFragment$k */
    static final class C35048k implements C1645y, C41532h {

        /* renamed from: a */
        private final /* synthetic */ C43075l f84548a;

        C35048k(C43075l lVar) {
            C41536l.m120489i(lVar, "function");
            this.f84548a = lVar;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof C1645y) || !(obj instanceof C41532h)) {
                return false;
            }
            return C41536l.m120484d(getFunctionDelegate(), ((C41532h) obj).getFunctionDelegate());
        }

        public final C41212c getFunctionDelegate() {
            return this.f84548a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        public final /* synthetic */ void onChanged(Object obj) {
            this.f84548a.invoke(obj);
        }
    }

    /* renamed from: ge.bog.mobilebank.transportcard.presentation.selecttransportcarddetails.SelectTransportCardDetailsFragment$l */
    public static final class C35049l extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ Fragment f84549d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C35049l(Fragment fragment) {
            super(0);
            this.f84549d = fragment;
        }

        public final Fragment invoke() {
            return this.f84549d;
        }
    }

    /* renamed from: ge.bog.mobilebank.transportcard.presentation.selecttransportcarddetails.SelectTransportCardDetailsFragment$m */
    public static final class C35050m extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C43064a f84550d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C35050m(C43064a aVar) {
            super(0);
            this.f84550d = aVar;
        }

        public final C1638u0 invoke() {
            return (C1638u0) this.f84550d.invoke();
        }
    }

    /* renamed from: ge.bog.mobilebank.transportcard.presentation.selecttransportcarddetails.SelectTransportCardDetailsFragment$n */
    public static final class C35051n extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C41217g f84551d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C35051n(C41217g gVar) {
            super(0);
            this.f84551d = gVar;
        }

        public final C1636t0 invoke() {
            C1636t0 viewModelStore = C1514j0.m5375d(this.f84551d).getViewModelStore();
            C41536l.m120488h(viewModelStore, "owner.viewModelStore");
            return viewModelStore;
        }
    }

    /* renamed from: ge.bog.mobilebank.transportcard.presentation.selecttransportcarddetails.SelectTransportCardDetailsFragment$o */
    public static final class C35052o extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C43064a f84552d;

        /* renamed from: e */
        final /* synthetic */ C41217g f84553e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C35052o(C43064a aVar, C41217g gVar) {
            super(0);
            this.f84552d = aVar;
            this.f84553e = gVar;
        }

        public final C7047a invoke() {
            C7047a aVar;
            C43064a aVar2 = this.f84552d;
            if (aVar2 != null && (aVar = (C7047a) aVar2.invoke()) != null) {
                return aVar;
            }
            C1638u0 a = C1514j0.m5375d(this.f84553e);
            C1591i iVar = a instanceof C1591i ? (C1591i) a : null;
            C7047a defaultViewModelCreationExtras = iVar != null ? iVar.getDefaultViewModelCreationExtras() : null;
            return defaultViewModelCreationExtras == null ? C7047a.C7048a.f20987b : defaultViewModelCreationExtras;
        }
    }

    /* renamed from: ge.bog.mobilebank.transportcard.presentation.selecttransportcarddetails.SelectTransportCardDetailsFragment$p */
    public static final class C35053p extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ Fragment f84554d;

        /* renamed from: e */
        final /* synthetic */ C41217g f84555e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C35053p(Fragment fragment, C41217g gVar) {
            super(0);
            this.f84554d = fragment;
            this.f84555e = gVar;
        }

        public final C1620q0.C1624b invoke() {
            C1620q0.C1624b bVar;
            C1638u0 a = C1514j0.m5375d(this.f84555e);
            C1591i iVar = a instanceof C1591i ? (C1591i) a : null;
            if (iVar == null || (bVar = iVar.getDefaultViewModelProviderFactory()) == null) {
                bVar = this.f84554d.getDefaultViewModelProviderFactory();
            }
            C41536l.m120488h(bVar, "(owner as? HasDefaultVie…tViewModelProviderFactory");
            return bVar;
        }
    }

    public SelectTransportCardDetailsFragment() {
        C41217g a = C41219i.m119469a(C41222k.NONE, new C35050m(new C35049l(this)));
        this.f84535h = C1514j0.m5374c(this, C41520a0.m120436b(SelectTransportCardDetailsViewModel$ViewModel.class), new C35051n(a), new C35052o((C43064a) null, a), new C35053p(this, a));
    }

    /* access modifiers changed from: private */
    /* renamed from: A1 */
    public static final void m102968A1(SelectTransportCardDetailsFragment selectTransportCardDetailsFragment, View view) {
        C41536l.m120489i(selectTransportCardDetailsFragment, "this$0");
        selectTransportCardDetailsFragment.m102979r1().mo85900Jw().mo85921w1();
    }

    /* JADX WARNING: type inference failed for: r1v17, types: [android.view.View] */
    /* access modifiers changed from: private */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: B1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void m102969B1(p341ge.bog.mobilebank.transportcard.presentation.selecttransportcarddetails.C35069b.C35072c r10) {
        /*
            r9 = this;
            g71.g r0 = r9.m102978q1()
            ge.bog.designsystem.components.input.Input r1 = r0.f79002p
            java.lang.String r2 = r10.mo85944e()
            r1.setHintText((java.lang.CharSequence) r2)
            java.lang.String r2 = r10.mo85946f()
            r1.setInputText(r2)
            r1.mo35919b()
            java.lang.String r2 = ""
            r1.setInfoText(r2)
            ge.bog.designsystem.components.emptywidget.EmptyWidget r1 = r0.f78998l
            ge.bog.designsystem.components.creditcard.CreditCardView$b r3 = r10.mo85940a()
            r4 = 0
            if (r3 != 0) goto L_0x002e
            java.lang.String r3 = "tcc.permit.details.page.choose.card"
            java.lang.Object[] r5 = new java.lang.Object[r4]
            java.lang.String r3 = g91.C32343x.m95388F(r3, r5)
            goto L_0x0034
        L_0x002e:
            int r3 = c71.C31287g.tc_chosen_card
            java.lang.String r3 = r9.getString(r3)
        L_0x0034:
            r1.setTitle(r3)
            ge.bog.designsystem.components.pagedescription.PageDescriptionView r1 = r0.f78999m
            ge.bog.designsystem.components.creditcard.CreditCardView$b r3 = r10.mo85940a()
            if (r3 != 0) goto L_0x0048
            java.lang.String r3 = "tcc.permit.details.page.card.not.chosen"
            java.lang.Object[] r5 = new java.lang.Object[r4]
            java.lang.String r3 = g91.C32343x.m95388F(r3, r5)
            goto L_0x0050
        L_0x0048:
            java.lang.String r3 = "tcc.permit.details.page.choose.card.chosen"
            java.lang.Object[] r5 = new java.lang.Object[r4]
            java.lang.String r3 = g91.C32343x.m95388F(r3, r5)
        L_0x0050:
            r1.setText(r3)
            ge.bog.designsystem.components.creditcard.CreditCardView$b r1 = r10.mo85940a()
            if (r1 == 0) goto L_0x0063
            ge.bog.designsystem.components.creditcard.CreditCardView r3 = r0.f78996j
            r3.setCreditCard(r1)
            ge.bog.designsystem.components.creditcard.CreditCardView r1 = r0.f78996j
            r1.mo35429i()
        L_0x0063:
            android.view.View r1 = r0.f78997k
            java.lang.String r3 = "tcCardDivider"
            kotlin.jvm.internal.C41536l.m120488h(r1, r3)
            boolean r3 = r10.mo85943d()
            r5 = 2
            r6 = 0
            g91.C32343x.m95483r1(r1, r3, r4, r5, r6)
            ge.bog.designsystem.components.pagedescription.PageDescriptionView r1 = r0.f79000n
            java.lang.String r3 = r10.mo85942c()
            r7 = 1
            if (r3 == 0) goto L_0x0085
            int r3 = r3.length()
            if (r3 != 0) goto L_0x0083
            goto L_0x0085
        L_0x0083:
            r3 = r4
            goto L_0x0086
        L_0x0085:
            r3 = r7
        L_0x0086:
            if (r3 == 0) goto L_0x0091
            java.lang.String r3 = "tcc.permit.details.page.choose.usage.method"
            java.lang.Object[] r8 = new java.lang.Object[r4]
            java.lang.String r3 = g91.C32343x.m95388F(r3, r8)
            goto L_0x00a8
        L_0x0091:
            boolean r3 = r10.mo85948h()
            if (r3 == 0) goto L_0x00a0
            java.lang.String r3 = "tcc.permit.details.page.usage.method.card"
            java.lang.Object[] r8 = new java.lang.Object[r4]
            java.lang.String r3 = g91.C32343x.m95388F(r3, r8)
            goto L_0x00a8
        L_0x00a0:
            java.lang.String r3 = "tcc.permit.details.page.usage.method.digital"
            java.lang.Object[] r8 = new java.lang.Object[r4]
            java.lang.String r3 = g91.C32343x.m95388F(r3, r8)
        L_0x00a8:
            r1.setText(r3)
            ge.bog.designsystem.components.pagedescription.PageDescriptionView r1 = r0.f79000n
            java.lang.String r3 = "tcDetailsPageDescription2"
            kotlin.jvm.internal.C41536l.m120488h(r1, r3)
            boolean r3 = r10.mo85943d()
            g91.C32343x.m95483r1(r1, r3, r4, r5, r6)
            ge.bog.designsystem.components.input.Input r1 = r0.f79003q
            java.lang.String r3 = "setUiState$lambda$3$lambda$2"
            kotlin.jvm.internal.C41536l.m120488h(r1, r3)
            boolean r3 = r10.mo85943d()
            g91.C32343x.m95483r1(r1, r3, r4, r5, r6)
            r1.mo35919b()
            r1.setInfoText(r2)
            java.lang.String r3 = r10.mo85942c()
            if (r3 == 0) goto L_0x00db
            int r3 = r3.length()
            if (r3 != 0) goto L_0x00da
            goto L_0x00db
        L_0x00da:
            r7 = r4
        L_0x00db:
            if (r7 == 0) goto L_0x0108
            r1.setInputText(r2)
            ge.bog.designsystem.components.common.Image$Resource r2 = new ge.bog.designsystem.components.common.Image$Resource
            int r3 = c71.C31283c.f77693b
            r2.<init>(r3, r6, r5, r6)
            r1.setStartIconImage(r2)
            android.view.View r1 = r1.getEndComponentView()
            if (r1 == 0) goto L_0x00f9
            int r2 = c71.C31284d.tc_input_select_btn
            android.view.View r1 = r1.findViewById(r2)
            r6 = r1
            ge.bog.designsystem.components.buttons.Button r6 = (p341ge.bog.designsystem.components.buttons.Button) r6
        L_0x00f9:
            if (r6 != 0) goto L_0x00fc
            goto L_0x0158
        L_0x00fc:
            java.lang.String r1 = "tcc.permit.details.page.choose.button"
            java.lang.Object[] r2 = new java.lang.Object[r4]
            java.lang.String r1 = g91.C32343x.m95388F(r1, r2)
            r6.setButtonText(r1)
            goto L_0x0158
        L_0x0108:
            android.view.View r2 = r1.getEndComponentView()
            if (r2 == 0) goto L_0x0117
            int r3 = c71.C31284d.tc_input_select_btn
            android.view.View r2 = r2.findViewById(r3)
            ge.bog.designsystem.components.buttons.Button r2 = (p341ge.bog.designsystem.components.buttons.Button) r2
            goto L_0x0118
        L_0x0117:
            r2 = r6
        L_0x0118:
            if (r2 != 0) goto L_0x011b
            goto L_0x0124
        L_0x011b:
            int r3 = c71.C31287g.tc_change
            java.lang.String r3 = r9.getString(r3)
            r2.setButtonText(r3)
        L_0x0124:
            boolean r2 = r10.mo85948h()
            if (r2 == 0) goto L_0x0136
            int r2 = c71.C31287g.tc_plastic_card
            java.lang.String r2 = r9.getString(r2)
            java.lang.String r3 = "getString(R.string.tc_plastic_card)"
            kotlin.jvm.internal.C41536l.m120488h(r2, r3)
            goto L_0x013a
        L_0x0136:
            java.lang.String r2 = r10.mo85942c()
        L_0x013a:
            r1.setInputText(r2)
            boolean r2 = r10.mo85948h()
            if (r2 == 0) goto L_0x014e
            ge.bog.designsystem.components.common.Image$Resource r2 = new ge.bog.designsystem.components.common.Image$Resource
            int r3 = c71.C31283c.ic_card
            r2.<init>(r3, r6, r5, r6)
            r1.setStartIconImage(r2)
            goto L_0x0158
        L_0x014e:
            ge.bog.designsystem.components.common.Image$Resource r2 = new ge.bog.designsystem.components.common.Image$Resource
            int r3 = c71.C31283c.ic_tc_device
            r2.<init>(r3, r6, r5, r6)
            r1.setStartIconImage(r2)
        L_0x0158:
            g71.g r1 = r9.m102978q1()
            ge.bog.designsystem.components.fixedbutton.FixedButtonCardSelectorView r1 = r1.f79001o
            ge.bog.designsystem.components.creditcardsmallpicker.CreditCardSmallPickerView r1 = r1.getPicker()
            ge.bog.designsystem.components.creditcardsmallpicker.CreditCardSmallPickerView$b r2 = r10.mo85947g()
            if (r2 != 0) goto L_0x016a
            ge.bog.designsystem.components.creditcardsmallpicker.CreditCardSmallPickerView$b$a r2 = p341ge.bog.designsystem.components.creditcardsmallpicker.CreditCardSmallPickerView.C13279b.C13280a.f39265a
        L_0x016a:
            r1.setCreditCard(r2)
            ge.bog.designsystem.components.fixedbutton.FixedButtonCardSelectorView r0 = r0.f79001o
            ge.bog.designsystem.components.buttons.Button r0 = r0.getMainButton()
            int r1 = c71.C31287g.tc_pay
            java.lang.String r1 = r9.getString(r1)
            java.lang.String r10 = r10.mo85946f()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r1)
            java.lang.String r1 = " ("
            r2.append(r1)
            r2.append(r10)
            java.lang.String r10 = ")"
            r2.append(r10)
            java.lang.String r10 = r2.toString()
            r0.setButtonText(r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p341ge.bog.mobilebank.transportcard.presentation.selecttransportcarddetails.SelectTransportCardDetailsFragment.m102969B1(ge.bog.mobilebank.transportcard.presentation.selecttransportcarddetails.b$c):void");
    }

    private final void observeData() {
        m102979r1().mo85907Ow().mo85913a().mo4819k(getViewLifecycleOwner(), new C35048k(new C35036b(this)));
        m102979r1().mo85907Ow().mo85918n8().mo4819k(getViewLifecycleOwner(), new C35048k(new C35037c(this)));
    }

    /* access modifiers changed from: private */
    /* renamed from: q1 */
    public final C32114g m102978q1() {
        C32114g gVar = this.f84534g;
        C41536l.m120486f(gVar);
        return gVar;
    }

    /* renamed from: r1 */
    private final SelectTransportCardDetailsViewModel$ViewModel m102979r1() {
        return (SelectTransportCardDetailsViewModel$ViewModel) this.f84535h.getValue();
    }

    /* renamed from: s1 */
    private final void m102980s1() {
        LiveData br = m102979r1().mo85907Ow().mo85916br();
        C1619q viewLifecycleOwner = getViewLifecycleOwner();
        C41536l.m120488h(viewLifecycleOwner, "viewLifecycleOwner");
        C37224b.m109963b(br, viewLifecycleOwner, new C35041d(this));
        LiveData Mk = m102979r1().mo85907Ow().mo85904Mk();
        C1619q viewLifecycleOwner2 = getViewLifecycleOwner();
        C41536l.m120488h(viewLifecycleOwner2, "viewLifecycleOwner");
        C37224b.m109963b(Mk, viewLifecycleOwner2, new C35042e(this));
        LiveData k4 = m102979r1().mo85907Ow().mo85917k4();
        C1619q viewLifecycleOwner3 = getViewLifecycleOwner();
        C41536l.m120488h(viewLifecycleOwner3, "viewLifecycleOwner");
        C37224b.m109963b(k4, viewLifecycleOwner3, new C35043f(this));
        LiveData Jh = m102979r1().mo85907Ow().mo85898Jh();
        C1619q viewLifecycleOwner4 = getViewLifecycleOwner();
        C41536l.m120488h(viewLifecycleOwner4, "viewLifecycleOwner");
        C37224b.m109963b(Jh, viewLifecycleOwner4, new C35044g(this));
        LiveData vr = m102979r1().mo85907Ow().mo85920vr();
        C1619q viewLifecycleOwner5 = getViewLifecycleOwner();
        C41536l.m120488h(viewLifecycleOwner5, "viewLifecycleOwner");
        C37224b.m109963b(vr, viewLifecycleOwner5, new C35045h(this));
        LiveData Ju = m102979r1().mo85907Ow().mo85899Ju();
        C1619q viewLifecycleOwner6 = getViewLifecycleOwner();
        C41536l.m120488h(viewLifecycleOwner6, "viewLifecycleOwner");
        C37224b.m109963b(Ju, viewLifecycleOwner6, new C35046i(this));
        LiveData bn = m102979r1().mo85907Ow().mo85915bn();
        C1619q viewLifecycleOwner7 = getViewLifecycleOwner();
        C41536l.m120488h(viewLifecycleOwner7, "viewLifecycleOwner");
        C37224b.m109963b(bn, viewLifecycleOwner7, new C35047j(this));
    }

    /* renamed from: t1 */
    private final void m102981t1() {
        m102978q1().f79002p.setOnClickListener(new C38135a(this));
        m102978q1().f79003q.setOnClickListener(new C38136b(this));
        m102978q1().f78996j.setOnClickListener(new C38137c(this));
        m102978q1().f79001o.getPicker().setOnClickListener(new C38138d(this));
        m102978q1().f79001o.setOnClickListener(new C38139e(this));
        m102978q1().f78995i.setOnClickListener(new C38140f(this));
    }

    /* access modifiers changed from: private */
    /* renamed from: u1 */
    public static final void m102982u1(SelectTransportCardDetailsFragment selectTransportCardDetailsFragment, View view) {
        C41536l.m120489i(selectTransportCardDetailsFragment, "this$0");
        selectTransportCardDetailsFragment.m102979r1().mo85900Jw().mo85892A5();
    }

    /* access modifiers changed from: private */
    /* renamed from: v1 */
    public static final void m102983v1(SelectTransportCardDetailsFragment selectTransportCardDetailsFragment, View view) {
        C41536l.m120489i(selectTransportCardDetailsFragment, "this$0");
        selectTransportCardDetailsFragment.m102979r1().mo85900Jw().mo85919rm();
    }

    /* access modifiers changed from: private */
    /* renamed from: x1 */
    public static final void m102984x1(SelectTransportCardDetailsFragment selectTransportCardDetailsFragment, View view) {
        C41536l.m120489i(selectTransportCardDetailsFragment, "this$0");
        selectTransportCardDetailsFragment.m102979r1().mo85900Jw().mo85922y8();
    }

    /* access modifiers changed from: private */
    /* renamed from: y1 */
    public static final void m102985y1(SelectTransportCardDetailsFragment selectTransportCardDetailsFragment, View view) {
        C41536l.m120489i(selectTransportCardDetailsFragment, "this$0");
        selectTransportCardDetailsFragment.m102979r1().mo85900Jw().mo85912Uj();
    }

    /* access modifiers changed from: private */
    /* renamed from: z1 */
    public static final void m102986z1(SelectTransportCardDetailsFragment selectTransportCardDetailsFragment, View view) {
        C41536l.m120489i(selectTransportCardDetailsFragment, "this$0");
        selectTransportCardDetailsFragment.m102979r1().mo85900Jw().mo85908Pu();
    }

    /* renamed from: O */
    public void mo37615O(String str, String str2, String str3, String str4) {
        C41536l.m120489i(str, "operationId");
        C41536l.m120489i(str2, "operationReference");
        C41536l.m120489i(str3, "scaAuthCode");
        if (C41536l.m120484d(str4, "SCA_TAG")) {
            m102979r1().mo85895Fw(str, str2, str3);
        }
        FragmentManager childFragmentManager = getChildFragmentManager();
        C41536l.m120488h(childFragmentManager, "childFragmentManager");
        C41185v f0 = C32343x.m95446f0(childFragmentManager, "SCA_TAG");
        if (f0 != null) {
            f0.mo4577k1();
        }
    }

    /* renamed from: R */
    public void mo37616R(String str, String str2) {
        C41536l.m120489i(str, "message");
        C1505h requireActivity = requireActivity();
        C41536l.m120488h(requireActivity, "requireActivity()");
        String string = getString(C31287g.f77715a);
        C41536l.m120488h(string, "getString(R.string.common_text_operation_error)");
        C12910e.m48790h(requireActivity, string, (C12902d.C12905b) null, false, 6, (Object) null);
    }

    /* renamed from: S */
    public void mo37617S(boolean z) {
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C41536l.m120489i(layoutInflater, "inflater");
        this.f84534g = C32114g.m94590d(layoutInflater, viewGroup, false);
        StateView c = m102978q1().mo3946b();
        C41536l.m120488h(c, "binding.root");
        return c;
    }

    public void onDestroyView() {
        super.onDestroyView();
        this.f84534g = null;
    }

    public void onViewCreated(View view, Bundle bundle) {
        C41536l.m120489i(view, "view");
        super.onViewCreated(view, bundle);
        m102978q1().f78996j.setEmptyCreditCardText(C32343x.m95388F("tcc.permit.details.page.choose.card", new Object[0]));
        m102978q1().f79001o.getPicker().mo35468h(new CreditCardSmallPickerView.C13282c(C32343x.m95388F("tcc.permit.details.page.choose.payment.method", new Object[0]), C32343x.m95388F("tcc.permit.details.page.choose.payment.method", new Object[0])));
        m102981t1();
        m102980s1();
        observeData();
    }
}
