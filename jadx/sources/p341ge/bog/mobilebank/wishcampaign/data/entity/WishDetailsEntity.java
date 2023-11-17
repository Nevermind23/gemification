package p341ge.bog.mobilebank.wishcampaign.data.entity;

import androidx.annotation.Keep;
import java.util.List;
import kotlin.jvm.internal.C41536l;
import p190o1.C7397t;
import p341ge.bog.mobilebank.shared.data.ExternalFileEntity;

@Keep
/* renamed from: ge.bog.mobilebank.wishcampaign.data.entity.WishDetailsEntity */
public final class WishDetailsEntity {
    private final ExternalFileEntity cardExternalFile;
    private final List<ExternalFileEntity> coverExternalFiles;
    private final long designId;
    private final ExternalFileEntity headerExternalFile;
    private final String wish;

    public WishDetailsEntity(long j, String str, ExternalFileEntity externalFileEntity, ExternalFileEntity externalFileEntity2, List<ExternalFileEntity> list) {
        this.designId = j;
        this.wish = str;
        this.headerExternalFile = externalFileEntity;
        this.cardExternalFile = externalFileEntity2;
        this.coverExternalFiles = list;
    }

    public static /* synthetic */ WishDetailsEntity copy$default(WishDetailsEntity wishDetailsEntity, long j, String str, ExternalFileEntity externalFileEntity, ExternalFileEntity externalFileEntity2, List<ExternalFileEntity> list, int i, Object obj) {
        if ((i & 1) != 0) {
            j = wishDetailsEntity.designId;
        }
        long j2 = j;
        if ((i & 2) != 0) {
            str = wishDetailsEntity.wish;
        }
        String str2 = str;
        if ((i & 4) != 0) {
            externalFileEntity = wishDetailsEntity.headerExternalFile;
        }
        ExternalFileEntity externalFileEntity3 = externalFileEntity;
        if ((i & 8) != 0) {
            externalFileEntity2 = wishDetailsEntity.cardExternalFile;
        }
        ExternalFileEntity externalFileEntity4 = externalFileEntity2;
        if ((i & 16) != 0) {
            list = wishDetailsEntity.coverExternalFiles;
        }
        return wishDetailsEntity.copy(j2, str2, externalFileEntity3, externalFileEntity4, list);
    }

    public final long component1() {
        return this.designId;
    }

    public final String component2() {
        return this.wish;
    }

    public final ExternalFileEntity component3() {
        return this.headerExternalFile;
    }

    public final ExternalFileEntity component4() {
        return this.cardExternalFile;
    }

    public final List<ExternalFileEntity> component5() {
        return this.coverExternalFiles;
    }

    public final WishDetailsEntity copy(long j, String str, ExternalFileEntity externalFileEntity, ExternalFileEntity externalFileEntity2, List<ExternalFileEntity> list) {
        return new WishDetailsEntity(j, str, externalFileEntity, externalFileEntity2, list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WishDetailsEntity)) {
            return false;
        }
        WishDetailsEntity wishDetailsEntity = (WishDetailsEntity) obj;
        return this.designId == wishDetailsEntity.designId && C41536l.m120484d(this.wish, wishDetailsEntity.wish) && C41536l.m120484d(this.headerExternalFile, wishDetailsEntity.headerExternalFile) && C41536l.m120484d(this.cardExternalFile, wishDetailsEntity.cardExternalFile) && C41536l.m120484d(this.coverExternalFiles, wishDetailsEntity.coverExternalFiles);
    }

    public final ExternalFileEntity getCardExternalFile() {
        return this.cardExternalFile;
    }

    public final List<ExternalFileEntity> getCoverExternalFiles() {
        return this.coverExternalFiles;
    }

    public final long getDesignId() {
        return this.designId;
    }

    public final ExternalFileEntity getHeaderExternalFile() {
        return this.headerExternalFile;
    }

    public final String getWish() {
        return this.wish;
    }

    public int hashCode() {
        int a = C7397t.m28148a(this.designId) * 31;
        String str = this.wish;
        int i = 0;
        int hashCode = (a + (str == null ? 0 : str.hashCode())) * 31;
        ExternalFileEntity externalFileEntity = this.headerExternalFile;
        int hashCode2 = (hashCode + (externalFileEntity == null ? 0 : externalFileEntity.hashCode())) * 31;
        ExternalFileEntity externalFileEntity2 = this.cardExternalFile;
        int hashCode3 = (hashCode2 + (externalFileEntity2 == null ? 0 : externalFileEntity2.hashCode())) * 31;
        List<ExternalFileEntity> list = this.coverExternalFiles;
        if (list != null) {
            i = list.hashCode();
        }
        return hashCode3 + i;
    }

    public String toString() {
        long j = this.designId;
        String str = this.wish;
        ExternalFileEntity externalFileEntity = this.headerExternalFile;
        ExternalFileEntity externalFileEntity2 = this.cardExternalFile;
        List<ExternalFileEntity> list = this.coverExternalFiles;
        return "WishDetailsEntity(designId=" + j + ", wish=" + str + ", headerExternalFile=" + externalFileEntity + ", cardExternalFile=" + externalFileEntity2 + ", coverExternalFiles=" + list + ")";
    }
}
