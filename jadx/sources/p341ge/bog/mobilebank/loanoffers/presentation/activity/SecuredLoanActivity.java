package p341ge.bog.mobilebank.loanoffers.presentation.activity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import androidx.activity.ComponentActivity;
import androidx.constraintlayout.widget.Group;
import androidx.core.p016os.C0908e;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.C1617p0;
import androidx.lifecycle.C1620q0;
import androidx.lifecycle.C1636t0;
import androidx.lifecycle.C1645y;
import androidx.lifecycle.LiveData;
import b41.C31128a;
import b41.C31132b;
import br0.C31178d;
import g91.C32343x;
import gr0.C36051c;
import gr0.C36055e;
import gr0.C36059g;
import he1.C41212c;
import he1.C41217g;
import he1.C41233s;
import he1.C41238w;
import hr0.C36180b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import jr0.C36783a;
import jr0.C36786b;
import kotlin.jvm.internal.C41520a0;
import kotlin.jvm.internal.C41532h;
import kotlin.jvm.internal.C41535k;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kr0.C36934b;
import kr0.C36935c;
import kr0.C36937d;
import kr0.C36939f;
import kr0.C36940g;
import kr0.C36946m;
import m41.C37223a;
import o31.C37588a0;
import p163m0.C7047a;
import p341ge.bog.designsystem.components.buttons.Button;
import p341ge.bog.designsystem.components.chips.Chip;
import p341ge.bog.designsystem.components.dialog.C13310d;
import p341ge.bog.designsystem.components.emptywidget.EmptyWidget;
import p341ge.bog.designsystem.components.layersandshadows.LayerView;
import p341ge.bog.designsystem.components.loading.LoadingView;
import p341ge.bog.mobilebank.cleanarch.domain.offer.model.OfferInfo;
import p341ge.bog.mobilebank.cleanarch.domain.offer.model.OfferProductCode;
import p341ge.bog.mobilebank.cleanarch.presentation.common.C21481a;
import p341ge.bog.mobilebank.loanoffers.presentation.model.securedloan.PropertyInfoTextData;
import p629uh.C18167d;
import ue1.C43064a;
import ue1.C43075l;

/* renamed from: ge.bog.mobilebank.loanoffers.presentation.activity.SecuredLoanActivity */
public final class SecuredLoanActivity extends C32553a {

    /* renamed from: L */
    public static final C32515a f80143L = new C32515a((DefaultConstructorMarker) null);

    /* renamed from: G */
    public C36934b f80144G;

    /* renamed from: H */
    private final C41217g f80145H = C41219i.m119470b(new C32538m(this));

    /* renamed from: I */
    private final C41217g f80146I = new C1617p0(C41520a0.m120436b(C36946m.class), new C32529g0(this), new C32533i0(this), new C32531h0((C43064a) null, this));

    /* renamed from: J */
    private final C41217g f80147J = C41219i.m119470b(new C32539n(this));

    /* renamed from: K */
    private final C41217g f80148K = C41219i.m119470b(new C32524e0(this));

    /* renamed from: ge.bog.mobilebank.loanoffers.presentation.activity.SecuredLoanActivity$OfferData */
    private static final class OfferData implements Parcelable {
        public static final Parcelable.Creator<OfferData> CREATOR = new C32514a();

        /* renamed from: d */
        private final String f80149d;

        /* renamed from: e */
        private final String f80150e;

        /* renamed from: ge.bog.mobilebank.loanoffers.presentation.activity.SecuredLoanActivity$OfferData$a */
        public static final class C32514a implements Parcelable.Creator {
            /* renamed from: a */
            public final OfferData createFromParcel(Parcel parcel) {
                C41536l.m120489i(parcel, "parcel");
                return new OfferData(parcel.readString(), parcel.readString());
            }

            /* renamed from: b */
            public final OfferData[] newArray(int i) {
                return new OfferData[i];
            }
        }

        public OfferData(String str, String str2) {
            C41536l.m120489i(str, "productCode");
            C41536l.m120489i(str2, "productType");
            this.f80149d = str;
            this.f80150e = str2;
        }

        /* renamed from: a */
        public final String mo73659a() {
            return this.f80149d;
        }

