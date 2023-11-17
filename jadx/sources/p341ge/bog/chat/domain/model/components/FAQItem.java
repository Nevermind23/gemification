package p341ge.bog.chat.domain.model.components;

import androidx.annotation.Keep;
import kotlin.jvm.internal.C41536l;

@Keep
/* renamed from: ge.bog.chat.domain.model.components.FAQItem */
public final class FAQItem {
    private final String answer;
    private final String question;

    public FAQItem(String str, String str2) {
        C41536l.m120489i(str, "question");
        C41536l.m120489i(str2, "answer");
        this.question = str;
        this.answer = str2;
    }

    public static /* synthetic */ FAQItem copy$default(FAQItem fAQItem, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = fAQItem.question;
        }
        if ((i & 2) != 0) {
            str2 = fAQItem.answer;
        }
        return fAQItem.copy(str, str2);
    }

    public final String component1() {
        return this.question;
    }

    public final String component2() {
        return this.answer;
    }

    public final FAQItem copy(String str, String str2) {
        C41536l.m120489i(str, "question");
        C41536l.m120489i(str2, "answer");
        return new FAQItem(str, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FAQItem)) {
            return false;
        }
        FAQItem fAQItem = (FAQItem) obj;
        return C41536l.m120484d(this.question, fAQItem.question) && C41536l.m120484d(this.answer, fAQItem.answer);
    }

    public final String getAnswer() {
        return this.answer;
    }

    public final String getQuestion() {
        return this.question;
    }

    public int hashCode() {
        return (this.question.hashCode() * 31) + this.answer.hashCode();
    }

    public String toString() {
        String str = this.question;
        String str2 = this.answer;
        return "FAQItem(question=" + str + ", answer=" + str2 + ")";
    }
}
