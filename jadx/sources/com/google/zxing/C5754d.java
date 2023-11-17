package com.google.zxing;

import java.util.List;

/* renamed from: com.google.zxing.d */
public enum C5754d {
    OTHER(Object.class),
    PURE_BARCODE(r5),
    POSSIBLE_FORMATS(List.class),
    TRY_HARDER(r5),
    CHARACTER_SET(String.class),
    ALLOWED_LENGTHS(r14),
    ASSUME_CODE_39_CHECK_DIGIT(r5),
    ASSUME_GS1(r5),
    RETURN_CODABAR_START_END(r5),
    NEED_RESULT_POINT_CALLBACK(C5767p.class),
    ALLOWED_EAN_EXTENSIONS(r14);
    

    /* renamed from: d */
    private final Class f18170d;

    private C5754d(Class cls) {
        this.f18170d = cls;
    }

    /* renamed from: a */
    public Class mo18877a() {
        return this.f18170d;
    }
}
