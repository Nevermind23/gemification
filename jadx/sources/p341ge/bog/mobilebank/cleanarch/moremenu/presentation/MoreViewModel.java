package p341ge.bog.mobilebank.cleanarch.moremenu.presentation;

import androidx.lifecycle.C1644x;
import androidx.lifecycle.LiveData;
import ed1.C40749p;
import g91.C32343x;
import hd1.C41204a;
import hd1.C41205b;
import he1.C41238w;
import j51.C36738j;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import md0.C26186e;
import p341ge.bog.mobilebank.cleanarch.moremenu.presentation.model.OptionalActionsData;
import p341ge.bog.mobilebank.cleanarch.presentation.common.C21481a;
import p341ge.bog.mobilebank.model.Client;
import p523mm.C16740f;
import p742dy.C20108a;
import p748eu.C20292b;
import p758fu.C20557a;
import ue1.C43075l;
import ue1.C43080q;
import zc0.C30288a;

/* renamed from: ge.bog.mobilebank.cleanarch.moremenu.presentation.MoreViewModel */
public interface MoreViewModel {

    /* renamed from: ge.bog.mobilebank.cleanarch.moremenu.presentation.MoreViewModel$Input */
    public interface Input {
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.moremenu.presentation.MoreViewModel$Output */
    public interface Output {
        LiveData getHasKycLiveData();

        LiveData getUserInfoChangedLiveData();
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.moremenu.presentation.MoreViewModel$ViewModel */
    public static final class ViewModel extends C21481a implements Input, Output {
        private final Client client;
        private final C20292b getAppSettingByNameUseCase;
        private final C16740f getClientCountryInfo;
        private final C30288a getDictionaryPopulatedObservable;
        private final C36738j getUserInfoObservableUseCase;
        private final C1644x hasKycLiveData = new C1644x(Boolean.FALSE);
        private final Input inputs = this;
        private final Output outputs = this;
        private final C1644x userInfoChangedLiveData = new C1644x(new OptionalActionsData(false, 1, (DefaultConstructorMarker) null));

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public ViewModel(C20108a aVar, C20292b bVar, C16740f fVar, C36738j jVar, C30288a aVar2, Client client2) {
            super((C41204a) null, 1, (DefaultConstructorMarker) null);
            C41536l.m120489i(aVar, "checkKycStatusUseCase");
            C41536l.m120489i(bVar, "getAppSettingByNameUseCase");
            C41536l.m120489i(fVar, "getClientCountryInfo");
            C41536l.m120489i(jVar, "getUserInfoObservableUseCase");
            C41536l.m120489i(aVar2, "getDictionaryPopulatedObservable");
            C41536l.m120489i(client2, "client");
            this.getAppSettingByNameUseCase = bVar;
            this.getClientCountryInfo = fVar;
            this.getUserInfoObservableUseCase = jVar;
            this.getDictionaryPopulatedObservable = aVar2;
            this.client = client2;
            C41205b F0 = C32343x.m95413R0(aVar.mo48539a()).mo94981F0(new C21309e0(new C43075l(this) {
                final /* synthetic */ ViewModel this$0;

                {
                    this.this$0 = r1;
                }

                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    invoke((Boolean) obj);
                    return C41238w.f97225a;
                }

                public final void invoke(Boolean bool) {
                    this.this$0.getHasKycLiveData().mo4826r(bool);
                }
            }));
            C41536l.m120488h(F0, "checkKycStatusUseCase().…ue = status\n            }");
            bindToLifecycle(F0);
            C41205b F02 = C40749p.m118046l(jVar.mo89564a().mo94977D0(C41238w.f97225a), checkCard(), aVar2.mo70625a().mo94997P0(new C21311f0(C212952.INSTANCE)).mo94990M(new C21313g0(C212963.INSTANCE)), new C21315h0(C212974.INSTANCE)).mo95026k0(new C21317i0(C212985.INSTANCE)).mo94981F0(new C21319j0(new C43075l(this) {
                final /* synthetic */ ViewModel this$0;

                {
                    this.this$0 = r1;
                }

                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    invoke((OptionalActionsData) obj);
                    return C41238w.f97225a;
                }

                public final void invoke(OptionalActionsData optionalActionsData) {
                    this.this$0.getUserInfoChangedLiveData().mo4823o(optionalActionsData);
                }
            }));
            C41536l.m120488h(F02, "combineLatest(\n         …lue(it)\n                }");
            bindToLifecycle(F02);
        }

