package p341ge.bog.chat.data.history;

import androidx.annotation.Keep;
import kotlin.jvm.internal.C41536l;

@Keep
/* renamed from: ge.bog.chat.data.history.FileUploadResponse */
public final class FileUploadResponse {
    private final FileUploadPayload payload;

    public FileUploadResponse(FileUploadPayload fileUploadPayload) {
        C41536l.m120489i(fileUploadPayload, "payload");
        this.payload = fileUploadPayload;
    }

    public static /* synthetic */ FileUploadResponse copy$default(FileUploadResponse fileUploadResponse, FileUploadPayload fileUploadPayload, int i, Object obj) {
        if ((i & 1) != 0) {
            fileUploadPayload = fileUploadResponse.payload;
        }
        return fileUploadResponse.copy(fileUploadPayload);
    }

    public final FileUploadPayload component1() {
        return this.payload;
    }

    public final FileUploadResponse copy(FileUploadPayload fileUploadPayload) {
        C41536l.m120489i(fileUploadPayload, "payload");
        return new FileUploadResponse(fileUploadPayload);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof FileUploadResponse) && C41536l.m120484d(this.payload, ((FileUploadResponse) obj).payload);
    }

    public final FileUploadPayload getPayload() {
        return this.payload;
    }

    public int hashCode() {
        return this.payload.hashCode();
    }

    public String toString() {
        FileUploadPayload fileUploadPayload = this.payload;
        return "FileUploadResponse(payload=" + fileUploadPayload + ")";
    }
}
