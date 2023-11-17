package p341ge.bog.mobilebank.templates.data.models;

import androidx.annotation.Keep;
import com.salesforce.marketingcloud.C11398b;
import java.util.List;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Keep
/* renamed from: ge.bog.mobilebank.templates.data.models.TemplateGroupApiModel */
public final class TemplateGroupApiModel {
    private final String channel;
    private final List<TemplateGroupCommentApiModel> comments;
    private final String customerId;
    private final String extCustomerId;
    private final String groupImage;
    private final String groupName;
    private final Long groupOrder;
    private final String groupType;

    /* renamed from: id */
    private final Long f84122id;
    private final String status;
    private final List<TemplateApiModel> templates;

    public TemplateGroupApiModel() {
        this((Long) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (Long) null, (List) null, (List) null, 2047, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ TemplateGroupApiModel copy$default(TemplateGroupApiModel templateGroupApiModel, Long l, String str, String str2, String str3, String str4, String str5, String str6, String str7, Long l2, List list, List list2, int i, Object obj) {
        TemplateGroupApiModel templateGroupApiModel2 = templateGroupApiModel;
        int i2 = i;
        return templateGroupApiModel.copy((i2 & 1) != 0 ? templateGroupApiModel2.f84122id : l, (i2 & 2) != 0 ? templateGroupApiModel2.channel : str, (i2 & 4) != 0 ? templateGroupApiModel2.customerId : str2, (i2 & 8) != 0 ? templateGroupApiModel2.extCustomerId : str3, (i2 & 16) != 0 ? templateGroupApiModel2.groupName : str4, (i2 & 32) != 0 ? templateGroupApiModel2.groupType : str5, (i2 & 64) != 0 ? templateGroupApiModel2.groupImage : str6, (i2 & 128) != 0 ? templateGroupApiModel2.status : str7, (i2 & C11398b.f33139r) != 0 ? templateGroupApiModel2.groupOrder : l2, (i2 & C11398b.f33140s) != 0 ? templateGroupApiModel2.templates : list, (i2 & C11398b.f33141t) != 0 ? templateGroupApiModel2.comments : list2);
    }

    public final Long component1() {
        return this.f84122id;
    }

    public final List<TemplateApiModel> component10() {
        return this.templates;
    }

    public final List<TemplateGroupCommentApiModel> component11() {
        return this.comments;
    }

    public final String component2() {
        return this.channel;
    }

    public final String component3() {
        return this.customerId;
    }

    public final String component4() {
        return this.extCustomerId;
    }

    public final String component5() {
        return this.groupName;
    }

    public final String component6() {
        return this.groupType;
    }

    public final String component7() {
        return this.groupImage;
    }

    public final String component8() {
        return this.status;
    }

    public final Long component9() {
        return this.groupOrder;
    }

    public final TemplateGroupApiModel copy(Long l, String str, String str2, String str3, String str4, String str5, String str6, String str7, Long l2, List<TemplateApiModel> list, List<TemplateGroupCommentApiModel> list2) {
        return new TemplateGroupApiModel(l, str, str2, str3, str4, str5, str6, str7, l2, list, list2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TemplateGroupApiModel)) {
            return false;
        }
        TemplateGroupApiModel templateGroupApiModel = (TemplateGroupApiModel) obj;
        return C41536l.m120484d(this.f84122id, templateGroupApiModel.f84122id) && C41536l.m120484d(this.channel, templateGroupApiModel.channel) && C41536l.m120484d(this.customerId, templateGroupApiModel.customerId) && C41536l.m120484d(this.extCustomerId, templateGroupApiModel.extCustomerId) && C41536l.m120484d(this.groupName, templateGroupApiModel.groupName) && C41536l.m120484d(this.groupType, templateGroupApiModel.groupType) && C41536l.m120484d(this.groupImage, templateGroupApiModel.groupImage) && C41536l.m120484d(this.status, templateGroupApiModel.status) && C41536l.m120484d(this.groupOrder, templateGroupApiModel.groupOrder) && C41536l.m120484d(this.templates, templateGroupApiModel.templates) && C41536l.m120484d(this.comments, templateGroupApiModel.comments);
    }

    public final String getChannel() {
        return this.channel;
    }

    public final List<TemplateGroupCommentApiModel> getComments() {
        return this.comments;
    }

    public final String getCustomerId() {
        return this.customerId;
    }

    public final String getExtCustomerId() {
        return this.extCustomerId;
    }

    public final String getGroupImage() {
        return this.groupImage;
    }

    public final String getGroupName() {
        return this.groupName;
    }

    public final Long getGroupOrder() {
        return this.groupOrder;
    }

    public final String getGroupType() {
        return this.groupType;
    }

    public final Long getId() {
        return this.f84122id;
    }

    public final String getStatus() {
        return this.status;
    }

    public final List<TemplateApiModel> getTemplates() {
        return this.templates;
    }

    public int hashCode() {
        Long l = this.f84122id;
        int i = 0;
        int hashCode = (l == null ? 0 : l.hashCode()) * 31;
        String str = this.channel;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.customerId;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.extCustomerId;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.groupName;
        int hashCode5 = (hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.groupType;
        int hashCode6 = (hashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.groupImage;
        int hashCode7 = (hashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.status;
        int hashCode8 = (hashCode7 + (str7 == null ? 0 : str7.hashCode())) * 31;
        Long l2 = this.groupOrder;
        int hashCode9 = (hashCode8 + (l2 == null ? 0 : l2.hashCode())) * 31;
        List<TemplateApiModel> list = this.templates;
        int hashCode10 = (hashCode9 + (list == null ? 0 : list.hashCode())) * 31;
        List<TemplateGroupCommentApiModel> list2 = this.comments;
        if (list2 != null) {
            i = list2.hashCode();
        }
        return hashCode10 + i;
    }

    public String toString() {
        Long l = this.f84122id;
        String str = this.channel;
        String str2 = this.customerId;
        String str3 = this.extCustomerId;
        String str4 = this.groupName;
        String str5 = this.groupType;
        String str6 = this.groupImage;
        String str7 = this.status;
        Long l2 = this.groupOrder;
        List<TemplateApiModel> list = this.templates;
        List<TemplateGroupCommentApiModel> list2 = this.comments;
        return "TemplateGroupApiModel(id=" + l + ", channel=" + str + ", customerId=" + str2 + ", extCustomerId=" + str3 + ", groupName=" + str4 + ", groupType=" + str5 + ", groupImage=" + str6 + ", status=" + str7 + ", groupOrder=" + l2 + ", templates=" + list + ", comments=" + list2 + ")";
    }

    public TemplateGroupApiModel(Long l, String str, String str2, String str3, String str4, String str5, String str6, String str7, Long l2, List<TemplateApiModel> list, List<TemplateGroupCommentApiModel> list2) {
        this.f84122id = l;
        this.channel = str;
        this.customerId = str2;
        this.extCustomerId = str3;
        this.groupName = str4;
        this.groupType = str5;
        this.groupImage = str6;
        this.status = str7;
        this.groupOrder = l2;
        this.templates = list;
        this.comments = list2;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ TemplateGroupApiModel(java.lang.Long r13, java.lang.String r14, java.lang.String r15, java.lang.String r16, java.lang.String r17, java.lang.String r18, java.lang.String r19, java.lang.String r20, java.lang.Long r21, java.util.List r22, java.util.List r23, int r24, kotlin.jvm.internal.DefaultConstructorMarker r25) {
        /*
            r12 = this;
            r0 = r24
            r1 = r0 & 1
            r2 = 0
            if (r1 == 0) goto L_0x0009
            r1 = r2
            goto L_0x000a
        L_0x0009:
            r1 = r13
        L_0x000a:
            r3 = r0 & 2
            if (r3 == 0) goto L_0x0010
            r3 = r2
            goto L_0x0011
        L_0x0010:
            r3 = r14
        L_0x0011:
            r4 = r0 & 4
            if (r4 == 0) goto L_0x0017
            r4 = r2
            goto L_0x0018
        L_0x0017:
            r4 = r15
        L_0x0018:
            r5 = r0 & 8
            if (r5 == 0) goto L_0x001e
            r5 = r2
            goto L_0x0020
        L_0x001e:
            r5 = r16
        L_0x0020:
            r6 = r0 & 16
            if (r6 == 0) goto L_0x0026
            r6 = r2
            goto L_0x0028
        L_0x0026:
            r6 = r17
        L_0x0028:
            r7 = r0 & 32
            if (r7 == 0) goto L_0x002e
            r7 = r2
            goto L_0x0030
        L_0x002e:
            r7 = r18
        L_0x0030:
            r8 = r0 & 64
            if (r8 == 0) goto L_0x0036
            r8 = r2
            goto L_0x0038
        L_0x0036:
            r8 = r19
        L_0x0038:
            r9 = r0 & 128(0x80, float:1.794E-43)
            if (r9 == 0) goto L_0x003e
            r9 = r2
            goto L_0x0040
        L_0x003e:
            r9 = r20
        L_0x0040:
            r10 = r0 & 256(0x100, float:3.59E-43)
            if (r10 == 0) goto L_0x0046
            r10 = r2
            goto L_0x0048
        L_0x0046:
            r10 = r21
        L_0x0048:
            r11 = r0 & 512(0x200, float:7.175E-43)
            if (r11 == 0) goto L_0x004e
            r11 = r2
            goto L_0x0050
        L_0x004e:
            r11 = r22
        L_0x0050:
            r0 = r0 & 1024(0x400, float:1.435E-42)
            if (r0 == 0) goto L_0x0055
            goto L_0x0057
        L_0x0055:
            r2 = r23
        L_0x0057:
            r13 = r12
            r14 = r1
            r15 = r3
            r16 = r4
            r17 = r5
            r18 = r6
            r19 = r7
            r20 = r8
            r21 = r9
            r22 = r10
            r23 = r11
            r24 = r2
            r13.<init>(r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p341ge.bog.mobilebank.templates.data.models.TemplateGroupApiModel.<init>(java.lang.Long, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Long, java.util.List, java.util.List, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
