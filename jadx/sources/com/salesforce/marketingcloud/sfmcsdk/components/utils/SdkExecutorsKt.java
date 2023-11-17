package com.salesforce.marketingcloud.sfmcsdk.components.utils;

import java.util.concurrent.ExecutorService;
import kotlin.jvm.internal.C41536l;
import ue1.C43064a;

public final class SdkExecutorsKt {
    public static final void namedRunnable(ExecutorService executorService, String str, C43064a aVar) {
        C41536l.m120489i(executorService, "<this>");
        C41536l.m120489i(str, "name");
        C41536l.m120489i(aVar, "block");
        executorService.execute(new SdkExecutorsKt$namedRunnable$1(aVar, str, new Object[0]));
    }
}
