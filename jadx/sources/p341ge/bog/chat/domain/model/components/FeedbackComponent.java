package p341ge.bog.chat.domain.model.components;

import androidx.annotation.Keep;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Keep
/* renamed from: ge.bog.chat.domain.model.components.FeedbackComponent */
public final class FeedbackComponent extends Component {
    private final String message;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FeedbackComponent(String str) {
        super((DefaultConstructorMarker) null);
        C41536l.m120489i(str, "message");
        this.message = str;
    }

    public static /* synthetic */ FeedbackComponent copy$default(FeedbackComponent feedbackComponent, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = feedbackComponent.message;
        }
        return feedbackComponent.copy(str);
    }

    public final String component1() {
        return this.message;
    }

    public final FeedbackComponent copy(String str) {
        C41536l.m120489i(str, "message");
        return new FeedbackComponent(str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof FeedbackComponent) && C41536l.m120484d(this.message, ((FeedbackComponent) obj).message);
    }

    public final String getMessage() {
        return this.message;
    }

    public int hashCode() {
        return this.message.hashCode();
    }

    public String toString() {
        String str = this.message;
        return "FeedbackComponent(message=" + str + ")";
    }
}
