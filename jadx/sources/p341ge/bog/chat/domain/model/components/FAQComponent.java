package p341ge.bog.chat.domain.model.components;

import androidx.annotation.Keep;
import java.util.List;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p277ua.C8664c;

@Keep
/* renamed from: ge.bog.chat.domain.model.components.FAQComponent */
public final class FAQComponent extends Component {
    @C8664c("button_title")
    private final String buttonTitle;
    @C8664c("faq_data")
    private final List<FAQItem> faqData;
    @C8664c("page_title")
    private final String pageTitle;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FAQComponent(String str, String str2, List<FAQItem> list) {
        super((DefaultConstructorMarker) null);
        C41536l.m120489i(str, "buttonTitle");
        C41536l.m120489i(str2, "pageTitle");
        C41536l.m120489i(list, "faqData");
        this.buttonTitle = str;
        this.pageTitle = str2;
        this.faqData = list;
    }

    public static /* synthetic */ FAQComponent copy$default(FAQComponent fAQComponent, String str, String str2, List<FAQItem> list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = fAQComponent.buttonTitle;
        }
        if ((i & 2) != 0) {
            str2 = fAQComponent.pageTitle;
        }
        if ((i & 4) != 0) {
            list = fAQComponent.faqData;
        }
        return fAQComponent.copy(str, str2, list);
    }

    public final String component1() {
        return this.buttonTitle;
    }

    public final String component2() {
        return this.pageTitle;
    }

    public final List<FAQItem> component3() {
        return this.faqData;
    }

    public final FAQComponent copy(String str, String str2, List<FAQItem> list) {
        C41536l.m120489i(str, "buttonTitle");
        C41536l.m120489i(str2, "pageTitle");
        C41536l.m120489i(list, "faqData");
        return new FAQComponent(str, str2, list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FAQComponent)) {
            return false;
        }
        FAQComponent fAQComponent = (FAQComponent) obj;
        return C41536l.m120484d(this.buttonTitle, fAQComponent.buttonTitle) && C41536l.m120484d(this.pageTitle, fAQComponent.pageTitle) && C41536l.m120484d(this.faqData, fAQComponent.faqData);
    }

    public final String getButtonTitle() {
        return this.buttonTitle;
    }

    public final List<FAQItem> getFaqData() {
        return this.faqData;
    }

    public final String getPageTitle() {
        return this.pageTitle;
    }

    public int hashCode() {
        return (((this.buttonTitle.hashCode() * 31) + this.pageTitle.hashCode()) * 31) + this.faqData.hashCode();
    }

    public String toString() {
        String str = this.buttonTitle;
        String str2 = this.pageTitle;
        List<FAQItem> list = this.faqData;
        return "FAQComponent(buttonTitle=" + str + ", pageTitle=" + str2 + ", faqData=" + list + ")";
    }
}
