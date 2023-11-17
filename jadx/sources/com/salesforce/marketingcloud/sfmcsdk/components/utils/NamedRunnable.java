package com.salesforce.marketingcloud.sfmcsdk.components.utils;

import java.util.Arrays;
import java.util.Locale;
import kotlin.jvm.internal.C41524c0;
import kotlin.jvm.internal.C41536l;

public abstract class NamedRunnable implements Runnable {
    private final String name;

    public NamedRunnable(String str, Object... objArr) {
        C41536l.m120489i(str, "format");
        C41536l.m120489i(objArr, "args");
        C41524c0 c0Var = C41524c0.f97701a;
        Locale locale = Locale.US;
        Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
        String format = String.format(locale, str, Arrays.copyOf(copyOf, copyOf.length));
        C41536l.m120488h(format, "java.lang.String.format(locale, format, *args)");
        this.name = C41536l.m120497q("sdk_", format);
    }

    /* access modifiers changed from: protected */
    public abstract void execute();

    public final String getName() {
        return this.name;
    }

    public void run() {
        String name2 = Thread.currentThread().getName();
        Thread.currentThread().setName(this.name);
        try {
            execute();
        } finally {
            Thread.currentThread().setName(name2);
        }
    }
}
