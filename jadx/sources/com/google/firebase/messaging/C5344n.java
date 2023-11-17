package com.google.firebase.messaging;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import p082fa.C6191b;
import p082fa.C6194c;
import p273u6.C8638b;

/* renamed from: com.google.firebase.messaging.n */
abstract class C5344n {
    /* renamed from: a */
    private static Executor m21139a(String str) {
        return new ThreadPoolExecutor(0, 1, 30, TimeUnit.SECONDS, new LinkedBlockingQueue(), new C8638b(str));
    }

    /* renamed from: b */
    static Executor m21140b() {
        return m21139a("Firebase-Messaging-File-Io");
    }

    /* renamed from: c */
    static ScheduledExecutorService m21141c() {
        return new ScheduledThreadPoolExecutor(1, new C8638b("Firebase-Messaging-Init"));
    }

    /* renamed from: d */
    static ExecutorService m21142d() {
        return C6191b.m24683a().mo19780a(new C8638b("Firebase-Messaging-Intent-Handle"), C6194c.HIGH_SPEED);
    }

    /* renamed from: e */
    static ExecutorService m21143e() {
        return Executors.newSingleThreadExecutor(new C8638b("Firebase-Messaging-Network-Io"));
    }

    /* renamed from: f */
    static ExecutorService m21144f() {
        return Executors.newSingleThreadExecutor(new C8638b("Firebase-Messaging-Task"));
    }

    /* renamed from: g */
    static ScheduledExecutorService m21145g() {
        return new ScheduledThreadPoolExecutor(1, new C8638b("Firebase-Messaging-Topics-Io"));
    }
}