        /* access modifiers changed from: private */
        public static final void _init_$lambda$0(C43075l lVar, Object obj) {
            C41536l.m120489i(lVar, "$tmp0");
            lVar.invoke(obj);
        }

        /* access modifiers changed from: private */
        public static final boolean _init_$lambda$1(C43075l lVar, Object obj) {
            C41536l.m120489i(lVar, "$tmp0");
            return ((Boolean) lVar.invoke(obj)).booleanValue();
        }

        /* access modifiers changed from: private */
        public static final boolean _init_$lambda$2(C43075l lVar, Object obj) {
            C41536l.m120489i(lVar, "$tmp0");
            return ((Boolean) lVar.invoke(obj)).booleanValue();
        }

        /* access modifiers changed from: private */
        public static final Boolean _init_$lambda$3(C43080q qVar, Object obj, Object obj2, Object obj3) {
            C41536l.m120489i(qVar, "$tmp0");
            return (Boolean) qVar.invoke(obj, obj2, obj3);
        }

        /* access modifiers changed from: private */
        public static final OptionalActionsData _init_$lambda$4(C43075l lVar, Object obj) {
            C41536l.m120489i(lVar, "$tmp0");
            return (OptionalActionsData) lVar.invoke(obj);
        }

        /* access modifiers changed from: private */
        public static final void _init_$lambda$5(C43075l lVar, Object obj) {
            C41536l.m120489i(lVar, "$tmp0");
            lVar.invoke(obj);
        }

        private final C40749p<Boolean> canActivateCard() {
            C40749p<Boolean> k0 = C26186e.m81987e(this.getClientCountryInfo.mo43869a()).mo95026k0(new C21307d0(MoreViewModel$ViewModel$canActivateCard$1.INSTANCE));
            C41536l.m120488h(k0, "getClientCountryInfo().u…AN_ACTIVATE\n            }");
            return k0;
        }

        /* access modifiers changed from: private */
        public static final Boolean canActivateCard$lambda$7(C43075l lVar, Object obj) {
            C41536l.m120489i(lVar, "$tmp0");
            return (Boolean) lVar.invoke(obj);
        }

        private final C40749p<Boolean> checkCard() {
            if (this.client.isAuthorized()) {
                C40749p<Boolean> t0 = canActivateCard().mo95035t0(new C21305c0(MoreViewModel$ViewModel$checkCard$1.INSTANCE));
                C41536l.m120488h(t0, "canActivateCard().onErrorReturn { false }");
                return t0;
            }
            C40749p<Boolean> h0 = C40749p.m118043h0(Boolean.FALSE);
            C41536l.m120488h(h0, "just(false)");
            return h0;
        }

        /* access modifiers changed from: private */
        public static final Boolean checkCard$lambda$6(C43075l lVar, Object obj) {
            C41536l.m120489i(lVar, "$tmp0");
            return (Boolean) lVar.invoke(obj);
        }

        public final Input getInputs() {
            return this.inputs;
        }

        public final Output getOutputs() {
            return this.outputs;
        }

        public final boolean isTransportPassEnabled() {
            Boolean a;
            C20557a a2 = this.getAppSettingByNameUseCase.mo48774a("TRANSPORT_PASS_IS_ENABLED_ANDROID");
            if (a2 == null || (a = a2.mo49084a()) == null) {
                return false;
            }
            return a.booleanValue();
        }

        public C1644x getHasKycLiveData() {
            return this.hasKycLiveData;
        }

        public C1644x getUserInfoChangedLiveData() {
            return this.userInfoChangedLiveData;
        }
    }
}
