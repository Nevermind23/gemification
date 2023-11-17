package p341ge.bog.mobilebank.templates.data.models;

import androidx.annotation.Keep;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p341ge.bog.mobilebank.shared.payments.data.model.PaymentConfigDetailsApiModel;

@Keep
/* renamed from: ge.bog.mobilebank.templates.data.models.TemplatesAndConfigApiModel */
public final class TemplatesAndConfigApiModel {
    private final Map<String, PaymentConfigDetailsApiModel> config;
    private final List<TemplateGroupApiModel> groups;
    private final Map<String, PaymentConfigDetailsApiModel> recentProvidersConfig;
    private final List<TemplateApiModel> templates;
    private final TemplateTransportPassApiModel transportPass;

    public TemplatesAndConfigApiModel() {
        this((List) null, (List) null, (Map) null, (Map) null, (TemplateTransportPassApiModel) null, 31, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ TemplatesAndConfigApiModel copy$default(TemplatesAndConfigApiModel templatesAndConfigApiModel, List<TemplateApiModel> list, List<TemplateGroupApiModel> list2, Map<String, PaymentConfigDetailsApiModel> map, Map<String, PaymentConfigDetailsApiModel> map2, TemplateTransportPassApiModel templateTransportPassApiModel, int i, Object obj) {
        if ((i & 1) != 0) {
            list = templatesAndConfigApiModel.templates;
        }
        if ((i & 2) != 0) {
            list2 = templatesAndConfigApiModel.groups;
        }
        List<TemplateGroupApiModel> list3 = list2;
        if ((i & 4) != 0) {
            map = templatesAndConfigApiModel.config;
        }
        Map<String, PaymentConfigDetailsApiModel> map3 = map;
        if ((i & 8) != 0) {
            map2 = templatesAndConfigApiModel.recentProvidersConfig;
        }
        Map<String, PaymentConfigDetailsApiModel> map4 = map2;
        if ((i & 16) != 0) {
            templateTransportPassApiModel = templatesAndConfigApiModel.transportPass;
        }
        return templatesAndConfigApiModel.copy(list, list3, map3, map4, templateTransportPassApiModel);
    }

    public final List<TemplateApiModel> component1() {
        return this.templates;
    }

    public final List<TemplateGroupApiModel> component2() {
        return this.groups;
    }

    public final Map<String, PaymentConfigDetailsApiModel> component3() {
        return this.config;
    }

    public final Map<String, PaymentConfigDetailsApiModel> component4() {
        return this.recentProvidersConfig;
    }

    public final TemplateTransportPassApiModel component5() {
        return this.transportPass;
    }

    public final TemplatesAndConfigApiModel copy(List<TemplateApiModel> list, List<TemplateGroupApiModel> list2, Map<String, PaymentConfigDetailsApiModel> map, Map<String, PaymentConfigDetailsApiModel> map2, TemplateTransportPassApiModel templateTransportPassApiModel) {
        return new TemplatesAndConfigApiModel(list, list2, map, map2, templateTransportPassApiModel);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TemplatesAndConfigApiModel)) {
            return false;
        }
        TemplatesAndConfigApiModel templatesAndConfigApiModel = (TemplatesAndConfigApiModel) obj;
        return C41536l.m120484d(this.templates, templatesAndConfigApiModel.templates) && C41536l.m120484d(this.groups, templatesAndConfigApiModel.groups) && C41536l.m120484d(this.config, templatesAndConfigApiModel.config) && C41536l.m120484d(this.recentProvidersConfig, templatesAndConfigApiModel.recentProvidersConfig) && C41536l.m120484d(this.transportPass, templatesAndConfigApiModel.transportPass);
    }

    public final Map<String, PaymentConfigDetailsApiModel> getConfig() {
        return this.config;
    }

    public final List<TemplateGroupApiModel> getGroups() {
        return this.groups;
    }

    public final Map<String, PaymentConfigDetailsApiModel> getRecentProvidersConfig() {
        return this.recentProvidersConfig;
    }

