package p856oz;

import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p341ge.bog.mobilebank.cleanarch.moneytransfers.presentation.model.MoneyTransferTypeUiModel;
import p341ge.bog.mobilebank.cleanarch.moneytransfers.presentation.model.MoneyTransferWizardData;

/* renamed from: oz.b */
public abstract class C27099b {

    /* renamed from: oz.b$a */
    public static final class C27100a extends C27099b {

        /* renamed from: a */
        public static final C27100a f68065a = new C27100a();

        private C27100a() {
            super((DefaultConstructorMarker) null);
        }
    }

    /* renamed from: oz.b$b */
    public static final class C27101b extends C27099b {

        /* renamed from: a */
        public static final C27101b f68066a = new C27101b();

        private C27101b() {
            super((DefaultConstructorMarker) null);
        }
    }

    /* renamed from: oz.b$c */
    public static final class C27102c extends C27099b {

        /* renamed from: a */
        private final MoneyTransferTypeUiModel f68067a;

        /* renamed from: b */
        private final MoneyTransferWizardData f68068b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C27102c(MoneyTransferTypeUiModel moneyTransferTypeUiModel, MoneyTransferWizardData moneyTransferWizardData) {
            super((DefaultConstructorMarker) null);
            C41536l.m120489i(moneyTransferTypeUiModel, "remittanceType");
            C41536l.m120489i(moneyTransferWizardData, "wizardData");
            this.f68067a = moneyTransferTypeUiModel;
            this.f68068b = moneyTransferWizardData;
        }

        /* renamed from: a */
        public final MoneyTransferTypeUiModel mo66396a() {
            return this.f68067a;
        }

        /* renamed from: b */
        public final MoneyTransferWizardData mo66397b() {
            return this.f68068b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C27102c)) {
                return false;
            }
            C27102c cVar = (C27102c) obj;
            return C41536l.m120484d(this.f68067a, cVar.f68067a) && C41536l.m120484d(this.f68068b, cVar.f68068b);
        }

        public int hashCode() {
            return (this.f68067a.hashCode() * 31) + this.f68068b.hashCode();
        }

        public String toString() {
            MoneyTransferTypeUiModel moneyTransferTypeUiModel = this.f68067a;
            MoneyTransferWizardData moneyTransferWizardData = this.f68068b;
            return "Success(remittanceType=" + moneyTransferTypeUiModel + ", wizardData=" + moneyTransferWizardData + ")";
        }
    }

    private C27099b() {
    }

    public /* synthetic */ C27099b(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
