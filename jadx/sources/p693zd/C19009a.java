package p693zd;

import android.graphics.Canvas;

/* renamed from: zd.a */
public interface C19009a {

    /* renamed from: zd.a$a */
    public enum C19010a {
        PREVIEW,
        PICTURE_SNAPSHOT,
        VIDEO_SNAPSHOT
    }

    /* renamed from: a */
    void mo47157a(C19010a aVar, Canvas canvas);

    /* renamed from: b */
    boolean mo47158b(C19010a aVar);

    boolean getHardwareCanvasEnabled();
}
