package com.google.protobuf;

import java.util.Collections;
import java.util.Map;

/* renamed from: com.google.protobuf.j */
public class C5691j {

    /* renamed from: b */
    private static boolean f17944b = true;

    /* renamed from: c */
    private static volatile C5691j f17945c;

    /* renamed from: d */
    static final C5691j f17946d = new C5691j(true);

    /* renamed from: a */
    private final Map f17947a = Collections.emptyMap();

    C5691j(boolean z) {
    }

    /* renamed from: a */
    public static C5691j m22805a() {
        C5691j jVar = f17945c;
        if (jVar == null) {
            synchronized (C5691j.class) {
                jVar = f17945c;
                if (jVar == null) {
                    if (f17944b) {
                        jVar = C5687i.m22759a();
                    } else {
                        jVar = f17946d;
                    }
                    f17945c = jVar;
                }
            }
        }
        return jVar;
    }
}
