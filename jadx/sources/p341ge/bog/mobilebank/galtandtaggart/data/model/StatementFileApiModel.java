package p341ge.bog.mobilebank.galtandtaggart.data.model;

import androidx.annotation.Keep;
import kotlin.jvm.internal.C41536l;

@Keep
/* renamed from: ge.bog.mobilebank.galtandtaggart.data.model.StatementFileApiModel */
public final class StatementFileApiModel {
    private final String displayName;
    private final String url;

    public StatementFileApiModel(String str, String str2) {
        this.displayName = str;
        this.url = str2;
    }

    public static /* synthetic */ StatementFileApiModel copy$default(StatementFileApiModel statementFileApiModel, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = statementFileApiModel.displayName;
        }
        if ((i & 2) != 0) {
            str2 = statementFileApiModel.url;
        }
        return statementFileApiModel.copy(str, str2);
    }

    public final String component1() {
        return this.displayName;
    }

    public final String component2() {
        return this.url;
    }

    public final StatementFileApiModel copy(String str, String str2) {
        return new StatementFileApiModel(str, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StatementFileApiModel)) {
            return false;
        }
        StatementFileApiModel statementFileApiModel = (StatementFileApiModel) obj;
        return C41536l.m120484d(this.displayName, statementFileApiModel.displayName) && C41536l.m120484d(this.url, statementFileApiModel.url);
    }

    public final String getDisplayName() {
        return this.displayName;
    }

    public final String getUrl() {
        return this.url;
    }

    public int hashCode() {
        String str = this.displayName;
        int i = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.url;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        String str = this.displayName;
        String str2 = this.url;
        return "StatementFileApiModel(displayName=" + str + ", url=" + str2 + ")";
    }
}
