package p341ge.bog.mobilebank.giftcards.data.model;

import androidx.annotation.Keep;
import kotlin.jvm.internal.C41536l;
import p341ge.bog.mobilebank.cleanarch.data.common.entity.YesNoApiEntity;

@Keep
/* renamed from: ge.bog.mobilebank.giftcards.data.model.BffExternalFileDetailApiModel */
public final class BffExternalFileDetailApiModel {
    private final String fileId;
    private final String fileUrl;
    private final YesNoApiEntity isDark;
    private final Integer maxPixelX;
    private final Integer maxPixelY;
    private final Integer minPixelX;
    private final Integer minPixelY;
    private final Integer orderNo;

    public BffExternalFileDetailApiModel(String str, String str2, Integer num, Integer num2, Integer num3, Integer num4, YesNoApiEntity yesNoApiEntity, Integer num5) {
        this.fileId = str;
        this.fileUrl = str2;
        this.maxPixelX = num;
        this.maxPixelY = num2;
        this.minPixelX = num3;
        this.minPixelY = num4;
        this.isDark = yesNoApiEntity;
        this.orderNo = num5;
    }

    public static /* synthetic */ BffExternalFileDetailApiModel copy$default(BffExternalFileDetailApiModel bffExternalFileDetailApiModel, String str, String str2, Integer num, Integer num2, Integer num3, Integer num4, YesNoApiEntity yesNoApiEntity, Integer num5, int i, Object obj) {
        BffExternalFileDetailApiModel bffExternalFileDetailApiModel2 = bffExternalFileDetailApiModel;
        int i2 = i;
        return bffExternalFileDetailApiModel.copy((i2 & 1) != 0 ? bffExternalFileDetailApiModel2.fileId : str, (i2 & 2) != 0 ? bffExternalFileDetailApiModel2.fileUrl : str2, (i2 & 4) != 0 ? bffExternalFileDetailApiModel2.maxPixelX : num, (i2 & 8) != 0 ? bffExternalFileDetailApiModel2.maxPixelY : num2, (i2 & 16) != 0 ? bffExternalFileDetailApiModel2.minPixelX : num3, (i2 & 32) != 0 ? bffExternalFileDetailApiModel2.minPixelY : num4, (i2 & 64) != 0 ? bffExternalFileDetailApiModel2.isDark : yesNoApiEntity, (i2 & 128) != 0 ? bffExternalFileDetailApiModel2.orderNo : num5);
    }

    public final String component1() {
        return this.fileId;
    }

    public final String component2() {
        return this.fileUrl;
    }

    public final Integer component3() {
        return this.maxPixelX;
    }

    public final Integer component4() {
        return this.maxPixelY;
    }

    public final Integer component5() {
        return this.minPixelX;
    }

    public final Integer component6() {
        return this.minPixelY;
    }

    public final YesNoApiEntity component7() {
        return this.isDark;
    }

    public final Integer component8() {
        return this.orderNo;
    }

    public final BffExternalFileDetailApiModel copy(String str, String str2, Integer num, Integer num2, Integer num3, Integer num4, YesNoApiEntity yesNoApiEntity, Integer num5) {
        return new BffExternalFileDetailApiModel(str, str2, num, num2, num3, num4, yesNoApiEntity, num5);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BffExternalFileDetailApiModel)) {
            return false;
        }
        BffExternalFileDetailApiModel bffExternalFileDetailApiModel = (BffExternalFileDetailApiModel) obj;
        return C41536l.m120484d(this.fileId, bffExternalFileDetailApiModel.fileId) && C41536l.m120484d(this.fileUrl, bffExternalFileDetailApiModel.fileUrl) && C41536l.m120484d(this.maxPixelX, bffExternalFileDetailApiModel.maxPixelX) && C41536l.m120484d(this.maxPixelY, bffExternalFileDetailApiModel.maxPixelY) && C41536l.m120484d(this.minPixelX, bffExternalFileDetailApiModel.minPixelX) && C41536l.m120484d(this.minPixelY, bffExternalFileDetailApiModel.minPixelY) && this.isDark == bffExternalFileDetailApiModel.isDark && C41536l.m120484d(this.orderNo, bffExternalFileDetailApiModel.orderNo);
    }

    public final String getFileId() {
        return this.fileId;
    }

    public final String getFileUrl() {
        return this.fileUrl;
    }

    public final Integer getMaxPixelX() {
        return this.maxPixelX;
    }

    public final Integer getMaxPixelY() {
        return this.maxPixelY;
    }

    public final Integer getMinPixelX() {
        return this.minPixelX;
    }

    public final Integer getMinPixelY() {
        return this.minPixelY;
    }

    public final Integer getOrderNo() {
        return this.orderNo;
    }

    public int hashCode() {
        String str = this.fileId;
        int i = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.fileUrl;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num = this.maxPixelX;
        int hashCode3 = (hashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.maxPixelY;
        int hashCode4 = (hashCode3 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.minPixelX;
        int hashCode5 = (hashCode4 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.minPixelY;
        int hashCode6 = (hashCode5 + (num4 == null ? 0 : num4.hashCode())) * 31;
        YesNoApiEntity yesNoApiEntity = this.isDark;
        int hashCode7 = (hashCode6 + (yesNoApiEntity == null ? 0 : yesNoApiEntity.hashCode())) * 31;
        Integer num5 = this.orderNo;
        if (num5 != null) {
            i = num5.hashCode();
        }
        return hashCode7 + i;
    }

    public final YesNoApiEntity isDark() {
        return this.isDark;
    }

    public String toString() {
        String str = this.fileId;
        String str2 = this.fileUrl;
        Integer num = this.maxPixelX;
        Integer num2 = this.maxPixelY;
        Integer num3 = this.minPixelX;
        Integer num4 = this.minPixelY;
        YesNoApiEntity yesNoApiEntity = this.isDark;
        Integer num5 = this.orderNo;
        return "BffExternalFileDetailApiModel(fileId=" + str + ", fileUrl=" + str2 + ", maxPixelX=" + num + ", maxPixelY=" + num2 + ", minPixelX=" + num3 + ", minPixelY=" + num4 + ", isDark=" + yesNoApiEntity + ", orderNo=" + num5 + ")";
    }
}
