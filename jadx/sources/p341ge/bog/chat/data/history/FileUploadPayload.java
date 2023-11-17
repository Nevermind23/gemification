package p341ge.bog.chat.data.history;

import androidx.annotation.Keep;
import java.util.Map;
import kotlin.jvm.internal.C41536l;

@Keep
/* renamed from: ge.bog.chat.data.history.FileUploadPayload */
public final class FileUploadPayload {
    private final String fileDownloadToken;
    private final String fileReference;
    private final Map<String, String> userData;

    public FileUploadPayload(String str, Map<String, String> map, String str2) {
        C41536l.m120489i(str, "fileReference");
        this.fileReference = str;
        this.userData = map;
        this.fileDownloadToken = str2;
    }

    public static /* synthetic */ FileUploadPayload copy$default(FileUploadPayload fileUploadPayload, String str, Map<String, String> map, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = fileUploadPayload.fileReference;
        }
        if ((i & 2) != 0) {
            map = fileUploadPayload.userData;
        }
        if ((i & 4) != 0) {
            str2 = fileUploadPayload.fileDownloadToken;
        }
        return fileUploadPayload.copy(str, map, str2);
    }

    public final String component1() {
        return this.fileReference;
    }

    public final Map<String, String> component2() {
        return this.userData;
    }

    public final String component3() {
        return this.fileDownloadToken;
    }

    public final FileUploadPayload copy(String str, Map<String, String> map, String str2) {
        C41536l.m120489i(str, "fileReference");
        return new FileUploadPayload(str, map, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FileUploadPayload)) {
            return false;
        }
        FileUploadPayload fileUploadPayload = (FileUploadPayload) obj;
        return C41536l.m120484d(this.fileReference, fileUploadPayload.fileReference) && C41536l.m120484d(this.userData, fileUploadPayload.userData) && C41536l.m120484d(this.fileDownloadToken, fileUploadPayload.fileDownloadToken);
    }

    public final String getFileDownloadToken() {
        return this.fileDownloadToken;
    }

    public final String getFileId() {
        Map<String, String> map = this.userData;
        if (map != null) {
            return map.get("file-id");
        }
        return null;
    }

    public final String getFileReference() {
        return this.fileReference;
    }

    public final Map<String, String> getUserData() {
        return this.userData;
    }

    public int hashCode() {
        int hashCode = this.fileReference.hashCode() * 31;
        Map<String, String> map = this.userData;
        int i = 0;
        int hashCode2 = (hashCode + (map == null ? 0 : map.hashCode())) * 31;
        String str = this.fileDownloadToken;
        if (str != null) {
            i = str.hashCode();
        }
        return hashCode2 + i;
    }

    public String toString() {
        String str = this.fileReference;
        Map<String, String> map = this.userData;
        String str2 = this.fileDownloadToken;
        return "FileUploadPayload(fileReference=" + str + ", userData=" + map + ", fileDownloadToken=" + str2 + ")";
    }
}