        /* renamed from: b */
        public final String mo73660b() {
            return this.f80150e;
        }

        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OfferData)) {
                return false;
            }
            OfferData offerData = (OfferData) obj;
            return C41536l.m120484d(this.f80149d, offerData.f80149d) && C41536l.m120484d(this.f80150e, offerData.f80150e);
        }

        public int hashCode() {
            return (this.f80149d.hashCode() * 31) + this.f80150e.hashCode();
        }

        public String toString() {
            String str = this.f80149d;
            String str2 = this.f80150e;
            return "OfferData(productCode=" + str + ", productType=" + str2 + ")";
        }

        public void writeToParcel(Parcel parcel, int i) {
            C41536l.m120489i(parcel, "out");
            parcel.writeString(this.f80149d);
            parcel.writeString(this.f80150e);
        }
    }

    /* renamed from: ge.bog.mobilebank.loanoffers.presentation.activity.SecuredLoanActivity$a */
    public static final class C32515a {
        private C32515a() {
        }

        public /* synthetic */ C32515a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final void mo73670a(Context context, String str, String str2) {
            C41536l.m120489i(context, "context");
            C41536l.m120489i(str, "productCode");
            Intent intent = new Intent(context, SecuredLoanActivity.class);
            intent.putExtras(C0908e.m3336b(C41233s.m119492a("PARAM_OFFER_ID", new OfferData(str, String.valueOf(str2)))));
            context.startActivity(intent);
        }
    }

    /* renamed from: ge.bog.mobilebank.loanoffers.presentation.activity.SecuredLoanActivity$a0 */
    /* synthetic */ class C32516a0 extends C41535k implements C43075l {
        C32516a0(Object obj) {
            super(1, obj, SecuredLoanActivity.class, "handleInitialError", "handleInitialError(Ljava/lang/Throwable;)V", 0);
        }

        /* renamed from: b */
        public final void mo73671b(Throwable th) {
            C41536l.m120489i(th, "p0");
            ((SecuredLoanActivity) this.receiver).m96172t3(th);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo73671b((Throwable) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.loanoffers.presentation.activity.SecuredLoanActivity$b */
    /* synthetic */ class C32517b extends C41535k implements C43075l {
        C32517b(Object obj) {
            super(1, obj, SecuredLoanActivity.class, "onSendApplicationResult", "onSendApplicationResult(Lge/bog/mobilebank/shared/requestedresult/RequestedResult;)V", 0);
        }

        /* renamed from: b */
        public final void mo73672b(C31128a aVar) {
            C41536l.m120489i(aVar, "p0");
            ((SecuredLoanActivity) this.receiver).m96123C3(aVar);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo73672b((C31128a) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.loanoffers.presentation.activity.SecuredLoanActivity$b0 */
    static final class C32518b0 extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ SecuredLoanActivity f80151d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C32518b0(SecuredLoanActivity securedLoanActivity) {
            super(1);
            this.f80151d = securedLoanActivity;
        }

        /* renamed from: a */
        public final void mo73673a(C41238w wVar) {
            this.f80151d.m96168o3().f77469x.setLoading(true);
            View view = this.f80151d.m96168o3().f77452g;
            C41536l.m120488h(view, "binding.loadingOverlay");
            C32343x.m95447f1(view);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo73673a((C41238w) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.loanoffers.presentation.activity.SecuredLoanActivity$c */
    static final class C32519c extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ SecuredLoanActivity f80152d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C32519c(SecuredLoanActivity securedLoanActivity) {
            super(1);
            this.f80152d = securedLoanActivity;
        }

        /* renamed from: a */
        public final void mo73674a(C41238w wVar) {
            C41536l.m120489i(wVar, "it");
            this.f80152d.m96136J3();
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo73674a((C41238w) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.loanoffers.presentation.activity.SecuredLoanActivity$c0 */
    static final class C32520c0 extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ SecuredLoanActivity f80153d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C32520c0(SecuredLoanActivity securedLoanActivity) {
            super(1);
            this.f80153d = securedLoanActivity;
        }

        /* renamed from: a */
        public final void mo73675a(C41238w wVar) {
            C41536l.m120489i(wVar, "it");
            this.f80153d.m96168o3().f77469x.setLoading(false);
            View view = this.f80153d.m96168o3().f77452g;
            C41536l.m120488h(view, "binding.loadingOverlay");
            C32343x.m95455i0(view);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo73675a((C41238w) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.loanoffers.presentation.activity.SecuredLoanActivity$d */
    /* synthetic */ class C32521d extends C41535k implements C43075l {
        C32521d(Object obj) {
            super(1, obj, SecuredLoanActivity.class, "onLoanPurposesResult", "onLoanPurposesResult(Lge/bog/mobilebank/shared/requestedresult/RequestedResult;)V", 0);
        }

        /* renamed from: b */
        public final void mo73676b(C31128a aVar) {
            C41536l.m120489i(aVar, "p0");
            ((SecuredLoanActivity) this.receiver).m96177y3(aVar);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo73676b((C31128a) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.loanoffers.presentation.activity.SecuredLoanActivity$d0 */
    static final class C32522d0 extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ SecuredLoanActivity f80154d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C32522d0(SecuredLoanActivity securedLoanActivity) {
            super(1);
            this.f80154d = securedLoanActivity;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Throwable) obj);
            return C41238w.f97225a;
        }

        public final void invoke(Throwable th) {
            C41536l.m120489i(th, "it");
            this.f80154d.m96168o3().f77469x.setLoading(false);
            View view = this.f80154d.m96168o3().f77452g;
            C41536l.m120488h(view, "binding.loadingOverlay");
            C32343x.m95455i0(view);
            this.f80154d.mo74709H1(th);
        }
    }

    /* renamed from: ge.bog.mobilebank.loanoffers.presentation.activity.SecuredLoanActivity$e */
    /* synthetic */ class C32523e extends C41535k implements C43075l {
        C32523e(Object obj) {
            super(1, obj, SecuredLoanActivity.class, "onOfferInfoResult", "onOfferInfoResult(Lge/bog/mobilebank/shared/requestedresult/RequestedResult;)V", 0);
        }

        /* renamed from: b */
        public final void mo73678b(C31128a aVar) {
            C41536l.m120489i(aVar, "p0");
            ((SecuredLoanActivity) this.receiver).m96122B3(aVar);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo73678b((C31128a) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.loanoffers.presentation.activity.SecuredLoanActivity$e0 */
    static final class C32524e0 extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ SecuredLoanActivity f80155d;

        /* renamed from: ge.bog.mobilebank.loanoffers.presentation.activity.SecuredLoanActivity$e0$a */
        /* synthetic */ class C32525a implements C36180b.C36181a, C41532h {

            /* renamed from: a */
            final /* synthetic */ C36935c f80156a;

            C32525a(C36935c cVar) {
                this.f80156a = cVar;
            }

            /* renamed from: a */
            public final void mo73680a(C36783a aVar, boolean z) {
                C41536l.m120489i(aVar, "p0");
                this.f80156a.mo89876i5(aVar, z);
            }

            public final boolean equals(Object obj) {
                if (!(obj instanceof C36180b.C36181a) || !(obj instanceof C41532h)) {
                    return false;
                }
                return C41536l.m120484d(getFunctionDelegate(), ((C41532h) obj).getFunctionDelegate());
            }

            public final C41212c getFunctionDelegate() {
                return new C41535k(2, this.f80156a, C36935c.class, "checkOtherProperty", "checkOtherProperty(Lge/bog/mobilebank/loanoffers/presentation/model/securedloan/LoanPropertyListItem;Z)V", 0);
            }

            public final int hashCode() {
                return getFunctionDelegate().hashCode();
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C32524e0(SecuredLoanActivity securedLoanActivity) {
            super(0);
            this.f80155d = securedLoanActivity;
        }

        /* renamed from: b */
        public final C36180b invoke() {
            return new C36180b(new C32525a(this.f80155d.m96171s3().mo89906Cw()));
        }
    }

    /* renamed from: ge.bog.mobilebank.loanoffers.presentation.activity.SecuredLoanActivity$f */
    /* synthetic */ class C32526f extends C41535k implements C43075l {
        C32526f(Object obj) {
            super(1, obj, Button.class, "setEnabled", "setEnabled(Z)V", 0);
        }

        /* renamed from: b */
        public final void mo73683b(boolean z) {
            ((Button) this.receiver).setEnabled(z);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo73683b(((Boolean) obj).booleanValue());
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.loanoffers.presentation.activity.SecuredLoanActivity$f0 */
    static final class C32527f0 implements C1645y, C41532h {

        /* renamed from: a */
        private final /* synthetic */ C43075l f80157a;

        C32527f0(C43075l lVar) {
            C41536l.m120489i(lVar, "function");
            this.f80157a = lVar;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof C1645y) || !(obj instanceof C41532h)) {
                return false;
            }
            return C41536l.m120484d(getFunctionDelegate(), ((C41532h) obj).getFunctionDelegate());
        }

        public final C41212c getFunctionDelegate() {
            return this.f80157a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        public final /* synthetic */ void onChanged(Object obj) {
            this.f80157a.invoke(obj);
        }
    }

    /* renamed from: ge.bog.mobilebank.loanoffers.presentation.activity.SecuredLoanActivity$g */
    /* synthetic */ class C32528g extends C41535k implements C43075l {
        C32528g(Object obj) {
            super(1, obj, SecuredLoanActivity.class, "onMyRealEstateResult", "onMyRealEstateResult(Lge/bog/mobilebank/shared/requestedresult/RequestedResult;)V", 0);
        }

        /* renamed from: b */
        public final void mo73686b(C31128a aVar) {
            C41536l.m120489i(aVar, "p0");
            ((SecuredLoanActivity) this.receiver).m96178z3(aVar);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo73686b((C31128a) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.loanoffers.presentation.activity.SecuredLoanActivity$g0 */
    public static final class C32529g0 extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ ComponentActivity f80158d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C32529g0(ComponentActivity componentActivity) {
            super(0);
            this.f80158d = componentActivity;
        }

        public final C1636t0 invoke() {
            C1636t0 viewModelStore = this.f80158d.getViewModelStore();
            C41536l.m120488h(viewModelStore, "viewModelStore");
            return viewModelStore;
        }
    }

    /* renamed from: ge.bog.mobilebank.loanoffers.presentation.activity.SecuredLoanActivity$h */
    /* synthetic */ class C32530h extends C41535k implements C43075l {
        C32530h(Object obj) {
            super(1, obj, SecuredLoanActivity.class, "onInputUpdate", "onInputUpdate(Lge/bog/mobilebank/loanoffers/presentation/viewmodel/SecuredLoanViewModel$SecuredLoanInput;)V", 0);
        }

        /* renamed from: b */
        public final void mo73687b(C36940g gVar) {
            C41536l.m120489i(gVar, "p0");
            ((SecuredLoanActivity) this.receiver).m96176x3(gVar);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo73687b((C36940g) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.loanoffers.presentation.activity.SecuredLoanActivity$h0 */
    public static final class C32531h0 extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C43064a f80159d;

        /* renamed from: e */
        final /* synthetic */ ComponentActivity f80160e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C32531h0(C43064a aVar, ComponentActivity componentActivity) {
            super(0);
            this.f80159d = aVar;
            this.f80160e = componentActivity;
        }

        public final C7047a invoke() {
            C7047a aVar;
            C43064a aVar2 = this.f80159d;
            if (aVar2 != null && (aVar = (C7047a) aVar2.invoke()) != null) {
                return aVar;
            }
            C7047a defaultViewModelCreationExtras = this.f80160e.getDefaultViewModelCreationExtras();
            C41536l.m120488h(defaultViewModelCreationExtras, "this.defaultViewModelCreationExtras");
            return defaultViewModelCreationExtras;
        }
    }

    /* renamed from: ge.bog.mobilebank.loanoffers.presentation.activity.SecuredLoanActivity$i */
    /* synthetic */ class C32532i extends C41535k implements C43075l {
        C32532i(Object obj) {
            super(1, obj, SecuredLoanActivity.class, "onCadastralCodeResult", "onCadastralCodeResult(Lge/bog/mobilebank/shared/requestedresult/RequestedResult;)V", 0);
        }

        /* renamed from: b */
        public final void mo73688b(C31128a aVar) {
            C41536l.m120489i(aVar, "p0");
            ((SecuredLoanActivity) this.receiver).m96174v3(aVar);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo73688b((C31128a) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.loanoffers.presentation.activity.SecuredLoanActivity$i0 */
    static final class C32533i0 extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ SecuredLoanActivity f80161d;

        /* renamed from: ge.bog.mobilebank.loanoffers.presentation.activity.SecuredLoanActivity$i0$a */
        static final class C32534a extends C41537m implements C43064a {

            /* renamed from: d */
            final /* synthetic */ SecuredLoanActivity f80162d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C32534a(SecuredLoanActivity securedLoanActivity) {
                super(0);
                this.f80162d = securedLoanActivity;
            }

            /* renamed from: b */
            public final C36946m invoke() {
                OfferData offerData = (OfferData) this.f80162d.getIntent().getParcelableExtra("PARAM_OFFER_ID");
                if (offerData == null) {
                    offerData = new OfferData("", "");
                }
                return this.f80162d.mo73658p3().mo32573a(offerData.mo73660b(), offerData.mo73659a());
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C32533i0(SecuredLoanActivity securedLoanActivity) {
            super(0);
            this.f80161d = securedLoanActivity;
        }

        public final C1620q0.C1624b invoke() {
            return C37588a0.f90326a.mo90779a(new C32534a(this.f80161d));
        }
    }

    /* renamed from: ge.bog.mobilebank.loanoffers.presentation.activity.SecuredLoanActivity$j */
    static final class C32535j extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ SecuredLoanActivity f80163d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C32535j(SecuredLoanActivity securedLoanActivity) {
            super(1);
            this.f80163d = securedLoanActivity;
        }

        /* renamed from: a */
        public final void mo73690a(PropertyInfoTextData propertyInfoTextData) {
            C41536l.m120489i(propertyInfoTextData, "it");
            C36055e.f87177J.mo88778a(propertyInfoTextData).mo4576A1(this.f80163d.getSupportFragmentManager(), (String) null);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo73690a((PropertyInfoTextData) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.loanoffers.presentation.activity.SecuredLoanActivity$k */
    static final class C32536k extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ SecuredLoanActivity f80164d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C32536k(SecuredLoanActivity securedLoanActivity) {
            super(1);
            this.f80164d = securedLoanActivity;
        }

        /* renamed from: a */
        public final void mo73691a(C41238w wVar) {
            C41536l.m120489i(wVar, "it");
            C36051c.f87173I.mo88775a().mo4576A1(this.f80164d.getSupportFragmentManager(), "ADD_PROPERTY_ACTION_SHEET");
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo73691a((C41238w) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.loanoffers.presentation.activity.SecuredLoanActivity$l */
    static final class C32537l extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ SecuredLoanActivity f80165d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C32537l(SecuredLoanActivity securedLoanActivity) {
            super(1);
            this.f80165d = securedLoanActivity;
        }

        /* renamed from: a */
        public final void mo73692a(C41238w wVar) {
            C41536l.m120489i(wVar, "it");
            this.f80165d.m96130G3();
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo73692a((C41238w) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.loanoffers.presentation.activity.SecuredLoanActivity$m */
    static final class C32538m extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ SecuredLoanActivity f80166d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C32538m(SecuredLoanActivity securedLoanActivity) {
            super(0);
            this.f80166d = securedLoanActivity;
        }

        /* renamed from: b */
        public final C31178d invoke() {
            return C31178d.m92718d(this.f80166d.getLayoutInflater());
        }
    }

    /* renamed from: ge.bog.mobilebank.loanoffers.presentation.activity.SecuredLoanActivity$n */
    static final class C32539n extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ SecuredLoanActivity f80167d;

        /* renamed from: ge.bog.mobilebank.loanoffers.presentation.activity.SecuredLoanActivity$n$a */
        /* synthetic */ class C32540a implements C36180b.C36181a, C41532h {

            /* renamed from: a */
            final /* synthetic */ C36935c f80168a;

            C32540a(C36935c cVar) {
                this.f80168a = cVar;
            }

            /* renamed from: a */
            public final void mo73680a(C36783a aVar, boolean z) {
                C41536l.m120489i(aVar, "p0");
                this.f80168a.mo89874O6(aVar, z);
            }

            public final boolean equals(Object obj) {
                if (!(obj instanceof C36180b.C36181a) || !(obj instanceof C41532h)) {
                    return false;
                }
                return C41536l.m120484d(getFunctionDelegate(), ((C41532h) obj).getFunctionDelegate());
            }

            public final C41212c getFunctionDelegate() {
                return new C41535k(2, this.f80168a, C36935c.class, "checkOwnProperty", "checkOwnProperty(Lge/bog/mobilebank/loanoffers/presentation/model/securedloan/LoanPropertyListItem;Z)V", 0);
            }

            public final int hashCode() {
                return getFunctionDelegate().hashCode();
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C32539n(SecuredLoanActivity securedLoanActivity) {
            super(0);
            this.f80167d = securedLoanActivity;
        }

        /* renamed from: b */
        public final C36180b invoke() {
            return new C36180b(new C32540a(this.f80167d.m96171s3().mo89906Cw()));
        }
    }

    /* renamed from: ge.bog.mobilebank.loanoffers.presentation.activity.SecuredLoanActivity$o */
    static final class C32541o extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C43075l f80169d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C32541o(C43075l lVar) {
            super(1);
            this.f80169d = lVar;
        }

        /* renamed from: a */
        public final void mo73697a(C37223a aVar) {
            Object a = aVar.mo90296a();
            if (a != null) {
                this.f80169d.invoke(a);
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo73697a((C37223a) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.loanoffers.presentation.activity.SecuredLoanActivity$p */
    static final class C32542p extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ SecuredLoanActivity f80170d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C32542p(SecuredLoanActivity securedLoanActivity) {
            super(1);
            this.f80170d = securedLoanActivity;
        }

        /* renamed from: a */
        public final void mo73698a(C36783a aVar) {
            C41536l.m120489i(aVar, "it");
            C36051c T2 = SecuredLoanActivity.m96175w3(this.f80170d);
            if (T2 != null) {
                T2.mo4577k1();
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo73698a((C36783a) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.loanoffers.presentation.activity.SecuredLoanActivity$q */
    static final class C32543q extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ SecuredLoanActivity f80171d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C32543q(SecuredLoanActivity securedLoanActivity) {
            super(1);
            this.f80171d = securedLoanActivity;
        }

        /* renamed from: a */
        public final void mo73699a(C36783a aVar) {
            C36051c T2 = SecuredLoanActivity.m96175w3(this.f80171d);
            if (T2 != null) {
                T2.mo88773k2(true);
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo73699a((C36783a) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.loanoffers.presentation.activity.SecuredLoanActivity$r */
    static final class C32544r extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ SecuredLoanActivity f80172d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C32544r(SecuredLoanActivity securedLoanActivity) {
            super(1);
            this.f80172d = securedLoanActivity;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Throwable) obj);
            return C41238w.f97225a;
        }

        public final void invoke(Throwable th) {
            C41536l.m120489i(th, "it");
            C36051c T2 = SecuredLoanActivity.m96175w3(this.f80172d);
            if (T2 != null) {
                T2.mo88774n2(th);
            }
        }
    }

    /* renamed from: ge.bog.mobilebank.loanoffers.presentation.activity.SecuredLoanActivity$s */
    static final class C32545s extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ SecuredLoanActivity f80173d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C32545s(SecuredLoanActivity securedLoanActivity) {
            super(1);
            this.f80173d = securedLoanActivity;
        }

        /* renamed from: a */
        public final void mo73701a(List list) {
            LayerView layerView = this.f80173d.m96168o3().f77454i;
            C41536l.m120488h(layerView, "binding.loanPurposeContainer");
            C32343x.m95447f1(layerView);
            LoadingView loadingView = this.f80173d.m96168o3().f77456k;
            C41536l.m120488h(loadingView, "binding.loanPurposeLoader");
            C32343x.m95447f1(loadingView);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo73701a((List) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.loanoffers.presentation.activity.SecuredLoanActivity$t */
    static final class C32546t extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ SecuredLoanActivity f80174d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C32546t(SecuredLoanActivity securedLoanActivity) {
            super(1);
            this.f80174d = securedLoanActivity;
        }

        /* renamed from: a */
        public final void mo73702a(List list) {
            C41536l.m120489i(list, "purposes");
            LayerView layerView = this.f80174d.m96168o3().f77454i;
            C41536l.m120488h(layerView, "binding.loanPurposeContainer");
            C32343x.m95447f1(layerView);
            LoadingView loadingView = this.f80174d.m96168o3().f77456k;
            C41536l.m120488h(loadingView, "binding.loanPurposeLoader");
            C32343x.m95455i0(loadingView);
            this.f80174d.m96124D3(list);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo73702a((List) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.loanoffers.presentation.activity.SecuredLoanActivity$u */
    static final class C32547u extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ SecuredLoanActivity f80175d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C32547u(SecuredLoanActivity securedLoanActivity) {
            super(1);
            this.f80175d = securedLoanActivity;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Throwable) obj);
            return C41238w.f97225a;
        }

        public final void invoke(Throwable th) {
            C41536l.m120489i(th, "it");
            this.f80175d.m96172t3(th);
            LayerView layerView = this.f80175d.m96168o3().f77454i;
            C41536l.m120488h(layerView, "binding.loanPurposeContainer");
            C32343x.m95455i0(layerView);
            LoadingView loadingView = this.f80175d.m96168o3().f77456k;
            C41536l.m120488h(loadingView, "binding.loanPurposeLoader");
            C32343x.m95455i0(loadingView);
        }
    }

    /* renamed from: ge.bog.mobilebank.loanoffers.presentation.activity.SecuredLoanActivity$v */
    static final class C32548v extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ SecuredLoanActivity f80176d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C32548v(SecuredLoanActivity securedLoanActivity) {
            super(1);
            this.f80176d = securedLoanActivity;
        }

        /* renamed from: a */
        public final void mo73704a(List list) {
            LoadingView loadingView = this.f80176d.m96168o3().f77461p;
            C41536l.m120488h(loadingView, "binding.myRealEstateLoader");
            C32343x.m95447f1(loadingView);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo73704a((List) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.loanoffers.presentation.activity.SecuredLoanActivity$w */
    static final class C32549w extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ SecuredLoanActivity f80177d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C32549w(SecuredLoanActivity securedLoanActivity) {
            super(1);
            this.f80177d = securedLoanActivity;
        }

        /* renamed from: a */
        public final void mo73705a(List list) {
            C41536l.m120489i(list, "it");
            LoadingView loadingView = this.f80177d.m96168o3().f77461p;
            C41536l.m120488h(loadingView, "binding.myRealEstateLoader");
            C32343x.m95455i0(loadingView);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo73705a((List) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.loanoffers.presentation.activity.SecuredLoanActivity$x */
    static final class C32550x extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ SecuredLoanActivity f80178d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C32550x(SecuredLoanActivity securedLoanActivity) {
            super(1);
            this.f80178d = securedLoanActivity;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Throwable) obj);
            return C41238w.f97225a;
        }

        public final void invoke(Throwable th) {
            C41536l.m120489i(th, "it");
            LoadingView loadingView = this.f80178d.m96168o3().f77461p;
            C41536l.m120488h(loadingView, "binding.myRealEstateLoader");
            C32343x.m95455i0(loadingView);
            Group group = this.f80178d.m96168o3().f77458m;
            C41536l.m120488h(group, "binding.myRealEstateGroup");
            C32343x.m95455i0(group);
            this.f80178d.mo74709H1(th);
        }
    }

    /* renamed from: ge.bog.mobilebank.loanoffers.presentation.activity.SecuredLoanActivity$y */
    static final class C32551y extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ SecuredLoanActivity f80179d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C32551y(SecuredLoanActivity securedLoanActivity) {
            super(1);
            this.f80179d = securedLoanActivity;
        }

        /* renamed from: a */
        public final void mo73707a(OfferInfo offerInfo) {
            this.f80179d.m96168o3().f77469x.setLoading(true);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo73707a((OfferInfo) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.loanoffers.presentation.activity.SecuredLoanActivity$z */
    /* synthetic */ class C32552z extends C41535k implements C43075l {
        C32552z(Object obj) {
            super(1, obj, SecuredLoanActivity.class, "onOfferInfo", "onOfferInfo(Lge/bog/mobilebank/cleanarch/domain/offer/model/OfferInfo;)V", 0);
        }

        /* renamed from: b */
        public final void mo73708b(OfferInfo offerInfo) {
            C41536l.m120489i(offerInfo, "p0");
            ((SecuredLoanActivity) this.receiver).m96121A3(offerInfo);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo73708b((OfferInfo) obj);
            return C41238w.f97225a;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: A3 */
    public final void m96121A3(OfferInfo offerInfo) {
        String str;
        String str2;
        boolean d = C41536l.m120484d(offerInfo.getProductCode(), OfferProductCode.C21019ML.f56477f);
        if (d) {
            str = "loan.page.header.ipo";
        } else {
            str = "loan.page.header.SL";
        }
        mo86429X1(C32343x.m95388F(str, new Object[0]));
        EmptyWidget emptyWidget = m96168o3().f77463r;
        if (d) {
            str2 = "loan.page.real.estate.block.title";
        } else {
            str2 = "loan.page.real.estate.block.title.SL";
        }
        emptyWidget.setTitle(C32343x.m95388F(str2, new Object[0]));
    }

    /* access modifiers changed from: private */
    /* renamed from: B3 */
    public final void m96122B3(C31128a aVar) {
        C31132b.m92646h(aVar, (int[]) null, new C32551y(this), 1, (Object) null);
        C31132b.m92648j(aVar, (int[]) null, new C32552z(this), 1, (Object) null);
        C31132b.m92643e(aVar, (int[]) null, new C32516a0(this), 1, (Object) null);
    }

    /* access modifiers changed from: private */
    /* renamed from: C3 */
    public final void m96123C3(C31128a aVar) {
        C31132b.m92646h(aVar, (int[]) null, new C32518b0(this), 1, (Object) null);
        C31132b.m92648j(aVar, (int[]) null, new C32520c0(this), 1, (Object) null);
        C31132b.m92643e(aVar, (int[]) null, new C32522d0(this), 1, (Object) null);
    }

    /* access modifiers changed from: private */
    /* renamed from: D3 */
    public final void m96124D3(List list) {
        m96168o3().f77453h.mo35190t();
        ArrayList<Chip> arrayList = new ArrayList<>(C41343r.m119925u(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C36786b bVar = (C36786b) it.next();
            Chip chip = new Chip(this, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
            chip.setChipTitle(C32343x.m95388F(bVar.mo89674a(), new Object[0]));
            chip.setChipType(C18167d.SELECT_CHIP);
            chip.setTag(bVar.mo89675b());
            arrayList.add(chip);
        }
        for (Chip o : arrayList) {
            m96168o3().f77453h.mo35183o(o);
        }
    }

    /* renamed from: E3 */
    private final void m96126E3() {
        m96168o3().f77455j.setTitle(C32343x.m95388F("loan.page.purpose", new Object[0]));
        m96168o3().f77468w.setTitle(C32343x.m95388F("loan.page.real.estate.collateral", new Object[0]));
        m96168o3().f77467v.setText(C32343x.m95388F("loan.page.real.estate.collateral.desc", new Object[0]));
        m96168o3().f77459n.setTitle(C32343x.m95388F("loan.page.real.estate.my.properties", new Object[0]));
        m96168o3().f77450e.setButtonText(C32343x.m95388F("loan.page.button.add.real.estate", new Object[0]));
        m96168o3().f77469x.setButtonText(C32343x.m95388F("loan.page.button.send", new Object[0]));
        m96168o3().f77462q.setAdapter(m96169q3());
        m96168o3().f77465t.setAdapter(m96170r3());
    }

    /* renamed from: F3 */
    private final void m96128F3(List list) {
        Group group = m96168o3().f77458m;
        C41536l.m120488h(group, "binding.myRealEstateGroup");
        C32343x.m95483r1(group, !list.isEmpty(), false, 2, (Object) null);
        m96169q3().mo6029i(list);
    }

    /* access modifiers changed from: private */
    /* renamed from: G3 */
    public final void m96130G3() {
        C13310d dVar = new C13310d();
        dVar.mo35647a2(C13310d.C13312b.TITLE_TWO_BUTTON);
        dVar.mo35648c2(C32343x.m95388F("loan.page.no.cadastral.code.popup.header", new Object[0]));
        dVar.mo35639Q1(C32343x.m95388F("loan.page.no.cadastral.code.popup.message", new Object[0]));
        dVar.mo35646Z1(C32343x.m95388F("loan.page.no.cadastral.code.popup.button.next", new Object[0]));
        dVar.mo35642U1(C32343x.m95388F("loan.page.no.cadastral.code.popup.button.back", new Object[0]));
        dVar.mo35645Y1(new C32555b(this, dVar));
        dVar.mo35641T1(new C32557d(dVar));
        dVar.mo4576A1(getSupportFragmentManager(), (String) null);
    }

    /* access modifiers changed from: private */
    /* renamed from: H3 */
    public static final void m96132H3(SecuredLoanActivity securedLoanActivity, C13310d dVar, Button button) {
        C41536l.m120489i(securedLoanActivity, "this$0");
        C41536l.m120489i(dVar, "$this_with");
        C41536l.m120489i(button, "it");
        securedLoanActivity.m96171s3().mo89906Cw().mo89873Es(true);
        dVar.mo4577k1();
    }

    /* access modifiers changed from: private */
    /* renamed from: I3 */
    public static final void m96134I3(C13310d dVar, Button button) {
        C41536l.m120489i(dVar, "$this_with");
        C41536l.m120489i(button, "it");
        dVar.mo4577k1();
    }

    /* access modifiers changed from: private */
    /* renamed from: J3 */
    public final void m96136J3() {
        C36059g.f87182J.mo88781a(new PropertyInfoTextData("loan.success.screen.title", "loan.success.message", "loan.success.screen.button")).mo4576A1(getSupportFragmentManager(), (String) null);
    }

    /* renamed from: d3 */
    private final void m96156d3() {
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        supportFragmentManager.mo4367F1("REQUEST_KEY_ADD_REAL_ESTATE", this, new C32564k(this));
        supportFragmentManager.mo4367F1("REQUEST_KEY_CHECK_CADASTRAL_CODE", this, new C32565l(this));
        supportFragmentManager.mo4367F1("REQUEST_KEY_SECURED_LOAN_SUCCESS", this, new C32556c(this));
    }

    /* access modifiers changed from: private */
    /* renamed from: e3 */
    public static final void m96157e3(SecuredLoanActivity securedLoanActivity, String str, Bundle bundle) {
        C41536l.m120489i(securedLoanActivity, "this$0");
        C41536l.m120489i(str, "<anonymous parameter 0>");
        C41536l.m120489i(bundle, "bundle");
        if (bundle.getBoolean("RESULT_KEY_ADD_REAL_ESTATE", false)) {
            securedLoanActivity.m96171s3().mo89906Cw().mo89877lg();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: f3 */
    public static final void m96158f3(SecuredLoanActivity securedLoanActivity, String str, Bundle bundle) {
        C41536l.m120489i(securedLoanActivity, "this$0");
        C41536l.m120489i(str, "<anonymous parameter 0>");
        C41536l.m120489i(bundle, "bundle");
        C36935c Cw = securedLoanActivity.m96171s3().mo89906Cw();
        String string = bundle.getString("RESULT_KEY_CADASTRAL_CODE", "");
        C41536l.m120488h(string, "bundle.getString(\n      … \"\"\n                    )");
        Cw.mo89878zp(string);
    }

    /* access modifiers changed from: private */
    /* renamed from: g3 */
    public static final void m96159g3(SecuredLoanActivity securedLoanActivity, String str, Bundle bundle) {
        C41536l.m120489i(securedLoanActivity, "this$0");
        C41536l.m120489i(str, "<anonymous parameter 0>");
        C41536l.m120489i(bundle, "bundle");
        if (bundle.getBoolean("RESULT_KEY_SECURED_LOAN_SUCCESS", false)) {
            securedLoanActivity.finish();
        }
    }

    /* renamed from: h3 */
    private final void m96160h3() {
        m96168o3().f77466u.setOnClickListener(new C32558e(this));
        m96168o3().f77453h.setOnChipActivatedChangedListener(new C32559f(this));
        m96168o3().f77464s.setOnClickListener(new C32560g(this));
        m96168o3().f77460o.setOnClickListener(new C32561h(this));
        m96168o3().f77450e.setOnClickListener(new C32562i(this));
        m96168o3().f77469x.setOnClickListener(new C32563j(this));
    }

    /* access modifiers changed from: private */
    /* renamed from: i3 */
    public static final void m96161i3(SecuredLoanActivity securedLoanActivity, View view) {
        C41536l.m120489i(securedLoanActivity, "this$0");
        FrameLayout frameLayout = securedLoanActivity.m96168o3().f77470y;
        C41536l.m120488h(frameLayout, "binding.statusContainer");
        C32343x.m95455i0(frameLayout);
        C21481a.onRefresh$default(securedLoanActivity.m96171s3(), 0, 1, (Object) null);
    }

    /* access modifiers changed from: private */
    /* renamed from: j3 */
    public static final void m96162j3(SecuredLoanActivity securedLoanActivity, Chip chip, int i) {
        C41536l.m120489i(securedLoanActivity, "this$0");
        C41536l.m120489i(chip, "chip");
        if (chip.isActivated()) {
            securedLoanActivity.m96171s3().mo89906Cw().mo89875Vj(chip.getTag().toString());
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: k3 */
    public static final void m96163k3(SecuredLoanActivity securedLoanActivity, View view) {
        C41536l.m120489i(securedLoanActivity, "this$0");
        securedLoanActivity.m96171s3().mo89906Cw().mo89872Cg(C36937d.OTHER_REAL_ESTATE);
    }

    /* renamed from: l1 */
    private final void m96164l1() {
        C36939f Fw = m96171s3().mo89907Fw();
        Fw.mo89895td().mo4819k(this, new C32527f0(new C32521d(this)));
        Fw.mo89885Eh().mo4819k(this, new C32527f0(new C32523e(this)));
        LiveData o9 = Fw.mo89894o9();
        Button button = m96168o3().f77469x;
        C41536l.m120488h(button, "binding.sendButton");
        o9.mo4819k(this, new C32527f0(new C32526f(button)));
        Fw.mo89891em().mo4819k(this, new C32527f0(new C32528g(this)));
        Fw.mo89888Yb().mo4819k(this, new C32527f0(new C32530h(this)));
        Fw.mo89892gl().mo4819k(this, new C32527f0(new C32532i(this)));
        m96173u3(Fw.mo89887O7(), new C32535j(this));
        m96173u3(Fw.mo89889ag(), new C32536k(this));
        m96173u3(Fw.mo89893ic(), new C32537l(this));
        Fw.mo89890cb().mo4819k(this, new C32527f0(new C32517b(this)));
        m96173u3(Fw.mo89886Gs(), new C32519c(this));
    }

    /* access modifiers changed from: private */
    /* renamed from: l3 */
    public static final void m96165l3(SecuredLoanActivity securedLoanActivity, View view) {
        C41536l.m120489i(securedLoanActivity, "this$0");
        securedLoanActivity.m96171s3().mo89906Cw().mo89872Cg(C36937d.MY_REAL_ESTATE);
    }

    /* access modifiers changed from: private */
    /* renamed from: m3 */
    public static final void m96166m3(SecuredLoanActivity securedLoanActivity, View view) {
        C41536l.m120489i(securedLoanActivity, "this$0");
        securedLoanActivity.m96171s3().mo89906Cw().mo89877lg();
    }

    /* access modifiers changed from: private */
    /* renamed from: n3 */
    public static final void m96167n3(SecuredLoanActivity securedLoanActivity, View view) {
        C41536l.m120489i(securedLoanActivity, "this$0");
        C36935c.C36936a.m109377a(securedLoanActivity.m96171s3().mo89906Cw(), false, 1, (Object) null);
    }

    /* access modifiers changed from: private */
    /* renamed from: o3 */
    public final C31178d m96168o3() {
        return (C31178d) this.f80145H.getValue();
    }

    /* renamed from: q3 */
    private final C36180b m96169q3() {
        return (C36180b) this.f80147J.getValue();
    }

    /* renamed from: r3 */
    private final C36180b m96170r3() {
        return (C36180b) this.f80148K.getValue();
    }

    /* access modifiers changed from: private */
    /* renamed from: s3 */
    public final C36946m m96171s3() {
        return (C36946m) this.f80146I.getValue();
    }

    /* access modifiers changed from: private */
    /* renamed from: t3 */
    public final void m96172t3(Throwable th) {
        mo74709H1(th);
        FrameLayout frameLayout = m96168o3().f77470y;
        C41536l.m120488h(frameLayout, "binding.statusContainer");
        C32343x.m95447f1(frameLayout);
    }

    /* renamed from: u3 */
    private final void m96173u3(LiveData liveData, C43075l lVar) {
        liveData.mo4819k(this, new C32527f0(new C32541o(lVar)));
    }

    /* access modifiers changed from: private */
    /* renamed from: v3 */
    public final void m96174v3(C31128a aVar) {
        C31132b.m92648j(aVar, (int[]) null, new C32542p(this), 1, (Object) null);
        C31132b.m92646h(aVar, (int[]) null, new C32543q(this), 1, (Object) null);
        C31132b.m92643e(aVar, (int[]) null, new C32544r(this), 1, (Object) null);
    }

    /* access modifiers changed from: private */
    /* renamed from: w3 */
    public static final C36051c m96175w3(SecuredLoanActivity securedLoanActivity) {
        Fragment k0 = securedLoanActivity.getSupportFragmentManager().mo4418k0("ADD_PROPERTY_ACTION_SHEET");
        if (k0 instanceof C36051c) {
            return (C36051c) k0;
        }
        return null;
    }

    /* access modifiers changed from: private */
    /* renamed from: x3 */
    public final void m96176x3(C36940g gVar) {
        if (gVar.mo89899e() != -1) {
            m96168o3().f77453h.mo35182m(gVar.mo89899e(), false);
        }
        m96128F3(gVar.mo89897c());
        m96170r3().mo6029i(gVar.mo89898d());
    }

    /* access modifiers changed from: private */
    /* renamed from: y3 */
    public final void m96177y3(C31128a aVar) {
        C31132b.m92646h(aVar, (int[]) null, new C32545s(this), 1, (Object) null);
        C31132b.m92648j(aVar, (int[]) null, new C32546t(this), 1, (Object) null);
        C31132b.m92643e(aVar, (int[]) null, new C32547u(this), 1, (Object) null);
    }

    /* access modifiers changed from: private */
    /* renamed from: z3 */
    public final void m96178z3(C31128a aVar) {
        C31132b.m92646h(aVar, (int[]) null, new C32548v(this), 1, (Object) null);
        C31132b.m92648j(aVar, (int[]) null, new C32549w(this), 1, (Object) null);
        C31132b.m92643e(aVar, (int[]) null, new C32550x(this), 1, (Object) null);
    }

    /* access modifiers changed from: protected */
    /* renamed from: O1 */
    public void mo37451O1(Bundle bundle) {
        setContentView((View) m96168o3().mo3946b());
        super.mo37451O1(bundle);
        m96126E3();
        m96164l1();
        m96160h3();
        m96156d3();
    }

    /* renamed from: p3 */
    public final C36934b mo73658p3() {
        C36934b bVar = this.f80144G;
        if (bVar != null) {
            return bVar;
        }
        C41536l.m120506z("factory");
        return null;
    }
}
