package com.medallia.digital.mobilesdk;

/* renamed from: com.medallia.digital.mobilesdk.a5 */
enum C10721a5 {
    upload,
    video,
    audio;

    /* renamed from: a */
    protected static C10721a5 m39049a(String str) {
        C10721a5 a5Var = upload;
        if (a5Var.name().equals(str)) {
            return a5Var;
        }
        C10721a5 a5Var2 = video;
        return a5Var2.name().equals(str) ? a5Var2 : audio;
    }

    /* renamed from: b */
    protected static String m39050b(String str) {
        if (upload.name().equals(str) || video.name().equals(str)) {
            return "video/mp4";
        }
        if (audio.name().equals(str)) {
            return "audio/wav";
        }
        return null;
    }

    /* renamed from: c */
    protected static String m39051c(String str) {
        if (upload.name().equals(str) || video.name().equals(str)) {
            return ".mp4";
        }
        if (audio.name().equals(str)) {
            return ".wav";
        }
        return null;
    }

    /* renamed from: d */
    protected static String m39052d(String str) {
        if (str == null || !str.contains(C11110u2.f31950c)) {
            return str;
        }
        String[] split = str.split(C11110u2.f31950c);
        return split.length > 0 ? split[0] : str;
    }
}
