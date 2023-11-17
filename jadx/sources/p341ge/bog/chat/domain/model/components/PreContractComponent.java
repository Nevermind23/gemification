package p341ge.bog.chat.domain.model.components;

import androidx.annotation.Keep;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p277ua.C8664c;

@Keep
/* renamed from: ge.bog.chat.domain.model.components.PreContractComponent */
public final class PreContractComponent extends Component {
    private final PreContractButton button;
    @C8664c("pre_contract_header")
    private final String preContractHeader;
    @C8664c("pre_contract_html")
    private final String preContractHtml;
    @C8664c("pre_contract_summary")
    private final String preContractSummary;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PreContractComponent(String str, String str2, String str3, PreContractButton preContractButton) {
        super((DefaultConstructorMarker) null);
        C41536l.m120489i(str, "preContractSummary");
        C41536l.m120489i(str2, "preContractHeader");
        C41536l.m120489i(str3, "preContractHtml");
        C41536l.m120489i(preContractButton, "button");
        this.preContractSummary = str;
        this.preContractHeader = str2;
        this.preContractHtml = str3;
        this.button = preContractButton;
    }

    public static /* synthetic */ PreContractComponent copy$default(PreContractComponent preContractComponent, String str, String str2, String str3, PreContractButton preContractButton, int i, Object obj) {
        if ((i & 1) != 0) {
            str = preContractComponent.preContractSummary;
        }
        if ((i & 2) != 0) {
            str2 = preContractComponent.preContractHeader;
        }
        if ((i & 4) != 0) {
            str3 = preContractComponent.preContractHtml;
        }
        if ((i & 8) != 0) {
            preContractButton = preContractComponent.button;
        }
        return preContractComponent.copy(str, str2, str3, preContractButton);
    }

    public final String component1() {
        return this.preContractSummary;
    }

    public final String component2() {
        return this.preContractHeader;
    }

    public final String component3() {
        return this.preContractHtml;
    }

    public final PreContractButton component4() {
        return this.button;
    }

    public final PreContractComponent copy(String str, String str2, String str3, PreContractButton preContractButton) {
        C41536l.m120489i(str, "preContractSummary");
        C41536l.m120489i(str2, "preContractHeader");
        C41536l.m120489i(str3, "preContractHtml");
        C41536l.m120489i(preContractButton, "button");
        return new PreContractComponent(str, str2, str3, preContractButton);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PreContractComponent)) {
            return false;
        }
        PreContractComponent preContractComponent = (PreContractComponent) obj;
        return C41536l.m120484d(this.preContractSummary, preContractComponent.preContractSummary) && C41536l.m120484d(this.preContractHeader, preContractComponent.preContractHeader) && C41536l.m120484d(this.preContractHtml, preContractComponent.preContractHtml) && C41536l.m120484d(this.button, preContractComponent.button);
    }

    public final PreContractButton getButton() {
        return this.button;
    }

    public final String getPreContractHeader() {
        return this.preContractHeader;
    }

    public final String getPreContractHtml() {
        return this.preContractHtml;
    }

    public final String getPreContractSummary() {
        return this.preContractSummary;
    }

    public int hashCode() {
        return (((((this.preContractSummary.hashCode() * 31) + this.preContractHeader.hashCode()) * 31) + this.preContractHtml.hashCode()) * 31) + this.button.hashCode();
    }

    public String toString() {
        String str = this.preContractSummary;
        String str2 = this.preContractHeader;
        String str3 = this.preContractHtml;
        PreContractButton preContractButton = this.button;
        return "PreContractComponent(preContractSummary=" + str + ", preContractHeader=" + str2 + ", preContractHtml=" + str3 + ", button=" + preContractButton + ")";
    }
}