    public final List<TemplateApiModel> getTemplates() {
        return this.templates;
    }

    public final TemplateTransportPassApiModel getTransportPass() {
        return this.transportPass;
    }

    public int hashCode() {
        List<TemplateApiModel> list = this.templates;
        int i = 0;
        int hashCode = (list == null ? 0 : list.hashCode()) * 31;
        List<TemplateGroupApiModel> list2 = this.groups;
        int hashCode2 = (hashCode + (list2 == null ? 0 : list2.hashCode())) * 31;
        Map<String, PaymentConfigDetailsApiModel> map = this.config;
        int hashCode3 = (hashCode2 + (map == null ? 0 : map.hashCode())) * 31;
        Map<String, PaymentConfigDetailsApiModel> map2 = this.recentProvidersConfig;
        int hashCode4 = (hashCode3 + (map2 == null ? 0 : map2.hashCode())) * 31;
        TemplateTransportPassApiModel templateTransportPassApiModel = this.transportPass;
        if (templateTransportPassApiModel != null) {
            i = templateTransportPassApiModel.hashCode();
        }
        return hashCode4 + i;
    }

    public String toString() {
        List<TemplateApiModel> list = this.templates;
        List<TemplateGroupApiModel> list2 = this.groups;
        Map<String, PaymentConfigDetailsApiModel> map = this.config;
        Map<String, PaymentConfigDetailsApiModel> map2 = this.recentProvidersConfig;
        TemplateTransportPassApiModel templateTransportPassApiModel = this.transportPass;
        return "TemplatesAndConfigApiModel(templates=" + list + ", groups=" + list2 + ", config=" + map + ", recentProvidersConfig=" + map2 + ", transportPass=" + templateTransportPassApiModel + ")";
    }

    public TemplatesAndConfigApiModel(List<TemplateApiModel> list, List<TemplateGroupApiModel> list2, Map<String, PaymentConfigDetailsApiModel> map, Map<String, PaymentConfigDetailsApiModel> map2, TemplateTransportPassApiModel templateTransportPassApiModel) {
        this.templates = list;
        this.groups = list2;
        this.config = map;
        this.recentProvidersConfig = map2;
        this.transportPass = templateTransportPassApiModel;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ TemplatesAndConfigApiModel(java.util.List r5, java.util.List r6, java.util.Map r7, java.util.Map r8, p341ge.bog.mobilebank.templates.data.models.TemplateTransportPassApiModel r9, int r10, kotlin.jvm.internal.DefaultConstructorMarker r11) {
        /*
            r4 = this;
            r11 = r10 & 1
            r0 = 0
            if (r11 == 0) goto L_0x0007
            r11 = r0
            goto L_0x0008
        L_0x0007:
            r11 = r5
        L_0x0008:
            r5 = r10 & 2
            if (r5 == 0) goto L_0x000e
            r1 = r0
            goto L_0x000f
        L_0x000e:
            r1 = r6
        L_0x000f:
            r5 = r10 & 4
            if (r5 == 0) goto L_0x0015
            r2 = r0
            goto L_0x0016
        L_0x0015:
            r2 = r7
        L_0x0016:
            r5 = r10 & 8
            if (r5 == 0) goto L_0x001c
            r3 = r0
            goto L_0x001d
        L_0x001c:
            r3 = r8
        L_0x001d:
            r5 = r10 & 16
            if (r5 == 0) goto L_0x0023
            r10 = r0
            goto L_0x0024
        L_0x0023:
            r10 = r9
        L_0x0024:
            r5 = r4
            r6 = r11
            r7 = r1
            r8 = r2
            r9 = r3
            r5.<init>(r6, r7, r8, r9, r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p341ge.bog.mobilebank.templates.data.models.TemplatesAndConfigApiModel.<init>(java.util.List, java.util.List, java.util.Map, java.util.Map, ge.bog.mobilebank.templates.data.models.TemplateTransportPassApiModel, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
