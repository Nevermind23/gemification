package p341ge.bog.mobilebank.consumerloanapplication.data.documents.entity;

import androidx.annotation.Keep;
import kotlin.jvm.internal.C41536l;

@Keep
/* renamed from: ge.bog.mobilebank.consumerloanapplication.data.documents.entity.FileApiModel */
public final class FileApiModel {
    private final String fileContent;
    private final String fileName;

    public FileApiModel(String str, String str2) {
        C41536l.m120489i(str, "fileName");
        C41536l.m120489i(str2, "fileContent");
        this.fileName = str;
        this.fileContent = str2;
    }

    public static /* synthetic */ FileApiModel copy$default(FileApiModel fileApiModel, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = fileApiModel.fileName;
        }
        if ((i & 2) != 0) {
            str2 = fileApiModel.fileContent;
        }
        return fileApiModel.copy(str, str2);
    }

    public final String component1() {
        return this.fileName;
    }

    public final String component2() {
        return this.fileContent;
    }

    public final FileApiModel copy(String str, String str2) {
        C41536l.m120489i(str, "fileName");
        C41536l.m120489i(str2, "fileContent");
        return new FileApiModel(str, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FileApiModel)) {
            return false;
        }
        FileApiModel fileApiModel = (FileApiModel) obj;
        return C41536l.m120484d(this.fileName, fileApiModel.fileName) && C41536l.m120484d(this.fileContent, fileApiModel.fileContent);
    }

    public final String getFileContent() {
        return this.fileContent;
    }

    public final String getFileName() {
        return this.fileName;
    }

    public int hashCode() {
        return (this.fileName.hashCode() * 31) + this.fileContent.hashCode();
    }

    public String toString() {
        String str = this.fileName;
        String str2 = this.fileContent;
        return "FileApiModel(fileName=" + str + ", fileContent=" + str2 + ")";
    }
}
