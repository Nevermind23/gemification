package p341ge.bog.mobilebank.cardapplications.presentation.activity.instantcards;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import androidx.activity.ComponentActivity;
import androidx.activity.result.C0173b;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.lifecycle.C1617p0;
import androidx.lifecycle.C1620q0;
import androidx.lifecycle.C1636t0;
import androidx.lifecycle.C1645y;
import b41.C31128a;
import b41.C31132b;
import com.github.mikephil.charting.utils.Utils;
import g91.C32303f;
import g91.C32343x;
import he1.C41212c;
import he1.C41217g;
import he1.C41238w;
import kotlin.jvm.internal.C41520a0;
import kotlin.jvm.internal.C41532h;
import kotlin.jvm.internal.C41535k;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import m41.C37224b;
import p163m0.C7047a;
import p341ge.bog.designsystem.components.input.Input;
import p341ge.bog.designsystem.components.loading.LoadingView;
import p341ge.bog.designsystem.components.pagestate.PageState;
import p341ge.bog.mobilebank.cardapplications.presentation.actionsheet.AddressChooserActionSheet;
import p341ge.bog.mobilebank.cardapplications.presentation.model.AddressAdapterModel;
import p341ge.bog.mobilebank.cardapplications.presentation.viewmodel.OrderInstantCardViewModel$ViewModel;
import p341ge.bog.mobilebank.cleanarch.presentation.common.C21481a;
import p411em.C12490g;
import p412en.C12681w3;
import p481jm.C16234m;
import p565pm.C17389d;
import p565pm.C17390e;
import p607sm.C17855a0;
import p607sm.C17857b0;
import p607sm.C17859c0;
import p607sm.C17861d0;
import p607sm.C17863e0;
import p607sm.C17885z;
import p688ym.C18956a;
import p688ym.C18957b;
import ue1.C43064a;
import ue1.C43075l;

/* renamed from: ge.bog.mobilebank.cardapplications.presentation.activity.instantcards.OrderInstantCardActivity */
public final class OrderInstantCardActivity extends C14186d {

    /* renamed from: I */
    public static final C14160a f41561I = new C14160a((DefaultConstructorMarker) null);

    /* renamed from: G */
    private final C41217g f41562G = C41219i.m119470b(new C14169g(this));

    /* renamed from: H */
    private final C41217g f41563H = new C1617p0(C41520a0.m120436b(OrderInstantCardViewModel$ViewModel.class), new C14178p(this), new C14177o(this), new C14179q((C43064a) null, this));

    /* renamed from: ge.bog.mobilebank.cardapplications.presentation.activity.instantcards.OrderInstantCardActivity$a */
    public static final class C14160a {
        private C14160a() {
        }

        public /* synthetic */ C14160a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final void mo39242a(Context context, C0173b bVar) {
            C41238w wVar;
            C41536l.m120489i(context, "context");
            Intent intent = new Intent(context, OrderInstantCardActivity.class);
            if (bVar != null) {
                bVar.mo404a(intent);
                wVar = C41238w.f97225a;
            } else {
                wVar = null;
            }
            if (wVar == null) {
                context.startActivity(intent);
            }
        }
    }

    /* renamed from: ge.bog.mobilebank.cardapplications.presentation.activity.instantcards.OrderInstantCardActivity$b */
    static final class C14161b extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ OrderInstantCardActivity f41564d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C14161b(OrderInstantCardActivity orderInstantCardActivity) {
            super(1);
            this.f41564d = orderInstantCardActivity;
        }

