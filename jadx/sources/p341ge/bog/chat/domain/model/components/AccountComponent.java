package p341ge.bog.chat.domain.model.components;

import androidx.annotation.Keep;
import java.math.BigDecimal;
import kotlin.jvm.internal.C41536l;
import p277ua.C8664c;

@Keep
/* renamed from: ge.bog.chat.domain.model.components.AccountComponent */
public final class AccountComponent {
    @C8664c("available_amount")
    private final BigDecimal availableAmount;
    private final String currency;
    private final String image;
    private final String payload;
    @C8664c("text_color_is_dark")
    private final String textColorIsDark;
    private final String title;

    public AccountComponent(String str, String str2, BigDecimal bigDecimal, String str3, String str4, String str5) {
        this.title = str;
        this.payload = str2;
        this.availableAmount = bigDecimal;
        this.currency = str3;
        this.image = str4;
        this.textColorIsDark = str5;
    }

    public static /* synthetic */ AccountComponent copy$default(AccountComponent accountComponent, String str, String str2, BigDecimal bigDecimal, String str3, String str4, String str5, int i, Object obj) {
        if ((i & 1) != 0) {
            str = accountComponent.title;
        }
        if ((i & 2) != 0) {
            str2 = accountComponent.payload;
        }
        String str6 = str2;
        if ((i & 4) != 0) {
            bigDecimal = accountComponent.availableAmount;
        }
        BigDecimal bigDecimal2 = bigDecimal;
        if ((i & 8) != 0) {
            str3 = accountComponent.currency;
        }
        String str7 = str3;
        if ((i & 16) != 0) {
            str4 = accountComponent.image;
        }
        String str8 = str4;
        if ((i & 32) != 0) {
            str5 = accountComponent.textColorIsDark;
        }
        return accountComponent.copy(str, str6, bigDecimal2, str7, str8, str5);
    }

    public final String component1() {
        return this.title;
    }

    public final String component2() {
        return this.payload;
    }

    public final BigDecimal component3() {
        return this.availableAmount;
    }

    public final String component4() {
        return this.currency;
    }

    public final String component5() {
        return this.image;
    }

    public final String component6() {
        return this.textColorIsDark;
    }

    public final AccountComponent copy(String str, String str2, BigDecimal bigDecimal, String str3, String str4, String str5) {
        return new AccountComponent(str, str2, bigDecimal, str3, str4, str5);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AccountComponent)) {
            return false;
        }
        AccountComponent accountComponent = (AccountComponent) obj;
        return C41536l.m120484d(this.title, accountComponent.title) && C41536l.m120484d(this.payload, accountComponent.payload) && C41536l.m120484d(this.availableAmount, accountComponent.availableAmount) && C41536l.m120484d(this.currency, accountComponent.currency) && C41536l.m120484d(this.image, accountComponent.image) && C41536l.m120484d(this.textColorIsDark, accountComponent.textColorIsDark);
    }

    public final BigDecimal getAvailableAmount() {
        return this.availableAmount;
    }

    public final String getCurrency() {
        return this.currency;
    }

    public final String getImage() {
        return this.image;
    }

    public final String getPayload() {
        return this.payload;
    }

    public final String getTextColorIsDark() {
        return this.textColorIsDark;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        String str = this.title;
        int i = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.payload;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        BigDecimal bigDecimal = this.availableAmount;
        int hashCode3 = (hashCode2 + (bigDecimal == null ? 0 : bigDecimal.hashCode())) * 31;
        String str3 = this.currency;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.image;
        int hashCode5 = (hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.textColorIsDark;
        if (str5 != null) {
            i = str5.hashCode();
        }
        return hashCode5 + i;
    }

    public String toString() {
        String str = this.title;
        String str2 = this.payload;
        BigDecimal bigDecimal = this.availableAmount;
        String str3 = this.currency;
        String str4 = this.image;
        String str5 = this.textColorIsDark;
        return "AccountComponent(title=" + str + ", payload=" + str2 + ", availableAmount=" + bigDecimal + ", currency=" + str3 + ", image=" + str4 + ", textColorIsDark=" + str5 + ")";
    }
}
