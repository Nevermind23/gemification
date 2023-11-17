package nb0;

import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p341ge.bog.mobilebank.depositapplication.presentation.deposittypes.model.DepositTypeDetailsUiModel;

/* renamed from: nb0.a */
public abstract class C26394a {

    /* renamed from: nb0.a$a */
    public static final class C26395a extends C26394a {

        /* renamed from: a */
        public static final C26395a f66893a = new C26395a();

        private C26395a() {
            super((DefaultConstructorMarker) null);
        }
    }

    /* renamed from: nb0.a$b */
    public static final class C26396b extends C26394a {

        /* renamed from: a */
        private final DepositTypeDetailsUiModel f66894a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C26396b(DepositTypeDetailsUiModel depositTypeDetailsUiModel) {
            super((DefaultConstructorMarker) null);
            C41536l.m120489i(depositTypeDetailsUiModel, "deposit");
            this.f66894a = depositTypeDetailsUiModel;
        }

        /* renamed from: a */
        public final DepositTypeDetailsUiModel mo65633a() {
            return this.f66894a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C26396b) && C41536l.m120484d(this.f66894a, ((C26396b) obj).f66894a);
        }

        public int hashCode() {
            return this.f66894a.hashCode();
        }

        public String toString() {
            DepositTypeDetailsUiModel depositTypeDetailsUiModel = this.f66894a;
            return "ListItem(deposit=" + depositTypeDetailsUiModel + ")";
        }
    }

    private C26394a() {
    }

    public /* synthetic */ C26394a(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
