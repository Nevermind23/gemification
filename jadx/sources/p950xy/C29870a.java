package p950xy;

import java.util.List;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p341ge.bog.mobilebank.cleanarch.loyaltyprograms.presentation.model.BonusAmexUiModel;
import p341ge.bog.mobilebank.cleanarch.loyaltyprograms.presentation.model.BonusCashBackUiModel;
import p341ge.bog.mobilebank.cleanarch.loyaltyprograms.presentation.model.BonusPlusUiModel;

/* renamed from: xy.a */
public abstract class C29870a {

    /* renamed from: xy.a$a */
    public static final class C29871a extends C29870a {

        /* renamed from: a */
        private final BonusAmexUiModel f75578a;

        /* renamed from: b */
        private final boolean f75579b;

        /* renamed from: c */
        private final C29876c f75580c;

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ C29871a(BonusAmexUiModel bonusAmexUiModel, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(bonusAmexUiModel, (i & 2) != 0 ? false : z);
        }

        /* renamed from: a */
        public boolean mo70124a() {
            return this.f75579b;
        }

        /* renamed from: b */
        public final BonusAmexUiModel mo70125b() {
            return this.f75578a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C29871a)) {
                return false;
            }
            C29871a aVar = (C29871a) obj;
            return C41536l.m120484d(this.f75578a, aVar.f75578a) && this.f75579b == aVar.f75579b;
        }

        public int hashCode() {
            BonusAmexUiModel bonusAmexUiModel = this.f75578a;
            int hashCode = (bonusAmexUiModel == null ? 0 : bonusAmexUiModel.hashCode()) * 31;
            boolean z = this.f75579b;
            if (z) {
                z = true;
            }
            return hashCode + (z ? 1 : 0);
        }

        public String toString() {
            BonusAmexUiModel bonusAmexUiModel = this.f75578a;
            boolean z = this.f75579b;
            return "AmexBonusItem(amex=" + bonusAmexUiModel + ", isLoading=" + z + ")";
        }

        public C29871a(BonusAmexUiModel bonusAmexUiModel, boolean z) {
            super((DefaultConstructorMarker) null);
            this.f75578a = bonusAmexUiModel;
            this.f75579b = z;
            this.f75580c = C29876c.BONUS_AMEX;
        }
    }

    /* renamed from: xy.a$b */
    public static final class C29872b extends C29870a {

        /* renamed from: a */
        private final BonusCashBackUiModel f75581a;

        /* renamed from: b */
        private final boolean f75582b;

        /* renamed from: c */
        private final C29876c f75583c;

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ C29872b(BonusCashBackUiModel bonusCashBackUiModel, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(bonusCashBackUiModel, (i & 2) != 0 ? false : z);
        }

        /* renamed from: a */
        public boolean mo70124a() {
            return this.f75582b;
        }

        /* renamed from: b */
        public final BonusCashBackUiModel mo70129b() {
            return this.f75581a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C29872b)) {
                return false;
            }
            C29872b bVar = (C29872b) obj;
            return C41536l.m120484d(this.f75581a, bVar.f75581a) && this.f75582b == bVar.f75582b;
        }

        public int hashCode() {
            BonusCashBackUiModel bonusCashBackUiModel = this.f75581a;
            int hashCode = (bonusCashBackUiModel == null ? 0 : bonusCashBackUiModel.hashCode()) * 31;
            boolean z = this.f75582b;
            if (z) {
                z = true;
            }
            return hashCode + (z ? 1 : 0);
        }

        public String toString() {
            BonusCashBackUiModel bonusCashBackUiModel = this.f75581a;
            boolean z = this.f75582b;
            return "CashBackBonusItem(cashBack=" + bonusCashBackUiModel + ", isLoading=" + z + ")";
        }

        public C29872b(BonusCashBackUiModel bonusCashBackUiModel, boolean z) {
            super((DefaultConstructorMarker) null);
            this.f75581a = bonusCashBackUiModel;
            this.f75582b = z;
            this.f75583c = C29876c.BONUS_CASH_BACK;
        }
    }

    /* renamed from: xy.a$c */
    public static final class C29873c extends C29870a {

        /* renamed from: a */
        private final BonusPlusUiModel f75584a;

        /* renamed from: b */
        private final boolean f75585b;

        /* renamed from: c */
        private final C29876c f75586c;

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ C29873c(BonusPlusUiModel bonusPlusUiModel, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(bonusPlusUiModel, (i & 2) != 0 ? false : z);
        }

        /* renamed from: a */
        public boolean mo70124a() {
            return this.f75585b;
        }

        /* renamed from: b */
        public final BonusPlusUiModel mo70133b() {
            return this.f75584a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C29873c)) {
                return false;
            }
            C29873c cVar = (C29873c) obj;
            return C41536l.m120484d(this.f75584a, cVar.f75584a) && this.f75585b == cVar.f75585b;
        }

        public int hashCode() {
            BonusPlusUiModel bonusPlusUiModel = this.f75584a;
            int hashCode = (bonusPlusUiModel == null ? 0 : bonusPlusUiModel.hashCode()) * 31;
            boolean z = this.f75585b;
            if (z) {
                z = true;
            }
            return hashCode + (z ? 1 : 0);
        }

        public String toString() {
            BonusPlusUiModel bonusPlusUiModel = this.f75584a;
            boolean z = this.f75585b;
            return "PlusBonusItem(plus=" + bonusPlusUiModel + ", isLoading=" + z + ")";
        }

        public C29873c(BonusPlusUiModel bonusPlusUiModel, boolean z) {
            super((DefaultConstructorMarker) null);
            this.f75584a = bonusPlusUiModel;
            this.f75585b = z;
            this.f75586c = C29876c.BONUS_PLUS;
        }
    }

    /* renamed from: xy.a$d */
    public static final class C29874d extends C29870a {

        /* renamed from: a */
        private final List f75587a;

        /* renamed from: b */
        private final int f75588b;

        /* renamed from: c */
        private final boolean f75589c;

        /* renamed from: d */
        private final C29876c f75590d;

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ C29874d(List list, int i, boolean z, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this(list, i, (i2 & 4) != 0 ? false : z);
        }

        /* renamed from: a */
        public boolean mo70124a() {
            return this.f75589c;
        }

        /* renamed from: b */
        public final List mo70137b() {
            return this.f75587a;
        }

        /* renamed from: c */
        public final int mo70138c() {
            return this.f75588b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C29874d)) {
                return false;
            }
            C29874d dVar = (C29874d) obj;
            return C41536l.m120484d(this.f75587a, dVar.f75587a) && this.f75588b == dVar.f75588b && this.f75589c == dVar.f75589c;
        }

        public int hashCode() {
            List list = this.f75587a;
            int hashCode = (((list == null ? 0 : list.hashCode()) * 31) + this.f75588b) * 31;
            boolean z = this.f75589c;
            if (z) {
                z = true;
            }
            return hashCode + (z ? 1 : 0);
        }

        public String toString() {
            List list = this.f75587a;
            int i = this.f75588b;
            boolean z = this.f75589c;
            return "ScoolBonusItem(scool=" + list + ", totalPoints=" + i + ", isLoading=" + z + ")";
        }

        public C29874d(List list, int i, boolean z) {
            super((DefaultConstructorMarker) null);
            this.f75587a = list;
            this.f75588b = i;
            this.f75589c = z;
            this.f75590d = C29876c.BONUS_SCOOL;
        }
    }

    private C29870a() {
    }

    public /* synthetic */ C29870a(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* renamed from: a */
    public abstract boolean mo70124a();
}