        /* renamed from: a */
        public final void mo39243a(C31128a aVar) {
            OrderInstantCardActivity orderInstantCardActivity = this.f41564d;
            C41536l.m120488h(aVar, "it");
            orderInstantCardActivity.m52455h3(aVar);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo39243a((C31128a) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.cardapplications.presentation.activity.instantcards.OrderInstantCardActivity$c */
    /* synthetic */ class C14162c extends C41535k implements C43075l {
        C14162c(Object obj) {
            super(1, obj, OrderInstantCardActivity.class, "adjustInput", "adjustInput(Lge/bog/mobilebank/cardapplications/presentation/model/instantcards/DeliveryData;)V", 0);
        }

        /* renamed from: b */
        public final void mo39244b(C18956a aVar) {
            C41536l.m120489i(aVar, "p0");
            ((OrderInstantCardActivity) this.receiver).m52448a3(aVar);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo39244b((C18956a) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.cardapplications.presentation.activity.instantcards.OrderInstantCardActivity$d */
    /* synthetic */ class C14163d extends C41535k implements C43075l {
        C14163d(Object obj) {
            super(1, obj, OrderInstantCardActivity.class, "onCardOrderResult", "onCardOrderResult(Lge/bog/mobilebank/shared/requestedresult/RequestedResult;)V", 0);
        }

        /* renamed from: b */
        public final void mo39245b(C31128a aVar) {
            C41536l.m120489i(aVar, "p0");
            ((OrderInstantCardActivity) this.receiver).m52454g3(aVar);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo39245b((C31128a) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.cardapplications.presentation.activity.instantcards.OrderInstantCardActivity$e */
    /* synthetic */ class C14164e extends C41535k implements C43075l {
        C14164e(Object obj) {
            super(1, obj, OrderInstantCardActivity.class, "openActionSheet", "openActionSheet(Lge/bog/mobilebank/cardapplications/presentation/model/instantcards/InstantAddressData;)V", 0);
        }

        /* renamed from: b */
        public final void mo39246b(C18957b bVar) {
            C41536l.m120489i(bVar, "p0");
            ((OrderInstantCardActivity) this.receiver).m52456i3(bVar);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo39246b((C18957b) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.cardapplications.presentation.activity.instantcards.OrderInstantCardActivity$f */
    static final class C14165f extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ OrderInstantCardActivity f41565d;

        /* renamed from: ge.bog.mobilebank.cardapplications.presentation.activity.instantcards.OrderInstantCardActivity$f$a */
        static final class C14166a extends C41537m implements C43075l {

            /* renamed from: d */
            final /* synthetic */ OrderInstantCardActivity f41566d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C14166a(OrderInstantCardActivity orderInstantCardActivity) {
                super(1);
                this.f41566d = orderInstantCardActivity;
            }

            /* renamed from: a */
            public final void mo39248a(double d) {
                this.f41566d.m52450c3().f45918l.getButton().setLoading(false);
                this.f41566d.m52451d3(d);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                mo39248a(((Number) obj).doubleValue());
                return C41238w.f97225a;
            }
        }

        /* renamed from: ge.bog.mobilebank.cardapplications.presentation.activity.instantcards.OrderInstantCardActivity$f$b */
        static final class C14167b extends C41537m implements C43075l {

            /* renamed from: d */
            final /* synthetic */ OrderInstantCardActivity f41567d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C14167b(OrderInstantCardActivity orderInstantCardActivity) {
                super(1);
                this.f41567d = orderInstantCardActivity;
            }

            /* renamed from: a */
            public final void mo39249a(Double d) {
                this.f41567d.m52450c3().f45918l.getButton().setLoading(true);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                mo39249a((Double) obj);
                return C41238w.f97225a;
            }
        }

        /* renamed from: ge.bog.mobilebank.cardapplications.presentation.activity.instantcards.OrderInstantCardActivity$f$c */
        static final class C14168c extends C41537m implements C43075l {

            /* renamed from: d */
            final /* synthetic */ OrderInstantCardActivity f41568d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C14168c(OrderInstantCardActivity orderInstantCardActivity) {
                super(1);
                this.f41568d = orderInstantCardActivity;
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((Throwable) obj);
                return C41238w.f97225a;
            }

            public final void invoke(Throwable th) {
                C41536l.m120489i(th, "it");
                this.f41568d.m52450c3().f45918l.getButton().setLoading(false);
                this.f41568d.mo74709H1(th);
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C14165f(OrderInstantCardActivity orderInstantCardActivity) {
            super(1);
            this.f41565d = orderInstantCardActivity;
        }

        /* renamed from: a */
        public final void mo39247a(C31128a aVar) {
            C41536l.m120488h(aVar, "response");
            C31132b.m92648j(aVar, (int[]) null, new C14166a(this.f41565d), 1, (Object) null);
            C31132b.m92646h(aVar, (int[]) null, new C14167b(this.f41565d), 1, (Object) null);
            C31132b.m92643e(aVar, (int[]) null, new C14168c(this.f41565d), 1, (Object) null);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo39247a((C31128a) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.cardapplications.presentation.activity.instantcards.OrderInstantCardActivity$g */
    static final class C14169g extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ OrderInstantCardActivity f41569d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C14169g(OrderInstantCardActivity orderInstantCardActivity) {
            super(0);
            this.f41569d = orderInstantCardActivity;
        }

        /* renamed from: b */
        public final C16234m invoke() {
            return C16234m.m57870d(this.f41569d.getLayoutInflater());
        }
    }

    /* renamed from: ge.bog.mobilebank.cardapplications.presentation.activity.instantcards.OrderInstantCardActivity$h */
    static final class C14170h extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ OrderInstantCardActivity f41570d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C14170h(OrderInstantCardActivity orderInstantCardActivity) {
            super(1);
            this.f41570d = orderInstantCardActivity;
        }

        /* renamed from: a */
        public final void mo39252a(String str) {
            this.f41570d.m52450c3().f45918l.getButton().setLoading(true);
            this.f41570d.m52450c3().f45913g.setEnabled(false);
            this.f41570d.m52450c3().f45913g.clearFocus();
            this.f41570d.m52453f3();
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo39252a((String) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.cardapplications.presentation.activity.instantcards.OrderInstantCardActivity$i */
    static final class C14171i extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ OrderInstantCardActivity f41571d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C14171i(OrderInstantCardActivity orderInstantCardActivity) {
            super(1);
            this.f41571d = orderInstantCardActivity;
        }

        /* renamed from: a */
        public final void mo39253a(String str) {
            C41536l.m120489i(str, "it");
            this.f41571d.m52450c3().f45918l.getButton().setLoading(false);
            this.f41571d.m52450c3().f45913g.setEnabled(true);
            InstantCardStatusActivity.f41528H.mo39211a(this.f41571d, str);
            this.f41571d.setResult(3);
            this.f41571d.finish();
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo39253a((String) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.cardapplications.presentation.activity.instantcards.OrderInstantCardActivity$j */
    static final class C14172j extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ OrderInstantCardActivity f41572d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C14172j(OrderInstantCardActivity orderInstantCardActivity) {
            super(1);
            this.f41572d = orderInstantCardActivity;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Throwable) obj);
            return C41238w.f97225a;
        }

        public final void invoke(Throwable th) {
            C41536l.m120489i(th, "it");
            this.f41572d.m52450c3().f45918l.getButton().setLoading(false);
            this.f41572d.m52450c3().f45913g.setEnabled(true);
            this.f41572d.mo74709H1(th);
        }
    }

    /* renamed from: ge.bog.mobilebank.cardapplications.presentation.activity.instantcards.OrderInstantCardActivity$k */
    static final class C14173k extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ OrderInstantCardActivity f41573d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C14173k(OrderInstantCardActivity orderInstantCardActivity) {
            super(1);
            this.f41573d = orderInstantCardActivity;
        }

        /* renamed from: a */
        public final void mo39255a(String str) {
            LinearLayoutCompat linearLayoutCompat = this.f41573d.m52450c3().f45916j;
            C41536l.m120488h(linearLayoutCompat, "binding.inputs");
            C32343x.m95455i0(linearLayoutCompat);
            LinearLayoutCompat linearLayoutCompat2 = this.f41573d.m52450c3().f45911e;
            C41536l.m120488h(linearLayoutCompat2, "binding.errorContainer");
            C32343x.m95455i0(linearLayoutCompat2);
            this.f41573d.m52457j3(true);
            this.f41573d.m52450c3().f45918l.getButton().setEnabled(false);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo39255a((String) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.cardapplications.presentation.activity.instantcards.OrderInstantCardActivity$l */
    static final class C14174l extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ OrderInstantCardActivity f41574d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C14174l(OrderInstantCardActivity orderInstantCardActivity) {
            super(1);
            this.f41574d = orderInstantCardActivity;
        }

        /* renamed from: a */
        public final void mo39256a(String str) {
            C41536l.m120489i(str, "it");
            LinearLayoutCompat linearLayoutCompat = this.f41574d.m52450c3().f45916j;
            C41536l.m120488h(linearLayoutCompat, "binding.inputs");
            C32343x.m95447f1(linearLayoutCompat);
            this.f41574d.m52457j3(false);
            this.f41574d.m52450c3().f45914h.setInputText(str);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo39256a((String) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.cardapplications.presentation.activity.instantcards.OrderInstantCardActivity$m */
    static final class C14175m extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ OrderInstantCardActivity f41575d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C14175m(OrderInstantCardActivity orderInstantCardActivity) {
            super(1);
            this.f41575d = orderInstantCardActivity;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Throwable) obj);
            return C41238w.f97225a;
        }

        public final void invoke(Throwable th) {
            C41536l.m120489i(th, "it");
            LinearLayoutCompat linearLayoutCompat = this.f41575d.m52450c3().f45916j;
            C41536l.m120488h(linearLayoutCompat, "binding.inputs");
            C32343x.m95455i0(linearLayoutCompat);
            this.f41575d.m52457j3(false);
            LinearLayoutCompat linearLayoutCompat2 = this.f41575d.m52450c3().f45911e;
            C41536l.m120488h(linearLayoutCompat2, "binding.errorContainer");
            C32343x.m95447f1(linearLayoutCompat2);
            PageState pageState = this.f41575d.m52450c3().f45912f;
            String a0 = C32343x.m95431a0(th, (String) null, 1, (Object) null);
            if (a0 == null) {
                a0 = C32343x.m95452h0(C12490g.f37228e, new Object[0]);
            }
            pageState.setTitleText(a0);
        }
    }

    /* renamed from: ge.bog.mobilebank.cardapplications.presentation.activity.instantcards.OrderInstantCardActivity$n */
    static final class C14176n implements C1645y, C41532h {

        /* renamed from: a */
        private final /* synthetic */ C43075l f41576a;

        C14176n(C43075l lVar) {
            C41536l.m120489i(lVar, "function");
            this.f41576a = lVar;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof C1645y) || !(obj instanceof C41532h)) {
                return false;
            }
            return C41536l.m120484d(getFunctionDelegate(), ((C41532h) obj).getFunctionDelegate());
        }

        public final C41212c getFunctionDelegate() {
            return this.f41576a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        public final /* synthetic */ void onChanged(Object obj) {
            this.f41576a.invoke(obj);
        }
    }

    /* renamed from: ge.bog.mobilebank.cardapplications.presentation.activity.instantcards.OrderInstantCardActivity$o */
    public static final class C14177o extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ ComponentActivity f41577d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C14177o(ComponentActivity componentActivity) {
            super(0);
            this.f41577d = componentActivity;
        }

        public final C1620q0.C1624b invoke() {
            C1620q0.C1624b defaultViewModelProviderFactory = this.f41577d.getDefaultViewModelProviderFactory();
            C41536l.m120488h(defaultViewModelProviderFactory, "defaultViewModelProviderFactory");
            return defaultViewModelProviderFactory;
        }
    }

    /* renamed from: ge.bog.mobilebank.cardapplications.presentation.activity.instantcards.OrderInstantCardActivity$p */
    public static final class C14178p extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ ComponentActivity f41578d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C14178p(ComponentActivity componentActivity) {
            super(0);
            this.f41578d = componentActivity;
        }

        public final C1636t0 invoke() {
            C1636t0 viewModelStore = this.f41578d.getViewModelStore();
            C41536l.m120488h(viewModelStore, "viewModelStore");
            return viewModelStore;
        }
    }

    /* renamed from: ge.bog.mobilebank.cardapplications.presentation.activity.instantcards.OrderInstantCardActivity$q */
    public static final class C14179q extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C43064a f41579d;

        /* renamed from: e */
        final /* synthetic */ ComponentActivity f41580e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C14179q(C43064a aVar, ComponentActivity componentActivity) {
            super(0);
            this.f41579d = aVar;
            this.f41580e = componentActivity;
        }

        public final C7047a invoke() {
            C7047a aVar;
            C43064a aVar2 = this.f41579d;
            if (aVar2 != null && (aVar = (C7047a) aVar2.invoke()) != null) {
                return aVar;
            }
            C7047a defaultViewModelCreationExtras = this.f41580e.getDefaultViewModelCreationExtras();
            C41536l.m120488h(defaultViewModelCreationExtras, "this.defaultViewModelCreationExtras");
            return defaultViewModelCreationExtras;
        }
    }

    /* renamed from: S2 */
    private final void m52440S2() {
        getSupportFragmentManager().mo4367F1("ADDRESS_SELECTED", this, new C17863e0(this));
    }

    /* access modifiers changed from: private */
    /* renamed from: T2 */
    public static final void m52441T2(OrderInstantCardActivity orderInstantCardActivity, String str, Bundle bundle) {
        C41536l.m120489i(orderInstantCardActivity, "this$0");
        C41536l.m120489i(str, "<anonymous parameter 0>");
        C41536l.m120489i(bundle, "b");
        AddressAdapterModel addressAdapterModel = (AddressAdapterModel) bundle.getParcelable("SELECTED_ADDRESS");
        if (addressAdapterModel != null) {
            orderInstantCardActivity.m52452e3().mo39990tw().mo33335mm(addressAdapterModel.mo39272d());
        }
    }

    /* renamed from: U2 */
    private final void m52442U2() {
        m52450c3().f45918l.getButton().setOnClickListener(new C17885z(this));
        m52450c3().f45920n.setOnClickListener(new C17855a0(this));
        m52450c3().f45914h.setOnClickListener(new C17857b0(this));
        m52450c3().f45913g.setOnClickListener(new C17859c0(this));
        m52450c3().f45915i.setOnClickListener(new C17861d0(this));
    }

    /* access modifiers changed from: private */
    /* renamed from: V2 */
    public static final void m52443V2(OrderInstantCardActivity orderInstantCardActivity, View view) {
        C41536l.m120489i(orderInstantCardActivity, "this$0");
        orderInstantCardActivity.m52452e3().mo39990tw().mo33334B5(C40440x.m117146P0(orderInstantCardActivity.m52450c3().f45913g.getInputText()).toString());
    }

    /* access modifiers changed from: private */
    /* renamed from: W2 */
    public static final void m52444W2(OrderInstantCardActivity orderInstantCardActivity, View view) {
        C41536l.m120489i(orderInstantCardActivity, "this$0");
        C21481a.onRefresh$default(orderInstantCardActivity.m52452e3(), 0, 1, (Object) null);
    }

    /* access modifiers changed from: private */
    /* renamed from: X2 */
    public static final void m52445X2(OrderInstantCardActivity orderInstantCardActivity, View view) {
        C41536l.m120489i(orderInstantCardActivity, "this$0");
        orderInstantCardActivity.m52452e3().mo39993xw(C17390e.COUNTRY);
    }

    /* access modifiers changed from: private */
    /* renamed from: Y2 */
    public static final void m52446Y2(OrderInstantCardActivity orderInstantCardActivity, View view) {
        C41536l.m120489i(orderInstantCardActivity, "this$0");
        orderInstantCardActivity.m52452e3().mo39993xw(C17390e.CITY);
    }

    /* access modifiers changed from: private */
    /* renamed from: Z2 */
    public static final void m52447Z2(OrderInstantCardActivity orderInstantCardActivity, View view) {
        C41536l.m120489i(orderInstantCardActivity, "this$0");
        orderInstantCardActivity.m52452e3().mo39993xw(C17390e.ADDRESS);
    }

    /* access modifiers changed from: private */
    /* renamed from: a3 */
    public final void m52448a3(C18956a aVar) {
        String str;
        String str2;
        boolean z;
        String b;
        Input input = m52450c3().f45914h;
        C17389d d = aVar.mo47003d();
        String str3 = "";
        if (d == null || (str = d.mo44908b()) == null) {
            str = str3;
        }
        input.setInputText(str);
        Input input2 = m52450c3().f45913g;
        C17389d c = aVar.mo47002c();
        if (c == null || (str2 = c.mo44908b()) == null) {
            str2 = str3;
        }
        input2.setInputText(str2);
        Input input3 = m52450c3().f45915i;
        C17389d e = aVar.mo47004e();
        if (!(e == null || (b = e.mo44908b()) == null)) {
            str3 = b;
        }
        input3.setInputText(str3);
        Input input4 = m52450c3().f45913g;
        boolean z2 = true;
        if (aVar.mo47003d() != null) {
            z = true;
        } else {
            z = false;
        }
        input4.setEnabled(z);
        Input input5 = m52450c3().f45915i;
        if (aVar.mo47003d() == null || aVar.mo47002c() == null) {
            z2 = false;
        }
        input5.setEnabled(z2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0048, code lost:
        if (r1 != false) goto L_0x004c;
     */
    /* renamed from: b3 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void m52449b3() {
        /*
            r5 = this;
            jm.m r0 = r5.m52450c3()
            ge.bog.designsystem.components.fixedbutton.FixedButtonView r0 = r0.f45918l
            jm.m r1 = r5.m52450c3()
            ge.bog.designsystem.components.input.Input r1 = r1.f45914h
            java.lang.String r2 = "binding.inputCountry"
            kotlin.jvm.internal.C41536l.m120488h(r1, r2)
            int r1 = r1.getChildCount()
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L_0x001b
            r1 = r2
            goto L_0x001c
        L_0x001b:
            r1 = r3
        L_0x001c:
            if (r1 == 0) goto L_0x004b
            jm.m r1 = r5.m52450c3()
            ge.bog.designsystem.components.input.Input r1 = r1.f45913g
            java.lang.String r4 = "binding.inputAddress"
            kotlin.jvm.internal.C41536l.m120488h(r1, r4)
            int r1 = r1.getChildCount()
            if (r1 == 0) goto L_0x0031
            r1 = r2
            goto L_0x0032
        L_0x0031:
            r1 = r3
        L_0x0032:
            if (r1 == 0) goto L_0x004b
            jm.m r1 = r5.m52450c3()
            ge.bog.designsystem.components.input.Input r1 = r1.f45915i
            java.lang.String r4 = "binding.inputServiceCenter"
            kotlin.jvm.internal.C41536l.m120488h(r1, r4)
            int r1 = r1.getChildCount()
            if (r1 == 0) goto L_0x0047
            r1 = r2
            goto L_0x0048
        L_0x0047:
            r1 = r3
        L_0x0048:
            if (r1 == 0) goto L_0x004b
            goto L_0x004c
        L_0x004b:
            r2 = r3
        L_0x004c:
            r0.setEnabled(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p341ge.bog.mobilebank.cardapplications.presentation.activity.instantcards.OrderInstantCardActivity.m52449b3():void");
    }

    /* access modifiers changed from: private */
    /* renamed from: c3 */
    public final C16234m m52450c3() {
        return (C16234m) this.f41562G.getValue();
    }

    /* access modifiers changed from: private */
    /* renamed from: d3 */
    public final void m52451d3(double d) {
        boolean z;
        if (d == Utils.DOUBLE_EPSILON) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            m52450c3().f45918l.setInformationText(C32343x.m95388F("text.order.iic.card.delivery.fee", new Object[0]) + " " + C32343x.m95388F("text.order.iic.card.delivery.fee.free", new Object[0]));
            m52450c3().f45918l.getButton().setButtonText(C32343x.m95388F("text.order.iic.card.button.free", new Object[0]) + "  " + C32343x.m95388F("text.order.iic.card.delivery.fee.free", new Object[0]));
            return;
        }
        m52450c3().f45918l.setInformationText(C32343x.m95388F("text.order.iic.card.delivery.fee", new Object[0]) + " " + C32303f.m95200k(d, "GEL"));
        m52450c3().f45918l.getButton().setButtonText(C32343x.m95388F("text.order.iic.card.button", new Object[0]) + "  " + C32303f.m95200k(d, "GEL"));
    }

    /* renamed from: e3 */
    private final OrderInstantCardViewModel$ViewModel m52452e3() {
        return (OrderInstantCardViewModel$ViewModel) this.f41563H.getValue();
    }

    /* access modifiers changed from: private */
    /* renamed from: f3 */
    public final void m52453f3() {
        Object systemService = getSystemService("input_method");
        C41536l.m120487g(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
        ((InputMethodManager) systemService).hideSoftInputFromWindow(m52450c3().mo3946b().getWindowToken(), 0);
    }

    /* access modifiers changed from: private */
    /* renamed from: g3 */
    public final void m52454g3(C31128a aVar) {
        C31132b.m92646h(aVar, (int[]) null, new C14170h(this), 1, (Object) null);
        C31132b.m92648j(aVar, (int[]) null, new C14171i(this), 1, (Object) null);
        C31132b.m92643e(aVar, (int[]) null, new C14172j(this), 1, (Object) null);
    }

    /* access modifiers changed from: private */
    /* renamed from: h3 */
    public final void m52455h3(C31128a aVar) {
        C31132b.m92646h(aVar, (int[]) null, new C14173k(this), 1, (Object) null);
        C31132b.m92648j(aVar, (int[]) null, new C14174l(this), 1, (Object) null);
        C31132b.m92643e(aVar, (int[]) null, new C14175m(this), 1, (Object) null);
    }

    /* access modifiers changed from: private */
    /* renamed from: i3 */
    public final void m52456i3(C18957b bVar) {
        AddressChooserActionSheet.C13935a.m51910b(AddressChooserActionSheet.f41314P, bVar.mo47008a(), bVar.mo47010c(), bVar.mo47009b(), (String) null, 8, (Object) null).mo4576A1(getSupportFragmentManager(), (String) null);
    }

    /* access modifiers changed from: private */
    /* renamed from: j3 */
    public final void m52457j3(boolean z) {
        LoadingView loadingView = m52450c3().f45921o;
        C41536l.m120488h(loadingView, "binding.skeletonLoader");
        C32343x.m95483r1(loadingView, z, false, 2, (Object) null);
    }

    /* renamed from: k3 */
    private final void m52458k3() {
        m52450c3().f45917k.setTitle(C32343x.m95388F("text.order.iic.card.description1", new Object[0]));
        m52450c3().f45917k.setText(C32343x.m95388F("text.order.iic.card.description2", new Object[0]));
        m52450c3().f45919m.setTitle(C32343x.m95388F("text.order.iic.card.details", new Object[0]));
        m52450c3().f45914h.setHintText((CharSequence) C32343x.m95388F("text.order.iic.card.country", new Object[0]));
        m52450c3().f45913g.setHintText((CharSequence) C32343x.m95388F("text.order.iic.card.city", new Object[0]));
        m52450c3().f45915i.setHintText((CharSequence) C32343x.m95388F("text.order.iic.card.post.office", new Object[0]));
        m52450c3().f45918l.getButton().setButtonText(C32343x.m95388F("text.order.iic.card.button", new Object[0]));
        m52449b3();
    }

    /* renamed from: l1 */
    private final void m52459l1() {
        C12681w3 ww = m52452e3().mo39992ww();
        ww.mo33344Mh().mo4819k(this, new C14176n(new C14161b(this)));
        ww.mo33345To().mo4819k(this, new C14176n(new C14162c(this)));
        ww.mo33348v8().mo4819k(this, new C14176n(new C14163d(this)));
        C37224b.m109963b(ww.mo33346Yp(), this, new C14164e(this));
        ww.mo33347bt().mo4819k(this, new C14176n(new C14165f(this)));
    }

    /* access modifiers changed from: protected */
    /* renamed from: O1 */
    public void mo37451O1(Bundle bundle) {
        setContentView((View) m52450c3().mo3946b());
        super.mo37451O1(bundle);
        m52458k3();
        m52459l1();
        m52442U2();
        m52440S2();
    }

    /* renamed from: z1 */
    public String mo38120z1() {
        return C32343x.m95388F("text.order.iic.card.title", new Object[0]);
    }
}
