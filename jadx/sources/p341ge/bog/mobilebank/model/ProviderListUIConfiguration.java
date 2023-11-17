package p341ge.bog.mobilebank.model;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

/* renamed from: ge.bog.mobilebank.model.ProviderListUIConfiguration */
public final class ProviderListUIConfiguration implements Serializable, Cloneable {
    private Map<String, String> extraData;
    private List<String> ignoredProviderServiceIds;
    private Map<String, String> redirectProviderServiceIds;

    public ProviderListUIConfiguration() {
    }

    public Map<String, String> getExtraData() {
        return this.extraData;
    }

    public List<String> getIgnoredProviderServiceIds() {
        return this.ignoredProviderServiceIds;
    }

    public Map<String, String> getRedirectProviderServiceIds() {
        return this.redirectProviderServiceIds;
    }

    public void setExtraData(Map<String, String> map) {
        this.extraData = map;
    }

    public void setIgnoredProviderServiceIds(List<String> list) {
        this.ignoredProviderServiceIds = list;
    }

    public void setRedirectProviderServiceIds(Map<String, String> map) {
        this.redirectProviderServiceIds = map;
    }

    public ProviderListUIConfiguration(List<String> list, Map<String, String> map, Map<String, String> map2) {
        this.ignoredProviderServiceIds = list;
        this.redirectProviderServiceIds = map;
        this.extraData = map2;
    }
}
