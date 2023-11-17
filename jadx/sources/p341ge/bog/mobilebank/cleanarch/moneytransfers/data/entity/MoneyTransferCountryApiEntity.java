package p341ge.bog.mobilebank.cleanarch.moneytransfers.data.entity;

import androidx.annotation.Keep;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Keep
/* renamed from: ge.bog.mobilebank.cleanarch.moneytransfers.data.entity.MoneyTransferCountryApiEntity */
public final class MoneyTransferCountryApiEntity {
    private final String caption;
    private final String code;
    private final Object currencies;
    private final Object deliveryOptions;
    private final Boolean receiveAllowed;
    private final Object states;

    public MoneyTransferCountryApiEntity(String str, String str2, Object obj, Object obj2, Boolean bool, Object obj3) {
        C41536l.m120489i(str, "code");
        C41536l.m120489i(str2, "caption");
        this.code = str;
        this.caption = str2;
        this.deliveryOptions = obj;
        this.currencies = obj2;
        this.receiveAllowed = bool;
        this.states = obj3;
    }

    public static /* synthetic */ MoneyTransferCountryApiEntity copy$default(MoneyTransferCountryApiEntity moneyTransferCountryApiEntity, String str, String str2, Object obj, Object obj2, Boolean bool, Object obj3, int i, Object obj4) {
        if ((i & 1) != 0) {
            str = moneyTransferCountryApiEntity.code;
        }
        if ((i & 2) != 0) {
            str2 = moneyTransferCountryApiEntity.caption;
        }
        String str3 = str2;
        if ((i & 4) != 0) {
            obj = moneyTransferCountryApiEntity.deliveryOptions;
        }
        Object obj5 = obj;
        if ((i & 8) != 0) {
            obj2 = moneyTransferCountryApiEntity.currencies;
        }
        Object obj6 = obj2;
        if ((i & 16) != 0) {
            bool = moneyTransferCountryApiEntity.receiveAllowed;
        }
        Boolean bool2 = bool;
        if ((i & 32) != 0) {
            obj3 = moneyTransferCountryApiEntity.states;
        }
        return moneyTransferCountryApiEntity.copy(str, str3, obj5, obj6, bool2, obj3);
    }

    public final String component1() {
        return this.code;
    }

    public final String component2() {
        return this.caption;
    }

    public final Object component3() {
        return this.deliveryOptions;
    }

    public final Object component4() {
        return this.currencies;
    }

    public final Boolean component5() {
        return this.receiveAllowed;
    }

    public final Object component6() {
        return this.states;
    }

    public final MoneyTransferCountryApiEntity copy(String str, String str2, Object obj, Object obj2, Boolean bool, Object obj3) {
        C41536l.m120489i(str, "code");
        C41536l.m120489i(str2, "caption");
        return new MoneyTransferCountryApiEntity(str, str2, obj, obj2, bool, obj3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MoneyTransferCountryApiEntity)) {
            return false;
        }
        MoneyTransferCountryApiEntity moneyTransferCountryApiEntity = (MoneyTransferCountryApiEntity) obj;
        return C41536l.m120484d(this.code, moneyTransferCountryApiEntity.code) && C41536l.m120484d(this.caption, moneyTransferCountryApiEntity.caption) && C41536l.m120484d(this.deliveryOptions, moneyTransferCountryApiEntity.deliveryOptions) && C41536l.m120484d(this.currencies, moneyTransferCountryApiEntity.currencies) && C41536l.m120484d(this.receiveAllowed, moneyTransferCountryApiEntity.receiveAllowed) && C41536l.m120484d(this.states, moneyTransferCountryApiEntity.states);
    }

    public final String getCaption() {
        return this.caption;
    }

    public final String getCode() {
        return this.code;
    }

    public final Object getCurrencies() {
        return this.currencies;
    }

    public final Object getDeliveryOptions() {
        return this.deliveryOptions;
    }

    public final Boolean getReceiveAllowed() {
        return this.receiveAllowed;
    }

    public final Object getStates() {
        return this.states;
    }

    public int hashCode() {
        int hashCode = ((this.code.hashCode() * 31) + this.caption.hashCode()) * 31;
        Object obj = this.deliveryOptions;
        int i = 0;
        int hashCode2 = (hashCode + (obj == null ? 0 : obj.hashCode())) * 31;
        Object obj2 = this.currencies;
        int hashCode3 = (hashCode2 + (obj2 == null ? 0 : obj2.hashCode())) * 31;
        Boolean bool = this.receiveAllowed;
        int hashCode4 = (hashCode3 + (bool == null ? 0 : bool.hashCode())) * 31;
        Object obj3 = this.states;
        if (obj3 != null) {
            i = obj3.hashCode();
        }
        return hashCode4 + i;
    }

    public String toString() {
        String str = this.code;
        String str2 = this.caption;
        Object obj = this.deliveryOptions;
        Object obj2 = this.currencies;
        Boolean bool = this.receiveAllowed;
        Object obj3 = this.states;
        return "MoneyTransferCountryApiEntity(code=" + str + ", caption=" + str2 + ", deliveryOptions=" + obj + ", currencies=" + obj2 + ", receiveAllowed=" + bool + ", states=" + obj3 + ")";
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ MoneyTransferCountryApiEntity(String str, String str2, Object obj, Object obj2, Boolean bool, Object obj3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, (i & 4) != 0 ? null : obj, (i & 8) != 0 ? null : obj2, (i & 16) != 0 ? null : bool, (i & 32) != 0 ? null : obj3);
    }
}
