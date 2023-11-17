package p341ge.bog.mobilebank.shared.data.deeplink;

import androidx.annotation.Keep;
import java.util.List;
import kotlin.jvm.internal.C41536l;

@Keep
/* renamed from: ge.bog.mobilebank.shared.data.deeplink.UrlDataEntity */
public final class UrlDataEntity {
    private final List<UrlParamEntity> parameters;
    private final String type;

    public UrlDataEntity(String str, List<UrlParamEntity> list) {
        this.type = str;
        this.parameters = list;
    }

    public static /* synthetic */ UrlDataEntity copy$default(UrlDataEntity urlDataEntity, String str, List<UrlParamEntity> list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = urlDataEntity.type;
        }
        if ((i & 2) != 0) {
            list = urlDataEntity.parameters;
        }
        return urlDataEntity.copy(str, list);
    }

    public final String component1() {
        return this.type;
    }

    public final List<UrlParamEntity> component2() {
        return this.parameters;
    }

    public final UrlDataEntity copy(String str, List<UrlParamEntity> list) {
        return new UrlDataEntity(str, list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UrlDataEntity)) {
            return false;
        }
        UrlDataEntity urlDataEntity = (UrlDataEntity) obj;
        return C41536l.m120484d(this.type, urlDataEntity.type) && C41536l.m120484d(this.parameters, urlDataEntity.parameters);
    }

    public final List<UrlParamEntity> getParameters() {
        return this.parameters;
    }

    public final String getType() {
        return this.type;
    }

    public int hashCode() {
        String str = this.type;
        int i = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        List<UrlParamEntity> list = this.parameters;
        if (list != null) {
            i = list.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        String str = this.type;
        List<UrlParamEntity> list = this.parameters;
        return "UrlDataEntity(type=" + str + ", parameters=" + list + ")";
    }
}
