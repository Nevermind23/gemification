package p341ge.bog.sso_client.tmx_profiling;

import androidx.annotation.Keep;
import kotlin.jvm.internal.C41536l;

@Keep
/* renamed from: ge.bog.sso_client.tmx_profiling.TMXFlag */
public final class TMXFlag {
    private final String key;
    private final Boolean value;

    public TMXFlag(String str, Boolean bool) {
        C41536l.m120489i(str, "key");
        this.key = str;
        this.value = bool;
    }

    public static /* synthetic */ TMXFlag copy$default(TMXFlag tMXFlag, String str, Boolean bool, int i, Object obj) {
        if ((i & 1) != 0) {
            str = tMXFlag.key;
        }
        if ((i & 2) != 0) {
            bool = tMXFlag.value;
        }
        return tMXFlag.copy(str, bool);
    }

    public final String component1() {
        return this.key;
    }

    public final Boolean component2() {
        return this.value;
    }

    public final TMXFlag copy(String str, Boolean bool) {
        C41536l.m120489i(str, "key");
        return new TMXFlag(str, bool);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TMXFlag)) {
            return false;
        }
        TMXFlag tMXFlag = (TMXFlag) obj;
        return C41536l.m120484d(this.key, tMXFlag.key) && C41536l.m120484d(this.value, tMXFlag.value);
    }

    public final String getKey() {
        return this.key;
    }

    public final Boolean getValue() {
        return this.value;
    }

    public int hashCode() {
        int hashCode = this.key.hashCode() * 31;
        Boolean bool = this.value;
        return hashCode + (bool == null ? 0 : bool.hashCode());
    }

    public String toString() {
        return "TMXFlag(key=" + this.key + ", value=" + this.value + ')';
    }
}
